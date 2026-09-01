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
/// An end touch event is generated when two shapes stop touching.
/// You will get an end event if you do anything that destroys contacts previous to the last
/// world step. These include things like setting the transform, destroying a body
/// or shape, or changing a filter or body type.
/// ```
public final class ContactEndTouchEvent
		implements Struct<ContactEndTouchEvent> {

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
        ).withName("b3ContactEndTouchEvent").withByteAlignment(4);
        
        SHAPE_ID_A_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shapeIdA"));
        SHAPE_ID_B_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shapeIdB"));
        CONTACT_ID_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("contactId"));
        //@formatter:on
    }

    public ContactEndTouchEvent() {
        this(Arena.ofAuto());
    }
    
    public ContactEndTouchEvent(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public ContactEndTouchEvent(MemorySegment segment) {
        this.segment = segment;
    
        shapeIdA = new ShapeId(segment.asSlice(SHAPE_ID_A_BYTE_OFFSET, ShapeId.LAYOUT));
        shapeIdB = new ShapeId(segment.asSlice(SHAPE_ID_B_BYTE_OFFSET, ShapeId.LAYOUT));
        contactId = new ContactId(segment.asSlice(CONTACT_ID_BYTE_OFFSET, ContactId.LAYOUT));
    }

    /// @see #shapeIdA()
    public ContactEndTouchEvent shapeIdA(Consumer<ShapeId> consumer) {
    	consumer.accept(shapeIdA);
    	return this;
    }
    
    /// @see #shapeIdA()
    public ContactEndTouchEvent shapeIdA(ShapeId other) {
    	shapeIdA.set(other);
    	return this;
    }
    
    /// ```
    /// Id of the first shape
    /// @warning this shape may have been destroyed
    /// @see b3Shape_IsValid
    /// ```
    public ShapeId shapeIdA() {
    	return shapeIdA;
    }
    
    /// @see #shapeIdB()
    public ContactEndTouchEvent shapeIdB(Consumer<ShapeId> consumer) {
    	consumer.accept(shapeIdB);
    	return this;
    }
    
    /// @see #shapeIdB()
    public ContactEndTouchEvent shapeIdB(ShapeId other) {
    	shapeIdB.set(other);
    	return this;
    }
    
    /// ```
    /// Id of the first shape
    /// @warning this shape may have been destroyed
    /// @see b3Shape_IsValid
    /// ```
    public ShapeId shapeIdB() {
    	return shapeIdB;
    }
    
    /// @see #contactId()
    public ContactEndTouchEvent contactId(Consumer<ContactId> consumer) {
    	consumer.accept(contactId);
    	return this;
    }
    
    /// @see #contactId()
    public ContactEndTouchEvent contactId(ContactId other) {
    	contactId.set(other);
    	return this;
    }
    
    /// ```
    /// Id of the contact.
    /// @warning this contact may have been destroyed
    /// @see b3Contact_IsValid
    /// ```
    public ContactId contactId() {
    	return contactId;
    }
    
    @Override
    public ContactEndTouchEvent set(ContactEndTouchEvent other) {
        return set(other.segment);
    }
    
    @Override
    public ContactEndTouchEvent set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<ContactEndTouchEvent> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<ContactEndTouchEvent> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new ContactEndTouchEvent(segment),
            count
        );
    }
    
    public static NativeStructArray<ContactEndTouchEvent> array(Arena arena, ContactEndTouchEvent... structs) {
        NativeStructArray<ContactEndTouchEvent> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new ContactEndTouchEvent(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<ContactEndTouchEvent> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new ContactEndTouchEvent(segment)
        );
    }
    
}