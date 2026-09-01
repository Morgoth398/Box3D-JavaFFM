/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.box3d.query;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;
import java.util.function.Consumer;
import volucris.bindings.box3d.math.Vec3;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;

/// ```
/// Output for b3ShapeDistance
/// ```
public final class DistanceOutput
		implements Struct<DistanceOutput> {

    public static final StructLayout LAYOUT;

    public static final VarHandle DISTANCE_HANDLE;
    public static final VarHandle ITERATIONS_HANDLE;
    public static final VarHandle SIMPLEX_COUNT_HANDLE;

    public static final long POINT_A_BYTE_OFFSET;
    public static final long POINT_B_BYTE_OFFSET;
    public static final long NORMAL_BYTE_OFFSET;
    public static final long DISTANCE_BYTE_OFFSET;
    public static final long ITERATIONS_BYTE_OFFSET;
    public static final long SIMPLEX_COUNT_BYTE_OFFSET;

    private final MemorySegment segment;

    private final Vec3 pointA;
    private final Vec3 pointB;
    private final Vec3 normal;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            Vec3.LAYOUT.withName("pointA"),
            Vec3.LAYOUT.withName("pointB"),
            Vec3.LAYOUT.withName("normal"),
            JAVA_FLOAT.withName("distance"),
            JAVA_INT.withName("iterations"),
            JAVA_INT.withName("simplexCount")
        ).withName("b3DistanceOutput").withByteAlignment(4);
        
        DISTANCE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("distance"));
        ITERATIONS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("iterations"));
        SIMPLEX_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("simplexCount"));
        
        POINT_A_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pointA"));
        POINT_B_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pointB"));
        NORMAL_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("normal"));
        DISTANCE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("distance"));
        ITERATIONS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("iterations"));
        SIMPLEX_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("simplexCount"));
        //@formatter:on
    }

    public DistanceOutput() {
        this(Arena.ofAuto());
    }
    
    public DistanceOutput(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public DistanceOutput(MemorySegment segment) {
        this.segment = segment;
    
        pointA = new Vec3(segment.asSlice(POINT_A_BYTE_OFFSET, Vec3.LAYOUT));
        pointB = new Vec3(segment.asSlice(POINT_B_BYTE_OFFSET, Vec3.LAYOUT));
        normal = new Vec3(segment.asSlice(NORMAL_BYTE_OFFSET, Vec3.LAYOUT));
    }

    /// @see #distance()
    public DistanceOutput distance(float distance) {
    	DISTANCE_HANDLE.set(segment, 0L, distance);
    	return this;
    }
    
    /// ```
    /// The final distance, zero if overlapped
    /// ```
    public float distance() {
    	return (float) DISTANCE_HANDLE.get(segment, 0L);
    }
    
    /// @see #iterations()
    public DistanceOutput iterations(int iterations) {
    	ITERATIONS_HANDLE.set(segment, 0L, iterations);
    	return this;
    }
    
    /// ```
    /// Number of GJK iterations used
    /// ```
    public int iterations() {
    	return (int) ITERATIONS_HANDLE.get(segment, 0L);
    }
    
    /// @see #simplexCount()
    public DistanceOutput simplexCount(int simplexCount) {
    	SIMPLEX_COUNT_HANDLE.set(segment, 0L, simplexCount);
    	return this;
    }
    
    /// ```
    /// The number of simplexes stored in the simplex array
    /// ```
    public int simplexCount() {
    	return (int) SIMPLEX_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pointA()
    public DistanceOutput pointA(Consumer<Vec3> consumer) {
    	consumer.accept(pointA);
    	return this;
    }
    
    /// @see #pointA()
    public DistanceOutput pointA(Vec3 other) {
    	pointA.set(other);
    	return this;
    }
    
    /// ```
    /// Closest point on shapeA, in shape A's frame
    /// ```
    public Vec3 pointA() {
    	return pointA;
    }
    
    /// @see #pointB()
    public DistanceOutput pointB(Consumer<Vec3> consumer) {
    	consumer.accept(pointB);
    	return this;
    }
    
    /// @see #pointB()
    public DistanceOutput pointB(Vec3 other) {
    	pointB.set(other);
    	return this;
    }
    
    /// ```
    /// Closest point on shapeB, in shape A's frame
    /// ```
    public Vec3 pointB() {
    	return pointB;
    }
    
    /// @see #normal()
    public DistanceOutput normal(Consumer<Vec3> consumer) {
    	consumer.accept(normal);
    	return this;
    }
    
    /// @see #normal()
    public DistanceOutput normal(Vec3 other) {
    	normal.set(other);
    	return this;
    }
    
    /// ```
    /// A to B normal in shape A's frame. Invalid if distance is zero.
    /// ```
    public Vec3 normal() {
    	return normal;
    }
    
    @Override
    public DistanceOutput set(DistanceOutput other) {
        return set(other.segment);
    }
    
    @Override
    public DistanceOutput set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<DistanceOutput> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<DistanceOutput> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new DistanceOutput(segment),
            count
        );
    }
    
    public static NativeStructArray<DistanceOutput> array(Arena arena, DistanceOutput... structs) {
        NativeStructArray<DistanceOutput> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new DistanceOutput(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<DistanceOutput> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new DistanceOutput(segment)
        );
    }
    
}