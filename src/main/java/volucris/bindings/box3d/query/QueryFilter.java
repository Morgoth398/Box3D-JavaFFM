/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.box3d.query;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.StructLayout;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import org.jspecify.annotations.Nullable;
import volucris.bindings.core.NativeByteArray;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

/// ```
/// The query filter is used to filter collisions between queries and shapes. For example,
/// you may want a ray-cast representing a projectile to hit players and the static environment
/// but not debris.
/// ```
public final class QueryFilter
		implements Struct<QueryFilter> {

    private static final LazyConstant<MethodHandle> B3_DEFAULT_QUERY_FILTER;

    public static final StructLayout LAYOUT;

    public static final VarHandle CATEGORY_BITS_HANDLE;
    public static final VarHandle MASK_BITS_HANDLE;
    public static final VarHandle ID_HANDLE;
    public static final VarHandle NAME_HANDLE;

    public static final long CATEGORY_BITS_BYTE_OFFSET;
    public static final long MASK_BITS_BYTE_OFFSET;
    public static final long ID_BYTE_OFFSET;
    public static final long NAME_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_LONG.withName("categoryBits"),
            JAVA_LONG.withName("maskBits"),
            JAVA_LONG.withName("id"),
            UNBOUNDED_ADDRESS.withName("name")
        ).withName("b3QueryFilter").withByteAlignment(8);
        
        B3_DEFAULT_QUERY_FILTER = downcallHandle("b3DefaultQueryFilter", QueryFilter.LAYOUT);
        
        CATEGORY_BITS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("categoryBits"));
        MASK_BITS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maskBits"));
        ID_HANDLE = LAYOUT.varHandle(PathElement.groupElement("id"));
        NAME_HANDLE = LAYOUT.varHandle(PathElement.groupElement("name"));
        
        CATEGORY_BITS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("categoryBits"));
        MASK_BITS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maskBits"));
        ID_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("id"));
        NAME_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("name"));
        //@formatter:on
    }

    public QueryFilter() {
        this(Arena.ofAuto());
    }
    
    public QueryFilter(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public QueryFilter(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// ```
    /// Use this to initialize your query filter
    /// ```
    public static MemorySegment ndefaultQueryFilter(
    	SegmentAllocator allocator
    ) {
    	MethodHandle method = B3_DEFAULT_QUERY_FILTER.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ndefaultQueryFilter].
    public final @Nullable QueryFilter defaultQueryFilter(
    	SegmentAllocator allocator
    ) {
    	MemorySegment segment = ndefaultQueryFilter(
    		allocator
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new QueryFilter(segment);
    }
    
    /// @see #categoryBits()
    public QueryFilter categoryBits(long categoryBits) {
    	CATEGORY_BITS_HANDLE.set(segment, 0L, categoryBits);
    	return this;
    }
    
    /// ```
    /// The collision category bits of this query. Normally you would just set one bit.
    /// ```
    public long categoryBits() {
    	return (long) CATEGORY_BITS_HANDLE.get(segment, 0L);
    }
    
    /// @see #maskBits()
    public QueryFilter maskBits(long maskBits) {
    	MASK_BITS_HANDLE.set(segment, 0L, maskBits);
    	return this;
    }
    
    /// ```
    /// The collision mask bits. This states the shape categories that this
    /// query would accept for collision.
    /// ```
    public long maskBits() {
    	return (long) MASK_BITS_HANDLE.get(segment, 0L);
    }
    
    /// @see #id()
    public QueryFilter id(long id) {
    	ID_HANDLE.set(segment, 0L, id);
    	return this;
    }
    
    /// ```
    /// Optional id combined with @ref name to identify this query in a recording, e.g. an entity id.
    /// Need not be unique on its own. 0 with a null name means untagged. Ignored when not recording.
    /// ```
    public long id() {
    	return (long) ID_HANDLE.get(segment, 0L);
    }
    
    /// @see #name()
    public QueryFilter name(NativeByteArray name) {
    	NAME_HANDLE.set(segment, 0L, name.memorySegment());
    	return this;
    }
    
    /// ```
    /// Optional label combined with @ref id to identify this query, e.g. "bullet". Need not be unique
    /// on its own. The recorder hashes (id, name) into one stable key the viewer tracks the query by,
    /// so the same id and name pair identifies the same query across frames. NULL means none. Ignored
    /// when not recording.
    /// ```
    public @Nullable NativeByteArray name() {
    	MemorySegment segment = (MemorySegment) NAME_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativeByteArray(segment);
    }
    
    @Override
    public QueryFilter set(QueryFilter other) {
        return set(other.segment);
    }
    
    @Override
    public QueryFilter set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<QueryFilter> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<QueryFilter> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new QueryFilter(segment),
            count
        );
    }
    
    public static NativeStructArray<QueryFilter> array(Arena arena, QueryFilter... structs) {
        NativeStructArray<QueryFilter> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new QueryFilter(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<QueryFilter> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new QueryFilter(segment)
        );
    }
    
}