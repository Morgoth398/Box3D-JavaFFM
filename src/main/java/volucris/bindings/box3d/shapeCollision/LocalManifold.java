/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.box3d.shapeCollision;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;
import java.util.function.Consumer;
import org.jspecify.annotations.Nullable;
import volucris.bindings.box3d.math.Vec3;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

/// ```
/// A local manifold with no dynamic information. Used by b3Collide functions.
/// ```
public final class LocalManifold
		implements Struct<LocalManifold> {

    public static final StructLayout LAYOUT;

    public static final VarHandle POINTS_HANDLE;
    public static final VarHandle POINT_COUNT_HANDLE;
    public static final VarHandle TRIANGLE_INDEX_HANDLE;
    public static final VarHandle I1_HANDLE;
    public static final VarHandle I2_HANDLE;
    public static final VarHandle I3_HANDLE;
    public static final VarHandle SQUARED_DISTANCE_HANDLE;
    public static final VarHandle FEATURE_HANDLE;
    public static final VarHandle TRIANGLE_FLAGS_HANDLE;

    public static final long NORMAL_BYTE_OFFSET;
    public static final long TRIANGLE_NORMAL_BYTE_OFFSET;
    public static final long POINTS_BYTE_OFFSET;
    public static final long POINT_COUNT_BYTE_OFFSET;
    public static final long TRIANGLE_INDEX_BYTE_OFFSET;
    public static final long I1_BYTE_OFFSET;
    public static final long I2_BYTE_OFFSET;
    public static final long I3_BYTE_OFFSET;
    public static final long SQUARED_DISTANCE_BYTE_OFFSET;
    public static final long FEATURE_BYTE_OFFSET;
    public static final long TRIANGLE_FLAGS_BYTE_OFFSET;

    private final MemorySegment segment;

    private final Vec3 normal;
    private final Vec3 triangleNormal;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            Vec3.LAYOUT.withName("normal"),
            Vec3.LAYOUT.withName("triangleNormal"),
            UNBOUNDED_ADDRESS.withName("points"),
            JAVA_INT.withName("pointCount"),
            JAVA_INT.withName("triangleIndex"),
            JAVA_INT.withName("i1"),
            JAVA_INT.withName("i2"),
            JAVA_INT.withName("i3"),
            JAVA_FLOAT.withName("squaredDistance"),
            JAVA_INT.withName("feature"),
            JAVA_INT.withName("triangleFlags")
        ).withName("b3LocalManifold").withByteAlignment(8);
        
        POINTS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("points"));
        POINT_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pointCount"));
        TRIANGLE_INDEX_HANDLE = LAYOUT.varHandle(PathElement.groupElement("triangleIndex"));
        I1_HANDLE = LAYOUT.varHandle(PathElement.groupElement("i1"));
        I2_HANDLE = LAYOUT.varHandle(PathElement.groupElement("i2"));
        I3_HANDLE = LAYOUT.varHandle(PathElement.groupElement("i3"));
        SQUARED_DISTANCE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("squaredDistance"));
        FEATURE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("feature"));
        TRIANGLE_FLAGS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("triangleFlags"));
        
        NORMAL_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("normal"));
        TRIANGLE_NORMAL_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("triangleNormal"));
        POINTS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("points"));
        POINT_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pointCount"));
        TRIANGLE_INDEX_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("triangleIndex"));
        I1_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("i1"));
        I2_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("i2"));
        I3_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("i3"));
        SQUARED_DISTANCE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("squaredDistance"));
        FEATURE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("feature"));
        TRIANGLE_FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("triangleFlags"));
        //@formatter:on
    }

    public LocalManifold() {
        this(Arena.ofAuto());
    }
    
    public LocalManifold(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public LocalManifold(MemorySegment segment) {
        this.segment = segment;
    
        normal = new Vec3(segment.asSlice(NORMAL_BYTE_OFFSET, Vec3.LAYOUT));
        triangleNormal = new Vec3(segment.asSlice(TRIANGLE_NORMAL_BYTE_OFFSET, Vec3.LAYOUT));
    }

    /// @see #points()
    public LocalManifold points(NativeStructArray<LocalManifoldPoint> points) {
    	POINTS_HANDLE.set(segment, 0L, points.memorySegment());
    	return this;
    }
    
    /// ```
    /// The manifold points. From a point buffer.
    /// ```
    public @Nullable NativeStructArray<LocalManifoldPoint> points() {
    	MemorySegment segment = (MemorySegment) POINTS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    
    	return LocalManifoldPoint.array(segment);
    }
    
    /// @see #pointCount()
    public LocalManifold pointCount(int pointCount) {
    	POINT_COUNT_HANDLE.set(segment, 0L, pointCount);
    	return this;
    }
    
    /// ```
    /// The number of manifold points. Only bounded by the buffer capacity.
    /// ```
    public int pointCount() {
    	return (int) POINT_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #triangleIndex()
    public LocalManifold triangleIndex(int triangleIndex) {
    	TRIANGLE_INDEX_HANDLE.set(segment, 0L, triangleIndex);
    	return this;
    }
    
    /// ```
    /// The index of the triangle.
    /// ```
    public int triangleIndex() {
    	return (int) TRIANGLE_INDEX_HANDLE.get(segment, 0L);
    }
    
    /// @see #i1()
    public LocalManifold i1(int i1) {
    	I1_HANDLE.set(segment, 0L, i1);
    	return this;
    }
    
    /// ```
    /// Vertex 1 index.
    /// ```
    public int i1() {
    	return (int) I1_HANDLE.get(segment, 0L);
    }
    
    /// @see #i2()
    public LocalManifold i2(int i2) {
    	I2_HANDLE.set(segment, 0L, i2);
    	return this;
    }
    
    /// ```
    /// Vertex 2 index.
    /// ```
    public int i2() {
    	return (int) I2_HANDLE.get(segment, 0L);
    }
    
    /// @see #i3()
    public LocalManifold i3(int i3) {
    	I3_HANDLE.set(segment, 0L, i3);
    	return this;
    }
    
    /// ```
    /// Vertex 3 index.
    /// ```
    public int i3() {
    	return (int) I3_HANDLE.get(segment, 0L);
    }
    
    /// @see #squaredDistance()
    public LocalManifold squaredDistance(float squaredDistance) {
    	SQUARED_DISTANCE_HANDLE.set(segment, 0L, squaredDistance);
    	return this;
    }
    
    /// ```
    /// The squared distance of a sphere from a triangle. For ghost collision reduction.
    /// ```
    public float squaredDistance() {
    	return (float) SQUARED_DISTANCE_HANDLE.get(segment, 0L);
    }
    
    /// @see #feature()
    public LocalManifold feature(int feature) {
    	FEATURE_HANDLE.set(segment, 0L, feature);
    	return this;
    }
    
    /// ```
    /// The triangle feature involved.
    /// ```
    public int feature() {
    	return (int) FEATURE_HANDLE.get(segment, 0L);
    }
    
    /// @see #triangleFlags()
    public LocalManifold triangleFlags(int triangleFlags) {
    	TRIANGLE_FLAGS_HANDLE.set(segment, 0L, triangleFlags);
    	return this;
    }
    
    /// ```
    /// b3MeshEdgeFlags.
    /// ```
    public int triangleFlags() {
    	return (int) TRIANGLE_FLAGS_HANDLE.get(segment, 0L);
    }
    
    /// @see #normal()
    public LocalManifold normal(Consumer<Vec3> consumer) {
    	consumer.accept(normal);
    	return this;
    }
    
    /// @see #normal()
    public LocalManifold normal(Vec3 other) {
    	normal.set(other);
    	return this;
    }
    
    /// ```
    /// Local normal in frame A.
    /// ```
    public Vec3 normal() {
    	return normal;
    }
    
    /// @see #triangleNormal()
    public LocalManifold triangleNormal(Consumer<Vec3> consumer) {
    	consumer.accept(triangleNormal);
    	return this;
    }
    
    /// @see #triangleNormal()
    public LocalManifold triangleNormal(Vec3 other) {
    	triangleNormal.set(other);
    	return this;
    }
    
    /// ```
    /// The triangle normal.
    /// ```
    public Vec3 triangleNormal() {
    	return triangleNormal;
    }
    
    @Override
    public LocalManifold set(LocalManifold other) {
        return set(other.segment);
    }
    
    @Override
    public LocalManifold set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<LocalManifold> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<LocalManifold> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new LocalManifold(segment),
            count
        );
    }
    
    public static NativeStructArray<LocalManifold> array(Arena arena, LocalManifold... structs) {
        NativeStructArray<LocalManifold> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new LocalManifold(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<LocalManifold> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new LocalManifold(segment)
        );
    }
    
}