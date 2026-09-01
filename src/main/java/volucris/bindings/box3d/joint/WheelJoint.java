/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.box3d.joint;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.invoke.MethodHandle;
import org.jspecify.annotations.Nullable;
import volucris.bindings.box3d.world.WorldId;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class WheelJoint {

    private static final LazyConstant<MethodHandle> B3_CREATE_WHEEL_JOINT;
    private static final LazyConstant<MethodHandle> B3_WHEEL_JOINT_ENABLE_SUSPENSION;
    private static final LazyConstant<MethodHandle> B3_WHEEL_JOINT_IS_SUSPENSION_ENABLED;
    private static final LazyConstant<MethodHandle> B3_WHEEL_JOINT_SET_SUSPENSION_HERTZ;
    private static final LazyConstant<MethodHandle> B3_WHEEL_JOINT_GET_SUSPENSION_HERTZ;
    private static final LazyConstant<MethodHandle> B3_WHEEL_JOINT_SET_SUSPENSION_DAMPING_RATIO;
    private static final LazyConstant<MethodHandle> B3_WHEEL_JOINT_GET_SUSPENSION_DAMPING_RATIO;
    private static final LazyConstant<MethodHandle> B3_WHEEL_JOINT_ENABLE_SUSPENSION_LIMIT;
    private static final LazyConstant<MethodHandle> B3_WHEEL_JOINT_IS_SUSPENSION_LIMIT_ENABLED;
    private static final LazyConstant<MethodHandle> B3_WHEEL_JOINT_GET_LOWER_SUSPENSION_LIMIT;
    private static final LazyConstant<MethodHandle> B3_WHEEL_JOINT_GET_UPPER_SUSPENSION_LIMIT;
    private static final LazyConstant<MethodHandle> B3_WHEEL_JOINT_SET_SUSPENSION_LIMITS;
    private static final LazyConstant<MethodHandle> B3_WHEEL_JOINT_ENABLE_SPIN_MOTOR;
    private static final LazyConstant<MethodHandle> B3_WHEEL_JOINT_IS_SPIN_MOTOR_ENABLED;
    private static final LazyConstant<MethodHandle> B3_WHEEL_JOINT_SET_SPIN_MOTOR_SPEED;
    private static final LazyConstant<MethodHandle> B3_WHEEL_JOINT_GET_SPIN_MOTOR_SPEED;
    private static final LazyConstant<MethodHandle> B3_WHEEL_JOINT_SET_MAX_SPIN_TORQUE;
    private static final LazyConstant<MethodHandle> B3_WHEEL_JOINT_GET_MAX_SPIN_TORQUE;
    private static final LazyConstant<MethodHandle> B3_WHEEL_JOINT_GET_SPIN_SPEED;
    private static final LazyConstant<MethodHandle> B3_WHEEL_JOINT_GET_SPIN_TORQUE;
    private static final LazyConstant<MethodHandle> B3_WHEEL_JOINT_ENABLE_STEERING;
    private static final LazyConstant<MethodHandle> B3_WHEEL_JOINT_IS_STEERING_ENABLED;
    private static final LazyConstant<MethodHandle> B3_WHEEL_JOINT_SET_STEERING_HERTZ;
    private static final LazyConstant<MethodHandle> B3_WHEEL_JOINT_GET_STEERING_HERTZ;
    private static final LazyConstant<MethodHandle> B3_WHEEL_JOINT_SET_STEERING_DAMPING_RATIO;
    private static final LazyConstant<MethodHandle> B3_WHEEL_JOINT_GET_STEERING_DAMPING_RATIO;
    private static final LazyConstant<MethodHandle> B3_WHEEL_JOINT_SET_MAX_STEERING_TORQUE;
    private static final LazyConstant<MethodHandle> B3_WHEEL_JOINT_GET_MAX_STEERING_TORQUE;
    private static final LazyConstant<MethodHandle> B3_WHEEL_JOINT_ENABLE_STEERING_LIMIT;
    private static final LazyConstant<MethodHandle> B3_WHEEL_JOINT_IS_STEERING_LIMIT_ENABLED;
    private static final LazyConstant<MethodHandle> B3_WHEEL_JOINT_GET_LOWER_STEERING_LIMIT;
    private static final LazyConstant<MethodHandle> B3_WHEEL_JOINT_GET_UPPER_STEERING_LIMIT;
    private static final LazyConstant<MethodHandle> B3_WHEEL_JOINT_SET_STEERING_LIMITS;
    private static final LazyConstant<MethodHandle> B3_WHEEL_JOINT_SET_TARGET_STEERING_ANGLE;
    private static final LazyConstant<MethodHandle> B3_WHEEL_JOINT_GET_TARGET_STEERING_ANGLE;
    private static final LazyConstant<MethodHandle> B3_WHEEL_JOINT_GET_STEERING_ANGLE;
    private static final LazyConstant<MethodHandle> B3_WHEEL_JOINT_GET_STEERING_TORQUE;

    static {
        //@formatter:off
        B3_CREATE_WHEEL_JOINT = downcallHandle("b3CreateWheelJoint", JointId.LAYOUT, WorldId.LAYOUT, UNBOUNDED_ADDRESS);
        B3_WHEEL_JOINT_ENABLE_SUSPENSION = downcallHandleVoid("b3WheelJoint_EnableSuspension", JointId.LAYOUT, JAVA_BOOLEAN);
        B3_WHEEL_JOINT_IS_SUSPENSION_ENABLED = downcallHandle("b3WheelJoint_IsSuspensionEnabled", JAVA_BOOLEAN, JointId.LAYOUT);
        B3_WHEEL_JOINT_SET_SUSPENSION_HERTZ = downcallHandleVoid("b3WheelJoint_SetSuspensionHertz", JointId.LAYOUT, JAVA_FLOAT);
        B3_WHEEL_JOINT_GET_SUSPENSION_HERTZ = downcallHandle("b3WheelJoint_GetSuspensionHertz", JAVA_FLOAT, JointId.LAYOUT);
        B3_WHEEL_JOINT_SET_SUSPENSION_DAMPING_RATIO = downcallHandleVoid("b3WheelJoint_SetSuspensionDampingRatio", JointId.LAYOUT, JAVA_FLOAT);
        B3_WHEEL_JOINT_GET_SUSPENSION_DAMPING_RATIO = downcallHandle("b3WheelJoint_GetSuspensionDampingRatio", JAVA_FLOAT, JointId.LAYOUT);
        B3_WHEEL_JOINT_ENABLE_SUSPENSION_LIMIT = downcallHandleVoid("b3WheelJoint_EnableSuspensionLimit", JointId.LAYOUT, JAVA_BOOLEAN);
        B3_WHEEL_JOINT_IS_SUSPENSION_LIMIT_ENABLED = downcallHandle("b3WheelJoint_IsSuspensionLimitEnabled", JAVA_BOOLEAN, JointId.LAYOUT);
        B3_WHEEL_JOINT_GET_LOWER_SUSPENSION_LIMIT = downcallHandle("b3WheelJoint_GetLowerSuspensionLimit", JAVA_FLOAT, JointId.LAYOUT);
        B3_WHEEL_JOINT_GET_UPPER_SUSPENSION_LIMIT = downcallHandle("b3WheelJoint_GetUpperSuspensionLimit", JAVA_FLOAT, JointId.LAYOUT);
        B3_WHEEL_JOINT_SET_SUSPENSION_LIMITS = downcallHandleVoid("b3WheelJoint_SetSuspensionLimits", JointId.LAYOUT, JAVA_FLOAT, JAVA_FLOAT);
        B3_WHEEL_JOINT_ENABLE_SPIN_MOTOR = downcallHandleVoid("b3WheelJoint_EnableSpinMotor", JointId.LAYOUT, JAVA_BOOLEAN);
        B3_WHEEL_JOINT_IS_SPIN_MOTOR_ENABLED = downcallHandle("b3WheelJoint_IsSpinMotorEnabled", JAVA_BOOLEAN, JointId.LAYOUT);
        B3_WHEEL_JOINT_SET_SPIN_MOTOR_SPEED = downcallHandleVoid("b3WheelJoint_SetSpinMotorSpeed", JointId.LAYOUT, JAVA_FLOAT);
        B3_WHEEL_JOINT_GET_SPIN_MOTOR_SPEED = downcallHandle("b3WheelJoint_GetSpinMotorSpeed", JAVA_FLOAT, JointId.LAYOUT);
        B3_WHEEL_JOINT_SET_MAX_SPIN_TORQUE = downcallHandleVoid("b3WheelJoint_SetMaxSpinTorque", JointId.LAYOUT, JAVA_FLOAT);
        B3_WHEEL_JOINT_GET_MAX_SPIN_TORQUE = downcallHandle("b3WheelJoint_GetMaxSpinTorque", JAVA_FLOAT, JointId.LAYOUT);
        B3_WHEEL_JOINT_GET_SPIN_SPEED = downcallHandle("b3WheelJoint_GetSpinSpeed", JAVA_FLOAT, JointId.LAYOUT);
        B3_WHEEL_JOINT_GET_SPIN_TORQUE = downcallHandle("b3WheelJoint_GetSpinTorque", JAVA_FLOAT, JointId.LAYOUT);
        B3_WHEEL_JOINT_ENABLE_STEERING = downcallHandleVoid("b3WheelJoint_EnableSteering", JointId.LAYOUT, JAVA_BOOLEAN);
        B3_WHEEL_JOINT_IS_STEERING_ENABLED = downcallHandle("b3WheelJoint_IsSteeringEnabled", JAVA_BOOLEAN, JointId.LAYOUT);
        B3_WHEEL_JOINT_SET_STEERING_HERTZ = downcallHandleVoid("b3WheelJoint_SetSteeringHertz", JointId.LAYOUT, JAVA_FLOAT);
        B3_WHEEL_JOINT_GET_STEERING_HERTZ = downcallHandle("b3WheelJoint_GetSteeringHertz", JAVA_FLOAT, JointId.LAYOUT);
        B3_WHEEL_JOINT_SET_STEERING_DAMPING_RATIO = downcallHandleVoid("b3WheelJoint_SetSteeringDampingRatio", JointId.LAYOUT, JAVA_FLOAT);
        B3_WHEEL_JOINT_GET_STEERING_DAMPING_RATIO = downcallHandle("b3WheelJoint_GetSteeringDampingRatio", JAVA_FLOAT, JointId.LAYOUT);
        B3_WHEEL_JOINT_SET_MAX_STEERING_TORQUE = downcallHandleVoid("b3WheelJoint_SetMaxSteeringTorque", JointId.LAYOUT, JAVA_FLOAT);
        B3_WHEEL_JOINT_GET_MAX_STEERING_TORQUE = downcallHandle("b3WheelJoint_GetMaxSteeringTorque", JAVA_FLOAT, JointId.LAYOUT);
        B3_WHEEL_JOINT_ENABLE_STEERING_LIMIT = downcallHandleVoid("b3WheelJoint_EnableSteeringLimit", JointId.LAYOUT, JAVA_BOOLEAN);
        B3_WHEEL_JOINT_IS_STEERING_LIMIT_ENABLED = downcallHandle("b3WheelJoint_IsSteeringLimitEnabled", JAVA_BOOLEAN, JointId.LAYOUT);
        B3_WHEEL_JOINT_GET_LOWER_STEERING_LIMIT = downcallHandle("b3WheelJoint_GetLowerSteeringLimit", JAVA_FLOAT, JointId.LAYOUT);
        B3_WHEEL_JOINT_GET_UPPER_STEERING_LIMIT = downcallHandle("b3WheelJoint_GetUpperSteeringLimit", JAVA_FLOAT, JointId.LAYOUT);
        B3_WHEEL_JOINT_SET_STEERING_LIMITS = downcallHandleVoid("b3WheelJoint_SetSteeringLimits", JointId.LAYOUT, JAVA_FLOAT, JAVA_FLOAT);
        B3_WHEEL_JOINT_SET_TARGET_STEERING_ANGLE = downcallHandleVoid("b3WheelJoint_SetTargetSteeringAngle", JointId.LAYOUT, JAVA_FLOAT);
        B3_WHEEL_JOINT_GET_TARGET_STEERING_ANGLE = downcallHandle("b3WheelJoint_GetTargetSteeringAngle", JAVA_FLOAT, JointId.LAYOUT);
        B3_WHEEL_JOINT_GET_STEERING_ANGLE = downcallHandle("b3WheelJoint_GetSteeringAngle", JAVA_FLOAT, JointId.LAYOUT);
        B3_WHEEL_JOINT_GET_STEERING_TORQUE = downcallHandle("b3WheelJoint_GetSteeringTorque", JAVA_FLOAT, JointId.LAYOUT);
        //@formatter:on
    }

    private WheelJoint() {
    }

    /// ```
    /// Create a wheel joint.
    /// @see b3WheelJointDef for details.
    /// ```
    public static MemorySegment createWheelJoint(
    	SegmentAllocator allocator,
    	MemorySegment worldId,
    	MemorySegment def
    ) {
    	MethodHandle method = B3_CREATE_WHEEL_JOINT.get();
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
    
    /// Typed method of [#createWheelJoint].
    public static @Nullable JointId createWheelJoint(
    	SegmentAllocator allocator,
    	WorldId worldId,
    	WheelJointDef def
    ) {
    	MemorySegment segment = createWheelJoint(
    		allocator,
    		worldId.memorySegment(),
    		def.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new JointId(segment);
    }
    
    /// ```
    /// Enable/disable the wheel joint spring.
    /// ```
    public static void enableSuspension(
    	MemorySegment jointId,
    	boolean flag
    ) {
    	MethodHandle method = B3_WHEEL_JOINT_ENABLE_SUSPENSION.get();
    	try {
    		 method.invokeExact(
    			jointId,
    			flag
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#enableSuspension].
    public static void enableSuspension(
    	JointId jointId,
    	boolean flag
    ) {
    	enableSuspension(
    		jointId.memorySegment(),
    		flag
    	);
    }
    
    /// ```
    /// Is the wheel joint spring enabled?
    /// ```
    public static boolean isSuspensionEnabled(
    	MemorySegment jointId
    ) {
    	MethodHandle method = B3_WHEEL_JOINT_IS_SUSPENSION_ENABLED.get();
    	try {
    		return (boolean) method.invokeExact(
    			jointId
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#isSuspensionEnabled].
    public static boolean isSuspensionEnabled(
    	JointId jointId
    ) {
    	return isSuspensionEnabled(
    		jointId.memorySegment()
    	);
    }
    
    /// ```
    /// Set the wheel joint stiffness in Hertz.
    /// ```
    public static void setSuspensionHertz(
    	MemorySegment jointId,
    	float hertz
    ) {
    	MethodHandle method = B3_WHEEL_JOINT_SET_SUSPENSION_HERTZ.get();
    	try {
    		 method.invokeExact(
    			jointId,
    			hertz
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setSuspensionHertz].
    public static void setSuspensionHertz(
    	JointId jointId,
    	float hertz
    ) {
    	setSuspensionHertz(
    		jointId.memorySegment(),
    		hertz
    	);
    }
    
    /// ```
    /// Get the wheel joint stiffness in Hertz.
    /// ```
    public static float getSuspensionHertz(
    	MemorySegment jointId
    ) {
    	MethodHandle method = B3_WHEEL_JOINT_GET_SUSPENSION_HERTZ.get();
    	try {
    		return (float) method.invokeExact(
    			jointId
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getSuspensionHertz].
    public static float getSuspensionHertz(
    	JointId jointId
    ) {
    	return getSuspensionHertz(
    		jointId.memorySegment()
    	);
    }
    
    /// ```
    /// Set the wheel joint damping ratio, non-dimensional.
    /// ```
    public static void setSuspensionDampingRatio(
    	MemorySegment jointId,
    	float dampingRatio
    ) {
    	MethodHandle method = B3_WHEEL_JOINT_SET_SUSPENSION_DAMPING_RATIO.get();
    	try {
    		 method.invokeExact(
    			jointId,
    			dampingRatio
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setSuspensionDampingRatio].
    public static void setSuspensionDampingRatio(
    	JointId jointId,
    	float dampingRatio
    ) {
    	setSuspensionDampingRatio(
    		jointId.memorySegment(),
    		dampingRatio
    	);
    }
    
    /// ```
    /// Get the wheel joint damping ratio, non-dimensional.
    /// ```
    public static float getSuspensionDampingRatio(
    	MemorySegment jointId
    ) {
    	MethodHandle method = B3_WHEEL_JOINT_GET_SUSPENSION_DAMPING_RATIO.get();
    	try {
    		return (float) method.invokeExact(
    			jointId
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getSuspensionDampingRatio].
    public static float getSuspensionDampingRatio(
    	JointId jointId
    ) {
    	return getSuspensionDampingRatio(
    		jointId.memorySegment()
    	);
    }
    
    /// ```
    /// Enable/disable the wheel joint limit.
    /// ```
    public static void enableSuspensionLimit(
    	MemorySegment jointId,
    	boolean flag
    ) {
    	MethodHandle method = B3_WHEEL_JOINT_ENABLE_SUSPENSION_LIMIT.get();
    	try {
    		 method.invokeExact(
    			jointId,
    			flag
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#enableSuspensionLimit].
    public static void enableSuspensionLimit(
    	JointId jointId,
    	boolean flag
    ) {
    	enableSuspensionLimit(
    		jointId.memorySegment(),
    		flag
    	);
    }
    
    /// ```
    /// Is the wheel joint limit enabled?
    /// ```
    public static boolean isSuspensionLimitEnabled(
    	MemorySegment jointId
    ) {
    	MethodHandle method = B3_WHEEL_JOINT_IS_SUSPENSION_LIMIT_ENABLED.get();
    	try {
    		return (boolean) method.invokeExact(
    			jointId
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#isSuspensionLimitEnabled].
    public static boolean isSuspensionLimitEnabled(
    	JointId jointId
    ) {
    	return isSuspensionLimitEnabled(
    		jointId.memorySegment()
    	);
    }
    
    /// ```
    /// Get the wheel joint lower limit.
    /// ```
    public static float getLowerSuspensionLimit(
    	MemorySegment jointId
    ) {
    	MethodHandle method = B3_WHEEL_JOINT_GET_LOWER_SUSPENSION_LIMIT.get();
    	try {
    		return (float) method.invokeExact(
    			jointId
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getLowerSuspensionLimit].
    public static float getLowerSuspensionLimit(
    	JointId jointId
    ) {
    	return getLowerSuspensionLimit(
    		jointId.memorySegment()
    	);
    }
    
    /// ```
    /// Get the wheel joint upper limit.
    /// ```
    public static float getUpperSuspensionLimit(
    	MemorySegment jointId
    ) {
    	MethodHandle method = B3_WHEEL_JOINT_GET_UPPER_SUSPENSION_LIMIT.get();
    	try {
    		return (float) method.invokeExact(
    			jointId
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getUpperSuspensionLimit].
    public static float getUpperSuspensionLimit(
    	JointId jointId
    ) {
    	return getUpperSuspensionLimit(
    		jointId.memorySegment()
    	);
    }
    
    /// ```
    /// Set the wheel joint limits.
    /// ```
    public static void setSuspensionLimits(
    	MemorySegment jointId,
    	float lower,
    	float upper
    ) {
    	MethodHandle method = B3_WHEEL_JOINT_SET_SUSPENSION_LIMITS.get();
    	try {
    		 method.invokeExact(
    			jointId,
    			lower,
    			upper
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setSuspensionLimits].
    public static void setSuspensionLimits(
    	JointId jointId,
    	float lower,
    	float upper
    ) {
    	setSuspensionLimits(
    		jointId.memorySegment(),
    		lower,
    		upper
    	);
    }
    
    /// ```
    /// Enable/disable the wheel joint motor.
    /// ```
    public static void enableSpinMotor(
    	MemorySegment jointId,
    	boolean flag
    ) {
    	MethodHandle method = B3_WHEEL_JOINT_ENABLE_SPIN_MOTOR.get();
    	try {
    		 method.invokeExact(
    			jointId,
    			flag
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#enableSpinMotor].
    public static void enableSpinMotor(
    	JointId jointId,
    	boolean flag
    ) {
    	enableSpinMotor(
    		jointId.memorySegment(),
    		flag
    	);
    }
    
    /// ```
    /// Is the wheel joint motor enabled?
    /// ```
    public static boolean isSpinMotorEnabled(
    	MemorySegment jointId
    ) {
    	MethodHandle method = B3_WHEEL_JOINT_IS_SPIN_MOTOR_ENABLED.get();
    	try {
    		return (boolean) method.invokeExact(
    			jointId
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#isSpinMotorEnabled].
    public static boolean isSpinMotorEnabled(
    	JointId jointId
    ) {
    	return isSpinMotorEnabled(
    		jointId.memorySegment()
    	);
    }
    
    /// ```
    /// Set the wheel joint motor speed in radians per second.
    /// ```
    public static void setSpinMotorSpeed(
    	MemorySegment jointId,
    	float speed
    ) {
    	MethodHandle method = B3_WHEEL_JOINT_SET_SPIN_MOTOR_SPEED.get();
    	try {
    		 method.invokeExact(
    			jointId,
    			speed
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setSpinMotorSpeed].
    public static void setSpinMotorSpeed(
    	JointId jointId,
    	float speed
    ) {
    	setSpinMotorSpeed(
    		jointId.memorySegment(),
    		speed
    	);
    }
    
    /// ```
    /// Get the wheel joint motor speed in radians per second.
    /// ```
    public static float getSpinMotorSpeed(
    	MemorySegment jointId
    ) {
    	MethodHandle method = B3_WHEEL_JOINT_GET_SPIN_MOTOR_SPEED.get();
    	try {
    		return (float) method.invokeExact(
    			jointId
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getSpinMotorSpeed].
    public static float getSpinMotorSpeed(
    	JointId jointId
    ) {
    	return getSpinMotorSpeed(
    		jointId.memorySegment()
    	);
    }
    
    /// ```
    /// Set the wheel joint maximum motor torque, usually in newton-meters.
    /// ```
    public static void setMaxSpinTorque(
    	MemorySegment jointId,
    	float torque
    ) {
    	MethodHandle method = B3_WHEEL_JOINT_SET_MAX_SPIN_TORQUE.get();
    	try {
    		 method.invokeExact(
    			jointId,
    			torque
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setMaxSpinTorque].
    public static void setMaxSpinTorque(
    	JointId jointId,
    	float torque
    ) {
    	setMaxSpinTorque(
    		jointId.memorySegment(),
    		torque
    	);
    }
    
    /// ```
    /// Get the wheel joint maximum motor torque, usually in newton-meters.
    /// ```
    public static float getMaxSpinTorque(
    	MemorySegment jointId
    ) {
    	MethodHandle method = B3_WHEEL_JOINT_GET_MAX_SPIN_TORQUE.get();
    	try {
    		return (float) method.invokeExact(
    			jointId
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getMaxSpinTorque].
    public static float getMaxSpinTorque(
    	JointId jointId
    ) {
    	return getMaxSpinTorque(
    		jointId.memorySegment()
    	);
    }
    
    /// ```
    /// Get the current spin speed in radians per second.
    /// ```
    public static float getSpinSpeed(
    	MemorySegment jointId
    ) {
    	MethodHandle method = B3_WHEEL_JOINT_GET_SPIN_SPEED.get();
    	try {
    		return (float) method.invokeExact(
    			jointId
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getSpinSpeed].
    public static float getSpinSpeed(
    	JointId jointId
    ) {
    	return getSpinSpeed(
    		jointId.memorySegment()
    	);
    }
    
    /// ```
    /// Get the wheel joint current motor torque, usually in newton-meters.
    /// ```
    public static float getSpinTorque(
    	MemorySegment jointId
    ) {
    	MethodHandle method = B3_WHEEL_JOINT_GET_SPIN_TORQUE.get();
    	try {
    		return (float) method.invokeExact(
    			jointId
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getSpinTorque].
    public static float getSpinTorque(
    	JointId jointId
    ) {
    	return getSpinTorque(
    		jointId.memorySegment()
    	);
    }
    
    /// ```
    /// Enable/disable wheel steering. Steering allows the wheel to rotate about the suspension axis.
    /// ```
    public static void enableSteering(
    	MemorySegment jointId,
    	boolean flag
    ) {
    	MethodHandle method = B3_WHEEL_JOINT_ENABLE_STEERING.get();
    	try {
    		 method.invokeExact(
    			jointId,
    			flag
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#enableSteering].
    public static void enableSteering(
    	JointId jointId,
    	boolean flag
    ) {
    	enableSteering(
    		jointId.memorySegment(),
    		flag
    	);
    }
    
    /// ```
    /// Can the wheel steer?
    /// ```
    public static boolean isSteeringEnabled(
    	MemorySegment jointId
    ) {
    	MethodHandle method = B3_WHEEL_JOINT_IS_STEERING_ENABLED.get();
    	try {
    		return (boolean) method.invokeExact(
    			jointId
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#isSteeringEnabled].
    public static boolean isSteeringEnabled(
    	JointId jointId
    ) {
    	return isSteeringEnabled(
    		jointId.memorySegment()
    	);
    }
    
    /// ```
    /// Set the wheel joint steering stiffness in Hertz.
    /// ```
    public static void setSteeringHertz(
    	MemorySegment jointId,
    	float hertz
    ) {
    	MethodHandle method = B3_WHEEL_JOINT_SET_STEERING_HERTZ.get();
    	try {
    		 method.invokeExact(
    			jointId,
    			hertz
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setSteeringHertz].
    public static void setSteeringHertz(
    	JointId jointId,
    	float hertz
    ) {
    	setSteeringHertz(
    		jointId.memorySegment(),
    		hertz
    	);
    }
    
    /// ```
    /// Get the wheel joint steering stiffness in Hertz.
    /// ```
    public static float getSteeringHertz(
    	MemorySegment jointId
    ) {
    	MethodHandle method = B3_WHEEL_JOINT_GET_STEERING_HERTZ.get();
    	try {
    		return (float) method.invokeExact(
    			jointId
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getSteeringHertz].
    public static float getSteeringHertz(
    	JointId jointId
    ) {
    	return getSteeringHertz(
    		jointId.memorySegment()
    	);
    }
    
    /// ```
    /// Set the wheel joint steering damping ratio, non-dimensional.
    /// ```
    public static void setSteeringDampingRatio(
    	MemorySegment jointId,
    	float dampingRatio
    ) {
    	MethodHandle method = B3_WHEEL_JOINT_SET_STEERING_DAMPING_RATIO.get();
    	try {
    		 method.invokeExact(
    			jointId,
    			dampingRatio
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setSteeringDampingRatio].
    public static void setSteeringDampingRatio(
    	JointId jointId,
    	float dampingRatio
    ) {
    	setSteeringDampingRatio(
    		jointId.memorySegment(),
    		dampingRatio
    	);
    }
    
    /// ```
    /// Get the wheel joint steering damping ratio, non-dimensional.
    /// ```
    public static float getSteeringDampingRatio(
    	MemorySegment jointId
    ) {
    	MethodHandle method = B3_WHEEL_JOINT_GET_STEERING_DAMPING_RATIO.get();
    	try {
    		return (float) method.invokeExact(
    			jointId
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getSteeringDampingRatio].
    public static float getSteeringDampingRatio(
    	JointId jointId
    ) {
    	return getSteeringDampingRatio(
    		jointId.memorySegment()
    	);
    }
    
    /// ```
    /// Set the wheel joint maximum steering torque in N*m.
    /// ```
    public static void setMaxSteeringTorque(
    	MemorySegment jointId,
    	float torque
    ) {
    	MethodHandle method = B3_WHEEL_JOINT_SET_MAX_STEERING_TORQUE.get();
    	try {
    		 method.invokeExact(
    			jointId,
    			torque
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setMaxSteeringTorque].
    public static void setMaxSteeringTorque(
    	JointId jointId,
    	float torque
    ) {
    	setMaxSteeringTorque(
    		jointId.memorySegment(),
    		torque
    	);
    }
    
    /// ```
    /// Get the wheel joint maximum steering torque in N*m.
    /// ```
    public static float getMaxSteeringTorque(
    	MemorySegment jointId
    ) {
    	MethodHandle method = B3_WHEEL_JOINT_GET_MAX_STEERING_TORQUE.get();
    	try {
    		return (float) method.invokeExact(
    			jointId
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getMaxSteeringTorque].
    public static float getMaxSteeringTorque(
    	JointId jointId
    ) {
    	return getMaxSteeringTorque(
    		jointId.memorySegment()
    	);
    }
    
    /// ```
    /// Enable/disable the wheel joint steering limit.
    /// ```
    public static void enableSteeringLimit(
    	MemorySegment jointId,
    	boolean flag
    ) {
    	MethodHandle method = B3_WHEEL_JOINT_ENABLE_STEERING_LIMIT.get();
    	try {
    		 method.invokeExact(
    			jointId,
    			flag
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#enableSteeringLimit].
    public static void enableSteeringLimit(
    	JointId jointId,
    	boolean flag
    ) {
    	enableSteeringLimit(
    		jointId.memorySegment(),
    		flag
    	);
    }
    
    /// ```
    /// Is the wheel joint steering limit enabled?
    /// ```
    public static boolean isSteeringLimitEnabled(
    	MemorySegment jointId
    ) {
    	MethodHandle method = B3_WHEEL_JOINT_IS_STEERING_LIMIT_ENABLED.get();
    	try {
    		return (boolean) method.invokeExact(
    			jointId
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#isSteeringLimitEnabled].
    public static boolean isSteeringLimitEnabled(
    	JointId jointId
    ) {
    	return isSteeringLimitEnabled(
    		jointId.memorySegment()
    	);
    }
    
    /// ```
    /// Get the wheel joint lower steering limit in radians.
    /// ```
    public static float getLowerSteeringLimit(
    	MemorySegment jointId
    ) {
    	MethodHandle method = B3_WHEEL_JOINT_GET_LOWER_STEERING_LIMIT.get();
    	try {
    		return (float) method.invokeExact(
    			jointId
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getLowerSteeringLimit].
    public static float getLowerSteeringLimit(
    	JointId jointId
    ) {
    	return getLowerSteeringLimit(
    		jointId.memorySegment()
    	);
    }
    
    /// ```
    /// Get the wheel joint upper steering limit in radians.
    /// ```
    public static float getUpperSteeringLimit(
    	MemorySegment jointId
    ) {
    	MethodHandle method = B3_WHEEL_JOINT_GET_UPPER_STEERING_LIMIT.get();
    	try {
    		return (float) method.invokeExact(
    			jointId
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getUpperSteeringLimit].
    public static float getUpperSteeringLimit(
    	JointId jointId
    ) {
    	return getUpperSteeringLimit(
    		jointId.memorySegment()
    	);
    }
    
    /// ```
    /// Set the wheel joint steering limits in radians.
    /// ```
    public static void setSteeringLimits(
    	MemorySegment jointId,
    	float lowerRadians,
    	float upperRadians
    ) {
    	MethodHandle method = B3_WHEEL_JOINT_SET_STEERING_LIMITS.get();
    	try {
    		 method.invokeExact(
    			jointId,
    			lowerRadians,
    			upperRadians
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setSteeringLimits].
    public static void setSteeringLimits(
    	JointId jointId,
    	float lowerRadians,
    	float upperRadians
    ) {
    	setSteeringLimits(
    		jointId.memorySegment(),
    		lowerRadians,
    		upperRadians
    	);
    }
    
    /// ```
    /// Set the wheel joint target steering angle in radians.
    /// ```
    public static void setTargetSteeringAngle(
    	MemorySegment jointId,
    	float radians
    ) {
    	MethodHandle method = B3_WHEEL_JOINT_SET_TARGET_STEERING_ANGLE.get();
    	try {
    		 method.invokeExact(
    			jointId,
    			radians
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setTargetSteeringAngle].
    public static void setTargetSteeringAngle(
    	JointId jointId,
    	float radians
    ) {
    	setTargetSteeringAngle(
    		jointId.memorySegment(),
    		radians
    	);
    }
    
    /// ```
    /// Get the wheel joint target steering angle in radians.
    /// ```
    public static float getTargetSteeringAngle(
    	MemorySegment jointId
    ) {
    	MethodHandle method = B3_WHEEL_JOINT_GET_TARGET_STEERING_ANGLE.get();
    	try {
    		return (float) method.invokeExact(
    			jointId
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getTargetSteeringAngle].
    public static float getTargetSteeringAngle(
    	JointId jointId
    ) {
    	return getTargetSteeringAngle(
    		jointId.memorySegment()
    	);
    }
    
    /// ```
    /// Get the current steering angle in radians.
    /// ```
    public static float getSteeringAngle(
    	MemorySegment jointId
    ) {
    	MethodHandle method = B3_WHEEL_JOINT_GET_STEERING_ANGLE.get();
    	try {
    		return (float) method.invokeExact(
    			jointId
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getSteeringAngle].
    public static float getSteeringAngle(
    	JointId jointId
    ) {
    	return getSteeringAngle(
    		jointId.memorySegment()
    	);
    }
    
    /// ```
    /// Get the current steering torque in N*m.
    /// ```
    public static float getSteeringTorque(
    	MemorySegment jointId
    ) {
    	MethodHandle method = B3_WHEEL_JOINT_GET_STEERING_TORQUE.get();
    	try {
    		return (float) method.invokeExact(
    			jointId
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getSteeringTorque].
    public static float getSteeringTorque(
    	JointId jointId
    ) {
    	return getSteeringTorque(
    		jointId.memorySegment()
    	);
    }
    
}