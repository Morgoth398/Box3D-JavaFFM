/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.box3d.query;

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
/// Simplex from the GJK algorithm
/// ```
public final class Simplex
		implements Struct<Simplex> {

    public static final StructLayout LAYOUT;

    public static final VarHandle COUNT_HANDLE;

    public static final long VERTICES_BYTE_OFFSET;
    public static final long COUNT_BYTE_OFFSET;

    private final MemorySegment segment;

    private final SimplexVertex[] vertices;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(4, SimplexVertex.LAYOUT).withName("vertices"),
            JAVA_INT.withName("count")
        ).withName("b3Simplex").withByteAlignment(4);
        
        COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("count"));
        
        VERTICES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("vertices"));
        COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("count"));
        //@formatter:on
    }

    public Simplex() {
        this(Arena.ofAuto());
    }
    
    public Simplex(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public Simplex(MemorySegment segment) {
        this.segment = segment;
    
        vertices = new SimplexVertex[4];
        for (int i = 0; i < 4; i++) {
            long offset = VERTICES_BYTE_OFFSET + i * SimplexVertex.LAYOUT.byteSize();
            vertices[i] = new SimplexVertex(segment.asSlice(offset, SimplexVertex.LAYOUT));
        }
    
    }

    /// @see #count()
    public Simplex count(int count) {
    	COUNT_HANDLE.set(segment, 0L, count);
    	return this;
    }
    
    /// ```
    /// number of valid vertices
    /// ```
    public int count() {
    	return (int) COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #vertices(int)
    public Simplex vertices(Consumer<SimplexVertex> consumer, int index) {
    	consumer.accept(vertices[index]);
    	return this;
    }
    
    /// @see #vertices(int)
    public Simplex vertices(SimplexVertex other, int index) {
    	vertices[index].set(other);
    	return this;
    }
    
    /// ```
    /// vertices
    /// ```
    public SimplexVertex vertices(int index) {
    	return vertices[index];
    }
    
    @Override
    public Simplex set(Simplex other) {
        return set(other.segment);
    }
    
    @Override
    public Simplex set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<Simplex> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<Simplex> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new Simplex(segment),
            count
        );
    }
    
    public static NativeStructArray<Simplex> array(Arena arena, Simplex... structs) {
        NativeStructArray<Simplex> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new Simplex(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<Simplex> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new Simplex(segment)
        );
    }
    
}