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
import volucris.bindings.box3d.math.Vec3;
import volucris.bindings.box3d.shape.ShapeId;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;

/// ```
/// One result of a recorded spatial query.
/// ```
public final class RecQueryHit
		implements Struct<RecQueryHit> {

    public static final StructLayout LAYOUT;

    public static final VarHandle FRACTION_HANDLE;

    public static final long SHAPE_BYTE_OFFSET;
    public static final long POINT_BYTE_OFFSET;
    public static final long NORMAL_BYTE_OFFSET;
    public static final long FRACTION_BYTE_OFFSET;

    private final MemorySegment segment;

    private final ShapeId shape;
    private final Vec3 point;
    private final Vec3 normal;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            ShapeId.LAYOUT.withName("shape"),
            Vec3.LAYOUT.withName("point"),
            Vec3.LAYOUT.withName("normal"),
            JAVA_FLOAT.withName("fraction")
        ).withName("b3RecQueryHit").withByteAlignment(4);
        
        FRACTION_HANDLE = LAYOUT.varHandle(PathElement.groupElement("fraction"));
        
        SHAPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shape"));
        POINT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("point"));
        NORMAL_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("normal"));
        FRACTION_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("fraction"));
        //@formatter:on
    }

    public RecQueryHit() {
        this(Arena.ofAuto());
    }
    
    public RecQueryHit(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public RecQueryHit(MemorySegment segment) {
        this.segment = segment;
    
        shape = new ShapeId(segment.asSlice(SHAPE_BYTE_OFFSET, ShapeId.LAYOUT));
        point = new Vec3(segment.asSlice(POINT_BYTE_OFFSET, Vec3.LAYOUT));
        normal = new Vec3(segment.asSlice(NORMAL_BYTE_OFFSET, Vec3.LAYOUT));
    }

    /// @see #fraction()
    public RecQueryHit fraction(float fraction) {
    	FRACTION_HANDLE.set(segment, 0L, fraction);
    	return this;
    }
    
    public float fraction() {
    	return (float) FRACTION_HANDLE.get(segment, 0L);
    }
    
    /// @see #shape()
    public RecQueryHit shape(Consumer<ShapeId> consumer) {
    	consumer.accept(shape);
    	return this;
    }
    
    /// @see #shape()
    public RecQueryHit shape(ShapeId other) {
    	shape.set(other);
    	return this;
    }
    
    public ShapeId shape() {
    	return shape;
    }
    
    /// @see #point()
    public RecQueryHit point(Consumer<Vec3> consumer) {
    	consumer.accept(point);
    	return this;
    }
    
    /// @see #point()
    public RecQueryHit point(Vec3 other) {
    	point.set(other);
    	return this;
    }
    
    public Vec3 point() {
    	return point;
    }
    
    /// @see #normal()
    public RecQueryHit normal(Consumer<Vec3> consumer) {
    	consumer.accept(normal);
    	return this;
    }
    
    /// @see #normal()
    public RecQueryHit normal(Vec3 other) {
    	normal.set(other);
    	return this;
    }
    
    public Vec3 normal() {
    	return normal;
    }
    
    @Override
    public RecQueryHit set(RecQueryHit other) {
        return set(other.segment);
    }
    
    @Override
    public RecQueryHit set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<RecQueryHit> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<RecQueryHit> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new RecQueryHit(segment),
            count
        );
    }
    
    public static NativeStructArray<RecQueryHit> array(Arena arena, RecQueryHit... structs) {
        NativeStructArray<RecQueryHit> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new RecQueryHit(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<RecQueryHit> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new RecQueryHit(segment)
        );
    }
    
}