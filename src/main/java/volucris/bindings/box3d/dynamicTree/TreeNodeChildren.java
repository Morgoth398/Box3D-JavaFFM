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
/// Tree node child indices. For internal usage.
/// ```
public final class TreeNodeChildren
		implements Struct<TreeNodeChildren> {

    public static final StructLayout LAYOUT;

    public static final VarHandle CHILD1_HANDLE;
    public static final VarHandle CHILD2_HANDLE;

    public static final long CHILD1_BYTE_OFFSET;
    public static final long CHILD2_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("child1"),
            JAVA_INT.withName("child2")
        ).withName("b3TreeNodeChildren").withByteAlignment(4);
        
        CHILD1_HANDLE = LAYOUT.varHandle(PathElement.groupElement("child1"));
        CHILD2_HANDLE = LAYOUT.varHandle(PathElement.groupElement("child2"));
        
        CHILD1_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("child1"));
        CHILD2_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("child2"));
        //@formatter:on
    }

    public TreeNodeChildren() {
        this(Arena.ofAuto());
    }
    
    public TreeNodeChildren(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public TreeNodeChildren(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #child1()
    public TreeNodeChildren child1(int child1) {
    	CHILD1_HANDLE.set(segment, 0L, child1);
    	return this;
    }
    
    /// ```
    /// child node index 1
    /// ```
    public int child1() {
    	return (int) CHILD1_HANDLE.get(segment, 0L);
    }
    
    /// @see #child2()
    public TreeNodeChildren child2(int child2) {
    	CHILD2_HANDLE.set(segment, 0L, child2);
    	return this;
    }
    
    /// ```
    /// child node index 2
    /// ```
    public int child2() {
    	return (int) CHILD2_HANDLE.get(segment, 0L);
    }
    
    @Override
    public TreeNodeChildren set(TreeNodeChildren other) {
        return set(other.segment);
    }
    
    @Override
    public TreeNodeChildren set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<TreeNodeChildren> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<TreeNodeChildren> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new TreeNodeChildren(segment),
            count
        );
    }
    
    public static NativeStructArray<TreeNodeChildren> array(Arena arena, TreeNodeChildren... structs) {
        NativeStructArray<TreeNodeChildren> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new TreeNodeChildren(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<TreeNodeChildren> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new TreeNodeChildren(segment)
        );
    }
    
}