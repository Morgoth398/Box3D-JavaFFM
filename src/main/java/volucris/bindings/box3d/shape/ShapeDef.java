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
import java.util.function.Consumer;
import org.jspecify.annotations.Nullable;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

/// ```
/// Used to create a shape
/// @ingroup shape
/// ```
public final class ShapeDef
		implements Struct<ShapeDef> {

    private static final LazyConstant<MethodHandle> B3_DEFAULT_SHAPE_DEF;

    public static final StructLayout LAYOUT;

    public static final VarHandle USER_DATA_HANDLE;
    public static final VarHandle MATERIALS_HANDLE;
    public static final VarHandle MATERIAL_COUNT_HANDLE;
    public static final VarHandle DENSITY_HANDLE;
    public static final VarHandle EXPLOSION_SCALE_HANDLE;
    public static final VarHandle ENABLE_CUSTOM_FILTERING_HANDLE;
    public static final VarHandle IS_SENSOR_HANDLE;
    public static final VarHandle ENABLE_SENSOR_EVENTS_HANDLE;
    public static final VarHandle ENABLE_CONTACT_EVENTS_HANDLE;
    public static final VarHandle ENABLE_HIT_EVENTS_HANDLE;
    public static final VarHandle ENABLE_PRE_SOLVE_EVENTS_HANDLE;
    public static final VarHandle INVOKE_CONTACT_CREATION_HANDLE;
    public static final VarHandle UPDATE_BODY_MASS_HANDLE;
    public static final VarHandle INTERNAL_VALUE_HANDLE;

    public static final long USER_DATA_BYTE_OFFSET;
    public static final long MATERIALS_BYTE_OFFSET;
    public static final long MATERIAL_COUNT_BYTE_OFFSET;
    public static final long BASE_MATERIAL_BYTE_OFFSET;
    public static final long DENSITY_BYTE_OFFSET;
    public static final long EXPLOSION_SCALE_BYTE_OFFSET;
    public static final long FILTER_BYTE_OFFSET;
    public static final long ENABLE_CUSTOM_FILTERING_BYTE_OFFSET;
    public static final long IS_SENSOR_BYTE_OFFSET;
    public static final long ENABLE_SENSOR_EVENTS_BYTE_OFFSET;
    public static final long ENABLE_CONTACT_EVENTS_BYTE_OFFSET;
    public static final long ENABLE_HIT_EVENTS_BYTE_OFFSET;
    public static final long ENABLE_PRE_SOLVE_EVENTS_BYTE_OFFSET;
    public static final long INVOKE_CONTACT_CREATION_BYTE_OFFSET;
    public static final long UPDATE_BODY_MASS_BYTE_OFFSET;
    public static final long INTERNAL_VALUE_BYTE_OFFSET;

    private final MemorySegment segment;

    private final SurfaceMaterial baseMaterial;
    private final Filter filter;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            UNBOUNDED_ADDRESS.withName("userData"),
            UNBOUNDED_ADDRESS.withName("materials"),
            JAVA_INT.withName("materialCount"),
            MemoryLayout.paddingLayout(4),
            SurfaceMaterial.LAYOUT.withName("baseMaterial"),
            JAVA_FLOAT.withName("density"),
            JAVA_FLOAT.withName("explosionScale"),
            Filter.LAYOUT.withName("filter"),
            JAVA_BOOLEAN.withName("enableCustomFiltering"),
            JAVA_BOOLEAN.withName("isSensor"),
            JAVA_BOOLEAN.withName("enableSensorEvents"),
            JAVA_BOOLEAN.withName("enableContactEvents"),
            JAVA_BOOLEAN.withName("enableHitEvents"),
            JAVA_BOOLEAN.withName("enablePreSolveEvents"),
            JAVA_BOOLEAN.withName("invokeContactCreation"),
            JAVA_BOOLEAN.withName("updateBodyMass"),
            JAVA_INT.withName("internalValue"),
            MemoryLayout.paddingLayout(4)
        ).withName("b3ShapeDef").withByteAlignment(8);
        
        B3_DEFAULT_SHAPE_DEF = downcallHandle("b3DefaultShapeDef", ShapeDef.LAYOUT);
        
        USER_DATA_HANDLE = LAYOUT.varHandle(PathElement.groupElement("userData"));
        MATERIALS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("materials"));
        MATERIAL_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("materialCount"));
        DENSITY_HANDLE = LAYOUT.varHandle(PathElement.groupElement("density"));
        EXPLOSION_SCALE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("explosionScale"));
        ENABLE_CUSTOM_FILTERING_HANDLE = LAYOUT.varHandle(PathElement.groupElement("enableCustomFiltering"));
        IS_SENSOR_HANDLE = LAYOUT.varHandle(PathElement.groupElement("isSensor"));
        ENABLE_SENSOR_EVENTS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("enableSensorEvents"));
        ENABLE_CONTACT_EVENTS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("enableContactEvents"));
        ENABLE_HIT_EVENTS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("enableHitEvents"));
        ENABLE_PRE_SOLVE_EVENTS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("enablePreSolveEvents"));
        INVOKE_CONTACT_CREATION_HANDLE = LAYOUT.varHandle(PathElement.groupElement("invokeContactCreation"));
        UPDATE_BODY_MASS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("updateBodyMass"));
        INTERNAL_VALUE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("internalValue"));
        
        USER_DATA_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("userData"));
        MATERIALS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("materials"));
        MATERIAL_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("materialCount"));
        BASE_MATERIAL_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("baseMaterial"));
        DENSITY_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("density"));
        EXPLOSION_SCALE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("explosionScale"));
        FILTER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("filter"));
        ENABLE_CUSTOM_FILTERING_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("enableCustomFiltering"));
        IS_SENSOR_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("isSensor"));
        ENABLE_SENSOR_EVENTS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("enableSensorEvents"));
        ENABLE_CONTACT_EVENTS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("enableContactEvents"));
        ENABLE_HIT_EVENTS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("enableHitEvents"));
        ENABLE_PRE_SOLVE_EVENTS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("enablePreSolveEvents"));
        INVOKE_CONTACT_CREATION_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("invokeContactCreation"));
        UPDATE_BODY_MASS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("updateBodyMass"));
        INTERNAL_VALUE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("internalValue"));
        //@formatter:on
    }

    public ShapeDef() {
        this(Arena.ofAuto());
    }
    
    public ShapeDef(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public ShapeDef(MemorySegment segment) {
        this.segment = segment;
    
        baseMaterial = new SurfaceMaterial(segment.asSlice(BASE_MATERIAL_BYTE_OFFSET, SurfaceMaterial.LAYOUT));
        filter = new Filter(segment.asSlice(FILTER_BYTE_OFFSET, Filter.LAYOUT));
    }

    /// ```
    /// Use this to initialize your shape definition
    /// @ingroup shape
    /// ```
    public static MemorySegment ndefaultShapeDef(
    	SegmentAllocator allocator
    ) {
    	MethodHandle method = B3_DEFAULT_SHAPE_DEF.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ndefaultShapeDef].
    public static @Nullable ShapeDef defaultShapeDef(
    	SegmentAllocator allocator
    ) {
    	MemorySegment segment = ndefaultShapeDef(
    		allocator
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new ShapeDef(segment);
    }
    
    /// @see #userData()
    public ShapeDef userData(MemorySegment userData) {
    	USER_DATA_HANDLE.set(segment, 0L, userData);
    	return this;
    }
    
    /// ```
    /// Use this to store application specific shape data.
    /// ```
    public @Nullable MemorySegment userData() {
    	MemorySegment segment = (MemorySegment) USER_DATA_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #materials()
    public ShapeDef materials(SurfaceMaterial materials) {
    	MATERIALS_HANDLE.set(segment, 0L, materials.memorySegment());
    	return this;
    }
    
    /// ```
    /// Surface material used on mesh shapes per triangle. Ignored for convex shapes. Ignored for compound shapes.
    /// ```
    public @Nullable SurfaceMaterial materials() {
    	MemorySegment segment = (MemorySegment) MATERIALS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new SurfaceMaterial(segment);
    }
    
    /// @see #materialCount()
    public ShapeDef materialCount(int materialCount) {
    	MATERIAL_COUNT_HANDLE.set(segment, 0L, materialCount);
    	return this;
    }
    
    /// ```
    /// Surface material count.
    /// ```
    public int materialCount() {
    	return (int) MATERIAL_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #density()
    public ShapeDef density(float density) {
    	DENSITY_HANDLE.set(segment, 0L, density);
    	return this;
    }
    
    /// ```
    /// The density, usually in kg/m^3.
    /// ```
    public float density() {
    	return (float) DENSITY_HANDLE.get(segment, 0L);
    }
    
    /// @see #explosionScale()
    public ShapeDef explosionScale(float explosionScale) {
    	EXPLOSION_SCALE_HANDLE.set(segment, 0L, explosionScale);
    	return this;
    }
    
    /// ```
    /// Explosion scale for b3World_Explode. non-dimensional
    /// ```
    public float explosionScale() {
    	return (float) EXPLOSION_SCALE_HANDLE.get(segment, 0L);
    }
    
    /// @see #enableCustomFiltering()
    public ShapeDef enableCustomFiltering(boolean enableCustomFiltering) {
    	ENABLE_CUSTOM_FILTERING_HANDLE.set(segment, 0L, enableCustomFiltering);
    	return this;
    }
    
    /// ```
    /// Enable custom filtering. Only one of the two shapes needs to enable custom filtering. See b3WorldDef.
    /// ```
    public boolean enableCustomFiltering() {
    	return (boolean) ENABLE_CUSTOM_FILTERING_HANDLE.get(segment, 0L);
    }
    
    /// @see #isSensor()
    public ShapeDef isSensor(boolean isSensor) {
    	IS_SENSOR_HANDLE.set(segment, 0L, isSensor);
    	return this;
    }
    
    /// ```
    /// A sensor shape generates overlap events but never generates a collision response.
    /// Sensors do not have continuous collision. Instead, use a ray or shape cast for those scenarios.
    /// Sensors still contribute to the body mass if they have non-zero density.
    /// @note Sensor events are disabled by default.
    /// @see enableSensorEvents
    /// ```
    public boolean isSensor() {
    	return (boolean) IS_SENSOR_HANDLE.get(segment, 0L);
    }
    
    /// @see #enableSensorEvents()
    public ShapeDef enableSensorEvents(boolean enableSensorEvents) {
    	ENABLE_SENSOR_EVENTS_HANDLE.set(segment, 0L, enableSensorEvents);
    	return this;
    }
    
    /// ```
    /// Enable sensor events for this shape. This applies to sensors and non-sensors. False by default, even for sensors.
    /// ```
    public boolean enableSensorEvents() {
    	return (boolean) ENABLE_SENSOR_EVENTS_HANDLE.get(segment, 0L);
    }
    
    /// @see #enableContactEvents()
    public ShapeDef enableContactEvents(boolean enableContactEvents) {
    	ENABLE_CONTACT_EVENTS_HANDLE.set(segment, 0L, enableContactEvents);
    	return this;
    }
    
    /// ```
    /// Enable contact events for this shape. Only applies to kinematic and dynamic bodies. Ignored for sensors. False by default.
    /// ```
    public boolean enableContactEvents() {
    	return (boolean) ENABLE_CONTACT_EVENTS_HANDLE.get(segment, 0L);
    }
    
    /// @see #enableHitEvents()
    public ShapeDef enableHitEvents(boolean enableHitEvents) {
    	ENABLE_HIT_EVENTS_HANDLE.set(segment, 0L, enableHitEvents);
    	return this;
    }
    
    /// ```
    /// Enable hit events for this shape. Only applies to kinematic and dynamic bodies. Ignored for sensors. False by default.
    /// ```
    public boolean enableHitEvents() {
    	return (boolean) ENABLE_HIT_EVENTS_HANDLE.get(segment, 0L);
    }
    
    /// @see #enablePreSolveEvents()
    public ShapeDef enablePreSolveEvents(boolean enablePreSolveEvents) {
    	ENABLE_PRE_SOLVE_EVENTS_HANDLE.set(segment, 0L, enablePreSolveEvents);
    	return this;
    }
    
    /// ```
    /// Enable pre-solve contact events for this shape. Only applies to dynamic bodies. These are expensive
    /// and must be carefully handled due to multithreading. Ignored for sensors.
    /// ```
    public boolean enablePreSolveEvents() {
    	return (boolean) ENABLE_PRE_SOLVE_EVENTS_HANDLE.get(segment, 0L);
    }
    
    /// @see #invokeContactCreation()
    public ShapeDef invokeContactCreation(boolean invokeContactCreation) {
    	INVOKE_CONTACT_CREATION_HANDLE.set(segment, 0L, invokeContactCreation);
    	return this;
    }
    
    /// ```
    /// When shapes are created they will scan the environment for collision the next time step. This can significantly slow down
    /// static body creation when there are many static shapes.
    /// This is flag is ignored for dynamic and kinematic shapes which always invoke contact creation.
    /// ```
    public boolean invokeContactCreation() {
    	return (boolean) INVOKE_CONTACT_CREATION_HANDLE.get(segment, 0L);
    }
    
    /// @see #updateBodyMass()
    public ShapeDef updateBodyMass(boolean updateBodyMass) {
    	UPDATE_BODY_MASS_HANDLE.set(segment, 0L, updateBodyMass);
    	return this;
    }
    
    /// ```
    /// Should the body update the mass properties when this shape is created. Default is true.
    /// ```
    public boolean updateBodyMass() {
    	return (boolean) UPDATE_BODY_MASS_HANDLE.get(segment, 0L);
    }
    
    /// @see #internalValue()
    public ShapeDef internalValue(int internalValue) {
    	INTERNAL_VALUE_HANDLE.set(segment, 0L, internalValue);
    	return this;
    }
    
    /// ```
    /// Used internally to detect a valid definition. DO NOT SET.
    /// ```
    public int internalValue() {
    	return (int) INTERNAL_VALUE_HANDLE.get(segment, 0L);
    }
    
    /// @see #baseMaterial()
    public ShapeDef baseMaterial(Consumer<SurfaceMaterial> consumer) {
    	consumer.accept(baseMaterial);
    	return this;
    }
    
    /// @see #baseMaterial()
    public ShapeDef baseMaterial(SurfaceMaterial other) {
    	baseMaterial.set(other);
    	return this;
    }
    
    /// ```
    /// The base surface material. Ignored for compound shapes.
    /// ```
    public SurfaceMaterial baseMaterial() {
    	return baseMaterial;
    }
    
    /// @see #filter()
    public ShapeDef filter(Consumer<Filter> consumer) {
    	consumer.accept(filter);
    	return this;
    }
    
    /// @see #filter()
    public ShapeDef filter(Filter other) {
    	filter.set(other);
    	return this;
    }
    
    /// ```
    /// Contact filtering data.
    /// ```
    public Filter filter() {
    	return filter;
    }
    
    @Override
    public ShapeDef set(ShapeDef other) {
        return set(other.segment);
    }
    
    @Override
    public ShapeDef set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<ShapeDef> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<ShapeDef> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new ShapeDef(segment),
            count
        );
    }
    
    public static NativeStructArray<ShapeDef> array(Arena arena, ShapeDef... structs) {
        NativeStructArray<ShapeDef> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new ShapeDef(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<ShapeDef> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new ShapeDef(segment)
        );
    }
    
}