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
import volucris.bindings.box3d.ContactId;
import volucris.bindings.box3d.shape.ShapeId;
import volucris.bindings.box3d.shapeCollision.Manifold;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

/// ```
/// The contact data for two shapes. By convention the manifold normal points
/// from shape A to shape B.
/// @see b3Shape_GetContactData() and b3Body_GetContactData()
/// ```
public final class ContactData
		implements Struct<ContactData> {

    public static final StructLayout LAYOUT;

    public static final VarHandle MANIFOLDS_HANDLE;
    public static final VarHandle MANIFOLD_COUNT_HANDLE;

    public static final long CONTACT_ID_BYTE_OFFSET;
    public static final long SHAPE_ID_A_BYTE_OFFSET;
    public static final long SHAPE_ID_B_BYTE_OFFSET;
    public static final long MANIFOLDS_BYTE_OFFSET;
    public static final long MANIFOLD_COUNT_BYTE_OFFSET;

    private final MemorySegment segment;

    private final ContactId contactId;
    private final ShapeId shapeIdA;
    private final ShapeId shapeIdB;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            ContactId.LAYOUT.withName("contactId"),
            ShapeId.LAYOUT.withName("shapeIdA"),
            ShapeId.LAYOUT.withName("shapeIdB"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("manifolds"),
            JAVA_INT.withName("manifoldCount"),
            MemoryLayout.paddingLayout(4)
        ).withName("b3ContactData").withByteAlignment(8);
        
        MANIFOLDS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("manifolds"));
        MANIFOLD_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("manifoldCount"));
        
        CONTACT_ID_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("contactId"));
        SHAPE_ID_A_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shapeIdA"));
        SHAPE_ID_B_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shapeIdB"));
        MANIFOLDS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("manifolds"));
        MANIFOLD_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("manifoldCount"));
        //@formatter:on
    }

    public ContactData() {
        this(Arena.ofAuto());
    }
    
    public ContactData(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public ContactData(MemorySegment segment) {
        this.segment = segment;
    
        contactId = new ContactId(segment.asSlice(CONTACT_ID_BYTE_OFFSET, ContactId.LAYOUT));
        shapeIdA = new ShapeId(segment.asSlice(SHAPE_ID_A_BYTE_OFFSET, ShapeId.LAYOUT));
        shapeIdB = new ShapeId(segment.asSlice(SHAPE_ID_B_BYTE_OFFSET, ShapeId.LAYOUT));
    }

    /// @see #manifolds()
    public ContactData manifolds(NativeStructArray<Manifold> manifolds) {
    	MANIFOLDS_HANDLE.set(segment, 0L, manifolds.memorySegment());
    	return this;
    }
    
    /// ```
    /// The contact manifold. This points to internal data and may become invalid. Do not store
    /// this pointer.
    /// ```
    public @Nullable NativeStructArray<Manifold> manifolds() {
    	MemorySegment segment = (MemorySegment) MANIFOLDS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    
    	return Manifold.array(segment);
    }
    
    /// @see #manifoldCount()
    public ContactData manifoldCount(int manifoldCount) {
    	MANIFOLD_COUNT_HANDLE.set(segment, 0L, manifoldCount);
    	return this;
    }
    
    /// ```
    /// The number of contact manifolds. For mesh and height-field collision there can be multiple manifolds.
    /// ```
    public int manifoldCount() {
    	return (int) MANIFOLD_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #contactId()
    public ContactData contactId(Consumer<ContactId> consumer) {
    	consumer.accept(contactId);
    	return this;
    }
    
    /// @see #contactId()
    public ContactData contactId(ContactId other) {
    	contactId.set(other);
    	return this;
    }
    
    /// ```
    /// The contact id. You may hold onto this to track a contact across time steps.
    /// This id may become orphaned. Use b3Contact_IsValid before using it for other functions.
    /// ```
    public ContactId contactId() {
    	return contactId;
    }
    
    /// @see #shapeIdA()
    public ContactData shapeIdA(Consumer<ShapeId> consumer) {
    	consumer.accept(shapeIdA);
    	return this;
    }
    
    /// @see #shapeIdA()
    public ContactData shapeIdA(ShapeId other) {
    	shapeIdA.set(other);
    	return this;
    }
    
    /// ```
    /// The first shape id.
    /// ```
    public ShapeId shapeIdA() {
    	return shapeIdA;
    }
    
    /// @see #shapeIdB()
    public ContactData shapeIdB(Consumer<ShapeId> consumer) {
    	consumer.accept(shapeIdB);
    	return this;
    }
    
    /// @see #shapeIdB()
    public ContactData shapeIdB(ShapeId other) {
    	shapeIdB.set(other);
    	return this;
    }
    
    /// ```
    /// The second shape id.
    /// ```
    public ShapeId shapeIdB() {
    	return shapeIdB;
    }
    
    @Override
    public ContactData set(ContactData other) {
        return set(other.segment);
    }
    
    @Override
    public ContactData set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<ContactData> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<ContactData> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new ContactData(segment),
            count
        );
    }
    
    public static NativeStructArray<ContactData> array(Arena arena, ContactData... structs) {
        NativeStructArray<ContactData> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new ContactData(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<ContactData> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new ContactData(segment)
        );
    }
    
}