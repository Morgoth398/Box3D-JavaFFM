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
/// Body events are buffered in the world and are available
/// as event arrays after the time step is complete.
/// Note: this data becomes invalid if bodies are destroyed
/// ```
public final class BodyEvents
		implements Struct<BodyEvents> {

    public static final StructLayout LAYOUT;

    public static final VarHandle MOVE_EVENTS_HANDLE;
    public static final VarHandle MOVE_COUNT_HANDLE;

    public static final long MOVE_EVENTS_BYTE_OFFSET;
    public static final long MOVE_COUNT_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            UNBOUNDED_ADDRESS.withName("moveEvents"),
            JAVA_INT.withName("moveCount"),
            MemoryLayout.paddingLayout(4)
        ).withName("b3BodyEvents").withByteAlignment(8);
        
        MOVE_EVENTS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("moveEvents"));
        MOVE_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("moveCount"));
        
        MOVE_EVENTS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("moveEvents"));
        MOVE_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("moveCount"));
        //@formatter:on
    }

    public BodyEvents() {
        this(Arena.ofAuto());
    }
    
    public BodyEvents(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public BodyEvents(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #moveEvents()
    public BodyEvents moveEvents(NativeStructArray<BodyMoveEvent> moveEvents) {
    	MOVE_EVENTS_HANDLE.set(segment, 0L, moveEvents.memorySegment());
    	return this;
    }
    
    /// ```
    /// Array of move events
    /// ```
    public @Nullable NativeStructArray<BodyMoveEvent> moveEvents() {
    	MemorySegment segment = (MemorySegment) MOVE_EVENTS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    
    	return BodyMoveEvent.array(segment);
    }
    
    /// @see #moveCount()
    public BodyEvents moveCount(int moveCount) {
    	MOVE_COUNT_HANDLE.set(segment, 0L, moveCount);
    	return this;
    }
    
    /// ```
    /// Number of move events
    /// ```
    public int moveCount() {
    	return (int) MOVE_COUNT_HANDLE.get(segment, 0L);
    }
    
    @Override
    public BodyEvents set(BodyEvents other) {
        return set(other.segment);
    }
    
    @Override
    public BodyEvents set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<BodyEvents> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<BodyEvents> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new BodyEvents(segment),
            count
        );
    }
    
    public static NativeStructArray<BodyEvents> array(Arena arena, BodyEvents... structs) {
        NativeStructArray<BodyEvents> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new BodyEvents(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<BodyEvents> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new BodyEvents(segment)
        );
    }
    
}