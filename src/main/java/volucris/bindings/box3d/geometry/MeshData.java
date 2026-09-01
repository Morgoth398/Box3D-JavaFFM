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
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;

/// ```
/// This is a sorted triangle collision bounding volume hierarchy.
/// @note This struct has data hanging off the end and cannot be directly copied.
/// ```
public final class MeshData
		implements Struct<MeshData> {

    public static final StructLayout LAYOUT;

    public static final VarHandle VERSION_HANDLE;
    public static final VarHandle BYTE_COUNT_HANDLE;
    public static final VarHandle HASH_HANDLE;
    public static final VarHandle SURFACE_AREA_HANDLE;
    public static final VarHandle TREE_HEIGHT_HANDLE;
    public static final VarHandle DEGENERATE_COUNT_HANDLE;
    public static final VarHandle NODE_OFFSET_HANDLE;
    public static final VarHandle NODE_COUNT_HANDLE;
    public static final VarHandle VERTEX_OFFSET_HANDLE;
    public static final VarHandle VERTEX_COUNT_HANDLE;
    public static final VarHandle TRIANGLE_OFFSET_HANDLE;
    public static final VarHandle TRIANGLE_COUNT_HANDLE;
    public static final VarHandle MATERIAL_OFFSET_HANDLE;
    public static final VarHandle MATERIAL_COUNT_HANDLE;
    public static final VarHandle FLAGS_OFFSET_HANDLE;

    public static final long VERSION_BYTE_OFFSET;
    public static final long BYTE_COUNT_BYTE_OFFSET;
    public static final long HASH_BYTE_OFFSET;
    public static final long BOUNDS_BYTE_OFFSET;
    public static final long SURFACE_AREA_BYTE_OFFSET;
    public static final long TREE_HEIGHT_BYTE_OFFSET;
    public static final long DEGENERATE_COUNT_BYTE_OFFSET;
    public static final long NODE_OFFSET_BYTE_OFFSET;
    public static final long NODE_COUNT_BYTE_OFFSET;
    public static final long VERTEX_OFFSET_BYTE_OFFSET;
    public static final long VERTEX_COUNT_BYTE_OFFSET;
    public static final long TRIANGLE_OFFSET_BYTE_OFFSET;
    public static final long TRIANGLE_COUNT_BYTE_OFFSET;
    public static final long MATERIAL_OFFSET_BYTE_OFFSET;
    public static final long MATERIAL_COUNT_BYTE_OFFSET;
    public static final long FLAGS_OFFSET_BYTE_OFFSET;

    private final MemorySegment segment;

    private final AABB bounds;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_LONG.withName("version"),
            JAVA_INT.withName("byteCount"),
            JAVA_INT.withName("hash"),
            AABB.LAYOUT.withName("bounds"),
            JAVA_FLOAT.withName("surfaceArea"),
            JAVA_INT.withName("treeHeight"),
            JAVA_INT.withName("degenerateCount"),
            JAVA_INT.withName("nodeOffset"),
            JAVA_INT.withName("nodeCount"),
            JAVA_INT.withName("vertexOffset"),
            JAVA_INT.withName("vertexCount"),
            JAVA_INT.withName("triangleOffset"),
            JAVA_INT.withName("triangleCount"),
            JAVA_INT.withName("materialOffset"),
            JAVA_INT.withName("materialCount"),
            JAVA_INT.withName("flagsOffset")
        ).withName("b3MeshData").withByteAlignment(8);
        
        VERSION_HANDLE = LAYOUT.varHandle(PathElement.groupElement("version"));
        BYTE_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("byteCount"));
        HASH_HANDLE = LAYOUT.varHandle(PathElement.groupElement("hash"));
        SURFACE_AREA_HANDLE = LAYOUT.varHandle(PathElement.groupElement("surfaceArea"));
        TREE_HEIGHT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("treeHeight"));
        DEGENERATE_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("degenerateCount"));
        NODE_OFFSET_HANDLE = LAYOUT.varHandle(PathElement.groupElement("nodeOffset"));
        NODE_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("nodeCount"));
        VERTEX_OFFSET_HANDLE = LAYOUT.varHandle(PathElement.groupElement("vertexOffset"));
        VERTEX_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("vertexCount"));
        TRIANGLE_OFFSET_HANDLE = LAYOUT.varHandle(PathElement.groupElement("triangleOffset"));
        TRIANGLE_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("triangleCount"));
        MATERIAL_OFFSET_HANDLE = LAYOUT.varHandle(PathElement.groupElement("materialOffset"));
        MATERIAL_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("materialCount"));
        FLAGS_OFFSET_HANDLE = LAYOUT.varHandle(PathElement.groupElement("flagsOffset"));
        
        VERSION_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("version"));
        BYTE_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("byteCount"));
        HASH_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("hash"));
        BOUNDS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("bounds"));
        SURFACE_AREA_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("surfaceArea"));
        TREE_HEIGHT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("treeHeight"));
        DEGENERATE_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("degenerateCount"));
        NODE_OFFSET_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("nodeOffset"));
        NODE_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("nodeCount"));
        VERTEX_OFFSET_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("vertexOffset"));
        VERTEX_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("vertexCount"));
        TRIANGLE_OFFSET_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("triangleOffset"));
        TRIANGLE_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("triangleCount"));
        MATERIAL_OFFSET_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("materialOffset"));
        MATERIAL_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("materialCount"));
        FLAGS_OFFSET_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("flagsOffset"));
        //@formatter:on
    }

    public MeshData() {
        this(Arena.ofAuto());
    }
    
    public MeshData(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public MeshData(MemorySegment segment) {
        this.segment = segment;
    
        bounds = new AABB(segment.asSlice(BOUNDS_BYTE_OFFSET, AABB.LAYOUT));
    }

    /// @see #version()
    public MeshData version(long version) {
    	VERSION_HANDLE.set(segment, 0L, version);
    	return this;
    }
    
    /// ```
    /// Version must be first.
    /// ```
    public long version() {
    	return (long) VERSION_HANDLE.get(segment, 0L);
    }
    
    /// @see #byteCount()
    public MeshData byteCount(int byteCount) {
    	BYTE_COUNT_HANDLE.set(segment, 0L, byteCount);
    	return this;
    }
    
    /// ```
    /// The total number of bytes for this mesh.
    /// ```
    public int byteCount() {
    	return (int) BYTE_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #hash()
    public MeshData hash(int hash) {
    	HASH_HANDLE.set(segment, 0L, hash);
    	return this;
    }
    
    /// ```
    /// Hash of this mesh (this field is zero when the hash is computed)
    /// ```
    public int hash() {
    	return (int) HASH_HANDLE.get(segment, 0L);
    }
    
    /// @see #surfaceArea()
    public MeshData surfaceArea(float surfaceArea) {
    	SURFACE_AREA_HANDLE.set(segment, 0L, surfaceArea);
    	return this;
    }
    
    /// ```
    /// Combined surface area of all triangles. Single-sided.
    /// ```
    public float surfaceArea() {
    	return (float) SURFACE_AREA_HANDLE.get(segment, 0L);
    }
    
    /// @see #treeHeight()
    public MeshData treeHeight(int treeHeight) {
    	TREE_HEIGHT_HANDLE.set(segment, 0L, treeHeight);
    	return this;
    }
    
    /// ```
    /// The height of the bounding volume hierarchy.
    /// ```
    public int treeHeight() {
    	return (int) TREE_HEIGHT_HANDLE.get(segment, 0L);
    }
    
    /// @see #degenerateCount()
    public MeshData degenerateCount(int degenerateCount) {
    	DEGENERATE_COUNT_HANDLE.set(segment, 0L, degenerateCount);
    	return this;
    }
    
    /// ```
    /// The number of degenerate triangles. Diagnostic.
    /// ```
    public int degenerateCount() {
    	return (int) DEGENERATE_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #nodeOffset()
    public MeshData nodeOffset(int nodeOffset) {
    	NODE_OFFSET_HANDLE.set(segment, 0L, nodeOffset);
    	return this;
    }
    
    /// ```
    /// Offset of the node array in bytes from the struct address.
    /// ```
    public int nodeOffset() {
    	return (int) NODE_OFFSET_HANDLE.get(segment, 0L);
    }
    
    /// @see #nodeCount()
    public MeshData nodeCount(int nodeCount) {
    	NODE_COUNT_HANDLE.set(segment, 0L, nodeCount);
    	return this;
    }
    
    /// ```
    /// The number of BVH nodes.
    /// ```
    public int nodeCount() {
    	return (int) NODE_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #vertexOffset()
    public MeshData vertexOffset(int vertexOffset) {
    	VERTEX_OFFSET_HANDLE.set(segment, 0L, vertexOffset);
    	return this;
    }
    
    /// ```
    /// Offset of the vertex array in bytes from the struct address.
    /// ```
    public int vertexOffset() {
    	return (int) VERTEX_OFFSET_HANDLE.get(segment, 0L);
    }
    
    /// @see #vertexCount()
    public MeshData vertexCount(int vertexCount) {
    	VERTEX_COUNT_HANDLE.set(segment, 0L, vertexCount);
    	return this;
    }
    
    /// ```
    /// The number of vertices.
    /// ```
    public int vertexCount() {
    	return (int) VERTEX_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #triangleOffset()
    public MeshData triangleOffset(int triangleOffset) {
    	TRIANGLE_OFFSET_HANDLE.set(segment, 0L, triangleOffset);
    	return this;
    }
    
    /// ```
    /// Offset of the triangle array in bytes from the struct address.
    /// ```
    public int triangleOffset() {
    	return (int) TRIANGLE_OFFSET_HANDLE.get(segment, 0L);
    }
    
    /// @see #triangleCount()
    public MeshData triangleCount(int triangleCount) {
    	TRIANGLE_COUNT_HANDLE.set(segment, 0L, triangleCount);
    	return this;
    }
    
    /// ```
    /// The number of triangles.
    /// ```
    public int triangleCount() {
    	return (int) TRIANGLE_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #materialOffset()
    public MeshData materialOffset(int materialOffset) {
    	MATERIAL_OFFSET_HANDLE.set(segment, 0L, materialOffset);
    	return this;
    }
    
    /// ```
    /// Offset of the material array in bytes from the struct address.
    /// ```
    public int materialOffset() {
    	return (int) MATERIAL_OFFSET_HANDLE.get(segment, 0L);
    }
    
    /// @see #materialCount()
    public MeshData materialCount(int materialCount) {
    	MATERIAL_COUNT_HANDLE.set(segment, 0L, materialCount);
    	return this;
    }
    
    /// ```
    /// The number of materials.
    /// ```
    public int materialCount() {
    	return (int) MATERIAL_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #flagsOffset()
    public MeshData flagsOffset(int flagsOffset) {
    	FLAGS_OFFSET_HANDLE.set(segment, 0L, flagsOffset);
    	return this;
    }
    
    /// ```
    /// Offset of the triangle flag array in bytes from the struct address.
    /// ```
    public int flagsOffset() {
    	return (int) FLAGS_OFFSET_HANDLE.get(segment, 0L);
    }
    
    /// @see #bounds()
    public MeshData bounds(Consumer<AABB> consumer) {
    	consumer.accept(bounds);
    	return this;
    }
    
    /// @see #bounds()
    public MeshData bounds(AABB other) {
    	bounds.set(other);
    	return this;
    }
    
    /// ```
    /// Local axis-aligned box.
    /// ```
    public AABB bounds() {
    	return bounds;
    }
    
    @Override
    public MeshData set(MeshData other) {
        return set(other.segment);
    }
    
    @Override
    public MeshData set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<MeshData> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<MeshData> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new MeshData(segment),
            count
        );
    }
    
    public static NativeStructArray<MeshData> array(Arena arena, MeshData... structs) {
        NativeStructArray<MeshData> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new MeshData(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<MeshData> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new MeshData(segment)
        );
    }
    
}