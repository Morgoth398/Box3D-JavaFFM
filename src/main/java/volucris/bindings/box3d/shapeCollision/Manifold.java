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
/// A contact manifold describes the contact points between colliding shapes.
/// @note Box3D uses speculative collision so some contact points may be separated.
/// ```
public final class Manifold
		implements Struct<Manifold> {

    public static final StructLayout LAYOUT;

    public static final VarHandle TWIST_IMPULSE_HANDLE;
    public static final VarHandle POINT_COUNT_HANDLE;

    public static final long POINTS_BYTE_OFFSET;
    public static final long NORMAL_BYTE_OFFSET;
    public static final long TWIST_IMPULSE_BYTE_OFFSET;
    public static final long FRICTION_IMPULSE_BYTE_OFFSET;
    public static final long ROLLING_IMPULSE_BYTE_OFFSET;
    public static final long POINT_COUNT_BYTE_OFFSET;

    private final MemorySegment segment;

    private final ManifoldPoint[] points;
    private final Vec3 normal;
    private final Vec3 frictionImpulse;
    private final Vec3 rollingImpulse;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(4, ManifoldPoint.LAYOUT).withName("points"),
            Vec3.LAYOUT.withName("normal"),
            JAVA_FLOAT.withName("twistImpulse"),
            Vec3.LAYOUT.withName("frictionImpulse"),
            Vec3.LAYOUT.withName("rollingImpulse"),
            JAVA_INT.withName("pointCount")
        ).withName("b3Manifold").withByteAlignment(4);
        
        TWIST_IMPULSE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("twistImpulse"));
        POINT_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pointCount"));
        
        POINTS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("points"));
        NORMAL_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("normal"));
        TWIST_IMPULSE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("twistImpulse"));
        FRICTION_IMPULSE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("frictionImpulse"));
        ROLLING_IMPULSE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("rollingImpulse"));
        POINT_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pointCount"));
        //@formatter:on
    }

    public Manifold() {
        this(Arena.ofAuto());
    }
    
    public Manifold(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public Manifold(MemorySegment segment) {
        this.segment = segment;
    
        points = new ManifoldPoint[4];
        for (int i = 0; i < 4; i++) {
            long offset = POINTS_BYTE_OFFSET + i * ManifoldPoint.LAYOUT.byteSize();
            points[i] = new ManifoldPoint(segment.asSlice(offset, ManifoldPoint.LAYOUT));
        }
    
        normal = new Vec3(segment.asSlice(NORMAL_BYTE_OFFSET, Vec3.LAYOUT));
        frictionImpulse = new Vec3(segment.asSlice(FRICTION_IMPULSE_BYTE_OFFSET, Vec3.LAYOUT));
        rollingImpulse = new Vec3(segment.asSlice(ROLLING_IMPULSE_BYTE_OFFSET, Vec3.LAYOUT));
    }

    /// @see #twistImpulse()
    public Manifold twistImpulse(float twistImpulse) {
    	TWIST_IMPULSE_HANDLE.set(segment, 0L, twistImpulse);
    	return this;
    }
    
    /// ```
    /// Central friction angular impulse (applied about the normal)
    /// ```
    public float twistImpulse() {
    	return (float) TWIST_IMPULSE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pointCount()
    public Manifold pointCount(int pointCount) {
    	POINT_COUNT_HANDLE.set(segment, 0L, pointCount);
    	return this;
    }
    
    /// ```
    /// The number of contact points, will be 0 to 4
    /// ```
    public int pointCount() {
    	return (int) POINT_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #points(int)
    public Manifold points(Consumer<ManifoldPoint> consumer, int index) {
    	consumer.accept(points[index]);
    	return this;
    }
    
    /// @see #points(int)
    public Manifold points(ManifoldPoint other, int index) {
    	points[index].set(other);
    	return this;
    }
    
    /// ```
    /// The manifold points. There may be 1 to 4 valid points.
    /// ```
    public ManifoldPoint points(int index) {
    	return points[index];
    }
    
    /// @see #normal()
    public Manifold normal(Consumer<Vec3> consumer) {
    	consumer.accept(normal);
    	return this;
    }
    
    /// @see #normal()
    public Manifold normal(Vec3 other) {
    	normal.set(other);
    	return this;
    }
    
    /// ```
    /// The unit normal vector in world space, points from shape A to shape B
    /// ```
    public Vec3 normal() {
    	return normal;
    }
    
    /// @see #frictionImpulse()
    public Manifold frictionImpulse(Consumer<Vec3> consumer) {
    	consumer.accept(frictionImpulse);
    	return this;
    }
    
    /// @see #frictionImpulse()
    public Manifold frictionImpulse(Vec3 other) {
    	frictionImpulse.set(other);
    	return this;
    }
    
    /// ```
    /// Central friction linear impulse
    /// ```
    public Vec3 frictionImpulse() {
    	return frictionImpulse;
    }
    
    /// @see #rollingImpulse()
    public Manifold rollingImpulse(Consumer<Vec3> consumer) {
    	consumer.accept(rollingImpulse);
    	return this;
    }
    
    /// @see #rollingImpulse()
    public Manifold rollingImpulse(Vec3 other) {
    	rollingImpulse.set(other);
    	return this;
    }
    
    /// ```
    /// Rolling resistance angular impulse
    /// ```
    public Vec3 rollingImpulse() {
    	return rollingImpulse;
    }
    
    @Override
    public Manifold set(Manifold other) {
        return set(other.segment);
    }
    
    @Override
    public Manifold set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<Manifold> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<Manifold> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new Manifold(segment),
            count
        );
    }
    
    public static NativeStructArray<Manifold> array(Arena arena, Manifold... structs) {
        NativeStructArray<Manifold> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new Manifold(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<Manifold> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new Manifold(segment)
        );
    }
    
}