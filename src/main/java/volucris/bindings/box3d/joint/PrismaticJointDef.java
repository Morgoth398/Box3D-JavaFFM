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
/// Prismatic joint definition. Body B may slide along the x-axis in local frame A.
/// Body B cannot rotate relative to body A. The joint translation is zero when the
/// local frame origins coincide in world space.
/// @ingroup prismatic_joint
/// ```
public final class PrismaticJointDef
		implements Struct<PrismaticJointDef> {

    private static final LazyConstant<MethodHandle> B3_DEFAULT_PRISMATIC_JOINT_DEF;

    public static final StructLayout LAYOUT;

    public static final VarHandle ENABLE_SPRING_HANDLE;
    public static final VarHandle HERTZ_HANDLE;
    public static final VarHandle DAMPING_RATIO_HANDLE;
    public static final VarHandle TARGET_TRANSLATION_HANDLE;
    public static final VarHandle ENABLE_LIMIT_HANDLE;
    public static final VarHandle LOWER_TRANSLATION_HANDLE;
    public static final VarHandle UPPER_TRANSLATION_HANDLE;
    public static final VarHandle ENABLE_MOTOR_HANDLE;
    public static final VarHandle MAX_MOTOR_FORCE_HANDLE;
    public static final VarHandle MOTOR_SPEED_HANDLE;

    public static final long BASE_BYTE_OFFSET;
    public static final long ENABLE_SPRING_BYTE_OFFSET;
    public static final long HERTZ_BYTE_OFFSET;
    public static final long DAMPING_RATIO_BYTE_OFFSET;
    public static final long TARGET_TRANSLATION_BYTE_OFFSET;
    public static final long ENABLE_LIMIT_BYTE_OFFSET;
    public static final long LOWER_TRANSLATION_BYTE_OFFSET;
    public static final long UPPER_TRANSLATION_BYTE_OFFSET;
    public static final long ENABLE_MOTOR_BYTE_OFFSET;
    public static final long MAX_MOTOR_FORCE_BYTE_OFFSET;
    public static final long MOTOR_SPEED_BYTE_OFFSET;

    private final MemorySegment segment;

    private final JointDef base;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JointDef.LAYOUT.withName("base"),
            JAVA_BOOLEAN.withName("enableSpring"),
            MemoryLayout.paddingLayout(3),
            JAVA_FLOAT.withName("hertz"),
            JAVA_FLOAT.withName("dampingRatio"),
            JAVA_FLOAT.withName("targetTranslation"),
            JAVA_BOOLEAN.withName("enableLimit"),
            MemoryLayout.paddingLayout(3),
            JAVA_FLOAT.withName("lowerTranslation"),
            JAVA_FLOAT.withName("upperTranslation"),
            JAVA_BOOLEAN.withName("enableMotor"),
            MemoryLayout.paddingLayout(3),
            JAVA_FLOAT.withName("maxMotorForce"),
            JAVA_FLOAT.withName("motorSpeed")
        ).withName("b3PrismaticJointDef").withByteAlignment(8);
        
        B3_DEFAULT_PRISMATIC_JOINT_DEF = downcallHandle("b3DefaultPrismaticJointDef", PrismaticJointDef.LAYOUT);
        
        ENABLE_SPRING_HANDLE = LAYOUT.varHandle(PathElement.groupElement("enableSpring"));
        HERTZ_HANDLE = LAYOUT.varHandle(PathElement.groupElement("hertz"));
        DAMPING_RATIO_HANDLE = LAYOUT.varHandle(PathElement.groupElement("dampingRatio"));
        TARGET_TRANSLATION_HANDLE = LAYOUT.varHandle(PathElement.groupElement("targetTranslation"));
        ENABLE_LIMIT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("enableLimit"));
        LOWER_TRANSLATION_HANDLE = LAYOUT.varHandle(PathElement.groupElement("lowerTranslation"));
        UPPER_TRANSLATION_HANDLE = LAYOUT.varHandle(PathElement.groupElement("upperTranslation"));
        ENABLE_MOTOR_HANDLE = LAYOUT.varHandle(PathElement.groupElement("enableMotor"));
        MAX_MOTOR_FORCE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxMotorForce"));
        MOTOR_SPEED_HANDLE = LAYOUT.varHandle(PathElement.groupElement("motorSpeed"));
        
        BASE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("base"));
        ENABLE_SPRING_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("enableSpring"));
        HERTZ_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("hertz"));
        DAMPING_RATIO_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("dampingRatio"));
        TARGET_TRANSLATION_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("targetTranslation"));
        ENABLE_LIMIT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("enableLimit"));
        LOWER_TRANSLATION_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("lowerTranslation"));
        UPPER_TRANSLATION_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("upperTranslation"));
        ENABLE_MOTOR_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("enableMotor"));
        MAX_MOTOR_FORCE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxMotorForce"));
        MOTOR_SPEED_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("motorSpeed"));
        //@formatter:on
    }

    public PrismaticJointDef() {
        this(Arena.ofAuto());
    }
    
    public PrismaticJointDef(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public PrismaticJointDef(MemorySegment segment) {
        this.segment = segment;
    
        base = new JointDef(segment.asSlice(BASE_BYTE_OFFSET, JointDef.LAYOUT));
    }

    /// ```
    /// Use this to initialize your joint definition
    /// @ingroup prismatic_joint
    /// ```
    public static MemorySegment ndefaultPrismaticJointDef(
    	SegmentAllocator allocator
    ) {
    	MethodHandle method = B3_DEFAULT_PRISMATIC_JOINT_DEF.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ndefaultPrismaticJointDef].
    public final @Nullable PrismaticJointDef defaultPrismaticJointDef(
    	SegmentAllocator allocator
    ) {
    	MemorySegment segment = ndefaultPrismaticJointDef(
    		allocator
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new PrismaticJointDef(segment);
    }
    
    /// @see #enableSpring()
    public PrismaticJointDef enableSpring(boolean enableSpring) {
    	ENABLE_SPRING_HANDLE.set(segment, 0L, enableSpring);
    	return this;
    }
    
    /// ```
    /// Enable a linear spring along the prismatic joint axis
    /// ```
    public boolean enableSpring() {
    	return (boolean) ENABLE_SPRING_HANDLE.get(segment, 0L);
    }
    
    /// @see #hertz()
    public PrismaticJointDef hertz(float hertz) {
    	HERTZ_HANDLE.set(segment, 0L, hertz);
    	return this;
    }
    
    /// ```
    /// The spring stiffness Hertz, cycles per second
    /// ```
    public float hertz() {
    	return (float) HERTZ_HANDLE.get(segment, 0L);
    }
    
    /// @see #dampingRatio()
    public PrismaticJointDef dampingRatio(float dampingRatio) {
    	DAMPING_RATIO_HANDLE.set(segment, 0L, dampingRatio);
    	return this;
    }
    
    /// ```
    /// The spring damping ratio, non-dimensional
    /// ```
    public float dampingRatio() {
    	return (float) DAMPING_RATIO_HANDLE.get(segment, 0L);
    }
    
    /// @see #targetTranslation()
    public PrismaticJointDef targetTranslation(float targetTranslation) {
    	TARGET_TRANSLATION_HANDLE.set(segment, 0L, targetTranslation);
    	return this;
    }
    
    /// ```
    /// The target translation for the joint in meters. The spring-damper will drive
    /// to this translation.
    /// ```
    public float targetTranslation() {
    	return (float) TARGET_TRANSLATION_HANDLE.get(segment, 0L);
    }
    
    /// @see #enableLimit()
    public PrismaticJointDef enableLimit(boolean enableLimit) {
    	ENABLE_LIMIT_HANDLE.set(segment, 0L, enableLimit);
    	return this;
    }
    
    /// ```
    /// Enable/disable the joint limit
    /// ```
    public boolean enableLimit() {
    	return (boolean) ENABLE_LIMIT_HANDLE.get(segment, 0L);
    }
    
    /// @see #lowerTranslation()
    public PrismaticJointDef lowerTranslation(float lowerTranslation) {
    	LOWER_TRANSLATION_HANDLE.set(segment, 0L, lowerTranslation);
    	return this;
    }
    
    /// ```
    /// The lower translation limit
    /// ```
    public float lowerTranslation() {
    	return (float) LOWER_TRANSLATION_HANDLE.get(segment, 0L);
    }
    
    /// @see #upperTranslation()
    public PrismaticJointDef upperTranslation(float upperTranslation) {
    	UPPER_TRANSLATION_HANDLE.set(segment, 0L, upperTranslation);
    	return this;
    }
    
    /// ```
    /// The upper translation limit
    /// ```
    public float upperTranslation() {
    	return (float) UPPER_TRANSLATION_HANDLE.get(segment, 0L);
    }
    
    /// @see #enableMotor()
    public PrismaticJointDef enableMotor(boolean enableMotor) {
    	ENABLE_MOTOR_HANDLE.set(segment, 0L, enableMotor);
    	return this;
    }
    
    /// ```
    /// Enable/disable the joint motor
    /// ```
    public boolean enableMotor() {
    	return (boolean) ENABLE_MOTOR_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxMotorForce()
    public PrismaticJointDef maxMotorForce(float maxMotorForce) {
    	MAX_MOTOR_FORCE_HANDLE.set(segment, 0L, maxMotorForce);
    	return this;
    }
    
    /// ```
    /// The maximum motor force, typically in newtons
    /// ```
    public float maxMotorForce() {
    	return (float) MAX_MOTOR_FORCE_HANDLE.get(segment, 0L);
    }
    
    /// @see #motorSpeed()
    public PrismaticJointDef motorSpeed(float motorSpeed) {
    	MOTOR_SPEED_HANDLE.set(segment, 0L, motorSpeed);
    	return this;
    }
    
    /// ```
    /// The desired motor speed, typically in meters per second
    /// ```
    public float motorSpeed() {
    	return (float) MOTOR_SPEED_HANDLE.get(segment, 0L);
    }
    
    /// @see #base()
    public PrismaticJointDef base(Consumer<JointDef> consumer) {
    	consumer.accept(base);
    	return this;
    }
    
    /// @see #base()
    public PrismaticJointDef base(JointDef other) {
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
    public PrismaticJointDef set(PrismaticJointDef other) {
        return set(other.segment);
    }
    
    @Override
    public PrismaticJointDef set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<PrismaticJointDef> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<PrismaticJointDef> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new PrismaticJointDef(segment),
            count
        );
    }
    
    public static NativeStructArray<PrismaticJointDef> array(Arena arena, PrismaticJointDef... structs) {
        NativeStructArray<PrismaticJointDef> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new PrismaticJointDef(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<PrismaticJointDef> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new PrismaticJointDef(segment)
        );
    }
    
}