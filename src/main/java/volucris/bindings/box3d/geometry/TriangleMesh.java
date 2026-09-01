/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.box3d.geometry;

import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import org.jspecify.annotations.Nullable;
import volucris.bindings.box3d.math.Vec3;
import volucris.bindings.core.NativeIntArray;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class TriangleMesh {

    private static final LazyConstant<MethodHandle> B3_CREATE_GRID_MESH;
    private static final LazyConstant<MethodHandle> B3_CREATE_WAVE_MESH;
    private static final LazyConstant<MethodHandle> B3_CREATE_TORUS_MESH;
    private static final LazyConstant<MethodHandle> B3_CREATE_BOX_MESH;
    private static final LazyConstant<MethodHandle> B3_CREATE_HOLLOW_BOX_MESH;
    private static final LazyConstant<MethodHandle> B3_CREATE_PLATFORM_MESH;
    private static final LazyConstant<MethodHandle> B3_CREATE_MESH;
    private static final LazyConstant<MethodHandle> B3_DESTROY_MESH;
    private static final LazyConstant<MethodHandle> B3_GET_HEIGHT;

    static {
        //@formatter:off
        B3_CREATE_GRID_MESH = downcallHandle("b3CreateGridMesh", UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT, JAVA_FLOAT, JAVA_INT, JAVA_BOOLEAN);
        B3_CREATE_WAVE_MESH = downcallHandle("b3CreateWaveMesh", UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT);
        B3_CREATE_TORUS_MESH = downcallHandle("b3CreateTorusMesh", UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT, JAVA_FLOAT, JAVA_FLOAT);
        B3_CREATE_BOX_MESH = downcallHandle("b3CreateBoxMesh", UNBOUNDED_ADDRESS, Vec3.LAYOUT, Vec3.LAYOUT, JAVA_BOOLEAN);
        B3_CREATE_HOLLOW_BOX_MESH = downcallHandle("b3CreateHollowBoxMesh", UNBOUNDED_ADDRESS, Vec3.LAYOUT, Vec3.LAYOUT);
        B3_CREATE_PLATFORM_MESH = downcallHandle("b3CreatePlatformMesh", UNBOUNDED_ADDRESS, Vec3.LAYOUT, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT);
        B3_CREATE_MESH = downcallHandle("b3CreateMesh", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT);
        B3_DESTROY_MESH = downcallHandleVoid("b3DestroyMesh", UNBOUNDED_ADDRESS);
        B3_GET_HEIGHT = downcallHandle("b3GetHeight", JAVA_INT, UNBOUNDED_ADDRESS);
        //@formatter:on
    }

    private TriangleMesh() {
    }

    /// ```
    /// Create a grid mesh along the x and z axes.
    /// @param xCount the number of rows in the x direction
    /// @param zCount the number of rows in the z direction
    /// @param cellWidth the width of each cell
    /// @param materialCount the number of materials to generate
    /// @param identifyEdges compute adjacency information
    /// ```
    public static MemorySegment ncreateGridMesh(
    	int xCount,
    	int zCount,
    	float cellWidth,
    	int materialCount,
    	boolean identifyEdges
    ) {
    	MethodHandle method = B3_CREATE_GRID_MESH.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			xCount,
    			zCount,
    			cellWidth,
    			materialCount,
    			identifyEdges
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ncreateGridMesh].
    public static @Nullable MeshData createGridMesh(
    	int xCount,
    	int zCount,
    	float cellWidth,
    	int materialCount,
    	boolean identifyEdges
    ) {
    	MemorySegment segment = ncreateGridMesh(
    		xCount,
    		zCount,
    		cellWidth,
    		materialCount,
    		identifyEdges
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new MeshData(segment);
    }
    
    /// ```
    /// Create a wave mesh along the x and z axes.
    /// ```
    public static MemorySegment ncreateWaveMesh(
    	int xCount,
    	int zCount,
    	float cellWidth,
    	float amplitude,
    	float rowFrequency,
    	float columnFrequency
    ) {
    	MethodHandle method = B3_CREATE_WAVE_MESH.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			xCount,
    			zCount,
    			cellWidth,
    			amplitude,
    			rowFrequency,
    			columnFrequency
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ncreateWaveMesh].
    public static @Nullable MeshData createWaveMesh(
    	int xCount,
    	int zCount,
    	float cellWidth,
    	float amplitude,
    	float rowFrequency,
    	float columnFrequency
    ) {
    	MemorySegment segment = ncreateWaveMesh(
    		xCount,
    		zCount,
    		cellWidth,
    		amplitude,
    		rowFrequency,
    		columnFrequency
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new MeshData(segment);
    }
    
    /// ```
    /// Create a torus mesh.
    /// ```
    public static MemorySegment ncreateTorusMesh(
    	int radialResolution,
    	int tubularResolution,
    	float radius,
    	float thickness
    ) {
    	MethodHandle method = B3_CREATE_TORUS_MESH.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			radialResolution,
    			tubularResolution,
    			radius,
    			thickness
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ncreateTorusMesh].
    public static @Nullable MeshData createTorusMesh(
    	int radialResolution,
    	int tubularResolution,
    	float radius,
    	float thickness
    ) {
    	MemorySegment segment = ncreateTorusMesh(
    		radialResolution,
    		tubularResolution,
    		radius,
    		thickness
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new MeshData(segment);
    }
    
    /// ```
    /// Create a box mesh.
    /// ```
    public static MemorySegment createBoxMesh(
    	MemorySegment center,
    	MemorySegment extent,
    	boolean identifyEdges
    ) {
    	MethodHandle method = B3_CREATE_BOX_MESH.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			center,
    			extent,
    			identifyEdges
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#createBoxMesh].
    public static @Nullable MeshData createBoxMesh(
    	Vec3 center,
    	Vec3 extent,
    	boolean identifyEdges
    ) {
    	MemorySegment segment = createBoxMesh(
    		center.memorySegment(),
    		extent.memorySegment(),
    		identifyEdges
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new MeshData(segment);
    }
    
    /// ```
    /// Create a hollow box mesh.
    /// ```
    public static MemorySegment createHollowBoxMesh(
    	MemorySegment center,
    	MemorySegment extent
    ) {
    	MethodHandle method = B3_CREATE_HOLLOW_BOX_MESH.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			center,
    			extent
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#createHollowBoxMesh].
    public static @Nullable MeshData createHollowBoxMesh(
    	Vec3 center,
    	Vec3 extent
    ) {
    	MemorySegment segment = createHollowBoxMesh(
    		center.memorySegment(),
    		extent.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new MeshData(segment);
    }
    
    /// ```
    /// Create a platform mesh. A truncated pyramid.
    /// ```
    public static MemorySegment createPlatformMesh(
    	MemorySegment center,
    	float height,
    	float topWidth,
    	float bottomWidth
    ) {
    	MethodHandle method = B3_CREATE_PLATFORM_MESH.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			center,
    			height,
    			topWidth,
    			bottomWidth
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#createPlatformMesh].
    public static @Nullable MeshData createPlatformMesh(
    	Vec3 center,
    	float height,
    	float topWidth,
    	float bottomWidth
    ) {
    	MemorySegment segment = createPlatformMesh(
    		center.memorySegment(),
    		height,
    		topWidth,
    		bottomWidth
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new MeshData(segment);
    }
    
    /// ```
    /// Create a generic mesh.
    /// ```
    public static MemorySegment createMesh(
    	MemorySegment def,
    	MemorySegment degenerateTriangleIndices,
    	int degenerateCapacity
    ) {
    	MethodHandle method = B3_CREATE_MESH.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			def,
    			degenerateTriangleIndices,
    			degenerateCapacity
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#createMesh].
    public static @Nullable MeshData createMesh(
    	MeshDef def,
    	NativeIntArray degenerateTriangleIndices,
    	int degenerateCapacity
    ) {
    	MemorySegment segment = createMesh(
    		def.memorySegment(),
    		degenerateTriangleIndices.memorySegment(),
    		degenerateCapacity
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new MeshData(segment);
    }
    
    /// ```
    /// Destroy a mesh.
    /// ```
    public static void destroyMesh(
    	MemorySegment mesh
    ) {
    	MethodHandle method = B3_DESTROY_MESH.get();
    	try {
    		 method.invokeExact(
    			mesh
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#destroyMesh].
    public static void destroyMesh(
    	MeshData mesh
    ) {
    	destroyMesh(
    		mesh.memorySegment()
    	);
    }
    
    /// ```
    /// Get the height of the mesh BVH.
    /// ```
    public static int getHeight(
    	MemorySegment mesh
    ) {
    	MethodHandle method = B3_GET_HEIGHT.get();
    	try {
    		return (int) method.invokeExact(
    			mesh
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getHeight].
    public static int getHeight(
    	MeshData mesh
    ) {
    	return getHeight(
    		mesh.memorySegment()
    	);
    }
    
}