/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.box3d.dynamicTree;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;
import java.util.function.Consumer;
import volucris.bindings.box3d.math.AABB;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;

/// ```
/// A node in the dynamic tree. This is private data placed here for performance reasons.
/// todo test padding to 64 bytes to avoid straddling cache lines
/// ```
public final class TreeNode
		implements Struct<TreeNode> {

    public static final StructLayout LAYOUT;

    public static final VarHandle CATEGORY_BITS_HANDLE;
    public static final VarHandle HEIGHT_HANDLE;
    public static final VarHandle FLAGS_HANDLE;

    public static final long AABB_BYTE_OFFSET;
    public static final long CATEGORY_BITS_BYTE_OFFSET;
    public static final long HEIGHT_BYTE_OFFSET;
    public static final long FLAGS_BYTE_OFFSET;

    private final MemorySegment segment;

    private final AABB aabb;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            AABB.LAYOUT.withName("aabb"),
            JAVA_LONG.withName("categoryBits"),
            MemoryLayout.paddingLayout(12),
            JAVA_SHORT.withName("height"),
            JAVA_SHORT.withName("flags")
        ).withName("b3TreeNode").withByteAlignment(8);
        
        CATEGORY_BITS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("categoryBits"));
        HEIGHT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("height"));
        FLAGS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("flags"));
        
        AABB_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("aabb"));
        CATEGORY_BITS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("categoryBits"));
        HEIGHT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("height"));
        FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("flags"));
        //@formatter:on
    }

    public TreeNode() {
        this(Arena.ofAuto());
    }
    
    public TreeNode(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public TreeNode(MemorySegment segment) {
        this.segment = segment;
    
        aabb = new AABB(segment.asSlice(AABB_BYTE_OFFSET, AABB.LAYOUT));
    }

    /// @see #categoryBits()
    public TreeNode categoryBits(long categoryBits) {
    	CATEGORY_BITS_HANDLE.set(segment, 0L, categoryBits);
    	return this;
    }
    
    /// ```
    /// Category bits for collision filtering
    /// ```
    public long categoryBits() {
    	return (long) CATEGORY_BITS_HANDLE.get(segment, 0L);
    }
    
    /// @see #height()
    public TreeNode height(short height) {
    	HEIGHT_HANDLE.set(segment, 0L, height);
    	return this;
    }
    
    /// ```
    /// Height of the node. Leaves have a height of 0.
    /// ```
    public short height() {
    	return (short) HEIGHT_HANDLE.get(segment, 0L);
    }
    
    /// @see #flags()
    public TreeNode flags(short flags) {
    	FLAGS_HANDLE.set(segment, 0L, flags);
    	return this;
    }
    
    /// ```
    /// @see b3TreeNodeFlags
    /// ```
    public short flags() {
    	return (short) FLAGS_HANDLE.get(segment, 0L);
    }
    
    /// @see #aabb()
    public TreeNode aabb(Consumer<AABB> consumer) {
    	consumer.accept(aabb);
    	return this;
    }
    
    /// @see #aabb()
    public TreeNode aabb(AABB other) {
    	aabb.set(other);
    	return this;
    }
    
    /// ```
    /// The node bounding box
    /// ```
    public AABB aabb() {
    	return aabb;
    }
    
    @Override
    public TreeNode set(TreeNode other) {
        return set(other.segment);
    }
    
    @Override
    public TreeNode set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<TreeNode> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<TreeNode> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new TreeNode(segment),
            count
        );
    }
    
    public static NativeStructArray<TreeNode> array(Arena arena, TreeNode... structs) {
        NativeStructArray<TreeNode> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new TreeNode(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<TreeNode> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new TreeNode(segment)
        );
    }
    
}