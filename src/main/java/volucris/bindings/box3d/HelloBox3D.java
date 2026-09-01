package volucris.bindings.box3d;

import java.lang.foreign.Arena;

import volucris.bindings.box3d.body.Body;
import volucris.bindings.box3d.body.BodyDef;
import volucris.bindings.box3d.body.BodyId;
import volucris.bindings.box3d.enums.BodyType;
import volucris.bindings.box3d.geometry.BoxHull;
import volucris.bindings.box3d.geometry.ConvexHull;
import volucris.bindings.box3d.math.Quat;
import volucris.bindings.box3d.math.Vec3;
import volucris.bindings.box3d.shape.Shape;
import volucris.bindings.box3d.shape.ShapeDef;
import volucris.bindings.box3d.world.World;
import volucris.bindings.box3d.world.WorldDef;
import volucris.bindings.box3d.world.WorldId;
import volucris.bindings.core.MemoryStack;

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
