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
/// A manifold point is a contact point belonging to a contact manifold.
/// It holds details related to the geometry and dynamics of the contact points.
/// Box3D uses speculative collision so some contact points may be separated.
/// You may use the maxNormalImpulse to determine if there was an interaction during
/// the time step.
/// ```
public final class ManifoldPoint
		implements Struct<ManifoldPoint> {

    public static final StructLayout LAYOUT;

    public static final VarHandle SEPARATION_HANDLE;
    public static final VarHandle BASE_SEPARATION_HANDLE;
    public static final VarHandle NORMAL_IMPULSE_HANDLE;
    public static final VarHandle TOTAL_NORMAL_IMPULSE_HANDLE;
    public static final VarHandle NORMAL_VELOCITY_HANDLE;
    public static final VarHandle FEATURE_ID_HANDLE;
    public static final VarHandle TRIANGLE_INDEX_HANDLE;
    public static final VarHandle PERSISTED_HANDLE;

    public static final long ANCHOR_A_BYTE_OFFSET;
    public static final long ANCHOR_B_BYTE_OFFSET;
    public static final long SEPARATION_BYTE_OFFSET;
    public static final long BASE_SEPARATION_BYTE_OFFSET;
    public static final long NORMAL_IMPULSE_BYTE_OFFSET;
    public static final long TOTAL_NORMAL_IMPULSE_BYTE_OFFSET;
    public static final long NORMAL_VELOCITY_BYTE_OFFSET;
    public static final long FEATURE_ID_BYTE_OFFSET;
    public static final long TRIANGLE_INDEX_BYTE_OFFSET;
    public static final long PERSISTED_BYTE_OFFSET;

    private final MemorySegment segment;

    private final Vec3 anchorA;
    private final Vec3 anchorB;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            Vec3.LAYOUT.withName("anchorA"),
            Vec3.LAYOUT.withName("anchorB"),
            JAVA_FLOAT.withName("separation"),
            JAVA_FLOAT.withName("baseSeparation"),
            JAVA_FLOAT.withName("normalImpulse"),
            JAVA_FLOAT.withName("totalNormalImpulse"),
            JAVA_FLOAT.withName("normalVelocity"),
            JAVA_INT.withName("featureId"),
            JAVA_INT.withName("triangleIndex"),
            JAVA_BOOLEAN.withName("persisted"),
            MemoryLayout.paddingLayout(3)
        ).withName("b3ManifoldPoint").withByteAlignment(4);
        
        SEPARATION_HANDLE = LAYOUT.varHandle(PathElement.groupElement("separation"));
        BASE_SEPARATION_HANDLE = LAYOUT.varHandle(PathElement.groupElement("baseSeparation"));
        NORMAL_IMPULSE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("normalImpulse"));
        TOTAL_NORMAL_IMPULSE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("totalNormalImpulse"));
        NORMAL_VELOCITY_HANDLE = LAYOUT.varHandle(PathElement.groupElement("normalVelocity"));
        FEATURE_ID_HANDLE = LAYOUT.varHandle(PathElement.groupElement("featureId"));
        TRIANGLE_INDEX_HANDLE = LAYOUT.varHandle(PathElement.groupElement("triangleIndex"));
        PERSISTED_HANDLE = LAYOUT.varHandle(PathElement.groupElement("persisted"));
        
        ANCHOR_A_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("anchorA"));
        ANCHOR_B_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("anchorB"));
        SEPARATION_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("separation"));
        BASE_SEPARATION_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("baseSeparation"));
        NORMAL_IMPULSE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("normalImpulse"));
        TOTAL_NORMAL_IMPULSE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("totalNormalImpulse"));
        NORMAL_VELOCITY_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("normalVelocity"));
        FEATURE_ID_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("featureId"));
        TRIANGLE_INDEX_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("triangleIndex"));
        PERSISTED_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("persisted"));
        //@formatter:on
    }

    public ManifoldPoint() {
        this(Arena.ofAuto());
    }
    
    public ManifoldPoint(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public ManifoldPoint(MemorySegment segment) {
        this.segment = segment;
    
        anchorA = new Vec3(segment.asSlice(ANCHOR_A_BYTE_OFFSET, Vec3.LAYOUT));
        anchorB = new Vec3(segment.asSlice(ANCHOR_B_BYTE_OFFSET, Vec3.LAYOUT));
    }

    /// @see #separation()
    public ManifoldPoint separation(float separation) {
    	SEPARATION_HANDLE.set(segment, 0L, separation);
    	return this;
    }
    
    /// ```
    /// The separation of the contact point, negative if penetrating
    /// ```
    public float separation() {
    	return (float) SEPARATION_HANDLE.get(segment, 0L);
    }
    
    /// @see #baseSeparation()
    public ManifoldPoint baseSeparation(float baseSeparation) {
    	BASE_SEPARATION_HANDLE.set(segment, 0L, baseSeparation);
    	return this;
    }
    
    /// ```
    /// Cached separation used for contact recycling
    /// ```
    public float baseSeparation() {
    	return (float) BASE_SEPARATION_HANDLE.get(segment, 0L);
    }
    
    /// @see #normalImpulse()
    public ManifoldPoint normalImpulse(float normalImpulse) {
    	NORMAL_IMPULSE_HANDLE.set(segment, 0L, normalImpulse);
    	return this;
    }
    
    /// ```
    /// The impulse along the manifold normal vector. Since Box3D uses sub-stepping, this is
    /// result from the final sub-step.
    /// ```
    public float normalImpulse() {
    	return (float) NORMAL_IMPULSE_HANDLE.get(segment, 0L);
    }
    
    /// @see #totalNormalImpulse()
    public ManifoldPoint totalNormalImpulse(float totalNormalImpulse) {
    	TOTAL_NORMAL_IMPULSE_HANDLE.set(segment, 0L, totalNormalImpulse);
    	return this;
    }
    
    /// ```
    /// The total normal impulse applied during sub-stepping. This is important
    /// to identify speculative contact points that had an interaction in the time step.
    /// ```
    public float totalNormalImpulse() {
    	return (float) TOTAL_NORMAL_IMPULSE_HANDLE.get(segment, 0L);
    }
    
    /// @see #normalVelocity()
    public ManifoldPoint normalVelocity(float normalVelocity) {
    	NORMAL_VELOCITY_HANDLE.set(segment, 0L, normalVelocity);
    	return this;
    }
    
    /// ```
    /// Relative normal velocity pre-solve. Used for hit events. If the normal impulse is
    /// zero then there was no hit. Negative means shapes are approaching.
    /// ```
    public float normalVelocity() {
    	return (float) NORMAL_VELOCITY_HANDLE.get(segment, 0L);
    }
    
    /// @see #featureId()
    public ManifoldPoint featureId(int featureId) {
    	FEATURE_ID_HANDLE.set(segment, 0L, featureId);
    	return this;
    }
    
    /// ```
    /// Local point for matching
    /// Uniquely identifies a contact point between two shapes
    /// ```
    public int featureId() {
    	return (int) FEATURE_ID_HANDLE.get(segment, 0L);
    }
    
    /// @see #triangleIndex()
    public ManifoldPoint triangleIndex(int triangleIndex) {
    	TRIANGLE_INDEX_HANDLE.set(segment, 0L, triangleIndex);
    	return this;
    }
    
    /// ```
    /// Triangle index if one of the shapes is a mesh or height field
    /// ```
    public int triangleIndex() {
    	return (int) TRIANGLE_INDEX_HANDLE.get(segment, 0L);
    }
    
    /// @see #persisted()
    public ManifoldPoint persisted(boolean persisted) {
    	PERSISTED_HANDLE.set(segment, 0L, persisted);
    	return this;
    }
    
    /// ```
    /// Did this contact point exist in the previous step?
    /// ```
    public boolean persisted() {
    	return (boolean) PERSISTED_HANDLE.get(segment, 0L);
    }
    
    /// @see #anchorA()
    public ManifoldPoint anchorA(Consumer<Vec3> consumer) {
    	consumer.accept(anchorA);
    	return this;
    }
    
    /// @see #anchorA()
    public ManifoldPoint anchorA(Vec3 other) {
    	anchorA.set(other);
    	return this;
    }
    
    /// ```
    /// Location of the contact point relative to the bodyA center of mass in world space.
    /// ```
    public Vec3 anchorA() {
    	return anchorA;
    }
    
    /// @see #anchorB()
    public ManifoldPoint anchorB(Consumer<Vec3> consumer) {
    	consumer.accept(anchorB);
    	return this;
    }
    
    /// @see #anchorB()
    public ManifoldPoint anchorB(Vec3 other) {
    	anchorB.set(other);
    	return this;
    }
    
    /// ```
    /// Location of the contact point relative to the bodyB center of mass in world space.
    /// ```
    public Vec3 anchorB() {
    	return anchorB;
    }
    
    @Override
    public ManifoldPoint set(ManifoldPoint other) {
        return set(other.segment);
    }
    
    @Override
    public ManifoldPoint set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<ManifoldPoint> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<ManifoldPoint> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new ManifoldPoint(segment),
            count
        );
    }
    
    public static NativeStructArray<ManifoldPoint> array(Arena arena, ManifoldPoint... structs) {
        NativeStructArray<ManifoldPoint> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new ManifoldPoint(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<ManifoldPoint> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new ManifoldPoint(segment)
        );
    }
    
}