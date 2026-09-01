/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.box3d.joint;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.invoke.MethodHandle;
import org.jspecify.annotations.Nullable;
import volucris.bindings.box3d.math.Quat;
import volucris.bindings.box3d.math.Vec3;
import volucris.bindings.box3d.world.WorldId;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class SphericalJoint {

    private static final LazyConstant<MethodHandle> B3_CREATE_SPHERICAL_JOINT;
    private static final LazyConstant<MethodHandle> B3_SPHERICAL_JOINT_ENABLE_CONE_LIMIT;
    private static final LazyConstant<MethodHandle> B3_SPHERICAL_JOINT_IS_CONE_LIMIT_ENABLED;
    private static final LazyConstant<MethodHandle> B3_SPHERICAL_JOINT_GET_CONE_LIMIT;
    private static final LazyConstant<MethodHandle> B3_SPHERICAL_JOINT_SET_CONE_LIMIT;
    private static final LazyConstant<MethodHandle> B3_SPHERICAL_JOINT_GET_CONE_ANGLE;
    private static final LazyConstant<MethodHandle> B3_SPHERICAL_JOINT_ENABLE_TWIST_LIMIT;
    private static final LazyConstant<MethodHandle> B3_SPHERICAL_JOINT_IS_TWIST_LIMIT_ENABLED;
    private static final LazyConstant<MethodHandle> B3_SPHERICAL_JOINT_GET_LOWER_TWIST_LIMIT;
    private static final LazyConstant<MethodHandle> B3_SPHERICAL_JOINT_GET_UPPER_TWIST_LIMIT;
    private static final LazyConstant<MethodHandle> B3_SPHERICAL_JOINT_SET_TWIST_LIMITS;
    private static final LazyConstant<MethodHandle> B3_SPHERICAL_JOINT_GET_TWIST_ANGLE;
    private static final LazyConstant<MethodHandle> B3_SPHERICAL_JOINT_ENABLE_SPRING;
    private static final LazyConstant<MethodHandle> B3_SPHERICAL_JOINT_IS_SPRING_ENABLED;
    private static final LazyConstant<MethodHandle> B3_SPHERICAL_JOINT_SET_SPRING_HERTZ;
    private static final LazyConstant<MethodHandle> B3_SPHERICAL_JOINT_GET_SPRING_HERTZ;
    private static final LazyConstant<MethodHandle> B3_SPHERICAL_JOINT_SET_SPRING_DAMPING_RATIO;
    private static final LazyConstant<MethodHandle> B3_SPHERICAL_JOINT_GET_SPRING_DAMPING_RATIO;
    private static final LazyConstant<MethodHandle> B3_SPHERICAL_JOINT_SET_TARGET_ROTATION;
    private static final LazyConstant<MethodHandle> B3_SPHERICAL_JOINT_GET_TARGET_ROTATION;
    private static final LazyConstant<MethodHandle> B3_SPHERICAL_JOINT_ENABLE_MOTOR;
    private static final LazyConstant<MethodHandle> B3_SPHERICAL_JOINT_IS_MOTOR_ENABLED;
    private static final LazyConstant<MethodHandle> B3_SPHERICAL_JOINT_SET_MOTOR_VELOCITY;
    private static final LazyConstant<MethodHandle> B3_SPHERICAL_JOINT_GET_MOTOR_VELOCITY;
    private static final LazyConstant<MethodHandle> B3_SPHERICAL_JOINT_GET_MOTOR_TORQUE;
    private static final LazyConstant<MethodHandle> B3_SPHERICAL_JOINT_SET_MAX_MOTOR_TORQUE;
    private static final LazyConstant<MethodHandle> B3_SPHERICAL_JOINT_GET_MAX_MOTOR_TORQUE;

    static {
        //@formatter:off
        B3_CREATE_SPHERICAL_JOINT = downcallHandle("b3CreateSphericalJoint", JointId.LAYOUT, WorldId.LAYOUT, UNBOUNDED_ADDRESS);
        B3_SPHERICAL_JOINT_ENABLE_CONE_LIMIT = downcallHandleVoid("b3SphericalJoint_EnableConeLimit", JointId.LAYOUT, JAVA_BOOLEAN);
        B3_SPHERICAL_JOINT_IS_CONE_LIMIT_ENABLED = downcallHandle("b3SphericalJoint_IsConeLimitEnabled", JAVA_BOOLEAN, JointId.LAYOUT);
        B3_SPHERICAL_JOINT_GET_CONE_LIMIT = downcallHandle("b3SphericalJoint_GetConeLimit", JAVA_FLOAT, JointId.LAYOUT);
        B3_SPHERICAL_JOINT_SET_CONE_LIMIT = downcallHandleVoid("b3SphericalJoint_SetConeLimit", JointId.LAYOUT, JAVA_FLOAT);
        B3_SPHERICAL_JOINT_GET_CONE_ANGLE = downcallHandle("b3SphericalJoint_GetConeAngle", JAVA_FLOAT, JointId.LAYOUT);
        B3_SPHERICAL_JOINT_ENABLE_TWIST_LIMIT = downcallHandleVoid("b3SphericalJoint_EnableTwistLimit", JointId.LAYOUT, JAVA_BOOLEAN);
        B3_SPHERICAL_JOINT_IS_TWIST_LIMIT_ENABLED = downcallHandle("b3SphericalJoint_IsTwistLimitEnabled", JAVA_BOOLEAN, JointId.LAYOUT);
        B3_SPHERICAL_JOINT_GET_LOWER_TWIST_LIMIT = downcallHandle("b3SphericalJoint_GetLowerTwistLimit", JAVA_FLOAT, JointId.LAYOUT);
        B3_SPHERICAL_JOINT_GET_UPPER_TWIST_LIMIT = downcallHandle("b3SphericalJoint_GetUpperTwistLimit", JAVA_FLOAT, JointId.LAYOUT);
        B3_SPHERICAL_JOINT_SET_TWIST_LIMITS = downcallHandleVoid("b3SphericalJoint_SetTwistLimits", JointId.LAYOUT, JAVA_FLOAT, JAVA_FLOAT);
        B3_SPHERICAL_JOINT_GET_TWIST_ANGLE = downcallHandle("b3SphericalJoint_GetTwistAngle", JAVA_FLOAT, JointId.LAYOUT);
        B3_SPHERICAL_JOINT_ENABLE_SPRING = downcallHandleVoid("b3SphericalJoint_EnableSpring", JointId.LAYOUT, JAVA_BOOLEAN);
        B3_SPHERICAL_JOINT_IS_SPRING_ENABLED = downcallHandle("b3SphericalJoint_IsSpringEnabled", JAVA_BOOLEAN, JointId.LAYOUT);
        B3_SPHERICAL_JOINT_SET_SPRING_HERTZ = downcallHandleVoid("b3SphericalJoint_SetSpringHertz", JointId.LAYOUT, JAVA_FLOAT);
        B3_SPHERICAL_JOINT_GET_SPRING_HERTZ = downcallHandle("b3SphericalJoint_GetSpringHertz", JAVA_FLOAT, JointId.LAYOUT);
        B3_SPHERICAL_JOINT_SET_SPRING_DAMPING_RATIO = downcallHandleVoid("b3SphericalJoint_SetSpringDampingRatio", JointId.LAYOUT, JAVA_FLOAT);
        B3_SPHERICAL_JOINT_GET_SPRING_DAMPING_RATIO = downcallHandle("b3SphericalJoint_GetSpringDampingRatio", JAVA_FLOAT, JointId.LAYOUT);
        B3_SPHERICAL_JOINT_SET_TARGET_ROTATION = downcallHandleVoid("b3SphericalJoint_SetTargetRotation", JointId.LAYOUT, Quat.LAYOUT);
        B3_SPHERICAL_JOINT_GET_TARGET_ROTATION = downcallHandle("b3SphericalJoint_GetTargetRotation", Quat.LAYOUT, JointId.LAYOUT);
        B3_SPHERICAL_JOINT_ENABLE_MOTOR = downcallHandleVoid("b3SphericalJoint_EnableMotor", JointId.LAYOUT, JAVA_BOOLEAN);
        B3_SPHERICAL_JOINT_IS_MOTOR_ENABLED = downcallHandle("b3SphericalJoint_IsMotorEnabled", JAVA_BOOLEAN, JointId.LAYOUT);
        B3_SPHERICAL_JOINT_SET_MOTOR_VELOCITY = downcallHandleVoid("b3SphericalJoint_SetMotorVelocity", JointId.LAYOUT, Vec3.LAYOUT);
        B3_SPHERICAL_JOINT_GET_MOTOR_VELOCITY = downcallHandle("b3SphericalJoint_GetMotorVelocity", Vec3.LAYOUT, JointId.LAYOUT);
        B3_SPHERICAL_JOINT_GET_MOTOR_TORQUE = downcallHandle("b3SphericalJoint_GetMotorTorque", Vec3.LAYOUT, JointId.LAYOUT);
        B3_SPHERICAL_JOINT_SET_MAX_MOTOR_TORQUE = downcallHandleVoid("b3SphericalJoint_SetMaxMotorTorque", JointId.LAYOUT, JAVA_FLOAT);
        B3_SPHERICAL_JOINT_GET_MAX_MOTOR_TORQUE = downcallHandle("b3SphericalJoint_GetMaxMotorTorque", JAVA_FLOAT, JointId.LAYOUT);
        //@formatter:on
    }

    private SphericalJoint() {
    }

    /// ```
    /// Create a spherical joint
    /// @see b3SphericalJointDef for details
    /// ```
    public static MemorySegment createSphericalJoint(
    	SegmentAllocator allocator,
    	MemorySegment worldId,
    	MemorySegment def
    ) {
    	MethodHandle method = B3_CREATE_SPHERICAL_JOINT.get();
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
    
    /// Typed method of [#createSphericalJoint].
    public static @Nullable JointId createSphericalJoint(
    	SegmentAllocator allocator,
    	WorldId worldId,
    	SphericalJointDef def
    ) {
    	MemorySegment segment = createSphericalJoint(
    		allocator,
    		worldId.memorySegment(),
    		def.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new JointId(segment);
    }
    
    /// ```
    /// Enable/disable the spherical joint cone limit
    /// ```
    public static void enableConeLimit(
    	MemorySegment jointId,
    	boolean enableLimit
    ) {
    	MethodHandle method = B3_SPHERICAL_JOINT_ENABLE_CONE_LIMIT.get();
    	try {
    		 method.invokeExact(
    			jointId,
    			enableLimit
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#enableConeLimit].
    public static void enableConeLimit(
    	JointId jointId,
    	boolean enableLimit
    ) {
    	enableConeLimit(
    		jointId.memorySegment(),
    		enableLimit
    	);
    }
    
    /// ```
    /// Is the spherical joint cone limit enabled?
    /// ```
    public static boolean isConeLimitEnabled(
    	MemorySegment jointId
    ) {
    	MethodHandle method = B3_SPHERICAL_JOINT_IS_CONE_LIMIT_ENABLED.get();
    	try {
    		return (boolean) method.invokeExact(
    			jointId
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#isConeLimitEnabled].
    public static boolean isConeLimitEnabled(
    	JointId jointId
    ) {
    	return isConeLimitEnabled(
    		jointId.memorySegment()
    	);
    }
    
    /// ```
    /// Get the spherical joint cone limit in radians
    /// ```
    public static float getConeLimit(
    	MemorySegment jointId
    ) {
    	MethodHandle method = B3_SPHERICAL_JOINT_GET_CONE_LIMIT.get();
    	try {
    		return (float) method.invokeExact(
    			jointId
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getConeLimit].
    public static float getConeLimit(
    	JointId jointId
    ) {
    	return getConeLimit(
    		jointId.memorySegment()
    	);
    }
    
    /// ```
    /// Set the spherical joint limits in radians
    /// ```
    public static void setConeLimit(
    	MemorySegment jointId,
    	float angleRadians
    ) {
    	MethodHandle method = B3_SPHERICAL_JOINT_SET_CONE_LIMIT.get();
    	try {
    		 method.invokeExact(
    			jointId,
    			angleRadians
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setConeLimit].
    public static void setConeLimit(
    	JointId jointId,
    	float angleRadians
    ) {
    	setConeLimit(
    		jointId.memorySegment(),
    		angleRadians
    	);
    }
    
    /// ```
    /// Get the spherical joint current cone angle in radians.
    /// ```
    public static float getConeAngle(
    	MemorySegment jointId
    ) {
    	MethodHandle method = B3_SPHERICAL_JOINT_GET_CONE_ANGLE.get();
    	try {
    		return (float) method.invokeExact(
    			jointId
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getConeAngle].
    public static float getConeAngle(
    	JointId jointId
    ) {
    	return getConeAngle(
    		jointId.memorySegment()
    	);
    }
    
    /// ```
    /// Enable/disable the spherical joint limit
    /// ```
    public static void enableTwistLimit(
    	MemorySegment jointId,
    	boolean enableLimit
    ) {
    	MethodHandle method = B3_SPHERICAL_JOINT_ENABLE_TWIST_LIMIT.get();
    	try {
    		 method.invokeExact(
    			jointId,
    			enableLimit
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#enableTwistLimit].
    public static void enableTwistLimit(
    	JointId jointId,
    	boolean enableLimit
    ) {
    	enableTwistLimit(
    		jointId.memorySegment(),
    		enableLimit
    	);
    }
    
    /// ```
    /// Is the spherical joint limit enabled?
    /// ```
    public static boolean isTwistLimitEnabled(
    	MemorySegment jointId
    ) {
    	MethodHandle method = B3_SPHERICAL_JOINT_IS_TWIST_LIMIT_ENABLED.get();
    	try {
    		return (boolean) method.invokeExact(
    			jointId
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#isTwistLimitEnabled].
    public static boolean isTwistLimitEnabled(
    	JointId jointId
    ) {
    	return isTwistLimitEnabled(
    		jointId.memorySegment()
    	);
    }
    
    /// ```
    /// Get the spherical joint lower limit in radians
    /// ```
    public static float getLowerTwistLimit(
    	MemorySegment jointId
    ) {
    	MethodHandle method = B3_SPHERICAL_JOINT_GET_LOWER_TWIST_LIMIT.get();
    	try {
    		return (float) method.invokeExact(
    			jointId
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getLowerTwistLimit].
    public static float getLowerTwistLimit(
    	JointId jointId
    ) {
    	return getLowerTwistLimit(
    		jointId.memorySegment()
    	);
    }
    
    /// ```
    /// Get the spherical joint upper limit in radians
    /// ```
    public static float getUpperTwistLimit(
    	MemorySegment jointId
    ) {
    	MethodHandle method = B3_SPHERICAL_JOINT_GET_UPPER_TWIST_LIMIT.get();
    	try {
    		return (float) method.invokeExact(
    			jointId
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getUpperTwistLimit].
    public static float getUpperTwistLimit(
    	JointId jointId
    ) {
    	return getUpperTwistLimit(
    		jointId.memorySegment()
    	);
    }
    
    /// ```
    /// Set the spherical joint limits in radians
    /// ```
    public static void setTwistLimits(
    	MemorySegment jointId,
    	float lowerLimitRadians,
    	float upperLimitRadians
    ) {
    	MethodHandle method = B3_SPHERICAL_JOINT_SET_TWIST_LIMITS.get();
    	try {
    		 method.invokeExact(
    			jointId,
    			lowerLimitRadians,
    			upperLimitRadians
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setTwistLimits].
    public static void setTwistLimits(
    	JointId jointId,
    	float lowerLimitRadians,
    	float upperLimitRadians
    ) {
    	setTwistLimits(
    		jointId.memorySegment(),
    		lowerLimitRadians,
    		upperLimitRadians
    	);
    }
    
    /// ```
    /// Get the spherical joint current twist angle in radians.
    /// ```
    public static float getTwistAngle(
    	MemorySegment jointId
    ) {
    	MethodHandle method = B3_SPHERICAL_JOINT_GET_TWIST_ANGLE.get();
    	try {
    		return (float) method.invokeExact(
    			jointId
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getTwistAngle].
    public static float getTwistAngle(
    	JointId jointId
    ) {
    	return getTwistAngle(
    		jointId.memorySegment()
    	);
    }
    
    /// ```
    /// Enable/disable the spherical joint spring
    /// ```
    public static void enableSpring(
    	MemorySegment jointId,
    	boolean enableSpring
    ) {
    	MethodHandle method = B3_SPHERICAL_JOINT_ENABLE_SPRING.get();
    	try {
    		 method.invokeExact(
    			jointId,
    			enableSpring
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#enableSpring].
    public static void enableSpring(
    	JointId jointId,
    	boolean enableSpring
    ) {
    	enableSpring(
    		jointId.memorySegment(),
    		enableSpring
    	);
    }
    
    /// ```
    /// Is the spherical angular spring enabled?
    /// ```
    public static boolean isSpringEnabled(
    	MemorySegment jointId
    ) {
    	MethodHandle method = B3_SPHERICAL_JOINT_IS_SPRING_ENABLED.get();
    	try {
    		return (boolean) method.invokeExact(
    			jointId
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#isSpringEnabled].
    public static boolean isSpringEnabled(
    	JointId jointId
    ) {
    	return isSpringEnabled(
    		jointId.memorySegment()
    	);
    }
    
    /// ```
    /// Set the spherical joint spring stiffness in Hertz
    /// ```
    public static void setSpringHertz(
    	MemorySegment jointId,
    	float hertz
    ) {
    	MethodHandle method = B3_SPHERICAL_JOINT_SET_SPRING_HERTZ.get();
    	try {
    		 method.invokeExact(
    			jointId,
    			hertz
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setSpringHertz].
    public static void setSpringHertz(
    	JointId jointId,
    	float hertz
    ) {
    	setSpringHertz(
    		jointId.memorySegment(),
    		hertz
    	);
    }
    
    /// ```
    /// Get the spherical joint spring stiffness in Hertz
    /// ```
    public static float getSpringHertz(
    	MemorySegment jointId
    ) {
    	MethodHandle method = B3_SPHERICAL_JOINT_GET_SPRING_HERTZ.get();
    	try {
    		return (float) method.invokeExact(
    			jointId
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getSpringHertz].
    public static float getSpringHertz(
    	JointId jointId
    ) {
    	return getSpringHertz(
    		jointId.memorySegment()
    	);
    }
    
    /// ```
    /// Set the spherical joint spring damping ratio, non-dimensional
    /// ```
    public static void setSpringDampingRatio(
    	MemorySegment jointId,
    	float dampingRatio
    ) {
    	MethodHandle method = B3_SPHERICAL_JOINT_SET_SPRING_DAMPING_RATIO.get();
    	try {
    		 method.invokeExact(
    			jointId,
    			dampingRatio
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setSpringDampingRatio].
    public static void setSpringDampingRatio(
    	JointId jointId,
    	float dampingRatio
    ) {
    	setSpringDampingRatio(
    		jointId.memorySegment(),
    		dampingRatio
    	);
    }
    
    /// ```
    /// Get the spherical joint spring damping ratio, non-dimensional
    /// ```
    public static float getSpringDampingRatio(
    	MemorySegment jointId
    ) {
    	MethodHandle method = B3_SPHERICAL_JOINT_GET_SPRING_DAMPING_RATIO.get();
    	try {
    		return (float) method.invokeExact(
    			jointId
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getSpringDampingRatio].
    public static float getSpringDampingRatio(
    	JointId jointId
    ) {
    	return getSpringDampingRatio(
    		jointId.memorySegment()
    	);
    }
    
    /// ```
    /// Set the spherical joint spring target rotation
    /// ```
    public static void setTargetRotation(
    	MemorySegment jointId,
    	MemorySegment targetRotation
    ) {
    	MethodHandle method = B3_SPHERICAL_JOINT_SET_TARGET_ROTATION.get();
    	try {
    		 method.invokeExact(
    			jointId,
    			targetRotation
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setTargetRotation].
    public static void setTargetRotation(
    	JointId jointId,
    	Quat targetRotation
    ) {
    	setTargetRotation(
    		jointId.memorySegment(),
    		targetRotation.memorySegment()
    	);
    }
    
    /// ```
    /// Get the spherical joint spring target rotation
    /// ```
    public static MemorySegment getTargetRotation(
    	SegmentAllocator allocator,
    	MemorySegment jointId
    ) {
    	MethodHandle method = B3_SPHERICAL_JOINT_GET_TARGET_ROTATION.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			jointId
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getTargetRotation].
    public static @Nullable Quat getTargetRotation(
    	SegmentAllocator allocator,
    	JointId jointId
    ) {
    	MemorySegment segment = getTargetRotation(
    		allocator,
    		jointId.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new Quat(segment);
    }
    
    /// ```
    /// Enable/disable a spherical joint motor
    /// ```
    public static void enableMotor(
    	MemorySegment jointId,
    	boolean enableMotor
    ) {
    	MethodHandle method = B3_SPHERICAL_JOINT_ENABLE_MOTOR.get();
    	try {
    		 method.invokeExact(
    			jointId,
    			enableMotor
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#enableMotor].
    public static void enableMotor(
    	JointId jointId,
    	boolean enableMotor
    ) {
    	enableMotor(
    		jointId.memorySegment(),
    		enableMotor
    	);
    }
    
    /// ```
    /// Is the spherical joint motor enabled?
    /// ```
    public static boolean isMotorEnabled(
    	MemorySegment jointId
    ) {
    	MethodHandle method = B3_SPHERICAL_JOINT_IS_MOTOR_ENABLED.get();
    	try {
    		return (boolean) method.invokeExact(
    			jointId
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#isMotorEnabled].
    public static boolean isMotorEnabled(
    	JointId jointId
    ) {
    	return isMotorEnabled(
    		jointId.memorySegment()
    	);
    }
    
    /// ```
    /// Set the spherical joint motor velocity in radians per second
    /// ```
    public static void setMotorVelocity(
    	MemorySegment jointId,
    	MemorySegment motorVelocity
    ) {
    	MethodHandle method = B3_SPHERICAL_JOINT_SET_MOTOR_VELOCITY.get();
    	try {
    		 method.invokeExact(
    			jointId,
    			motorVelocity
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setMotorVelocity].
    public static void setMotorVelocity(
    	JointId jointId,
    	Vec3 motorVelocity
    ) {
    	setMotorVelocity(
    		jointId.memorySegment(),
    		motorVelocity.memorySegment()
    	);
    }
    
    /// ```
    /// Get the spherical joint motor velocity in radians per second
    /// ```
    public static MemorySegment getMotorVelocity(
    	SegmentAllocator allocator,
    	MemorySegment jointId
    ) {
    	MethodHandle method = B3_SPHERICAL_JOINT_GET_MOTOR_VELOCITY.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			jointId
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getMotorVelocity].
    public static @Nullable Vec3 getMotorVelocity(
    	SegmentAllocator allocator,
    	JointId jointId
    ) {
    	MemorySegment segment = getMotorVelocity(
    		allocator,
    		jointId.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new Vec3(segment);
    }
    
    /// ```
    /// Get the spherical joint current motor torque, usually in newton-meters
    /// ```
    public static MemorySegment getMotorTorque(
    	SegmentAllocator allocator,
    	MemorySegment jointId
    ) {
    	MethodHandle method = B3_SPHERICAL_JOINT_GET_MOTOR_TORQUE.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			jointId
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getMotorTorque].
    public static @Nullable Vec3 getMotorTorque(
    	SegmentAllocator allocator,
    	JointId jointId
    ) {
    	MemorySegment segment = getMotorTorque(
    		allocator,
    		jointId.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new Vec3(segment);
    }
    
    /// ```
    /// Set the spherical joint maximum motor torque, usually in newton-meters
    /// ```
    public static void setMaxMotorTorque(
    	MemorySegment jointId,
    	float torque
    ) {
    	MethodHandle method = B3_SPHERICAL_JOINT_SET_MAX_MOTOR_TORQUE.get();
    	try {
    		 method.invokeExact(
    			jointId,
    			torque
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setMaxMotorTorque].
    public static void setMaxMotorTorque(
    	JointId jointId,
    	float torque
    ) {
    	setMaxMotorTorque(
    		jointId.memorySegment(),
    		torque
    	);
    }
    
    /// ```
    /// Get the spherical joint maximum motor torque, usually in newton-meters
    /// ```
    public static float getMaxMotorTorque(
    	MemorySegment jointId
    ) {
    	MethodHandle method = B3_SPHERICAL_JOINT_GET_MAX_MOTOR_TORQUE.get();
    	try {
    		return (float) method.invokeExact(
    			jointId
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getMaxMotorTorque].
    public static float getMaxMotorTorque(
    	JointId jointId
    ) {
    	return getMaxMotorTorque(
    		jointId.memorySegment()
    	);
    }
    
}