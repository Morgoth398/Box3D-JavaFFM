/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.box3d.query;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;
import org.jspecify.annotations.Nullable;
import volucris.bindings.box3d.math.Vec3;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

/// ```
/// A shape proxy is used by the GJK algorithm. It can represent a convex shape.
/// ```
public final class ShapeProxy
		implements Struct<ShapeProxy> {

    public static final StructLayout LAYOUT;

    public static final VarHandle POINTS_HANDLE;
    public static final VarHandle COUNT_HANDLE;
    public static final VarHandle RADIUS_HANDLE;

    public static final long POINTS_BYTE_OFFSET;
    public static final long COUNT_BYTE_OFFSET;
    public static final long RADIUS_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            UNBOUNDED_ADDRESS.withName("points"),
            JAVA_INT.withName("count"),
            JAVA_FLOAT.withName("radius")
        ).withName("b3ShapeProxy").withByteAlignment(8);
        
        POINTS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("points"));
        COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("count"));
        RADIUS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("radius"));
        
        POINTS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("points"));
        COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("count"));
        RADIUS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("radius"));
        //@formatter:on
    }

    public ShapeProxy() {
        this(Arena.ofAuto());
    }
    
    public ShapeProxy(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public ShapeProxy(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #points()
    public ShapeProxy points(NativeStructArray<Vec3> points) {
    	POINTS_HANDLE.set(segment, 0L, points.memorySegment());
    	return this;
    }
    
    /// ```
    /// The point cloud.
    /// ```
    public @Nullable NativeStructArray<Vec3> points() {
    	MemorySegment segment = (MemorySegment) POINTS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    
    	return Vec3.array(segment);
    }
    
    /// @see #count()
    public ShapeProxy count(int count) {
    	COUNT_HANDLE.set(segment, 0L, count);
    	return this;
    }
    
    /// ```
    /// The number of points. Do not exceed B3_MAX_SHAPE_CAST_POINTS.
    /// ```
    public int count() {
    	return (int) COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #radius()
    public ShapeProxy radius(float radius) {
    	RADIUS_HANDLE.set(segment, 0L, radius);
    	return this;
    }
    
    /// ```
    /// The external radius of the point cloud.
    /// ```
    public float radius() {
    	return (float) RADIUS_HANDLE.get(segment, 0L);
    }
    
    @Override
    public ShapeProxy set(ShapeProxy other) {
        return set(other.segment);
    }
    
    @Override
    public ShapeProxy set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<ShapeProxy> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<ShapeProxy> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new ShapeProxy(segment),
            count
        );
    }
    
    public static NativeStructArray<ShapeProxy> array(Arena arena, ShapeProxy... structs) {
        NativeStructArray<ShapeProxy> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new ShapeProxy(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<ShapeProxy> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new ShapeProxy(segment)
        );
    }
    
}