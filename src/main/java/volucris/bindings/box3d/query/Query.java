/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.box3d.query;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.invoke.MethodHandle;
import org.jspecify.annotations.Nullable;
import volucris.bindings.box3d.geometry.Capsule;
import volucris.bindings.box3d.geometry.CompoundData;
import volucris.bindings.box3d.geometry.HeightFieldData;
import volucris.bindings.box3d.geometry.HullData;
import volucris.bindings.box3d.geometry.Mesh;
import volucris.bindings.box3d.geometry.Sphere;
import volucris.bindings.box3d.math.AABB;
import volucris.bindings.box3d.math.Transform;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class Query {

    private static final LazyConstant<MethodHandle> B3_IS_VALID_RAY;
    private static final LazyConstant<MethodHandle> B3_OVERLAP_CAPSULE;
    private static final LazyConstant<MethodHandle> B3_OVERLAP_COMPOUND;
    private static final LazyConstant<MethodHandle> B3_OVERLAP_HEIGHT_FIELD;
    private static final LazyConstant<MethodHandle> B3_OVERLAP_HULL;
    private static final LazyConstant<MethodHandle> B3_OVERLAP_MESH;
    private static final LazyConstant<MethodHandle> B3_OVERLAP_SPHERE;
    private static final LazyConstant<MethodHandle> B3_RAY_CAST_SPHERE;
    private static final LazyConstant<MethodHandle> B3_RAY_CAST_HOLLOW_SPHERE;
    private static final LazyConstant<MethodHandle> B3_RAY_CAST_CAPSULE;
    private static final LazyConstant<MethodHandle> B3_RAY_CAST_COMPOUND;
    private static final LazyConstant<MethodHandle> B3_RAY_CAST_HULL;
    private static final LazyConstant<MethodHandle> B3_RAY_CAST_MESH;
    private static final LazyConstant<MethodHandle> B3_RAY_CAST_HEIGHT_FIELD;
    private static final LazyConstant<MethodHandle> B3_SHAPE_CAST_SPHERE;
    private static final LazyConstant<MethodHandle> B3_SHAPE_CAST_CAPSULE;
    private static final LazyConstant<MethodHandle> B3_SHAPE_CAST_COMPOUND;
    private static final LazyConstant<MethodHandle> B3_SHAPE_CAST_HULL;
    private static final LazyConstant<MethodHandle> B3_SHAPE_CAST_MESH;
    private static final LazyConstant<MethodHandle> B3_SHAPE_CAST_HEIGHT_FIELD;
    private static final LazyConstant<MethodHandle> B3_QUERY_MESH;
    private static final LazyConstant<MethodHandle> B3_QUERY_HEIGHT_FIELD;
    private static final LazyConstant<MethodHandle> B3_SHAPE_DISTANCE;
    private static final LazyConstant<MethodHandle> B3_SHAPE_CAST;
    private static final LazyConstant<MethodHandle> B3_GET_SWEEP_TRANSFORM;
    private static final LazyConstant<MethodHandle> B3_TIME_OF_IMPACT;

    static {
        //@formatter:off
        B3_IS_VALID_RAY = downcallHandle("b3IsValidRay", JAVA_BOOLEAN, UNBOUNDED_ADDRESS);
        B3_OVERLAP_CAPSULE = downcallHandle("b3OverlapCapsule", JAVA_BOOLEAN, UNBOUNDED_ADDRESS, Transform.LAYOUT, UNBOUNDED_ADDRESS);
        B3_OVERLAP_COMPOUND = downcallHandle("b3OverlapCompound", JAVA_BOOLEAN, UNBOUNDED_ADDRESS, Transform.LAYOUT, UNBOUNDED_ADDRESS);
        B3_OVERLAP_HEIGHT_FIELD = downcallHandle("b3OverlapHeightField", JAVA_BOOLEAN, UNBOUNDED_ADDRESS, Transform.LAYOUT, UNBOUNDED_ADDRESS);
        B3_OVERLAP_HULL = downcallHandle("b3OverlapHull", JAVA_BOOLEAN, UNBOUNDED_ADDRESS, Transform.LAYOUT, UNBOUNDED_ADDRESS);
        B3_OVERLAP_MESH = downcallHandle("b3OverlapMesh", JAVA_BOOLEAN, UNBOUNDED_ADDRESS, Transform.LAYOUT, UNBOUNDED_ADDRESS);
        B3_OVERLAP_SPHERE = downcallHandle("b3OverlapSphere", JAVA_BOOLEAN, UNBOUNDED_ADDRESS, Transform.LAYOUT, UNBOUNDED_ADDRESS);
        B3_RAY_CAST_SPHERE = downcallHandle("b3RayCastSphere", CastOutput.LAYOUT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        B3_RAY_CAST_HOLLOW_SPHERE = downcallHandle("b3RayCastHollowSphere", CastOutput.LAYOUT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        B3_RAY_CAST_CAPSULE = downcallHandle("b3RayCastCapsule", CastOutput.LAYOUT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        B3_RAY_CAST_COMPOUND = downcallHandle("b3RayCastCompound", CastOutput.LAYOUT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        B3_RAY_CAST_HULL = downcallHandle("b3RayCastHull", CastOutput.LAYOUT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        B3_RAY_CAST_MESH = downcallHandle("b3RayCastMesh", CastOutput.LAYOUT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        B3_RAY_CAST_HEIGHT_FIELD = downcallHandle("b3RayCastHeightField", CastOutput.LAYOUT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        B3_SHAPE_CAST_SPHERE = downcallHandle("b3ShapeCastSphere", CastOutput.LAYOUT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        B3_SHAPE_CAST_CAPSULE = downcallHandle("b3ShapeCastCapsule", CastOutput.LAYOUT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        B3_SHAPE_CAST_COMPOUND = downcallHandle("b3ShapeCastCompound", CastOutput.LAYOUT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        B3_SHAPE_CAST_HULL = downcallHandle("b3ShapeCastHull", CastOutput.LAYOUT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        B3_SHAPE_CAST_MESH = downcallHandle("b3ShapeCastMesh", CastOutput.LAYOUT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        B3_SHAPE_CAST_HEIGHT_FIELD = downcallHandle("b3ShapeCastHeightField", CastOutput.LAYOUT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        B3_QUERY_MESH = downcallHandleVoid("b3QueryMesh", UNBOUNDED_ADDRESS, AABB.LAYOUT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        B3_QUERY_HEIGHT_FIELD = downcallHandleVoid("b3QueryHeightField", UNBOUNDED_ADDRESS, AABB.LAYOUT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        B3_SHAPE_DISTANCE = downcallHandle("b3ShapeDistance", DistanceOutput.LAYOUT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT);
        B3_SHAPE_CAST = downcallHandle("b3ShapeCast", CastOutput.LAYOUT, UNBOUNDED_ADDRESS);
        B3_GET_SWEEP_TRANSFORM = downcallHandle("b3GetSweepTransform", Transform.LAYOUT, UNBOUNDED_ADDRESS, JAVA_FLOAT);
        B3_TIME_OF_IMPACT = downcallHandle("b3TimeOfImpact", TOIOutput.LAYOUT, UNBOUNDED_ADDRESS);
        //@formatter:on
    }

    private Query() {
    }

    /// ```
    /// Use this to ensure your ray cast input is valid and avoid internal assertions.
    /// ```
    public static boolean isValidRay(
    	MemorySegment input
    ) {
    	MethodHandle method = B3_IS_VALID_RAY.get();
    	try {
    		return (boolean) method.invokeExact(
    			input
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#isValidRay].
    public static boolean isValidRay(
    	RayCastInput input
    ) {
    	return isValidRay(
    		input.memorySegment()
    	);
    }
    
    /// ```
    /// Overlap shape versus capsule
    /// ```
    public static boolean overlapCapsule(
    	MemorySegment shape,
    	MemorySegment shapeTransform,
    	MemorySegment proxy
    ) {
    	MethodHandle method = B3_OVERLAP_CAPSULE.get();
    	try {
    		return (boolean) method.invokeExact(
    			shape,
    			shapeTransform,
    			proxy
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#overlapCapsule].
    public static boolean overlapCapsule(
    	Capsule shape,
    	Transform shapeTransform,
    	ShapeProxy proxy
    ) {
    	return overlapCapsule(
    		shape.memorySegment(),
    		shapeTransform.memorySegment(),
    		proxy.memorySegment()
    	);
    }
    
    /// ```
    /// Overlap shape versus compound
    /// ```
    public static boolean overlapCompound(
    	MemorySegment shape,
    	MemorySegment shapeTransform,
    	MemorySegment proxy
    ) {
    	MethodHandle method = B3_OVERLAP_COMPOUND.get();
    	try {
    		return (boolean) method.invokeExact(
    			shape,
    			shapeTransform,
    			proxy
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#overlapCompound].
    public static boolean overlapCompound(
    	CompoundData shape,
    	Transform shapeTransform,
    	ShapeProxy proxy
    ) {
    	return overlapCompound(
    		shape.memorySegment(),
    		shapeTransform.memorySegment(),
    		proxy.memorySegment()
    	);
    }
    
    /// ```
    /// Overlap shape versus height field
    /// ```
    public static boolean overlapHeightField(
    	MemorySegment shape,
    	MemorySegment shapeTransform,
    	MemorySegment proxy
    ) {
    	MethodHandle method = B3_OVERLAP_HEIGHT_FIELD.get();
    	try {
    		return (boolean) method.invokeExact(
    			shape,
    			shapeTransform,
    			proxy
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#overlapHeightField].
    public static boolean overlapHeightField(
    	HeightFieldData shape,
    	Transform shapeTransform,
    	ShapeProxy proxy
    ) {
    	return overlapHeightField(
    		shape.memorySegment(),
    		shapeTransform.memorySegment(),
    		proxy.memorySegment()
    	);
    }
    
    /// ```
    /// Overlap shape versus hull
    /// ```
    public static boolean overlapHull(
    	MemorySegment shape,
    	MemorySegment shapeTransform,
    	MemorySegment proxy
    ) {
    	MethodHandle method = B3_OVERLAP_HULL.get();
    	try {
    		return (boolean) method.invokeExact(
    			shape,
    			shapeTransform,
    			proxy
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#overlapHull].
    public static boolean overlapHull(
    	HullData shape,
    	Transform shapeTransform,
    	ShapeProxy proxy
    ) {
    	return overlapHull(
    		shape.memorySegment(),
    		shapeTransform.memorySegment(),
    		proxy.memorySegment()
    	);
    }
    
    /// ```
    /// Overlap shape versus mesh
    /// ```
    public static boolean overlapMesh(
    	MemorySegment shape,
    	MemorySegment shapeTransform,
    	MemorySegment proxy
    ) {
    	MethodHandle method = B3_OVERLAP_MESH.get();
    	try {
    		return (boolean) method.invokeExact(
    			shape,
    			shapeTransform,
    			proxy
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#overlapMesh].
    public static boolean overlapMesh(
    	Mesh shape,
    	Transform shapeTransform,
    	ShapeProxy proxy
    ) {
    	return overlapMesh(
    		shape.memorySegment(),
    		shapeTransform.memorySegment(),
    		proxy.memorySegment()
    	);
    }
    
    /// ```
    /// Overlap shape versus sphere
    /// ```
    public static boolean overlapSphere(
    	MemorySegment shape,
    	MemorySegment shapeTransform,
    	MemorySegment proxy
    ) {
    	MethodHandle method = B3_OVERLAP_SPHERE.get();
    	try {
    		return (boolean) method.invokeExact(
    			shape,
    			shapeTransform,
    			proxy
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#overlapSphere].
    public static boolean overlapSphere(
    	Sphere shape,
    	Transform shapeTransform,
    	ShapeProxy proxy
    ) {
    	return overlapSphere(
    		shape.memorySegment(),
    		shapeTransform.memorySegment(),
    		proxy.memorySegment()
    	);
    }
    
    /// ```
    /// Ray cast versus sphere in local space. A zero length ray is a point query. Initial overlap
    /// reports a hit at the ray origin with zero fraction and zero normal.
    /// ```
    public static MemorySegment rayCastSphere(
    	SegmentAllocator allocator,
    	MemorySegment shape,
    	MemorySegment input
    ) {
    	MethodHandle method = B3_RAY_CAST_SPHERE.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			shape,
    			input
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#rayCastSphere].
    public static @Nullable CastOutput rayCastSphere(
    	SegmentAllocator allocator,
    	Sphere shape,
    	RayCastInput input
    ) {
    	MemorySegment segment = rayCastSphere(
    		allocator,
    		shape.memorySegment(),
    		input.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new CastOutput(segment);
    }
    
    /// ```
    /// Ray cast versus a hollow sphere shell in local space. Unlike the solid sphere a ray starting
    /// inside is not an overlap: it passes through and hits the far wall.
    /// ```
    public static MemorySegment rayCastHollowSphere(
    	SegmentAllocator allocator,
    	MemorySegment shape,
    	MemorySegment input
    ) {
    	MethodHandle method = B3_RAY_CAST_HOLLOW_SPHERE.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			shape,
    			input
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#rayCastHollowSphere].
    public static @Nullable CastOutput rayCastHollowSphere(
    	SegmentAllocator allocator,
    	Sphere shape,
    	RayCastInput input
    ) {
    	MemorySegment segment = rayCastHollowSphere(
    		allocator,
    		shape.memorySegment(),
    		input.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new CastOutput(segment);
    }
    
    /// ```
    /// Ray cast versus capsule in local space. A zero length ray is a point query. Initial overlap
    /// reports a hit at the ray origin with zero fraction and zero normal.
    /// ```
    public static MemorySegment rayCastCapsule(
    	SegmentAllocator allocator,
    	MemorySegment shape,
    	MemorySegment input
    ) {
    	MethodHandle method = B3_RAY_CAST_CAPSULE.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			shape,
    			input
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#rayCastCapsule].
    public static @Nullable CastOutput rayCastCapsule(
    	SegmentAllocator allocator,
    	Capsule shape,
    	RayCastInput input
    ) {
    	MemorySegment segment = rayCastCapsule(
    		allocator,
    		shape.memorySegment(),
    		input.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new CastOutput(segment);
    }
    
    /// ```
    /// Ray cast versus compound in local space. A zero length ray is a point query. Initial overlap
    /// with a child reports a hit at the ray origin with zero fraction and zero normal.
    /// ```
    public static MemorySegment rayCastCompound(
    	SegmentAllocator allocator,
    	MemorySegment shape,
    	MemorySegment input
    ) {
    	MethodHandle method = B3_RAY_CAST_COMPOUND.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			shape,
    			input
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#rayCastCompound].
    public static @Nullable CastOutput rayCastCompound(
    	SegmentAllocator allocator,
    	CompoundData shape,
    	RayCastInput input
    ) {
    	MemorySegment segment = rayCastCompound(
    		allocator,
    		shape.memorySegment(),
    		input.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new CastOutput(segment);
    }
    
    /// ```
    /// Ray cast versus hull shape in local space. A zero length ray is a point query. Initial overlap
    /// reports a hit at the ray origin with zero fraction and zero normal.
    /// ```
    public static MemorySegment rayCastHull(
    	SegmentAllocator allocator,
    	MemorySegment shape,
    	MemorySegment input
    ) {
    	MethodHandle method = B3_RAY_CAST_HULL.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			shape,
    			input
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#rayCastHull].
    public static @Nullable CastOutput rayCastHull(
    	SegmentAllocator allocator,
    	HullData shape,
    	RayCastInput input
    ) {
    	MemorySegment segment = rayCastHull(
    		allocator,
    		shape.memorySegment(),
    		input.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new CastOutput(segment);
    }
    
    /// ```
    /// Ray cast versus mesh in local space. A thin surface with no interior, so there is no overlap case.
    /// ```
    public static MemorySegment rayCastMesh(
    	SegmentAllocator allocator,
    	MemorySegment shape,
    	MemorySegment input
    ) {
    	MethodHandle method = B3_RAY_CAST_MESH.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			shape,
    			input
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#rayCastMesh].
    public static @Nullable CastOutput rayCastMesh(
    	SegmentAllocator allocator,
    	Mesh shape,
    	RayCastInput input
    ) {
    	MemorySegment segment = rayCastMesh(
    		allocator,
    		shape.memorySegment(),
    		input.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new CastOutput(segment);
    }
    
    /// ```
    /// Ray cast versus height field in local space. A thin surface with no interior, so there is no overlap case.
    /// ```
    public static MemorySegment rayCastHeightField(
    	SegmentAllocator allocator,
    	MemorySegment shape,
    	MemorySegment input
    ) {
    	MethodHandle method = B3_RAY_CAST_HEIGHT_FIELD.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			shape,
    			input
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#rayCastHeightField].
    public static @Nullable CastOutput rayCastHeightField(
    	SegmentAllocator allocator,
    	HeightFieldData shape,
    	RayCastInput input
    ) {
    	MemorySegment segment = rayCastHeightField(
    		allocator,
    		shape.memorySegment(),
    		input.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new CastOutput(segment);
    }
    
    /// ```
    /// Shape cast versus a sphere. Initial overlap is treated as a miss.
    /// ```
    public static MemorySegment shapeCastSphere(
    	SegmentAllocator allocator,
    	MemorySegment shape,
    	MemorySegment input
    ) {
    	MethodHandle method = B3_SHAPE_CAST_SPHERE.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			shape,
    			input
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#shapeCastSphere].
    public static @Nullable CastOutput shapeCastSphere(
    	SegmentAllocator allocator,
    	Sphere shape,
    	ShapeCastInput input
    ) {
    	MemorySegment segment = shapeCastSphere(
    		allocator,
    		shape.memorySegment(),
    		input.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new CastOutput(segment);
    }
    
    /// ```
    /// Shape cast versus a capsule. Initial overlap is treated as a miss.
    /// ```
    public static MemorySegment shapeCastCapsule(
    	SegmentAllocator allocator,
    	MemorySegment shape,
    	MemorySegment input
    ) {
    	MethodHandle method = B3_SHAPE_CAST_CAPSULE.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			shape,
    			input
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#shapeCastCapsule].
    public static @Nullable CastOutput shapeCastCapsule(
    	SegmentAllocator allocator,
    	Capsule shape,
    	ShapeCastInput input
    ) {
    	MemorySegment segment = shapeCastCapsule(
    		allocator,
    		shape.memorySegment(),
    		input.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new CastOutput(segment);
    }
    
    /// ```
    /// Shape cast versus compound. Initial overlap is treated as a miss.
    /// ```
    public static MemorySegment shapeCastCompound(
    	SegmentAllocator allocator,
    	MemorySegment shape,
    	MemorySegment input
    ) {
    	MethodHandle method = B3_SHAPE_CAST_COMPOUND.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			shape,
    			input
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#shapeCastCompound].
    public static @Nullable CastOutput shapeCastCompound(
    	SegmentAllocator allocator,
    	CompoundData shape,
    	ShapeCastInput input
    ) {
    	MemorySegment segment = shapeCastCompound(
    		allocator,
    		shape.memorySegment(),
    		input.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new CastOutput(segment);
    }
    
    /// ```
    /// Shape cast versus a hull. Initial overlap is treated as a miss.
    /// ```
    public static MemorySegment shapeCastHull(
    	SegmentAllocator allocator,
    	MemorySegment shape,
    	MemorySegment input
    ) {
    	MethodHandle method = B3_SHAPE_CAST_HULL.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			shape,
    			input
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#shapeCastHull].
    public static @Nullable CastOutput shapeCastHull(
    	SegmentAllocator allocator,
    	HullData shape,
    	ShapeCastInput input
    ) {
    	MemorySegment segment = shapeCastHull(
    		allocator,
    		shape.memorySegment(),
    		input.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new CastOutput(segment);
    }
    
    /// ```
    /// Shape cast versus a mesh. Initial overlap is treated as a miss.
    /// ```
    public static MemorySegment shapeCastMesh(
    	SegmentAllocator allocator,
    	MemorySegment shape,
    	MemorySegment input
    ) {
    	MethodHandle method = B3_SHAPE_CAST_MESH.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			shape,
    			input
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#shapeCastMesh].
    public static @Nullable CastOutput shapeCastMesh(
    	SegmentAllocator allocator,
    	Mesh shape,
    	ShapeCastInput input
    ) {
    	MemorySegment segment = shapeCastMesh(
    		allocator,
    		shape.memorySegment(),
    		input.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new CastOutput(segment);
    }
    
    /// ```
    /// Shape cast versus a height field. Initial overlap is treated as a miss.
    /// ```
    public static MemorySegment shapeCastHeightField(
    	SegmentAllocator allocator,
    	MemorySegment shape,
    	MemorySegment input
    ) {
    	MethodHandle method = B3_SHAPE_CAST_HEIGHT_FIELD.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			shape,
    			input
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#shapeCastHeightField].
    public static @Nullable CastOutput shapeCastHeightField(
    	SegmentAllocator allocator,
    	HeightFieldData shape,
    	ShapeCastInput input
    ) {
    	MemorySegment segment = shapeCastHeightField(
    		allocator,
    		shape.memorySegment(),
    		input.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new CastOutput(segment);
    }
    
    /// ```
    /// Query a mesh for triangles overlapping a bounding box in local space. May have false positives. Useful for debug draw.
    /// @param mesh the mesh to query, includes scale
    /// @param bounds the bounding box in local space
    /// @param fcn a user function to collect triangles
    /// @param context the context sent to the user function.
    /// ```
    public static void queryMesh(
    	MemorySegment mesh,
    	MemorySegment bounds,
    	MemorySegment fcn,
    	MemorySegment context
    ) {
    	MethodHandle method = B3_QUERY_MESH.get();
    	try {
    		 method.invokeExact(
    			mesh,
    			bounds,
    			fcn,
    			context
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#queryMesh].
    public static void queryMesh(
    	Mesh mesh,
    	AABB bounds,
    	MeshQueryFcn fcn,
    	MemorySegment context
    ) {
    	queryMesh(
    		mesh.memorySegment(),
    		bounds.memorySegment(),
    		fcn.memorySegment(),
    		context
    	);
    }
    
    /// ```
    /// Query a height field for triangles overlapping a bounding box in local space. May have false positives. Useful for debug draw.
    /// @param heightField the height field to query
    /// @param bounds the bounding box in local space
    /// @param fcn a user function to collect triangles
    /// @param context the context sent to the user function.
    /// ```
    public static void queryHeightField(
    	MemorySegment heightField,
    	MemorySegment bounds,
    	MemorySegment fcn,
    	MemorySegment context
    ) {
    	MethodHandle method = B3_QUERY_HEIGHT_FIELD.get();
    	try {
    		 method.invokeExact(
    			heightField,
    			bounds,
    			fcn,
    			context
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#queryHeightField].
    public static void queryHeightField(
    	HeightFieldData heightField,
    	AABB bounds,
    	MeshQueryFcn fcn,
    	MemorySegment context
    ) {
    	queryHeightField(
    		heightField.memorySegment(),
    		bounds.memorySegment(),
    		fcn.memorySegment(),
    		context
    	);
    }
    
    /// ```
    /// Compute the closest points between two shapes represented as point clouds.
    /// b3SimplexCache cache is input/output. On the first call set b3SimplexCache.count to zero.
    /// The query runs in frame A, so the witness points and normal are returned in frame A.
    /// The underlying GJK algorithm may be debugged by passing in debug simplexes and capacity. You may pass in NULL and 0 for these.
    /// ```
    public static MemorySegment shapeDistance(
    	SegmentAllocator allocator,
    	MemorySegment input,
    	MemorySegment cache,
    	MemorySegment simplexes,
    	int simplexCapacity
    ) {
    	MethodHandle method = B3_SHAPE_DISTANCE.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			input,
    			cache,
    			simplexes,
    			simplexCapacity
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#shapeDistance].
    public static @Nullable DistanceOutput shapeDistance(
    	SegmentAllocator allocator,
    	DistanceInput input,
    	SimplexCache cache,
    	Simplex simplexes,
    	int simplexCapacity
    ) {
    	MemorySegment segment = shapeDistance(
    		allocator,
    		input.memorySegment(),
    		cache.memorySegment(),
    		simplexes.memorySegment(),
    		simplexCapacity
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new DistanceOutput(segment);
    }
    
    /// ```
    /// Perform a linear shape cast of shape B moving and shape A fixed. Determines the hit point, normal, and translation fraction.
    /// The query runs in frame A, so the hit point and normal are returned in frame A. Initially touching shapes are a miss.
    /// ```
    public static MemorySegment shapeCast(
    	SegmentAllocator allocator,
    	MemorySegment input
    ) {
    	MethodHandle method = B3_SHAPE_CAST.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			input
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#shapeCast].
    public static @Nullable CastOutput shapeCast(
    	SegmentAllocator allocator,
    	ShapeCastPairInput input
    ) {
    	MemorySegment segment = shapeCast(
    		allocator,
    		input.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new CastOutput(segment);
    }
    
    /// ```
    /// Evaluate the transform sweep at a specific time.
    /// ```
    public static MemorySegment getSweepTransform(
    	SegmentAllocator allocator,
    	MemorySegment sweep,
    	float time
    ) {
    	MethodHandle method = B3_GET_SWEEP_TRANSFORM.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			sweep,
    			time
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getSweepTransform].
    public static @Nullable Transform getSweepTransform(
    	SegmentAllocator allocator,
    	Sweep sweep,
    	float time
    ) {
    	MemorySegment segment = getSweepTransform(
    		allocator,
    		sweep.memorySegment(),
    		time
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new Transform(segment);
    }
    
    /// ```
    /// Compute the upper bound on time before two shapes penetrate. Time is represented as
    /// a fraction between [0,tMax]. This uses a swept separating axis and may miss some intermediate,
    /// non-tunneling collisions. If you change the time interval, you should call this function
    /// again.
    /// ```
    public static MemorySegment timeOfImpact(
    	SegmentAllocator allocator,
    	MemorySegment input
    ) {
    	MethodHandle method = B3_TIME_OF_IMPACT.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			input
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#timeOfImpact].
    public static @Nullable TOIOutput timeOfImpact(
    	SegmentAllocator allocator,
    	TOIInput input
    ) {
    	MemorySegment segment = timeOfImpact(
    		allocator,
    		input.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new TOIOutput(segment);
    }
    
}