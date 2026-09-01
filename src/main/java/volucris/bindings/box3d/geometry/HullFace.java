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
/// A hull face. Hulls use a half-edge data structure, so a face
/// can be determined from a single half-edge index.
/// ```
public final class HullFace
		implements Struct<HullFace> {

    public static final StructLayout LAYOUT;

    public static final VarHandle EDGE_HANDLE;

    public static final long EDGE_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_BYTE.withName("edge")
        ).withName("b3HullFace").withByteAlignment(1);
        
        EDGE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("edge"));
        
        EDGE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("edge"));
        //@formatter:on
    }

    public HullFace() {
        this(Arena.ofAuto());
    }
    
    public HullFace(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public HullFace(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #edge()
    public HullFace edge(byte edge) {
    	EDGE_HANDLE.set(segment, 0L, edge);
    	return this;
    }
    
    /// ```
    /// An arbitrary half-edge on this face
    /// ```
    public byte edge() {
    	return (byte) EDGE_HANDLE.get(segment, 0L);
    }
    
    @Override
    public HullFace set(HullFace other) {
        return set(other.segment);
    }
    
    @Override
    public HullFace set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<HullFace> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<HullFace> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new HullFace(segment),
            count
        );
    }
    
    public static NativeStructArray<HullFace> array(Arena arena, HullFace... structs) {
        NativeStructArray<HullFace> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new HullFace(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<HullFace> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new HullFace(segment)
        );
    }
    
}