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
/// Result from b3World_RayCastClosest.
/// ```
public final class RayResult
		implements Struct<RayResult> {

    public static final StructLayout LAYOUT;

    public static final VarHandle USER_MATERIAL_ID_HANDLE;
    public static final VarHandle FRACTION_HANDLE;
    public static final VarHandle TRIANGLE_INDEX_HANDLE;
    public static final VarHandle CHILD_INDEX_HANDLE;
    public static final VarHandle NODE_VISITS_HANDLE;
    public static final VarHandle LEAF_VISITS_HANDLE;
    public static final VarHandle HIT_HANDLE;

    public static final long SHAPE_ID_BYTE_OFFSET;
    public static final long POINT_BYTE_OFFSET;
    public static final long NORMAL_BYTE_OFFSET;
    public static final long USER_MATERIAL_ID_BYTE_OFFSET;
    public static final long FRACTION_BYTE_OFFSET;
    public static final long TRIANGLE_INDEX_BYTE_OFFSET;
    public static final long CHILD_INDEX_BYTE_OFFSET;
    public static final long NODE_VISITS_BYTE_OFFSET;
    public static final long LEAF_VISITS_BYTE_OFFSET;
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
            JAVA_LONG.withName("userMaterialId"),
            JAVA_FLOAT.withName("fraction"),
            JAVA_INT.withName("triangleIndex"),
            JAVA_INT.withName("childIndex"),
            JAVA_INT.withName("nodeVisits"),
            JAVA_INT.withName("leafVisits"),
            JAVA_BOOLEAN.withName("hit"),
            MemoryLayout.paddingLayout(3)
        ).withName("b3RayResult").withByteAlignment(8);
        
        USER_MATERIAL_ID_HANDLE = LAYOUT.varHandle(PathElement.groupElement("userMaterialId"));
        FRACTION_HANDLE = LAYOUT.varHandle(PathElement.groupElement("fraction"));
        TRIANGLE_INDEX_HANDLE = LAYOUT.varHandle(PathElement.groupElement("triangleIndex"));
        CHILD_INDEX_HANDLE = LAYOUT.varHandle(PathElement.groupElement("childIndex"));
        NODE_VISITS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("nodeVisits"));
        LEAF_VISITS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("leafVisits"));
        HIT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("hit"));
        
        SHAPE_ID_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shapeId"));
        POINT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("point"));
        NORMAL_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("normal"));
        USER_MATERIAL_ID_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("userMaterialId"));
        FRACTION_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("fraction"));
        TRIANGLE_INDEX_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("triangleIndex"));
        CHILD_INDEX_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("childIndex"));
        NODE_VISITS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("nodeVisits"));
        LEAF_VISITS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("leafVisits"));
        HIT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("hit"));
        //@formatter:on
    }

    public RayResult() {
        this(Arena.ofAuto());
    }
    
    public RayResult(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public RayResult(MemorySegment segment) {
        this.segment = segment;
    
        shapeId = new ShapeId(segment.asSlice(SHAPE_ID_BYTE_OFFSET, ShapeId.LAYOUT));
        point = new Vec3(segment.asSlice(POINT_BYTE_OFFSET, Vec3.LAYOUT));
        normal = new Vec3(segment.asSlice(NORMAL_BYTE_OFFSET, Vec3.LAYOUT));
    }

    /// @see #userMaterialId()
    public RayResult userMaterialId(long userMaterialId) {
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
    
    /// @see #fraction()
    public RayResult fraction(float fraction) {
    	FRACTION_HANDLE.set(segment, 0L, fraction);
    	return this;
    }
    
    /// ```
    /// The fraction of the input ray.
    /// ```
    public float fraction() {
    	return (float) FRACTION_HANDLE.get(segment, 0L);
    }
    
    /// @see #triangleIndex()
    public RayResult triangleIndex(int triangleIndex) {
    	TRIANGLE_INDEX_HANDLE.set(segment, 0L, triangleIndex);
    	return this;
    }
    
    /// ```
    /// The triangle index if the shape is a mesh, height-field, or compound with
    /// child mesh.
    /// ```
    public int triangleIndex() {
    	return (int) TRIANGLE_INDEX_HANDLE.get(segment, 0L);
    }
    
    /// @see #childIndex()
    public RayResult childIndex(int childIndex) {
    	CHILD_INDEX_HANDLE.set(segment, 0L, childIndex);
    	return this;
    }
    
    /// ```
    /// The child index if the shape is a compound.
    /// ```
    public int childIndex() {
    	return (int) CHILD_INDEX_HANDLE.get(segment, 0L);
    }
    
    /// @see #nodeVisits()
    public RayResult nodeVisits(int nodeVisits) {
    	NODE_VISITS_HANDLE.set(segment, 0L, nodeVisits);
    	return this;
    }
    
    /// ```
    /// The number of BVH nodes visited. Diagnostic.
    /// ```
    public int nodeVisits() {
    	return (int) NODE_VISITS_HANDLE.get(segment, 0L);
    }
    
    /// @see #leafVisits()
    public RayResult leafVisits(int leafVisits) {
    	LEAF_VISITS_HANDLE.set(segment, 0L, leafVisits);
    	return this;
    }
    
    /// ```
    /// The number of BVH leaves visited. Diagnostic.
    /// ```
    public int leafVisits() {
    	return (int) LEAF_VISITS_HANDLE.get(segment, 0L);
    }
    
    /// @see #hit()
    public RayResult hit(boolean hit) {
    	HIT_HANDLE.set(segment, 0L, hit);
    	return this;
    }
    
    /// ```
    /// Did the ray hit? If false, all other data is invalid.
    /// ```
    public boolean hit() {
    	return (boolean) HIT_HANDLE.get(segment, 0L);
    }
    
    /// @see #shapeId()
    public RayResult shapeId(Consumer<ShapeId> consumer) {
    	consumer.accept(shapeId);
    	return this;
    }
    
    /// @see #shapeId()
    public RayResult shapeId(ShapeId other) {
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
    public RayResult point(Consumer<Vec3> consumer) {
    	consumer.accept(point);
    	return this;
    }
    
    /// @see #point()
    public RayResult point(Vec3 other) {
    	point.set(other);
    	return this;
    }
    
    /// ```
    /// The world point of the hit.
    /// ```
    public Vec3 point() {
    	return point;
    }
    
    /// @see #normal()
    public RayResult normal(Consumer<Vec3> consumer) {
    	consumer.accept(normal);
    	return this;
    }
    
    /// @see #normal()
    public RayResult normal(Vec3 other) {
    	normal.set(other);
    	return this;
    }
    
    /// ```
    /// The world normal of the shape surface at the hit point.
    /// ```
    public Vec3 normal() {
    	return normal;
    }
    
    @Override
    public RayResult set(RayResult other) {
        return set(other.segment);
    }
    
    @Override
    public RayResult set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<RayResult> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<RayResult> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new RayResult(segment),
            count
        );
    }
    
    public static NativeStructArray<RayResult> array(Arena arena, RayResult... structs) {
        NativeStructArray<RayResult> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new RayResult(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<RayResult> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new RayResult(segment)
        );
    }
    
}