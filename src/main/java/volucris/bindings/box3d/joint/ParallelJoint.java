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

public final class ParallelJoint {

    private static final LazyConstant<MethodHandle> B3_CREATE_PARALLEL_JOINT;
    private static final LazyConstant<MethodHandle> B3_PARALLEL_JOINT_SET_SPRING_HERTZ;
    private static final LazyConstant<MethodHandle> B3_PARALLEL_JOINT_SET_SPRING_DAMPING_RATIO;
    private static final LazyConstant<MethodHandle> B3_PARALLEL_JOINT_GET_SPRING_HERTZ;
    private static final LazyConstant<MethodHandle> B3_PARALLEL_JOINT_GET_SPRING_DAMPING_RATIO;
    private static final LazyConstant<MethodHandle> B3_PARALLEL_JOINT_SET_MAX_TORQUE;
    private static final LazyConstant<MethodHandle> B3_PARALLEL_JOINT_GET_MAX_TORQUE;

    static {
        //@formatter:off
        B3_CREATE_PARALLEL_JOINT = downcallHandle("b3CreateParallelJoint", JointId.LAYOUT, WorldId.LAYOUT, UNBOUNDED_ADDRESS);
        B3_PARALLEL_JOINT_SET_SPRING_HERTZ = downcallHandleVoid("b3ParallelJoint_SetSpringHertz", JointId.LAYOUT, JAVA_FLOAT);
        B3_PARALLEL_JOINT_SET_SPRING_DAMPING_RATIO = downcallHandleVoid("b3ParallelJoint_SetSpringDampingRatio", JointId.LAYOUT, JAVA_FLOAT);
        B3_PARALLEL_JOINT_GET_SPRING_HERTZ = downcallHandle("b3ParallelJoint_GetSpringHertz", JAVA_FLOAT, JointId.LAYOUT);
        B3_PARALLEL_JOINT_GET_SPRING_DAMPING_RATIO = downcallHandle("b3ParallelJoint_GetSpringDampingRatio", JAVA_FLOAT, JointId.LAYOUT);
        B3_PARALLEL_JOINT_SET_MAX_TORQUE = downcallHandleVoid("b3ParallelJoint_SetMaxTorque", JointId.LAYOUT, JAVA_FLOAT);
        B3_PARALLEL_JOINT_GET_MAX_TORQUE = downcallHandle("b3ParallelJoint_GetMaxTorque", JAVA_FLOAT, JointId.LAYOUT);
        //@formatter:on
    }

    private ParallelJoint() {
    }

    /// ```
    /// Create a parallel joint
    /// @see b3ParallelJointDef for details
    /// ```
    public static MemorySegment createParallelJoint(
    	SegmentAllocator allocator,
    	MemorySegment worldId,
    	MemorySegment def
    ) {
    	MethodHandle method = B3_CREATE_PARALLEL_JOINT.get();
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
    
    /// Typed method of [#createParallelJoint].
    public static @Nullable JointId createParallelJoint(
    	SegmentAllocator allocator,
    	WorldId worldId,
    	ParallelJointDef def
    ) {
    	MemorySegment segment = createParallelJoint(
    		allocator,
    		worldId.memorySegment(),
    		def.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new JointId(segment);
    }
    
    /// ```
    /// Set the spring stiffness in Hertz
    /// ```
    public static void setSpringHertz(
    	MemorySegment jointId,
    	float hertz
    ) {
    	MethodHandle method = B3_PARALLEL_JOINT_SET_SPRING_HERTZ.get();
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
    /// Set the spring damping ratio, non-dimensional
    /// ```
    public static void setSpringDampingRatio(
    	MemorySegment jointId,
    	float dampingRatio
    ) {
    	MethodHandle method = B3_PARALLEL_JOINT_SET_SPRING_DAMPING_RATIO.get();
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
    /// Get the spring Hertz
    /// ```
    public static float getSpringHertz(
    	MemorySegment jointId
    ) {
    	MethodHandle method = B3_PARALLEL_JOINT_GET_SPRING_HERTZ.get();
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
    /// Get the spring damping ratio
    /// ```
    public static float getSpringDampingRatio(
    	MemorySegment jointId
    ) {
    	MethodHandle method = B3_PARALLEL_JOINT_GET_SPRING_DAMPING_RATIO.get();
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
    /// Set the maximum spring torque, usually in newton-meters
    /// ```
    public static void setMaxTorque(
    	MemorySegment jointId,
    	float force
    ) {
    	MethodHandle method = B3_PARALLEL_JOINT_SET_MAX_TORQUE.get();
    	try {
    		 method.invokeExact(
    			jointId,
    			force
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setMaxTorque].
    public static void setMaxTorque(
    	JointId jointId,
    	float force
    ) {
    	setMaxTorque(
    		jointId.memorySegment(),
    		force
    	);
    }
    
    /// ```
    /// Get the maximum spring torque, usually in newton-meters
    /// ```
    public static float getMaxTorque(
    	MemorySegment jointId
    ) {
    	MethodHandle method = B3_PARALLEL_JOINT_GET_MAX_TORQUE.get();
    	try {
    		return (float) method.invokeExact(
    			jointId
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getMaxTorque].
    public static float getMaxTorque(
    	JointId jointId
    ) {
    	return getMaxTorque(
    		jointId.memorySegment()
    	);
    }
    
}