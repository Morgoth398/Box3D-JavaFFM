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
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

/// ```
/// A mesh with non-uniform scale that lives in a compound.
/// ```
public final class CompoundMesh
		implements Struct<CompoundMesh> {

    public static final StructLayout LAYOUT;

    public static final VarHandle MESH_DATA_HANDLE;
    public static final VarHandle MATERIAL_INDICES_HANDLE;

    public static final long MESH_DATA_BYTE_OFFSET;
    public static final long TRANSFORM_BYTE_OFFSET;
    public static final long SCALE_BYTE_OFFSET;
    public static final long MATERIAL_INDICES_BYTE_OFFSET;

    private final MemorySegment segment;

    private final Transform transform;
    private final Vec3 scale;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            UNBOUNDED_ADDRESS.withName("meshData"),
            Transform.LAYOUT.withName("transform"),
            Vec3.LAYOUT.withName("scale"),
            MemoryLayout.sequenceLayout(4, JAVA_INT).withName("materialIndices")
        ).withName("b3CompoundMesh").withByteAlignment(8);
        
        MESH_DATA_HANDLE = LAYOUT.varHandle(PathElement.groupElement("meshData"));
        MATERIAL_INDICES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("materialIndices"), PathElement.sequenceElement());
        
        MESH_DATA_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("meshData"));
        TRANSFORM_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("transform"));
        SCALE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("scale"));
        MATERIAL_INDICES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("materialIndices"));
        //@formatter:on
    }

    public CompoundMesh() {
        this(Arena.ofAuto());
    }
    
    public CompoundMesh(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public CompoundMesh(MemorySegment segment) {
        this.segment = segment;
    
        transform = new Transform(segment.asSlice(TRANSFORM_BYTE_OFFSET, Transform.LAYOUT));
        scale = new Vec3(segment.asSlice(SCALE_BYTE_OFFSET, Vec3.LAYOUT));
    }

    /// @see #meshData()
    public CompoundMesh meshData(MeshData meshData) {
    	MESH_DATA_HANDLE.set(segment, 0L, meshData.memorySegment());
    	return this;
    }
    
    /// ```
    /// Pointer to the unique shared mesh.
    /// ```
    public @Nullable MeshData meshData() {
    	MemorySegment segment = (MemorySegment) MESH_DATA_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new MeshData(segment);
    }
    
    /// @see #materialIndices(int)
    public CompoundMesh materialIndices(int materialIndices, int index0) {
    	MATERIAL_INDICES_HANDLE.set(segment, 0L, index0, materialIndices);
    	return this;
    }
    
    /// ```
    /// This is used to access the surface material from b3GetCompoundMaterials.
    /// Requires an extra level of indirection. The triangle material index
    /// is clamped to B3_MAX_COMPOUND_MESH_MATERIALS.
    /// materialIndex = materialIndices[triangle->materialIndex]
    /// ```
    public int materialIndices(int index0) {
    	return (int) MATERIAL_INDICES_HANDLE.get(segment, 0L, index0);
    }
    
    /// @see #transform()
    public CompoundMesh transform(Consumer<Transform> consumer) {
    	consumer.accept(transform);
    	return this;
    }
    
    /// @see #transform()
    public CompoundMesh transform(Transform other) {
    	transform.set(other);
    	return this;
    }
    
    /// ```
    /// The transform of this mesh instance.
    /// ```
    public Transform transform() {
    	return transform;
    }
    
    /// @see #scale()
    public CompoundMesh scale(Consumer<Vec3> consumer) {
    	consumer.accept(scale);
    	return this;
    }
    
    /// @see #scale()
    public CompoundMesh scale(Vec3 other) {
    	scale.set(other);
    	return this;
    }
    
    /// ```
    /// Non-uniform scale of this mesh instance.
    /// ```
    public Vec3 scale() {
    	return scale;
    }
    
    @Override
    public CompoundMesh set(CompoundMesh other) {
        return set(other.segment);
    }
    
    @Override
    public CompoundMesh set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<CompoundMesh> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<CompoundMesh> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new CompoundMesh(segment),
            count
        );
    }
    
    public static NativeStructArray<CompoundMesh> array(Arena arena, CompoundMesh... structs) {
        NativeStructArray<CompoundMesh> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new CompoundMesh(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<CompoundMesh> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new CompoundMesh(segment)
        );
    }
    
}