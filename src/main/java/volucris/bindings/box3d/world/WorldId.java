/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.box3d.world;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;

/// ```
/// World id references a world instance. This should be treated as an opaque handle.
/// ```
public final class WorldId
		implements Struct<WorldId> {

    public static final StructLayout LAYOUT;

    public static final VarHandle INDEX1_HANDLE;
    public static final VarHandle GENERATION_HANDLE;

    public static final long INDEX1_BYTE_OFFSET;
    public static final long GENERATION_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_SHORT.withName("index1"),
            JAVA_SHORT.withName("generation")
        ).withName("b3WorldId").withByteAlignment(2);
        
        INDEX1_HANDLE = LAYOUT.varHandle(PathElement.groupElement("index1"));
        GENERATION_HANDLE = LAYOUT.varHandle(PathElement.groupElement("generation"));
        
        INDEX1_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("index1"));
        GENERATION_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("generation"));
        //@formatter:on
    }

    public WorldId() {
        this(Arena.ofAuto());
    }
    
    public WorldId(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public WorldId(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #index1()
    public WorldId index1(short index1) {
    	INDEX1_HANDLE.set(segment, 0L, index1);
    	return this;
    }
    
    public short index1() {
    	return (short) INDEX1_HANDLE.get(segment, 0L);
    }
    
    /// @see #generation()
    public WorldId generation(short generation) {
    	GENERATION_HANDLE.set(segment, 0L, generation);
    	return this;
    }
    
    public short generation() {
    	return (short) GENERATION_HANDLE.get(segment, 0L);
    }
    
    @Override
    public WorldId set(WorldId other) {
        return set(other.segment);
    }
    
    @Override
    public WorldId set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<WorldId> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<WorldId> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new WorldId(segment),
            count
        );
    }
    
    public static NativeStructArray<WorldId> array(Arena arena, WorldId... structs) {
        NativeStructArray<WorldId> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new WorldId(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<WorldId> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new WorldId(segment)
        );
    }
    
}