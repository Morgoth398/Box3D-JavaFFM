/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.box3d.joint;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.invoke.MethodHandle;
import org.jspecify.annotations.Nullable;
import volucris.bindings.box3d.world.WorldId;

import static volucris.bindings.core.FFMUtils.*;

public final class FilterJoint {

    private static final LazyConstant<MethodHandle> B3_CREATE_FILTER_JOINT;

    static {
        //@formatter:off
        B3_CREATE_FILTER_JOINT = downcallHandle("b3CreateFilterJoint", JointId.LAYOUT, WorldId.LAYOUT, UNBOUNDED_ADDRESS);
        //@formatter:on
    }

    private FilterJoint() {
    }

    /// ```
    /// Create a filter joint.
    /// @see b3FilterJointDef for details
    /// ```
    public static MemorySegment createFilterJoint(
    	SegmentAllocator allocator,
    	MemorySegment worldId,
    	MemorySegment def
    ) {
    	MethodHandle method = B3_CREATE_FILTER_JOINT.get();
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
    
    /// Typed method of [#createFilterJoint].
    public static @Nullable JointId createFilterJoint(
    	SegmentAllocator allocator,
    	WorldId worldId,
    	FilterJointDef def
    ) {
    	MemorySegment segment = createFilterJoint(
    		allocator,
    		worldId.memorySegment(),
    		def.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new JointId(segment);
    }
    
}