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
/// Contact points are always the result of two edges intersecting.
/// It can be two edges of the same shape, which is just a shape vertex.
/// Or a contact point can be the result of two edges crossing from different shapes.
/// This is designed to support hull versus hull, but it is adapted to work
/// with all shape types. The feature pair is used to identify contact points
/// for temporal coherence and warm starting.
/// ```
public final class FeaturePair
		implements Struct<FeaturePair> {

    public static final StructLayout LAYOUT;

    public static final VarHandle OWNER1_HANDLE;
    public static final VarHandle INDEX1_HANDLE;
    public static final VarHandle OWNER2_HANDLE;
    public static final VarHandle INDEX2_HANDLE;

    public static final long OWNER1_BYTE_OFFSET;
    public static final long INDEX1_BYTE_OFFSET;
    public static final long OWNER2_BYTE_OFFSET;
    public static final long INDEX2_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_BYTE.withName("owner1"),
            JAVA_BYTE.withName("index1"),
            JAVA_BYTE.withName("owner2"),
            JAVA_BYTE.withName("index2")
        ).withName("b3FeaturePair").withByteAlignment(1);
        
        OWNER1_HANDLE = LAYOUT.varHandle(PathElement.groupElement("owner1"));
        INDEX1_HANDLE = LAYOUT.varHandle(PathElement.groupElement("index1"));
        OWNER2_HANDLE = LAYOUT.varHandle(PathElement.groupElement("owner2"));
        INDEX2_HANDLE = LAYOUT.varHandle(PathElement.groupElement("index2"));
        
        OWNER1_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("owner1"));
        INDEX1_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("index1"));
        OWNER2_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("owner2"));
        INDEX2_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("index2"));
        //@formatter:on
    }

    public FeaturePair() {
        this(Arena.ofAuto());
    }
    
    public FeaturePair(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public FeaturePair(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #owner1()
    public FeaturePair owner1(byte owner1) {
    	OWNER1_HANDLE.set(segment, 0L, owner1);
    	return this;
    }
    
    /// ```
    /// Incoming type (either edge on shape A or shape B)
    /// ```
    public byte owner1() {
    	return (byte) OWNER1_HANDLE.get(segment, 0L);
    }
    
    /// @see #index1()
    public FeaturePair index1(byte index1) {
    	INDEX1_HANDLE.set(segment, 0L, index1);
    	return this;
    }
    
    /// ```
    /// Incoming edge index (into associated shape array)
    /// ```
    public byte index1() {
    	return (byte) INDEX1_HANDLE.get(segment, 0L);
    }
    
    /// @see #owner2()
    public FeaturePair owner2(byte owner2) {
    	OWNER2_HANDLE.set(segment, 0L, owner2);
    	return this;
    }
    
    /// ```
    /// Outgoing type (either edge on shape A or shape B)
    /// ```
    public byte owner2() {
    	return (byte) OWNER2_HANDLE.get(segment, 0L);
    }
    
    /// @see #index2()
    public FeaturePair index2(byte index2) {
    	INDEX2_HANDLE.set(segment, 0L, index2);
    	return this;
    }
    
    /// ```
    /// Outgoing edge index (into associated shape array)
    /// ```
    public byte index2() {
    	return (byte) INDEX2_HANDLE.get(segment, 0L);
    }
    
    @Override
    public FeaturePair set(FeaturePair other) {
        return set(other.segment);
    }
    
    @Override
    public FeaturePair set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<FeaturePair> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<FeaturePair> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new FeaturePair(segment),
            count
        );
    }
    
    public static NativeStructArray<FeaturePair> array(Arena arena, FeaturePair... structs) {
        NativeStructArray<FeaturePair> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new FeaturePair(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<FeaturePair> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new FeaturePair(segment)
        );
    }
    
}