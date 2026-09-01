/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.box3d.characterMover;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;
import java.util.function.Consumer;
import volucris.bindings.box3d.math.Plane;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;

/// ```
/// These are collision planes that can be fed to b3SolvePlanes. Normally
/// this is assembled by the user from plane results in b3PlaneResult.
/// ```
public final class CollisionPlane
		implements Struct<CollisionPlane> {

    public static final StructLayout LAYOUT;

    public static final VarHandle PUSH_LIMIT_HANDLE;
    public static final VarHandle PUSH_HANDLE;
    public static final VarHandle CLIP_VELOCITY_HANDLE;

    public static final long PLANE_BYTE_OFFSET;
    public static final long PUSH_LIMIT_BYTE_OFFSET;
    public static final long PUSH_BYTE_OFFSET;
    public static final long CLIP_VELOCITY_BYTE_OFFSET;

    private final MemorySegment segment;

    private final Plane plane;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            Plane.LAYOUT.withName("plane"),
            JAVA_FLOAT.withName("pushLimit"),
            JAVA_FLOAT.withName("push"),
            JAVA_BOOLEAN.withName("clipVelocity"),
            MemoryLayout.paddingLayout(3)
        ).withName("b3CollisionPlane").withByteAlignment(4);
        
        PUSH_LIMIT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pushLimit"));
        PUSH_HANDLE = LAYOUT.varHandle(PathElement.groupElement("push"));
        CLIP_VELOCITY_HANDLE = LAYOUT.varHandle(PathElement.groupElement("clipVelocity"));
        
        PLANE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("plane"));
        PUSH_LIMIT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pushLimit"));
        PUSH_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("push"));
        CLIP_VELOCITY_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("clipVelocity"));
        //@formatter:on
    }

    public CollisionPlane() {
        this(Arena.ofAuto());
    }
    
    public CollisionPlane(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public CollisionPlane(MemorySegment segment) {
        this.segment = segment;
    
        plane = new Plane(segment.asSlice(PLANE_BYTE_OFFSET, Plane.LAYOUT));
    }

    /// @see #pushLimit()
    public CollisionPlane pushLimit(float pushLimit) {
    	PUSH_LIMIT_HANDLE.set(segment, 0L, pushLimit);
    	return this;
    }
    
    /// ```
    /// Setting this to FLT_MAX makes the plane as rigid as possible. Lower values can
    /// make the plane collision soft. Usually in meters.
    /// ```
    public float pushLimit() {
    	return (float) PUSH_LIMIT_HANDLE.get(segment, 0L);
    }
    
    /// @see #push()
    public CollisionPlane push(float push) {
    	PUSH_HANDLE.set(segment, 0L, push);
    	return this;
    }
    
    /// ```
    /// The push on the mover determined by b3SolvePlanes. Usually in meters.
    /// ```
    public float push() {
    	return (float) PUSH_HANDLE.get(segment, 0L);
    }
    
    /// @see #clipVelocity()
    public CollisionPlane clipVelocity(boolean clipVelocity) {
    	CLIP_VELOCITY_HANDLE.set(segment, 0L, clipVelocity);
    	return this;
    }
    
    /// ```
    /// Indicates if b3ClipVector should clip against this plane. Should be false for soft collision.
    /// ```
    public boolean clipVelocity() {
    	return (boolean) CLIP_VELOCITY_HANDLE.get(segment, 0L);
    }
    
    /// @see #plane()
    public CollisionPlane plane(Consumer<Plane> consumer) {
    	consumer.accept(plane);
    	return this;
    }
    
    /// @see #plane()
    public CollisionPlane plane(Plane other) {
    	plane.set(other);
    	return this;
    }
    
    /// ```
    /// The collision plane between the mover and some shape.
    /// ```
    public Plane plane() {
    	return plane;
    }
    
    @Override
    public CollisionPlane set(CollisionPlane other) {
        return set(other.segment);
    }
    
    @Override
    public CollisionPlane set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<CollisionPlane> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<CollisionPlane> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new CollisionPlane(segment),
            count
        );
    }
    
    public static NativeStructArray<CollisionPlane> array(Arena arena, CollisionPlane... structs) {
        NativeStructArray<CollisionPlane> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new CollisionPlane(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<CollisionPlane> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new CollisionPlane(segment)
        );
    }
    
}