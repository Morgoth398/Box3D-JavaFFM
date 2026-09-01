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
/// Contact events are buffered in the world and are available
/// as event arrays after the time step is complete.
/// Note: these may become invalid if bodies and/or shapes are destroyed
/// ```
public final class ContactEvents
		implements Struct<ContactEvents> {

    public static final StructLayout LAYOUT;

    public static final VarHandle BEGIN_EVENTS_HANDLE;
    public static final VarHandle END_EVENTS_HANDLE;
    public static final VarHandle HIT_EVENTS_HANDLE;
    public static final VarHandle BEGIN_COUNT_HANDLE;
    public static final VarHandle END_COUNT_HANDLE;
    public static final VarHandle HIT_COUNT_HANDLE;

    public static final long BEGIN_EVENTS_BYTE_OFFSET;
    public static final long END_EVENTS_BYTE_OFFSET;
    public static final long HIT_EVENTS_BYTE_OFFSET;
    public static final long BEGIN_COUNT_BYTE_OFFSET;
    public static final long END_COUNT_BYTE_OFFSET;
    public static final long HIT_COUNT_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            UNBOUNDED_ADDRESS.withName("beginEvents"),
            UNBOUNDED_ADDRESS.withName("endEvents"),
            UNBOUNDED_ADDRESS.withName("hitEvents"),
            JAVA_INT.withName("beginCount"),
            JAVA_INT.withName("endCount"),
            JAVA_INT.withName("hitCount"),
            MemoryLayout.paddingLayout(4)
        ).withName("b3ContactEvents").withByteAlignment(8);
        
        BEGIN_EVENTS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("beginEvents"));
        END_EVENTS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("endEvents"));
        HIT_EVENTS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("hitEvents"));
        BEGIN_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("beginCount"));
        END_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("endCount"));
        HIT_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("hitCount"));
        
        BEGIN_EVENTS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("beginEvents"));
        END_EVENTS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("endEvents"));
        HIT_EVENTS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("hitEvents"));
        BEGIN_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("beginCount"));
        END_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("endCount"));
        HIT_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("hitCount"));
        //@formatter:on
    }

    public ContactEvents() {
        this(Arena.ofAuto());
    }
    
    public ContactEvents(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public ContactEvents(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #beginEvents()
    public ContactEvents beginEvents(NativeStructArray<ContactBeginTouchEvent> beginEvents) {
    	BEGIN_EVENTS_HANDLE.set(segment, 0L, beginEvents.memorySegment());
    	return this;
    }
    
    /// ```
    /// Array of begin touch events
    /// ```
    public @Nullable NativeStructArray<ContactBeginTouchEvent> beginEvents() {
    	MemorySegment segment = (MemorySegment) BEGIN_EVENTS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    
    	return ContactBeginTouchEvent.array(segment);
    }
    
    /// @see #endEvents()
    public ContactEvents endEvents(NativeStructArray<ContactEndTouchEvent> endEvents) {
    	END_EVENTS_HANDLE.set(segment, 0L, endEvents.memorySegment());
    	return this;
    }
    
    /// ```
    /// Array of end touch events
    /// ```
    public @Nullable NativeStructArray<ContactEndTouchEvent> endEvents() {
    	MemorySegment segment = (MemorySegment) END_EVENTS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    
    	return ContactEndTouchEvent.array(segment);
    }
    
    /// @see #hitEvents()
    public ContactEvents hitEvents(NativeStructArray<ContactHitEvent> hitEvents) {
    	HIT_EVENTS_HANDLE.set(segment, 0L, hitEvents.memorySegment());
    	return this;
    }
    
    /// ```
    /// Array of hit events
    /// ```
    public @Nullable NativeStructArray<ContactHitEvent> hitEvents() {
    	MemorySegment segment = (MemorySegment) HIT_EVENTS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    
    	return ContactHitEvent.array(segment);
    }
    
    /// @see #beginCount()
    public ContactEvents beginCount(int beginCount) {
    	BEGIN_COUNT_HANDLE.set(segment, 0L, beginCount);
    	return this;
    }
    
    /// ```
    /// Number of begin touch events
    /// ```
    public int beginCount() {
    	return (int) BEGIN_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #endCount()
    public ContactEvents endCount(int endCount) {
    	END_COUNT_HANDLE.set(segment, 0L, endCount);
    	return this;
    }
    
    /// ```
    /// Number of end touch events
    /// ```
    public int endCount() {
    	return (int) END_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #hitCount()
    public ContactEvents hitCount(int hitCount) {
    	HIT_COUNT_HANDLE.set(segment, 0L, hitCount);
    	return this;
    }
    
    /// ```
    /// Number of hit events
    /// ```
    public int hitCount() {
    	return (int) HIT_COUNT_HANDLE.get(segment, 0L);
    }
    
    @Override
    public ContactEvents set(ContactEvents other) {
        return set(other.segment);
    }
    
    @Override
    public ContactEvents set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<ContactEvents> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<ContactEvents> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new ContactEvents(segment),
            count
        );
    }
    
    public static NativeStructArray<ContactEvents> array(Arena arena, ContactEvents... structs) {
        NativeStructArray<ContactEvents> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new ContactEvents(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<ContactEvents> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new ContactEvents(segment)
        );
    }
    
}