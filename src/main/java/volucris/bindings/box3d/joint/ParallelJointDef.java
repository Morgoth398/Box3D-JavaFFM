/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.box3d.joint;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.StructLayout;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.util.function.Consumer;
import org.jspecify.annotations.Nullable;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

/// ```
/// Parallel joint definition. Constrains the angle between axis z in body A and axis z in body B
/// using a spring. Useful to keep a body upright.
/// @ingroup parallel_joint
/// ```
public final class ParallelJointDef
		implements Struct<ParallelJointDef> {

    private static final LazyConstant<MethodHandle> B3_DEFAULT_PARALLEL_JOINT_DEF;

    public static final StructLayout LAYOUT;

    public static final VarHandle HERTZ_HANDLE;
    public static final VarHandle DAMPING_RATIO_HANDLE;
    public static final VarHandle MAX_TORQUE_HANDLE;

    public static final long BASE_BYTE_OFFSET;
    public static final long HERTZ_BYTE_OFFSET;
    public static final long DAMPING_RATIO_BYTE_OFFSET;
    public static final long MAX_TORQUE_BYTE_OFFSET;

    private final MemorySegment segment;

    private final JointDef base;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JointDef.LAYOUT.withName("base"),
            JAVA_FLOAT.withName("hertz"),
            JAVA_FLOAT.withName("dampingRatio"),
            JAVA_FLOAT.withName("maxTorque"),
            MemoryLayout.paddingLayout(4)
        ).withName("b3ParallelJointDef").withByteAlignment(8);
        
        B3_DEFAULT_PARALLEL_JOINT_DEF = downcallHandle("b3DefaultParallelJointDef", ParallelJointDef.LAYOUT);
        
        HERTZ_HANDLE = LAYOUT.varHandle(PathElement.groupElement("hertz"));
        DAMPING_RATIO_HANDLE = LAYOUT.varHandle(PathElement.groupElement("dampingRatio"));
        MAX_TORQUE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxTorque"));
        
        BASE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("base"));
        HERTZ_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("hertz"));
        DAMPING_RATIO_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("dampingRatio"));
        MAX_TORQUE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxTorque"));
        //@formatter:on
    }

    public ParallelJointDef() {
        this(Arena.ofAuto());
    }
    
    public ParallelJointDef(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public ParallelJointDef(MemorySegment segment) {
        this.segment = segment;
    
        base = new JointDef(segment.asSlice(BASE_BYTE_OFFSET, JointDef.LAYOUT));
    }

    /// ```
    /// Use this to initialize your joint definition
    /// @ingroup parallel_joint
    /// ```
    public static MemorySegment ndefaultParallelJointDef(
    	SegmentAllocator allocator
    ) {
    	MethodHandle method = B3_DEFAULT_PARALLEL_JOINT_DEF.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ndefaultParallelJointDef].
    public final @Nullable ParallelJointDef defaultParallelJointDef(
    	SegmentAllocator allocator
    ) {
    	MemorySegment segment = ndefaultParallelJointDef(
    		allocator
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new ParallelJointDef(segment);
    }
    
    /// @see #hertz()
    public ParallelJointDef hertz(float hertz) {
    	HERTZ_HANDLE.set(segment, 0L, hertz);
    	return this;
    }
    
    /// ```
    /// The spring stiffness Hertz, cycles per second
    /// ```
    public float hertz() {
    	return (float) HERTZ_HANDLE.get(segment, 0L);
    }
    
    /// @see #dampingRatio()
    public ParallelJointDef dampingRatio(float dampingRatio) {
    	DAMPING_RATIO_HANDLE.set(segment, 0L, dampingRatio);
    	return this;
    }
    
    /// ```
    /// The spring damping ratio, non-dimensional
    /// ```
    public float dampingRatio() {
    	return (float) DAMPING_RATIO_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxTorque()
    public ParallelJointDef maxTorque(float maxTorque) {
    	MAX_TORQUE_HANDLE.set(segment, 0L, maxTorque);
    	return this;
    }
    
    /// ```
    /// The maximum spring torque, typically in newton-meters.
    /// ```
    public float maxTorque() {
    	return (float) MAX_TORQUE_HANDLE.get(segment, 0L);
    }
    
    /// @see #base()
    public ParallelJointDef base(Consumer<JointDef> consumer) {
    	consumer.accept(base);
    	return this;
    }
    
    /// @see #base()
    public ParallelJointDef base(JointDef other) {
    	base.set(other);
    	return this;
    }
    
    /// ```
    /// Base joint definition
    /// ```
    public JointDef base() {
    	return base;
    }
    
    @Override
    public ParallelJointDef set(ParallelJointDef other) {
        return set(other.segment);
    }
    
    @Override
    public ParallelJointDef set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<ParallelJointDef> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<ParallelJointDef> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new ParallelJointDef(segment),
            count
        );
    }
    
    public static NativeStructArray<ParallelJointDef> array(Arena arena, ParallelJointDef... structs) {
        NativeStructArray<ParallelJointDef> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new ParallelJointDef(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<ParallelJointDef> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new ParallelJointDef(segment)
        );
    }
    
}