/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.box3d.recording;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;
import java.util.function.Consumer;
import org.jspecify.annotations.Nullable;
import volucris.bindings.box3d.math.AABB;
import volucris.bindings.box3d.math.Vec3;
import volucris.bindings.box3d.query.QueryFilter;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

/// ```
/// A spatial query recorded during a replayed frame, exposed for inspection.
/// ```
public final class RecQueryInfo
		implements Struct<RecQueryInfo> {

    public static final StructLayout LAYOUT;

    public static final VarHandle TYPE_HANDLE;
    public static final VarHandle HIT_COUNT_HANDLE;
    public static final VarHandle KEY_HANDLE;
    public static final VarHandle ID_HANDLE;
    public static final VarHandle NAME_HANDLE;

    public static final long TYPE_BYTE_OFFSET;
    public static final long FILTER_BYTE_OFFSET;
    public static final long AABB_BYTE_OFFSET;
    public static final long ORIGIN_BYTE_OFFSET;
    public static final long TRANSLATION_BYTE_OFFSET;
    public static final long HIT_COUNT_BYTE_OFFSET;
    public static final long KEY_BYTE_OFFSET;
    public static final long ID_BYTE_OFFSET;
    public static final long NAME_BYTE_OFFSET;

    private final MemorySegment segment;

    private final QueryFilter filter;
    private final AABB aabb;
    private final Vec3 origin;
    private final Vec3 translation;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("type"),
            MemoryLayout.paddingLayout(4),
            QueryFilter.LAYOUT.withName("filter"),
            AABB.LAYOUT.withName("aabb"),
            Vec3.LAYOUT.withName("origin"),
            Vec3.LAYOUT.withName("translation"),
            JAVA_INT.withName("hitCount"),
            MemoryLayout.paddingLayout(4),
            JAVA_LONG.withName("key"),
            JAVA_LONG.withName("id"),
            UNBOUNDED_ADDRESS.withName("name")
        ).withName("b3RecQueryInfo").withByteAlignment(8);
        
        TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("type"));
        HIT_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("hitCount"));
        KEY_HANDLE = LAYOUT.varHandle(PathElement.groupElement("key"));
        ID_HANDLE = LAYOUT.varHandle(PathElement.groupElement("id"));
        NAME_HANDLE = LAYOUT.varHandle(PathElement.groupElement("name"));
        
        TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("type"));
        FILTER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("filter"));
        AABB_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("aabb"));
        ORIGIN_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("origin"));
        TRANSLATION_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("translation"));
        HIT_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("hitCount"));
        KEY_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("key"));
        ID_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("id"));
        NAME_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("name"));
        //@formatter:on
    }

    public RecQueryInfo() {
        this(Arena.ofAuto());
    }
    
    public RecQueryInfo(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public RecQueryInfo(MemorySegment segment) {
        this.segment = segment;
    
        filter = new QueryFilter(segment.asSlice(FILTER_BYTE_OFFSET, QueryFilter.LAYOUT));
        aabb = new AABB(segment.asSlice(AABB_BYTE_OFFSET, AABB.LAYOUT));
        origin = new Vec3(segment.asSlice(ORIGIN_BYTE_OFFSET, Vec3.LAYOUT));
        translation = new Vec3(segment.asSlice(TRANSLATION_BYTE_OFFSET, Vec3.LAYOUT));
    }

    /// @see #type()
    public RecQueryInfo type(int type) {
    	TYPE_HANDLE.set(segment, 0L, type);
    	return this;
    }
    
    public int type() {
    	return (int) TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #hitCount()
    public RecQueryInfo hitCount(int hitCount) {
    	HIT_COUNT_HANDLE.set(segment, 0L, hitCount);
    	return this;
    }
    
    public int hitCount() {
    	return (int) HIT_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #key()
    public RecQueryInfo key(long key) {
    	KEY_HANDLE.set(segment, 0L, key);
    	return this;
    }
    
    public long key() {
    	return (long) KEY_HANDLE.get(segment, 0L);
    }
    
    /// @see #id()
    public RecQueryInfo id(long id) {
    	ID_HANDLE.set(segment, 0L, id);
    	return this;
    }
    
    public long id() {
    	return (long) ID_HANDLE.get(segment, 0L);
    }
    
    /// @see #name()
    public RecQueryInfo name(Arena arena, String name) {
    	NAME_HANDLE.set(segment, 0L, arena.allocateFrom(name));
    	return this;
    }
    
    public @Nullable String name() {
    	MemorySegment segment = (MemorySegment) NAME_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment.getString(0);
    }
    
    /// @see #filter()
    public RecQueryInfo filter(Consumer<QueryFilter> consumer) {
    	consumer.accept(filter);
    	return this;
    }
    
    /// @see #filter()
    public RecQueryInfo filter(QueryFilter other) {
    	filter.set(other);
    	return this;
    }
    
    public QueryFilter filter() {
    	return filter;
    }
    
    /// @see #aabb()
    public RecQueryInfo aabb(Consumer<AABB> consumer) {
    	consumer.accept(aabb);
    	return this;
    }
    
    /// @see #aabb()
    public RecQueryInfo aabb(AABB other) {
    	aabb.set(other);
    	return this;
    }
    
    public AABB aabb() {
    	return aabb;
    }
    
    /// @see #origin()
    public RecQueryInfo origin(Consumer<Vec3> consumer) {
    	consumer.accept(origin);
    	return this;
    }
    
    /// @see #origin()
    public RecQueryInfo origin(Vec3 other) {
    	origin.set(other);
    	return this;
    }
    
    public Vec3 origin() {
    	return origin;
    }
    
    /// @see #translation()
    public RecQueryInfo translation(Consumer<Vec3> consumer) {
    	consumer.accept(translation);
    	return this;
    }
    
    /// @see #translation()
    public RecQueryInfo translation(Vec3 other) {
    	translation.set(other);
    	return this;
    }
    
    public Vec3 translation() {
    	return translation;
    }
    
    @Override
    public RecQueryInfo set(RecQueryInfo other) {
        return set(other.segment);
    }
    
    @Override
    public RecQueryInfo set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<RecQueryInfo> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<RecQueryInfo> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new RecQueryInfo(segment),
            count
        );
    }
    
    public static NativeStructArray<RecQueryInfo> array(Arena arena, RecQueryInfo... structs) {
        NativeStructArray<RecQueryInfo> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new RecQueryInfo(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<RecQueryInfo> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new RecQueryInfo(segment)
        );
    }
    
}