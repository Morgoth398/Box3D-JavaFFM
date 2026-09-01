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
/// Revolute joint definition. A point on body B is fixed to a point on body A.
/// Allows relative rotation about the z-axis.
/// @ingroup revolute_joint
/// ```
public final class RevoluteJointDef
		implements Struct<RevoluteJointDef> {

    private static final LazyConstant<MethodHandle> B3_DEFAULT_REVOLUTE_JOINT_DEF;

    public static final StructLayout LAYOUT;

    public static final VarHandle TARGET_ANGLE_HANDLE;
    public static final VarHandle ENABLE_SPRING_HANDLE;
    public static final VarHandle HERTZ_HANDLE;
    public static final VarHandle DAMPING_RATIO_HANDLE;
    public static final VarHandle ENABLE_LIMIT_HANDLE;
    public static final VarHandle LOWER_ANGLE_HANDLE;
    public static final VarHandle UPPER_ANGLE_HANDLE;
    public static final VarHandle ENABLE_MOTOR_HANDLE;
    public static final VarHandle MAX_MOTOR_TORQUE_HANDLE;
    public static final VarHandle MOTOR_SPEED_HANDLE;

    public static final long BASE_BYTE_OFFSET;
    public static final long TARGET_ANGLE_BYTE_OFFSET;
    public static final long ENABLE_SPRING_BYTE_OFFSET;
    public static final long HERTZ_BYTE_OFFSET;
    public static final long DAMPING_RATIO_BYTE_OFFSET;
    public static final long ENABLE_LIMIT_BYTE_OFFSET;
    public static final long LOWER_ANGLE_BYTE_OFFSET;
    public static final long UPPER_ANGLE_BYTE_OFFSET;
    public static final long ENABLE_MOTOR_BYTE_OFFSET;
    public static final long MAX_MOTOR_TORQUE_BYTE_OFFSET;
    public static final long MOTOR_SPEED_BYTE_OFFSET;

    private final MemorySegment segment;

    private final JointDef base;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JointDef.LAYOUT.withName("base"),
            JAVA_FLOAT.withName("targetAngle"),
            JAVA_BOOLEAN.withName("enableSpring"),
            MemoryLayout.paddingLayout(3),
            JAVA_FLOAT.withName("hertz"),
            JAVA_FLOAT.withName("dampingRatio"),
            JAVA_BOOLEAN.withName("enableLimit"),
            MemoryLayout.paddingLayout(3),
            JAVA_FLOAT.withName("lowerAngle"),
            JAVA_FLOAT.withName("upperAngle"),
            JAVA_BOOLEAN.withName("enableMotor"),
            MemoryLayout.paddingLayout(3),
            JAVA_FLOAT.withName("maxMotorTorque"),
            JAVA_FLOAT.withName("motorSpeed")
        ).withName("b3RevoluteJointDef").withByteAlignment(8);
        
        B3_DEFAULT_REVOLUTE_JOINT_DEF = downcallHandle("b3DefaultRevoluteJointDef", RevoluteJointDef.LAYOUT);
        
        TARGET_ANGLE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("targetAngle"));
        ENABLE_SPRING_HANDLE = LAYOUT.varHandle(PathElement.groupElement("enableSpring"));
        HERTZ_HANDLE = LAYOUT.varHandle(PathElement.groupElement("hertz"));
        DAMPING_RATIO_HANDLE = LAYOUT.varHandle(PathElement.groupElement("dampingRatio"));
        ENABLE_LIMIT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("enableLimit"));
        LOWER_ANGLE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("lowerAngle"));
        UPPER_ANGLE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("upperAngle"));
        ENABLE_MOTOR_HANDLE = LAYOUT.varHandle(PathElement.groupElement("enableMotor"));
        MAX_MOTOR_TORQUE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxMotorTorque"));
        MOTOR_SPEED_HANDLE = LAYOUT.varHandle(PathElement.groupElement("motorSpeed"));
        
        BASE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("base"));
        TARGET_ANGLE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("targetAngle"));
        ENABLE_SPRING_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("enableSpring"));
        HERTZ_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("hertz"));
        DAMPING_RATIO_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("dampingRatio"));
        ENABLE_LIMIT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("enableLimit"));
        LOWER_ANGLE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("lowerAngle"));
        UPPER_ANGLE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("upperAngle"));
        ENABLE_MOTOR_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("enableMotor"));
        MAX_MOTOR_TORQUE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxMotorTorque"));
        MOTOR_SPEED_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("motorSpeed"));
        //@formatter:on
    }

    public RevoluteJointDef() {
        this(Arena.ofAuto());
    }
    
    public RevoluteJointDef(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public RevoluteJointDef(MemorySegment segment) {
        this.segment = segment;
    
        base = new JointDef(segment.asSlice(BASE_BYTE_OFFSET, JointDef.LAYOUT));
    }

    /// ```
    /// Use this to initialize your joint definition.
    /// @ingroup revolute_joint
    /// ```
    public static MemorySegment ndefaultRevoluteJointDef(
    	SegmentAllocator allocator
    ) {
    	MethodHandle method = B3_DEFAULT_REVOLUTE_JOINT_DEF.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ndefaultRevoluteJointDef].
    public final @Nullable RevoluteJointDef defaultRevoluteJointDef(
    	SegmentAllocator allocator
    ) {
    	MemorySegment segment = ndefaultRevoluteJointDef(
    		allocator
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new RevoluteJointDef(segment);
    }
    
    /// @see #targetAngle()
    public RevoluteJointDef targetAngle(float targetAngle) {
    	TARGET_ANGLE_HANDLE.set(segment, 0L, targetAngle);
    	return this;
    }
    
    /// ```
    /// The bodyB angle minus bodyA angle in the reference state (radians).
    /// This defines the zero angle for the joint limit.
    /// ```
    public float targetAngle() {
    	return (float) TARGET_ANGLE_HANDLE.get(segment, 0L);
    }
    
    /// @see #enableSpring()
    public RevoluteJointDef enableSpring(boolean enableSpring) {
    	ENABLE_SPRING_HANDLE.set(segment, 0L, enableSpring);
    	return this;
    }
    
    /// ```
    /// Enable a rotational spring on the revolute hinge axis.
    /// ```
    public boolean enableSpring() {
    	return (boolean) ENABLE_SPRING_HANDLE.get(segment, 0L);
    }
    
    /// @see #hertz()
    public RevoluteJointDef hertz(float hertz) {
    	HERTZ_HANDLE.set(segment, 0L, hertz);
    	return this;
    }
    
    /// ```
    /// The spring stiffness Hertz, cycles per second.
    /// ```
    public float hertz() {
    	return (float) HERTZ_HANDLE.get(segment, 0L);
    }
    
    /// @see #dampingRatio()
    public RevoluteJointDef dampingRatio(float dampingRatio) {
    	DAMPING_RATIO_HANDLE.set(segment, 0L, dampingRatio);
    	return this;
    }
    
    /// ```
    /// The spring damping ratio, non-dimensional.
    /// ```
    public float dampingRatio() {
    	return (float) DAMPING_RATIO_HANDLE.get(segment, 0L);
    }
    
    /// @see #enableLimit()
    public RevoluteJointDef enableLimit(boolean enableLimit) {
    	ENABLE_LIMIT_HANDLE.set(segment, 0L, enableLimit);
    	return this;
    }
    
    /// ```
    /// A flag to enable joint limits.
    /// ```
    public boolean enableLimit() {
    	return (boolean) ENABLE_LIMIT_HANDLE.get(segment, 0L);
    }
    
    /// @see #lowerAngle()
    public RevoluteJointDef lowerAngle(float lowerAngle) {
    	LOWER_ANGLE_HANDLE.set(segment, 0L, lowerAngle);
    	return this;
    }
    
    /// ```
    /// The lower angle for the joint limit in radians. Minimum of -0.99*pi radians.
    /// ```
    public float lowerAngle() {
    	return (float) LOWER_ANGLE_HANDLE.get(segment, 0L);
    }
    
    /// @see #upperAngle()
    public RevoluteJointDef upperAngle(float upperAngle) {
    	UPPER_ANGLE_HANDLE.set(segment, 0L, upperAngle);
    	return this;
    }
    
    /// ```
    /// The upper angle for the joint limit in radians. Maximum of 0.99*pi radians.
    /// ```
    public float upperAngle() {
    	return (float) UPPER_ANGLE_HANDLE.get(segment, 0L);
    }
    
    /// @see #enableMotor()
    public RevoluteJointDef enableMotor(boolean enableMotor) {
    	ENABLE_MOTOR_HANDLE.set(segment, 0L, enableMotor);
    	return this;
    }
    
    /// ```
    /// A flag to enable the joint motor.
    /// ```
    public boolean enableMotor() {
    	return (boolean) ENABLE_MOTOR_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxMotorTorque()
    public RevoluteJointDef maxMotorTorque(float maxMotorTorque) {
    	MAX_MOTOR_TORQUE_HANDLE.set(segment, 0L, maxMotorTorque);
    	return this;
    }
    
    /// ```
    /// The maximum motor torque, typically in newton-meters.
    /// ```
    public float maxMotorTorque() {
    	return (float) MAX_MOTOR_TORQUE_HANDLE.get(segment, 0L);
    }
    
    /// @see #motorSpeed()
    public RevoluteJointDef motorSpeed(float motorSpeed) {
    	MOTOR_SPEED_HANDLE.set(segment, 0L, motorSpeed);
    	return this;
    }
    
    /// ```
    /// The desired motor speed in radians per second.
    /// ```
    public float motorSpeed() {
    	return (float) MOTOR_SPEED_HANDLE.get(segment, 0L);
    }
    
    /// @see #base()
    public RevoluteJointDef base(Consumer<JointDef> consumer) {
    	consumer.accept(base);
    	return this;
    }
    
    /// @see #base()
    public RevoluteJointDef base(JointDef other) {
    	base.set(other);
    	return this;
    }
    
    /// ```
    /// Base joint definition.
    /// ```
    public JointDef base() {
    	return base;
    }
    
    @Override
    public RevoluteJointDef set(RevoluteJointDef other) {
        return set(other.segment);
    }
    
    @Override
    public RevoluteJointDef set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<RevoluteJointDef> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<RevoluteJointDef> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new RevoluteJointDef(segment),
            count
        );
    }
    
    public static NativeStructArray<RevoluteJointDef> array(Arena arena, RevoluteJointDef... structs) {
        NativeStructArray<RevoluteJointDef> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new RevoluteJointDef(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<RevoluteJointDef> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new RevoluteJointDef(segment)
        );
    }
    
}