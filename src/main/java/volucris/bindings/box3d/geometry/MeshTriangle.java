/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.box3d.geometry;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;

/// ```
/// A mesh triangle.
/// ```
public final class MeshTriangle
		implements Struct<MeshTriangle> {

    public static final StructLayout LAYOUT;

    public static final VarHandle INDEX1_HANDLE;
    public static final VarHandle INDEX2_HANDLE;
    public static final VarHandle INDEX3_HANDLE;

    public static final long INDEX1_BYTE_OFFSET;
    public static final long INDEX2_BYTE_OFFSET;
    public static final long INDEX3_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("index1"),
            JAVA_INT.withName("index2"),
            JAVA_INT.withName("index3")
        ).withName("b3MeshTriangle").withByteAlignment(4);
        
        INDEX1_HANDLE = LAYOUT.varHandle(PathElement.groupElement("index1"));
        INDEX2_HANDLE = LAYOUT.varHandle(PathElement.groupElement("index2"));
        INDEX3_HANDLE = LAYOUT.varHandle(PathElement.groupElement("index3"));
        
        INDEX1_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("index1"));
        INDEX2_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("index2"));
        INDEX3_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("index3"));
        //@formatter:on
    }

    public MeshTriangle() {
        this(Arena.ofAuto());
    }
    
    public MeshTriangle(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public MeshTriangle(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #index1()
    public MeshTriangle index1(int index1) {
    	INDEX1_HANDLE.set(segment, 0L, index1);
    	return this;
    }
    
    /// ```
    /// Index of vertex 1.
    /// ```
    public int index1() {
    	return (int) INDEX1_HANDLE.get(segment, 0L);
    }
    
    /// @see #index2()
    public MeshTriangle index2(int index2) {
    	INDEX2_HANDLE.set(segment, 0L, index2);
    	return this;
    }
    
    /// ```
    /// Index of vertex 2.
    /// ```
    public int index2() {
    	return (int) INDEX2_HANDLE.get(segment, 0L);
    }
    
    /// @see #index3()
    public MeshTriangle index3(int index3) {
    	INDEX3_HANDLE.set(segment, 0L, index3);
    	return this;
    }
    
    /// ```
    /// Index of vertex 3.
    /// ```
    public int index3() {
    	return (int) INDEX3_HANDLE.get(segment, 0L);
    }
    
    @Override
    public MeshTriangle set(MeshTriangle other) {
        return set(other.segment);
    }
    
    @Override
    public MeshTriangle set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<MeshTriangle> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<MeshTriangle> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new MeshTriangle(segment),
            count
        );
    }
    
    public static NativeStructArray<MeshTriangle> array(Arena arena, MeshTriangle... structs) {
        NativeStructArray<MeshTriangle> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new MeshTriangle(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<MeshTriangle> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new MeshTriangle(segment)
        );
    }
    
}