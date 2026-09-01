/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.box3d.dynamicTree;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;

/// ```
/// These are performance results returned by dynamic tree queries.
/// ```
public final class TreeStats
		implements Struct<TreeStats> {

    public static final StructLayout LAYOUT;

    public static final VarHandle NODE_VISITS_HANDLE;
    public static final VarHandle LEAF_VISITS_HANDLE;

    public static final long NODE_VISITS_BYTE_OFFSET;
    public static final long LEAF_VISITS_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("nodeVisits"),
            JAVA_INT.withName("leafVisits")
        ).withName("b3TreeStats").withByteAlignment(4);
        
        NODE_VISITS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("nodeVisits"));
        LEAF_VISITS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("leafVisits"));
        
        NODE_VISITS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("nodeVisits"));
        LEAF_VISITS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("leafVisits"));
        //@formatter:on
    }

    public TreeStats() {
        this(Arena.ofAuto());
    }
    
    public TreeStats(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public TreeStats(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #nodeVisits()
    public TreeStats nodeVisits(int nodeVisits) {
    	NODE_VISITS_HANDLE.set(segment, 0L, nodeVisits);
    	return this;
    }
    
    /// ```
    /// Number of internal nodes visited during the query
    /// ```
    public int nodeVisits() {
    	return (int) NODE_VISITS_HANDLE.get(segment, 0L);
    }
    
    /// @see #leafVisits()
    public TreeStats leafVisits(int leafVisits) {
    	LEAF_VISITS_HANDLE.set(segment, 0L, leafVisits);
    	return this;
    }
    
    /// ```
    /// Number of leaf nodes visited during the query
    /// ```
    public int leafVisits() {
    	return (int) LEAF_VISITS_HANDLE.get(segment, 0L);
    }
    
    @Override
    public TreeStats set(TreeStats other) {
        return set(other.segment);
    }
    
    @Override
    public TreeStats set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<TreeStats> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<TreeStats> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new TreeStats(segment),
            count
        );
    }
    
    public static NativeStructArray<TreeStats> array(Arena arena, TreeStats... structs) {
        NativeStructArray<TreeStats> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new TreeStats(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<TreeStats> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new TreeStats(segment)
        );
    }
    
}