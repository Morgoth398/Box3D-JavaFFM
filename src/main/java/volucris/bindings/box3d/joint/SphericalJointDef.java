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
import volucris.bindings.box3d.math.Quat;
import volucris.bindings.box3d.math.Vec3;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

/// ```
/// Spherical joint definition. A point on body B is fixed to a point on body A.
/// Allows rotation about the shared point.
/// @ingroup spherical_joint
/// ```
public final class SphericalJointDef
		implements Struct<SphericalJointDef> {

    private static final LazyConstant<MethodHandle> B3_DEFAULT_SPHERICAL_JOINT_DEF;

    public static final StructLayout LAYOUT;

    public static final VarHandle ENABLE_SPRING_HANDLE;
    public static final VarHandle HERTZ_HANDLE;
    public static final VarHandle DAMPING_RATIO_HANDLE;
    public static final VarHandle ENABLE_CONE_LIMIT_HANDLE;
    public static final VarHandle CONE_ANGLE_HANDLE;
    public static final VarHandle ENABLE_TWIST_LIMIT_HANDLE;
    public static final VarHandle LOWER_TWIST_ANGLE_HANDLE;
    public static final VarHandle UPPER_TWIST_ANGLE_HANDLE;
    public static final VarHandle ENABLE_MOTOR_HANDLE;
    public static final VarHandle MAX_MOTOR_TORQUE_HANDLE;

    public static final long BASE_BYTE_OFFSET;
    public static final long ENABLE_SPRING_BYTE_OFFSET;
    public static final long HERTZ_BYTE_OFFSET;
    public static final long DAMPING_RATIO_BYTE_OFFSET;
    public static final long TARGET_ROTATION_BYTE_OFFSET;
    public static final long ENABLE_CONE_LIMIT_BYTE_OFFSET;
    public static final long CONE_ANGLE_BYTE_OFFSET;
    public static final long ENABLE_TWIST_LIMIT_BYTE_OFFSET;
    public static final long LOWER_TWIST_ANGLE_BYTE_OFFSET;
    public static final long UPPER_TWIST_ANGLE_BYTE_OFFSET;
    public static final long ENABLE_MOTOR_BYTE_OFFSET;
    public static final long MAX_MOTOR_TORQUE_BYTE_OFFSET;
    public static final long MOTOR_VELOCITY_BYTE_OFFSET;

    private final MemorySegment segment;

    private final JointDef base;
    private final Quat targetRotation;
    private final Vec3 motorVelocity;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JointDef.LAYOUT.withName("base"),
            JAVA_BOOLEAN.withName("enableSpring"),
            MemoryLayout.paddingLayout(3),
            JAVA_FLOAT.withName("hertz"),
            JAVA_FLOAT.withName("dampingRatio"),
            Quat.LAYOUT.withName("targetRotation"),
            JAVA_BOOLEAN.withName("enableConeLimit"),
            MemoryLayout.paddingLayout(3),
            JAVA_FLOAT.withName("coneAngle"),
            JAVA_BOOLEAN.withName("enableTwistLimit"),
            MemoryLayout.paddingLayout(3),
            JAVA_FLOAT.withName("lowerTwistAngle"),
            JAVA_FLOAT.withName("upperTwistAngle"),
            JAVA_BOOLEAN.withName("enableMotor"),
            MemoryLayout.paddingLayout(3),
            JAVA_FLOAT.withName("maxMotorTorque"),
            Vec3.LAYOUT.withName("motorVelocity"),
            MemoryLayout.paddingLayout(4)
        ).withName("b3SphericalJointDef").withByteAlignment(8);
        
        B3_DEFAULT_SPHERICAL_JOINT_DEF = downcallHandle("b3DefaultSphericalJointDef", SphericalJointDef.LAYOUT);
        
        ENABLE_SPRING_HANDLE = LAYOUT.varHandle(PathElement.groupElement("enableSpring"));
        HERTZ_HANDLE = LAYOUT.varHandle(PathElement.groupElement("hertz"));
        DAMPING_RATIO_HANDLE = LAYOUT.varHandle(PathElement.groupElement("dampingRatio"));
        ENABLE_CONE_LIMIT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("enableConeLimit"));
        CONE_ANGLE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("coneAngle"));
        ENABLE_TWIST_LIMIT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("enableTwistLimit"));
        LOWER_TWIST_ANGLE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("lowerTwistAngle"));
        UPPER_TWIST_ANGLE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("upperTwistAngle"));
        ENABLE_MOTOR_HANDLE = LAYOUT.varHandle(PathElement.groupElement("enableMotor"));
        MAX_MOTOR_TORQUE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxMotorTorque"));
        
        BASE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("base"));
        ENABLE_SPRING_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("enableSpring"));
        HERTZ_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("hertz"));
        DAMPING_RATIO_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("dampingRatio"));
        TARGET_ROTATION_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("targetRotation"));
        ENABLE_CONE_LIMIT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("enableConeLimit"));
        CONE_ANGLE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("coneAngle"));
        ENABLE_TWIST_LIMIT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("enableTwistLimit"));
        LOWER_TWIST_ANGLE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("lowerTwistAngle"));
        UPPER_TWIST_ANGLE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("upperTwistAngle"));
        ENABLE_MOTOR_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("enableMotor"));
        MAX_MOTOR_TORQUE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxMotorTorque"));
        MOTOR_VELOCITY_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("motorVelocity"));
        //@formatter:on
    }

    public SphericalJointDef() {
        this(Arena.ofAuto());
    }
    
    public SphericalJointDef(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public SphericalJointDef(MemorySegment segment) {
        this.segment = segment;
    
        base = new JointDef(segment.asSlice(BASE_BYTE_OFFSET, JointDef.LAYOUT));
        targetRotation = new Quat(segment.asSlice(TARGET_ROTATION_BYTE_OFFSET, Quat.LAYOUT));
        motorVelocity = new Vec3(segment.asSlice(MOTOR_VELOCITY_BYTE_OFFSET, Vec3.LAYOUT));
    }

    /// ```
    /// Use this to initialize your joint definition.
    /// @ingroup spherical_joint
    /// ```
    public static MemorySegment ndefaultSphericalJointDef(
    	SegmentAllocator allocator
    ) {
    	MethodHandle method = B3_DEFAULT_SPHERICAL_JOINT_DEF.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ndefaultSphericalJointDef].
    public final @Nullable SphericalJointDef defaultSphericalJointDef(
    	SegmentAllocator allocator
    ) {
    	MemorySegment segment = ndefaultSphericalJointDef(
    		allocator
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new SphericalJointDef(segment);
    }
    
    /// @see #enableSpring()
    public SphericalJointDef enableSpring(boolean enableSpring) {
    	ENABLE_SPRING_HANDLE.set(segment, 0L, enableSpring);
    	return this;
    }
    
    /// ```
    /// Enable a rotational spring that attempts to align the two joint frames.
    /// ```
    public boolean enableSpring() {
    	return (boolean) ENABLE_SPRING_HANDLE.get(segment, 0L);
    }
    
    /// @see #hertz()
    public SphericalJointDef hertz(float hertz) {
    	HERTZ_HANDLE.set(segment, 0L, hertz);
    	return this;
    }
    
    /// ```
    /// The spring stiffness Hertz, cycles per second. This may be clamped internally
    /// according to the time step to maintain stability. Non-negative number.
    /// ```
    public float hertz() {
    	return (float) HERTZ_HANDLE.get(segment, 0L);
    }
    
    /// @see #dampingRatio()
    public SphericalJointDef dampingRatio(float dampingRatio) {
    	DAMPING_RATIO_HANDLE.set(segment, 0L, dampingRatio);
    	return this;
    }
    
    /// ```
    /// The spring damping ratio, non-dimensional. Non-negative number.
    /// ```
    public float dampingRatio() {
    	return (float) DAMPING_RATIO_HANDLE.get(segment, 0L);
    }
    
    /// @see #enableConeLimit()
    public SphericalJointDef enableConeLimit(boolean enableConeLimit) {
    	ENABLE_CONE_LIMIT_HANDLE.set(segment, 0L, enableConeLimit);
    	return this;
    }
    
    /// ```
    /// A flag to enable the cone limit. The cone is centered on the frameA z-axis.
    /// ```
    public boolean enableConeLimit() {
    	return (boolean) ENABLE_CONE_LIMIT_HANDLE.get(segment, 0L);
    }
    
    /// @see #coneAngle()
    public SphericalJointDef coneAngle(float coneAngle) {
    	CONE_ANGLE_HANDLE.set(segment, 0L, coneAngle);
    	return this;
    }
    
    /// ```
    /// The angle for the cone limit in radians. Valid range is [0, pi]
    /// ```
    public float coneAngle() {
    	return (float) CONE_ANGLE_HANDLE.get(segment, 0L);
    }
    
    /// @see #enableTwistLimit()
    public SphericalJointDef enableTwistLimit(boolean enableTwistLimit) {
    	ENABLE_TWIST_LIMIT_HANDLE.set(segment, 0L, enableTwistLimit);
    	return this;
    }
    
    /// ```
    /// A flag to enable the twist limit. The twist is centered on the frameB z-axis.
    /// ```
    public boolean enableTwistLimit() {
    	return (boolean) ENABLE_TWIST_LIMIT_HANDLE.get(segment, 0L);
    }
    
    /// @see #lowerTwistAngle()
    public SphericalJointDef lowerTwistAngle(float lowerTwistAngle) {
    	LOWER_TWIST_ANGLE_HANDLE.set(segment, 0L, lowerTwistAngle);
    	return this;
    }
    
    /// ```
    /// The angle for the lower twist limit in radians. Minimum of -0.99*pi radians.
    /// ```
    public float lowerTwistAngle() {
    	return (float) LOWER_TWIST_ANGLE_HANDLE.get(segment, 0L);
    }
    
    /// @see #upperTwistAngle()
    public SphericalJointDef upperTwistAngle(float upperTwistAngle) {
    	UPPER_TWIST_ANGLE_HANDLE.set(segment, 0L, upperTwistAngle);
    	return this;
    }
    
    /// ```
    /// The angle for the upper twist limit in radians. Maximum of 0.99*pi radians.
    /// ```
    public float upperTwistAngle() {
    	return (float) UPPER_TWIST_ANGLE_HANDLE.get(segment, 0L);
    }
    
    /// @see #enableMotor()
    public SphericalJointDef enableMotor(boolean enableMotor) {
    	ENABLE_MOTOR_HANDLE.set(segment, 0L, enableMotor);
    	return this;
    }
    
    /// ```
    /// A flag to enable the joint motor
    /// ```
    public boolean enableMotor() {
    	return (boolean) ENABLE_MOTOR_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxMotorTorque()
    public SphericalJointDef maxMotorTorque(float maxMotorTorque) {
    	MAX_MOTOR_TORQUE_HANDLE.set(segment, 0L, maxMotorTorque);
    	return this;
    }
    
    /// ```
    /// The maximum motor torque, typically in newton-meters. Non-negative number.
    /// ```
    public float maxMotorTorque() {
    	return (float) MAX_MOTOR_TORQUE_HANDLE.get(segment, 0L);
    }
    
    /// @see #base()
    public SphericalJointDef base(Consumer<JointDef> consumer) {
    	consumer.accept(base);
    	return this;
    }
    
    /// @see #base()
    public SphericalJointDef base(JointDef other) {
    	base.set(other);
    	return this;
    }
    
    /// ```
    /// Base joint definition
    /// ```
    public JointDef base() {
    	return base;
    }
    
    /// @see #targetRotation()
    public SphericalJointDef targetRotation(Consumer<Quat> consumer) {
    	consumer.accept(targetRotation);
    	return this;
    }
    
    /// @see #targetRotation()
    public SphericalJointDef targetRotation(Quat other) {
    	targetRotation.set(other);
    	return this;
    }
    
    /// ```
    /// Target spring rotation, joint frame B relative to joint frame A.
    /// ```
    public Quat targetRotation() {
    	return targetRotation;
    }
    
    /// @see #motorVelocity()
    public SphericalJointDef motorVelocity(Consumer<Vec3> consumer) {
    	consumer.accept(motorVelocity);
    	return this;
    }
    
    /// @see #motorVelocity()
    public SphericalJointDef motorVelocity(Vec3 other) {
    	motorVelocity.set(other);
    	return this;
    }
    
    /// ```
    /// The desired motor angular velocity in radians per second.
    /// ```
    public Vec3 motorVelocity() {
    	return motorVelocity;
    }
    
    @Override
    public SphericalJointDef set(SphericalJointDef other) {
        return set(other.segment);
    }
    
    @Override
    public SphericalJointDef set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<SphericalJointDef> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<SphericalJointDef> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new SphericalJointDef(segment),
            count
        );
    }
    
    public static NativeStructArray<SphericalJointDef> array(Arena arena, SphericalJointDef... structs) {
        NativeStructArray<SphericalJointDef> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new SphericalJointDef(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<SphericalJointDef> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new SphericalJointDef(segment)
        );
    }
    
}