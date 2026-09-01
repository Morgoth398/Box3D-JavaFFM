/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.box3d.geometry;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;
import java.util.function.Consumer;
import volucris.bindings.box3d.math.Vec3;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;

/// ```
/// A solid capsule can be viewed as two hemispheres connected
/// by a rectangle.
/// ```
public final class Capsule
		implements Struct<Capsule> {

    public static final StructLayout LAYOUT;

    public static final VarHandle RADIUS_HANDLE;

    public static final long CENTER1_BYTE_OFFSET;
    public static final long CENTER2_BYTE_OFFSET;
    public static final long RADIUS_BYTE_OFFSET;

    private final MemorySegment segment;

    private final Vec3 center1;
    private final Vec3 center2;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            Vec3.LAYOUT.withName("center1"),
            Vec3.LAYOUT.withName("center2"),
            JAVA_FLOAT.withName("radius")
        ).withName("b3Capsule").withByteAlignment(4);
        
        RADIUS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("radius"));
        
        CENTER1_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("center1"));
        CENTER2_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("center2"));
        RADIUS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("radius"));
        //@formatter:on
    }

    public Capsule() {
        this(Arena.ofAuto());
    }
    
    public Capsule(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public Capsule(MemorySegment segment) {
        this.segment = segment;
    
        center1 = new Vec3(segment.asSlice(CENTER1_BYTE_OFFSET, Vec3.LAYOUT));
        center2 = new Vec3(segment.asSlice(CENTER2_BYTE_OFFSET, Vec3.LAYOUT));
    }

    /// @see #radius()
    public Capsule radius(float radius) {
    	RADIUS_HANDLE.set(segment, 0L, radius);
    	return this;
    }
    
    /// ```
    /// The radius of the hemispheres
    /// ```
    public float radius() {
    	return (float) RADIUS_HANDLE.get(segment, 0L);
    }
    
    /// @see #center1()
    public Capsule center1(Consumer<Vec3> consumer) {
    	consumer.accept(center1);
    	return this;
    }
    
    /// @see #center1()
    public Capsule center1(Vec3 other) {
    	center1.set(other);
    	return this;
    }
    
    /// ```
    /// Local center of the first hemisphere
    /// ```
    public Vec3 center1() {
    	return center1;
    }
    
    /// @see #center2()
    public Capsule center2(Consumer<Vec3> consumer) {
    	consumer.accept(center2);
    	return this;
    }
    
    /// @see #center2()
    public Capsule center2(Vec3 other) {
    	center2.set(other);
    	return this;
    }
    
    /// ```
    /// Local center of the second hemisphere
    /// ```
    public Vec3 center2() {
    	return center2;
    }
    
    @Override
    public Capsule set(Capsule other) {
        return set(other.segment);
    }
    
    @Override
    public Capsule set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<Capsule> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<Capsule> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new Capsule(segment),
            count
        );
    }
    
    public static NativeStructArray<Capsule> array(Arena arena, Capsule... structs) {
        NativeStructArray<Capsule> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new Capsule(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<Capsule> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new Capsule(segment)
        );
    }
    
}