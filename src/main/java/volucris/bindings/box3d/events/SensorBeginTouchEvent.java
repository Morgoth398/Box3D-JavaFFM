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
/// A begin-touch event is generated when a shape starts to overlap a sensor shape.
/// ```
public final class SensorBeginTouchEvent
		implements Struct<SensorBeginTouchEvent> {

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
        ).withName("b3SensorBeginTouchEvent").withByteAlignment(4);
        
        SENSOR_SHAPE_ID_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sensorShapeId"));
        VISITOR_SHAPE_ID_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("visitorShapeId"));
        //@formatter:on
    }

    public SensorBeginTouchEvent() {
        this(Arena.ofAuto());
    }
    
    public SensorBeginTouchEvent(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public SensorBeginTouchEvent(MemorySegment segment) {
        this.segment = segment;
    
        sensorShapeId = new ShapeId(segment.asSlice(SENSOR_SHAPE_ID_BYTE_OFFSET, ShapeId.LAYOUT));
        visitorShapeId = new ShapeId(segment.asSlice(VISITOR_SHAPE_ID_BYTE_OFFSET, ShapeId.LAYOUT));
    }

    /// @see #sensorShapeId()
    public SensorBeginTouchEvent sensorShapeId(Consumer<ShapeId> consumer) {
    	consumer.accept(sensorShapeId);
    	return this;
    }
    
    /// @see #sensorShapeId()
    public SensorBeginTouchEvent sensorShapeId(ShapeId other) {
    	sensorShapeId.set(other);
    	return this;
    }
    
    /// ```
    /// The id of the sensor shape
    /// ```
    public ShapeId sensorShapeId() {
    	return sensorShapeId;
    }
    
    /// @see #visitorShapeId()
    public SensorBeginTouchEvent visitorShapeId(Consumer<ShapeId> consumer) {
    	consumer.accept(visitorShapeId);
    	return this;
    }
    
    /// @see #visitorShapeId()
    public SensorBeginTouchEvent visitorShapeId(ShapeId other) {
    	visitorShapeId.set(other);
    	return this;
    }
    
    /// ```
    /// The id of the shape that began touching the sensor shape
    /// ```
    public ShapeId visitorShapeId() {
    	return visitorShapeId;
    }
    
    @Override
    public SensorBeginTouchEvent set(SensorBeginTouchEvent other) {
        return set(other.segment);
    }
    
    @Override
    public SensorBeginTouchEvent set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<SensorBeginTouchEvent> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<SensorBeginTouchEvent> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new SensorBeginTouchEvent(segment),
            count
        );
    }
    
    public static NativeStructArray<SensorBeginTouchEvent> array(Arena arena, SensorBeginTouchEvent... structs) {
        NativeStructArray<SensorBeginTouchEvent> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new SensorBeginTouchEvent(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<SensorBeginTouchEvent> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new SensorBeginTouchEvent(segment)
        );
    }
    
}