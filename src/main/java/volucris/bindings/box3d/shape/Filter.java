/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.box3d.shape;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.StructLayout;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import org.jspecify.annotations.Nullable;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

/// ```
/// This is used to filter collision on shapes. It affects shape-vs-shape collision
/// and shape-versus-query collision (such as b3World_CastRay).
/// @ingroup shape
/// ```
public final class Filter
		implements Struct<Filter> {

    private static final LazyConstant<MethodHandle> B3_DEFAULT_FILTER;

    public static final StructLayout LAYOUT;

    public static final VarHandle CATEGORY_BITS_HANDLE;
    public static final VarHandle MASK_BITS_HANDLE;
    public static final VarHandle GROUP_INDEX_HANDLE;

    public static final long CATEGORY_BITS_BYTE_OFFSET;
    public static final long MASK_BITS_BYTE_OFFSET;
    public static final long GROUP_INDEX_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_LONG.withName("categoryBits"),
            JAVA_LONG.withName("maskBits"),
            JAVA_INT.withName("groupIndex"),
            MemoryLayout.paddingLayout(4)
        ).withName("b3Filter").withByteAlignment(8);
        
        B3_DEFAULT_FILTER = downcallHandle("b3DefaultFilter", Filter.LAYOUT);
        
        CATEGORY_BITS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("categoryBits"));
        MASK_BITS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maskBits"));
        GROUP_INDEX_HANDLE = LAYOUT.varHandle(PathElement.groupElement("groupIndex"));
        
        CATEGORY_BITS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("categoryBits"));
        MASK_BITS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maskBits"));
        GROUP_INDEX_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("groupIndex"));
        //@formatter:on
    }

    public Filter() {
        this(Arena.ofAuto());
    }
    
    public Filter(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public Filter(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// ```
    /// Use this to initialize your filter
    /// @ingroup shape
    /// ```
    public static MemorySegment ndefaultFilter(
    	SegmentAllocator allocator
    ) {
    	MethodHandle method = B3_DEFAULT_FILTER.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ndefaultFilter].
    public static @Nullable Filter defaultFilter(
    	SegmentAllocator allocator
    ) {
    	MemorySegment segment = ndefaultFilter(
    		allocator
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new Filter(segment);
    }
    
    /// @see #categoryBits()
    public Filter categoryBits(long categoryBits) {
    	CATEGORY_BITS_HANDLE.set(segment, 0L, categoryBits);
    	return this;
    }
    
    /// ```
    /// The collision category bits. Normally you would just set one bit. The category bits should
    /// represent your application object types. For example:
    /// @code{.cpp}
    /// enum MyCategories
    /// {
    /// Static  = 0x00000001,
    /// Dynamic = 0x00000002,
    /// Debris  = 0x00000004,
    /// Player  = 0x00000008,
    /// // etc
    /// };
    /// @endcode
    /// ```
    public long categoryBits() {
    	return (long) CATEGORY_BITS_HANDLE.get(segment, 0L);
    }
    
    /// @see #maskBits()
    public Filter maskBits(long maskBits) {
    	MASK_BITS_HANDLE.set(segment, 0L, maskBits);
    	return this;
    }
    
    /// ```
    /// The collision mask bits. This states the categories that this
    /// shape would accept for collision.
    /// For example, you may want your player to only collide with static objects
    /// and other players.
    /// @code{.c}
    /// maskBits = Static | Player;
    /// @endcode
    /// ```
    public long maskBits() {
    	return (long) MASK_BITS_HANDLE.get(segment, 0L);
    }
    
    /// @see #groupIndex()
    public Filter groupIndex(int groupIndex) {
    	GROUP_INDEX_HANDLE.set(segment, 0L, groupIndex);
    	return this;
    }
    
    /// ```
    /// Collision groups allow a certain group of objects to never collide (negative)
    /// or always collide (positive). A group index of zero has no effect. Non-zero group filtering
    /// always wins against the mask bits.
    /// For example, you may want ragdolls to collide with other ragdolls but you don't want
    /// ragdoll self-collision. In this case you would give each ragdoll a unique negative group index
    /// and apply that group index to all shapes on the ragdoll.
    /// ```
    public int groupIndex() {
    	return (int) GROUP_INDEX_HANDLE.get(segment, 0L);
    }
    
    @Override
    public Filter set(Filter other) {
        return set(other.segment);
    }
    
    @Override
    public Filter set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<Filter> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<Filter> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new Filter(segment),
            count
        );
    }
    
    public static NativeStructArray<Filter> array(Arena arena, Filter... structs) {
        NativeStructArray<Filter> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new Filter(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<Filter> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new Filter(segment)
        );
    }
    
}