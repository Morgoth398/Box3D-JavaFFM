/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.box3d.query;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;

/// ```
/// Used to warm start the GJK simplex. If you call this function multiple times with nearby
/// transforms this might improve performance. Otherwise you can zero initialize this.
/// The distance cache must be initialized to zero on the first call.
/// Users should generally just zero initialize this structure for each call.
/// ```
public final class SimplexCache
		implements Struct<SimplexCache> {

    public static final StructLayout LAYOUT;

    public static final VarHandle METRIC_HANDLE;
    public static final VarHandle COUNT_HANDLE;
    public static final VarHandle INDEX_A_HANDLE;
    public static final VarHandle INDEX_B_HANDLE;

    public static final long METRIC_BYTE_OFFSET;
    public static final long COUNT_BYTE_OFFSET;
    public static final long INDEX_A_BYTE_OFFSET;
    public static final long INDEX_B_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_FLOAT.withName("metric"),
            JAVA_SHORT.withName("count"),
            MemoryLayout.sequenceLayout(4, JAVA_BYTE).withName("indexA"),
            MemoryLayout.sequenceLayout(4, JAVA_BYTE).withName("indexB"),
            MemoryLayout.paddingLayout(2)
        ).withName("b3SimplexCache").withByteAlignment(4);
        
        METRIC_HANDLE = LAYOUT.varHandle(PathElement.groupElement("metric"));
        COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("count"));
        INDEX_A_HANDLE = LAYOUT.varHandle(PathElement.groupElement("indexA"), PathElement.sequenceElement());
        INDEX_B_HANDLE = LAYOUT.varHandle(PathElement.groupElement("indexB"), PathElement.sequenceElement());
        
        METRIC_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("metric"));
        COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("count"));
        INDEX_A_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("indexA"));
        INDEX_B_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("indexB"));
        //@formatter:on
    }

    public SimplexCache() {
        this(Arena.ofAuto());
    }
    
    public SimplexCache(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public SimplexCache(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #metric()
    public SimplexCache metric(float metric) {
    	METRIC_HANDLE.set(segment, 0L, metric);
    	return this;
    }
    
    /// ```
    /// Value use to compare length, area, volume of two simplexes.
    /// ```
    public float metric() {
    	return (float) METRIC_HANDLE.get(segment, 0L);
    }
    
    /// @see #count()
    public SimplexCache count(short count) {
    	COUNT_HANDLE.set(segment, 0L, count);
    	return this;
    }
    
    /// ```
    /// The number of stored simplex points
    /// ```
    public short count() {
    	return (short) COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #indexA(int)
    public SimplexCache indexA(byte indexA, int index0) {
    	INDEX_A_HANDLE.set(segment, 0L, index0, indexA);
    	return this;
    }
    
    /// ```
    /// The cached simplex indices on shape A
    /// ```
    public byte indexA(int index0) {
    	return (byte) INDEX_A_HANDLE.get(segment, 0L, index0);
    }
    
    /// @see #indexB(int)
    public SimplexCache indexB(byte indexB, int index0) {
    	INDEX_B_HANDLE.set(segment, 0L, index0, indexB);
    	return this;
    }
    
    /// ```
    /// The cached simplex indices on shape B
    /// ```
    public byte indexB(int index0) {
    	return (byte) INDEX_B_HANDLE.get(segment, 0L, index0);
    }
    
    @Override
    public SimplexCache set(SimplexCache other) {
        return set(other.segment);
    }
    
    @Override
    public SimplexCache set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<SimplexCache> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<SimplexCache> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new SimplexCache(segment),
            count
        );
    }
    
    public static NativeStructArray<SimplexCache> array(Arena arena, SimplexCache... structs) {
        NativeStructArray<SimplexCache> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new SimplexCache(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<SimplexCache> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new SimplexCache(segment)
        );
    }
    
}