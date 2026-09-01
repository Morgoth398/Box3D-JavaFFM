/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.box3d.characterMover;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.util.function.Consumer;
import volucris.bindings.box3d.math.Plane;
import volucris.bindings.box3d.math.Vec3;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;

/// ```
/// The plane between a character mover and a shape
/// ```
public final class PlaneResult
		implements Struct<PlaneResult> {

    public static final StructLayout LAYOUT;

    public static final long PLANE_BYTE_OFFSET;
    public static final long POINT_BYTE_OFFSET;

    private final MemorySegment segment;

    private final Plane plane;
    private final Vec3 point;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            Plane.LAYOUT.withName("plane"),
            Vec3.LAYOUT.withName("point")
        ).withName("b3PlaneResult").withByteAlignment(4);
        
        PLANE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("plane"));
        POINT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("point"));
        //@formatter:on
    }

    public PlaneResult() {
        this(Arena.ofAuto());
    }
    
    public PlaneResult(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public PlaneResult(MemorySegment segment) {
        this.segment = segment;
    
        plane = new Plane(segment.asSlice(PLANE_BYTE_OFFSET, Plane.LAYOUT));
        point = new Vec3(segment.asSlice(POINT_BYTE_OFFSET, Vec3.LAYOUT));
    }

    /// @see #plane()
    public PlaneResult plane(Consumer<Plane> consumer) {
    	consumer.accept(plane);
    	return this;
    }
    
    /// @see #plane()
    public PlaneResult plane(Plane other) {
    	plane.set(other);
    	return this;
    }
    
    /// ```
    /// Outward pointing plane.
    /// ```
    public Plane plane() {
    	return plane;
    }
    
    /// @see #point()
    public PlaneResult point(Consumer<Vec3> consumer) {
    	consumer.accept(point);
    	return this;
    }
    
    /// @see #point()
    public PlaneResult point(Vec3 other) {
    	point.set(other);
    	return this;
    }
    
    /// ```
    /// Closest point on the shape. May not be unique.
    /// ```
    public Vec3 point() {
    	return point;
    }
    
    @Override
    public PlaneResult set(PlaneResult other) {
        return set(other.segment);
    }
    
    @Override
    public PlaneResult set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<PlaneResult> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<PlaneResult> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new PlaneResult(segment),
            count
        );
    }
    
    public static NativeStructArray<PlaneResult> array(Arena arena, PlaneResult... structs) {
        NativeStructArray<PlaneResult> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new PlaneResult(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<PlaneResult> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new PlaneResult(segment)
        );
    }
    
}