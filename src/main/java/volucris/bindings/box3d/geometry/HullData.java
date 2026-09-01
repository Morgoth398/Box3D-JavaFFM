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
import volucris.bindings.box3d.math.AABB;
import volucris.bindings.box3d.math.Matrix3;
import volucris.bindings.box3d.math.Vec3;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;

/// ```
/// A convex hull.
/// @note This data structure has data hanging off the end and cannot be directly copied.
/// ```
public final class HullData
		implements Struct<HullData> {

    public static final StructLayout LAYOUT;

    public static final VarHandle VERSION_HANDLE;
    public static final VarHandle BYTE_COUNT_HANDLE;
    public static final VarHandle HASH_HANDLE;
    public static final VarHandle SURFACE_AREA_HANDLE;
    public static final VarHandle VOLUME_HANDLE;
    public static final VarHandle INNER_RADIUS_HANDLE;
    public static final VarHandle VERTEX_COUNT_HANDLE;
    public static final VarHandle VERTEX_OFFSET_HANDLE;
    public static final VarHandle POINT_OFFSET_HANDLE;
    public static final VarHandle EDGE_COUNT_HANDLE;
    public static final VarHandle EDGE_OFFSET_HANDLE;
    public static final VarHandle FACE_COUNT_HANDLE;
    public static final VarHandle FACE_OFFSET_HANDLE;
    public static final VarHandle PLANE_OFFSET_HANDLE;
    public static final VarHandle PADDING_HANDLE;

    public static final long VERSION_BYTE_OFFSET;
    public static final long BYTE_COUNT_BYTE_OFFSET;
    public static final long HASH_BYTE_OFFSET;
    public static final long AABB_BYTE_OFFSET;
    public static final long SURFACE_AREA_BYTE_OFFSET;
    public static final long VOLUME_BYTE_OFFSET;
    public static final long INNER_RADIUS_BYTE_OFFSET;
    public static final long CENTER_BYTE_OFFSET;
    public static final long CENTRAL_INERTIA_BYTE_OFFSET;
    public static final long VERTEX_COUNT_BYTE_OFFSET;
    public static final long VERTEX_OFFSET_BYTE_OFFSET;
    public static final long POINT_OFFSET_BYTE_OFFSET;
    public static final long EDGE_COUNT_BYTE_OFFSET;
    public static final long EDGE_OFFSET_BYTE_OFFSET;
    public static final long FACE_COUNT_BYTE_OFFSET;
    public static final long FACE_OFFSET_BYTE_OFFSET;
    public static final long PLANE_OFFSET_BYTE_OFFSET;
    public static final long PADDING_BYTE_OFFSET;

    private final MemorySegment segment;

    private final AABB aabb;
    private final Vec3 center;
    private final Matrix3 centralInertia;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_LONG.withName("version"),
            JAVA_INT.withName("byteCount"),
            JAVA_INT.withName("hash"),
            AABB.LAYOUT.withName("aabb"),
            JAVA_FLOAT.withName("surfaceArea"),
            JAVA_FLOAT.withName("volume"),
            JAVA_FLOAT.withName("innerRadius"),
            Vec3.LAYOUT.withName("center"),
            Matrix3.LAYOUT.withName("centralInertia"),
            JAVA_INT.withName("vertexCount"),
            JAVA_INT.withName("vertexOffset"),
            JAVA_INT.withName("pointOffset"),
            JAVA_INT.withName("edgeCount"),
            JAVA_INT.withName("edgeOffset"),
            JAVA_INT.withName("faceCount"),
            JAVA_INT.withName("faceOffset"),
            JAVA_INT.withName("planeOffset"),
            JAVA_INT.withName("padding")
        ).withName("b3HullData").withByteAlignment(8);
        
        VERSION_HANDLE = LAYOUT.varHandle(PathElement.groupElement("version"));
        BYTE_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("byteCount"));
        HASH_HANDLE = LAYOUT.varHandle(PathElement.groupElement("hash"));
        SURFACE_AREA_HANDLE = LAYOUT.varHandle(PathElement.groupElement("surfaceArea"));
        VOLUME_HANDLE = LAYOUT.varHandle(PathElement.groupElement("volume"));
        INNER_RADIUS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("innerRadius"));
        VERTEX_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("vertexCount"));
        VERTEX_OFFSET_HANDLE = LAYOUT.varHandle(PathElement.groupElement("vertexOffset"));
        POINT_OFFSET_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pointOffset"));
        EDGE_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("edgeCount"));
        EDGE_OFFSET_HANDLE = LAYOUT.varHandle(PathElement.groupElement("edgeOffset"));
        FACE_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("faceCount"));
        FACE_OFFSET_HANDLE = LAYOUT.varHandle(PathElement.groupElement("faceOffset"));
        PLANE_OFFSET_HANDLE = LAYOUT.varHandle(PathElement.groupElement("planeOffset"));
        PADDING_HANDLE = LAYOUT.varHandle(PathElement.groupElement("padding"));
        
        VERSION_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("version"));
        BYTE_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("byteCount"));
        HASH_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("hash"));
        AABB_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("aabb"));
        SURFACE_AREA_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("surfaceArea"));
        VOLUME_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("volume"));
        INNER_RADIUS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("innerRadius"));
        CENTER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("center"));
        CENTRAL_INERTIA_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("centralInertia"));
        VERTEX_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("vertexCount"));
        VERTEX_OFFSET_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("vertexOffset"));
        POINT_OFFSET_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pointOffset"));
        EDGE_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("edgeCount"));
        EDGE_OFFSET_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("edgeOffset"));
        FACE_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("faceCount"));
        FACE_OFFSET_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("faceOffset"));
        PLANE_OFFSET_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("planeOffset"));
        PADDING_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("padding"));
        //@formatter:on
    }

    public HullData() {
        this(Arena.ofAuto());
    }
    
    public HullData(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public HullData(MemorySegment segment) {
        this.segment = segment;
    
        aabb = new AABB(segment.asSlice(AABB_BYTE_OFFSET, AABB.LAYOUT));
        center = new Vec3(segment.asSlice(CENTER_BYTE_OFFSET, Vec3.LAYOUT));
        centralInertia = new Matrix3(segment.asSlice(CENTRAL_INERTIA_BYTE_OFFSET, Matrix3.LAYOUT));
    }

    /// @see #version()
    public HullData version(long version) {
    	VERSION_HANDLE.set(segment, 0L, version);
    	return this;
    }
    
    /// ```
    /// Version must be first and match B3_HULL_VERSION
    /// ```
    public long version() {
    	return (long) VERSION_HANDLE.get(segment, 0L);
    }
    
    /// @see #byteCount()
    public HullData byteCount(int byteCount) {
    	BYTE_COUNT_HANDLE.set(segment, 0L, byteCount);
    	return this;
    }
    
    /// ```
    /// The total number of bytes for this hull.
    /// ```
    public int byteCount() {
    	return (int) BYTE_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #hash()
    public HullData hash(int hash) {
    	HASH_HANDLE.set(segment, 0L, hash);
    	return this;
    }
    
    /// ```
    /// Hash of this hull (this field is zero when the hash is computed).
    /// ```
    public int hash() {
    	return (int) HASH_HANDLE.get(segment, 0L);
    }
    
    /// @see #surfaceArea()
    public HullData surfaceArea(float surfaceArea) {
    	SURFACE_AREA_HANDLE.set(segment, 0L, surfaceArea);
    	return this;
    }
    
    /// ```
    /// Surface area, typically in squared meters.
    /// ```
    public float surfaceArea() {
    	return (float) SURFACE_AREA_HANDLE.get(segment, 0L);
    }
    
    /// @see #volume()
    public HullData volume(float volume) {
    	VOLUME_HANDLE.set(segment, 0L, volume);
    	return this;
    }
    
    /// ```
    /// Volume, typically in m^3.
    /// ```
    public float volume() {
    	return (float) VOLUME_HANDLE.get(segment, 0L);
    }
    
    /// @see #innerRadius()
    public HullData innerRadius(float innerRadius) {
    	INNER_RADIUS_HANDLE.set(segment, 0L, innerRadius);
    	return this;
    }
    
    /// ```
    /// The radius of the largest sphere at the center.
    /// ```
    public float innerRadius() {
    	return (float) INNER_RADIUS_HANDLE.get(segment, 0L);
    }
    
    /// @see #vertexCount()
    public HullData vertexCount(int vertexCount) {
    	VERTEX_COUNT_HANDLE.set(segment, 0L, vertexCount);
    	return this;
    }
    
    /// ```
    /// The vertex count.
    /// ```
    public int vertexCount() {
    	return (int) VERTEX_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #vertexOffset()
    public HullData vertexOffset(int vertexOffset) {
    	VERTEX_OFFSET_HANDLE.set(segment, 0L, vertexOffset);
    	return this;
    }
    
    /// ```
    /// Offset of the vertex array in bytes from the struct address.
    /// ```
    public int vertexOffset() {
    	return (int) VERTEX_OFFSET_HANDLE.get(segment, 0L);
    }
    
    /// @see #pointOffset()
    public HullData pointOffset(int pointOffset) {
    	POINT_OFFSET_HANDLE.set(segment, 0L, pointOffset);
    	return this;
    }
    
    /// ```
    /// Offset of the point array in bytes from the struct address.
    /// ```
    public int pointOffset() {
    	return (int) POINT_OFFSET_HANDLE.get(segment, 0L);
    }
    
    /// @see #edgeCount()
    public HullData edgeCount(int edgeCount) {
    	EDGE_COUNT_HANDLE.set(segment, 0L, edgeCount);
    	return this;
    }
    
    /// ```
    /// This is the half-edge count (double the edge count)
    /// ```
    public int edgeCount() {
    	return (int) EDGE_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #edgeOffset()
    public HullData edgeOffset(int edgeOffset) {
    	EDGE_OFFSET_HANDLE.set(segment, 0L, edgeOffset);
    	return this;
    }
    
    /// ```
    /// Offset of the edge array in bytes from the struct address.
    /// ```
    public int edgeOffset() {
    	return (int) EDGE_OFFSET_HANDLE.get(segment, 0L);
    }
    
    /// @see #faceCount()
    public HullData faceCount(int faceCount) {
    	FACE_COUNT_HANDLE.set(segment, 0L, faceCount);
    	return this;
    }
    
    /// ```
    /// The face count. Hulls faces are convex polygons.
    /// ```
    public int faceCount() {
    	return (int) FACE_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #faceOffset()
    public HullData faceOffset(int faceOffset) {
    	FACE_OFFSET_HANDLE.set(segment, 0L, faceOffset);
    	return this;
    }
    
    /// ```
    /// Offset of the face array in bytes from the struct address.
    /// ```
    public int faceOffset() {
    	return (int) FACE_OFFSET_HANDLE.get(segment, 0L);
    }
    
    /// @see #planeOffset()
    public HullData planeOffset(int planeOffset) {
    	PLANE_OFFSET_HANDLE.set(segment, 0L, planeOffset);
    	return this;
    }
    
    /// ```
    /// Offset of the face plane array in bytes from the struct address.
    /// ```
    public int planeOffset() {
    	return (int) PLANE_OFFSET_HANDLE.get(segment, 0L);
    }
    
    /// @see #padding()
    public HullData padding(int padding) {
    	PADDING_HANDLE.set(segment, 0L, padding);
    	return this;
    }
    
    /// ```
    /// Explicit padding. Hull identity is a content hash and memcmp over raw bytes,
    /// so there must be no unnamed padding for struct copies to scramble.
    /// ```
    public int padding() {
    	return (int) PADDING_HANDLE.get(segment, 0L);
    }
    
    /// @see #aabb()
    public HullData aabb(Consumer<AABB> consumer) {
    	consumer.accept(aabb);
    	return this;
    }
    
    /// @see #aabb()
    public HullData aabb(AABB other) {
    	aabb.set(other);
    	return this;
    }
    
    /// ```
    /// Axis-aligned box in local space.
    /// ```
    public AABB aabb() {
    	return aabb;
    }
    
    /// @see #center()
    public HullData center(Consumer<Vec3> consumer) {
    	consumer.accept(center);
    	return this;
    }
    
    /// @see #center()
    public HullData center(Vec3 other) {
    	center.set(other);
    	return this;
    }
    
    /// ```
    /// The local centroid
    /// ```
    public Vec3 center() {
    	return center;
    }
    
    /// @see #centralInertia()
    public HullData centralInertia(Consumer<Matrix3> consumer) {
    	consumer.accept(centralInertia);
    	return this;
    }
    
    /// @see #centralInertia()
    public HullData centralInertia(Matrix3 other) {
    	centralInertia.set(other);
    	return this;
    }
    
    /// ```
    /// The inertia tensor about the centroid.
    /// ```
    public Matrix3 centralInertia() {
    	return centralInertia;
    }
    
    @Override
    public HullData set(HullData other) {
        return set(other.segment);
    }
    
    @Override
    public HullData set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<HullData> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<HullData> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new HullData(segment),
            count
        );
    }
    
    public static NativeStructArray<HullData> array(Arena arena, HullData... structs) {
        NativeStructArray<HullData> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new HullData(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<HullData> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new HullData(segment)
        );
    }
    
}