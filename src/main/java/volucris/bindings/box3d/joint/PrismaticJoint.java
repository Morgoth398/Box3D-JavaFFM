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

public final class PrismaticJoint {

    private static final LazyConstant<MethodHandle> B3_CREATE_PRISMATIC_JOINT;
    private static final LazyConstant<MethodHandle> B3_PRISMATIC_JOINT_ENABLE_SPRING;
    private static final LazyConstant<MethodHandle> B3_PRISMATIC_JOINT_IS_SPRING_ENABLED;
    private static final LazyConstant<MethodHandle> B3_PRISMATIC_JOINT_SET_SPRING_HERTZ;
    private static final LazyConstant<MethodHandle> B3_PRISMATIC_JOINT_GET_SPRING_HERTZ;
    private static final LazyConstant<MethodHandle> B3_PRISMATIC_JOINT_SET_SPRING_DAMPING_RATIO;
    private static final LazyConstant<MethodHandle> B3_PRISMATIC_JOINT_GET_SPRING_DAMPING_RATIO;
    private static final LazyConstant<MethodHandle> B3_PRISMATIC_JOINT_SET_TARGET_TRANSLATION;
    private static final LazyConstant<MethodHandle> B3_PRISMATIC_JOINT_GET_TARGET_TRANSLATION;
    private static final LazyConstant<MethodHandle> B3_PRISMATIC_JOINT_ENABLE_LIMIT;
    private static final LazyConstant<MethodHandle> B3_PRISMATIC_JOINT_IS_LIMIT_ENABLED;
    private static final LazyConstant<MethodHandle> B3_PRISMATIC_JOINT_GET_LOWER_LIMIT;
    private static final LazyConstant<MethodHandle> B3_PRISMATIC_JOINT_GET_UPPER_LIMIT;
    private static final LazyConstant<MethodHandle> B3_PRISMATIC_JOINT_SET_LIMITS;
    private static final LazyConstant<MethodHandle> B3_PRISMATIC_JOINT_ENABLE_MOTOR;
    private static final LazyConstant<MethodHandle> B3_PRISMATIC_JOINT_IS_MOTOR_ENABLED;
    private static final LazyConstant<MethodHandle> B3_PRISMATIC_JOINT_SET_MOTOR_SPEED;
    private static final LazyConstant<MethodHandle> B3_PRISMATIC_JOINT_GET_MOTOR_SPEED;
    private static final LazyConstant<MethodHandle> B3_PRISMATIC_JOINT_SET_MAX_MOTOR_FORCE;
    private static final LazyConstant<MethodHandle> B3_PRISMATIC_JOINT_GET_MAX_MOTOR_FORCE;
    private static final LazyConstant<MethodHandle> B3_PRISMATIC_JOINT_GET_MOTOR_FORCE;
    private static final LazyConstant<MethodHandle> B3_PRISMATIC_JOINT_GET_TRANSLATION;
    private static final LazyConstant<MethodHandle> B3_PRISMATIC_JOINT_GET_SPEED;

    static {
        //@formatter:off
        B3_CREATE_PRISMATIC_JOINT = downcallHandle("b3CreatePrismaticJoint", JointId.LAYOUT, WorldId.LAYOUT, UNBOUNDED_ADDRESS);
        B3_PRISMATIC_JOINT_ENABLE_SPRING = downcallHandleVoid("b3PrismaticJoint_EnableSpring", JointId.LAYOUT, JAVA_BOOLEAN);
        B3_PRISMATIC_JOINT_IS_SPRING_ENABLED = downcallHandle("b3PrismaticJoint_IsSpringEnabled", JAVA_BOOLEAN, JointId.LAYOUT);
        B3_PRISMATIC_JOINT_SET_SPRING_HERTZ = downcallHandleVoid("b3PrismaticJoint_SetSpringHertz", JointId.LAYOUT, JAVA_FLOAT);
        B3_PRISMATIC_JOINT_GET_SPRING_HERTZ = downcallHandle("b3PrismaticJoint_GetSpringHertz", JAVA_FLOAT, JointId.LAYOUT);
        B3_PRISMATIC_JOINT_SET_SPRING_DAMPING_RATIO = downcallHandleVoid("b3PrismaticJoint_SetSpringDampingRatio", JointId.LAYOUT, JAVA_FLOAT);
        B3_PRISMATIC_JOINT_GET_SPRING_DAMPING_RATIO = downcallHandle("b3PrismaticJoint_GetSpringDampingRatio", JAVA_FLOAT, JointId.LAYOUT);
        B3_PRISMATIC_JOINT_SET_TARGET_TRANSLATION = downcallHandleVoid("b3PrismaticJoint_SetTargetTranslation", JointId.LAYOUT, JAVA_FLOAT);
        B3_PRISMATIC_JOINT_GET_TARGET_TRANSLATION = downcallHandle("b3PrismaticJoint_GetTargetTranslation", JAVA_FLOAT, JointId.LAYOUT);
        B3_PRISMATIC_JOINT_ENABLE_LIMIT = downcallHandleVoid("b3PrismaticJoint_EnableLimit", JointId.LAYOUT, JAVA_BOOLEAN);
        B3_PRISMATIC_JOINT_IS_LIMIT_ENABLED = downcallHandle("b3PrismaticJoint_IsLimitEnabled", JAVA_BOOLEAN, JointId.LAYOUT);
        B3_PRISMATIC_JOINT_GET_LOWER_LIMIT = downcallHandle("b3PrismaticJoint_GetLowerLimit", JAVA_FLOAT, JointId.LAYOUT);
        B3_PRISMATIC_JOINT_GET_UPPER_LIMIT = downcallHandle("b3PrismaticJoint_GetUpperLimit", JAVA_FLOAT, JointId.LAYOUT);
        B3_PRISMATIC_JOINT_SET_LIMITS = downcallHandleVoid("b3PrismaticJoint_SetLimits", JointId.LAYOUT, JAVA_FLOAT, JAVA_FLOAT);
        B3_PRISMATIC_JOINT_ENABLE_MOTOR = downcallHandleVoid("b3PrismaticJoint_EnableMotor", JointId.LAYOUT, JAVA_BOOLEAN);
        B3_PRISMATIC_JOINT_IS_MOTOR_ENABLED = downcallHandle("b3PrismaticJoint_IsMotorEnabled", JAVA_BOOLEAN, JointId.LAYOUT);
        B3_PRISMATIC_JOINT_SET_MOTOR_SPEED = downcallHandleVoid("b3PrismaticJoint_SetMotorSpeed", JointId.LAYOUT, JAVA_FLOAT);
        B3_PRISMATIC_JOINT_GET_MOTOR_SPEED = downcallHandle("b3PrismaticJoint_GetMotorSpeed", JAVA_FLOAT, JointId.LAYOUT);
        B3_PRISMATIC_JOINT_SET_MAX_MOTOR_FORCE = downcallHandleVoid("b3PrismaticJoint_SetMaxMotorForce", JointId.LAYOUT, JAVA_FLOAT);
        B3_PRISMATIC_JOINT_GET_MAX_MOTOR_FORCE = downcallHandle("b3PrismaticJoint_GetMaxMotorForce", JAVA_FLOAT, JointId.LAYOUT);
        B3_PRISMATIC_JOINT_GET_MOTOR_FORCE = downcallHandle("b3PrismaticJoint_GetMotorForce", JAVA_FLOAT, JointId.LAYOUT);
        B3_PRISMATIC_JOINT_GET_TRANSLATION = downcallHandle("b3PrismaticJoint_GetTranslation", JAVA_FLOAT, JointId.LAYOUT);
        B3_PRISMATIC_JOINT_GET_SPEED = downcallHandle("b3PrismaticJoint_GetSpeed", JAVA_FLOAT, JointId.LAYOUT);
        //@formatter:on
    }

    private PrismaticJoint() {
    }

    /// ```
    /// Create a prismatic (slider) joint.
    /// @see b3PrismaticJointDef for details
    /// ```
    public static MemorySegment createPrismaticJoint(
    	SegmentAllocator allocator,
    	MemorySegment worldId,
    	MemorySegment def
    ) {
    	MethodHandle method = B3_CREATE_PRISMATIC_JOINT.get();
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
    
    /// Typed method of [#createPrismaticJoint].
    public static @Nullable JointId createPrismaticJoint(
    	SegmentAllocator allocator,
    	WorldId worldId,
    	PrismaticJointDef def
    ) {
    	MemorySegment segment = createPrismaticJoint(
    		allocator,
    		worldId.memorySegment(),
    		def.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new JointId(segment);
    }
    
    /// ```
    /// Enable/disable the joint spring.
    /// ```
    public static void enableSpring(
    	MemorySegment jointId,
    	boolean enableSpring
    ) {
    	MethodHandle method = B3_PRISMATIC_JOINT_ENABLE_SPRING.get();
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
    /// Is the prismatic joint spring enabled or not?
    /// ```
    public static boolean isSpringEnabled(
    	MemorySegment jointId
    ) {
    	MethodHandle method = B3_PRISMATIC_JOINT_IS_SPRING_ENABLED.get();
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
    /// Set the prismatic joint stiffness in Hertz.
    /// This should usually be less than a quarter of the simulation rate. For example, if the simulation
    /// runs at 60Hz then the joint stiffness should be 15Hz or less.
    /// ```
    public static void setSpringHertz(
    	MemorySegment jointId,
    	float hertz
    ) {
    	MethodHandle method = B3_PRISMATIC_JOINT_SET_SPRING_HERTZ.get();
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
    /// Get the prismatic joint stiffness in Hertz
    /// ```
    public static float getSpringHertz(
    	MemorySegment jointId
    ) {
    	MethodHandle method = B3_PRISMATIC_JOINT_GET_SPRING_HERTZ.get();
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
    /// Set the prismatic joint damping ratio (non-dimensional)
    /// ```
    public static void setSpringDampingRatio(
    	MemorySegment jointId,
    	float dampingRatio
    ) {
    	MethodHandle method = B3_PRISMATIC_JOINT_SET_SPRING_DAMPING_RATIO.get();
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
    /// Get the prismatic spring damping ratio (non-dimensional)
    /// ```
    public static float getSpringDampingRatio(
    	MemorySegment jointId
    ) {
    	MethodHandle method = B3_PRISMATIC_JOINT_GET_SPRING_DAMPING_RATIO.get();
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
    /// Set the prismatic joint target translation. Usually in meters.
    /// ```
    public static void setTargetTranslation(
    	MemorySegment jointId,
    	float targetTranslation
    ) {
    	MethodHandle method = B3_PRISMATIC_JOINT_SET_TARGET_TRANSLATION.get();
    	try {
    		 method.invokeExact(
    			jointId,
    			targetTranslation
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setTargetTranslation].
    public static void setTargetTranslation(
    	JointId jointId,
    	float targetTranslation
    ) {
    	setTargetTranslation(
    		jointId.memorySegment(),
    		targetTranslation
    	);
    }
    
    /// ```
    /// Get the prismatic joint target translation. Usually in meters.
    /// ```
    public static float getTargetTranslation(
    	MemorySegment jointId
    ) {
    	MethodHandle method = B3_PRISMATIC_JOINT_GET_TARGET_TRANSLATION.get();
    	try {
    		return (float) method.invokeExact(
    			jointId
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getTargetTranslation].
    public static float getTargetTranslation(
    	JointId jointId
    ) {
    	return getTargetTranslation(
    		jointId.memorySegment()
    	);
    }
    
    /// ```
    /// Enable/disable a prismatic joint limit
    /// ```
    public static void enableLimit(
    	MemorySegment jointId,
    	boolean enableLimit
    ) {
    	MethodHandle method = B3_PRISMATIC_JOINT_ENABLE_LIMIT.get();
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
    /// Is the prismatic joint limit enabled?
    /// ```
    public static boolean isLimitEnabled(
    	MemorySegment jointId
    ) {
    	MethodHandle method = B3_PRISMATIC_JOINT_IS_LIMIT_ENABLED.get();
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
    /// Get the prismatic joint lower limit
    /// ```
    public static float getLowerLimit(
    	MemorySegment jointId
    ) {
    	MethodHandle method = B3_PRISMATIC_JOINT_GET_LOWER_LIMIT.get();
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
    /// Get the prismatic joint upper limit
    /// ```
    public static float getUpperLimit(
    	MemorySegment jointId
    ) {
    	MethodHandle method = B3_PRISMATIC_JOINT_GET_UPPER_LIMIT.get();
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
    /// Set the prismatic joint limits
    /// ```
    public static void setLimits(
    	MemorySegment jointId,
    	float lower,
    	float upper
    ) {
    	MethodHandle method = B3_PRISMATIC_JOINT_SET_LIMITS.get();
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
    
    /// Typed method of [#setLimits].
    public static void setLimits(
    	JointId jointId,
    	float lower,
    	float upper
    ) {
    	setLimits(
    		jointId.memorySegment(),
    		lower,
    		upper
    	);
    }
    
    /// ```
    /// Enable/disable a prismatic joint motor
    /// ```
    public static void enableMotor(
    	MemorySegment jointId,
    	boolean enableMotor
    ) {
    	MethodHandle method = B3_PRISMATIC_JOINT_ENABLE_MOTOR.get();
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
    /// Is the prismatic joint motor enabled?
    /// ```
    public static boolean isMotorEnabled(
    	MemorySegment jointId
    ) {
    	MethodHandle method = B3_PRISMATIC_JOINT_IS_MOTOR_ENABLED.get();
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
    /// Set the prismatic joint motor speed, usually in meters per second
    /// ```
    public static void setMotorSpeed(
    	MemorySegment jointId,
    	float motorSpeed
    ) {
    	MethodHandle method = B3_PRISMATIC_JOINT_SET_MOTOR_SPEED.get();
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
    /// Get the prismatic joint motor speed, usually in meters per second
    /// ```
    public static float getMotorSpeed(
    	MemorySegment jointId
    ) {
    	MethodHandle method = B3_PRISMATIC_JOINT_GET_MOTOR_SPEED.get();
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
    /// Set the prismatic joint maximum motor force, usually in newtons
    /// ```
    public static void setMaxMotorForce(
    	MemorySegment jointId,
    	float force
    ) {
    	MethodHandle method = B3_PRISMATIC_JOINT_SET_MAX_MOTOR_FORCE.get();
    	try {
    		 method.invokeExact(
    			jointId,
    			force
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setMaxMotorForce].
    public static void setMaxMotorForce(
    	JointId jointId,
    	float force
    ) {
    	setMaxMotorForce(
    		jointId.memorySegment(),
    		force
    	);
    }
    
    /// ```
    /// Get the prismatic joint maximum motor force, usually in newtons
    /// ```
    public static float getMaxMotorForce(
    	MemorySegment jointId
    ) {
    	MethodHandle method = B3_PRISMATIC_JOINT_GET_MAX_MOTOR_FORCE.get();
    	try {
    		return (float) method.invokeExact(
    			jointId
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getMaxMotorForce].
    public static float getMaxMotorForce(
    	JointId jointId
    ) {
    	return getMaxMotorForce(
    		jointId.memorySegment()
    	);
    }
    
    /// ```
    /// Get the prismatic joint current motor force, usually in newtons
    /// ```
    public static float getMotorForce(
    	MemorySegment jointId
    ) {
    	MethodHandle method = B3_PRISMATIC_JOINT_GET_MOTOR_FORCE.get();
    	try {
    		return (float) method.invokeExact(
    			jointId
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getMotorForce].
    public static float getMotorForce(
    	JointId jointId
    ) {
    	return getMotorForce(
    		jointId.memorySegment()
    	);
    }
    
    /// ```
    /// Get the current joint translation, usually in meters.
    /// ```
    public static float getTranslation(
    	MemorySegment jointId
    ) {
    	MethodHandle method = B3_PRISMATIC_JOINT_GET_TRANSLATION.get();
    	try {
    		return (float) method.invokeExact(
    			jointId
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getTranslation].
    public static float getTranslation(
    	JointId jointId
    ) {
    	return getTranslation(
    		jointId.memorySegment()
    	);
    }
    
    /// ```
    /// Get the current joint translation speed, usually in meters per second.
    /// ```
    public static float getSpeed(
    	MemorySegment jointId
    ) {
    	MethodHandle method = B3_PRISMATIC_JOINT_GET_SPEED.get();
    	try {
    		return (float) method.invokeExact(
    			jointId
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getSpeed].
    public static float getSpeed(
    	JointId jointId
    ) {
    	return getSpeed(
    		jointId.memorySegment()
    	);
    }
    
}