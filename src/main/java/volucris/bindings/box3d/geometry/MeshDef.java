/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.box3d.geometry;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;
import org.jspecify.annotations.Nullable;
import volucris.bindings.box3d.math.Vec3;
import volucris.bindings.core.NativeByteArray;
import volucris.bindings.core.NativeIntArray;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

/// ```
/// This is used to create a re-usable collision mesh
/// ```
public final class MeshDef
		implements Struct<MeshDef> {

    public static final StructLayout LAYOUT;

    public static final VarHandle VERTICES_HANDLE;
    public static final VarHandle INDICES_HANDLE;
    public static final VarHandle MATERIAL_INDICES_HANDLE;
    public static final VarHandle WELD_TOLERANCE_HANDLE;
    public static final VarHandle VERTEX_COUNT_HANDLE;
    public static final VarHandle TRIANGLE_COUNT_HANDLE;
    public static final VarHandle WELD_VERTICES_HANDLE;
    public static final VarHandle USE_MEDIAN_SPLIT_HANDLE;
    public static final VarHandle IDENTIFY_EDGES_HANDLE;

    public static final long VERTICES_BYTE_OFFSET;
    public static final long INDICES_BYTE_OFFSET;
    public static final long MATERIAL_INDICES_BYTE_OFFSET;
    public static final long WELD_TOLERANCE_BYTE_OFFSET;
    public static final long VERTEX_COUNT_BYTE_OFFSET;
    public static final long TRIANGLE_COUNT_BYTE_OFFSET;
    public static final long WELD_VERTICES_BYTE_OFFSET;
    public static final long USE_MEDIAN_SPLIT_BYTE_OFFSET;
    public static final long IDENTIFY_EDGES_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            UNBOUNDED_ADDRESS.withName("vertices"),
            UNBOUNDED_ADDRESS.withName("indices"),
            UNBOUNDED_ADDRESS.withName("materialIndices"),
            JAVA_FLOAT.withName("weldTolerance"),
            JAVA_INT.withName("vertexCount"),
            JAVA_INT.withName("triangleCount"),
            JAVA_BOOLEAN.withName("weldVertices"),
            JAVA_BOOLEAN.withName("useMedianSplit"),
            JAVA_BOOLEAN.withName("identifyEdges"),
            MemoryLayout.paddingLayout(1)
        ).withName("b3MeshDef").withByteAlignment(8);
        
        VERTICES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("vertices"));
        INDICES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("indices"));
        MATERIAL_INDICES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("materialIndices"));
        WELD_TOLERANCE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("weldTolerance"));
        VERTEX_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("vertexCount"));
        TRIANGLE_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("triangleCount"));
        WELD_VERTICES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("weldVertices"));
        USE_MEDIAN_SPLIT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("useMedianSplit"));
        IDENTIFY_EDGES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("identifyEdges"));
        
        VERTICES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("vertices"));
        INDICES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("indices"));
        MATERIAL_INDICES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("materialIndices"));
        WELD_TOLERANCE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("weldTolerance"));
        VERTEX_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("vertexCount"));
        TRIANGLE_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("triangleCount"));
        WELD_VERTICES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("weldVertices"));
        USE_MEDIAN_SPLIT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("useMedianSplit"));
        IDENTIFY_EDGES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("identifyEdges"));
        //@formatter:on
    }

    public MeshDef() {
        this(Arena.ofAuto());
    }
    
    public MeshDef(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public MeshDef(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #vertices()
    public MeshDef vertices(NativeStructArray<Vec3> vertices) {
    	VERTICES_HANDLE.set(segment, 0L, vertices.memorySegment());
    	return this;
    }
    
    /// ```
    /// Triangle vertices
    /// ```
    public @Nullable NativeStructArray<Vec3> vertices() {
    	MemorySegment segment = (MemorySegment) VERTICES_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    
    	return Vec3.array(segment);
    }
    
    /// @see #indices()
    public MeshDef indices(NativeIntArray indices) {
    	INDICES_HANDLE.set(segment, 0L, indices.memorySegment());
    	return this;
    }
    
    /// ```
    /// Triangle vertex indices. 3 for each triangle.
    /// ```
    public @Nullable NativeIntArray indices() {
    	MemorySegment segment = (MemorySegment) INDICES_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativeIntArray(segment);
    }
    
    /// @see #materialIndices()
    public MeshDef materialIndices(NativeByteArray materialIndices) {
    	MATERIAL_INDICES_HANDLE.set(segment, 0L, materialIndices.memorySegment());
    	return this;
    }
    
    /// ```
    /// Triangle material index. 1 per triangle. Indexes into b3ShapeDef::materials.
    /// This allows different run-time material data to be associated with different
    /// instances of this mesh.
    /// ```
    public @Nullable NativeByteArray materialIndices() {
    	MemorySegment segment = (MemorySegment) MATERIAL_INDICES_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativeByteArray(segment);
    }
    
    /// @see #weldTolerance()
    public MeshDef weldTolerance(float weldTolerance) {
    	WELD_TOLERANCE_HANDLE.set(segment, 0L, weldTolerance);
    	return this;
    }
    
    /// ```
    /// Tolerance for vertex welding in length units.
    /// ```
    public float weldTolerance() {
    	return (float) WELD_TOLERANCE_HANDLE.get(segment, 0L);
    }
    
    /// @see #vertexCount()
    public MeshDef vertexCount(int vertexCount) {
    	VERTEX_COUNT_HANDLE.set(segment, 0L, vertexCount);
    	return this;
    }
    
    /// ```
    /// The vertex count. Must be 3 or more.
    /// ```
    public int vertexCount() {
    	return (int) VERTEX_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #triangleCount()
    public MeshDef triangleCount(int triangleCount) {
    	TRIANGLE_COUNT_HANDLE.set(segment, 0L, triangleCount);
    	return this;
    }
    
    /// ```
    /// The triangle count. Must be 1 or more.
    /// ```
    public int triangleCount() {
    	return (int) TRIANGLE_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #weldVertices()
    public MeshDef weldVertices(boolean weldVertices) {
    	WELD_VERTICES_HANDLE.set(segment, 0L, weldVertices);
    	return this;
    }
    
    /// ```
    /// Optionally weld nearby vertices.
    /// ```
    public boolean weldVertices() {
    	return (boolean) WELD_VERTICES_HANDLE.get(segment, 0L);
    }
    
    /// @see #useMedianSplit()
    public MeshDef useMedianSplit(boolean useMedianSplit) {
    	USE_MEDIAN_SPLIT_HANDLE.set(segment, 0L, useMedianSplit);
    	return this;
    }
    
    /// ```
    /// Use the median split instead of SAH to speed up mesh creation. Good
    /// for meshes that are structured like a grid.
    /// ```
    public boolean useMedianSplit() {
    	return (boolean) USE_MEDIAN_SPLIT_HANDLE.get(segment, 0L);
    }
    
    /// @see #identifyEdges()
    public MeshDef identifyEdges(boolean identifyEdges) {
    	IDENTIFY_EDGES_HANDLE.set(segment, 0L, identifyEdges);
    	return this;
    }
    
    /// ```
    /// Compute triangle adjacency information using shared edges
    /// ```
    public boolean identifyEdges() {
    	return (boolean) IDENTIFY_EDGES_HANDLE.get(segment, 0L);
    }
    
    @Override
    public MeshDef set(MeshDef other) {
        return set(other.segment);
    }
    
    @Override
    public MeshDef set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<MeshDef> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<MeshDef> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new MeshDef(segment),
            count
        );
    }
    
    public static NativeStructArray<MeshDef> array(Arena arena, MeshDef... structs) {
        NativeStructArray<MeshDef> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new MeshDef(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<MeshDef> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new MeshDef(segment)
        );
    }
    
}