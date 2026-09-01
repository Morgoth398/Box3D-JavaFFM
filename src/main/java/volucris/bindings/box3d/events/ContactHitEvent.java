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
import volucris.bindings.box3d.ContactId;
import volucris.bindings.box3d.math.Vec3;
import volucris.bindings.box3d.shape.ShapeId;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;

/// ```
/// A hit touch event is generated when two shapes collide with a speed faster than the hit speed threshold.
/// This may be reported for speculative contacts that have a confirmed impulse.
/// ```
public final class ContactHitEvent
		implements Struct<ContactHitEvent> {

    public static final StructLayout LAYOUT;

    public static final VarHandle APPROACH_SPEED_HANDLE;
    public static final VarHandle USER_MATERIAL_ID_A_HANDLE;
    public static final VarHandle USER_MATERIAL_ID_B_HANDLE;

    public static final long SHAPE_ID_A_BYTE_OFFSET;
    public static final long SHAPE_ID_B_BYTE_OFFSET;
    public static final long CONTACT_ID_BYTE_OFFSET;
    public static final long POINT_BYTE_OFFSET;
    public static final long NORMAL_BYTE_OFFSET;
    public static final long APPROACH_SPEED_BYTE_OFFSET;
    public static final long USER_MATERIAL_ID_A_BYTE_OFFSET;
    public static final long USER_MATERIAL_ID_B_BYTE_OFFSET;

    private final MemorySegment segment;

    private final ShapeId shapeIdA;
    private final ShapeId shapeIdB;
    private final ContactId contactId;
    private final Vec3 point;
    private final Vec3 normal;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            ShapeId.LAYOUT.withName("shapeIdA"),
            ShapeId.LAYOUT.withName("shapeIdB"),
            ContactId.LAYOUT.withName("contactId"),
            Vec3.LAYOUT.withName("point"),
            Vec3.LAYOUT.withName("normal"),
            JAVA_FLOAT.withName("approachSpeed"),
            JAVA_LONG.withName("userMaterialIdA"),
            JAVA_LONG.withName("userMaterialIdB")
        ).withName("b3ContactHitEvent").withByteAlignment(8);
        
        APPROACH_SPEED_HANDLE = LAYOUT.varHandle(PathElement.groupElement("approachSpeed"));
        USER_MATERIAL_ID_A_HANDLE = LAYOUT.varHandle(PathElement.groupElement("userMaterialIdA"));
        USER_MATERIAL_ID_B_HANDLE = LAYOUT.varHandle(PathElement.groupElement("userMaterialIdB"));
        
        SHAPE_ID_A_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shapeIdA"));
        SHAPE_ID_B_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shapeIdB"));
        CONTACT_ID_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("contactId"));
        POINT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("point"));
        NORMAL_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("normal"));
        APPROACH_SPEED_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("approachSpeed"));
        USER_MATERIAL_ID_A_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("userMaterialIdA"));
        USER_MATERIAL_ID_B_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("userMaterialIdB"));
        //@formatter:on
    }

    public ContactHitEvent() {
        this(Arena.ofAuto());
    }
    
    public ContactHitEvent(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public ContactHitEvent(MemorySegment segment) {
        this.segment = segment;
    
        shapeIdA = new ShapeId(segment.asSlice(SHAPE_ID_A_BYTE_OFFSET, ShapeId.LAYOUT));
        shapeIdB = new ShapeId(segment.asSlice(SHAPE_ID_B_BYTE_OFFSET, ShapeId.LAYOUT));
        contactId = new ContactId(segment.asSlice(CONTACT_ID_BYTE_OFFSET, ContactId.LAYOUT));
        point = new Vec3(segment.asSlice(POINT_BYTE_OFFSET, Vec3.LAYOUT));
        normal = new Vec3(segment.asSlice(NORMAL_BYTE_OFFSET, Vec3.LAYOUT));
    }

    /// @see #approachSpeed()
    public ContactHitEvent approachSpeed(float approachSpeed) {
    	APPROACH_SPEED_HANDLE.set(segment, 0L, approachSpeed);
    	return this;
    }
    
    /// ```
    /// The speed the shapes are approaching. Always positive. Typically in meters per second.
    /// ```
    public float approachSpeed() {
    	return (float) APPROACH_SPEED_HANDLE.get(segment, 0L);
    }
    
    /// @see #userMaterialIdA()
    public ContactHitEvent userMaterialIdA(long userMaterialIdA) {
    	USER_MATERIAL_ID_A_HANDLE.set(segment, 0L, userMaterialIdA);
    	return this;
    }
    
    /// ```
    /// User material on shape A
    /// ```
    public long userMaterialIdA() {
    	return (long) USER_MATERIAL_ID_A_HANDLE.get(segment, 0L);
    }
    
    /// @see #userMaterialIdB()
    public ContactHitEvent userMaterialIdB(long userMaterialIdB) {
    	USER_MATERIAL_ID_B_HANDLE.set(segment, 0L, userMaterialIdB);
    	return this;
    }
    
    /// ```
    /// User material on shape B
    /// ```
    public long userMaterialIdB() {
    	return (long) USER_MATERIAL_ID_B_HANDLE.get(segment, 0L);
    }
    
    /// @see #shapeIdA()
    public ContactHitEvent shapeIdA(Consumer<ShapeId> consumer) {
    	consumer.accept(shapeIdA);
    	return this;
    }
    
    /// @see #shapeIdA()
    public ContactHitEvent shapeIdA(ShapeId other) {
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
    public ContactHitEvent shapeIdB(Consumer<ShapeId> consumer) {
    	consumer.accept(shapeIdB);
    	return this;
    }
    
    /// @see #shapeIdB()
    public ContactHitEvent shapeIdB(ShapeId other) {
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
    public ContactHitEvent contactId(Consumer<ContactId> consumer) {
    	consumer.accept(contactId);
    	return this;
    }
    
    /// @see #contactId()
    public ContactHitEvent contactId(ContactId other) {
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
    
    /// @see #point()
    public ContactHitEvent point(Consumer<Vec3> consumer) {
    	consumer.accept(point);
    	return this;
    }
    
    /// @see #point()
    public ContactHitEvent point(Vec3 other) {
    	point.set(other);
    	return this;
    }
    
    /// ```
    /// Point where the shapes hit at the beginning of the time step.
    /// This is a mid-point between the two surfaces. It could be at speculative
    /// point where the two shapes were not touching at the beginning of the time step.
    /// ```
    public Vec3 point() {
    	return point;
    }
    
    /// @see #normal()
    public ContactHitEvent normal(Consumer<Vec3> consumer) {
    	consumer.accept(normal);
    	return this;
    }
    
    /// @see #normal()
    public ContactHitEvent normal(Vec3 other) {
    	normal.set(other);
    	return this;
    }
    
    /// ```
    /// Normal vector pointing from shape A to shape B
    /// ```
    public Vec3 normal() {
    	return normal;
    }
    
    @Override
    public ContactHitEvent set(ContactHitEvent other) {
        return set(other.segment);
    }
    
    @Override
    public ContactHitEvent set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<ContactHitEvent> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<ContactHitEvent> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new ContactHitEvent(segment),
            count
        );
    }
    
    public static NativeStructArray<ContactHitEvent> array(Arena arena, ContactHitEvent... structs) {
        NativeStructArray<ContactHitEvent> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new ContactHitEvent(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<ContactHitEvent> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new ContactHitEvent(segment)
        );
    }
    
}