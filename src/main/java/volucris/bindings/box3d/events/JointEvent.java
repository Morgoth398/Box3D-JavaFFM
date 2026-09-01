/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.box3d.events;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;
import java.util.function.Consumer;
import org.jspecify.annotations.Nullable;
import volucris.bindings.box3d.joint.JointId;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

/// ```
/// Joint events report joints that are awake and have a force and/or torque exceeding the threshold
/// The observed forces and torques are not returned for efficiency reasons.
/// ```
public final class JointEvent
		implements Struct<JointEvent> {

    public static final StructLayout LAYOUT;

    public static final VarHandle USER_DATA_HANDLE;

    public static final long JOINT_ID_BYTE_OFFSET;
    public static final long USER_DATA_BYTE_OFFSET;

    private final MemorySegment segment;

    private final JointId jointId;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JointId.LAYOUT.withName("jointId"),
            UNBOUNDED_ADDRESS.withName("userData")
        ).withName("b3JointEvent").withByteAlignment(8);
        
        USER_DATA_HANDLE = LAYOUT.varHandle(PathElement.groupElement("userData"));
        
        JOINT_ID_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("jointId"));
        USER_DATA_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("userData"));
        //@formatter:on
    }

    public JointEvent() {
        this(Arena.ofAuto());
    }
    
    public JointEvent(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public JointEvent(MemorySegment segment) {
        this.segment = segment;
    
        jointId = new JointId(segment.asSlice(JOINT_ID_BYTE_OFFSET, JointId.LAYOUT));
    }

    /// @see #userData()
    public JointEvent userData(MemorySegment userData) {
    	USER_DATA_HANDLE.set(segment, 0L, userData);
    	return this;
    }
    
    /// ```
    /// The user data from the joint for convenience
    /// ```
    public @Nullable MemorySegment userData() {
    	MemorySegment segment = (MemorySegment) USER_DATA_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #jointId()
    public JointEvent jointId(Consumer<JointId> consumer) {
    	consumer.accept(jointId);
    	return this;
    }
    
    /// @see #jointId()
    public JointEvent jointId(JointId other) {
    	jointId.set(other);
    	return this;
    }
    
    /// ```
    /// The joint id
    /// ```
    public JointId jointId() {
    	return jointId;
    }
    
    @Override
    public JointEvent set(JointEvent other) {
        return set(other.segment);
    }
    
    @Override
    public JointEvent set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<JointEvent> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<JointEvent> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new JointEvent(segment),
            count
        );
    }
    
    public static NativeStructArray<JointEvent> array(Arena arena, JointEvent... structs) {
        NativeStructArray<JointEvent> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new JointEvent(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<JointEvent> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new JointEvent(segment)
        );
    }
    
}