/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.box3d.math;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;

/// ```
/// Cosine and sine pair.
/// This uses a custom implementation designed for cross-platform determinism.
/// ```
public final class CosSin
		implements Struct<CosSin> {

    public static final StructLayout LAYOUT;

    public static final VarHandle COSINE_HANDLE;
    public static final VarHandle SINE_HANDLE;

    public static final long COSINE_BYTE_OFFSET;
    public static final long SINE_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_FLOAT.withName("cosine"),
            JAVA_FLOAT.withName("sine")
        ).withName("b3CosSin").withByteAlignment(4);
        
        COSINE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("cosine"));
        SINE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sine"));
        
        COSINE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("cosine"));
        SINE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sine"));
        //@formatter:on
    }

    public CosSin() {
        this(Arena.ofAuto());
    }
    
    public CosSin(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public CosSin(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #cosine()
    public CosSin cosine(float cosine) {
    	COSINE_HANDLE.set(segment, 0L, cosine);
    	return this;
    }
    
    /// ```
    /// cosine and sine
    /// ```
    public float cosine() {
    	return (float) COSINE_HANDLE.get(segment, 0L);
    }
    
    /// @see #sine()
    public CosSin sine(float sine) {
    	SINE_HANDLE.set(segment, 0L, sine);
    	return this;
    }
    
    public float sine() {
    	return (float) SINE_HANDLE.get(segment, 0L);
    }
    
    @Override
    public CosSin set(CosSin other) {
        return set(other.segment);
    }
    
    @Override
    public CosSin set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<CosSin> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<CosSin> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new CosSin(segment),
            count
        );
    }
    
    public static NativeStructArray<CosSin> array(Arena arena, CosSin... structs) {
        NativeStructArray<CosSin> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new CosSin(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<CosSin> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new CosSin(segment)
        );
    }
    
}