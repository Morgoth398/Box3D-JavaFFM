/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.box3d.events;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.util.function.Consumer;
import volucris.bindings.box3d.shape.ShapeId;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;

/// ```
/// An end touch event is generated when a shape stops overlapping a sensor shape.
/// These include things like setting the transform, destroying a body or shape, or changing
/// a filter. You will also get an end event if the sensor or visitor are destroyed.
/// Therefore you should always confirm the shape id is valid using b3Shape_IsValid.
/// ```
public final class SensorEndTouchEvent
		implements Struct<SensorEndTouchEvent> {

    public static final StructLayout LAYOUT;

    public static final long SENSOR_SHAPE_ID_BYTE_OFFSET;
    public static final long VISITOR_SHAPE_ID_BYTE_OFFSET;

    private final MemorySegment segment;

    private final ShapeId sensorShapeId;
    private final ShapeId visitorShapeId;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            ShapeId.LAYOUT.withName("sensorShapeId"),
            ShapeId.LAYOUT.withName("visitorShapeId")
        ).withName("b3SensorEndTouchEvent").withByteAlignment(4);
        
        SENSOR_SHAPE_ID_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sensorShapeId"));
        VISITOR_SHAPE_ID_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("visitorShapeId"));
        //@formatter:on
    }

    public SensorEndTouchEvent() {
        this(Arena.ofAuto());
    }
    
    public SensorEndTouchEvent(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public SensorEndTouchEvent(MemorySegment segment) {
        this.segment = segment;
    
        sensorShapeId = new ShapeId(segment.asSlice(SENSOR_SHAPE_ID_BYTE_OFFSET, ShapeId.LAYOUT));
        visitorShapeId = new ShapeId(segment.asSlice(VISITOR_SHAPE_ID_BYTE_OFFSET, ShapeId.LAYOUT));
    }

    /// @see #sensorShapeId()
    public SensorEndTouchEvent sensorShapeId(Consumer<ShapeId> consumer) {
    	consumer.accept(sensorShapeId);
    	return this;
    }
    
    /// @see #sensorShapeId()
    public SensorEndTouchEvent sensorShapeId(ShapeId other) {
    	sensorShapeId.set(other);
    	return this;
    }
    
    /// ```
    /// The id of the sensor shape
    /// @warning this shape may have been destroyed
    /// @see b3Shape_IsValid
    /// ```
    public ShapeId sensorShapeId() {
    	return sensorShapeId;
    }
    
    /// @see #visitorShapeId()
    public SensorEndTouchEvent visitorShapeId(Consumer<ShapeId> consumer) {
    	consumer.accept(visitorShapeId);
    	return this;
    }
    
    /// @see #visitorShapeId()
    public SensorEndTouchEvent visitorShapeId(ShapeId other) {
    	visitorShapeId.set(other);
    	return this;
    }
    
    /// ```
    /// The id of the shape that stopped touching the sensor shape
    /// @warning this shape may have been destroyed
    /// @see b3Shape_IsValid
    /// ```
    public ShapeId visitorShapeId() {
    	return visitorShapeId;
    }
    
    @Override
    public SensorEndTouchEvent set(SensorEndTouchEvent other) {
        return set(other.segment);
    }
    
    @Override
    public SensorEndTouchEvent set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<SensorEndTouchEvent> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<SensorEndTouchEvent> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new SensorEndTouchEvent(segment),
            count
        );
    }
    
    public static NativeStructArray<SensorEndTouchEvent> array(Arena arena, SensorEndTouchEvent... structs) {
        NativeStructArray<SensorEndTouchEvent> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new SensorEndTouchEvent(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<SensorEndTouchEvent> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new SensorEndTouchEvent(segment)
        );
    }
    
}