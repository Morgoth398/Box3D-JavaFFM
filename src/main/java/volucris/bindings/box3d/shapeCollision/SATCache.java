/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.box3d.shapeCollision;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;

/// ```
/// Separating axis test cache. Provides temporal acceleration of collision routines.
/// ```
public final class SATCache
		implements Struct<SATCache> {

    public static final StructLayout LAYOUT;

    public static final VarHandle SEPARATION_HANDLE;
    public static final VarHandle TYPE_HANDLE;
    public static final VarHandle INDEX_A_HANDLE;
    public static final VarHandle INDEX_B_HANDLE;
    public static final VarHandle HIT_HANDLE;

    public static final long SEPARATION_BYTE_OFFSET;
    public static final long TYPE_BYTE_OFFSET;
    public static final long INDEX_A_BYTE_OFFSET;
    public static final long INDEX_B_BYTE_OFFSET;
    public static final long HIT_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_FLOAT.withName("separation"),
            JAVA_BYTE.withName("type"),
            JAVA_BYTE.withName("indexA"),
            JAVA_BYTE.withName("indexB"),
            JAVA_BYTE.withName("hit")
        ).withName("b3SATCache").withByteAlignment(4);
        
        SEPARATION_HANDLE = LAYOUT.varHandle(PathElement.groupElement("separation"));
        TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("type"));
        INDEX_A_HANDLE = LAYOUT.varHandle(PathElement.groupElement("indexA"));
        INDEX_B_HANDLE = LAYOUT.varHandle(PathElement.groupElement("indexB"));
        HIT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("hit"));
        
        SEPARATION_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("separation"));
        TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("type"));
        INDEX_A_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("indexA"));
        INDEX_B_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("indexB"));
        HIT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("hit"));
        //@formatter:on
    }

    public SATCache() {
        this(Arena.ofAuto());
    }
    
    public SATCache(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public SATCache(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #separation()
    public SATCache separation(float separation) {
    	SEPARATION_HANDLE.set(segment, 0L, separation);
    	return this;
    }
    
    /// ```
    /// The separation when the cache is populated. Negative for overlap.
    /// ```
    public float separation() {
    	return (float) SEPARATION_HANDLE.get(segment, 0L);
    }
    
    /// @see #type()
    public SATCache type(byte type) {
    	TYPE_HANDLE.set(segment, 0L, type);
    	return this;
    }
    
    /// ```
    /// b3SeparatingFeature.
    /// ```
    public byte type() {
    	return (byte) TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #indexA()
    public SATCache indexA(byte indexA) {
    	INDEX_A_HANDLE.set(segment, 0L, indexA);
    	return this;
    }
    
    /// ```
    /// Index of the feature on shape A.
    /// ```
    public byte indexA() {
    	return (byte) INDEX_A_HANDLE.get(segment, 0L);
    }
    
    /// @see #indexB()
    public SATCache indexB(byte indexB) {
    	INDEX_B_HANDLE.set(segment, 0L, indexB);
    	return this;
    }
    
    /// ```
    /// Index of the feature on shape B.
    /// ```
    public byte indexB() {
    	return (byte) INDEX_B_HANDLE.get(segment, 0L);
    }
    
    /// @see #hit()
    public SATCache hit(byte hit) {
    	HIT_HANDLE.set(segment, 0L, hit);
    	return this;
    }
    
    /// ```
    /// Was the cache re-used?
    /// ```
    public byte hit() {
    	return (byte) HIT_HANDLE.get(segment, 0L);
    }
    
    @Override
    public SATCache set(SATCache other) {
        return set(other.segment);
    }
    
    @Override
    public SATCache set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<SATCache> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<SATCache> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new SATCache(segment),
            count
        );
    }
    
    public static NativeStructArray<SATCache> array(Arena arena, SATCache... structs) {
        NativeStructArray<SATCache> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new SATCache(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<SATCache> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new SATCache(segment)
        );
    }
    
}