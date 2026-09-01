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
import java.util.function.Consumer;
import org.jspecify.annotations.Nullable;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

/// ```
/// A filter joint is used to disable collision between two specific bodies.
/// @ingroup filter_joint
/// ```
public final class FilterJointDef
		implements Struct<FilterJointDef> {

    private static final LazyConstant<MethodHandle> B3_DEFAULT_FILTER_JOINT_DEF;

    public static final StructLayout LAYOUT;

    public static final long BASE_BYTE_OFFSET;

    private final MemorySegment segment;

    private final JointDef base;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JointDef.LAYOUT.withName("base")
        ).withName("b3FilterJointDef").withByteAlignment(8);
        
        B3_DEFAULT_FILTER_JOINT_DEF = downcallHandle("b3DefaultFilterJointDef", FilterJointDef.LAYOUT);
        
        BASE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("base"));
        //@formatter:on
    }

    public FilterJointDef() {
        this(Arena.ofAuto());
    }
    
    public FilterJointDef(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public FilterJointDef(MemorySegment segment) {
        this.segment = segment;
    
        base = new JointDef(segment.asSlice(BASE_BYTE_OFFSET, JointDef.LAYOUT));
    }

    /// ```
    /// Use this to initialize your joint definition
    /// @ingroup filter_joint
    /// ```
    public static MemorySegment ndefaultFilterJointDef(
    	SegmentAllocator allocator
    ) {
    	MethodHandle method = B3_DEFAULT_FILTER_JOINT_DEF.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ndefaultFilterJointDef].
    public final @Nullable FilterJointDef defaultFilterJointDef(
    	SegmentAllocator allocator
    ) {
    	MemorySegment segment = ndefaultFilterJointDef(
    		allocator
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new FilterJointDef(segment);
    }
    
    /// @see #base()
    public FilterJointDef base(Consumer<JointDef> consumer) {
    	consumer.accept(base);
    	return this;
    }
    
    /// @see #base()
    public FilterJointDef base(JointDef other) {
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
    public FilterJointDef set(FilterJointDef other) {
        return set(other.segment);
    }
    
    @Override
    public FilterJointDef set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<FilterJointDef> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<FilterJointDef> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new FilterJointDef(segment),
            count
        );
    }
    
    public static NativeStructArray<FilterJointDef> array(Arena arena, FilterJointDef... structs) {
        NativeStructArray<FilterJointDef> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new FilterJointDef(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<FilterJointDef> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new FilterJointDef(segment)
        );
    }
    
}