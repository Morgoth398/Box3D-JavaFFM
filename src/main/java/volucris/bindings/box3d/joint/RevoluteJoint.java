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

public final class RevoluteJoint {

    private static final LazyConstant<MethodHandle> B3_CREATE_REVOLUTE_JOINT;
    private static final LazyConstant<MethodHandle> B3_REVOLUTE_JOINT_ENABLE_SPRING;
    private static final LazyConstant<MethodHandle> B3_REVOLUTE_JOINT_IS_SPRING_ENABLED;
    private static final LazyConstant<MethodHandle> B3_REVOLUTE_JOINT_SET_SPRING_HERTZ;
    private static final LazyConstant<MethodHandle> B3_REVOLUTE_JOINT_GET_SPRING_HERTZ;
    private static final LazyConstant<MethodHandle> B3_REVOLUTE_JOINT_SET_SPRING_DAMPING_RATIO;
    private static final LazyConstant<MethodHandle> B3_REVOLUTE_JOINT_GET_SPRING_DAMPING_RATIO;
    private static final LazyConstant<MethodHandle> B3_REVOLUTE_JOINT_SET_TARGET_ANGLE;
    private static final LazyConstant<MethodHandle> B3_REVOLUTE_JOINT_GET_TARGET_ANGLE;
    private static final LazyConstant<MethodHandle> B3_REVOLUTE_JOINT_GET_ANGLE;
    private static final LazyConstant<MethodHandle> B3_REVOLUTE_JOINT_ENABLE_LIMIT;
    private static final LazyConstant<MethodHandle> B3_REVOLUTE_JOINT_IS_LIMIT_ENABLED;
    private static final LazyConstant<MethodHandle> B3_REVOLUTE_JOINT_GET_LOWER_LIMIT;
    private static final LazyConstant<MethodHandle> B3_REVOLUTE_JOINT_GET_UPPER_LIMIT;
    private static final LazyConstant<MethodHandle> B3_REVOLUTE_JOINT_SET_LIMITS;
    private static final LazyConstant<MethodHandle> B3_REVOLUTE_JOINT_ENABLE_MOTOR;
    private static final LazyConstant<MethodHandle> B3_REVOLUTE_JOINT_IS_MOTOR_ENABLED;
    private static final LazyConstant<MethodHandle> B3_REVOLUTE_JOINT_SET_MOTOR_SPEED;
    private static final LazyConstant<MethodHandle> B3_REVOLUTE_JOINT_GET_MOTOR_SPEED;
    private static final LazyConstant<MethodHandle> B3_REVOLUTE_JOINT_GET_MOTOR_TORQUE;
    private static final LazyConstant<MethodHandle> B3_REVOLUTE_JOINT_SET_MAX_MOTOR_TORQUE;
    private static final LazyConstant<MethodHandle> B3_REVOLUTE_JOINT_GET_MAX_MOTOR_TORQUE;

    static {
        //@formatter:off
        B3_CREATE_REVOLUTE_JOINT = downcallHandle("b3CreateRevoluteJoint", JointId.LAYOUT, WorldId.LAYOUT, UNBOUNDED_ADDRESS);
        B3_REVOLUTE_JOINT_ENABLE_SPRING = downcallHandleVoid("b3RevoluteJoint_EnableSpring", JointId.LAYOUT, JAVA_BOOLEAN);
        B3_REVOLUTE_JOINT_IS_SPRING_ENABLED = downcallHandle("b3RevoluteJoint_IsSpringEnabled", JAVA_BOOLEAN, JointId.LAYOUT);
        B3_REVOLUTE_JOINT_SET_SPRING_HERTZ = downcallHandleVoid("b3RevoluteJoint_SetSpringHertz", JointId.LAYOUT, JAVA_FLOAT);
        B3_REVOLUTE_JOINT_GET_SPRING_HERTZ = downcallHandle("b3RevoluteJoint_GetSpringHertz", JAVA_FLOAT, JointId.LAYOUT);
        B3_REVOLUTE_JOINT_SET_SPRING_DAMPING_RATIO = downcallHandleVoid("b3RevoluteJoint_SetSpringDampingRatio", JointId.LAYOUT, JAVA_FLOAT);
        B3_REVOLUTE_JOINT_GET_SPRING_DAMPING_RATIO = downcallHandle("b3RevoluteJoint_GetSpringDampingRatio", JAVA_FLOAT, JointId.LAYOUT);
        B3_REVOLUTE_JOINT_SET_TARGET_ANGLE = downcallHandleVoid("b3RevoluteJoint_SetTargetAngle", JointId.LAYOUT, JAVA_FLOAT);
        B3_REVOLUTE_JOINT_GET_TARGET_ANGLE = downcallHandle("b3RevoluteJoint_GetTargetAngle", JAVA_FLOAT, JointId.LAYOUT);
        B3_REVOLUTE_JOINT_GET_ANGLE = downcallHandle("b3RevoluteJoint_GetAngle", JAVA_FLOAT, JointId.LAYOUT);
        B3_REVOLUTE_JOINT_ENABLE_LIMIT = downcallHandleVoid("b3RevoluteJoint_EnableLimit", JointId.LAYOUT, JAVA_BOOLEAN);
        B3_REVOLUTE_JOINT_IS_LIMIT_ENABLED = downcallHandle("b3RevoluteJoint_IsLimitEnabled", JAVA_BOOLEAN, JointId.LAYOUT);
        B3_REVOLUTE_JOINT_GET_LOWER_LIMIT = downcallHandle("b3RevoluteJoint_GetLowerLimit", JAVA_FLOAT, JointId.LAYOUT);
        B3_REVOLUTE_JOINT_GET_UPPER_LIMIT = downcallHandle("b3RevoluteJoint_GetUpperLimit", JAVA_FLOAT, JointId.LAYOUT);
        B3_REVOLUTE_JOINT_SET_LIMITS = downcallHandleVoid("b3RevoluteJoint_SetLimits", JointId.LAYOUT, JAVA_FLOAT, JAVA_FLOAT);
        B3_REVOLUTE_JOINT_ENABLE_MOTOR = downcallHandleVoid("b3RevoluteJoint_EnableMotor", JointId.LAYOUT, JAVA_BOOLEAN);
        B3_REVOLUTE_JOINT_IS_MOTOR_ENABLED = downcallHandle("b3RevoluteJoint_IsMotorEnabled", JAVA_BOOLEAN, JointId.LAYOUT);
        B3_REVOLUTE_JOINT_SET_MOTOR_SPEED = downcallHandleVoid("b3RevoluteJoint_SetMotorSpeed", JointId.LAYOUT, JAVA_FLOAT);
        B3_REVOLUTE_JOINT_GET_MOTOR_SPEED = downcallHandle("b3RevoluteJoint_GetMotorSpeed", JAVA_FLOAT, JointId.LAYOUT);
        B3_REVOLUTE_JOINT_GET_MOTOR_TORQUE = downcallHandle("b3RevoluteJoint_GetMotorTorque", JAVA_FLOAT, JointId.LAYOUT);
        B3_REVOLUTE_JOINT_SET_MAX_MOTOR_TORQUE = downcallHandleVoid("b3RevoluteJoint_SetMaxMotorTorque", JointId.LAYOUT, JAVA_FLOAT);
        B3_REVOLUTE_JOINT_GET_MAX_MOTOR_TORQUE = downcallHandle("b3RevoluteJoint_GetMaxMotorTorque", JAVA_FLOAT, JointId.LAYOUT);
        //@formatter:on
    }

    private RevoluteJoint() {
    }

    /// ```
    /// Create a revolute joint
    /// @see b3RevoluteJointDef for details
    /// ```
    public static MemorySegment createRevoluteJoint(
    	SegmentAllocator allocator,
    	MemorySegment worldId,
    	MemorySegment def
    ) {
    	MethodHandle method = B3_CREATE_REVOLUTE_JOINT.get();
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
    
    /// Typed method of [#createRevoluteJoint].
    public static @Nullable JointId createRevoluteJoint(
    	SegmentAllocator allocator,
    	WorldId worldId,
    	RevoluteJointDef def
    ) {
    	MemorySegment segment = createRevoluteJoint(
    		allocator,
    		worldId.memorySegment(),
    		def.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new JointId(segment);
    }
    
    /// ```
    /// Enable/disable the revolute joint spring
    /// ```
    public static void enableSpring(
    	MemorySegment jointId,
    	boolean enableSpring
    ) {
    	MethodHandle method = B3_REVOLUTE_JOINT_ENABLE_SPRING.get();
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
    /// Is the revolute angular spring enabled?
    /// ```
    public static boolean isSpringEnabled(
    	MemorySegment jointId
    ) {
    	MethodHandle method = B3_REVOLUTE_JOINT_IS_SPRING_ENABLED.get();
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
    /// Set the revolute joint spring stiffness in Hertz
    /// ```
    public static void setSpringHertz(
    	MemorySegment jointId,
    	float hertz
    ) {
    	MethodHandle method = B3_REVOLUTE_JOINT_SET_SPRING_HERTZ.get();
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
    /// Get the revolute joint spring stiffness in Hertz
    /// ```
    public static float getSpringHertz(
    	MemorySegment jointId
    ) {
    	MethodHandle method = B3_REVOLUTE_JOINT_GET_SPRING_HERTZ.get();
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
    /// Set the revolute joint spring damping ratio, non-dimensional
    /// ```
    public static void setSpringDampingRatio(
    	MemorySegment jointId,
    	float dampingRatio
    ) {
    	MethodHandle method = B3_REVOLUTE_JOINT_SET_SPRING_DAMPING_RATIO.get();
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
    /// Get the revolute joint spring damping ratio, non-dimensional
    /// ```
    public static float getSpringDampingRatio(
    	MemorySegment jointId
    ) {
    	MethodHandle method = B3_REVOLUTE_JOINT_GET_SPRING_DAMPING_RATIO.get();
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
    /// Set the revolute joint target angle in radians
    /// ```
    public static void setTargetAngle(
    	MemorySegment jointId,
    	float targetRadians
    ) {
    	MethodHandle method = B3_REVOLUTE_JOINT_SET_TARGET_ANGLE.get();
    	try {
    		 method.invokeExact(
    			jointId,
    			targetRadians
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setTargetAngle].
    public static void setTargetAngle(
    	JointId jointId,
    	float targetRadians
    ) {
    	setTargetAngle(
    		jointId.memorySegment(),
    		targetRadians
    	);
    }
    
    /// ```
    /// Get the revolute joint target angle in radians
    /// ```
    public static float getTargetAngle(
    	MemorySegment jointId
    ) {
    	MethodHandle method = B3_REVOLUTE_JOINT_GET_TARGET_ANGLE.get();
    	try {
    		return (float) method.invokeExact(
    			jointId
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getTargetAngle].
    public static float getTargetAngle(
    	JointId jointId
    ) {
    	return getTargetAngle(
    		jointId.memorySegment()
    	);
    }
    
    /// ```
    /// Get the revolute joint current angle in radians relative to the reference angle
    /// @see b3RevoluteJointDef::referenceAngle
    /// ```
    public static float getAngle(
    	MemorySegment jointId
    ) {
    	MethodHandle method = B3_REVOLUTE_JOINT_GET_ANGLE.get();
    	try {
    		return (float) method.invokeExact(
    			jointId
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getAngle].
    public static float getAngle(
    	JointId jointId
    ) {
    	return getAngle(
    		jointId.memorySegment()
    	);
    }
    
    /// ```
    /// Enable/disable the revolute joint limit
    /// ```
    public static void enableLimit(
    	MemorySegment jointId,
    	boolean enableLimit
    ) {
    	MethodHandle method = B3_REVOLUTE_JOINT_ENABLE_LIMIT.get();
    	try {
    		 method.invokeExact(
    			jointId,
    			enableLimit
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#enableLimit].
    public static void enableLimit(
    	JointId jointId,
    	boolean enableLimit
    ) {
    	enableLimit(
    		jointId.memorySegment(),
    		enableLimit
    	);
    }
    
    /// ```
    /// Is the revolute joint limit enabled?
    /// ```
    public static boolean isLimitEnabled(
    	MemorySegment jointId
    ) {
    	MethodHandle method = B3_REVOLUTE_JOINT_IS_LIMIT_ENABLED.get();
    	try {
    		return (boolean) method.invokeExact(
    			jointId
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#isLimitEnabled].
    public static boolean isLimitEnabled(
    	JointId jointId
    ) {
    	return isLimitEnabled(
    		jointId.memorySegment()
    	);
    }
    
    /// ```
    /// Get the revolute joint lower limit in radians
    /// ```
    public static float getLowerLimit(
    	MemorySegment jointId
    ) {
    	MethodHandle method = B3_REVOLUTE_JOINT_GET_LOWER_LIMIT.get();
    	try {
    		return (float) method.invokeExact(
    			jointId
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getLowerLimit].
    public static float getLowerLimit(
    	JointId jointId
    ) {
    	return getLowerLimit(
    		jointId.memorySegment()
    	);
    }
    
    /// ```
    /// Get the revolute joint upper limit in radians
    /// ```
    public static float getUpperLimit(
    	MemorySegment jointId
    ) {
    	MethodHandle method = B3_REVOLUTE_JOINT_GET_UPPER_LIMIT.get();
    	try {
    		return (float) method.invokeExact(
    			jointId
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getUpperLimit].
    public static float getUpperLimit(
    	JointId jointId
    ) {
    	return getUpperLimit(
    		jointId.memorySegment()
    	);
    }
    
    /// ```
    /// Set the revolute joint limits in radians
    /// ```
    public static void setLimits(
    	MemorySegment jointId,
    	float lowerLimitRadians,
    	float upperLimitRadians
    ) {
    	MethodHandle method = B3_REVOLUTE_JOINT_SET_LIMITS.get();
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
    
    /// Typed method of [#setLimits].
    public static void setLimits(
    	JointId jointId,
    	float lowerLimitRadians,
    	float upperLimitRadians
    ) {
    	setLimits(
    		jointId.memorySegment(),
    		lowerLimitRadians,
    		upperLimitRadians
    	);
    }
    
    /// ```
    /// Enable/disable a revolute joint motor
    /// ```
    public static void enableMotor(
    	MemorySegment jointId,
    	boolean enableMotor
    ) {
    	MethodHandle method = B3_REVOLUTE_JOINT_ENABLE_MOTOR.get();
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
    /// Is the revolute joint motor enabled?
    /// ```
    public static boolean isMotorEnabled(
    	MemorySegment jointId
    ) {
    	MethodHandle method = B3_REVOLUTE_JOINT_IS_MOTOR_ENABLED.get();
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
    /// Set the revolute joint motor speed in radians per second
    /// ```
    public static void setMotorSpeed(
    	MemorySegment jointId,
    	float motorSpeed
    ) {
    	MethodHandle method = B3_REVOLUTE_JOINT_SET_MOTOR_SPEED.get();
    	try {
    		 method.invokeExact(
    			jointId,
    			motorSpeed
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setMotorSpeed].
    public static void setMotorSpeed(
    	JointId jointId,
    	float motorSpeed
    ) {
    	setMotorSpeed(
    		jointId.memorySegment(),
    		motorSpeed
    	);
    }
    
    /// ```
    /// Get the revolute joint motor speed in radians per second
    /// ```
    public static float getMotorSpeed(
    	MemorySegment jointId
    ) {
    	MethodHandle method = B3_REVOLUTE_JOINT_GET_MOTOR_SPEED.get();
    	try {
    		return (float) method.invokeExact(
    			jointId
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getMotorSpeed].
    public static float getMotorSpeed(
    	JointId jointId
    ) {
    	return getMotorSpeed(
    		jointId.memorySegment()
    	);
    }
    
    /// ```
    /// Get the revolute joint current motor torque, usually in newton-meters
    /// ```
    public static float getMotorTorque(
    	MemorySegment jointId
    ) {
    	MethodHandle method = B3_REVOLUTE_JOINT_GET_MOTOR_TORQUE.get();
    	try {
    		return (float) method.invokeExact(
    			jointId
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getMotorTorque].
    public static float getMotorTorque(
    	JointId jointId
    ) {
    	return getMotorTorque(
    		jointId.memorySegment()
    	);
    }
    
    /// ```
    /// Set the revolute joint maximum motor torque, usually in newton-meters
    /// ```
    public static void setMaxMotorTorque(
    	MemorySegment jointId,
    	float torque
    ) {
    	MethodHandle method = B3_REVOLUTE_JOINT_SET_MAX_MOTOR_TORQUE.get();
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
    /// Get the revolute joint maximum motor torque, usually in newton-meters
    /// ```
    public static float getMaxMotorTorque(
    	MemorySegment jointId
    ) {
    	MethodHandle method = B3_REVOLUTE_JOINT_GET_MAX_MOTOR_TORQUE.get();
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