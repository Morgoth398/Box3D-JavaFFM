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
import volucris.bindings.box3d.shape.ShapeId;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;

/// ```
/// Body cast result for ray and shape casts.
/// ```
public final class BodyCastResult
		implements Struct<BodyCastResult> {

    public static final StructLayout LAYOUT;

    public static final VarHandle FRACTION_HANDLE;
    public static final VarHandle TRIANGLE_INDEX_HANDLE;
    public static final VarHandle USER_MATERIAL_ID_HANDLE;
    public static final VarHandle ITERATIONS_HANDLE;
    public static final VarHandle HIT_HANDLE;

    public static final long SHAPE_ID_BYTE_OFFSET;
    public static final long POINT_BYTE_OFFSET;
    public static final long NORMAL_BYTE_OFFSET;
    public static final long FRACTION_BYTE_OFFSET;
    public static final long TRIANGLE_INDEX_BYTE_OFFSET;
    public static final long USER_MATERIAL_ID_BYTE_OFFSET;
    public static final long ITERATIONS_BYTE_OFFSET;
    public static final long HIT_BYTE_OFFSET;

    private final MemorySegment segment;

    private final ShapeId shapeId;
    private final Vec3 point;
    private final Vec3 normal;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            ShapeId.LAYOUT.withName("shapeId"),
            Vec3.LAYOUT.withName("point"),
            Vec3.LAYOUT.withName("normal"),
            JAVA_FLOAT.withName("fraction"),
            JAVA_INT.withName("triangleIndex"),
            JAVA_LONG.withName("userMaterialId"),
            JAVA_INT.withName("iterations"),
            JAVA_BOOLEAN.withName("hit"),
            MemoryLayout.paddingLayout(3)
        ).withName("b3BodyCastResult").withByteAlignment(8);
        
        FRACTION_HANDLE = LAYOUT.varHandle(PathElement.groupElement("fraction"));
        TRIANGLE_INDEX_HANDLE = LAYOUT.varHandle(PathElement.groupElement("triangleIndex"));
        USER_MATERIAL_ID_HANDLE = LAYOUT.varHandle(PathElement.groupElement("userMaterialId"));
        ITERATIONS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("iterations"));
        HIT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("hit"));
        
        SHAPE_ID_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shapeId"));
        POINT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("point"));
        NORMAL_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("normal"));
        FRACTION_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("fraction"));
        TRIANGLE_INDEX_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("triangleIndex"));
        USER_MATERIAL_ID_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("userMaterialId"));
        ITERATIONS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("iterations"));
        HIT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("hit"));
        //@formatter:on
    }

    public BodyCastResult() {
        this(Arena.ofAuto());
    }
    
    public BodyCastResult(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public BodyCastResult(MemorySegment segment) {
        this.segment = segment;
    
        shapeId = new ShapeId(segment.asSlice(SHAPE_ID_BYTE_OFFSET, ShapeId.LAYOUT));
        point = new Vec3(segment.asSlice(POINT_BYTE_OFFSET, Vec3.LAYOUT));
        normal = new Vec3(segment.asSlice(NORMAL_BYTE_OFFSET, Vec3.LAYOUT));
    }

    /// @see #fraction()
    public BodyCastResult fraction(float fraction) {
    	FRACTION_HANDLE.set(segment, 0L, fraction);
    	return this;
    }
    
    /// ```
    /// The fraction along the ray hit.
    /// hit point = origin + fraction * translation
    /// ```
    public float fraction() {
    	return (float) FRACTION_HANDLE.get(segment, 0L);
    }
    
    /// @see #triangleIndex()
    public BodyCastResult triangleIndex(int triangleIndex) {
    	TRIANGLE_INDEX_HANDLE.set(segment, 0L, triangleIndex);
    	return this;
    }
    
    /// ```
    /// The triangle index if the shape is a mesh or height-field.
    /// ```
    public int triangleIndex() {
    	return (int) TRIANGLE_INDEX_HANDLE.get(segment, 0L);
    }
    
    /// @see #userMaterialId()
    public BodyCastResult userMaterialId(long userMaterialId) {
    	USER_MATERIAL_ID_HANDLE.set(segment, 0L, userMaterialId);
    	return this;
    }
    
    /// ```
    /// The user material id at the hit point. This can be per triangle
    /// if the shape is a mesh, height-field, or compound with child mesh.
    /// ```
    public long userMaterialId() {
    	return (long) USER_MATERIAL_ID_HANDLE.get(segment, 0L);
    }
    
    /// @see #iterations()
    public BodyCastResult iterations(int iterations) {
    	ITERATIONS_HANDLE.set(segment, 0L, iterations);
    	return this;
    }
    
    /// ```
    /// The number of iterations used. Diagnostic.
    /// ```
    public int iterations() {
    	return (int) ITERATIONS_HANDLE.get(segment, 0L);
    }
    
    /// @see #hit()
    public BodyCastResult hit(boolean hit) {
    	HIT_HANDLE.set(segment, 0L, hit);
    	return this;
    }
    
    /// ```
    /// Did the cast hit? If false, all other fields are invalid.
    /// ```
    public boolean hit() {
    	return (boolean) HIT_HANDLE.get(segment, 0L);
    }
    
    /// @see #shapeId()
    public BodyCastResult shapeId(Consumer<ShapeId> consumer) {
    	consumer.accept(shapeId);
    	return this;
    }
    
    /// @see #shapeId()
    public BodyCastResult shapeId(ShapeId other) {
    	shapeId.set(other);
    	return this;
    }
    
    /// ```
    /// The shape hit.
    /// ```
    public ShapeId shapeId() {
    	return shapeId;
    }
    
    /// @see #point()
    public BodyCastResult point(Consumer<Vec3> consumer) {
    	consumer.accept(point);
    	return this;
    }
    
    /// @see #point()
    public BodyCastResult point(Vec3 other) {
    	point.set(other);
    	return this;
    }
    
    /// ```
    /// The world point on the shape surface.
    /// ```
    public Vec3 point() {
    	return point;
    }
    
    /// @see #normal()
    public BodyCastResult normal(Consumer<Vec3> consumer) {
    	consumer.accept(normal);
    	return this;
    }
    
    /// @see #normal()
    public BodyCastResult normal(Vec3 other) {
    	normal.set(other);
    	return this;
    }
    
    /// ```
    /// The world normal vector on the shape surface.
    /// ```
    public Vec3 normal() {
    	return normal;
    }
    
    @Override
    public BodyCastResult set(BodyCastResult other) {
        return set(other.segment);
    }
    
    @Override
    public BodyCastResult set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<BodyCastResult> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<BodyCastResult> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new BodyCastResult(segment),
            count
        );
    }
    
    public static NativeStructArray<BodyCastResult> array(Arena arena, BodyCastResult... structs) {
        NativeStructArray<BodyCastResult> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new BodyCastResult(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<BodyCastResult> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new BodyCastResult(segment)
        );
    }
    
}