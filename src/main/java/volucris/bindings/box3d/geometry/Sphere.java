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
/// A solid sphere
/// ```
public final class Sphere
		implements Struct<Sphere> {

    public static final StructLayout LAYOUT;

    public static final VarHandle RADIUS_HANDLE;

    public static final long CENTER_BYTE_OFFSET;
    public static final long RADIUS_BYTE_OFFSET;

    private final MemorySegment segment;

    private final Vec3 center;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            Vec3.LAYOUT.withName("center"),
            JAVA_FLOAT.withName("radius")
        ).withName("b3Sphere").withByteAlignment(4);
        
        RADIUS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("radius"));
        
        CENTER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("center"));
        RADIUS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("radius"));
        //@formatter:on
    }

    public Sphere() {
        this(Arena.ofAuto());
    }
    
    public Sphere(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public Sphere(MemorySegment segment) {
        this.segment = segment;
    
        center = new Vec3(segment.asSlice(CENTER_BYTE_OFFSET, Vec3.LAYOUT));
    }

    /// @see #radius()
    public Sphere radius(float radius) {
    	RADIUS_HANDLE.set(segment, 0L, radius);
    	return this;
    }
    
    /// ```
    /// The radius
    /// ```
    public float radius() {
    	return (float) RADIUS_HANDLE.get(segment, 0L);
    }
    
    /// @see #center()
    public Sphere center(Consumer<Vec3> consumer) {
    	consumer.accept(center);
    	return this;
    }
    
    /// @see #center()
    public Sphere center(Vec3 other) {
    	center.set(other);
    	return this;
    }
    
    /// ```
    /// The local center
    /// ```
    public Vec3 center() {
    	return center;
    }
    
    @Override
    public Sphere set(Sphere other) {
        return set(other.segment);
    }
    
    @Override
    public Sphere set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<Sphere> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<Sphere> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new Sphere(segment),
            count
        );
    }
    
    public static NativeStructArray<Sphere> array(Arena arena, Sphere... structs) {
        NativeStructArray<Sphere> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new Sphere(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<Sphere> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new Sphere(segment)
        );
    }
    
}