/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.box3d.geometry;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.invoke.MethodHandle;
import org.jspecify.annotations.Nullable;
import volucris.bindings.box3d.math.Transform;
import volucris.bindings.box3d.math.Vec3;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class ConvexHull {

    private static final LazyConstant<MethodHandle> B3_CREATE_CYLINDER;
    private static final LazyConstant<MethodHandle> B3_CREATE_CONE;
    private static final LazyConstant<MethodHandle> B3_CREATE_ROCK;
    private static final LazyConstant<MethodHandle> B3_CREATE_HULL;
    private static final LazyConstant<MethodHandle> B3_CLONE_HULL;
    private static final LazyConstant<MethodHandle> B3_CLONE_AND_TRANSFORM_HULL;
    private static final LazyConstant<MethodHandle> B3_DESTROY_HULL;
    private static final LazyConstant<MethodHandle> B3_MAKE_CUBE_HULL;
    private static final LazyConstant<MethodHandle> B3_MAKE_BOX_HULL;
    private static final LazyConstant<MethodHandle> B3_MAKE_OFFSET_BOX_HULL;
    private static final LazyConstant<MethodHandle> B3_MAKE_TRANSFORMED_BOX_HULL;
    private static final LazyConstant<MethodHandle> B3_MAKE_SCALED_BOX_HULL;
    private static final LazyConstant<MethodHandle> B3_SCALE_BOX;

    static {
        //@formatter:off
        B3_CREATE_CYLINDER = downcallHandle("b3CreateCylinder", UNBOUNDED_ADDRESS, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT, JAVA_INT);
        B3_CREATE_CONE = downcallHandle("b3CreateCone", UNBOUNDED_ADDRESS, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT, JAVA_INT);
        B3_CREATE_ROCK = downcallHandle("b3CreateRock", UNBOUNDED_ADDRESS, JAVA_FLOAT);
        B3_CREATE_HULL = downcallHandle("b3CreateHull", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT);
        B3_CLONE_HULL = downcallHandle("b3CloneHull", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        B3_CLONE_AND_TRANSFORM_HULL = downcallHandle("b3CloneAndTransformHull", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, Transform.LAYOUT, Vec3.LAYOUT);
        B3_DESTROY_HULL = downcallHandleVoid("b3DestroyHull", UNBOUNDED_ADDRESS);
        B3_MAKE_CUBE_HULL = downcallHandle("b3MakeCubeHull", BoxHull.LAYOUT, JAVA_FLOAT);
        B3_MAKE_BOX_HULL = downcallHandle("b3MakeBoxHull", BoxHull.LAYOUT, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT);
        B3_MAKE_OFFSET_BOX_HULL = downcallHandle("b3MakeOffsetBoxHull", BoxHull.LAYOUT, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT, Vec3.LAYOUT);
        B3_MAKE_TRANSFORMED_BOX_HULL = downcallHandle("b3MakeTransformedBoxHull", BoxHull.LAYOUT, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT, Transform.LAYOUT);
        B3_MAKE_SCALED_BOX_HULL = downcallHandle("b3MakeScaledBoxHull", BoxHull.LAYOUT, Vec3.LAYOUT, Transform.LAYOUT, Vec3.LAYOUT);
        B3_SCALE_BOX = downcallHandleVoid("b3ScaleBox", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, Vec3.LAYOUT, JAVA_FLOAT);
        //@formatter:on
    }

    private ConvexHull() {
    }

    /// ```
    /// Create a tessellated cylinder as a hull.
    /// ```
    public static MemorySegment ncreateCylinder(
    	float height,
    	float radius,
    	float yOffset,
    	int sides
    ) {
    	MethodHandle method = B3_CREATE_CYLINDER.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			height,
    			radius,
    			yOffset,
    			sides
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ncreateCylinder].
    public static @Nullable HullData createCylinder(
    	float height,
    	float radius,
    	float yOffset,
    	int sides
    ) {
    	MemorySegment segment = ncreateCylinder(
    		height,
    		radius,
    		yOffset,
    		sides
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new HullData(segment);
    }
    
    /// ```
    /// Create a tessellated cone as a hull.
    /// ```
    public static MemorySegment ncreateCone(
    	float height,
    	float radius1,
    	float radius2,
    	int slices
    ) {
    	MethodHandle method = B3_CREATE_CONE.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			height,
    			radius1,
    			radius2,
    			slices
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ncreateCone].
    public static @Nullable HullData createCone(
    	float height,
    	float radius1,
    	float radius2,
    	int slices
    ) {
    	MemorySegment segment = ncreateCone(
    		height,
    		radius1,
    		radius2,
    		slices
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new HullData(segment);
    }
    
    /// ```
    /// Create a rock shaped hull.
    /// ```
    public static MemorySegment ncreateRock(
    	float radius
    ) {
    	MethodHandle method = B3_CREATE_ROCK.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			radius
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ncreateRock].
    public static @Nullable HullData createRock(
    	float radius
    ) {
    	MemorySegment segment = ncreateRock(
    		radius
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new HullData(segment);
    }
    
    /// ```
    /// Create a generic convex hull.
    /// ```
    public static MemorySegment createHull(
    	MemorySegment points,
    	int pointCount,
    	int maxVertexCount
    ) {
    	MethodHandle method = B3_CREATE_HULL.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			points,
    			pointCount,
    			maxVertexCount
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#createHull].
    public static @Nullable HullData createHull(
    	Vec3 points,
    	int pointCount,
    	int maxVertexCount
    ) {
    	MemorySegment segment = createHull(
    		points.memorySegment(),
    		pointCount,
    		maxVertexCount
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new HullData(segment);
    }
    
    /// ```
    /// Deep clone a hull.
    /// ```
    public static MemorySegment cloneHull(
    	MemorySegment hull
    ) {
    	MethodHandle method = B3_CLONE_HULL.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			hull
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#cloneHull].
    public static @Nullable HullData cloneHull(
    	HullData hull
    ) {
    	MemorySegment segment = cloneHull(
    		hull.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new HullData(segment);
    }
    
    /// ```
    /// Clone and transform a hull. Supports non-uniform and mirroring scale.
    /// ```
    public static MemorySegment cloneAndTransformHull(
    	MemorySegment original,
    	MemorySegment transform,
    	MemorySegment scale
    ) {
    	MethodHandle method = B3_CLONE_AND_TRANSFORM_HULL.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			original,
    			transform,
    			scale
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#cloneAndTransformHull].
    public static @Nullable HullData cloneAndTransformHull(
    	HullData original,
    	Transform transform,
    	Vec3 scale
    ) {
    	MemorySegment segment = cloneAndTransformHull(
    		original.memorySegment(),
    		transform.memorySegment(),
    		scale.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new HullData(segment);
    }
    
    /// ```
    /// Destroy a hull.
    /// ```
    public static void destroyHull(
    	MemorySegment hull
    ) {
    	MethodHandle method = B3_DESTROY_HULL.get();
    	try {
    		 method.invokeExact(
    			hull
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#destroyHull].
    public static void destroyHull(
    	HullData hull
    ) {
    	destroyHull(
    		hull.memorySegment()
    	);
    }
    
    /// ```
    /// Make a cube as a hull. Do not call b3DestroyHull on this.
    /// ```
    public static MemorySegment nmakeCubeHull(
    	SegmentAllocator allocator,
    	float halfWidth
    ) {
    	MethodHandle method = B3_MAKE_CUBE_HULL.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			halfWidth
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nmakeCubeHull].
    public static @Nullable BoxHull makeCubeHull(
    	SegmentAllocator allocator,
    	float halfWidth
    ) {
    	MemorySegment segment = nmakeCubeHull(
    		allocator,
    		halfWidth
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new BoxHull(segment);
    }
    
    /// ```
    /// Make a box as a hull. Do not call b3DestroyHull on this.
    /// ```
    public static MemorySegment nmakeBoxHull(
    	SegmentAllocator allocator,
    	float hx,
    	float hy,
    	float hz
    ) {
    	MethodHandle method = B3_MAKE_BOX_HULL.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			hx,
    			hy,
    			hz
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nmakeBoxHull].
    public static @Nullable BoxHull makeBoxHull(
    	SegmentAllocator allocator,
    	float hx,
    	float hy,
    	float hz
    ) {
    	MemorySegment segment = nmakeBoxHull(
    		allocator,
    		hx,
    		hy,
    		hz
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new BoxHull(segment);
    }
    
    /// ```
    /// Make an offset box as a hull. Do not call b3DestroyHull on this.
    /// ```
    public static MemorySegment makeOffsetBoxHull(
    	SegmentAllocator allocator,
    	float hx,
    	float hy,
    	float hz,
    	MemorySegment offset
    ) {
    	MethodHandle method = B3_MAKE_OFFSET_BOX_HULL.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			hx,
    			hy,
    			hz,
    			offset
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#makeOffsetBoxHull].
    public static @Nullable BoxHull makeOffsetBoxHull(
    	SegmentAllocator allocator,
    	float hx,
    	float hy,
    	float hz,
    	Vec3 offset
    ) {
    	MemorySegment segment = makeOffsetBoxHull(
    		allocator,
    		hx,
    		hy,
    		hz,
    		offset.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new BoxHull(segment);
    }
    
    /// ```
    /// Make a transformed box as a hull. Do not call b3DestroyHull on this.
    /// @param hx, hy, hz positive half widths
    /// @param transform local transform of box
    /// ```
    public static MemorySegment makeTransformedBoxHull(
    	SegmentAllocator allocator,
    	float hx,
    	float hy,
    	float hz,
    	MemorySegment transform
    ) {
    	MethodHandle method = B3_MAKE_TRANSFORMED_BOX_HULL.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			hx,
    			hy,
    			hz,
    			transform
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#makeTransformedBoxHull].
    public static @Nullable BoxHull makeTransformedBoxHull(
    	SegmentAllocator allocator,
    	float hx,
    	float hy,
    	float hz,
    	Transform transform
    ) {
    	MemorySegment segment = makeTransformedBoxHull(
    		allocator,
    		hx,
    		hy,
    		hz,
    		transform.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new BoxHull(segment);
    }
    
    /// ```
    /// This makes a transformed box hull with post scaling. This is useful for boxes that are scaled in
    /// a level editor. Such scaling can have reflection and shear. In the case of shear the result
    /// may be approximate. If you need to support shear consider using b3CreateHull.
    /// Do not call b3DestroyHull on this.
    /// @param halfWidths positive half widths
    /// @param transform local transform of box
    /// @param postScale scale applied after the transform, may be negative
    /// ```
    public static MemorySegment makeScaledBoxHull(
    	SegmentAllocator allocator,
    	MemorySegment halfWidths,
    	MemorySegment transform,
    	MemorySegment postScale
    ) {
    	MethodHandle method = B3_MAKE_SCALED_BOX_HULL.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			halfWidths,
    			transform,
    			postScale
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#makeScaledBoxHull].
    public static @Nullable BoxHull makeScaledBoxHull(
    	SegmentAllocator allocator,
    	Vec3 halfWidths,
    	Transform transform,
    	Vec3 postScale
    ) {
    	MemorySegment segment = makeScaledBoxHull(
    		allocator,
    		halfWidths.memorySegment(),
    		transform.memorySegment(),
    		postScale.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new BoxHull(segment);
    }
    
    /// ```
    /// This takes a box with a transform and post scale and converts it into a box with the post scale
    /// resolved with new half-widths and transform. This accepts non-uniform and negative scale.
    /// This is approximate if there is shear.
    /// @param halfWidths [in/out] the box half widths
    /// @param transform [in/out] the box transform with rotation and translation
    /// @param postScale the post scale being applied to the box after the transform
    /// @param minHalfWidth the minimum half width after scale is applied
    /// ```
    public static void scaleBox(
    	MemorySegment halfWidths,
    	MemorySegment transform,
    	MemorySegment postScale,
    	float minHalfWidth
    ) {
    	MethodHandle method = B3_SCALE_BOX.get();
    	try {
    		 method.invokeExact(
    			halfWidths,
    			transform,
    			postScale,
    			minHalfWidth
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#scaleBox].
    public static void scaleBox(
    	Vec3 halfWidths,
    	Transform transform,
    	Vec3 postScale,
    	float minHalfWidth
    ) {
    	scaleBox(
    		halfWidths.memorySegment(),
    		transform.memorySegment(),
    		postScale.memorySegment(),
    		minHalfWidth
    	);
    }
    
}