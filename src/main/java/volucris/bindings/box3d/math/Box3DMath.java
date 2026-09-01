/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.box3d.math;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.invoke.MethodHandle;
import org.jspecify.annotations.Nullable;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class Box3DMath {

    private static final LazyConstant<MethodHandle> B3_IS_VALID_FLOAT;
    private static final LazyConstant<MethodHandle> B3_ATAN2;
    private static final LazyConstant<MethodHandle> B3_COMPUTE_COS_SIN;
    private static final LazyConstant<MethodHandle> B3_MAKE_QUAT_FROM_MATRIX;
    private static final LazyConstant<MethodHandle> B3_COMPUTE_QUAT_BETWEEN_UNIT_VECTORS;
    private static final LazyConstant<MethodHandle> B3_STEINER;
    private static final LazyConstant<MethodHandle> B3_POINT_TO_SEGMENT_DISTANCE;
    private static final LazyConstant<MethodHandle> B3_LINE_DISTANCE;
    private static final LazyConstant<MethodHandle> B3_SEGMENT_DISTANCE;
    private static final LazyConstant<MethodHandle> B3_IS_VALID_VEC3;
    private static final LazyConstant<MethodHandle> B3_IS_VALID_QUAT;
    private static final LazyConstant<MethodHandle> B3_IS_VALID_TRANSFORM;
    private static final LazyConstant<MethodHandle> B3_IS_VALID_MATRIX3;
    private static final LazyConstant<MethodHandle> B3_IS_VALID_AABB;
    private static final LazyConstant<MethodHandle> B3_IS_BOUNDED_AABB;
    private static final LazyConstant<MethodHandle> B3_IS_SANE_AABB;
    private static final LazyConstant<MethodHandle> B3_IS_VALID_PLANE;
    private static final LazyConstant<MethodHandle> B3_IS_VALID_POSITION;
    private static final LazyConstant<MethodHandle> B3_IS_VALID_WORLD_TRANSFORM;

    static {
        //@formatter:off
        B3_IS_VALID_FLOAT = downcallHandle("b3IsValidFloat", JAVA_BOOLEAN, JAVA_FLOAT);
        B3_ATAN2 = downcallHandle("b3Atan2", JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT);
        B3_COMPUTE_COS_SIN = downcallHandle("b3ComputeCosSin", CosSin.LAYOUT, JAVA_FLOAT);
        B3_MAKE_QUAT_FROM_MATRIX = downcallHandle("b3MakeQuatFromMatrix", Quat.LAYOUT, UNBOUNDED_ADDRESS);
        B3_COMPUTE_QUAT_BETWEEN_UNIT_VECTORS = downcallHandle("b3ComputeQuatBetweenUnitVectors", Quat.LAYOUT, Vec3.LAYOUT, Vec3.LAYOUT);
        B3_STEINER = downcallHandle("b3Steiner", Matrix3.LAYOUT, JAVA_FLOAT, Vec3.LAYOUT);
        B3_POINT_TO_SEGMENT_DISTANCE = downcallHandle("b3PointToSegmentDistance", Vec3.LAYOUT, Vec3.LAYOUT, Vec3.LAYOUT, Vec3.LAYOUT);
        B3_LINE_DISTANCE = downcallHandle("b3LineDistance", SegmentDistanceResult.LAYOUT, Vec3.LAYOUT, Vec3.LAYOUT, Vec3.LAYOUT, Vec3.LAYOUT);
        B3_SEGMENT_DISTANCE = downcallHandle("b3SegmentDistance", SegmentDistanceResult.LAYOUT, Vec3.LAYOUT, Vec3.LAYOUT, Vec3.LAYOUT, Vec3.LAYOUT);
        B3_IS_VALID_VEC3 = downcallHandle("b3IsValidVec3", JAVA_BOOLEAN, Vec3.LAYOUT);
        B3_IS_VALID_QUAT = downcallHandle("b3IsValidQuat", JAVA_BOOLEAN, Quat.LAYOUT);
        B3_IS_VALID_TRANSFORM = downcallHandle("b3IsValidTransform", JAVA_BOOLEAN, Transform.LAYOUT);
        B3_IS_VALID_MATRIX3 = downcallHandle("b3IsValidMatrix3", JAVA_BOOLEAN, Matrix3.LAYOUT);
        B3_IS_VALID_AABB = downcallHandle("b3IsValidAABB", JAVA_BOOLEAN, AABB.LAYOUT);
        B3_IS_BOUNDED_AABB = downcallHandle("b3IsBoundedAABB", JAVA_BOOLEAN, AABB.LAYOUT);
        B3_IS_SANE_AABB = downcallHandle("b3IsSaneAABB", JAVA_BOOLEAN, AABB.LAYOUT);
        B3_IS_VALID_PLANE = downcallHandle("b3IsValidPlane", JAVA_BOOLEAN, Plane.LAYOUT);
        B3_IS_VALID_POSITION = downcallHandle("b3IsValidPosition", JAVA_BOOLEAN, Vec3.LAYOUT);
        B3_IS_VALID_WORLD_TRANSFORM = downcallHandle("b3IsValidWorldTransform", JAVA_BOOLEAN, Transform.LAYOUT);
        //@formatter:on
    }

    private Box3DMath() {
    }

    /// ```
    /// @return is this float valid (finite and not NaN).
    /// ```
    public static boolean isValidFloat(
    	float a
    ) {
    	MethodHandle method = B3_IS_VALID_FLOAT.get();
    	try {
    		return (boolean) method.invokeExact(
    			a
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Compute an approximate arctangent in the range [-pi, pi]
    /// This is hand coded for cross-platform determinism. The atan2f
    /// function in the standard library is not cross-platform deterministic.
    /// Accurate to around 0.0023 degrees.
    /// ```
    public static float atan2(
    	float y,
    	float x
    ) {
    	MethodHandle method = B3_ATAN2.get();
    	try {
    		return (float) method.invokeExact(
    			y,
    			x
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Compute the cosine and sine of an angle in radians. Implemented
    /// for cross-platform determinism.
    /// ```
    public static MemorySegment ncomputeCosSin(
    	SegmentAllocator allocator,
    	float radians
    ) {
    	MethodHandle method = B3_COMPUTE_COS_SIN.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			radians
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ncomputeCosSin].
    public static @Nullable CosSin computeCosSin(
    	SegmentAllocator allocator,
    	float radians
    ) {
    	MemorySegment segment = ncomputeCosSin(
    		allocator,
    		radians
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new CosSin(segment);
    }
    
    /// ```
    /// Extract a quaternion from a rotation matrix.
    /// ```
    public static MemorySegment makeQuatFromMatrix(
    	SegmentAllocator allocator,
    	MemorySegment m
    ) {
    	MethodHandle method = B3_MAKE_QUAT_FROM_MATRIX.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			m
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#makeQuatFromMatrix].
    public static @Nullable Quat makeQuatFromMatrix(
    	SegmentAllocator allocator,
    	Matrix3 m
    ) {
    	MemorySegment segment = makeQuatFromMatrix(
    		allocator,
    		m.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new Quat(segment);
    }
    
    /// ```
    /// Find a quaternion that rotates one vector to another.
    /// ```
    public static MemorySegment computeQuatBetweenUnitVectors(
    	SegmentAllocator allocator,
    	MemorySegment v1,
    	MemorySegment v2
    ) {
    	MethodHandle method = B3_COMPUTE_QUAT_BETWEEN_UNIT_VECTORS.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			v1,
    			v2
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#computeQuatBetweenUnitVectors].
    public static @Nullable Quat computeQuatBetweenUnitVectors(
    	SegmentAllocator allocator,
    	Vec3 v1,
    	Vec3 v2
    ) {
    	MemorySegment segment = computeQuatBetweenUnitVectors(
    		allocator,
    		v1.memorySegment(),
    		v2.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new Quat(segment);
    }
    
    /// ```
    /// Get the inertia tensor of an offset point.
    /// https://en.wikipedia.org/wiki/Parallel_axis_theorem
    /// ```
    public static MemorySegment steiner(
    	SegmentAllocator allocator,
    	float mass,
    	MemorySegment origin
    ) {
    	MethodHandle method = B3_STEINER.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			mass,
    			origin
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#steiner].
    public static @Nullable Matrix3 steiner(
    	SegmentAllocator allocator,
    	float mass,
    	Vec3 origin
    ) {
    	MemorySegment segment = steiner(
    		allocator,
    		mass,
    		origin.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new Matrix3(segment);
    }
    
    /// ```
    /// Compute the closest point on the segment a-b to the target q.
    /// ```
    public static MemorySegment pointToSegmentDistance(
    	SegmentAllocator allocator,
    	MemorySegment a,
    	MemorySegment b,
    	MemorySegment q
    ) {
    	MethodHandle method = B3_POINT_TO_SEGMENT_DISTANCE.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			a,
    			b,
    			q
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#pointToSegmentDistance].
    public static @Nullable Vec3 pointToSegmentDistance(
    	SegmentAllocator allocator,
    	Vec3 a,
    	Vec3 b,
    	Vec3 q
    ) {
    	MemorySegment segment = pointToSegmentDistance(
    		allocator,
    		a.memorySegment(),
    		b.memorySegment(),
    		q.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new Vec3(segment);
    }
    
    /// ```
    /// Compute the closest points on two infinite lines.
    /// ```
    public static MemorySegment lineDistance(
    	SegmentAllocator allocator,
    	MemorySegment p1,
    	MemorySegment d1,
    	MemorySegment p2,
    	MemorySegment d2
    ) {
    	MethodHandle method = B3_LINE_DISTANCE.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			p1,
    			d1,
    			p2,
    			d2
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#lineDistance].
    public static @Nullable SegmentDistanceResult lineDistance(
    	SegmentAllocator allocator,
    	Vec3 p1,
    	Vec3 d1,
    	Vec3 p2,
    	Vec3 d2
    ) {
    	MemorySegment segment = lineDistance(
    		allocator,
    		p1.memorySegment(),
    		d1.memorySegment(),
    		p2.memorySegment(),
    		d2.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new SegmentDistanceResult(segment);
    }
    
    /// ```
    /// Compute the closest points on two line segments.
    /// ```
    public static MemorySegment segmentDistance(
    	SegmentAllocator allocator,
    	MemorySegment p1,
    	MemorySegment q1,
    	MemorySegment p2,
    	MemorySegment q2
    ) {
    	MethodHandle method = B3_SEGMENT_DISTANCE.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			p1,
    			q1,
    			p2,
    			q2
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#segmentDistance].
    public static @Nullable SegmentDistanceResult segmentDistance(
    	SegmentAllocator allocator,
    	Vec3 p1,
    	Vec3 q1,
    	Vec3 p2,
    	Vec3 q2
    ) {
    	MemorySegment segment = segmentDistance(
    		allocator,
    		p1.memorySegment(),
    		q1.memorySegment(),
    		p2.memorySegment(),
    		q2.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new SegmentDistanceResult(segment);
    }
    
    /// ```
    /// Is this a valid vector? Not NaN or infinity.
    /// ```
    public static boolean isValidVec3(
    	MemorySegment a
    ) {
    	MethodHandle method = B3_IS_VALID_VEC3.get();
    	try {
    		return (boolean) method.invokeExact(
    			a
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#isValidVec3].
    public static boolean isValidVec3(
    	Vec3 a
    ) {
    	return isValidVec3(
    		a.memorySegment()
    	);
    }
    
    /// ```
    /// Is this a valid quaternion? Not NaN or infinity. Is normalized.
    /// ```
    public static boolean isValidQuat(
    	MemorySegment q
    ) {
    	MethodHandle method = B3_IS_VALID_QUAT.get();
    	try {
    		return (boolean) method.invokeExact(
    			q
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#isValidQuat].
    public static boolean isValidQuat(
    	Quat q
    ) {
    	return isValidQuat(
    		q.memorySegment()
    	);
    }
    
    /// ```
    /// Is this a valid transform? Not NaN or infinity. Is normalized.
    /// ```
    public static boolean isValidTransform(
    	MemorySegment a
    ) {
    	MethodHandle method = B3_IS_VALID_TRANSFORM.get();
    	try {
    		return (boolean) method.invokeExact(
    			a
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#isValidTransform].
    public static boolean isValidTransform(
    	Transform a
    ) {
    	return isValidTransform(
    		a.memorySegment()
    	);
    }
    
    /// ```
    /// Is this a valid matrix? Not NaN or infinity.
    /// ```
    public static boolean isValidMatrix3(
    	MemorySegment a
    ) {
    	MethodHandle method = B3_IS_VALID_MATRIX3.get();
    	try {
    		return (boolean) method.invokeExact(
    			a
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#isValidMatrix3].
    public static boolean isValidMatrix3(
    	Matrix3 a
    ) {
    	return isValidMatrix3(
    		a.memorySegment()
    	);
    }
    
    /// ```
    /// Is this a valid bounding box? Not Nan or infinity. Upper bound greater than or equal to lower bound.
    /// ```
    public static boolean isValidAABB(
    	MemorySegment a
    ) {
    	MethodHandle method = B3_IS_VALID_AABB.get();
    	try {
    		return (boolean) method.invokeExact(
    			a
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#isValidAABB].
    public static boolean isValidAABB(
    	AABB a
    ) {
    	return isValidAABB(
    		a.memorySegment()
    	);
    }
    
    /// ```
    /// Is this AABB reasonably close to the origin? See B3_HUGE.
    /// ```
    public static boolean isBoundedAABB(
    	MemorySegment a
    ) {
    	MethodHandle method = B3_IS_BOUNDED_AABB.get();
    	try {
    		return (boolean) method.invokeExact(
    			a
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#isBoundedAABB].
    public static boolean isBoundedAABB(
    	AABB a
    ) {
    	return isBoundedAABB(
    		a.memorySegment()
    	);
    }
    
    /// ```
    /// Is this AABB valid and reasonable?
    /// ```
    public static boolean isSaneAABB(
    	MemorySegment a
    ) {
    	MethodHandle method = B3_IS_SANE_AABB.get();
    	try {
    		return (boolean) method.invokeExact(
    			a
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#isSaneAABB].
    public static boolean isSaneAABB(
    	AABB a
    ) {
    	return isSaneAABB(
    		a.memorySegment()
    	);
    }
    
    /// ```
    /// Is this a valid plane? Normal is a unit vector. Not Nan or infinity.
    /// ```
    public static boolean isValidPlane(
    	MemorySegment a
    ) {
    	MethodHandle method = B3_IS_VALID_PLANE.get();
    	try {
    		return (boolean) method.invokeExact(
    			a
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#isValidPlane].
    public static boolean isValidPlane(
    	Plane a
    ) {
    	return isValidPlane(
    		a.memorySegment()
    	);
    }
    
    /// ```
    /// Is this a valid world position? Not NaN or infinity.
    /// ```
    public static boolean isValidPosition(
    	MemorySegment p
    ) {
    	MethodHandle method = B3_IS_VALID_POSITION.get();
    	try {
    		return (boolean) method.invokeExact(
    			p
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#isValidPosition].
    public static boolean isValidPosition(
    	Vec3 p
    ) {
    	return isValidPosition(
    		p.memorySegment()
    	);
    }
    
    /// ```
    /// Is this a valid world transform? Not NaN or infinity. Rotation is normalized.
    /// ```
    public static boolean isValidWorldTransform(
    	MemorySegment t
    ) {
    	MethodHandle method = B3_IS_VALID_WORLD_TRANSFORM.get();
    	try {
    		return (boolean) method.invokeExact(
    			t
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#isValidWorldTransform].
    public static boolean isValidWorldTransform(
    	Transform t
    ) {
    	return isValidWorldTransform(
    		t.memorySegment()
    	);
    }
    
}