/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.box3d.body;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.invoke.MethodHandle;
import org.jspecify.annotations.Nullable;
import volucris.bindings.box3d.characterMover.BodyPlaneResult;
import volucris.bindings.box3d.events.ContactData;
import volucris.bindings.box3d.geometry.Capsule;
import volucris.bindings.box3d.geometry.MassData;
import volucris.bindings.box3d.joint.JointId;
import volucris.bindings.box3d.math.AABB;
import volucris.bindings.box3d.math.Matrix3;
import volucris.bindings.box3d.math.Quat;
import volucris.bindings.box3d.math.Transform;
import volucris.bindings.box3d.math.Vec3;
import volucris.bindings.box3d.query.BodyCastResult;
import volucris.bindings.box3d.query.QueryFilter;
import volucris.bindings.box3d.query.ShapeProxy;
import volucris.bindings.box3d.shape.ShapeId;
import volucris.bindings.box3d.world.WorldId;
import volucris.bindings.core.MemoryStack;
import volucris.bindings.core.NativeByteArray;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class Body {

    private static final LazyConstant<MethodHandle> B3_CREATE_BODY;
    private static final LazyConstant<MethodHandle> B3_DESTROY_BODY;
    private static final LazyConstant<MethodHandle> B3_BODY_IS_VALID;
    private static final LazyConstant<MethodHandle> B3_BODY_GET_TYPE;
    private static final LazyConstant<MethodHandle> B3_BODY_SET_TYPE;
    private static final LazyConstant<MethodHandle> B3_BODY_SET_NAME;
    private static final LazyConstant<MethodHandle> B3_BODY_GET_NAME;
    private static final LazyConstant<MethodHandle> B3_BODY_SET_USER_DATA;
    private static final LazyConstant<MethodHandle> B3_BODY_GET_USER_DATA;
    private static final LazyConstant<MethodHandle> B3_BODY_GET_POSITION;
    private static final LazyConstant<MethodHandle> B3_BODY_GET_ROTATION;
    private static final LazyConstant<MethodHandle> B3_BODY_GET_TRANSFORM;
    private static final LazyConstant<MethodHandle> B3_BODY_SET_TRANSFORM;
    private static final LazyConstant<MethodHandle> B3_BODY_GET_LOCAL_POINT;
    private static final LazyConstant<MethodHandle> B3_BODY_GET_WORLD_POINT;
    private static final LazyConstant<MethodHandle> B3_BODY_GET_LOCAL_VECTOR;
    private static final LazyConstant<MethodHandle> B3_BODY_GET_WORLD_VECTOR;
    private static final LazyConstant<MethodHandle> B3_BODY_GET_LINEAR_VELOCITY;
    private static final LazyConstant<MethodHandle> B3_BODY_GET_ANGULAR_VELOCITY;
    private static final LazyConstant<MethodHandle> B3_BODY_SET_LINEAR_VELOCITY;
    private static final LazyConstant<MethodHandle> B3_BODY_SET_ANGULAR_VELOCITY;
    private static final LazyConstant<MethodHandle> B3_BODY_SET_TARGET_TRANSFORM;
    private static final LazyConstant<MethodHandle> B3_BODY_GET_LOCAL_POINT_VELOCITY;
    private static final LazyConstant<MethodHandle> B3_BODY_GET_WORLD_POINT_VELOCITY;
    private static final LazyConstant<MethodHandle> B3_BODY_APPLY_FORCE;
    private static final LazyConstant<MethodHandle> B3_BODY_APPLY_FORCE_TO_CENTER;
    private static final LazyConstant<MethodHandle> B3_BODY_APPLY_TORQUE;
    private static final LazyConstant<MethodHandle> B3_BODY_APPLY_LINEAR_IMPULSE;
    private static final LazyConstant<MethodHandle> B3_BODY_APPLY_LINEAR_IMPULSE_TO_CENTER;
    private static final LazyConstant<MethodHandle> B3_BODY_APPLY_ANGULAR_IMPULSE;
    private static final LazyConstant<MethodHandle> B3_BODY_GET_MASS;
    private static final LazyConstant<MethodHandle> B3_BODY_GET_LOCAL_ROTATIONAL_INERTIA;
    private static final LazyConstant<MethodHandle> B3_BODY_GET_INVERSE_MASS;
    private static final LazyConstant<MethodHandle> B3_BODY_GET_WORLD_INVERSE_ROTATIONAL_INERTIA;
    private static final LazyConstant<MethodHandle> B3_BODY_GET_LOCAL_CENTER_OF_MASS;
    private static final LazyConstant<MethodHandle> B3_BODY_GET_WORLD_CENTER_OF_MASS;
    private static final LazyConstant<MethodHandle> B3_BODY_SET_MASS_DATA;
    private static final LazyConstant<MethodHandle> B3_BODY_GET_MASS_DATA;
    private static final LazyConstant<MethodHandle> B3_BODY_APPLY_MASS_FROM_SHAPES;
    private static final LazyConstant<MethodHandle> B3_BODY_SET_LINEAR_DAMPING;
    private static final LazyConstant<MethodHandle> B3_BODY_GET_LINEAR_DAMPING;
    private static final LazyConstant<MethodHandle> B3_BODY_SET_ANGULAR_DAMPING;
    private static final LazyConstant<MethodHandle> B3_BODY_GET_ANGULAR_DAMPING;
    private static final LazyConstant<MethodHandle> B3_BODY_SET_GRAVITY_SCALE;
    private static final LazyConstant<MethodHandle> B3_BODY_GET_GRAVITY_SCALE;
    private static final LazyConstant<MethodHandle> B3_BODY_IS_AWAKE;
    private static final LazyConstant<MethodHandle> B3_BODY_SET_AWAKE;
    private static final LazyConstant<MethodHandle> B3_BODY_ENABLE_SLEEP;
    private static final LazyConstant<MethodHandle> B3_BODY_IS_SLEEP_ENABLED;
    private static final LazyConstant<MethodHandle> B3_BODY_SET_SLEEP_THRESHOLD;
    private static final LazyConstant<MethodHandle> B3_BODY_GET_SLEEP_THRESHOLD;
    private static final LazyConstant<MethodHandle> B3_BODY_IS_ENABLED;
    private static final LazyConstant<MethodHandle> B3_BODY_DISABLE;
    private static final LazyConstant<MethodHandle> B3_BODY_ENABLE;
    private static final LazyConstant<MethodHandle> B3_BODY_SET_MOTION_LOCKS;
    private static final LazyConstant<MethodHandle> B3_BODY_GET_MOTION_LOCKS;
    private static final LazyConstant<MethodHandle> B3_BODY_SET_BULLET;
    private static final LazyConstant<MethodHandle> B3_BODY_IS_BULLET;
    private static final LazyConstant<MethodHandle> B3_BODY_ENABLE_CONTACT_RECYCLING;
    private static final LazyConstant<MethodHandle> B3_BODY_IS_CONTACT_RECYCLING_ENABLED;
    private static final LazyConstant<MethodHandle> B3_BODY_ENABLE_HIT_EVENTS;
    private static final LazyConstant<MethodHandle> B3_BODY_GET_WORLD;
    private static final LazyConstant<MethodHandle> B3_BODY_GET_SHAPE_COUNT;
    private static final LazyConstant<MethodHandle> B3_BODY_GET_SHAPES;
    private static final LazyConstant<MethodHandle> B3_BODY_GET_JOINT_COUNT;
    private static final LazyConstant<MethodHandle> B3_BODY_GET_JOINTS;
    private static final LazyConstant<MethodHandle> B3_BODY_GET_CONTACT_CAPACITY;
    private static final LazyConstant<MethodHandle> B3_BODY_GET_CONTACT_DATA;
    private static final LazyConstant<MethodHandle> B3_BODY_COMPUTE_AABB;
    private static final LazyConstant<MethodHandle> B3_BODY_GET_CLOSEST_POINT;
    private static final LazyConstant<MethodHandle> B3_BODY_CAST_RAY;
    private static final LazyConstant<MethodHandle> B3_BODY_CAST_SHAPE;
    private static final LazyConstant<MethodHandle> B3_BODY_OVERLAP_SHAPE;
    private static final LazyConstant<MethodHandle> B3_BODY_COLLIDE_MOVER;

    static {
        //@formatter:off
        B3_CREATE_BODY = downcallHandle("b3CreateBody", BodyId.LAYOUT, WorldId.LAYOUT, UNBOUNDED_ADDRESS);
        B3_DESTROY_BODY = downcallHandleVoid("b3DestroyBody", BodyId.LAYOUT);
        B3_BODY_IS_VALID = downcallHandle("b3Body_IsValid", JAVA_BOOLEAN, BodyId.LAYOUT);
        B3_BODY_GET_TYPE = downcallHandle("b3Body_GetType", JAVA_INT, BodyId.LAYOUT);
        B3_BODY_SET_TYPE = downcallHandleVoid("b3Body_SetType", BodyId.LAYOUT, JAVA_INT);
        B3_BODY_SET_NAME = downcallHandleVoid("b3Body_SetName", BodyId.LAYOUT, UNBOUNDED_ADDRESS);
        B3_BODY_GET_NAME = downcallHandle("b3Body_GetName", UNBOUNDED_ADDRESS, BodyId.LAYOUT);
        B3_BODY_SET_USER_DATA = downcallHandleVoid("b3Body_SetUserData", BodyId.LAYOUT, UNBOUNDED_ADDRESS);
        B3_BODY_GET_USER_DATA = downcallHandle("b3Body_GetUserData", UNBOUNDED_ADDRESS, BodyId.LAYOUT);
        B3_BODY_GET_POSITION = downcallHandle("b3Body_GetPosition", Vec3.LAYOUT, BodyId.LAYOUT);
        B3_BODY_GET_ROTATION = downcallHandle("b3Body_GetRotation", Quat.LAYOUT, BodyId.LAYOUT);
        B3_BODY_GET_TRANSFORM = downcallHandle("b3Body_GetTransform", Transform.LAYOUT, BodyId.LAYOUT);
        B3_BODY_SET_TRANSFORM = downcallHandleVoid("b3Body_SetTransform", BodyId.LAYOUT, Vec3.LAYOUT, Quat.LAYOUT);
        B3_BODY_GET_LOCAL_POINT = downcallHandle("b3Body_GetLocalPoint", Vec3.LAYOUT, BodyId.LAYOUT, Vec3.LAYOUT);
        B3_BODY_GET_WORLD_POINT = downcallHandle("b3Body_GetWorldPoint", Vec3.LAYOUT, BodyId.LAYOUT, Vec3.LAYOUT);
        B3_BODY_GET_LOCAL_VECTOR = downcallHandle("b3Body_GetLocalVector", Vec3.LAYOUT, BodyId.LAYOUT, Vec3.LAYOUT);
        B3_BODY_GET_WORLD_VECTOR = downcallHandle("b3Body_GetWorldVector", Vec3.LAYOUT, BodyId.LAYOUT, Vec3.LAYOUT);
        B3_BODY_GET_LINEAR_VELOCITY = downcallHandle("b3Body_GetLinearVelocity", Vec3.LAYOUT, BodyId.LAYOUT);
        B3_BODY_GET_ANGULAR_VELOCITY = downcallHandle("b3Body_GetAngularVelocity", Vec3.LAYOUT, BodyId.LAYOUT);
        B3_BODY_SET_LINEAR_VELOCITY = downcallHandleVoid("b3Body_SetLinearVelocity", BodyId.LAYOUT, Vec3.LAYOUT);
        B3_BODY_SET_ANGULAR_VELOCITY = downcallHandleVoid("b3Body_SetAngularVelocity", BodyId.LAYOUT, Vec3.LAYOUT);
        B3_BODY_SET_TARGET_TRANSFORM = downcallHandleVoid("b3Body_SetTargetTransform", BodyId.LAYOUT, Transform.LAYOUT, JAVA_FLOAT, JAVA_BOOLEAN);
        B3_BODY_GET_LOCAL_POINT_VELOCITY = downcallHandle("b3Body_GetLocalPointVelocity", Vec3.LAYOUT, BodyId.LAYOUT, Vec3.LAYOUT);
        B3_BODY_GET_WORLD_POINT_VELOCITY = downcallHandle("b3Body_GetWorldPointVelocity", Vec3.LAYOUT, BodyId.LAYOUT, Vec3.LAYOUT);
        B3_BODY_APPLY_FORCE = downcallHandleVoid("b3Body_ApplyForce", BodyId.LAYOUT, Vec3.LAYOUT, Vec3.LAYOUT, JAVA_BOOLEAN);
        B3_BODY_APPLY_FORCE_TO_CENTER = downcallHandleVoid("b3Body_ApplyForceToCenter", BodyId.LAYOUT, Vec3.LAYOUT, JAVA_BOOLEAN);
        B3_BODY_APPLY_TORQUE = downcallHandleVoid("b3Body_ApplyTorque", BodyId.LAYOUT, Vec3.LAYOUT, JAVA_BOOLEAN);
        B3_BODY_APPLY_LINEAR_IMPULSE = downcallHandleVoid("b3Body_ApplyLinearImpulse", BodyId.LAYOUT, Vec3.LAYOUT, Vec3.LAYOUT, JAVA_BOOLEAN);
        B3_BODY_APPLY_LINEAR_IMPULSE_TO_CENTER = downcallHandleVoid("b3Body_ApplyLinearImpulseToCenter", BodyId.LAYOUT, Vec3.LAYOUT, JAVA_BOOLEAN);
        B3_BODY_APPLY_ANGULAR_IMPULSE = downcallHandleVoid("b3Body_ApplyAngularImpulse", BodyId.LAYOUT, Vec3.LAYOUT, JAVA_BOOLEAN);
        B3_BODY_GET_MASS = downcallHandle("b3Body_GetMass", JAVA_FLOAT, BodyId.LAYOUT);
        B3_BODY_GET_LOCAL_ROTATIONAL_INERTIA = downcallHandle("b3Body_GetLocalRotationalInertia", Matrix3.LAYOUT, BodyId.LAYOUT);
        B3_BODY_GET_INVERSE_MASS = downcallHandle("b3Body_GetInverseMass", JAVA_FLOAT, BodyId.LAYOUT);
        B3_BODY_GET_WORLD_INVERSE_ROTATIONAL_INERTIA = downcallHandle("b3Body_GetWorldInverseRotationalInertia", Matrix3.LAYOUT, BodyId.LAYOUT);
        B3_BODY_GET_LOCAL_CENTER_OF_MASS = downcallHandle("b3Body_GetLocalCenterOfMass", Vec3.LAYOUT, BodyId.LAYOUT);
        B3_BODY_GET_WORLD_CENTER_OF_MASS = downcallHandle("b3Body_GetWorldCenterOfMass", Vec3.LAYOUT, BodyId.LAYOUT);
        B3_BODY_SET_MASS_DATA = downcallHandleVoid("b3Body_SetMassData", BodyId.LAYOUT, MassData.LAYOUT);
        B3_BODY_GET_MASS_DATA = downcallHandle("b3Body_GetMassData", MassData.LAYOUT, BodyId.LAYOUT);
        B3_BODY_APPLY_MASS_FROM_SHAPES = downcallHandleVoid("b3Body_ApplyMassFromShapes", BodyId.LAYOUT);
        B3_BODY_SET_LINEAR_DAMPING = downcallHandleVoid("b3Body_SetLinearDamping", BodyId.LAYOUT, JAVA_FLOAT);
        B3_BODY_GET_LINEAR_DAMPING = downcallHandle("b3Body_GetLinearDamping", JAVA_FLOAT, BodyId.LAYOUT);
        B3_BODY_SET_ANGULAR_DAMPING = downcallHandleVoid("b3Body_SetAngularDamping", BodyId.LAYOUT, JAVA_FLOAT);
        B3_BODY_GET_ANGULAR_DAMPING = downcallHandle("b3Body_GetAngularDamping", JAVA_FLOAT, BodyId.LAYOUT);
        B3_BODY_SET_GRAVITY_SCALE = downcallHandleVoid("b3Body_SetGravityScale", BodyId.LAYOUT, JAVA_FLOAT);
        B3_BODY_GET_GRAVITY_SCALE = downcallHandle("b3Body_GetGravityScale", JAVA_FLOAT, BodyId.LAYOUT);
        B3_BODY_IS_AWAKE = downcallHandle("b3Body_IsAwake", JAVA_BOOLEAN, BodyId.LAYOUT);
        B3_BODY_SET_AWAKE = downcallHandleVoid("b3Body_SetAwake", BodyId.LAYOUT, JAVA_BOOLEAN);
        B3_BODY_ENABLE_SLEEP = downcallHandleVoid("b3Body_EnableSleep", BodyId.LAYOUT, JAVA_BOOLEAN);
        B3_BODY_IS_SLEEP_ENABLED = downcallHandle("b3Body_IsSleepEnabled", JAVA_BOOLEAN, BodyId.LAYOUT);
        B3_BODY_SET_SLEEP_THRESHOLD = downcallHandleVoid("b3Body_SetSleepThreshold", BodyId.LAYOUT, JAVA_FLOAT);
        B3_BODY_GET_SLEEP_THRESHOLD = downcallHandle("b3Body_GetSleepThreshold", JAVA_FLOAT, BodyId.LAYOUT);
        B3_BODY_IS_ENABLED = downcallHandle("b3Body_IsEnabled", JAVA_BOOLEAN, BodyId.LAYOUT);
        B3_BODY_DISABLE = downcallHandleVoid("b3Body_Disable", BodyId.LAYOUT);
        B3_BODY_ENABLE = downcallHandleVoid("b3Body_Enable", BodyId.LAYOUT);
        B3_BODY_SET_MOTION_LOCKS = downcallHandleVoid("b3Body_SetMotionLocks", BodyId.LAYOUT, MotionLocks.LAYOUT);
        B3_BODY_GET_MOTION_LOCKS = downcallHandle("b3Body_GetMotionLocks", MotionLocks.LAYOUT, BodyId.LAYOUT);
        B3_BODY_SET_BULLET = downcallHandleVoid("b3Body_SetBullet", BodyId.LAYOUT, JAVA_BOOLEAN);
        B3_BODY_IS_BULLET = downcallHandle("b3Body_IsBullet", JAVA_BOOLEAN, BodyId.LAYOUT);
        B3_BODY_ENABLE_CONTACT_RECYCLING = downcallHandleVoid("b3Body_EnableContactRecycling", BodyId.LAYOUT, JAVA_BOOLEAN);
        B3_BODY_IS_CONTACT_RECYCLING_ENABLED = downcallHandle("b3Body_IsContactRecyclingEnabled", JAVA_BOOLEAN, BodyId.LAYOUT);
        B3_BODY_ENABLE_HIT_EVENTS = downcallHandleVoid("b3Body_EnableHitEvents", BodyId.LAYOUT, JAVA_BOOLEAN);
        B3_BODY_GET_WORLD = downcallHandle("b3Body_GetWorld", WorldId.LAYOUT, BodyId.LAYOUT);
        B3_BODY_GET_SHAPE_COUNT = downcallHandle("b3Body_GetShapeCount", JAVA_INT, BodyId.LAYOUT);
        B3_BODY_GET_SHAPES = downcallHandle("b3Body_GetShapes", JAVA_INT, BodyId.LAYOUT, UNBOUNDED_ADDRESS, JAVA_INT);
        B3_BODY_GET_JOINT_COUNT = downcallHandle("b3Body_GetJointCount", JAVA_INT, BodyId.LAYOUT);
        B3_BODY_GET_JOINTS = downcallHandle("b3Body_GetJoints", JAVA_INT, BodyId.LAYOUT, UNBOUNDED_ADDRESS, JAVA_INT);
        B3_BODY_GET_CONTACT_CAPACITY = downcallHandle("b3Body_GetContactCapacity", JAVA_INT, BodyId.LAYOUT);
        B3_BODY_GET_CONTACT_DATA = downcallHandle("b3Body_GetContactData", JAVA_INT, BodyId.LAYOUT, UNBOUNDED_ADDRESS, JAVA_INT);
        B3_BODY_COMPUTE_AABB = downcallHandle("b3Body_ComputeAABB", AABB.LAYOUT, BodyId.LAYOUT);
        B3_BODY_GET_CLOSEST_POINT = downcallHandle("b3Body_GetClosestPoint", JAVA_FLOAT, BodyId.LAYOUT, UNBOUNDED_ADDRESS, Vec3.LAYOUT);
        B3_BODY_CAST_RAY = downcallHandle("b3Body_CastRay", BodyCastResult.LAYOUT, BodyId.LAYOUT, Vec3.LAYOUT, Vec3.LAYOUT, QueryFilter.LAYOUT, JAVA_FLOAT, Transform.LAYOUT);
        B3_BODY_CAST_SHAPE = downcallHandle("b3Body_CastShape", BodyCastResult.LAYOUT, BodyId.LAYOUT, Vec3.LAYOUT, UNBOUNDED_ADDRESS, Vec3.LAYOUT, QueryFilter.LAYOUT, JAVA_FLOAT, JAVA_BOOLEAN, Transform.LAYOUT);
        B3_BODY_OVERLAP_SHAPE = downcallHandle("b3Body_OverlapShape", JAVA_BOOLEAN, BodyId.LAYOUT, Vec3.LAYOUT, UNBOUNDED_ADDRESS, QueryFilter.LAYOUT, Transform.LAYOUT);
        B3_BODY_COLLIDE_MOVER = downcallHandle("b3Body_CollideMover", JAVA_INT, BodyId.LAYOUT, UNBOUNDED_ADDRESS, JAVA_INT, Vec3.LAYOUT, UNBOUNDED_ADDRESS, QueryFilter.LAYOUT, Transform.LAYOUT);
        //@formatter:on
    }

    private Body() {
    }

    /// ```
    /// Create a rigid body given a definition. No reference to the definition is retained. So you can create the definition
    /// on the stack and pass it as a pointer.
    /// @code{.c}
    /// b3BodyDef bodyDef = b3DefaultBodyDef();
    /// b3BodyId myBodyId = b3CreateBody(myWorldId, &bodyDef);
    /// @endcode
    /// @warning This function is locked during callbacks.
    /// ```
    public static MemorySegment createBody(
    	SegmentAllocator allocator,
    	MemorySegment worldId,
    	MemorySegment def
    ) {
    	MethodHandle method = B3_CREATE_BODY.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			worldId,
    			def
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#createBody].
    public static @Nullable BodyId createBody(
    	SegmentAllocator allocator,
    	WorldId worldId,
    	BodyDef def
    ) {
    	MemorySegment segment = createBody(
    		allocator,
    		worldId.memorySegment(),
    		def.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new BodyId(segment);
    }
    
    /// ```
    /// Destroy a rigid body given an id. This destroys all shapes and joints attached to the body.
    /// Do not keep references to the associated shapes and joints.
    /// ```
    public static void destroyBody(
    	MemorySegment bodyId
    ) {
    	MethodHandle method = B3_DESTROY_BODY.get();
    	try {
    		 method.invokeExact(
    			bodyId
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#destroyBody].
    public static void destroyBody(
    	BodyId bodyId
    ) {
    	destroyBody(
    		bodyId.memorySegment()
    	);
    }
    
    /// ```
    /// Body identifier validation. A valid body exists in a world and is non-null.
    /// This can be used to detect orphaned ids. Provides validation for up to 64K allocations.
    /// ```
    public static boolean isValid(
    	MemorySegment id
    ) {
    	MethodHandle method = B3_BODY_IS_VALID.get();
    	try {
    		return (boolean) method.invokeExact(
    			id
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#isValid].
    public static boolean isValid(
    	BodyId id
    ) {
    	return isValid(
    		id.memorySegment()
    	);
    }
    
    /// ```
    /// Get the body type: static, kinematic, or dynamic
    /// ```
    public static int getType(
    	MemorySegment bodyId
    ) {
    	MethodHandle method = B3_BODY_GET_TYPE.get();
    	try {
    		return (int) method.invokeExact(
    			bodyId
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getType].
    public static int getType(
    	BodyId bodyId
    ) {
    	return getType(
    		bodyId.memorySegment()
    	);
    }
    
    /// ```
    /// Change the body type. This is an expensive operation. This automatically updates the mass
    /// properties regardless of the automatic mass setting.
    /// ```
    public static void setType(
    	MemorySegment bodyId,
    	int type
    ) {
    	MethodHandle method = B3_BODY_SET_TYPE.get();
    	try {
    		 method.invokeExact(
    			bodyId,
    			type
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setType].
    public static void setType(
    	BodyId bodyId,
    	int type
    ) {
    	setType(
    		bodyId.memorySegment(),
    		type
    	);
    }
    
    /// ```
    /// Set the body name. Up to B3_BODY_NAME_LENGTH characters including null termination.
    /// ```
    public static void setName(
    	MemorySegment bodyId,
    	MemorySegment name
    ) {
    	MethodHandle method = B3_BODY_SET_NAME.get();
    	try {
    		 method.invokeExact(
    			bodyId,
    			name
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setName].
    public static void setName(
    	BodyId bodyId,
    	String name
    ) {
    	try (Arena arena = MemoryStack.stackPush()) {
    		setName(
    			bodyId.memorySegment(),
    			arena.allocateFrom(name)
    		);
    	}
    }
    
    /// ```
    /// Get the body name.
    /// ```
    public static MemorySegment getName(
    	MemorySegment bodyId
    ) {
    	MethodHandle method = B3_BODY_GET_NAME.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			bodyId
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getName].
    public static @Nullable NativeByteArray getName(
    	BodyId bodyId
    ) {
    	MemorySegment segment = getName(
    		bodyId.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativeByteArray(segment);
    }
    
    /// ```
    /// Set the user data for a body
    /// ```
    public static void setUserData(
    	MemorySegment bodyId,
    	MemorySegment userData
    ) {
    	MethodHandle method = B3_BODY_SET_USER_DATA.get();
    	try {
    		 method.invokeExact(
    			bodyId,
    			userData
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setUserData].
    public static void setUserData(
    	BodyId bodyId,
    	MemorySegment userData
    ) {
    	setUserData(
    		bodyId.memorySegment(),
    		userData
    	);
    }
    
    /// ```
    /// Get the user data stored in a body
    /// ```
    public static MemorySegment getUserData(
    	MemorySegment bodyId
    ) {
    	MethodHandle method = B3_BODY_GET_USER_DATA.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			bodyId
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getUserData].
    public static @Nullable MemorySegment getUserData(
    	BodyId bodyId
    ) {
    	MemorySegment segment = getUserData(
    		bodyId.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// ```
    /// Get the world position of a body. This is the location of the body origin.
    /// ```
    public static MemorySegment getPosition(
    	SegmentAllocator allocator,
    	MemorySegment bodyId
    ) {
    	MethodHandle method = B3_BODY_GET_POSITION.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			bodyId
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getPosition].
    public static @Nullable Vec3 getPosition(
    	SegmentAllocator allocator,
    	BodyId bodyId
    ) {
    	MemorySegment segment = getPosition(
    		allocator,
    		bodyId.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new Vec3(segment);
    }
    
    /// ```
    /// Get the world rotation of a body as a quaternion
    /// ```
    public static MemorySegment getRotation(
    	SegmentAllocator allocator,
    	MemorySegment bodyId
    ) {
    	MethodHandle method = B3_BODY_GET_ROTATION.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			bodyId
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getRotation].
    public static @Nullable Quat getRotation(
    	SegmentAllocator allocator,
    	BodyId bodyId
    ) {
    	MemorySegment segment = getRotation(
    		allocator,
    		bodyId.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new Quat(segment);
    }
    
    /// ```
    /// Get the world transform of a body.
    /// ```
    public static MemorySegment getTransform(
    	SegmentAllocator allocator,
    	MemorySegment bodyId
    ) {
    	MethodHandle method = B3_BODY_GET_TRANSFORM.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			bodyId
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getTransform].
    public static @Nullable Transform getTransform(
    	SegmentAllocator allocator,
    	BodyId bodyId
    ) {
    	MemorySegment segment = getTransform(
    		allocator,
    		bodyId.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new Transform(segment);
    }
    
    /// ```
    /// Set the world transform of a body. This acts as a teleport and is fairly expensive.
    /// @note Generally you should create a body with the intended transform.
    /// @see b3BodyDef::position and b3BodyDef::rotation
    /// ```
    public static void setTransform(
    	MemorySegment bodyId,
    	MemorySegment position,
    	MemorySegment rotation
    ) {
    	MethodHandle method = B3_BODY_SET_TRANSFORM.get();
    	try {
    		 method.invokeExact(
    			bodyId,
    			position,
    			rotation
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setTransform].
    public static void setTransform(
    	BodyId bodyId,
    	Vec3 position,
    	Quat rotation
    ) {
    	setTransform(
    		bodyId.memorySegment(),
    		position.memorySegment(),
    		rotation.memorySegment()
    	);
    }
    
    /// ```
    /// Get a local point on a body given a world point
    /// ```
    public static MemorySegment getLocalPoint(
    	SegmentAllocator allocator,
    	MemorySegment bodyId,
    	MemorySegment worldPoint
    ) {
    	MethodHandle method = B3_BODY_GET_LOCAL_POINT.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			bodyId,
    			worldPoint
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getLocalPoint].
    public static @Nullable Vec3 getLocalPoint(
    	SegmentAllocator allocator,
    	BodyId bodyId,
    	Vec3 worldPoint
    ) {
    	MemorySegment segment = getLocalPoint(
    		allocator,
    		bodyId.memorySegment(),
    		worldPoint.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new Vec3(segment);
    }
    
    /// ```
    /// Get a world point on a body given a local point
    /// ```
    public static MemorySegment getWorldPoint(
    	SegmentAllocator allocator,
    	MemorySegment bodyId,
    	MemorySegment localPoint
    ) {
    	MethodHandle method = B3_BODY_GET_WORLD_POINT.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			bodyId,
    			localPoint
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getWorldPoint].
    public static @Nullable Vec3 getWorldPoint(
    	SegmentAllocator allocator,
    	BodyId bodyId,
    	Vec3 localPoint
    ) {
    	MemorySegment segment = getWorldPoint(
    		allocator,
    		bodyId.memorySegment(),
    		localPoint.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new Vec3(segment);
    }
    
    /// ```
    /// Get a local vector on a body given a world vector
    /// ```
    public static MemorySegment getLocalVector(
    	SegmentAllocator allocator,
    	MemorySegment bodyId,
    	MemorySegment worldVector
    ) {
    	MethodHandle method = B3_BODY_GET_LOCAL_VECTOR.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			bodyId,
    			worldVector
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getLocalVector].
    public static @Nullable Vec3 getLocalVector(
    	SegmentAllocator allocator,
    	BodyId bodyId,
    	Vec3 worldVector
    ) {
    	MemorySegment segment = getLocalVector(
    		allocator,
    		bodyId.memorySegment(),
    		worldVector.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new Vec3(segment);
    }
    
    /// ```
    /// Get a world vector on a body given a local vector
    /// ```
    public static MemorySegment getWorldVector(
    	SegmentAllocator allocator,
    	MemorySegment bodyId,
    	MemorySegment localVector
    ) {
    	MethodHandle method = B3_BODY_GET_WORLD_VECTOR.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			bodyId,
    			localVector
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getWorldVector].
    public static @Nullable Vec3 getWorldVector(
    	SegmentAllocator allocator,
    	BodyId bodyId,
    	Vec3 localVector
    ) {
    	MemorySegment segment = getWorldVector(
    		allocator,
    		bodyId.memorySegment(),
    		localVector.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new Vec3(segment);
    }
    
    /// ```
    /// Get the linear velocity of a body's center of mass. Usually in meters per second.
    /// ```
    public static MemorySegment getLinearVelocity(
    	SegmentAllocator allocator,
    	MemorySegment bodyId
    ) {
    	MethodHandle method = B3_BODY_GET_LINEAR_VELOCITY.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			bodyId
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getLinearVelocity].
    public static @Nullable Vec3 getLinearVelocity(
    	SegmentAllocator allocator,
    	BodyId bodyId
    ) {
    	MemorySegment segment = getLinearVelocity(
    		allocator,
    		bodyId.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new Vec3(segment);
    }
    
    /// ```
    /// Get the angular velocity of a body in radians per second
    /// ```
    public static MemorySegment getAngularVelocity(
    	SegmentAllocator allocator,
    	MemorySegment bodyId
    ) {
    	MethodHandle method = B3_BODY_GET_ANGULAR_VELOCITY.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			bodyId
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getAngularVelocity].
    public static @Nullable Vec3 getAngularVelocity(
    	SegmentAllocator allocator,
    	BodyId bodyId
    ) {
    	MemorySegment segment = getAngularVelocity(
    		allocator,
    		bodyId.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new Vec3(segment);
    }
    
    /// ```
    /// Set the linear velocity of a body. Usually in meters per second.
    /// ```
    public static void setLinearVelocity(
    	MemorySegment bodyId,
    	MemorySegment linearVelocity
    ) {
    	MethodHandle method = B3_BODY_SET_LINEAR_VELOCITY.get();
    	try {
    		 method.invokeExact(
    			bodyId,
    			linearVelocity
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setLinearVelocity].
    public static void setLinearVelocity(
    	BodyId bodyId,
    	Vec3 linearVelocity
    ) {
    	setLinearVelocity(
    		bodyId.memorySegment(),
    		linearVelocity.memorySegment()
    	);
    }
    
    /// ```
    /// Set the angular velocity of a body in radians per second
    /// ```
    public static void setAngularVelocity(
    	MemorySegment bodyId,
    	MemorySegment angularVelocity
    ) {
    	MethodHandle method = B3_BODY_SET_ANGULAR_VELOCITY.get();
    	try {
    		 method.invokeExact(
    			bodyId,
    			angularVelocity
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setAngularVelocity].
    public static void setAngularVelocity(
    	BodyId bodyId,
    	Vec3 angularVelocity
    ) {
    	setAngularVelocity(
    		bodyId.memorySegment(),
    		angularVelocity.memorySegment()
    	);
    }
    
    /// ```
    /// Set the velocity to reach the given transform after a given time step.
    /// The result will be close but maybe not exact. This is meant for kinematic bodies.
    /// The target is not applied if the velocity would be below the sleep threshold.
    /// This will optionally wake the body if asleep, but only if the movement is significant.
    /// ```
    public static void setTargetTransform(
    	MemorySegment bodyId,
    	MemorySegment target,
    	float timeStep,
    	boolean wake
    ) {
    	MethodHandle method = B3_BODY_SET_TARGET_TRANSFORM.get();
    	try {
    		 method.invokeExact(
    			bodyId,
    			target,
    			timeStep,
    			wake
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setTargetTransform].
    public static void setTargetTransform(
    	BodyId bodyId,
    	Transform target,
    	float timeStep,
    	boolean wake
    ) {
    	setTargetTransform(
    		bodyId.memorySegment(),
    		target.memorySegment(),
    		timeStep,
    		wake
    	);
    }
    
    /// ```
    /// Get the linear velocity of a local point attached to a body. Usually in meters per second.
    /// ```
    public static MemorySegment getLocalPointVelocity(
    	SegmentAllocator allocator,
    	MemorySegment bodyId,
    	MemorySegment localPoint
    ) {
    	MethodHandle method = B3_BODY_GET_LOCAL_POINT_VELOCITY.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			bodyId,
    			localPoint
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getLocalPointVelocity].
    public static @Nullable Vec3 getLocalPointVelocity(
    	SegmentAllocator allocator,
    	BodyId bodyId,
    	Vec3 localPoint
    ) {
    	MemorySegment segment = getLocalPointVelocity(
    		allocator,
    		bodyId.memorySegment(),
    		localPoint.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new Vec3(segment);
    }
    
    /// ```
    /// Get the linear velocity of a world point attached to a body. Usually in meters per second.
    /// ```
    public static MemorySegment getWorldPointVelocity(
    	SegmentAllocator allocator,
    	MemorySegment bodyId,
    	MemorySegment worldPoint
    ) {
    	MethodHandle method = B3_BODY_GET_WORLD_POINT_VELOCITY.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			bodyId,
    			worldPoint
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getWorldPointVelocity].
    public static @Nullable Vec3 getWorldPointVelocity(
    	SegmentAllocator allocator,
    	BodyId bodyId,
    	Vec3 worldPoint
    ) {
    	MemorySegment segment = getWorldPointVelocity(
    		allocator,
    		bodyId.memorySegment(),
    		worldPoint.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new Vec3(segment);
    }
    
    /// ```
    /// Apply a force at a world point. If the force is not applied at the center of mass,
    /// it will generate a torque and affect the angular velocity. This optionally wakes up the body.
    /// The force is ignored if the body is not awake.
    /// @param bodyId The body id
    /// @param force The world force vector, usually in newtons (N)
    /// @param point The world position of the point of application
    /// @param wake Option to wake up the body
    /// ```
    public static void applyForce(
    	MemorySegment bodyId,
    	MemorySegment force,
    	MemorySegment point,
    	boolean wake
    ) {
    	MethodHandle method = B3_BODY_APPLY_FORCE.get();
    	try {
    		 method.invokeExact(
    			bodyId,
    			force,
    			point,
    			wake
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#applyForce].
    public static void applyForce(
    	BodyId bodyId,
    	Vec3 force,
    	Vec3 point,
    	boolean wake
    ) {
    	applyForce(
    		bodyId.memorySegment(),
    		force.memorySegment(),
    		point.memorySegment(),
    		wake
    	);
    }
    
    /// ```
    /// Apply a force to the center of mass. This optionally wakes up the body.
    /// The force is ignored if the body is not awake.
    /// @param bodyId The body id
    /// @param force the world force vector, usually in newtons (N).
    /// @param wake also wake up the body
    /// ```
    public static void applyForceToCenter(
    	MemorySegment bodyId,
    	MemorySegment force,
    	boolean wake
    ) {
    	MethodHandle method = B3_BODY_APPLY_FORCE_TO_CENTER.get();
    	try {
    		 method.invokeExact(
    			bodyId,
    			force,
    			wake
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#applyForceToCenter].
    public static void applyForceToCenter(
    	BodyId bodyId,
    	Vec3 force,
    	boolean wake
    ) {
    	applyForceToCenter(
    		bodyId.memorySegment(),
    		force.memorySegment(),
    		wake
    	);
    }
    
    /// ```
    /// Apply a torque. This affects the angular velocity without affecting the linear velocity.
    /// This optionally wakes the body. The torque is ignored if the body is not awake.
    /// @param bodyId The body id
    /// @param torque the world torque vector, usually in N*m.
    /// @param wake also wake up the body
    /// ```
    public static void applyTorque(
    	MemorySegment bodyId,
    	MemorySegment torque,
    	boolean wake
    ) {
    	MethodHandle method = B3_BODY_APPLY_TORQUE.get();
    	try {
    		 method.invokeExact(
    			bodyId,
    			torque,
    			wake
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#applyTorque].
    public static void applyTorque(
    	BodyId bodyId,
    	Vec3 torque,
    	boolean wake
    ) {
    	applyTorque(
    		bodyId.memorySegment(),
    		torque.memorySegment(),
    		wake
    	);
    }
    
    /// ```
    /// Apply an impulse at a point. This immediately modifies the velocity.
    /// It also modifies the angular velocity if the point of application
    /// is not at the center of mass. This optionally wakes the body.
    /// The impulse is ignored if the body is not awake.
    /// @param bodyId The body id
    /// @param impulse the world impulse vector, usually in N*s or kg*m/s.
    /// @param point the world position of the point of application.
    /// @param wake also wake up the body
    /// @warning This should be used for one-shot impulses. If you need a steady force,
    /// use a force instead, which will work better with the sub-stepping solver.
    /// ```
    public static void applyLinearImpulse(
    	MemorySegment bodyId,
    	MemorySegment impulse,
    	MemorySegment point,
    	boolean wake
    ) {
    	MethodHandle method = B3_BODY_APPLY_LINEAR_IMPULSE.get();
    	try {
    		 method.invokeExact(
    			bodyId,
    			impulse,
    			point,
    			wake
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#applyLinearImpulse].
    public static void applyLinearImpulse(
    	BodyId bodyId,
    	Vec3 impulse,
    	Vec3 point,
    	boolean wake
    ) {
    	applyLinearImpulse(
    		bodyId.memorySegment(),
    		impulse.memorySegment(),
    		point.memorySegment(),
    		wake
    	);
    }
    
    /// ```
    /// Apply an impulse to the center of mass. This immediately modifies the velocity.
    /// The impulse is ignored if the body is not awake. This optionally wakes the body.
    /// @param bodyId The body id
    /// @param impulse the world impulse vector, usually in N*s or kg*m/s.
    /// @param wake also wake up the body
    /// @warning This should be used for one-shot impulses. If you need a steady force,
    /// use a force instead, which will work better with the sub-stepping solver.
    /// ```
    public static void applyLinearImpulseToCenter(
    	MemorySegment bodyId,
    	MemorySegment impulse,
    	boolean wake
    ) {
    	MethodHandle method = B3_BODY_APPLY_LINEAR_IMPULSE_TO_CENTER.get();
    	try {
    		 method.invokeExact(
    			bodyId,
    			impulse,
    			wake
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#applyLinearImpulseToCenter].
    public static void applyLinearImpulseToCenter(
    	BodyId bodyId,
    	Vec3 impulse,
    	boolean wake
    ) {
    	applyLinearImpulseToCenter(
    		bodyId.memorySegment(),
    		impulse.memorySegment(),
    		wake
    	);
    }
    
    /// ```
    /// Apply an angular impulse in world space. The impulse is ignored if the body is not awake.
    /// This optionally wakes the body.
    /// @param bodyId The body id
    /// @param impulse the world angular impulse vector, usually in units of kg*m*m/s
    /// @param wake also wake up the body
    /// @warning This should be used for one-shot impulses. If you need a steady torque,
    /// use a torque instead, which will work better with the sub-stepping solver.
    /// ```
    public static void applyAngularImpulse(
    	MemorySegment bodyId,
    	MemorySegment impulse,
    	boolean wake
    ) {
    	MethodHandle method = B3_BODY_APPLY_ANGULAR_IMPULSE.get();
    	try {
    		 method.invokeExact(
    			bodyId,
    			impulse,
    			wake
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#applyAngularImpulse].
    public static void applyAngularImpulse(
    	BodyId bodyId,
    	Vec3 impulse,
    	boolean wake
    ) {
    	applyAngularImpulse(
    		bodyId.memorySegment(),
    		impulse.memorySegment(),
    		wake
    	);
    }
    
    /// ```
    /// Get the mass of the body, usually in kilograms
    /// ```
    public static float getMass(
    	MemorySegment bodyId
    ) {
    	MethodHandle method = B3_BODY_GET_MASS.get();
    	try {
    		return (float) method.invokeExact(
    			bodyId
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getMass].
    public static float getMass(
    	BodyId bodyId
    ) {
    	return getMass(
    		bodyId.memorySegment()
    	);
    }
    
    /// ```
    /// Get the rotational inertia of the body in local space, usually in kg*m^2
    /// ```
    public static MemorySegment getLocalRotationalInertia(
    	SegmentAllocator allocator,
    	MemorySegment bodyId
    ) {
    	MethodHandle method = B3_BODY_GET_LOCAL_ROTATIONAL_INERTIA.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			bodyId
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getLocalRotationalInertia].
    public static @Nullable Matrix3 getLocalRotationalInertia(
    	SegmentAllocator allocator,
    	BodyId bodyId
    ) {
    	MemorySegment segment = getLocalRotationalInertia(
    		allocator,
    		bodyId.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new Matrix3(segment);
    }
    
    /// ```
    /// Get the inverse mass of the body, usually in 1/kilograms
    /// ```
    public static float getInverseMass(
    	MemorySegment bodyId
    ) {
    	MethodHandle method = B3_BODY_GET_INVERSE_MASS.get();
    	try {
    		return (float) method.invokeExact(
    			bodyId
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getInverseMass].
    public static float getInverseMass(
    	BodyId bodyId
    ) {
    	return getInverseMass(
    		bodyId.memorySegment()
    	);
    }
    
    /// ```
    /// Get the inverse rotational inertia of the body in world space, usually in 1/kg*m^2
    /// ```
    public static MemorySegment getWorldInverseRotationalInertia(
    	SegmentAllocator allocator,
    	MemorySegment bodyId
    ) {
    	MethodHandle method = B3_BODY_GET_WORLD_INVERSE_ROTATIONAL_INERTIA.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			bodyId
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getWorldInverseRotationalInertia].
    public static @Nullable Matrix3 getWorldInverseRotationalInertia(
    	SegmentAllocator allocator,
    	BodyId bodyId
    ) {
    	MemorySegment segment = getWorldInverseRotationalInertia(
    		allocator,
    		bodyId.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new Matrix3(segment);
    }
    
    /// ```
    /// Get the center of mass position of the body in local space
    /// ```
    public static MemorySegment getLocalCenterOfMass(
    	SegmentAllocator allocator,
    	MemorySegment bodyId
    ) {
    	MethodHandle method = B3_BODY_GET_LOCAL_CENTER_OF_MASS.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			bodyId
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getLocalCenterOfMass].
    public static @Nullable Vec3 getLocalCenterOfMass(
    	SegmentAllocator allocator,
    	BodyId bodyId
    ) {
    	MemorySegment segment = getLocalCenterOfMass(
    		allocator,
    		bodyId.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new Vec3(segment);
    }
    
    /// ```
    /// Get the center of mass position of the body in world space
    /// ```
    public static MemorySegment getWorldCenterOfMass(
    	SegmentAllocator allocator,
    	MemorySegment bodyId
    ) {
    	MethodHandle method = B3_BODY_GET_WORLD_CENTER_OF_MASS.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			bodyId
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getWorldCenterOfMass].
    public static @Nullable Vec3 getWorldCenterOfMass(
    	SegmentAllocator allocator,
    	BodyId bodyId
    ) {
    	MemorySegment segment = getWorldCenterOfMass(
    		allocator,
    		bodyId.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new Vec3(segment);
    }
    
    /// ```
    /// Override the body's mass properties. Normally this is computed automatically using the
    /// shape geometry and density. This information is lost if a shape is added or removed or if the
    /// body type changes.
    /// ```
    public static void setMassData(
    	MemorySegment bodyId,
    	MemorySegment massData
    ) {
    	MethodHandle method = B3_BODY_SET_MASS_DATA.get();
    	try {
    		 method.invokeExact(
    			bodyId,
    			massData
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setMassData].
    public static void setMassData(
    	BodyId bodyId,
    	MassData massData
    ) {
    	setMassData(
    		bodyId.memorySegment(),
    		massData.memorySegment()
    	);
    }
    
    /// ```
    /// Get the mass data for a body
    /// ```
    public static MemorySegment getMassData(
    	SegmentAllocator allocator,
    	MemorySegment bodyId
    ) {
    	MethodHandle method = B3_BODY_GET_MASS_DATA.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			bodyId
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getMassData].
    public static @Nullable MassData getMassData(
    	SegmentAllocator allocator,
    	BodyId bodyId
    ) {
    	MemorySegment segment = getMassData(
    		allocator,
    		bodyId.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new MassData(segment);
    }
    
    /// ```
    /// This updates the mass properties to the sum of the mass properties of the shapes.
    /// This normally does not need to be called unless you called SetMassData to override
    /// the mass and you later want to reset the mass.
    /// You may also use this when automatic mass computation has been disabled.
    /// You should call this regardless of body type.
    /// ```
    public static void applyMassFromShapes(
    	MemorySegment bodyId
    ) {
    	MethodHandle method = B3_BODY_APPLY_MASS_FROM_SHAPES.get();
    	try {
    		 method.invokeExact(
    			bodyId
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#applyMassFromShapes].
    public static void applyMassFromShapes(
    	BodyId bodyId
    ) {
    	applyMassFromShapes(
    		bodyId.memorySegment()
    	);
    }
    
    /// ```
    /// Adjust the linear damping. Normally this is set in b3BodyDef before creation.
    /// ```
    public static void setLinearDamping(
    	MemorySegment bodyId,
    	float linearDamping
    ) {
    	MethodHandle method = B3_BODY_SET_LINEAR_DAMPING.get();
    	try {
    		 method.invokeExact(
    			bodyId,
    			linearDamping
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setLinearDamping].
    public static void setLinearDamping(
    	BodyId bodyId,
    	float linearDamping
    ) {
    	setLinearDamping(
    		bodyId.memorySegment(),
    		linearDamping
    	);
    }
    
    /// ```
    /// Get the current linear damping.
    /// ```
    public static float getLinearDamping(
    	MemorySegment bodyId
    ) {
    	MethodHandle method = B3_BODY_GET_LINEAR_DAMPING.get();
    	try {
    		return (float) method.invokeExact(
    			bodyId
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getLinearDamping].
    public static float getLinearDamping(
    	BodyId bodyId
    ) {
    	return getLinearDamping(
    		bodyId.memorySegment()
    	);
    }
    
    /// ```
    /// Adjust the angular damping. Normally this is set in b3BodyDef before creation.
    /// ```
    public static void setAngularDamping(
    	MemorySegment bodyId,
    	float angularDamping
    ) {
    	MethodHandle method = B3_BODY_SET_ANGULAR_DAMPING.get();
    	try {
    		 method.invokeExact(
    			bodyId,
    			angularDamping
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setAngularDamping].
    public static void setAngularDamping(
    	BodyId bodyId,
    	float angularDamping
    ) {
    	setAngularDamping(
    		bodyId.memorySegment(),
    		angularDamping
    	);
    }
    
    /// ```
    /// Get the current angular damping.
    /// ```
    public static float getAngularDamping(
    	MemorySegment bodyId
    ) {
    	MethodHandle method = B3_BODY_GET_ANGULAR_DAMPING.get();
    	try {
    		return (float) method.invokeExact(
    			bodyId
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getAngularDamping].
    public static float getAngularDamping(
    	BodyId bodyId
    ) {
    	return getAngularDamping(
    		bodyId.memorySegment()
    	);
    }
    
    /// ```
    /// Adjust the gravity scale. Normally this is set in b3BodyDef before creation.
    /// @see b3BodyDef::gravityScale
    /// ```
    public static void setGravityScale(
    	MemorySegment bodyId,
    	float gravityScale
    ) {
    	MethodHandle method = B3_BODY_SET_GRAVITY_SCALE.get();
    	try {
    		 method.invokeExact(
    			bodyId,
    			gravityScale
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setGravityScale].
    public static void setGravityScale(
    	BodyId bodyId,
    	float gravityScale
    ) {
    	setGravityScale(
    		bodyId.memorySegment(),
    		gravityScale
    	);
    }
    
    /// ```
    /// Get the current gravity scale
    /// ```
    public static float getGravityScale(
    	MemorySegment bodyId
    ) {
    	MethodHandle method = B3_BODY_GET_GRAVITY_SCALE.get();
    	try {
    		return (float) method.invokeExact(
    			bodyId
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getGravityScale].
    public static float getGravityScale(
    	BodyId bodyId
    ) {
    	return getGravityScale(
    		bodyId.memorySegment()
    	);
    }
    
    /// ```
    /// @return true if this body is awake
    /// ```
    public static boolean isAwake(
    	MemorySegment bodyId
    ) {
    	MethodHandle method = B3_BODY_IS_AWAKE.get();
    	try {
    		return (boolean) method.invokeExact(
    			bodyId
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#isAwake].
    public static boolean isAwake(
    	BodyId bodyId
    ) {
    	return isAwake(
    		bodyId.memorySegment()
    	);
    }
    
    /// ```
    /// Wake a body from sleep. This wakes the entire island the body is touching.
    /// @warning Putting a body to sleep will put the entire island of bodies touching this body to sleep,
    /// which can be expensive and possibly unintuitive.
    /// ```
    public static void setAwake(
    	MemorySegment bodyId,
    	boolean awake
    ) {
    	MethodHandle method = B3_BODY_SET_AWAKE.get();
    	try {
    		 method.invokeExact(
    			bodyId,
    			awake
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setAwake].
    public static void setAwake(
    	BodyId bodyId,
    	boolean awake
    ) {
    	setAwake(
    		bodyId.memorySegment(),
    		awake
    	);
    }
    
    /// ```
    /// Enable or disable sleeping for this body. If sleeping is disabled the body will wake.
    /// ```
    public static void enableSleep(
    	MemorySegment bodyId,
    	boolean enableSleep
    ) {
    	MethodHandle method = B3_BODY_ENABLE_SLEEP.get();
    	try {
    		 method.invokeExact(
    			bodyId,
    			enableSleep
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#enableSleep].
    public static void enableSleep(
    	BodyId bodyId,
    	boolean enableSleep
    ) {
    	enableSleep(
    		bodyId.memorySegment(),
    		enableSleep
    	);
    }
    
    /// ```
    /// Returns true if sleeping is enabled for this body
    /// ```
    public static boolean isSleepEnabled(
    	MemorySegment bodyId
    ) {
    	MethodHandle method = B3_BODY_IS_SLEEP_ENABLED.get();
    	try {
    		return (boolean) method.invokeExact(
    			bodyId
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#isSleepEnabled].
    public static boolean isSleepEnabled(
    	BodyId bodyId
    ) {
    	return isSleepEnabled(
    		bodyId.memorySegment()
    	);
    }
    
    /// ```
    /// Set the sleep threshold, usually in meters per second
    /// ```
    public static void setSleepThreshold(
    	MemorySegment bodyId,
    	float sleepThreshold
    ) {
    	MethodHandle method = B3_BODY_SET_SLEEP_THRESHOLD.get();
    	try {
    		 method.invokeExact(
    			bodyId,
    			sleepThreshold
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setSleepThreshold].
    public static void setSleepThreshold(
    	BodyId bodyId,
    	float sleepThreshold
    ) {
    	setSleepThreshold(
    		bodyId.memorySegment(),
    		sleepThreshold
    	);
    }
    
    /// ```
    /// Get the sleep threshold, usually in meters per second.
    /// ```
    public static float getSleepThreshold(
    	MemorySegment bodyId
    ) {
    	MethodHandle method = B3_BODY_GET_SLEEP_THRESHOLD.get();
    	try {
    		return (float) method.invokeExact(
    			bodyId
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getSleepThreshold].
    public static float getSleepThreshold(
    	BodyId bodyId
    ) {
    	return getSleepThreshold(
    		bodyId.memorySegment()
    	);
    }
    
    /// ```
    /// Returns true if this body is enabled
    /// ```
    public static boolean isEnabled(
    	MemorySegment bodyId
    ) {
    	MethodHandle method = B3_BODY_IS_ENABLED.get();
    	try {
    		return (boolean) method.invokeExact(
    			bodyId
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#isEnabled].
    public static boolean isEnabled(
    	BodyId bodyId
    ) {
    	return isEnabled(
    		bodyId.memorySegment()
    	);
    }
    
    /// ```
    /// Disable a body by removing it completely from the simulation. This is expensive.
    /// ```
    public static void disable(
    	MemorySegment bodyId
    ) {
    	MethodHandle method = B3_BODY_DISABLE.get();
    	try {
    		 method.invokeExact(
    			bodyId
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#disable].
    public static void disable(
    	BodyId bodyId
    ) {
    	disable(
    		bodyId.memorySegment()
    	);
    }
    
    /// ```
    /// Enable a body by adding it to the simulation. This is expensive.
    /// ```
    public static void enable(
    	MemorySegment bodyId
    ) {
    	MethodHandle method = B3_BODY_ENABLE.get();
    	try {
    		 method.invokeExact(
    			bodyId
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#enable].
    public static void enable(
    	BodyId bodyId
    ) {
    	enable(
    		bodyId.memorySegment()
    	);
    }
    
    /// ```
    /// Set the motion locks on this body.
    /// ```
    public static void setMotionLocks(
    	MemorySegment bodyId,
    	MemorySegment locks
    ) {
    	MethodHandle method = B3_BODY_SET_MOTION_LOCKS.get();
    	try {
    		 method.invokeExact(
    			bodyId,
    			locks
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setMotionLocks].
    public static void setMotionLocks(
    	BodyId bodyId,
    	MotionLocks locks
    ) {
    	setMotionLocks(
    		bodyId.memorySegment(),
    		locks.memorySegment()
    	);
    }
    
    /// ```
    /// Get the motion locks for this body.
    /// ```
    public static MemorySegment getMotionLocks(
    	SegmentAllocator allocator,
    	MemorySegment bodyId
    ) {
    	MethodHandle method = B3_BODY_GET_MOTION_LOCKS.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			bodyId
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getMotionLocks].
    public static @Nullable MotionLocks getMotionLocks(
    	SegmentAllocator allocator,
    	BodyId bodyId
    ) {
    	MemorySegment segment = getMotionLocks(
    		allocator,
    		bodyId.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new MotionLocks(segment);
    }
    
    /// ```
    /// Set this body to be a bullet. A bullet does continuous collision detection
    /// against dynamic bodies (but not other bullets).
    /// ```
    public static void setBullet(
    	MemorySegment bodyId,
    	boolean flag
    ) {
    	MethodHandle method = B3_BODY_SET_BULLET.get();
    	try {
    		 method.invokeExact(
    			bodyId,
    			flag
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setBullet].
    public static void setBullet(
    	BodyId bodyId,
    	boolean flag
    ) {
    	setBullet(
    		bodyId.memorySegment(),
    		flag
    	);
    }
    
    /// ```
    /// Is this body a bullet?
    /// ```
    public static boolean isBullet(
    	MemorySegment bodyId
    ) {
    	MethodHandle method = B3_BODY_IS_BULLET.get();
    	try {
    		return (boolean) method.invokeExact(
    			bodyId
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#isBullet].
    public static boolean isBullet(
    	BodyId bodyId
    ) {
    	return isBullet(
    		bodyId.memorySegment()
    	);
    }
    
    /// ```
    /// Enable or disable contact recycling for this body. Contact recycling is a performance optimization
    /// that reuses contact manifolds when bodies move slightly. Disabling it can avoid ghost collisions
    /// on characters at the cost of higher per-step work. Existing contacts retain their prior setting;
    /// only contacts created after this call see the new value.
    /// @see b3BodyDef::enableContactRecycling
    /// ```
    public static void enableContactRecycling(
    	MemorySegment bodyId,
    	boolean flag
    ) {
    	MethodHandle method = B3_BODY_ENABLE_CONTACT_RECYCLING.get();
    	try {
    		 method.invokeExact(
    			bodyId,
    			flag
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#enableContactRecycling].
    public static void enableContactRecycling(
    	BodyId bodyId,
    	boolean flag
    ) {
    	enableContactRecycling(
    		bodyId.memorySegment(),
    		flag
    	);
    }
    
    /// ```
    /// Is contact recycling enabled on this body?
    /// ```
    public static boolean isContactRecyclingEnabled(
    	MemorySegment bodyId
    ) {
    	MethodHandle method = B3_BODY_IS_CONTACT_RECYCLING_ENABLED.get();
    	try {
    		return (boolean) method.invokeExact(
    			bodyId
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#isContactRecyclingEnabled].
    public static boolean isContactRecyclingEnabled(
    	BodyId bodyId
    ) {
    	return isContactRecyclingEnabled(
    		bodyId.memorySegment()
    	);
    }
    
    /// ```
    /// Enable/disable hit events on all shapes
    /// @see b3ShapeDef::enableHitEvents
    /// ```
    public static void enableHitEvents(
    	MemorySegment bodyId,
    	boolean enableHitEvents
    ) {
    	MethodHandle method = B3_BODY_ENABLE_HIT_EVENTS.get();
    	try {
    		 method.invokeExact(
    			bodyId,
    			enableHitEvents
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#enableHitEvents].
    public static void enableHitEvents(
    	BodyId bodyId,
    	boolean enableHitEvents
    ) {
    	enableHitEvents(
    		bodyId.memorySegment(),
    		enableHitEvents
    	);
    }
    
    /// ```
    /// Get the world that owns this body
    /// ```
    public static MemorySegment getWorld(
    	SegmentAllocator allocator,
    	MemorySegment bodyId
    ) {
    	MethodHandle method = B3_BODY_GET_WORLD.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			bodyId
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getWorld].
    public static @Nullable WorldId getWorld(
    	SegmentAllocator allocator,
    	BodyId bodyId
    ) {
    	MemorySegment segment = getWorld(
    		allocator,
    		bodyId.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new WorldId(segment);
    }
    
    /// ```
    /// Get the number of shapes on this body
    /// ```
    public static int getShapeCount(
    	MemorySegment bodyId
    ) {
    	MethodHandle method = B3_BODY_GET_SHAPE_COUNT.get();
    	try {
    		return (int) method.invokeExact(
    			bodyId
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getShapeCount].
    public static int getShapeCount(
    	BodyId bodyId
    ) {
    	return getShapeCount(
    		bodyId.memorySegment()
    	);
    }
    
    /// ```
    /// Get the shape ids for all shapes on this body, up to the provided capacity.
    /// @returns the number of shape ids stored in the user array
    /// ```
    public static int getShapes(
    	MemorySegment bodyId,
    	MemorySegment shapeArray,
    	int capacity
    ) {
    	MethodHandle method = B3_BODY_GET_SHAPES.get();
    	try {
    		return (int) method.invokeExact(
    			bodyId,
    			shapeArray,
    			capacity
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getShapes].
    public static int getShapes(
    	BodyId bodyId,
    	ShapeId shapeArray,
    	int capacity
    ) {
    	return getShapes(
    		bodyId.memorySegment(),
    		shapeArray.memorySegment(),
    		capacity
    	);
    }
    
    /// ```
    /// Get the number of joints on this body
    /// ```
    public static int getJointCount(
    	MemorySegment bodyId
    ) {
    	MethodHandle method = B3_BODY_GET_JOINT_COUNT.get();
    	try {
    		return (int) method.invokeExact(
    			bodyId
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getJointCount].
    public static int getJointCount(
    	BodyId bodyId
    ) {
    	return getJointCount(
    		bodyId.memorySegment()
    	);
    }
    
    /// ```
    /// Get the joint ids for all joints on this body, up to the provided capacity
    /// @returns the number of joint ids stored in the user array
    /// ```
    public static int getJoints(
    	MemorySegment bodyId,
    	MemorySegment jointArray,
    	int capacity
    ) {
    	MethodHandle method = B3_BODY_GET_JOINTS.get();
    	try {
    		return (int) method.invokeExact(
    			bodyId,
    			jointArray,
    			capacity
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getJoints].
    public static int getJoints(
    	BodyId bodyId,
    	JointId jointArray,
    	int capacity
    ) {
    	return getJoints(
    		bodyId.memorySegment(),
    		jointArray.memorySegment(),
    		capacity
    	);
    }
    
    /// ```
    /// Get the maximum capacity required for retrieving all the touching contacts on a body
    /// ```
    public static int getContactCapacity(
    	MemorySegment bodyId
    ) {
    	MethodHandle method = B3_BODY_GET_CONTACT_CAPACITY.get();
    	try {
    		return (int) method.invokeExact(
    			bodyId
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getContactCapacity].
    public static int getContactCapacity(
    	BodyId bodyId
    ) {
    	return getContactCapacity(
    		bodyId.memorySegment()
    	);
    }
    
    /// ```
    /// Get the touching contact data for a body
    /// ```
    public static int getContactData(
    	MemorySegment bodyId,
    	MemorySegment contactData,
    	int capacity
    ) {
    	MethodHandle method = B3_BODY_GET_CONTACT_DATA.get();
    	try {
    		return (int) method.invokeExact(
    			bodyId,
    			contactData,
    			capacity
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getContactData].
    public static int getContactData(
    	BodyId bodyId,
    	ContactData contactData,
    	int capacity
    ) {
    	return getContactData(
    		bodyId.memorySegment(),
    		contactData.memorySegment(),
    		capacity
    	);
    }
    
    /// ```
    /// Get the current world AABB that contains all the attached shapes. Note that this may not encompass the body origin.
    /// If there are no shapes attached then the returned AABB is empty and centered on the body origin.
    /// ```
    public static MemorySegment computeAABB(
    	SegmentAllocator allocator,
    	MemorySegment bodyId
    ) {
    	MethodHandle method = B3_BODY_COMPUTE_AABB.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			bodyId
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#computeAABB].
    public static @Nullable AABB computeAABB(
    	SegmentAllocator allocator,
    	BodyId bodyId
    ) {
    	MemorySegment segment = computeAABB(
    		allocator,
    		bodyId.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new AABB(segment);
    }
    
    /// ```
    /// Get the closest point on a body to a world target.
    /// ```
    public static float getClosestPoint(
    	MemorySegment bodyId,
    	MemorySegment result,
    	MemorySegment target
    ) {
    	MethodHandle method = B3_BODY_GET_CLOSEST_POINT.get();
    	try {
    		return (float) method.invokeExact(
    			bodyId,
    			result,
    			target
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getClosestPoint].
    public static float getClosestPoint(
    	BodyId bodyId,
    	Vec3 result,
    	Vec3 target
    ) {
    	return getClosestPoint(
    		bodyId.memorySegment(),
    		result.memorySegment(),
    		target.memorySegment()
    	);
    }
    
    /// ```
    /// Cast a ray at a specific body using a specified body transform.
    /// ```
    public static MemorySegment castRay(
    	SegmentAllocator allocator,
    	MemorySegment bodyId,
    	MemorySegment origin,
    	MemorySegment translation,
    	MemorySegment filter,
    	float maxFraction,
    	MemorySegment bodyTransform
    ) {
    	MethodHandle method = B3_BODY_CAST_RAY.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			bodyId,
    			origin,
    			translation,
    			filter,
    			maxFraction,
    			bodyTransform
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#castRay].
    public static @Nullable BodyCastResult castRay(
    	SegmentAllocator allocator,
    	BodyId bodyId,
    	Vec3 origin,
    	Vec3 translation,
    	QueryFilter filter,
    	float maxFraction,
    	Transform bodyTransform
    ) {
    	MemorySegment segment = castRay(
    		allocator,
    		bodyId.memorySegment(),
    		origin.memorySegment(),
    		translation.memorySegment(),
    		filter.memorySegment(),
    		maxFraction,
    		bodyTransform.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new BodyCastResult(segment);
    }
    
    /// ```
    /// Cast a shape at a specific body using a specified body transform.
    /// ```
    public static MemorySegment castShape(
    	SegmentAllocator allocator,
    	MemorySegment bodyId,
    	MemorySegment origin,
    	MemorySegment proxy,
    	MemorySegment translation,
    	MemorySegment filter,
    	float maxFraction,
    	boolean canEncroach,
    	MemorySegment bodyTransform
    ) {
    	MethodHandle method = B3_BODY_CAST_SHAPE.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			bodyId,
    			origin,
    			proxy,
    			translation,
    			filter,
    			maxFraction,
    			canEncroach,
    			bodyTransform
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#castShape].
    public static @Nullable BodyCastResult castShape(
    	SegmentAllocator allocator,
    	BodyId bodyId,
    	Vec3 origin,
    	ShapeProxy proxy,
    	Vec3 translation,
    	QueryFilter filter,
    	float maxFraction,
    	boolean canEncroach,
    	Transform bodyTransform
    ) {
    	MemorySegment segment = castShape(
    		allocator,
    		bodyId.memorySegment(),
    		origin.memorySegment(),
    		proxy.memorySegment(),
    		translation.memorySegment(),
    		filter.memorySegment(),
    		maxFraction,
    		canEncroach,
    		bodyTransform.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new BodyCastResult(segment);
    }
    
    /// ```
    /// Overlap a shape with a specific body using a specified body transform.
    /// ```
    public static boolean overlapShape(
    	MemorySegment bodyId,
    	MemorySegment origin,
    	MemorySegment proxy,
    	MemorySegment filter,
    	MemorySegment bodyTransform
    ) {
    	MethodHandle method = B3_BODY_OVERLAP_SHAPE.get();
    	try {
    		return (boolean) method.invokeExact(
    			bodyId,
    			origin,
    			proxy,
    			filter,
    			bodyTransform
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#overlapShape].
    public static boolean overlapShape(
    	BodyId bodyId,
    	Vec3 origin,
    	ShapeProxy proxy,
    	QueryFilter filter,
    	Transform bodyTransform
    ) {
    	return overlapShape(
    		bodyId.memorySegment(),
    		origin.memorySegment(),
    		proxy.memorySegment(),
    		filter.memorySegment(),
    		bodyTransform.memorySegment()
    	);
    }
    
    /// ```
    /// Collide a character mover with a specific body using a specified body transform.
    /// ```
    public static int collideMover(
    	MemorySegment bodyId,
    	MemorySegment bodyPlanes,
    	int planeCapacity,
    	MemorySegment origin,
    	MemorySegment mover,
    	MemorySegment filter,
    	MemorySegment bodyTransform
    ) {
    	MethodHandle method = B3_BODY_COLLIDE_MOVER.get();
    	try {
    		return (int) method.invokeExact(
    			bodyId,
    			bodyPlanes,
    			planeCapacity,
    			origin,
    			mover,
    			filter,
    			bodyTransform
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#collideMover].
    public static int collideMover(
    	BodyId bodyId,
    	BodyPlaneResult bodyPlanes,
    	int planeCapacity,
    	Vec3 origin,
    	Capsule mover,
    	QueryFilter filter,
    	Transform bodyTransform
    ) {
    	return collideMover(
    		bodyId.memorySegment(),
    		bodyPlanes.memorySegment(),
    		planeCapacity,
    		origin.memorySegment(),
    		mover.memorySegment(),
    		filter.memorySegment(),
    		bodyTransform.memorySegment()
    	);
    }
    
}