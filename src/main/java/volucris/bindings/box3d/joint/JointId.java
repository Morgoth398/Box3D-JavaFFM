/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.box3d.joint;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;

/// ```
/// Joint id references a joint instance. This should be treated as an opaque handle.
/// ```
public final class JointId
		implements Struct<JointId> {

    public static final StructLayout LAYOUT;

    public static final VarHandle INDEX1_HANDLE;
    public static final VarHandle WORLD0_HANDLE;
    public static final VarHandle GENERATION_HANDLE;

    public static final long INDEX1_BYTE_OFFSET;
    public static final long WORLD0_BYTE_OFFSET;
    public static final long GENERATION_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("index1"),
            JAVA_SHORT.withName("world0"),
            JAVA_SHORT.withName("generation")
        ).withName("b3JointId").withByteAlignment(4);
        
        INDEX1_HANDLE = LAYOUT.varHandle(PathElement.groupElement("index1"));
        WORLD0_HANDLE = LAYOUT.varHandle(PathElement.groupElement("world0"));
        GENERATION_HANDLE = LAYOUT.varHandle(PathElement.groupElement("generation"));
        
        INDEX1_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("index1"));
        WORLD0_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("world0"));
        GENERATION_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("generation"));
        //@formatter:on
    }

    public JointId() {
        this(Arena.ofAuto());
    }
    
    public JointId(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public JointId(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #index1()
    public JointId index1(int index1) {
    	INDEX1_HANDLE.set(segment, 0L, index1);
    	return this;
    }
    
    public int index1() {
    	return (int) INDEX1_HANDLE.get(segment, 0L);
    }
    
    /// @see #world0()
    public JointId world0(short world0) {
    	WORLD0_HANDLE.set(segment, 0L, world0);
    	return this;
    }
    
    public short world0() {
    	return (short) WORLD0_HANDLE.get(segment, 0L);
    }
    
    /// @see #generation()
    public JointId generation(short generation) {
    	GENERATION_HANDLE.set(segment, 0L, generation);
    	return this;
    }
    
    public short generation() {
    	return (short) GENERATION_HANDLE.get(segment, 0L);
    }
    
    @Override
    public JointId set(JointId other) {
        return set(other.segment);
    }
    
    @Override
    public JointId set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<JointId> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<JointId> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new JointId(segment),
            count
        );
    }
    
    public static NativeStructArray<JointId> array(Arena arena, JointId... structs) {
        NativeStructArray<JointId> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new JointId(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<JointId> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new JointId(segment)
        );
    }
    
}