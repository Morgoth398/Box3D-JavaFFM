/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.box3d.geometry;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;
import java.util.function.Consumer;
import volucris.bindings.box3d.math.AABB;
import volucris.bindings.box3d.math.Vec3;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;

/// ```
/// A height field with compressed storage.
/// @note This data structure has data hanging off the end and cannot be directly copied.
/// ```
public final class HeightFieldData
		implements Struct<HeightFieldData> {

    public static final StructLayout LAYOUT;

    public static final VarHandle VERSION_HANDLE;
    public static final VarHandle BYTE_COUNT_HANDLE;
    public static final VarHandle HASH_HANDLE;
    public static final VarHandle MIN_HEIGHT_HANDLE;
    public static final VarHandle MAX_HEIGHT_HANDLE;
    public static final VarHandle HEIGHT_SCALE_HANDLE;
    public static final VarHandle COLUMN_COUNT_HANDLE;
    public static final VarHandle ROW_COUNT_HANDLE;
    public static final VarHandle HEIGHTS_OFFSET_HANDLE;
    public static final VarHandle MATERIAL_OFFSET_HANDLE;
    public static final VarHandle FLAGS_OFFSET_HANDLE;
    public static final VarHandle CLOCKWISE_HANDLE;
    public static final VarHandle PADDING_HANDLE;

    public static final long VERSION_BYTE_OFFSET;
    public static final long BYTE_COUNT_BYTE_OFFSET;
    public static final long HASH_BYTE_OFFSET;
    public static final long AABB_BYTE_OFFSET;
    public static final long MIN_HEIGHT_BYTE_OFFSET;
    public static final long MAX_HEIGHT_BYTE_OFFSET;
    public static final long HEIGHT_SCALE_BYTE_OFFSET;
    public static final long SCALE_BYTE_OFFSET;
    public static final long COLUMN_COUNT_BYTE_OFFSET;
    public static final long ROW_COUNT_BYTE_OFFSET;
    public static final long HEIGHTS_OFFSET_BYTE_OFFSET;
    public static final long MATERIAL_OFFSET_BYTE_OFFSET;
    public static final long FLAGS_OFFSET_BYTE_OFFSET;
    public static final long CLOCKWISE_BYTE_OFFSET;
    public static final long PADDING_BYTE_OFFSET;

    private final MemorySegment segment;

    private final AABB aabb;
    private final Vec3 scale;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_LONG.withName("version"),
            JAVA_INT.withName("byteCount"),
            JAVA_INT.withName("hash"),
            AABB.LAYOUT.withName("aabb"),
            JAVA_FLOAT.withName("minHeight"),
            JAVA_FLOAT.withName("maxHeight"),
            JAVA_FLOAT.withName("heightScale"),
            Vec3.LAYOUT.withName("scale"),
            JAVA_INT.withName("columnCount"),
            JAVA_INT.withName("rowCount"),
            JAVA_INT.withName("heightsOffset"),
            JAVA_INT.withName("materialOffset"),
            JAVA_INT.withName("flagsOffset"),
            JAVA_BOOLEAN.withName("clockwise"),
            MemoryLayout.sequenceLayout(3, JAVA_BYTE).withName("padding")
        ).withName("b3HeightFieldData").withByteAlignment(8);
        
        VERSION_HANDLE = LAYOUT.varHandle(PathElement.groupElement("version"));
        BYTE_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("byteCount"));
        HASH_HANDLE = LAYOUT.varHandle(PathElement.groupElement("hash"));
        MIN_HEIGHT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("minHeight"));
        MAX_HEIGHT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxHeight"));
        HEIGHT_SCALE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("heightScale"));
        COLUMN_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("columnCount"));
        ROW_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("rowCount"));
        HEIGHTS_OFFSET_HANDLE = LAYOUT.varHandle(PathElement.groupElement("heightsOffset"));
        MATERIAL_OFFSET_HANDLE = LAYOUT.varHandle(PathElement.groupElement("materialOffset"));
        FLAGS_OFFSET_HANDLE = LAYOUT.varHandle(PathElement.groupElement("flagsOffset"));
        CLOCKWISE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("clockwise"));
        PADDING_HANDLE = LAYOUT.varHandle(PathElement.groupElement("padding"), PathElement.sequenceElement());
        
        VERSION_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("version"));
        BYTE_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("byteCount"));
        HASH_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("hash"));
        AABB_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("aabb"));
        MIN_HEIGHT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("minHeight"));
        MAX_HEIGHT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxHeight"));
        HEIGHT_SCALE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("heightScale"));
        SCALE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("scale"));
        COLUMN_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("columnCount"));
        ROW_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("rowCount"));
        HEIGHTS_OFFSET_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("heightsOffset"));
        MATERIAL_OFFSET_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("materialOffset"));
        FLAGS_OFFSET_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("flagsOffset"));
        CLOCKWISE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("clockwise"));
        PADDING_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("padding"));
        //@formatter:on
    }

    public HeightFieldData() {
        this(Arena.ofAuto());
    }
    
    public HeightFieldData(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public HeightFieldData(MemorySegment segment) {
        this.segment = segment;
    
        aabb = new AABB(segment.asSlice(AABB_BYTE_OFFSET, AABB.LAYOUT));
        scale = new Vec3(segment.asSlice(SCALE_BYTE_OFFSET, Vec3.LAYOUT));
    }

    /// @see #version()
    public HeightFieldData version(long version) {
    	VERSION_HANDLE.set(segment, 0L, version);
    	return this;
    }
    
    /// ```
    /// Version must be first and match B3_HEIGHT_FIELD_VERSION
    /// ```
    public long version() {
    	return (long) VERSION_HANDLE.get(segment, 0L);
    }
    
    /// @see #byteCount()
    public HeightFieldData byteCount(int byteCount) {
    	BYTE_COUNT_HANDLE.set(segment, 0L, byteCount);
    	return this;
    }
    
    /// ```
    /// The total number of bytes for this height field.
    /// ```
    public int byteCount() {
    	return (int) BYTE_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #hash()
    public HeightFieldData hash(int hash) {
    	HASH_HANDLE.set(segment, 0L, hash);
    	return this;
    }
    
    /// ```
    /// Hash of this height field (this field is zero when the hash is computed).
    /// ```
    public int hash() {
    	return (int) HASH_HANDLE.get(segment, 0L);
    }
    
    /// @see #minHeight()
    public HeightFieldData minHeight(float minHeight) {
    	MIN_HEIGHT_HANDLE.set(segment, 0L, minHeight);
    	return this;
    }
    
    /// ```
    /// The minimum y value.
    /// ```
    public float minHeight() {
    	return (float) MIN_HEIGHT_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxHeight()
    public HeightFieldData maxHeight(float maxHeight) {
    	MAX_HEIGHT_HANDLE.set(segment, 0L, maxHeight);
    	return this;
    }
    
    /// ```
    /// The maximum y value
    /// ```
    public float maxHeight() {
    	return (float) MAX_HEIGHT_HANDLE.get(segment, 0L);
    }
    
    /// @see #heightScale()
    public HeightFieldData heightScale(float heightScale) {
    	HEIGHT_SCALE_HANDLE.set(segment, 0L, heightScale);
    	return this;
    }
    
    /// ```
    /// The quantization scale.
    /// ```
    public float heightScale() {
    	return (float) HEIGHT_SCALE_HANDLE.get(segment, 0L);
    }
    
    /// @see #columnCount()
    public HeightFieldData columnCount(int columnCount) {
    	COLUMN_COUNT_HANDLE.set(segment, 0L, columnCount);
    	return this;
    }
    
    /// ```
    /// The number of grid columns along the local x-axis.
    /// ```
    public int columnCount() {
    	return (int) COLUMN_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #rowCount()
    public HeightFieldData rowCount(int rowCount) {
    	ROW_COUNT_HANDLE.set(segment, 0L, rowCount);
    	return this;
    }
    
    /// ```
    /// The number of grid rows along the local z-axis.
    /// ```
    public int rowCount() {
    	return (int) ROW_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #heightsOffset()
    public HeightFieldData heightsOffset(int heightsOffset) {
    	HEIGHTS_OFFSET_HANDLE.set(segment, 0L, heightsOffset);
    	return this;
    }
    
    /// ```
    /// Offset of the compressed height array in bytes from the struct address.
    /// uint16_t, one per grid point.
    /// ```
    public int heightsOffset() {
    	return (int) HEIGHTS_OFFSET_HANDLE.get(segment, 0L);
    }
    
    /// @see #materialOffset()
    public HeightFieldData materialOffset(int materialOffset) {
    	MATERIAL_OFFSET_HANDLE.set(segment, 0L, materialOffset);
    	return this;
    }
    
    /// ```
    /// Offset of the material index array in bytes from the struct address.
    /// uint8_t, one per cell.
    /// ```
    public int materialOffset() {
    	return (int) MATERIAL_OFFSET_HANDLE.get(segment, 0L);
    }
    
    /// @see #flagsOffset()
    public HeightFieldData flagsOffset(int flagsOffset) {
    	FLAGS_OFFSET_HANDLE.set(segment, 0L, flagsOffset);
    	return this;
    }
    
    /// ```
    /// Offset of the flag array in bytes from the struct address.
    /// uint8_t, one per triangle.
    /// ```
    public int flagsOffset() {
    	return (int) FLAGS_OFFSET_HANDLE.get(segment, 0L);
    }
    
    /// @see #clockwise()
    public HeightFieldData clockwise(boolean clockwise) {
    	CLOCKWISE_HANDLE.set(segment, 0L, clockwise);
    	return this;
    }
    
    /// ```
    /// Triangle winding.
    /// ```
    public boolean clockwise() {
    	return (boolean) CLOCKWISE_HANDLE.get(segment, 0L);
    }
    
    /// @see #padding(int)
    public HeightFieldData padding(byte padding, int index0) {
    	PADDING_HANDLE.set(segment, 0L, index0, padding);
    	return this;
    }
    
    /// ```
    /// Explicit padding. Identity is a content hash over raw bytes, so there must
    /// be no unnamed padding for struct copies to scramble.
    /// ```
    public byte padding(int index0) {
    	return (byte) PADDING_HANDLE.get(segment, 0L, index0);
    }
    
    /// @see #aabb()
    public HeightFieldData aabb(Consumer<AABB> consumer) {
    	consumer.accept(aabb);
    	return this;
    }
    
    /// @see #aabb()
    public HeightFieldData aabb(AABB other) {
    	aabb.set(other);
    	return this;
    }
    
    /// ```
    /// The local axis-aligned bounding box.
    /// ```
    public AABB aabb() {
    	return aabb;
    }
    
    /// @see #scale()
    public HeightFieldData scale(Consumer<Vec3> consumer) {
    	consumer.accept(scale);
    	return this;
    }
    
    /// @see #scale()
    public HeightFieldData scale(Vec3 other) {
    	scale.set(other);
    	return this;
    }
    
    /// ```
    /// The overall scale.
    /// ```
    public Vec3 scale() {
    	return scale;
    }
    
    @Override
    public HeightFieldData set(HeightFieldData other) {
        return set(other.segment);
    }
    
    @Override
    public HeightFieldData set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<HeightFieldData> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<HeightFieldData> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new HeightFieldData(segment),
            count
        );
    }
    
    public static NativeStructArray<HeightFieldData> array(Arena arena, HeightFieldData... structs) {
        NativeStructArray<HeightFieldData> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new HeightFieldData(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<HeightFieldData> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new HeightFieldData(segment)
        );
    }
    
}