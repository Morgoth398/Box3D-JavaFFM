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
import volucris.bindings.box3d.math.Vec3;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;

/// ```
/// A local manifold point and normal in frame A.
/// ```
public final class LocalManifoldPoint
		implements Struct<LocalManifoldPoint> {

    public static final StructLayout LAYOUT;

    public static final VarHandle SEPARATION_HANDLE;
    public static final VarHandle TRIANGLE_INDEX_HANDLE;

    public static final long POINT_BYTE_OFFSET;
    public static final long SEPARATION_BYTE_OFFSET;
    public static final long PAIR_BYTE_OFFSET;
    public static final long TRIANGLE_INDEX_BYTE_OFFSET;

    private final MemorySegment segment;

    private final Vec3 point;
    private final FeaturePair pair;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            Vec3.LAYOUT.withName("point"),
            JAVA_FLOAT.withName("separation"),
            FeaturePair.LAYOUT.withName("pair"),
            JAVA_INT.withName("triangleIndex")
        ).withName("b3LocalManifoldPoint").withByteAlignment(4);
        
        SEPARATION_HANDLE = LAYOUT.varHandle(PathElement.groupElement("separation"));
        TRIANGLE_INDEX_HANDLE = LAYOUT.varHandle(PathElement.groupElement("triangleIndex"));
        
        POINT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("point"));
        SEPARATION_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("separation"));
        PAIR_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pair"));
        TRIANGLE_INDEX_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("triangleIndex"));
        //@formatter:on
    }

    public LocalManifoldPoint() {
        this(Arena.ofAuto());
    }
    
    public LocalManifoldPoint(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public LocalManifoldPoint(MemorySegment segment) {
        this.segment = segment;
    
        point = new Vec3(segment.asSlice(POINT_BYTE_OFFSET, Vec3.LAYOUT));
        pair = new FeaturePair(segment.asSlice(PAIR_BYTE_OFFSET, FeaturePair.LAYOUT));
    }

    /// @see #separation()
    public LocalManifoldPoint separation(float separation) {
    	SEPARATION_HANDLE.set(segment, 0L, separation);
    	return this;
    }
    
    /// ```
    /// The contact point separation. Negative for overlap.
    /// ```
    public float separation() {
    	return (float) SEPARATION_HANDLE.get(segment, 0L);
    }
    
    /// @see #triangleIndex()
    public LocalManifoldPoint triangleIndex(int triangleIndex) {
    	TRIANGLE_INDEX_HANDLE.set(segment, 0L, triangleIndex);
    	return this;
    }
    
    /// ```
    /// The triangle index when collide with a mesh or height-field.
    /// ```
    public int triangleIndex() {
    	return (int) TRIANGLE_INDEX_HANDLE.get(segment, 0L);
    }
    
    /// @see #point()
    public LocalManifoldPoint point(Consumer<Vec3> consumer) {
    	consumer.accept(point);
    	return this;
    }
    
    /// @see #point()
    public LocalManifoldPoint point(Vec3 other) {
    	point.set(other);
    	return this;
    }
    
    /// ```
    /// Local point in frame A.
    /// ```
    public Vec3 point() {
    	return point;
    }
    
    /// @see #pair()
    public LocalManifoldPoint pair(Consumer<FeaturePair> consumer) {
    	consumer.accept(pair);
    	return this;
    }
    
    /// @see #pair()
    public LocalManifoldPoint pair(FeaturePair other) {
    	pair.set(other);
    	return this;
    }
    
    /// ```
    /// The feature pair for this point.
    /// ```
    public FeaturePair pair() {
    	return pair;
    }
    
    @Override
    public LocalManifoldPoint set(LocalManifoldPoint other) {
        return set(other.segment);
    }
    
    @Override
    public LocalManifoldPoint set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<LocalManifoldPoint> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<LocalManifoldPoint> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new LocalManifoldPoint(segment),
            count
        );
    }
    
    public static NativeStructArray<LocalManifoldPoint> array(Arena arena, LocalManifoldPoint... structs) {
        NativeStructArray<LocalManifoldPoint> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new LocalManifoldPoint(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<LocalManifoldPoint> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new LocalManifoldPoint(segment)
        );
    }
    
}