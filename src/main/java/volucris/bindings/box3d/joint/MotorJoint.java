/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.box3d.joint;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.invoke.MethodHandle;
import org.jspecify.annotations.Nullable;
import volucris.bindings.box3d.math.Vec3;
import volucris.bindings.box3d.world.WorldId;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class MotorJoint {

    private static final LazyConstant<MethodHandle> B3_CREATE_MOTOR_JOINT;
    private static final LazyConstant<MethodHandle> B3_MOTOR_JOINT_SET_LINEAR_VELOCITY;
    private static final LazyConstant<MethodHandle> B3_MOTOR_JOINT_GET_LINEAR_VELOCITY;
    private static final LazyConstant<MethodHandle> B3_MOTOR_JOINT_SET_ANGULAR_VELOCITY;
    private static final LazyConstant<MethodHandle> B3_MOTOR_JOINT_GET_ANGULAR_VELOCITY;
    private static final LazyConstant<MethodHandle> B3_MOTOR_JOINT_SET_MAX_VELOCITY_FORCE;
    private static final LazyConstant<MethodHandle> B3_MOTOR_JOINT_GET_MAX_VELOCITY_FORCE;
    private static final LazyConstant<MethodHandle> B3_MOTOR_JOINT_SET_MAX_VELOCITY_TORQUE;
    private static final LazyConstant<MethodHandle> B3_MOTOR_JOINT_GET_MAX_VELOCITY_TORQUE;
    private static final LazyConstant<MethodHandle> B3_MOTOR_JOINT_SET_LINEAR_HERTZ;
    private static final LazyConstant<MethodHandle> B3_MOTOR_JOINT_GET_LINEAR_HERTZ;
    private static final LazyConstant<MethodHandle> B3_MOTOR_JOINT_SET_LINEAR_DAMPING_RATIO;
    private static final LazyConstant<MethodHandle> B3_MOTOR_JOINT_GET_LINEAR_DAMPING_RATIO;
    private static final LazyConstant<MethodHandle> B3_MOTOR_JOINT_SET_ANGULAR_HERTZ;
    private static final LazyConstant<MethodHandle> B3_MOTOR_JOINT_GET_ANGULAR_HERTZ;
    private static final LazyConstant<MethodHandle> B3_MOTOR_JOINT_SET_ANGULAR_DAMPING_RATIO;
    private static final LazyConstant<MethodHandle> B3_MOTOR_JOINT_GET_ANGULAR_DAMPING_RATIO;
    private static final LazyConstant<MethodHandle> B3_MOTOR_JOINT_SET_MAX_SPRING_FORCE;
    private static final LazyConstant<MethodHandle> B3_MOTOR_JOINT_GET_MAX_SPRING_FORCE;
    private static final LazyConstant<MethodHandle> B3_MOTOR_JOINT_SET_MAX_SPRING_TORQUE;
    private static final LazyConstant<MethodHandle> B3_MOTOR_JOINT_GET_MAX_SPRING_TORQUE;

    static {
        //@formatter:off
        B3_CREATE_MOTOR_JOINT = downcallHandle("b3CreateMotorJoint", JointId.LAYOUT, WorldId.LAYOUT, UNBOUNDED_ADDRESS);
        B3_MOTOR_JOINT_SET_LINEAR_VELOCITY = downcallHandleVoid("b3MotorJoint_SetLinearVelocity", JointId.LAYOUT, Vec3.LAYOUT);
        B3_MOTOR_JOINT_GET_LINEAR_VELOCITY = downcallHandle("b3MotorJoint_GetLinearVelocity", Vec3.LAYOUT, JointId.LAYOUT);
        B3_MOTOR_JOINT_SET_ANGULAR_VELOCITY = downcallHandleVoid("b3MotorJoint_SetAngularVelocity", JointId.LAYOUT, Vec3.LAYOUT);
        B3_MOTOR_JOINT_GET_ANGULAR_VELOCITY = downcallHandle("b3MotorJoint_GetAngularVelocity", Vec3.LAYOUT, JointId.LAYOUT);
        B3_MOTOR_JOINT_SET_MAX_VELOCITY_FORCE = downcallHandleVoid("b3MotorJoint_SetMaxVelocityForce", JointId.LAYOUT, JAVA_FLOAT);
        B3_MOTOR_JOINT_GET_MAX_VELOCITY_FORCE = downcallHandle("b3MotorJoint_GetMaxVelocityForce", JAVA_FLOAT, JointId.LAYOUT);
        B3_MOTOR_JOINT_SET_MAX_VELOCITY_TORQUE = downcallHandleVoid("b3MotorJoint_SetMaxVelocityTorque", JointId.LAYOUT, JAVA_FLOAT);
        B3_MOTOR_JOINT_GET_MAX_VELOCITY_TORQUE = downcallHandle("b3MotorJoint_GetMaxVelocityTorque", JAVA_FLOAT, JointId.LAYOUT);
        B3_MOTOR_JOINT_SET_LINEAR_HERTZ = downcallHandleVoid("b3MotorJoint_SetLinearHertz", JointId.LAYOUT, JAVA_FLOAT);
        B3_MOTOR_JOINT_GET_LINEAR_HERTZ = downcallHandle("b3MotorJoint_GetLinearHertz", JAVA_FLOAT, JointId.LAYOUT);
        B3_MOTOR_JOINT_SET_LINEAR_DAMPING_RATIO = downcallHandleVoid("b3MotorJoint_SetLinearDampingRatio", JointId.LAYOUT, JAVA_FLOAT);
        B3_MOTOR_JOINT_GET_LINEAR_DAMPING_RATIO = downcallHandle("b3MotorJoint_GetLinearDampingRatio", JAVA_FLOAT, JointId.LAYOUT);
        B3_MOTOR_JOINT_SET_ANGULAR_HERTZ = downcallHandleVoid("b3MotorJoint_SetAngularHertz", JointId.LAYOUT, JAVA_FLOAT);
        B3_MOTOR_JOINT_GET_ANGULAR_HERTZ = downcallHandle("b3MotorJoint_GetAngularHertz", JAVA_FLOAT, JointId.LAYOUT);
        B3_MOTOR_JOINT_SET_ANGULAR_DAMPING_RATIO = downcallHandleVoid("b3MotorJoint_SetAngularDampingRatio", JointId.LAYOUT, JAVA_FLOAT);
        B3_MOTOR_JOINT_GET_ANGULAR_DAMPING_RATIO = downcallHandle("b3MotorJoint_GetAngularDampingRatio", JAVA_FLOAT, JointId.LAYOUT);
        B3_MOTOR_JOINT_SET_MAX_SPRING_FORCE = downcallHandleVoid("b3MotorJoint_SetMaxSpringForce", JointId.LAYOUT, JAVA_FLOAT);
        B3_MOTOR_JOINT_GET_MAX_SPRING_FORCE = downcallHandle("b3MotorJoint_GetMaxSpringForce", JAVA_FLOAT, JointId.LAYOUT);
        B3_MOTOR_JOINT_SET_MAX_SPRING_TORQUE = downcallHandleVoid("b3MotorJoint_SetMaxSpringTorque", JointId.LAYOUT, JAVA_FLOAT);
        B3_MOTOR_JOINT_GET_MAX_SPRING_TORQUE = downcallHandle("b3MotorJoint_GetMaxSpringTorque", JAVA_FLOAT, JointId.LAYOUT);
        //@formatter:on
    }

    private MotorJoint() {
    }

    /// ```
    /// Create a motor joint
    /// @see b3MotorJointDef for details
    /// ```
    public static MemorySegment createMotorJoint(
    	SegmentAllocator allocator,
    	MemorySegment worldId,
    	MemorySegment def
    ) {
    	MethodHandle method = B3_CREATE_MOTOR_JOINT.get();
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
    
    /// Typed method of [#createMotorJoint].
    public static @Nullable JointId createMotorJoint(
    	SegmentAllocator allocator,
    	WorldId worldId,
    	MotorJointDef def
    ) {
    	MemorySegment segment = createMotorJoint(
    		allocator,
    		worldId.memorySegment(),
    		def.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new JointId(segment);
    }
    
    /// ```
    /// Set the desired relative linear velocity in meters per second
    /// ```
    public static void motorJoint_SetLinearVelocity(
    	MemorySegment jointId,
    	MemorySegment velocity
    ) {
    	MethodHandle method = B3_MOTOR_JOINT_SET_LINEAR_VELOCITY.get();
    	try {
    		 method.invokeExact(
    			jointId,
    			velocity
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#motorJoint_SetLinearVelocity].
    public static void motorJoint_SetLinearVelocity(
    	JointId jointId,
    	Vec3 velocity
    ) {
    	motorJoint_SetLinearVelocity(
    		jointId.memorySegment(),
    		velocity.memorySegment()
    	);
    }
    
    /// ```
    /// Get the desired relative linear velocity in meters per second
    /// ```
    public static MemorySegment motorJoint_GetLinearVelocity(
    	SegmentAllocator allocator,
    	MemorySegment jointId
    ) {
    	MethodHandle method = B3_MOTOR_JOINT_GET_LINEAR_VELOCITY.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			jointId
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#motorJoint_GetLinearVelocity].
    public static @Nullable Vec3 motorJoint_GetLinearVelocity(
    	SegmentAllocator allocator,
    	JointId jointId
    ) {
    	MemorySegment segment = motorJoint_GetLinearVelocity(
    		allocator,
    		jointId.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new Vec3(segment);
    }
    
    /// ```
    /// Set the desired relative angular velocity in radians per second
    /// ```
    public static void motorJoint_SetAngularVelocity(
    	MemorySegment jointId,
    	MemorySegment velocity
    ) {
    	MethodHandle method = B3_MOTOR_JOINT_SET_ANGULAR_VELOCITY.get();
    	try {
    		 method.invokeExact(
    			jointId,
    			velocity
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#motorJoint_SetAngularVelocity].
    public static void motorJoint_SetAngularVelocity(
    	JointId jointId,
    	Vec3 velocity
    ) {
    	motorJoint_SetAngularVelocity(
    		jointId.memorySegment(),
    		velocity.memorySegment()
    	);
    }
    
    /// ```
    /// Get the desired relative angular velocity in radians per second
    /// ```
    public static MemorySegment motorJoint_GetAngularVelocity(
    	SegmentAllocator allocator,
    	MemorySegment jointId
    ) {
    	MethodHandle method = B3_MOTOR_JOINT_GET_ANGULAR_VELOCITY.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			jointId
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#motorJoint_GetAngularVelocity].
    public static @Nullable Vec3 motorJoint_GetAngularVelocity(
    	SegmentAllocator allocator,
    	JointId jointId
    ) {
    	MemorySegment segment = motorJoint_GetAngularVelocity(
    		allocator,
    		jointId.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new Vec3(segment);
    }
    
    /// ```
    /// Set the motor joint maximum force, usually in newtons
    /// ```
    public static void motorJoint_SetMaxVelocityForce(
    	MemorySegment jointId,
    	float maxForce
    ) {
    	MethodHandle method = B3_MOTOR_JOINT_SET_MAX_VELOCITY_FORCE.get();
    	try {
    		 method.invokeExact(
    			jointId,
    			maxForce
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#motorJoint_SetMaxVelocityForce].
    public static void motorJoint_SetMaxVelocityForce(
    	JointId jointId,
    	float maxForce
    ) {
    	motorJoint_SetMaxVelocityForce(
    		jointId.memorySegment(),
    		maxForce
    	);
    }
    
    /// ```
    /// Get the motor joint maximum force, usually in newtons
    /// ```
    public static float motorJoint_GetMaxVelocityForce(
    	MemorySegment jointId
    ) {
    	MethodHandle method = B3_MOTOR_JOINT_GET_MAX_VELOCITY_FORCE.get();
    	try {
    		return (float) method.invokeExact(
    			jointId
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#motorJoint_GetMaxVelocityForce].
    public static float motorJoint_GetMaxVelocityForce(
    	JointId jointId
    ) {
    	return motorJoint_GetMaxVelocityForce(
    		jointId.memorySegment()
    	);
    }
    
    /// ```
    /// Set the motor joint maximum torque, usually in newton-meters
    /// ```
    public static void motorJoint_SetMaxVelocityTorque(
    	MemorySegment jointId,
    	float maxTorque
    ) {
    	MethodHandle method = B3_MOTOR_JOINT_SET_MAX_VELOCITY_TORQUE.get();
    	try {
    		 method.invokeExact(
    			jointId,
    			maxTorque
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#motorJoint_SetMaxVelocityTorque].
    public static void motorJoint_SetMaxVelocityTorque(
    	JointId jointId,
    	float maxTorque
    ) {
    	motorJoint_SetMaxVelocityTorque(
    		jointId.memorySegment(),
    		maxTorque
    	);
    }
    
    /// ```
    /// Get the motor joint maximum torque, usually in newton-meters
    /// ```
    public static float motorJoint_GetMaxVelocityTorque(
    	MemorySegment jointId
    ) {
    	MethodHandle method = B3_MOTOR_JOINT_GET_MAX_VELOCITY_TORQUE.get();
    	try {
    		return (float) method.invokeExact(
    			jointId
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#motorJoint_GetMaxVelocityTorque].
    public static float motorJoint_GetMaxVelocityTorque(
    	JointId jointId
    ) {
    	return motorJoint_GetMaxVelocityTorque(
    		jointId.memorySegment()
    	);
    }
    
    /// ```
    /// Set the spring linear hertz stiffness
    /// ```
    public static void motorJoint_SetLinearHertz(
    	MemorySegment jointId,
    	float hertz
    ) {
    	MethodHandle method = B3_MOTOR_JOINT_SET_LINEAR_HERTZ.get();
    	try {
    		 method.invokeExact(
    			jointId,
    			hertz
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#motorJoint_SetLinearHertz].
    public static void motorJoint_SetLinearHertz(
    	JointId jointId,
    	float hertz
    ) {
    	motorJoint_SetLinearHertz(
    		jointId.memorySegment(),
    		hertz
    	);
    }
    
    /// ```
    /// Get the spring linear hertz stiffness
    /// ```
    public static float motorJoint_GetLinearHertz(
    	MemorySegment jointId
    ) {
    	MethodHandle method = B3_MOTOR_JOINT_GET_LINEAR_HERTZ.get();
    	try {
    		return (float) method.invokeExact(
    			jointId
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#motorJoint_GetLinearHertz].
    public static float motorJoint_GetLinearHertz(
    	JointId jointId
    ) {
    	return motorJoint_GetLinearHertz(
    		jointId.memorySegment()
    	);
    }
    
    /// ```
    /// Set the spring linear damping ratio. Use 1.0 for critical damping.
    /// ```
    public static void motorJoint_SetLinearDampingRatio(
    	MemorySegment jointId,
    	float damping
    ) {
    	MethodHandle method = B3_MOTOR_JOINT_SET_LINEAR_DAMPING_RATIO.get();
    	try {
    		 method.invokeExact(
    			jointId,
    			damping
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#motorJoint_SetLinearDampingRatio].
    public static void motorJoint_SetLinearDampingRatio(
    	JointId jointId,
    	float damping
    ) {
    	motorJoint_SetLinearDampingRatio(
    		jointId.memorySegment(),
    		damping
    	);
    }
    
    /// ```
    /// Get the spring linear damping ratio.
    /// ```
    public static float motorJoint_GetLinearDampingRatio(
    	MemorySegment jointId
    ) {
    	MethodHandle method = B3_MOTOR_JOINT_GET_LINEAR_DAMPING_RATIO.get();
    	try {
    		return (float) method.invokeExact(
    			jointId
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#motorJoint_GetLinearDampingRatio].
    public static float motorJoint_GetLinearDampingRatio(
    	JointId jointId
    ) {
    	return motorJoint_GetLinearDampingRatio(
    		jointId.memorySegment()
    	);
    }
    
    /// ```
    /// Set the spring angular hertz stiffness
    /// ```
    public static void motorJoint_SetAngularHertz(
    	MemorySegment jointId,
    	float hertz
    ) {
    	MethodHandle method = B3_MOTOR_JOINT_SET_ANGULAR_HERTZ.get();
    	try {
    		 method.invokeExact(
    			jointId,
    			hertz
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#motorJoint_SetAngularHertz].
    public static void motorJoint_SetAngularHertz(
    	JointId jointId,
    	float hertz
    ) {
    	motorJoint_SetAngularHertz(
    		jointId.memorySegment(),
    		hertz
    	);
    }
    
    /// ```
    /// Get the spring angular hertz stiffness
    /// ```
    public static float motorJoint_GetAngularHertz(
    	MemorySegment jointId
    ) {
    	MethodHandle method = B3_MOTOR_JOINT_GET_ANGULAR_HERTZ.get();
    	try {
    		return (float) method.invokeExact(
    			jointId
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#motorJoint_GetAngularHertz].
    public static float motorJoint_GetAngularHertz(
    	JointId jointId
    ) {
    	return motorJoint_GetAngularHertz(
    		jointId.memorySegment()
    	);
    }
    
    /// ```
    /// Set the spring angular damping ratio. Use 1.0 for critical damping.
    /// ```
    public static void motorJoint_SetAngularDampingRatio(
    	MemorySegment jointId,
    	float damping
    ) {
    	MethodHandle method = B3_MOTOR_JOINT_SET_ANGULAR_DAMPING_RATIO.get();
    	try {
    		 method.invokeExact(
    			jointId,
    			damping
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#motorJoint_SetAngularDampingRatio].
    public static void motorJoint_SetAngularDampingRatio(
    	JointId jointId,
    	float damping
    ) {
    	motorJoint_SetAngularDampingRatio(
    		jointId.memorySegment(),
    		damping
    	);
    }
    
    /// ```
    /// Get the spring angular damping ratio.
    /// ```
    public static float motorJoint_GetAngularDampingRatio(
    	MemorySegment jointId
    ) {
    	MethodHandle method = B3_MOTOR_JOINT_GET_ANGULAR_DAMPING_RATIO.get();
    	try {
    		return (float) method.invokeExact(
    			jointId
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#motorJoint_GetAngularDampingRatio].
    public static float motorJoint_GetAngularDampingRatio(
    	JointId jointId
    ) {
    	return motorJoint_GetAngularDampingRatio(
    		jointId.memorySegment()
    	);
    }
    
    /// ```
    /// Set the maximum spring force in newtons.
    /// ```
    public static void motorJoint_SetMaxSpringForce(
    	MemorySegment jointId,
    	float maxForce
    ) {
    	MethodHandle method = B3_MOTOR_JOINT_SET_MAX_SPRING_FORCE.get();
    	try {
    		 method.invokeExact(
    			jointId,
    			maxForce
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#motorJoint_SetMaxSpringForce].
    public static void motorJoint_SetMaxSpringForce(
    	JointId jointId,
    	float maxForce
    ) {
    	motorJoint_SetMaxSpringForce(
    		jointId.memorySegment(),
    		maxForce
    	);
    }
    
    /// ```
    /// Get the maximum spring force in newtons.
    /// ```
    public static float motorJoint_GetMaxSpringForce(
    	MemorySegment jointId
    ) {
    	MethodHandle method = B3_MOTOR_JOINT_GET_MAX_SPRING_FORCE.get();
    	try {
    		return (float) method.invokeExact(
    			jointId
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#motorJoint_GetMaxSpringForce].
    public static float motorJoint_GetMaxSpringForce(
    	JointId jointId
    ) {
    	return motorJoint_GetMaxSpringForce(
    		jointId.memorySegment()
    	);
    }
    
    /// ```
    /// Set the maximum spring torque in newtons * meters
    /// ```
    public static void motorJoint_SetMaxSpringTorque(
    	MemorySegment jointId,
    	float maxTorque
    ) {
    	MethodHandle method = B3_MOTOR_JOINT_SET_MAX_SPRING_TORQUE.get();
    	try {
    		 method.invokeExact(
    			jointId,
    			maxTorque
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#motorJoint_SetMaxSpringTorque].
    public static void motorJoint_SetMaxSpringTorque(
    	JointId jointId,
    	float maxTorque
    ) {
    	motorJoint_SetMaxSpringTorque(
    		jointId.memorySegment(),
    		maxTorque
    	);
    }
    
    /// ```
    /// Get the maximum spring torque in newtons * meters
    /// ```
    public static float motorJoint_GetMaxSpringTorque(
    	MemorySegment jointId
    ) {
    	MethodHandle method = B3_MOTOR_JOINT_GET_MAX_SPRING_TORQUE.get();
    	try {
    		return (float) method.invokeExact(
    			jointId
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#motorJoint_GetMaxSpringTorque].
    public static float motorJoint_GetMaxSpringTorque(
    	JointId jointId
    ) {
    	return motorJoint_GetMaxSpringTorque(
    		jointId.memorySegment()
    	);
    }
    
}