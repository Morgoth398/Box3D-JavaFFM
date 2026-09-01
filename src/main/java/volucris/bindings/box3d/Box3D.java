package volucris.bindings.box3d;

import java.lang.foreign.Arena;

import org.jspecify.annotations.Nullable;

import volucris.bindings.box3d.body.BodyId;
import volucris.bindings.box3d.joint.JointId;
import volucris.bindings.box3d.shape.ShapeId;
import volucris.bindings.box3d.world.WorldId;
import volucris.bindings.core.NativeLibraryLoader;

public final class Box3D {

	private Box3D() {

	}

	public static void loadNativeLibrary() {
		loadNativeLibrary(false);
	}

	public static void loadNativeLibrary(boolean debug) {
		NativeLibraryLoader.loadLibrary("natives/box3d", "box3d", debug);
	}

	// Store a world id into a uint32_t.
	public static int storeWorldId(WorldId id) {
		return (id.index1() << 16) | id.generation();
	}

	// Load a uint32_t into a world id.
	public static @Nullable WorldId loadWorldId(Arena arena, int x) {
		WorldId id = new WorldId(arena);
		id.index1((short) (x >> 16));
		id.generation((short) x);
		return id;
	}

	// Store a body id into a uint64_t.
	public static long storeBodyId(BodyId id) {
		return ((long) id.index1() << 32) | ((long) id.world0() << 16) | id.generation();
	}

	// Load a uint64_t into a body id.
	public static @Nullable BodyId loadBodyId(Arena arena, long x) {
		BodyId id = new BodyId(arena);
		id.index1((int) (x >> 32));
		id.world0((short) (x >> 16));
		id.generation((short) x);
		return id;
	}

	// Store a shape id into a uint64_t.
	public static long storeShapeId(ShapeId id) {
		return ((long) id.index1() << 32) | ((long) id.world0() << 16) | id.generation();
	}

	// Load a uint64_t into a shape id.
	public static @Nullable ShapeId loadShapeId(Arena arena, long x) {
		ShapeId id = new ShapeId(arena);
		id.index1((int) (x >> 32));
		id.world0((short) (x >> 16));
		id.generation((short) x);
		return id;
	}

	// Store a joint id into a uint64_t.
	public static long storeJointId(JointId id) {
		return ((long) id.index1() << 32) | ((long) id.world0() << 16) | id.generation();
	}

	// Load a uint64_t into a joint id.
	public static @Nullable JointId loadJointId(Arena arena, long x) {
		JointId id = new JointId(arena);
		id.index1((int) (x >> 32));
		id.world0((short) (x >> 16));
		id.generation((short) x);
		return id;
	}

}
