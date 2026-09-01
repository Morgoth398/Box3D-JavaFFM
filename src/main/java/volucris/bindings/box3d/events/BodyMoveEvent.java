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
import volucris.bindings.box3d.body.BodyId;
import volucris.bindings.box3d.math.Transform;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

/// ```
/// Body move events triggered when a body moves.
/// Triggered when a body moves due to simulation. Not reported for bodies moved by the user.
/// This also has a flag to indicate that the body went to sleep so the application can also
/// sleep that actor/entity/object associated with the body.
/// On the other hand if the flag does not indicate the body went to sleep then the application
/// can treat the actor/entity/object associated with the body as awake.
/// This is an efficient way for an application to update game object transforms rather than
/// calling functions such as b3Body_GetTransform() because this data is delivered as a contiguous array
/// and it is only populated with bodies that have moved.
/// @note If sleeping is disabled all dynamic and kinematic bodies will trigger move events.
/// ```
public final class BodyMoveEvent
		implements Struct<BodyMoveEvent> {

    public static final StructLayout LAYOUT;

    public static final VarHandle USER_DATA_HANDLE;
    public static final VarHandle FELL_ASLEEP_HANDLE;

    public static final long USER_DATA_BYTE_OFFSET;
    public static final long TRANSFORM_BYTE_OFFSET;
    public static final long BODY_ID_BYTE_OFFSET;
    public static final long FELL_ASLEEP_BYTE_OFFSET;

    private final MemorySegment segment;

    private final Transform transform;
    private final BodyId bodyId;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            UNBOUNDED_ADDRESS.withName("userData"),
            Transform.LAYOUT.withName("transform"),
            BodyId.LAYOUT.withName("bodyId"),
            JAVA_BOOLEAN.withName("fellAsleep"),
            MemoryLayout.paddingLayout(3)
        ).withName("b3BodyMoveEvent").withByteAlignment(8);
        
        USER_DATA_HANDLE = LAYOUT.varHandle(PathElement.groupElement("userData"));
        FELL_ASLEEP_HANDLE = LAYOUT.varHandle(PathElement.groupElement("fellAsleep"));
        
        USER_DATA_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("userData"));
        TRANSFORM_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("transform"));
        BODY_ID_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("bodyId"));
        FELL_ASLEEP_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("fellAsleep"));
        //@formatter:on
    }

    public BodyMoveEvent() {
        this(Arena.ofAuto());
    }
    
    public BodyMoveEvent(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public BodyMoveEvent(MemorySegment segment) {
        this.segment = segment;
    
        transform = new Transform(segment.asSlice(TRANSFORM_BYTE_OFFSET, Transform.LAYOUT));
        bodyId = new BodyId(segment.asSlice(BODY_ID_BYTE_OFFSET, BodyId.LAYOUT));
    }

    /// @see #userData()
    public BodyMoveEvent userData(MemorySegment userData) {
    	USER_DATA_HANDLE.set(segment, 0L, userData);
    	return this;
    }
    
    /// ```
    /// The body user data.
    /// ```
    public @Nullable MemorySegment userData() {
    	MemorySegment segment = (MemorySegment) USER_DATA_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #fellAsleep()
    public BodyMoveEvent fellAsleep(boolean fellAsleep) {
    	FELL_ASLEEP_HANDLE.set(segment, 0L, fellAsleep);
    	return this;
    }
    
    /// ```
    /// Did the body fall asleep this time step?
    /// ```
    public boolean fellAsleep() {
    	return (boolean) FELL_ASLEEP_HANDLE.get(segment, 0L);
    }
    
    /// @see #transform()
    public BodyMoveEvent transform(Consumer<Transform> consumer) {
    	consumer.accept(transform);
    	return this;
    }
    
    /// @see #transform()
    public BodyMoveEvent transform(Transform other) {
    	transform.set(other);
    	return this;
    }
    
    /// ```
    /// The body transform.
    /// ```
    public Transform transform() {
    	return transform;
    }
    
    /// @see #bodyId()
    public BodyMoveEvent bodyId(Consumer<BodyId> consumer) {
    	consumer.accept(bodyId);
    	return this;
    }
    
    /// @see #bodyId()
    public BodyMoveEvent bodyId(BodyId other) {
    	bodyId.set(other);
    	return this;
    }
    
    /// ```
    /// The body id.
    /// ```
    public BodyId bodyId() {
    	return bodyId;
    }
    
    @Override
    public BodyMoveEvent set(BodyMoveEvent other) {
        return set(other.segment);
    }
    
    @Override
    public BodyMoveEvent set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<BodyMoveEvent> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<BodyMoveEvent> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new BodyMoveEvent(segment),
            count
        );
    }
    
    public static NativeStructArray<BodyMoveEvent> array(Arena arena, BodyMoveEvent... structs) {
        NativeStructArray<BodyMoveEvent> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new BodyMoveEvent(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<BodyMoveEvent> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new BodyMoveEvent(segment)
        );
    }
    
}