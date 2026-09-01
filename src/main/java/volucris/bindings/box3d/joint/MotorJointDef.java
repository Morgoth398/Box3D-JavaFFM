/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.box3d.joint;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.StructLayout;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.util.function.Consumer;
import org.jspecify.annotations.Nullable;
import volucris.bindings.box3d.math.Vec3;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

/// ```
/// A motor joint is used to control the relative position and velocity between two bodies.
/// @ingroup motor_joint
/// ```
public final class MotorJointDef
		implements Struct<MotorJointDef> {

    private static final LazyConstant<MethodHandle> B3_DEFAULT_MOTOR_JOINT_DEF;

    public static final StructLayout LAYOUT;

    public static final VarHandle MAX_VELOCITY_FORCE_HANDLE;
    public static final VarHandle MAX_VELOCITY_TORQUE_HANDLE;
    public static final VarHandle LINEAR_HERTZ_HANDLE;
    public static final VarHandle LINEAR_DAMPING_RATIO_HANDLE;
    public static final VarHandle MAX_SPRING_FORCE_HANDLE;
    public static final VarHandle ANGULAR_HERTZ_HANDLE;
    public static final VarHandle ANGULAR_DAMPING_RATIO_HANDLE;
    public static final VarHandle MAX_SPRING_TORQUE_HANDLE;

    public static final long BASE_BYTE_OFFSET;
    public static final long LINEAR_VELOCITY_BYTE_OFFSET;
    public static final long MAX_VELOCITY_FORCE_BYTE_OFFSET;
    public static final long ANGULAR_VELOCITY_BYTE_OFFSET;
    public static final long MAX_VELOCITY_TORQUE_BYTE_OFFSET;
    public static final long LINEAR_HERTZ_BYTE_OFFSET;
    public static final long LINEAR_DAMPING_RATIO_BYTE_OFFSET;
    public static final long MAX_SPRING_FORCE_BYTE_OFFSET;
    public static final long ANGULAR_HERTZ_BYTE_OFFSET;
    public static final long ANGULAR_DAMPING_RATIO_BYTE_OFFSET;
    public static final long MAX_SPRING_TORQUE_BYTE_OFFSET;

    private final MemorySegment segment;

    private final JointDef base;
    private final Vec3 linearVelocity;
    private final Vec3 angularVelocity;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JointDef.LAYOUT.withName("base"),
            Vec3.LAYOUT.withName("linearVelocity"),
            JAVA_FLOAT.withName("maxVelocityForce"),
            Vec3.LAYOUT.withName("angularVelocity"),
            JAVA_FLOAT.withName("maxVelocityTorque"),
            JAVA_FLOAT.withName("linearHertz"),
            JAVA_FLOAT.withName("linearDampingRatio"),
            JAVA_FLOAT.withName("maxSpringForce"),
            JAVA_FLOAT.withName("angularHertz"),
            JAVA_FLOAT.withName("angularDampingRatio"),
            JAVA_FLOAT.withName("maxSpringTorque")
        ).withName("b3MotorJointDef").withByteAlignment(8);
        
        B3_DEFAULT_MOTOR_JOINT_DEF = downcallHandle("b3DefaultMotorJointDef", MotorJointDef.LAYOUT);
        
        MAX_VELOCITY_FORCE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxVelocityForce"));
        MAX_VELOCITY_TORQUE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxVelocityTorque"));
        LINEAR_HERTZ_HANDLE = LAYOUT.varHandle(PathElement.groupElement("linearHertz"));
        LINEAR_DAMPING_RATIO_HANDLE = LAYOUT.varHandle(PathElement.groupElement("linearDampingRatio"));
        MAX_SPRING_FORCE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxSpringForce"));
        ANGULAR_HERTZ_HANDLE = LAYOUT.varHandle(PathElement.groupElement("angularHertz"));
        ANGULAR_DAMPING_RATIO_HANDLE = LAYOUT.varHandle(PathElement.groupElement("angularDampingRatio"));
        MAX_SPRING_TORQUE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxSpringTorque"));
        
        BASE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("base"));
        LINEAR_VELOCITY_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("linearVelocity"));
        MAX_VELOCITY_FORCE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxVelocityForce"));
        ANGULAR_VELOCITY_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("angularVelocity"));
        MAX_VELOCITY_TORQUE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxVelocityTorque"));
        LINEAR_HERTZ_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("linearHertz"));
        LINEAR_DAMPING_RATIO_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("linearDampingRatio"));
        MAX_SPRING_FORCE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxSpringForce"));
        ANGULAR_HERTZ_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("angularHertz"));
        ANGULAR_DAMPING_RATIO_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("angularDampingRatio"));
        MAX_SPRING_TORQUE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxSpringTorque"));
        //@formatter:on
    }

    public MotorJointDef() {
        this(Arena.ofAuto());
    }
    
    public MotorJointDef(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public MotorJointDef(MemorySegment segment) {
        this.segment = segment;
    
        base = new JointDef(segment.asSlice(BASE_BYTE_OFFSET, JointDef.LAYOUT));
        linearVelocity = new Vec3(segment.asSlice(LINEAR_VELOCITY_BYTE_OFFSET, Vec3.LAYOUT));
        angularVelocity = new Vec3(segment.asSlice(ANGULAR_VELOCITY_BYTE_OFFSET, Vec3.LAYOUT));
    }

    /// ```
    /// Use this to initialize your joint definition
    /// @ingroup motor_joint
    /// ```
    public static MemorySegment ndefaultMotorJointDef(
    	SegmentAllocator allocator
    ) {
    	MethodHandle method = B3_DEFAULT_MOTOR_JOINT_DEF.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ndefaultMotorJointDef].
    public final @Nullable MotorJointDef defaultMotorJointDef(
    	SegmentAllocator allocator
    ) {
    	MemorySegment segment = ndefaultMotorJointDef(
    		allocator
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new MotorJointDef(segment);
    }
    
    /// @see #maxVelocityForce()
    public MotorJointDef maxVelocityForce(float maxVelocityForce) {
    	MAX_VELOCITY_FORCE_HANDLE.set(segment, 0L, maxVelocityForce);
    	return this;
    }
    
    /// ```
    /// The maximum motor force in newtons
    /// ```
    public float maxVelocityForce() {
    	return (float) MAX_VELOCITY_FORCE_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxVelocityTorque()
    public MotorJointDef maxVelocityTorque(float maxVelocityTorque) {
    	MAX_VELOCITY_TORQUE_HANDLE.set(segment, 0L, maxVelocityTorque);
    	return this;
    }
    
    /// ```
    /// The maximum motor torque in newton-meters
    /// ```
    public float maxVelocityTorque() {
    	return (float) MAX_VELOCITY_TORQUE_HANDLE.get(segment, 0L);
    }
    
    /// @see #linearHertz()
    public MotorJointDef linearHertz(float linearHertz) {
    	LINEAR_HERTZ_HANDLE.set(segment, 0L, linearHertz);
    	return this;
    }
    
    /// ```
    /// Linear spring hertz for position control
    /// ```
    public float linearHertz() {
    	return (float) LINEAR_HERTZ_HANDLE.get(segment, 0L);
    }
    
    /// @see #linearDampingRatio()
    public MotorJointDef linearDampingRatio(float linearDampingRatio) {
    	LINEAR_DAMPING_RATIO_HANDLE.set(segment, 0L, linearDampingRatio);
    	return this;
    }
    
    /// ```
    /// Linear spring damping ratio
    /// ```
    public float linearDampingRatio() {
    	return (float) LINEAR_DAMPING_RATIO_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxSpringForce()
    public MotorJointDef maxSpringForce(float maxSpringForce) {
    	MAX_SPRING_FORCE_HANDLE.set(segment, 0L, maxSpringForce);
    	return this;
    }
    
    /// ```
    /// Maximum spring force in newtons
    /// ```
    public float maxSpringForce() {
    	return (float) MAX_SPRING_FORCE_HANDLE.get(segment, 0L);
    }
    
    /// @see #angularHertz()
    public MotorJointDef angularHertz(float angularHertz) {
    	ANGULAR_HERTZ_HANDLE.set(segment, 0L, angularHertz);
    	return this;
    }
    
    /// ```
    /// Angular spring hertz for position control
    /// ```
    public float angularHertz() {
    	return (float) ANGULAR_HERTZ_HANDLE.get(segment, 0L);
    }
    
    /// @see #angularDampingRatio()
    public MotorJointDef angularDampingRatio(float angularDampingRatio) {
    	ANGULAR_DAMPING_RATIO_HANDLE.set(segment, 0L, angularDampingRatio);
    	return this;
    }
    
    /// ```
    /// Angular spring damping ratio
    /// ```
    public float angularDampingRatio() {
    	return (float) ANGULAR_DAMPING_RATIO_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxSpringTorque()
    public MotorJointDef maxSpringTorque(float maxSpringTorque) {
    	MAX_SPRING_TORQUE_HANDLE.set(segment, 0L, maxSpringTorque);
    	return this;
    }
    
    /// ```
    /// Maximum spring torque in newton-meters
    /// ```
    public float maxSpringTorque() {
    	return (float) MAX_SPRING_TORQUE_HANDLE.get(segment, 0L);
    }
    
    /// @see #base()
    public MotorJointDef base(Consumer<JointDef> consumer) {
    	consumer.accept(base);
    	return this;
    }
    
    /// @see #base()
    public MotorJointDef base(JointDef other) {
    	base.set(other);
    	return this;
    }
    
    /// ```
    /// Base joint definition
    /// ```
    public JointDef base() {
    	return base;
    }
    
    /// @see #linearVelocity()
    public MotorJointDef linearVelocity(Consumer<Vec3> consumer) {
    	consumer.accept(linearVelocity);
    	return this;
    }
    
    /// @see #linearVelocity()
    public MotorJointDef linearVelocity(Vec3 other) {
    	linearVelocity.set(other);
    	return this;
    }
    
    /// ```
    /// The desired linear velocity
    /// ```
    public Vec3 linearVelocity() {
    	return linearVelocity;
    }
    
    /// @see #angularVelocity()
    public MotorJointDef angularVelocity(Consumer<Vec3> consumer) {
    	consumer.accept(angularVelocity);
    	return this;
    }
    
    /// @see #angularVelocity()
    public MotorJointDef angularVelocity(Vec3 other) {
    	angularVelocity.set(other);
    	return this;
    }
    
    /// ```
    /// The desired angular velocity
    /// ```
    public Vec3 angularVelocity() {
    	return angularVelocity;
    }
    
    @Override
    public MotorJointDef set(MotorJointDef other) {
        return set(other.segment);
    }
    
    @Override
    public MotorJointDef set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<MotorJointDef> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<MotorJointDef> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new MotorJointDef(segment),
            count
        );
    }
    
    public static NativeStructArray<MotorJointDef> array(Arena arena, MotorJointDef... structs) {
        NativeStructArray<MotorJointDef> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new MotorJointDef(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<MotorJointDef> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new MotorJointDef(segment)
        );
    }
    
}