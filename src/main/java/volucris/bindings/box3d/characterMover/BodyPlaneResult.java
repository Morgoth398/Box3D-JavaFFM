/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.box3d.characterMover;

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
/// Body plane result for movers.
/// ```
public final class BodyPlaneResult
		implements Struct<BodyPlaneResult> {

    public static final StructLayout LAYOUT;

    public static final long SHAPE_ID_BYTE_OFFSET;
    public static final long RESULT_BYTE_OFFSET;

    private final MemorySegment segment;

    private final ShapeId shapeId;
    private final PlaneResult result;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            ShapeId.LAYOUT.withName("shapeId"),
            PlaneResult.LAYOUT.withName("result")
        ).withName("b3BodyPlaneResult").withByteAlignment(4);
        
        SHAPE_ID_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shapeId"));
        RESULT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("result"));
        //@formatter:on
    }

    public BodyPlaneResult() {
        this(Arena.ofAuto());
    }
    
    public BodyPlaneResult(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public BodyPlaneResult(MemorySegment segment) {
        this.segment = segment;
    
        shapeId = new ShapeId(segment.asSlice(SHAPE_ID_BYTE_OFFSET, ShapeId.LAYOUT));
        result = new PlaneResult(segment.asSlice(RESULT_BYTE_OFFSET, PlaneResult.LAYOUT));
    }

    /// @see #shapeId()
    public BodyPlaneResult shapeId(Consumer<ShapeId> consumer) {
    	consumer.accept(shapeId);
    	return this;
    }
    
    /// @see #shapeId()
    public BodyPlaneResult shapeId(ShapeId other) {
    	shapeId.set(other);
    	return this;
    }
    
    /// ```
    /// The shape id on the body.
    /// ```
    public ShapeId shapeId() {
    	return shapeId;
    }
    
    /// @see #result()
    public BodyPlaneResult result(Consumer<PlaneResult> consumer) {
    	consumer.accept(result);
    	return this;
    }
    
    /// @see #result()
    public BodyPlaneResult result(PlaneResult other) {
    	result.set(other);
    	return this;
    }
    
    /// ```
    /// The plane result.
    /// ```
    public PlaneResult result() {
    	return result;
    }
    
    @Override
    public BodyPlaneResult set(BodyPlaneResult other) {
        return set(other.segment);
    }
    
    @Override
    public BodyPlaneResult set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<BodyPlaneResult> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<BodyPlaneResult> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new BodyPlaneResult(segment),
            count
        );
    }
    
    public static NativeStructArray<BodyPlaneResult> array(Arena arena, BodyPlaneResult... structs) {
        NativeStructArray<BodyPlaneResult> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new BodyPlaneResult(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<BodyPlaneResult> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new BodyPlaneResult(segment)
        );
    }
    
}