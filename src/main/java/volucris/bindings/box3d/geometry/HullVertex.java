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
/// A hull vertex. Identified by a half-edge with this
/// vertex as its tail.
/// ```
public final class HullVertex
		implements Struct<HullVertex> {

    public static final StructLayout LAYOUT;

    public static final VarHandle EDGE_HANDLE;

    public static final long EDGE_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_BYTE.withName("edge")
        ).withName("b3HullVertex").withByteAlignment(1);
        
        EDGE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("edge"));
        
        EDGE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("edge"));
        //@formatter:on
    }

    public HullVertex() {
        this(Arena.ofAuto());
    }
    
    public HullVertex(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public HullVertex(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #edge()
    public HullVertex edge(byte edge) {
    	EDGE_HANDLE.set(segment, 0L, edge);
    	return this;
    }
    
    /// ```
    /// A half-edge that has this vertex as the origin
    /// Can be used along with edge twins and winding order
    /// to traverse all the edges connected to this vertex.
    /// ```
    public byte edge() {
    	return (byte) EDGE_HANDLE.get(segment, 0L);
    }
    
    @Override
    public HullVertex set(HullVertex other) {
        return set(other.segment);
    }
    
    @Override
    public HullVertex set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<HullVertex> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<HullVertex> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new HullVertex(segment),
            count
        );
    }
    
    public static NativeStructArray<HullVertex> array(Arena arena, HullVertex... structs) {
        NativeStructArray<HullVertex> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new HullVertex(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<HullVertex> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new HullVertex(segment)
        );
    }
    
}