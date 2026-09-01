/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.box3d.query;

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
/// Low level ray cast or shape-cast output data.
/// ```
public final class CastOutput
		implements Struct<CastOutput> {

    public static final StructLayout LAYOUT;

    public static final VarHandle FRACTION_HANDLE;
    public static final VarHandle ITERATIONS_HANDLE;
    public static final VarHandle TRIANGLE_INDEX_HANDLE;
    public static final VarHandle CHILD_INDEX_HANDLE;
    public static final VarHandle MATERIAL_INDEX_HANDLE;
    public static final VarHandle HIT_HANDLE;

    public static final long NORMAL_BYTE_OFFSET;
    public static final long POINT_BYTE_OFFSET;
    public static final long FRACTION_BYTE_OFFSET;
    public static final long ITERATIONS_BYTE_OFFSET;
    public static final long TRIANGLE_INDEX_BYTE_OFFSET;
    public static final long CHILD_INDEX_BYTE_OFFSET;
    public static final long MATERIAL_INDEX_BYTE_OFFSET;
    public static final long HIT_BYTE_OFFSET;

    private final MemorySegment segment;

    private final Vec3 normal;
    private final Vec3 point;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            Vec3.LAYOUT.withName("normal"),
            Vec3.LAYOUT.withName("point"),
            JAVA_FLOAT.withName("fraction"),
            JAVA_INT.withName("iterations"),
            JAVA_INT.withName("triangleIndex"),
            JAVA_INT.withName("childIndex"),
            JAVA_INT.withName("materialIndex"),
            JAVA_BOOLEAN.withName("hit"),
            MemoryLayout.paddingLayout(3)
        ).withName("b3CastOutput").withByteAlignment(4);
        
        FRACTION_HANDLE = LAYOUT.varHandle(PathElement.groupElement("fraction"));
        ITERATIONS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("iterations"));
        TRIANGLE_INDEX_HANDLE = LAYOUT.varHandle(PathElement.groupElement("triangleIndex"));
        CHILD_INDEX_HANDLE = LAYOUT.varHandle(PathElement.groupElement("childIndex"));
        MATERIAL_INDEX_HANDLE = LAYOUT.varHandle(PathElement.groupElement("materialIndex"));
        HIT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("hit"));
        
        NORMAL_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("normal"));
        POINT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("point"));
        FRACTION_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("fraction"));
        ITERATIONS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("iterations"));
        TRIANGLE_INDEX_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("triangleIndex"));
        CHILD_INDEX_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("childIndex"));
        MATERIAL_INDEX_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("materialIndex"));
        HIT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("hit"));
        //@formatter:on
    }

    public CastOutput() {
        this(Arena.ofAuto());
    }
    
    public CastOutput(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public CastOutput(MemorySegment segment) {
        this.segment = segment;
    
        normal = new Vec3(segment.asSlice(NORMAL_BYTE_OFFSET, Vec3.LAYOUT));
        point = new Vec3(segment.asSlice(POINT_BYTE_OFFSET, Vec3.LAYOUT));
    }

    /// @see #fraction()
    public CastOutput fraction(float fraction) {
    	FRACTION_HANDLE.set(segment, 0L, fraction);
    	return this;
    }
    
    /// ```
    /// The fraction of the input translation at collision.
    /// ```
    public float fraction() {
    	return (float) FRACTION_HANDLE.get(segment, 0L);
    }
    
    /// @see #iterations()
    public CastOutput iterations(int iterations) {
    	ITERATIONS_HANDLE.set(segment, 0L, iterations);
    	return this;
    }
    
    /// ```
    /// The number of iterations used.
    /// ```
    public int iterations() {
    	return (int) ITERATIONS_HANDLE.get(segment, 0L);
    }
    
    /// @see #triangleIndex()
    public CastOutput triangleIndex(int triangleIndex) {
    	TRIANGLE_INDEX_HANDLE.set(segment, 0L, triangleIndex);
    	return this;
    }
    
    /// ```
    /// The index of the mesh or height field triangle hit.
    /// ```
    public int triangleIndex() {
    	return (int) TRIANGLE_INDEX_HANDLE.get(segment, 0L);
    }
    
    /// @see #childIndex()
    public CastOutput childIndex(int childIndex) {
    	CHILD_INDEX_HANDLE.set(segment, 0L, childIndex);
    	return this;
    }
    
    /// ```
    /// The index of the compound child shape.
    /// ```
    public int childIndex() {
    	return (int) CHILD_INDEX_HANDLE.get(segment, 0L);
    }
    
    /// @see #materialIndex()
    public CastOutput materialIndex(int materialIndex) {
    	MATERIAL_INDEX_HANDLE.set(segment, 0L, materialIndex);
    	return this;
    }
    
    /// ```
    /// The material index. May be -1 for null.
    /// ```
    public int materialIndex() {
    	return (int) MATERIAL_INDEX_HANDLE.get(segment, 0L);
    }
    
    /// @see #hit()
    public CastOutput hit(boolean hit) {
    	HIT_HANDLE.set(segment, 0L, hit);
    	return this;
    }
    
    /// ```
    /// Did the cast hit?
    /// ```
    public boolean hit() {
    	return (boolean) HIT_HANDLE.get(segment, 0L);
    }
    
    /// @see #normal()
    public CastOutput normal(Consumer<Vec3> consumer) {
    	consumer.accept(normal);
    	return this;
    }
    
    /// @see #normal()
    public CastOutput normal(Vec3 other) {
    	normal.set(other);
    	return this;
    }
    
    /// ```
    /// The surface normal at the hit point.
    /// ```
    public Vec3 normal() {
    	return normal;
    }
    
    /// @see #point()
    public CastOutput point(Consumer<Vec3> consumer) {
    	consumer.accept(point);
    	return this;
    }
    
    /// @see #point()
    public CastOutput point(Vec3 other) {
    	point.set(other);
    	return this;
    }
    
    /// ```
    /// The surface hit point.
    /// ```
    public Vec3 point() {
    	return point;
    }
    
    @Override
    public CastOutput set(CastOutput other) {
        return set(other.segment);
    }
    
    @Override
    public CastOutput set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<CastOutput> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<CastOutput> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new CastOutput(segment),
            count
        );
    }
    
    public static NativeStructArray<CastOutput> array(Arena arena, CastOutput... structs) {
        NativeStructArray<CastOutput> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new CastOutput(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<CastOutput> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new CastOutput(segment)
        );
    }
    
}