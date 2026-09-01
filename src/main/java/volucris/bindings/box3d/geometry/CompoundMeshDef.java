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
import org.jspecify.annotations.Nullable;
import volucris.bindings.box3d.math.Transform;
import volucris.bindings.box3d.math.Vec3;
import volucris.bindings.box3d.shape.SurfaceMaterial;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

/// ```
/// Definition for a triangle mesh in a compound shape.
/// ```
public final class CompoundMeshDef
		implements Struct<CompoundMeshDef> {

    public static final StructLayout LAYOUT;

    public static final VarHandle MESH_DATA_HANDLE;
    public static final VarHandle MATERIALS_HANDLE;
    public static final VarHandle MATERIAL_COUNT_HANDLE;

    public static final long MESH_DATA_BYTE_OFFSET;
    public static final long TRANSFORM_BYTE_OFFSET;
    public static final long SCALE_BYTE_OFFSET;
    public static final long MATERIALS_BYTE_OFFSET;
    public static final long MATERIAL_COUNT_BYTE_OFFSET;

    private final MemorySegment segment;

    private final Transform transform;
    private final Vec3 scale;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            UNBOUNDED_ADDRESS.withName("meshData"),
            Transform.LAYOUT.withName("transform"),
            Vec3.LAYOUT.withName("scale"),
            UNBOUNDED_ADDRESS.withName("materials"),
            JAVA_INT.withName("materialCount"),
            MemoryLayout.paddingLayout(4)
        ).withName("b3CompoundMeshDef").withByteAlignment(8);
        
        MESH_DATA_HANDLE = LAYOUT.varHandle(PathElement.groupElement("meshData"));
        MATERIALS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("materials"));
        MATERIAL_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("materialCount"));
        
        MESH_DATA_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("meshData"));
        TRANSFORM_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("transform"));
        SCALE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("scale"));
        MATERIALS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("materials"));
        MATERIAL_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("materialCount"));
        //@formatter:on
    }

    public CompoundMeshDef() {
        this(Arena.ofAuto());
    }
    
    public CompoundMeshDef(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public CompoundMeshDef(MemorySegment segment) {
        this.segment = segment;
    
        transform = new Transform(segment.asSlice(TRANSFORM_BYTE_OFFSET, Transform.LAYOUT));
        scale = new Vec3(segment.asSlice(SCALE_BYTE_OFFSET, Vec3.LAYOUT));
    }

    /// @see #meshData()
    public CompoundMeshDef meshData(MeshData meshData) {
    	MESH_DATA_HANDLE.set(segment, 0L, meshData.memorySegment());
    	return this;
    }
    
    /// ```
    /// Shared mesh.
    /// ```
    public @Nullable MeshData meshData() {
    	MemorySegment segment = (MemorySegment) MESH_DATA_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new MeshData(segment);
    }
    
    /// @see #materials()
    public CompoundMeshDef materials(SurfaceMaterial materials) {
    	MATERIALS_HANDLE.set(segment, 0L, materials.memorySegment());
    	return this;
    }
    
    /// ```
    /// Material properties.
    /// This array must line up with the material indices on the triangles.
    /// ```
    public @Nullable SurfaceMaterial materials() {
    	MemorySegment segment = (MemorySegment) MATERIALS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new SurfaceMaterial(segment);
    }
    
    /// @see #materialCount()
    public CompoundMeshDef materialCount(int materialCount) {
    	MATERIAL_COUNT_HANDLE.set(segment, 0L, materialCount);
    	return this;
    }
    
    /// ```
    /// Number of materials.
    /// ```
    public int materialCount() {
    	return (int) MATERIAL_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #transform()
    public CompoundMeshDef transform(Consumer<Transform> consumer) {
    	consumer.accept(transform);
    	return this;
    }
    
    /// @see #transform()
    public CompoundMeshDef transform(Transform other) {
    	transform.set(other);
    	return this;
    }
    
    /// ```
    /// Transform of the shared mesh into compound local space.
    /// ```
    public Transform transform() {
    	return transform;
    }
    
    /// @see #scale()
    public CompoundMeshDef scale(Consumer<Vec3> consumer) {
    	consumer.accept(scale);
    	return this;
    }
    
    /// @see #scale()
    public CompoundMeshDef scale(Vec3 other) {
    	scale.set(other);
    	return this;
    }
    
    /// ```
    /// Local space non-uniform mesh scale. May have negative components.
    /// ```
    public Vec3 scale() {
    	return scale;
    }
    
    @Override
    public CompoundMeshDef set(CompoundMeshDef other) {
        return set(other.segment);
    }
    
    @Override
    public CompoundMeshDef set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<CompoundMeshDef> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<CompoundMeshDef> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new CompoundMeshDef(segment),
            count
        );
    }
    
    public static NativeStructArray<CompoundMeshDef> array(Arena arena, CompoundMeshDef... structs) {
        NativeStructArray<CompoundMeshDef> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new CompoundMeshDef(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<CompoundMeshDef> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new CompoundMeshDef(segment)
        );
    }
    
}