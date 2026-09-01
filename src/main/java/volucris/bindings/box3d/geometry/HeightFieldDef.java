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
import org.jspecify.annotations.Nullable;
import volucris.bindings.box3d.math.Vec3;
import volucris.bindings.core.NativeByteArray;
import volucris.bindings.core.NativeFloatArray;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

/// ```
/// Data used to create a height field
/// ```
public final class HeightFieldDef
		implements Struct<HeightFieldDef> {

    public static final StructLayout LAYOUT;

    public static final VarHandle HEIGHTS_HANDLE;
    public static final VarHandle MATERIAL_INDICES_HANDLE;
    public static final VarHandle COUNT_X_HANDLE;
    public static final VarHandle COUNT_Z_HANDLE;
    public static final VarHandle GLOBAL_MINIMUM_HEIGHT_HANDLE;
    public static final VarHandle GLOBAL_MAXIMUM_HEIGHT_HANDLE;
    public static final VarHandle CLOCKWISE_WINDING_HANDLE;

    public static final long HEIGHTS_BYTE_OFFSET;
    public static final long MATERIAL_INDICES_BYTE_OFFSET;
    public static final long SCALE_BYTE_OFFSET;
    public static final long COUNT_X_BYTE_OFFSET;
    public static final long COUNT_Z_BYTE_OFFSET;
    public static final long GLOBAL_MINIMUM_HEIGHT_BYTE_OFFSET;
    public static final long GLOBAL_MAXIMUM_HEIGHT_BYTE_OFFSET;
    public static final long CLOCKWISE_WINDING_BYTE_OFFSET;

    private final MemorySegment segment;

    private final Vec3 scale;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            UNBOUNDED_ADDRESS.withName("heights"),
            UNBOUNDED_ADDRESS.withName("materialIndices"),
            Vec3.LAYOUT.withName("scale"),
            JAVA_INT.withName("countX"),
            JAVA_INT.withName("countZ"),
            JAVA_FLOAT.withName("globalMinimumHeight"),
            JAVA_FLOAT.withName("globalMaximumHeight"),
            JAVA_BOOLEAN.withName("clockwiseWinding"),
            MemoryLayout.paddingLayout(3)
        ).withName("b3HeightFieldDef").withByteAlignment(8);
        
        HEIGHTS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("heights"));
        MATERIAL_INDICES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("materialIndices"));
        COUNT_X_HANDLE = LAYOUT.varHandle(PathElement.groupElement("countX"));
        COUNT_Z_HANDLE = LAYOUT.varHandle(PathElement.groupElement("countZ"));
        GLOBAL_MINIMUM_HEIGHT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("globalMinimumHeight"));
        GLOBAL_MAXIMUM_HEIGHT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("globalMaximumHeight"));
        CLOCKWISE_WINDING_HANDLE = LAYOUT.varHandle(PathElement.groupElement("clockwiseWinding"));
        
        HEIGHTS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("heights"));
        MATERIAL_INDICES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("materialIndices"));
        SCALE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("scale"));
        COUNT_X_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("countX"));
        COUNT_Z_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("countZ"));
        GLOBAL_MINIMUM_HEIGHT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("globalMinimumHeight"));
        GLOBAL_MAXIMUM_HEIGHT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("globalMaximumHeight"));
        CLOCKWISE_WINDING_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("clockwiseWinding"));
        //@formatter:on
    }

    public HeightFieldDef() {
        this(Arena.ofAuto());
    }
    
    public HeightFieldDef(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public HeightFieldDef(MemorySegment segment) {
        this.segment = segment;
    
        scale = new Vec3(segment.asSlice(SCALE_BYTE_OFFSET, Vec3.LAYOUT));
    }

    /// @see #heights()
    public HeightFieldDef heights(NativeFloatArray heights) {
    	HEIGHTS_HANDLE.set(segment, 0L, heights.memorySegment());
    	return this;
    }
    
    /// ```
    /// Grid point heights
    /// count = countX * countZ
    /// ```
    public @Nullable NativeFloatArray heights() {
    	MemorySegment segment = (MemorySegment) HEIGHTS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativeFloatArray(segment);
    }
    
    /// @see #materialIndices()
    public HeightFieldDef materialIndices(NativeByteArray materialIndices) {
    	MATERIAL_INDICES_HANDLE.set(segment, 0L, materialIndices.memorySegment());
    	return this;
    }
    
    /// ```
    /// Grid cell material
    /// A value of 0xFF is reserved for holes
    /// count = (countX - 1) * (countZ - 1)
    /// ```
    public @Nullable NativeByteArray materialIndices() {
    	MemorySegment segment = (MemorySegment) MATERIAL_INDICES_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativeByteArray(segment);
    }
    
    /// @see #countX()
    public HeightFieldDef countX(int countX) {
    	COUNT_X_HANDLE.set(segment, 0L, countX);
    	return this;
    }
    
    /// ```
    /// The number of grid lines along the x-axis.
    /// ```
    public int countX() {
    	return (int) COUNT_X_HANDLE.get(segment, 0L);
    }
    
    /// @see #countZ()
    public HeightFieldDef countZ(int countZ) {
    	COUNT_Z_HANDLE.set(segment, 0L, countZ);
    	return this;
    }
    
    /// ```
    /// The number of grid lines along the z-axis.
    /// ```
    public int countZ() {
    	return (int) COUNT_Z_HANDLE.get(segment, 0L);
    }
    
    /// @see #globalMinimumHeight()
    public HeightFieldDef globalMinimumHeight(float globalMinimumHeight) {
    	GLOBAL_MINIMUM_HEIGHT_HANDLE.set(segment, 0L, globalMinimumHeight);
    	return this;
    }
    
    /// ```
    /// Global minimum and maximum heights used for quantization. This is important
    /// if you want height fields to be placed next to each other and line up exactly.
    /// In that case, both height fields should use the same minimum and maximum heights.
    /// All height values are clamped to this range.
    /// These values are in unscaled space.
    /// ```
    public float globalMinimumHeight() {
    	return (float) GLOBAL_MINIMUM_HEIGHT_HANDLE.get(segment, 0L);
    }
    
    /// @see #globalMaximumHeight()
    public HeightFieldDef globalMaximumHeight(float globalMaximumHeight) {
    	GLOBAL_MAXIMUM_HEIGHT_HANDLE.set(segment, 0L, globalMaximumHeight);
    	return this;
    }
    
    /// ```
    /// The maximum.
    /// ```
    public float globalMaximumHeight() {
    	return (float) GLOBAL_MAXIMUM_HEIGHT_HANDLE.get(segment, 0L);
    }
    
    /// @see #clockwiseWinding()
    public HeightFieldDef clockwiseWinding(boolean clockwiseWinding) {
    	CLOCKWISE_WINDING_HANDLE.set(segment, 0L, clockwiseWinding);
    	return this;
    }
    
    /// ```
    /// Use clock-wise winding. This effectively inverts the height-field along the y-axis.
    /// ```
    public boolean clockwiseWinding() {
    	return (boolean) CLOCKWISE_WINDING_HANDLE.get(segment, 0L);
    }
    
    /// @see #scale()
    public HeightFieldDef scale(Consumer<Vec3> consumer) {
    	consumer.accept(scale);
    	return this;
    }
    
    /// @see #scale()
    public HeightFieldDef scale(Vec3 other) {
    	scale.set(other);
    	return this;
    }
    
    /// ```
    /// The height field scale. All components must be positive values.
    /// ```
    public Vec3 scale() {
    	return scale;
    }
    
    @Override
    public HeightFieldDef set(HeightFieldDef other) {
        return set(other.segment);
    }
    
    @Override
    public HeightFieldDef set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<HeightFieldDef> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<HeightFieldDef> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new HeightFieldDef(segment),
            count
        );
    }
    
    public static NativeStructArray<HeightFieldDef> array(Arena arena, HeightFieldDef... structs) {
        NativeStructArray<HeightFieldDef> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new HeightFieldDef(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<HeightFieldDef> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new HeightFieldDef(segment)
        );
    }
    
}