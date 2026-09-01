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
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

/// ```
/// Wheel joint definition
/// Body A is the chassis and body B is the wheel.
/// The wheel rotates around the local z-axis in frame B.
/// The wheel translates along the local x-axis in frame A.
/// The wheel can optionally steer along the x-axis in frame A.
/// @ingroup wheel_joint
/// ```
public final class WheelJointDef
		implements Struct<WheelJointDef> {

    private static final LazyConstant<MethodHandle> B3_DEFAULT_WHEEL_JOINT_DEF;

    public static final StructLayout LAYOUT;

    public static final VarHandle ENABLE_SUSPENSION_SPRING_HANDLE;
    public static final VarHandle SUSPENSION_HERTZ_HANDLE;
    public static final VarHandle SUSPENSION_DAMPING_RATIO_HANDLE;
    public static final VarHandle ENABLE_SUSPENSION_LIMIT_HANDLE;
    public static final VarHandle LOWER_SUSPENSION_LIMIT_HANDLE;
    public static final VarHandle UPPER_SUSPENSION_LIMIT_HANDLE;
    public static final VarHandle ENABLE_SPIN_MOTOR_HANDLE;
    public static final VarHandle MAX_SPIN_TORQUE_HANDLE;
    public static final VarHandle SPIN_SPEED_HANDLE;
    public static final VarHandle ENABLE_STEERING_HANDLE;
    public static final VarHandle STEERING_HERTZ_HANDLE;
    public static final VarHandle STEERING_DAMPING_RATIO_HANDLE;
    public static final VarHandle TARGET_STEERING_ANGLE_HANDLE;
    public static final VarHandle MAX_STEERING_TORQUE_HANDLE;
    public static final VarHandle ENABLE_STEERING_LIMIT_HANDLE;
    public static final VarHandle LOWER_STEERING_LIMIT_HANDLE;
    public static final VarHandle UPPER_STEERING_LIMIT_HANDLE;

    public static final long BASE_BYTE_OFFSET;
    public static final long ENABLE_SUSPENSION_SPRING_BYTE_OFFSET;
    public static final long SUSPENSION_HERTZ_BYTE_OFFSET;
    public static final long SUSPENSION_DAMPING_RATIO_BYTE_OFFSET;
    public static final long ENABLE_SUSPENSION_LIMIT_BYTE_OFFSET;
    public static final long LOWER_SUSPENSION_LIMIT_BYTE_OFFSET;
    public static final long UPPER_SUSPENSION_LIMIT_BYTE_OFFSET;
    public static final long ENABLE_SPIN_MOTOR_BYTE_OFFSET;
    public static final long MAX_SPIN_TORQUE_BYTE_OFFSET;
    public static final long SPIN_SPEED_BYTE_OFFSET;
    public static final long ENABLE_STEERING_BYTE_OFFSET;
    public static final long STEERING_HERTZ_BYTE_OFFSET;
    public static final long STEERING_DAMPING_RATIO_BYTE_OFFSET;
    public static final long TARGET_STEERING_ANGLE_BYTE_OFFSET;
    public static final long MAX_STEERING_TORQUE_BYTE_OFFSET;
    public static final long ENABLE_STEERING_LIMIT_BYTE_OFFSET;
    public static final long LOWER_STEERING_LIMIT_BYTE_OFFSET;
    public static final long UPPER_STEERING_LIMIT_BYTE_OFFSET;

    private final MemorySegment segment;

    private final JointDef base;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JointDef.LAYOUT.withName("base"),
            JAVA_BOOLEAN.withName("enableSuspensionSpring"),
            MemoryLayout.paddingLayout(3),
            JAVA_FLOAT.withName("suspensionHertz"),
            JAVA_FLOAT.withName("suspensionDampingRatio"),
            JAVA_BOOLEAN.withName("enableSuspensionLimit"),
            MemoryLayout.paddingLayout(3),
            JAVA_FLOAT.withName("lowerSuspensionLimit"),
            JAVA_FLOAT.withName("upperSuspensionLimit"),
            JAVA_BOOLEAN.withName("enableSpinMotor"),
            MemoryLayout.paddingLayout(3),
            JAVA_FLOAT.withName("maxSpinTorque"),
            JAVA_FLOAT.withName("spinSpeed"),
            JAVA_BOOLEAN.withName("enableSteering"),
            MemoryLayout.paddingLayout(3),
            JAVA_FLOAT.withName("steeringHertz"),
            JAVA_FLOAT.withName("steeringDampingRatio"),
            JAVA_FLOAT.withName("targetSteeringAngle"),
            JAVA_FLOAT.withName("maxSteeringTorque"),
            JAVA_BOOLEAN.withName("enableSteeringLimit"),
            MemoryLayout.paddingLayout(3),
            JAVA_FLOAT.withName("lowerSteeringLimit"),
            JAVA_FLOAT.withName("upperSteeringLimit"),
            MemoryLayout.paddingLayout(4)
        ).withName("b3WheelJointDef").withByteAlignment(8);
        
        B3_DEFAULT_WHEEL_JOINT_DEF = downcallHandle("b3DefaultWheelJointDef", WheelJointDef.LAYOUT);
        
        ENABLE_SUSPENSION_SPRING_HANDLE = LAYOUT.varHandle(PathElement.groupElement("enableSuspensionSpring"));
        SUSPENSION_HERTZ_HANDLE = LAYOUT.varHandle(PathElement.groupElement("suspensionHertz"));
        SUSPENSION_DAMPING_RATIO_HANDLE = LAYOUT.varHandle(PathElement.groupElement("suspensionDampingRatio"));
        ENABLE_SUSPENSION_LIMIT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("enableSuspensionLimit"));
        LOWER_SUSPENSION_LIMIT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("lowerSuspensionLimit"));
        UPPER_SUSPENSION_LIMIT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("upperSuspensionLimit"));
        ENABLE_SPIN_MOTOR_HANDLE = LAYOUT.varHandle(PathElement.groupElement("enableSpinMotor"));
        MAX_SPIN_TORQUE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxSpinTorque"));
        SPIN_SPEED_HANDLE = LAYOUT.varHandle(PathElement.groupElement("spinSpeed"));
        ENABLE_STEERING_HANDLE = LAYOUT.varHandle(PathElement.groupElement("enableSteering"));
        STEERING_HERTZ_HANDLE = LAYOUT.varHandle(PathElement.groupElement("steeringHertz"));
        STEERING_DAMPING_RATIO_HANDLE = LAYOUT.varHandle(PathElement.groupElement("steeringDampingRatio"));
        TARGET_STEERING_ANGLE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("targetSteeringAngle"));
        MAX_STEERING_TORQUE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxSteeringTorque"));
        ENABLE_STEERING_LIMIT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("enableSteeringLimit"));
        LOWER_STEERING_LIMIT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("lowerSteeringLimit"));
        UPPER_STEERING_LIMIT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("upperSteeringLimit"));
        
        BASE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("base"));
        ENABLE_SUSPENSION_SPRING_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("enableSuspensionSpring"));
        SUSPENSION_HERTZ_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("suspensionHertz"));
        SUSPENSION_DAMPING_RATIO_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("suspensionDampingRatio"));
        ENABLE_SUSPENSION_LIMIT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("enableSuspensionLimit"));
        LOWER_SUSPENSION_LIMIT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("lowerSuspensionLimit"));
        UPPER_SUSPENSION_LIMIT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("upperSuspensionLimit"));
        ENABLE_SPIN_MOTOR_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("enableSpinMotor"));
        MAX_SPIN_TORQUE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxSpinTorque"));
        SPIN_SPEED_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("spinSpeed"));
        ENABLE_STEERING_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("enableSteering"));
        STEERING_HERTZ_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("steeringHertz"));
        STEERING_DAMPING_RATIO_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("steeringDampingRatio"));
        TARGET_STEERING_ANGLE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("targetSteeringAngle"));
        MAX_STEERING_TORQUE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxSteeringTorque"));
        ENABLE_STEERING_LIMIT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("enableSteeringLimit"));
        LOWER_STEERING_LIMIT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("lowerSteeringLimit"));
        UPPER_STEERING_LIMIT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("upperSteeringLimit"));
        //@formatter:on
    }

    public WheelJointDef() {
        this(Arena.ofAuto());
    }
    
    public WheelJointDef(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public WheelJointDef(MemorySegment segment) {
        this.segment = segment;
    
        base = new JointDef(segment.asSlice(BASE_BYTE_OFFSET, JointDef.LAYOUT));
    }

    /// ```
    /// Use this to initialize your joint definition
    /// @ingroup wheel_joint
    /// ```
    public static MemorySegment ndefaultWheelJointDef(
    	SegmentAllocator allocator
    ) {
    	MethodHandle method = B3_DEFAULT_WHEEL_JOINT_DEF.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ndefaultWheelJointDef].
    public final @Nullable WheelJointDef defaultWheelJointDef(
    	SegmentAllocator allocator
    ) {
    	MemorySegment segment = ndefaultWheelJointDef(
    		allocator
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new WheelJointDef(segment);
    }
    
    /// @see #enableSuspensionSpring()
    public WheelJointDef enableSuspensionSpring(boolean enableSuspensionSpring) {
    	ENABLE_SUSPENSION_SPRING_HANDLE.set(segment, 0L, enableSuspensionSpring);
    	return this;
    }
    
    /// ```
    /// Enable a linear spring along the local axis
    /// ```
    public boolean enableSuspensionSpring() {
    	return (boolean) ENABLE_SUSPENSION_SPRING_HANDLE.get(segment, 0L);
    }
    
    /// @see #suspensionHertz()
    public WheelJointDef suspensionHertz(float suspensionHertz) {
    	SUSPENSION_HERTZ_HANDLE.set(segment, 0L, suspensionHertz);
    	return this;
    }
    
    /// ```
    /// Spring stiffness in Hertz
    /// ```
    public float suspensionHertz() {
    	return (float) SUSPENSION_HERTZ_HANDLE.get(segment, 0L);
    }
    
    /// @see #suspensionDampingRatio()
    public WheelJointDef suspensionDampingRatio(float suspensionDampingRatio) {
    	SUSPENSION_DAMPING_RATIO_HANDLE.set(segment, 0L, suspensionDampingRatio);
    	return this;
    }
    
    /// ```
    /// Spring damping ratio, non-dimensional
    /// ```
    public float suspensionDampingRatio() {
    	return (float) SUSPENSION_DAMPING_RATIO_HANDLE.get(segment, 0L);
    }
    
    /// @see #enableSuspensionLimit()
    public WheelJointDef enableSuspensionLimit(boolean enableSuspensionLimit) {
    	ENABLE_SUSPENSION_LIMIT_HANDLE.set(segment, 0L, enableSuspensionLimit);
    	return this;
    }
    
    /// ```
    /// Enable/disable the joint linear limit
    /// ```
    public boolean enableSuspensionLimit() {
    	return (boolean) ENABLE_SUSPENSION_LIMIT_HANDLE.get(segment, 0L);
    }
    
    /// @see #lowerSuspensionLimit()
    public WheelJointDef lowerSuspensionLimit(float lowerSuspensionLimit) {
    	LOWER_SUSPENSION_LIMIT_HANDLE.set(segment, 0L, lowerSuspensionLimit);
    	return this;
    }
    
    /// ```
    /// The lower suspension translation limit
    /// ```
    public float lowerSuspensionLimit() {
    	return (float) LOWER_SUSPENSION_LIMIT_HANDLE.get(segment, 0L);
    }
    
    /// @see #upperSuspensionLimit()
    public WheelJointDef upperSuspensionLimit(float upperSuspensionLimit) {
    	UPPER_SUSPENSION_LIMIT_HANDLE.set(segment, 0L, upperSuspensionLimit);
    	return this;
    }
    
    /// ```
    /// The upper translation limit
    /// ```
    public float upperSuspensionLimit() {
    	return (float) UPPER_SUSPENSION_LIMIT_HANDLE.get(segment, 0L);
    }
    
    /// @see #enableSpinMotor()
    public WheelJointDef enableSpinMotor(boolean enableSpinMotor) {
    	ENABLE_SPIN_MOTOR_HANDLE.set(segment, 0L, enableSpinMotor);
    	return this;
    }
    
    /// ```
    /// Enable/disable the joint rotational motor
    /// ```
    public boolean enableSpinMotor() {
    	return (boolean) ENABLE_SPIN_MOTOR_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxSpinTorque()
    public WheelJointDef maxSpinTorque(float maxSpinTorque) {
    	MAX_SPIN_TORQUE_HANDLE.set(segment, 0L, maxSpinTorque);
    	return this;
    }
    
    /// ```
    /// The maximum motor torque, typically in newton-meters
    /// ```
    public float maxSpinTorque() {
    	return (float) MAX_SPIN_TORQUE_HANDLE.get(segment, 0L);
    }
    
    /// @see #spinSpeed()
    public WheelJointDef spinSpeed(float spinSpeed) {
    	SPIN_SPEED_HANDLE.set(segment, 0L, spinSpeed);
    	return this;
    }
    
    /// ```
    /// The desired motor speed in radians per second
    /// ```
    public float spinSpeed() {
    	return (float) SPIN_SPEED_HANDLE.get(segment, 0L);
    }
    
    /// @see #enableSteering()
    public WheelJointDef enableSteering(boolean enableSteering) {
    	ENABLE_STEERING_HANDLE.set(segment, 0L, enableSteering);
    	return this;
    }
    
    /// ```
    /// Enable steering, otherwise the steering is fixed forward
    /// ```
    public boolean enableSteering() {
    	return (boolean) ENABLE_STEERING_HANDLE.get(segment, 0L);
    }
    
    /// @see #steeringHertz()
    public WheelJointDef steeringHertz(float steeringHertz) {
    	STEERING_HERTZ_HANDLE.set(segment, 0L, steeringHertz);
    	return this;
    }
    
    /// ```
    /// Steering stiffness in Hertz
    /// ```
    public float steeringHertz() {
    	return (float) STEERING_HERTZ_HANDLE.get(segment, 0L);
    }
    
    /// @see #steeringDampingRatio()
    public WheelJointDef steeringDampingRatio(float steeringDampingRatio) {
    	STEERING_DAMPING_RATIO_HANDLE.set(segment, 0L, steeringDampingRatio);
    	return this;
    }
    
    /// ```
    /// Spring damping ratio, non-dimensional
    /// ```
    public float steeringDampingRatio() {
    	return (float) STEERING_DAMPING_RATIO_HANDLE.get(segment, 0L);
    }
    
    /// @see #targetSteeringAngle()
    public WheelJointDef targetSteeringAngle(float targetSteeringAngle) {
    	TARGET_STEERING_ANGLE_HANDLE.set(segment, 0L, targetSteeringAngle);
    	return this;
    }
    
    /// ```
    /// The target steering angle in radians
    /// ```
    public float targetSteeringAngle() {
    	return (float) TARGET_STEERING_ANGLE_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxSteeringTorque()
    public WheelJointDef maxSteeringTorque(float maxSteeringTorque) {
    	MAX_STEERING_TORQUE_HANDLE.set(segment, 0L, maxSteeringTorque);
    	return this;
    }
    
    /// ```
    /// The maximum steering torque in N*m
    /// ```
    public float maxSteeringTorque() {
    	return (float) MAX_STEERING_TORQUE_HANDLE.get(segment, 0L);
    }
    
    /// @see #enableSteeringLimit()
    public WheelJointDef enableSteeringLimit(boolean enableSteeringLimit) {
    	ENABLE_STEERING_LIMIT_HANDLE.set(segment, 0L, enableSteeringLimit);
    	return this;
    }
    
    /// ```
    /// Enable/disable the steering angular limit
    /// ```
    public boolean enableSteeringLimit() {
    	return (boolean) ENABLE_STEERING_LIMIT_HANDLE.get(segment, 0L);
    }
    
    /// @see #lowerSteeringLimit()
    public WheelJointDef lowerSteeringLimit(float lowerSteeringLimit) {
    	LOWER_STEERING_LIMIT_HANDLE.set(segment, 0L, lowerSteeringLimit);
    	return this;
    }
    
    /// ```
    /// The lower steering angle in radians
    /// ```
    public float lowerSteeringLimit() {
    	return (float) LOWER_STEERING_LIMIT_HANDLE.get(segment, 0L);
    }
    
    /// @see #upperSteeringLimit()
    public WheelJointDef upperSteeringLimit(float upperSteeringLimit) {
    	UPPER_STEERING_LIMIT_HANDLE.set(segment, 0L, upperSteeringLimit);
    	return this;
    }
    
    /// ```
    /// The upper steering angle in radians
    /// ```
    public float upperSteeringLimit() {
    	return (float) UPPER_STEERING_LIMIT_HANDLE.get(segment, 0L);
    }
    
    /// @see #base()
    public WheelJointDef base(Consumer<JointDef> consumer) {
    	consumer.accept(base);
    	return this;
    }
    
    /// @see #base()
    public WheelJointDef base(JointDef other) {
    	base.set(other);
    	return this;
    }
    
    /// ```
    /// Base joint definition
    /// ```
    public JointDef base() {
    	return base;
    }
    
    @Override
    public WheelJointDef set(WheelJointDef other) {
        return set(other.segment);
    }
    
    @Override
    public WheelJointDef set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<WheelJointDef> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<WheelJointDef> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new WheelJointDef(segment),
            count
        );
    }
    
    public static NativeStructArray<WheelJointDef> array(Arena arena, WheelJointDef... structs) {
        NativeStructArray<WheelJointDef> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new WheelJointDef(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<WheelJointDef> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new WheelJointDef(segment)
        );
    }
    
}