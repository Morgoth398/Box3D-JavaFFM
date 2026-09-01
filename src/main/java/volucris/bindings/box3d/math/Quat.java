/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.box3d.math;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;
import java.util.function.Consumer;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;

/// ```
/// A quaternion.
/// ```
public final class Quat
		implements Struct<Quat> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_HANDLE;

    public static final long V_BYTE_OFFSET;
    public static final long S_BYTE_OFFSET;

    private final MemorySegment segment;

    private final Vec3 v;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            Vec3.LAYOUT.withName("v"),
            JAVA_FLOAT.withName("s")
        ).withName("b3Quat").withByteAlignment(4);
        
        S_HANDLE = LAYOUT.varHandle(PathElement.groupElement("s"));
        
        V_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("v"));
        S_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("s"));
        //@formatter:on
    }

    public Quat() {
        this(Arena.ofAuto());
    }
    
    public Quat(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public Quat(MemorySegment segment) {
        this.segment = segment;
    
        v = new Vec3(segment.asSlice(V_BYTE_OFFSET, Vec3.LAYOUT));
    }

    /// @see #s()
    public Quat s(float s) {
    	S_HANDLE.set(segment, 0L, s);
    	return this;
    }
    
    public float s() {
    	return (float) S_HANDLE.get(segment, 0L);
    }
    
    /// @see #v()
    public Quat v(Consumer<Vec3> consumer) {
    	consumer.accept(v);
    	return this;
    }
    
    /// @see #v()
    public Quat v(Vec3 other) {
    	v.set(other);
    	return this;
    }
    
    public Vec3 v() {
    	return v;
    }
    
    @Override
    public Quat set(Quat other) {
        return set(other.segment);
    }
    
    @Override
    public Quat set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<Quat> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<Quat> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new Quat(segment),
            count
        );
    }
    
    public static NativeStructArray<Quat> array(Arena arena, Quat... structs) {
        NativeStructArray<Quat> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new Quat(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<Quat> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new Quat(segment)
        );
    }
    
}