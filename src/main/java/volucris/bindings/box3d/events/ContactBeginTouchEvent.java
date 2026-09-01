/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.box3d.events;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.util.function.Consumer;
import volucris.bindings.box3d.ContactId;
import volucris.bindings.box3d.shape.ShapeId;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;

/// ```
/// A begin-touch event is generated when two shapes begin touching.
/// ```
public final class ContactBeginTouchEvent
		implements Struct<ContactBeginTouchEvent> {

    public static final StructLayout LAYOUT;

    public static final long SHAPE_ID_A_BYTE_OFFSET;
    public static final long SHAPE_ID_B_BYTE_OFFSET;
    public static final long CONTACT_ID_BYTE_OFFSET;

    private final MemorySegment segment;

    private final ShapeId shapeIdA;
    private final ShapeId shapeIdB;
    private final ContactId contactId;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            ShapeId.LAYOUT.withName("shapeIdA"),
            ShapeId.LAYOUT.withName("shapeIdB"),
            ContactId.LAYOUT.withName("contactId")
        ).withName("b3ContactBeginTouchEvent").withByteAlignment(4);
        
        SHAPE_ID_A_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shapeIdA"));
        SHAPE_ID_B_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shapeIdB"));
        CONTACT_ID_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("contactId"));
        //@formatter:on
    }

    public ContactBeginTouchEvent() {
        this(Arena.ofAuto());
    }
    
    public ContactBeginTouchEvent(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public ContactBeginTouchEvent(MemorySegment segment) {
        this.segment = segment;
    
        shapeIdA = new ShapeId(segment.asSlice(SHAPE_ID_A_BYTE_OFFSET, ShapeId.LAYOUT));
        shapeIdB = new ShapeId(segment.asSlice(SHAPE_ID_B_BYTE_OFFSET, ShapeId.LAYOUT));
        contactId = new ContactId(segment.asSlice(CONTACT_ID_BYTE_OFFSET, ContactId.LAYOUT));
    }

    /// @see #shapeIdA()
    public ContactBeginTouchEvent shapeIdA(Consumer<ShapeId> consumer) {
    	consumer.accept(shapeIdA);
    	return this;
    }
    
    /// @see #shapeIdA()
    public ContactBeginTouchEvent shapeIdA(ShapeId other) {
    	shapeIdA.set(other);
    	return this;
    }
    
    /// ```
    /// Id of the first shape
    /// ```
    public ShapeId shapeIdA() {
    	return shapeIdA;
    }
    
    /// @see #shapeIdB()
    public ContactBeginTouchEvent shapeIdB(Consumer<ShapeId> consumer) {
    	consumer.accept(shapeIdB);
    	return this;
    }
    
    /// @see #shapeIdB()
    public ContactBeginTouchEvent shapeIdB(ShapeId other) {
    	shapeIdB.set(other);
    	return this;
    }
    
    /// ```
    /// Id of the second shape
    /// ```
    public ShapeId shapeIdB() {
    	return shapeIdB;
    }
    
    /// @see #contactId()
    public ContactBeginTouchEvent contactId(Consumer<ContactId> consumer) {
    	consumer.accept(contactId);
    	return this;
    }
    
    /// @see #contactId()
    public ContactBeginTouchEvent contactId(ContactId other) {
    	contactId.set(other);
    	return this;
    }
    
    /// ```
    /// The transient contact id. This contact may be destroyed automatically when the world is modified or simulated.
    /// Use b3Contact_IsValid before using this id.
    /// ```
    public ContactId contactId() {
    	return contactId;
    }
    
    @Override
    public ContactBeginTouchEvent set(ContactBeginTouchEvent other) {
        return set(other.segment);
    }
    
    @Override
    public ContactBeginTouchEvent set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<ContactBeginTouchEvent> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<ContactBeginTouchEvent> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new ContactBeginTouchEvent(segment),
            count
        );
    }
    
    public static NativeStructArray<ContactBeginTouchEvent> array(Arena arena, ContactBeginTouchEvent... structs) {
        NativeStructArray<ContactBeginTouchEvent> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new ContactBeginTouchEvent(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<ContactBeginTouchEvent> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new ContactBeginTouchEvent(segment)
        );
    }
    
}