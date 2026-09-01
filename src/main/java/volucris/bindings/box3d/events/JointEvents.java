/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.box3d.events;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;
import org.jspecify.annotations.Nullable;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

/// ```
/// Joint events are buffered in the world and are available
/// as event arrays after the time step is complete.
/// Note: this data becomes invalid if joints are destroyed
/// ```
public final class JointEvents
		implements Struct<JointEvents> {

    public static final StructLayout LAYOUT;

    public static final VarHandle JOINT_EVENTS_HANDLE;
    public static final VarHandle COUNT_HANDLE;

    public static final long JOINT_EVENTS_BYTE_OFFSET;
    public static final long COUNT_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            UNBOUNDED_ADDRESS.withName("jointEvents"),
            JAVA_INT.withName("count"),
            MemoryLayout.paddingLayout(4)
        ).withName("b3JointEvents").withByteAlignment(8);
        
        JOINT_EVENTS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("jointEvents"));
        COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("count"));
        
        JOINT_EVENTS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("jointEvents"));
        COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("count"));
        //@formatter:on
    }

    public JointEvents() {
        this(Arena.ofAuto());
    }
    
    public JointEvents(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public JointEvents(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #jointEvents()
    public JointEvents jointEvents(JointEvent jointEvents) {
    	JOINT_EVENTS_HANDLE.set(segment, 0L, jointEvents.memorySegment());
    	return this;
    }
    
    /// ```
    /// Array of events
    /// ```
    public @Nullable JointEvent jointEvents() {
    	MemorySegment segment = (MemorySegment) JOINT_EVENTS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new JointEvent(segment);
    }
    
    /// @see #count()
    public JointEvents count(int count) {
    	COUNT_HANDLE.set(segment, 0L, count);
    	return this;
    }
    
    /// ```
    /// Number of events
    /// ```
    public int count() {
    	return (int) COUNT_HANDLE.get(segment, 0L);
    }
    
    @Override
    public JointEvents set(JointEvents other) {
        return set(other.segment);
    }
    
    @Override
    public JointEvents set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<JointEvents> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<JointEvents> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new JointEvents(segment),
            count
        );
    }
    
    public static NativeStructArray<JointEvents> array(Arena arena, JointEvents... structs) {
        NativeStructArray<JointEvents> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new JointEvents(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<JointEvents> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new JointEvents(segment)
        );
    }
    
}