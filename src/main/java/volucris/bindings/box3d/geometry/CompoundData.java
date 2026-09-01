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
import volucris.bindings.box3d.dynamicTree.DynamicTree;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;

/// ```
/// The runtime data for a compound shape. This is a potentially large yet highly optimized
/// data structure. It can contain thousands of child shapes, yet at runtime it populates
/// into the world as a single shape in the runtime broad-phase.
/// This data structure has data living off the end and must be accessed using offsets.
/// Accessors are provided for user relevant data.
/// ```
public final class CompoundData
		implements Struct<CompoundData> {

    public static final StructLayout LAYOUT;

    public static final VarHandle VERSION_HANDLE;
    public static final VarHandle BYTE_COUNT_HANDLE;
    public static final VarHandle NODE_OFFSET_HANDLE;
    public static final VarHandle MATERIAL_OFFSET_HANDLE;
    public static final VarHandle MATERIAL_COUNT_HANDLE;
    public static final VarHandle CAPSULE_OFFSET_HANDLE;
    public static final VarHandle CAPSULE_COUNT_HANDLE;
    public static final VarHandle HULL_OFFSET_HANDLE;
    public static final VarHandle HULL_COUNT_HANDLE;
    public static final VarHandle SHARED_HULL_COUNT_HANDLE;
    public static final VarHandle MESH_OFFSET_HANDLE;
    public static final VarHandle MESH_COUNT_HANDLE;
    public static final VarHandle SHARED_MESH_COUNT_HANDLE;
    public static final VarHandle SPHERE_OFFSET_HANDLE;
    public static final VarHandle SPHERE_COUNT_HANDLE;

    public static final long VERSION_BYTE_OFFSET;
    public static final long BYTE_COUNT_BYTE_OFFSET;
    public static final long NODE_OFFSET_BYTE_OFFSET;
    public static final long TREE_BYTE_OFFSET;
    public static final long MATERIAL_OFFSET_BYTE_OFFSET;
    public static final long MATERIAL_COUNT_BYTE_OFFSET;
    public static final long CAPSULE_OFFSET_BYTE_OFFSET;
    public static final long CAPSULE_COUNT_BYTE_OFFSET;
    public static final long HULL_OFFSET_BYTE_OFFSET;
    public static final long HULL_COUNT_BYTE_OFFSET;
    public static final long SHARED_HULL_COUNT_BYTE_OFFSET;
    public static final long MESH_OFFSET_BYTE_OFFSET;
    public static final long MESH_COUNT_BYTE_OFFSET;
    public static final long SHARED_MESH_COUNT_BYTE_OFFSET;
    public static final long SPHERE_OFFSET_BYTE_OFFSET;
    public static final long SPHERE_COUNT_BYTE_OFFSET;

    private final MemorySegment segment;

    private final DynamicTree tree;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_LONG.withName("version"),
            JAVA_INT.withName("byteCount"),
            JAVA_INT.withName("nodeOffset"),
            DynamicTree.LAYOUT.withName("tree"),
            JAVA_INT.withName("materialOffset"),
            JAVA_INT.withName("materialCount"),
            JAVA_INT.withName("capsuleOffset"),
            JAVA_INT.withName("capsuleCount"),
            JAVA_INT.withName("hullOffset"),
            JAVA_INT.withName("hullCount"),
            JAVA_INT.withName("sharedHullCount"),
            JAVA_INT.withName("meshOffset"),
            JAVA_INT.withName("meshCount"),
            JAVA_INT.withName("sharedMeshCount"),
            JAVA_INT.withName("sphereOffset"),
            JAVA_INT.withName("sphereCount")
        ).withName("b3CompoundData").withByteAlignment(8);
        
        VERSION_HANDLE = LAYOUT.varHandle(PathElement.groupElement("version"));
        BYTE_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("byteCount"));
        NODE_OFFSET_HANDLE = LAYOUT.varHandle(PathElement.groupElement("nodeOffset"));
        MATERIAL_OFFSET_HANDLE = LAYOUT.varHandle(PathElement.groupElement("materialOffset"));
        MATERIAL_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("materialCount"));
        CAPSULE_OFFSET_HANDLE = LAYOUT.varHandle(PathElement.groupElement("capsuleOffset"));
        CAPSULE_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("capsuleCount"));
        HULL_OFFSET_HANDLE = LAYOUT.varHandle(PathElement.groupElement("hullOffset"));
        HULL_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("hullCount"));
        SHARED_HULL_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sharedHullCount"));
        MESH_OFFSET_HANDLE = LAYOUT.varHandle(PathElement.groupElement("meshOffset"));
        MESH_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("meshCount"));
        SHARED_MESH_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sharedMeshCount"));
        SPHERE_OFFSET_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sphereOffset"));
        SPHERE_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sphereCount"));
        
        VERSION_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("version"));
        BYTE_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("byteCount"));
        NODE_OFFSET_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("nodeOffset"));
        TREE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("tree"));
        MATERIAL_OFFSET_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("materialOffset"));
        MATERIAL_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("materialCount"));
        CAPSULE_OFFSET_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("capsuleOffset"));
        CAPSULE_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("capsuleCount"));
        HULL_OFFSET_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("hullOffset"));
        HULL_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("hullCount"));
        SHARED_HULL_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sharedHullCount"));
        MESH_OFFSET_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("meshOffset"));
        MESH_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("meshCount"));
        SHARED_MESH_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sharedMeshCount"));
        SPHERE_OFFSET_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sphereOffset"));
        SPHERE_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sphereCount"));
        //@formatter:on
    }

    public CompoundData() {
        this(Arena.ofAuto());
    }
    
    public CompoundData(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public CompoundData(MemorySegment segment) {
        this.segment = segment;
    
        tree = new DynamicTree(segment.asSlice(TREE_BYTE_OFFSET, DynamicTree.LAYOUT));
    }

    /// @see #version()
    public CompoundData version(long version) {
    	VERSION_HANDLE.set(segment, 0L, version);
    	return this;
    }
    
    /// ```
    /// The compound version is always first.
    /// ```
    public long version() {
    	return (long) VERSION_HANDLE.get(segment, 0L);
    }
    
    /// @see #byteCount()
    public CompoundData byteCount(int byteCount) {
    	BYTE_COUNT_HANDLE.set(segment, 0L, byteCount);
    	return this;
    }
    
    /// ```
    /// The total number of bytes for this compound.
    /// ```
    public int byteCount() {
    	return (int) BYTE_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #nodeOffset()
    public CompoundData nodeOffset(int nodeOffset) {
    	NODE_OFFSET_HANDLE.set(segment, 0L, nodeOffset);
    	return this;
    }
    
    /// ```
    /// Offset of the tree node array in bytes from the struct address.
    /// ```
    public int nodeOffset() {
    	return (int) NODE_OFFSET_HANDLE.get(segment, 0L);
    }
    
    /// @see #materialOffset()
    public CompoundData materialOffset(int materialOffset) {
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
    public CompoundData materialCount(int materialCount) {
    	MATERIAL_COUNT_HANDLE.set(segment, 0L, materialCount);
    	return this;
    }
    
    /// ```
    /// The number of materials.
    /// ```
    public int materialCount() {
    	return (int) MATERIAL_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #capsuleOffset()
    public CompoundData capsuleOffset(int capsuleOffset) {
    	CAPSULE_OFFSET_HANDLE.set(segment, 0L, capsuleOffset);
    	return this;
    }
    
    /// ```
    /// Offset of the capsule array in bytes from the struct address.
    /// ```
    public int capsuleOffset() {
    	return (int) CAPSULE_OFFSET_HANDLE.get(segment, 0L);
    }
    
    /// @see #capsuleCount()
    public CompoundData capsuleCount(int capsuleCount) {
    	CAPSULE_COUNT_HANDLE.set(segment, 0L, capsuleCount);
    	return this;
    }
    
    /// ```
    /// The number of capsules.
    /// ```
    public int capsuleCount() {
    	return (int) CAPSULE_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #hullOffset()
    public CompoundData hullOffset(int hullOffset) {
    	HULL_OFFSET_HANDLE.set(segment, 0L, hullOffset);
    	return this;
    }
    
    /// ```
    /// Offset of the hull instance array in bytes from the struct address.
    /// ```
    public int hullOffset() {
    	return (int) HULL_OFFSET_HANDLE.get(segment, 0L);
    }
    
    /// @see #hullCount()
    public CompoundData hullCount(int hullCount) {
    	HULL_COUNT_HANDLE.set(segment, 0L, hullCount);
    	return this;
    }
    
    /// ```
    /// The number of hull instances.
    /// ```
    public int hullCount() {
    	return (int) HULL_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #sharedHullCount()
    public CompoundData sharedHullCount(int sharedHullCount) {
    	SHARED_HULL_COUNT_HANDLE.set(segment, 0L, sharedHullCount);
    	return this;
    }
    
    /// ```
    /// The number of unique hulls. Diagnostic.
    /// ```
    public int sharedHullCount() {
    	return (int) SHARED_HULL_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #meshOffset()
    public CompoundData meshOffset(int meshOffset) {
    	MESH_OFFSET_HANDLE.set(segment, 0L, meshOffset);
    	return this;
    }
    
    /// ```
    /// Offset of the mesh instance array in bytes from the struct address.
    /// ```
    public int meshOffset() {
    	return (int) MESH_OFFSET_HANDLE.get(segment, 0L);
    }
    
    /// @see #meshCount()
    public CompoundData meshCount(int meshCount) {
    	MESH_COUNT_HANDLE.set(segment, 0L, meshCount);
    	return this;
    }
    
    /// ```
    /// The number of mesh instances.
    /// ```
    public int meshCount() {
    	return (int) MESH_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #sharedMeshCount()
    public CompoundData sharedMeshCount(int sharedMeshCount) {
    	SHARED_MESH_COUNT_HANDLE.set(segment, 0L, sharedMeshCount);
    	return this;
    }
    
    /// ```
    /// The number of unique meshes. Diagnostic.
    /// ```
    public int sharedMeshCount() {
    	return (int) SHARED_MESH_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #sphereOffset()
    public CompoundData sphereOffset(int sphereOffset) {
    	SPHERE_OFFSET_HANDLE.set(segment, 0L, sphereOffset);
    	return this;
    }
    
    /// ```
    /// Offset of the sphere array in bytes from the struct address.
    /// ```
    public int sphereOffset() {
    	return (int) SPHERE_OFFSET_HANDLE.get(segment, 0L);
    }
    
    /// @see #sphereCount()
    public CompoundData sphereCount(int sphereCount) {
    	SPHERE_COUNT_HANDLE.set(segment, 0L, sphereCount);
    	return this;
    }
    
    /// ```
    /// The number of spheres.
    /// ```
    public int sphereCount() {
    	return (int) SPHERE_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #tree()
    public CompoundData tree(Consumer<DynamicTree> consumer) {
    	consumer.accept(tree);
    	return this;
    }
    
    /// @see #tree()
    public CompoundData tree(DynamicTree other) {
    	tree.set(other);
    	return this;
    }
    
    /// ```
    /// Immutable dynamic tree. The tree node pointer must be fixed up using the node offset
    /// ```
    public DynamicTree tree() {
    	return tree;
    }
    
    @Override
    public CompoundData set(CompoundData other) {
        return set(other.segment);
    }
    
    @Override
    public CompoundData set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<CompoundData> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<CompoundData> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new CompoundData(segment),
            count
        );
    }
    
    public static NativeStructArray<CompoundData> array(Arena arena, CompoundData... structs) {
        NativeStructArray<CompoundData> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new CompoundData(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<CompoundData> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new CompoundData(segment)
        );
    }
    
}