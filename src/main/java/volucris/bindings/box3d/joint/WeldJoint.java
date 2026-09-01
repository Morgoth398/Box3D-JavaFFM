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

public final class WeldJoint {

    private static final LazyConstant<MethodHandle> B3_CREATE_WELD_JOINT;
    private static final LazyConstant<MethodHandle> B3_WELD_JOINT_SET_LINEAR_HERTZ;
    private static final LazyConstant<MethodHandle> B3_WELD_JOINT_GET_LINEAR_HERTZ;
    private static final LazyConstant<MethodHandle> B3_WELD_JOINT_SET_LINEAR_DAMPING_RATIO;
    private static final LazyConstant<MethodHandle> B3_WELD_JOINT_GET_LINEAR_DAMPING_RATIO;
    private static final LazyConstant<MethodHandle> B3_WELD_JOINT_SET_ANGULAR_HERTZ;
    private static final LazyConstant<MethodHandle> B3_WELD_JOINT_GET_ANGULAR_HERTZ;
    private static final LazyConstant<MethodHandle> B3_WELD_JOINT_SET_ANGULAR_DAMPING_RATIO;
    private static final LazyConstant<MethodHandle> B3_WELD_JOINT_GET_ANGULAR_DAMPING_RATIO;

    static {
        //@formatter:off
        B3_CREATE_WELD_JOINT = downcallHandle("b3CreateWeldJoint", JointId.LAYOUT, WorldId.LAYOUT, UNBOUNDED_ADDRESS);
        B3_WELD_JOINT_SET_LINEAR_HERTZ = downcallHandleVoid("b3WeldJoint_SetLinearHertz", JointId.LAYOUT, JAVA_FLOAT);
        B3_WELD_JOINT_GET_LINEAR_HERTZ = downcallHandle("b3WeldJoint_GetLinearHertz", JAVA_FLOAT, JointId.LAYOUT);
        B3_WELD_JOINT_SET_LINEAR_DAMPING_RATIO = downcallHandleVoid("b3WeldJoint_SetLinearDampingRatio", JointId.LAYOUT, JAVA_FLOAT);
        B3_WELD_JOINT_GET_LINEAR_DAMPING_RATIO = downcallHandle("b3WeldJoint_GetLinearDampingRatio", JAVA_FLOAT, JointId.LAYOUT);
        B3_WELD_JOINT_SET_ANGULAR_HERTZ = downcallHandleVoid("b3WeldJoint_SetAngularHertz", JointId.LAYOUT, JAVA_FLOAT);
        B3_WELD_JOINT_GET_ANGULAR_HERTZ = downcallHandle("b3WeldJoint_GetAngularHertz", JAVA_FLOAT, JointId.LAYOUT);
        B3_WELD_JOINT_SET_ANGULAR_DAMPING_RATIO = downcallHandleVoid("b3WeldJoint_SetAngularDampingRatio", JointId.LAYOUT, JAVA_FLOAT);
        B3_WELD_JOINT_GET_ANGULAR_DAMPING_RATIO = downcallHandle("b3WeldJoint_GetAngularDampingRatio", JAVA_FLOAT, JointId.LAYOUT);
        //@formatter:on
    }

    private WeldJoint() {
    }

    /// ```
    /// Create a weld joint
    /// @see b3WeldJointDef for details
    /// ```
    public static MemorySegment createWeldJoint(
    	SegmentAllocator allocator,
    	MemorySegment worldId,
    	MemorySegment def
    ) {
    	MethodHandle method = B3_CREATE_WELD_JOINT.get();
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
    
    /// Typed method of [#createWeldJoint].
    public static @Nullable JointId createWeldJoint(
    	SegmentAllocator allocator,
    	WorldId worldId,
    	WeldJointDef def
    ) {
    	MemorySegment segment = createWeldJoint(
    		allocator,
    		worldId.memorySegment(),
    		def.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new JointId(segment);
    }
    
    /// ```
    /// Set the weld joint linear stiffness in Hertz. 0 is rigid.
    /// ```
    public static void setLinearHertz(
    	MemorySegment jointId,
    	float hertz
    ) {
    	MethodHandle method = B3_WELD_JOINT_SET_LINEAR_HERTZ.get();
    	try {
    		 method.invokeExact(
    			jointId,
    			hertz
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setLinearHertz].
    public static void setLinearHertz(
    	JointId jointId,
    	float hertz
    ) {
    	setLinearHertz(
    		jointId.memorySegment(),
    		hertz
    	);
    }
    
    /// ```
    /// Get the weld joint linear stiffness in Hertz
    /// ```
    public static float getLinearHertz(
    	MemorySegment jointId
    ) {
    	MethodHandle method = B3_WELD_JOINT_GET_LINEAR_HERTZ.get();
    	try {
    		return (float) method.invokeExact(
    			jointId
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getLinearHertz].
    public static float getLinearHertz(
    	JointId jointId
    ) {
    	return getLinearHertz(
    		jointId.memorySegment()
    	);
    }
    
    /// ```
    /// Set the weld joint linear damping ratio (non-dimensional)
    /// ```
    public static void setLinearDampingRatio(
    	MemorySegment jointId,
    	float dampingRatio
    ) {
    	MethodHandle method = B3_WELD_JOINT_SET_LINEAR_DAMPING_RATIO.get();
    	try {
    		 method.invokeExact(
    			jointId,
    			dampingRatio
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setLinearDampingRatio].
    public static void setLinearDampingRatio(
    	JointId jointId,
    	float dampingRatio
    ) {
    	setLinearDampingRatio(
    		jointId.memorySegment(),
    		dampingRatio
    	);
    }
    
    /// ```
    /// Get the weld joint linear damping ratio (non-dimensional)
    /// ```
    public static float getLinearDampingRatio(
    	MemorySegment jointId
    ) {
    	MethodHandle method = B3_WELD_JOINT_GET_LINEAR_DAMPING_RATIO.get();
    	try {
    		return (float) method.invokeExact(
    			jointId
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getLinearDampingRatio].
    public static float getLinearDampingRatio(
    	JointId jointId
    ) {
    	return getLinearDampingRatio(
    		jointId.memorySegment()
    	);
    }
    
    /// ```
    /// Set the weld joint angular stiffness in Hertz. 0 is rigid.
    /// ```
    public static void setAngularHertz(
    	MemorySegment jointId,
    	float hertz
    ) {
    	MethodHandle method = B3_WELD_JOINT_SET_ANGULAR_HERTZ.get();
    	try {
    		 method.invokeExact(
    			jointId,
    			hertz
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setAngularHertz].
    public static void setAngularHertz(
    	JointId jointId,
    	float hertz
    ) {
    	setAngularHertz(
    		jointId.memorySegment(),
    		hertz
    	);
    }
    
    /// ```
    /// Get the weld joint angular stiffness in Hertz
    /// ```
    public static float getAngularHertz(
    	MemorySegment jointId
    ) {
    	MethodHandle method = B3_WELD_JOINT_GET_ANGULAR_HERTZ.get();
    	try {
    		return (float) method.invokeExact(
    			jointId
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getAngularHertz].
    public static float getAngularHertz(
    	JointId jointId
    ) {
    	return getAngularHertz(
    		jointId.memorySegment()
    	);
    }
    
    /// ```
    /// Set weld joint angular damping ratio, non-dimensional
    /// ```
    public static void setAngularDampingRatio(
    	MemorySegment jointId,
    	float dampingRatio
    ) {
    	MethodHandle method = B3_WELD_JOINT_SET_ANGULAR_DAMPING_RATIO.get();
    	try {
    		 method.invokeExact(
    			jointId,
    			dampingRatio
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setAngularDampingRatio].
    public static void setAngularDampingRatio(
    	JointId jointId,
    	float dampingRatio
    ) {
    	setAngularDampingRatio(
    		jointId.memorySegment(),
    		dampingRatio
    	);
    }
    
    /// ```
    /// Get the weld joint angular damping ratio, non-dimensional
    /// ```
    public static float getAngularDampingRatio(
    	MemorySegment jointId
    ) {
    	MethodHandle method = B3_WELD_JOINT_GET_ANGULAR_DAMPING_RATIO.get();
    	try {
    		return (float) method.invokeExact(
    			jointId
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getAngularDampingRatio].
    public static float getAngularDampingRatio(
    	JointId jointId
    ) {
    	return getAngularDampingRatio(
    		jointId.memorySegment()
    	);
    }
    
}