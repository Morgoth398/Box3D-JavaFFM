/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.box3d.shapeCollision;

import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import volucris.bindings.box3d.geometry.Capsule;
import volucris.bindings.box3d.geometry.HullData;
import volucris.bindings.box3d.geometry.Sphere;
import volucris.bindings.box3d.math.Transform;
import volucris.bindings.box3d.math.Vec3;
import volucris.bindings.box3d.query.SimplexCache;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class ShapeCollision {

    private static final LazyConstant<MethodHandle> B3_COLLIDE_SPHERES;
    private static final LazyConstant<MethodHandle> B3_COLLIDE_CAPSULE_AND_SPHERE;
    private static final LazyConstant<MethodHandle> B3_COLLIDE_HULL_AND_SPHERE;
    private static final LazyConstant<MethodHandle> B3_COLLIDE_CAPSULES;
    private static final LazyConstant<MethodHandle> B3_COLLIDE_HULL_AND_CAPSULE;
    private static final LazyConstant<MethodHandle> B3_COLLIDE_HULLS;
    private static final LazyConstant<MethodHandle> B3_COLLIDE_CAPSULE_AND_TRIANGLE;
    private static final LazyConstant<MethodHandle> B3_COLLIDE_HULL_AND_TRIANGLE;
    private static final LazyConstant<MethodHandle> B3_COLLIDE_SPHERE_AND_TRIANGLE;

    static {
        //@formatter:off
        B3_COLLIDE_SPHERES = downcallHandleVoid("b3CollideSpheres", UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, Transform.LAYOUT);
        B3_COLLIDE_CAPSULE_AND_SPHERE = downcallHandleVoid("b3CollideCapsuleAndSphere", UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, Transform.LAYOUT);
        B3_COLLIDE_HULL_AND_SPHERE = downcallHandleVoid("b3CollideHullAndSphere", UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, Transform.LAYOUT, UNBOUNDED_ADDRESS);
        B3_COLLIDE_CAPSULES = downcallHandleVoid("b3CollideCapsules", UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, Transform.LAYOUT);
        B3_COLLIDE_HULL_AND_CAPSULE = downcallHandleVoid("b3CollideHullAndCapsule", UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, Transform.LAYOUT, UNBOUNDED_ADDRESS);
        B3_COLLIDE_HULLS = downcallHandleVoid("b3CollideHulls", UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, Transform.LAYOUT, UNBOUNDED_ADDRESS);
        B3_COLLIDE_CAPSULE_AND_TRIANGLE = downcallHandleVoid("b3CollideCapsuleAndTriangle", UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        B3_COLLIDE_HULL_AND_TRIANGLE = downcallHandleVoid("b3CollideHullAndTriangle", UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS, Vec3.LAYOUT, Vec3.LAYOUT, Vec3.LAYOUT, JAVA_INT, UNBOUNDED_ADDRESS);
        B3_COLLIDE_SPHERE_AND_TRIANGLE = downcallHandleVoid("b3CollideSphereAndTriangle", UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        //@formatter:on
    }

    private ShapeCollision() {
    }

    /// ```
    /// Collide two spheres.
    /// ```
    public static void collideSpheres(
    	MemorySegment manifold,
    	int capacity,
    	MemorySegment sphereA,
    	MemorySegment sphereB,
    	MemorySegment transformBtoA
    ) {
    	MethodHandle method = B3_COLLIDE_SPHERES.get();
    	try {
    		 method.invokeExact(
    			manifold,
    			capacity,
    			sphereA,
    			sphereB,
    			transformBtoA
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#collideSpheres].
    public static void collideSpheres(
    	LocalManifold manifold,
    	int capacity,
    	Sphere sphereA,
    	Sphere sphereB,
    	Transform transformBtoA
    ) {
    	collideSpheres(
    		manifold.memorySegment(),
    		capacity,
    		sphereA.memorySegment(),
    		sphereB.memorySegment(),
    		transformBtoA.memorySegment()
    	);
    }
    
    /// ```
    /// Collide a capsule and a sphere.
    /// ```
    public static void collideCapsuleAndSphere(
    	MemorySegment manifold,
    	int capacity,
    	MemorySegment capsuleA,
    	MemorySegment sphereB,
    	MemorySegment transformBtoA
    ) {
    	MethodHandle method = B3_COLLIDE_CAPSULE_AND_SPHERE.get();
    	try {
    		 method.invokeExact(
    			manifold,
    			capacity,
    			capsuleA,
    			sphereB,
    			transformBtoA
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#collideCapsuleAndSphere].
    public static void collideCapsuleAndSphere(
    	LocalManifold manifold,
    	int capacity,
    	Capsule capsuleA,
    	Sphere sphereB,
    	Transform transformBtoA
    ) {
    	collideCapsuleAndSphere(
    		manifold.memorySegment(),
    		capacity,
    		capsuleA.memorySegment(),
    		sphereB.memorySegment(),
    		transformBtoA.memorySegment()
    	);
    }
    
    /// ```
    /// Collide a hull and a sphere.
    /// ```
    public static void collideHullAndSphere(
    	MemorySegment manifold,
    	int capacity,
    	MemorySegment hullA,
    	MemorySegment sphereB,
    	MemorySegment transformBtoA,
    	MemorySegment cache
    ) {
    	MethodHandle method = B3_COLLIDE_HULL_AND_SPHERE.get();
    	try {
    		 method.invokeExact(
    			manifold,
    			capacity,
    			hullA,
    			sphereB,
    			transformBtoA,
    			cache
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#collideHullAndSphere].
    public static void collideHullAndSphere(
    	LocalManifold manifold,
    	int capacity,
    	HullData hullA,
    	Sphere sphereB,
    	Transform transformBtoA,
    	SimplexCache cache
    ) {
    	collideHullAndSphere(
    		manifold.memorySegment(),
    		capacity,
    		hullA.memorySegment(),
    		sphereB.memorySegment(),
    		transformBtoA.memorySegment(),
    		cache.memorySegment()
    	);
    }
    
    /// ```
    /// Collide two capsules.
    /// ```
    public static void collideCapsules(
    	MemorySegment manifold,
    	int capacity,
    	MemorySegment capsuleA,
    	MemorySegment capsuleB,
    	MemorySegment transformBtoA
    ) {
    	MethodHandle method = B3_COLLIDE_CAPSULES.get();
    	try {
    		 method.invokeExact(
    			manifold,
    			capacity,
    			capsuleA,
    			capsuleB,
    			transformBtoA
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#collideCapsules].
    public static void collideCapsules(
    	LocalManifold manifold,
    	int capacity,
    	Capsule capsuleA,
    	Capsule capsuleB,
    	Transform transformBtoA
    ) {
    	collideCapsules(
    		manifold.memorySegment(),
    		capacity,
    		capsuleA.memorySegment(),
    		capsuleB.memorySegment(),
    		transformBtoA.memorySegment()
    	);
    }
    
    /// ```
    /// Collide a hull and a capsule.
    /// ```
    public static void collideHullAndCapsule(
    	MemorySegment manifold,
    	int capacity,
    	MemorySegment hullA,
    	MemorySegment capsuleB,
    	MemorySegment transformBtoA,
    	MemorySegment cache
    ) {
    	MethodHandle method = B3_COLLIDE_HULL_AND_CAPSULE.get();
    	try {
    		 method.invokeExact(
    			manifold,
    			capacity,
    			hullA,
    			capsuleB,
    			transformBtoA,
    			cache
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#collideHullAndCapsule].
    public static void collideHullAndCapsule(
    	LocalManifold manifold,
    	int capacity,
    	HullData hullA,
    	Capsule capsuleB,
    	Transform transformBtoA,
    	SimplexCache cache
    ) {
    	collideHullAndCapsule(
    		manifold.memorySegment(),
    		capacity,
    		hullA.memorySegment(),
    		capsuleB.memorySegment(),
    		transformBtoA.memorySegment(),
    		cache.memorySegment()
    	);
    }
    
    /// ```
    /// Collide two hulls.
    /// ```
    public static void collideHulls(
    	MemorySegment manifold,
    	int capacity,
    	MemorySegment hullA,
    	MemorySegment hullB,
    	MemorySegment transformBtoA,
    	MemorySegment cache
    ) {
    	MethodHandle method = B3_COLLIDE_HULLS.get();
    	try {
    		 method.invokeExact(
    			manifold,
    			capacity,
    			hullA,
    			hullB,
    			transformBtoA,
    			cache
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#collideHulls].
    public static void collideHulls(
    	LocalManifold manifold,
    	int capacity,
    	HullData hullA,
    	HullData hullB,
    	Transform transformBtoA,
    	SATCache cache
    ) {
    	collideHulls(
    		manifold.memorySegment(),
    		capacity,
    		hullA.memorySegment(),
    		hullB.memorySegment(),
    		transformBtoA.memorySegment(),
    		cache.memorySegment()
    	);
    }
    
    /// ```
    /// Collide a capsule and a triangle.
    /// ```
    public static void collideCapsuleAndTriangle(
    	MemorySegment manifold,
    	int capacity,
    	MemorySegment capsuleA,
    	MemorySegment triangleB,
    	MemorySegment cache
    ) {
    	MethodHandle method = B3_COLLIDE_CAPSULE_AND_TRIANGLE.get();
    	try {
    		 method.invokeExact(
    			manifold,
    			capacity,
    			capsuleA,
    			triangleB,
    			cache
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#collideCapsuleAndTriangle].
    public static void collideCapsuleAndTriangle(
    	LocalManifold manifold,
    	int capacity,
    	Capsule capsuleA,
    	Vec3 triangleB,
    	SimplexCache cache
    ) {
    	collideCapsuleAndTriangle(
    		manifold.memorySegment(),
    		capacity,
    		capsuleA.memorySegment(),
    		triangleB.memorySegment(),
    		cache.memorySegment()
    	);
    }
    
    /// ```
    /// Collide a hull and a triangle.
    /// ```
    public static void collideHullAndTriangle(
    	MemorySegment manifold,
    	int capacity,
    	MemorySegment hullA,
    	MemorySegment v1,
    	MemorySegment v2,
    	MemorySegment v3,
    	int triangleFlags,
    	MemorySegment cache
    ) {
    	MethodHandle method = B3_COLLIDE_HULL_AND_TRIANGLE.get();
    	try {
    		 method.invokeExact(
    			manifold,
    			capacity,
    			hullA,
    			v1,
    			v2,
    			v3,
    			triangleFlags,
    			cache
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#collideHullAndTriangle].
    public static void collideHullAndTriangle(
    	LocalManifold manifold,
    	int capacity,
    	HullData hullA,
    	Vec3 v1,
    	Vec3 v2,
    	Vec3 v3,
    	int triangleFlags,
    	SATCache cache
    ) {
    	collideHullAndTriangle(
    		manifold.memorySegment(),
    		capacity,
    		hullA.memorySegment(),
    		v1.memorySegment(),
    		v2.memorySegment(),
    		v3.memorySegment(),
    		triangleFlags,
    		cache.memorySegment()
    	);
    }
    
    /// ```
    /// Collide a sphere and a triangle.
    /// ```
    public static void collideSphereAndTriangle(
    	MemorySegment manifold,
    	int capacity,
    	MemorySegment sphereA,
    	MemorySegment triangleB
    ) {
    	MethodHandle method = B3_COLLIDE_SPHERE_AND_TRIANGLE.get();
    	try {
    		 method.invokeExact(
    			manifold,
    			capacity,
    			sphereA,
    			triangleB
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#collideSphereAndTriangle].
    public static void collideSphereAndTriangle(
    	LocalManifold manifold,
    	int capacity,
    	Sphere sphereA,
    	Vec3 triangleB
    ) {
    	collideSphereAndTriangle(
    		manifold.memorySegment(),
    		capacity,
    		sphereA.memorySegment(),
    		triangleB.memorySegment()
    	);
    }
    
}