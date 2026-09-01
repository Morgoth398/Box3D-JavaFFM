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
/// Weld joint definition
/// Connects two bodies together rigidly. This constraint provides springs to mimic
/// soft-body simulation.
/// @note The approximate solver in Box3D cannot hold many bodies together rigidly
/// @ingroup weld_joint
/// ```
public final class WeldJointDef
		implements Struct<WeldJointDef> {

    private static final LazyConstant<MethodHandle> B3_DEFAULT_WELD_JOINT_DEF;

    public static final StructLayout LAYOUT;

    public static final VarHandle LINEAR_HERTZ_HANDLE;
    public static final VarHandle ANGULAR_HERTZ_HANDLE;
    public static final VarHandle LINEAR_DAMPING_RATIO_HANDLE;
    public static final VarHandle ANGULAR_DAMPING_RATIO_HANDLE;

    public static final long BASE_BYTE_OFFSET;
    public static final long LINEAR_HERTZ_BYTE_OFFSET;
    public static final long ANGULAR_HERTZ_BYTE_OFFSET;
    public static final long LINEAR_DAMPING_RATIO_BYTE_OFFSET;
    public static final long ANGULAR_DAMPING_RATIO_BYTE_OFFSET;

    private final MemorySegment segment;

    private final JointDef base;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JointDef.LAYOUT.withName("base"),
            JAVA_FLOAT.withName("linearHertz"),
            JAVA_FLOAT.withName("angularHertz"),
            JAVA_FLOAT.withName("linearDampingRatio"),
            JAVA_FLOAT.withName("angularDampingRatio")
        ).withName("b3WeldJointDef").withByteAlignment(8);
        
        B3_DEFAULT_WELD_JOINT_DEF = downcallHandle("b3DefaultWeldJointDef", WeldJointDef.LAYOUT);
        
        LINEAR_HERTZ_HANDLE = LAYOUT.varHandle(PathElement.groupElement("linearHertz"));
        ANGULAR_HERTZ_HANDLE = LAYOUT.varHandle(PathElement.groupElement("angularHertz"));
        LINEAR_DAMPING_RATIO_HANDLE = LAYOUT.varHandle(PathElement.groupElement("linearDampingRatio"));
        ANGULAR_DAMPING_RATIO_HANDLE = LAYOUT.varHandle(PathElement.groupElement("angularDampingRatio"));
        
        BASE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("base"));
        LINEAR_HERTZ_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("linearHertz"));
        ANGULAR_HERTZ_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("angularHertz"));
        LINEAR_DAMPING_RATIO_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("linearDampingRatio"));
        ANGULAR_DAMPING_RATIO_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("angularDampingRatio"));
        //@formatter:on
    }

    public WeldJointDef() {
        this(Arena.ofAuto());
    }
    
    public WeldJointDef(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public WeldJointDef(MemorySegment segment) {
        this.segment = segment;
    
        base = new JointDef(segment.asSlice(BASE_BYTE_OFFSET, JointDef.LAYOUT));
    }

    /// ```
    /// Use this to initialize your joint definition
    /// @ingroup weld_joint
    /// ```
    public static MemorySegment ndefaultWeldJointDef(
    	SegmentAllocator allocator
    ) {
    	MethodHandle method = B3_DEFAULT_WELD_JOINT_DEF.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ndefaultWeldJointDef].
    public final @Nullable WeldJointDef defaultWeldJointDef(
    	SegmentAllocator allocator
    ) {
    	MemorySegment segment = ndefaultWeldJointDef(
    		allocator
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new WeldJointDef(segment);
    }
    
    /// @see #linearHertz()
    public WeldJointDef linearHertz(float linearHertz) {
    	LINEAR_HERTZ_HANDLE.set(segment, 0L, linearHertz);
    	return this;
    }
    
    /// ```
    /// Linear stiffness expressed as Hertz (cycles per second). Use zero for maximum stiffness.
    /// ```
    public float linearHertz() {
    	return (float) LINEAR_HERTZ_HANDLE.get(segment, 0L);
    }
    
    /// @see #angularHertz()
    public WeldJointDef angularHertz(float angularHertz) {
    	ANGULAR_HERTZ_HANDLE.set(segment, 0L, angularHertz);
    	return this;
    }
    
    /// ```
    /// Angular stiffness as Hertz (cycles per second). Use zero for maximum stiffness.
    /// ```
    public float angularHertz() {
    	return (float) ANGULAR_HERTZ_HANDLE.get(segment, 0L);
    }
    
    /// @see #linearDampingRatio()
    public WeldJointDef linearDampingRatio(float linearDampingRatio) {
    	LINEAR_DAMPING_RATIO_HANDLE.set(segment, 0L, linearDampingRatio);
    	return this;
    }
    
    /// ```
    /// Linear damping ratio, non-dimensional. Use 1 for critical damping.
    /// ```
    public float linearDampingRatio() {
    	return (float) LINEAR_DAMPING_RATIO_HANDLE.get(segment, 0L);
    }
    
    /// @see #angularDampingRatio()
    public WeldJointDef angularDampingRatio(float angularDampingRatio) {
    	ANGULAR_DAMPING_RATIO_HANDLE.set(segment, 0L, angularDampingRatio);
    	return this;
    }
    
    /// ```
    /// Linear damping ratio, non-dimensional. Use 1 for critical damping.
    /// ```
    public float angularDampingRatio() {
    	return (float) ANGULAR_DAMPING_RATIO_HANDLE.get(segment, 0L);
    }
    
    /// @see #base()
    public WeldJointDef base(Consumer<JointDef> consumer) {
    	consumer.accept(base);
    	return this;
    }
    
    /// @see #base()
    public WeldJointDef base(JointDef other) {
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
    public WeldJointDef set(WeldJointDef other) {
        return set(other.segment);
    }
    
    @Override
    public WeldJointDef set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<WeldJointDef> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<WeldJointDef> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new WeldJointDef(segment),
            count
        );
    }
    
    public static NativeStructArray<WeldJointDef> array(Arena arena, WeldJointDef... structs) {
        NativeStructArray<WeldJointDef> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new WeldJointDef(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<WeldJointDef> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new WeldJointDef(segment)
        );
    }
    
}