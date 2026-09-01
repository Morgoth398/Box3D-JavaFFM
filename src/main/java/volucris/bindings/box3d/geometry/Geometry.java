/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.box3d.geometry;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.invoke.MethodHandle;
import org.jspecify.annotations.Nullable;
import volucris.bindings.box3d.math.AABB;
import volucris.bindings.box3d.math.Transform;
import volucris.bindings.box3d.math.Vec3;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class Geometry {

    private static final LazyConstant<MethodHandle> B3_COMPUTE_SPHERE_MASS;
    private static final LazyConstant<MethodHandle> B3_COMPUTE_CAPSULE_MASS;
    private static final LazyConstant<MethodHandle> B3_COMPUTE_HULL_MASS;
    private static final LazyConstant<MethodHandle> B3_COMPUTE_SPHERE_AABB;
    private static final LazyConstant<MethodHandle> B3_COMPUTE_CAPSULE_AABB;
    private static final LazyConstant<MethodHandle> B3_COMPUTE_HULL_AABB;
    private static final LazyConstant<MethodHandle> B3_COMPUTE_MESH_AABB;
    private static final LazyConstant<MethodHandle> B3_COMPUTE_HEIGHT_FIELD_AABB;
    private static final LazyConstant<MethodHandle> B3_COMPUTE_COMPOUND_AABB;

    static {
        //@formatter:off
        B3_COMPUTE_SPHERE_MASS = downcallHandle("b3ComputeSphereMass", MassData.LAYOUT, UNBOUNDED_ADDRESS, JAVA_FLOAT);
        B3_COMPUTE_CAPSULE_MASS = downcallHandle("b3ComputeCapsuleMass", MassData.LAYOUT, UNBOUNDED_ADDRESS, JAVA_FLOAT);
        B3_COMPUTE_HULL_MASS = downcallHandle("b3ComputeHullMass", MassData.LAYOUT, UNBOUNDED_ADDRESS, JAVA_FLOAT);
        B3_COMPUTE_SPHERE_AABB = downcallHandle("b3ComputeSphereAABB", AABB.LAYOUT, UNBOUNDED_ADDRESS, Transform.LAYOUT);
        B3_COMPUTE_CAPSULE_AABB = downcallHandle("b3ComputeCapsuleAABB", AABB.LAYOUT, UNBOUNDED_ADDRESS, Transform.LAYOUT);
        B3_COMPUTE_HULL_AABB = downcallHandle("b3ComputeHullAABB", AABB.LAYOUT, UNBOUNDED_ADDRESS, Transform.LAYOUT);
        B3_COMPUTE_MESH_AABB = downcallHandle("b3ComputeMeshAABB", AABB.LAYOUT, UNBOUNDED_ADDRESS, Transform.LAYOUT, Vec3.LAYOUT);
        B3_COMPUTE_HEIGHT_FIELD_AABB = downcallHandle("b3ComputeHeightFieldAABB", AABB.LAYOUT, UNBOUNDED_ADDRESS, Transform.LAYOUT);
        B3_COMPUTE_COMPOUND_AABB = downcallHandle("b3ComputeCompoundAABB", AABB.LAYOUT, UNBOUNDED_ADDRESS, Transform.LAYOUT);
        //@formatter:on
    }

    private Geometry() {
    }

    /// ```
    /// Compute mass properties of a sphere
    /// ```
    public static MemorySegment computeSphereMass(
    	SegmentAllocator allocator,
    	MemorySegment shape,
    	float density
    ) {
    	MethodHandle method = B3_COMPUTE_SPHERE_MASS.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			shape,
    			density
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#computeSphereMass].
    public static @Nullable MassData computeSphereMass(
    	SegmentAllocator allocator,
    	Sphere shape,
    	float density
    ) {
    	MemorySegment segment = computeSphereMass(
    		allocator,
    		shape.memorySegment(),
    		density
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new MassData(segment);
    }
    
    /// ```
    /// Compute mass properties of a capsule
    /// ```
    public static MemorySegment computeCapsuleMass(
    	SegmentAllocator allocator,
    	MemorySegment shape,
    	float density
    ) {
    	MethodHandle method = B3_COMPUTE_CAPSULE_MASS.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			shape,
    			density
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#computeCapsuleMass].
    public static @Nullable MassData computeCapsuleMass(
    	SegmentAllocator allocator,
    	Capsule shape,
    	float density
    ) {
    	MemorySegment segment = computeCapsuleMass(
    		allocator,
    		shape.memorySegment(),
    		density
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new MassData(segment);
    }
    
    /// ```
    /// Compute mass properties of a hull
    /// ```
    public static MemorySegment computeHullMass(
    	SegmentAllocator allocator,
    	MemorySegment shape,
    	float density
    ) {
    	MethodHandle method = B3_COMPUTE_HULL_MASS.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			shape,
    			density
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#computeHullMass].
    public static @Nullable MassData computeHullMass(
    	SegmentAllocator allocator,
    	HullData shape,
    	float density
    ) {
    	MemorySegment segment = computeHullMass(
    		allocator,
    		shape.memorySegment(),
    		density
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new MassData(segment);
    }
    
    /// ```
    /// Compute the bounding box of a transformed sphere
    /// ```
    public static MemorySegment computeSphereAABB(
    	SegmentAllocator allocator,
    	MemorySegment shape,
    	MemorySegment transform
    ) {
    	MethodHandle method = B3_COMPUTE_SPHERE_AABB.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			shape,
    			transform
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#computeSphereAABB].
    public static @Nullable AABB computeSphereAABB(
    	SegmentAllocator allocator,
    	Sphere shape,
    	Transform transform
    ) {
    	MemorySegment segment = computeSphereAABB(
    		allocator,
    		shape.memorySegment(),
    		transform.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new AABB(segment);
    }
    
    /// ```
    /// Compute the bounding box of a transformed capsule
    /// ```
    public static MemorySegment computeCapsuleAABB(
    	SegmentAllocator allocator,
    	MemorySegment shape,
    	MemorySegment transform
    ) {
    	MethodHandle method = B3_COMPUTE_CAPSULE_AABB.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			shape,
    			transform
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#computeCapsuleAABB].
    public static @Nullable AABB computeCapsuleAABB(
    	SegmentAllocator allocator,
    	Capsule shape,
    	Transform transform
    ) {
    	MemorySegment segment = computeCapsuleAABB(
    		allocator,
    		shape.memorySegment(),
    		transform.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new AABB(segment);
    }
    
    /// ```
    /// Compute the bounding box of a transformed hull
    /// ```
    public static MemorySegment computeHullAABB(
    	SegmentAllocator allocator,
    	MemorySegment shape,
    	MemorySegment transform
    ) {
    	MethodHandle method = B3_COMPUTE_HULL_AABB.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			shape,
    			transform
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#computeHullAABB].
    public static @Nullable AABB computeHullAABB(
    	SegmentAllocator allocator,
    	HullData shape,
    	Transform transform
    ) {
    	MemorySegment segment = computeHullAABB(
    		allocator,
    		shape.memorySegment(),
    		transform.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new AABB(segment);
    }
    
    /// ```
    /// Compute the bounding box of a transformed mesh. Scale may be non-uniform and have negative components.
    /// ```
    public static MemorySegment computeMeshAABB(
    	SegmentAllocator allocator,
    	MemorySegment shape,
    	MemorySegment transform,
    	MemorySegment scale
    ) {
    	MethodHandle method = B3_COMPUTE_MESH_AABB.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			shape,
    			transform,
    			scale
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#computeMeshAABB].
    public static @Nullable AABB computeMeshAABB(
    	SegmentAllocator allocator,
    	MeshData shape,
    	Transform transform,
    	Vec3 scale
    ) {
    	MemorySegment segment = computeMeshAABB(
    		allocator,
    		shape.memorySegment(),
    		transform.memorySegment(),
    		scale.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new AABB(segment);
    }
    
    /// ```
    /// Compute the bounding box of a transformed height-field
    /// ```
    public static MemorySegment computeHeightFieldAABB(
    	SegmentAllocator allocator,
    	MemorySegment shape,
    	MemorySegment transform
    ) {
    	MethodHandle method = B3_COMPUTE_HEIGHT_FIELD_AABB.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			shape,
    			transform
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#computeHeightFieldAABB].
    public static @Nullable AABB computeHeightFieldAABB(
    	SegmentAllocator allocator,
    	HeightFieldData shape,
    	Transform transform
    ) {
    	MemorySegment segment = computeHeightFieldAABB(
    		allocator,
    		shape.memorySegment(),
    		transform.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new AABB(segment);
    }
    
    /// ```
    /// Compute the bounding box of a compound
    /// ```
    public static MemorySegment computeCompoundAABB(
    	SegmentAllocator allocator,
    	MemorySegment shape,
    	MemorySegment transform
    ) {
    	MethodHandle method = B3_COMPUTE_COMPOUND_AABB.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			shape,
    			transform
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#computeCompoundAABB].
    public static @Nullable AABB computeCompoundAABB(
    	SegmentAllocator allocator,
    	CompoundData shape,
    	Transform transform
    ) {
    	MemorySegment segment = computeCompoundAABB(
    		allocator,
    		shape.memorySegment(),
    		transform.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new AABB(segment);
    }
    
}