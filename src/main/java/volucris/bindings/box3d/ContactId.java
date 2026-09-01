/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.box3d;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;

/// ```
/// Contact id references a contact instance. This should be treated as an opaque handle.
/// ```
public final class ContactId
		implements Struct<ContactId> {

    public static final StructLayout LAYOUT;

    public static final VarHandle INDEX1_HANDLE;
    public static final VarHandle WORLD0_HANDLE;
    public static final VarHandle PADDING_HANDLE;
    public static final VarHandle GENERATION_HANDLE;

    public static final long INDEX1_BYTE_OFFSET;
    public static final long WORLD0_BYTE_OFFSET;
    public static final long PADDING_BYTE_OFFSET;
    public static final long GENERATION_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("index1"),
            JAVA_SHORT.withName("world0"),
            JAVA_SHORT.withName("padding"),
            JAVA_INT.withName("generation")
        ).withName("b3ContactId").withByteAlignment(4);
        
        INDEX1_HANDLE = LAYOUT.varHandle(PathElement.groupElement("index1"));
        WORLD0_HANDLE = LAYOUT.varHandle(PathElement.groupElement("world0"));
        PADDING_HANDLE = LAYOUT.varHandle(PathElement.groupElement("padding"));
        GENERATION_HANDLE = LAYOUT.varHandle(PathElement.groupElement("generation"));
        
        INDEX1_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("index1"));
        WORLD0_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("world0"));
        PADDING_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("padding"));
        GENERATION_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("generation"));
        //@formatter:on
    }

    public ContactId() {
        this(Arena.ofAuto());
    }
    
    public ContactId(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public ContactId(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #index1()
    public ContactId index1(int index1) {
    	INDEX1_HANDLE.set(segment, 0L, index1);
    	return this;
    }
    
    public int index1() {
    	return (int) INDEX1_HANDLE.get(segment, 0L);
    }
    
    /// @see #world0()
    public ContactId world0(short world0) {
    	WORLD0_HANDLE.set(segment, 0L, world0);
    	return this;
    }
    
    public short world0() {
    	return (short) WORLD0_HANDLE.get(segment, 0L);
    }
    
    /// @see #padding()
    public ContactId padding(short padding) {
    	PADDING_HANDLE.set(segment, 0L, padding);
    	return this;
    }
    
    public short padding() {
    	return (short) PADDING_HANDLE.get(segment, 0L);
    }
    
    /// @see #generation()
    public ContactId generation(int generation) {
    	GENERATION_HANDLE.set(segment, 0L, generation);
    	return this;
    }
    
    public int generation() {
    	return (int) GENERATION_HANDLE.get(segment, 0L);
    }
    
    @Override
    public ContactId set(ContactId other) {
        return set(other.segment);
    }
    
    @Override
    public ContactId set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<ContactId> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<ContactId> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new ContactId(segment),
            count
        );
    }
    
    public static NativeStructArray<ContactId> array(Arena arena, ContactId... structs) {
        NativeStructArray<ContactId> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new ContactId(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<ContactId> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new ContactId(segment)
        );
    }
    
}