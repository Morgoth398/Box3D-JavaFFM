# Box3D-JavaFFM
This project provides Java bindings for  [Box3D](https://github.com/erincatto/box3d) using the Java FFM API.

# Supported Platforms
Windows, Linux and Mac are directly supported. All native libraries were build using the [Box3d_Build](./.github/workflows/Box3d_Build.yml) Workflow.

# Building The Project
1. Download [Java 26](https://www.oracle.com/de/java/technologies/downloads/)
2. Download the sources or clone the repo

### Using The Terminal

3. Install [Maven](https://maven.apache.org/download.cgi)
4. Open the terminal in the directory of the downloaded project
5. Run the goal `mvn package`.
6. The output is in the `target/` folder

### Using An IDE

3. Import the project in an IDE of your choice as a maven project
	- [IntelliJ](https://www.jetbrains.com/guide/java/tutorials/working-with-maven/importing-a-project/)
	- [Eclipse](https://www.lagomframework.com/documentation/1.6.x/java/EclipseMavenInt.html)
4. Create a new maven run configuration and add the goal `mvn package`
	- [IntelliJ](https://www.jetbrains.com/help/idea/run-debug-configuration-maven.html)
	- [Eclipse](https://www.genuitec.com/docs/assembly/setting-up-maven-launch-configurations/)
5. Run the created configuration
6. The output is also in the `target/` folder

If you are using the Eclipse IDE, you do not need to build the project explicitly. You can import this project into a workspace and just add the Maven coordinates into the `pom.xml` file of any other Maven project in the same workspace. This works as Eclipse can resolve Maven dependencies directly from the workspace, without requiring the project to be installed into the local Maven repository.

# Usage
This project requires Java 26 and preview features enabled.

Before calling any method you need to load the native library. For that you can call `Box3D.loadNativeLibrary()`.

To set the extract directory of the native library, change `NativeLibraryLoaderConfig.SHARED_LIBRARY_EXTRACT_PATH`. 

Due to the introduction of  [restricted methods](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/doc-files/RestrictedMethods.html), it is recommended (and in later versions required) to run the application with the VM argument `--enable-native-access=ALL-UNNAMED`.

# Memory Management
When creating an object, native memory will be allocated.

Structs are always allocated with an arena. By default an automatic arena is used, but you can use any arena you want (even a global arena, but this may not be desirable) by using the appropriate constructor.

When a struct is allocated through a native function call, the first parameter is always a `SegmentAllocator` (a parent type of an arena). This parameter is not part of the original C function signature and is added automatically in Java.

# Example
This is a port of the  [Hello Box3D](https://box2d.org/documentation3d/hello.html) introduction.

```Java
public class HelloBox3D {

	public static void main(String[] args) {
		
		HelloBox3D helloBox3D = new HelloBox3D();
		helloBox3D.run();
		helloBox3D.dispose();
		
	}

	private WorldId worldId;

	private BodyId groundBodyId;
	private BodyId dynamicBodyId;

	public HelloBox3D() {
		Box3D.loadNativeLibrary();

		try (Arena arena = MemoryStack.stackPush()) {
			WorldDef worldDef = WorldDef.defaultWorldDef(arena)
					.gravity(g -> g.x(0).y(-10).z(0));
			worldId = World.createWorld(Arena.ofAuto(), worldDef);

			BodyDef groundBodyDef = BodyDef.defaultBodyDef(arena)
					.position(p -> p.x(0).y(-10).z(0));
			groundBodyId = Body.createBody(Arena.ofAuto(), worldId, groundBodyDef);

			BoxHull groundBox = ConvexHull.makeBoxHull(arena, 50, 10, 50);

			ShapeDef groundShapeDef = ShapeDef.defaultShapeDef(arena);
			Shape.createHullShape(arena, groundBodyId, groundShapeDef, groundBox.base());

			BodyDef bodyDef = BodyDef.defaultBodyDef(arena)
					.type(BodyType.DYNAMIC_BODY)
					.position(p -> p.x(0).y(4).z(0));

			dynamicBodyId = Body.createBody(Arena.ofAuto(), worldId, bodyDef);

			BoxHull dynamicBox = ConvexHull.makeCubeHull(arena, 1);

			ShapeDef shapeDef = ShapeDef.defaultShapeDef(arena)
					.density(1)
					.baseMaterial(material -> material.friction(0.3f));

			Shape.createHullShape(arena, dynamicBodyId, shapeDef, dynamicBox.base());
		}
	}

	public void run() {
		float timeStep = 1.0f / 60.0f;

		int subStepCount = 4;

		for (int i = 0; i < 90; i++) {
			World.step(worldId, timeStep, subStepCount);

			try (Arena arena = MemoryStack.stackPush()) {
				Vec3 position = Body.getPosition(arena, dynamicBodyId);
				Quat rotation = Body.getRotation(arena, dynamicBodyId);

				System.out.printf(
						"%4.2f %4.2f %4.2f %4.2f %4.2f %4.2f %4.2f\n",
						position.x(), position.y(), position.z(),
						rotation.v().x(), rotation.v().y(), rotation.v().z(), rotation.s()
				);
			}
		}
	}

	public void dispose() {
		World.destroyWorld(worldId);
	}

}
```