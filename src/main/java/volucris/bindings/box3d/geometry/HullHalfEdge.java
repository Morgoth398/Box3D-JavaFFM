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
/// Half-edge for hull data structure
/// ```
public final class HullHalfEdge
		implements Struct<HullHalfEdge> {

    public static final StructLayout LAYOUT;

    public static final VarHandle NEXT_HANDLE;
    public static final VarHandle TWIN_HANDLE;
    public static final VarHandle ORIGIN_HANDLE;
    public static final VarHandle FACE_HANDLE;

    public static final long NEXT_BYTE_OFFSET;
    public static final long TWIN_BYTE_OFFSET;
    public static final long ORIGIN_BYTE_OFFSET;
    public static final long FACE_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_BYTE.withName("next"),
            JAVA_BYTE.withName("twin"),
            JAVA_BYTE.withName("origin"),
            JAVA_BYTE.withName("face")
        ).withName("b3HullHalfEdge").withByteAlignment(1);
        
        NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("next"));
        TWIN_HANDLE = LAYOUT.varHandle(PathElement.groupElement("twin"));
        ORIGIN_HANDLE = LAYOUT.varHandle(PathElement.groupElement("origin"));
        FACE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("face"));
        
        NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("next"));
        TWIN_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("twin"));
        ORIGIN_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("origin"));
        FACE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("face"));
        //@formatter:on
    }

    public HullHalfEdge() {
        this(Arena.ofAuto());
    }
    
    public HullHalfEdge(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public HullHalfEdge(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #next()
    public HullHalfEdge next(byte next) {
    	NEXT_HANDLE.set(segment, 0L, next);
    	return this;
    }
    
    /// ```
    /// Next edge index CCW
    /// ```
    public byte next() {
    	return (byte) NEXT_HANDLE.get(segment, 0L);
    }
    
    /// @see #twin()
    public HullHalfEdge twin(byte twin) {
    	TWIN_HANDLE.set(segment, 0L, twin);
    	return this;
    }
    
    /// ```
    /// Twin edge index
    /// ```
    public byte twin() {
    	return (byte) TWIN_HANDLE.get(segment, 0L);
    }
    
    /// @see #origin()
    public HullHalfEdge origin(byte origin) {
    	ORIGIN_HANDLE.set(segment, 0L, origin);
    	return this;
    }
    
    /// ```
    /// index of origin vertex and point
    /// ```
    public byte origin() {
    	return (byte) ORIGIN_HANDLE.get(segment, 0L);
    }
    
    /// @see #face()
    public HullHalfEdge face(byte face) {
    	FACE_HANDLE.set(segment, 0L, face);
    	return this;
    }
    
    /// ```
    /// Face to the left of this edge
    /// ```
    public byte face() {
    	return (byte) FACE_HANDLE.get(segment, 0L);
    }
    
    @Override
    public HullHalfEdge set(HullHalfEdge other) {
        return set(other.segment);
    }
    
    @Override
    public HullHalfEdge set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<HullHalfEdge> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<HullHalfEdge> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new HullHalfEdge(segment),
            count
        );
    }
    
    public static NativeStructArray<HullHalfEdge> array(Arena arena, HullHalfEdge... structs) {
        NativeStructArray<HullHalfEdge> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new HullHalfEdge(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<HullHalfEdge> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new HullHalfEdge(segment)
        );
    }
    
}