/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.box3d.body;

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
/// A body definition holds all the data needed to construct a rigid body.
/// You can safely re-use body definitions. Shapes are added to a body after construction.
/// Body definitions are temporary objects used to bundle creation parameters.
/// Must be initialized using b3DefaultBodyDef().
/// @ingroup body
/// ```
public final class BodyDef
		implements Struct<BodyDef> {

    private static final LazyConstant<MethodHandle> B3_DEFAULT_BODY_DEF;

    public static final StructLayout LAYOUT;

    public static final VarHandle TYPE_HANDLE;
    public static final VarHandle LINEAR_DAMPING_HANDLE;
    public static final VarHandle ANGULAR_DAMPING_HANDLE;
    public static final VarHandle GRAVITY_SCALE_HANDLE;
    public static final VarHandle SLEEP_THRESHOLD_HANDLE;
    public static final VarHandle NAME_HANDLE;
    public static final VarHandle USER_DATA_HANDLE;
    public static final VarHandle ENABLE_SLEEP_HANDLE;
    public static final VarHandle IS_AWAKE_HANDLE;
    public static final VarHandle IS_BULLET_HANDLE;
    public static final VarHandle IS_ENABLED_HANDLE;
    public static final VarHandle ALLOW_FAST_ROTATION_HANDLE;
    public static final VarHandle ENABLE_CONTACT_RECYCLING_HANDLE;
    public static final VarHandle INTERNAL_VALUE_HANDLE;

    public static final long TYPE_BYTE_OFFSET;
    public static final long POSITION_BYTE_OFFSET;
    public static final long ROTATION_BYTE_OFFSET;
    public static final long LINEAR_VELOCITY_BYTE_OFFSET;
    public static final long ANGULAR_VELOCITY_BYTE_OFFSET;
    public static final long LINEAR_DAMPING_BYTE_OFFSET;
    public static final long ANGULAR_DAMPING_BYTE_OFFSET;
    public static final long GRAVITY_SCALE_BYTE_OFFSET;
    public static final long SLEEP_THRESHOLD_BYTE_OFFSET;
    public static final long NAME_BYTE_OFFSET;
    public static final long USER_DATA_BYTE_OFFSET;
    public static final long MOTION_LOCKS_BYTE_OFFSET;
    public static final long ENABLE_SLEEP_BYTE_OFFSET;
    public static final long IS_AWAKE_BYTE_OFFSET;
    public static final long IS_BULLET_BYTE_OFFSET;
    public static final long IS_ENABLED_BYTE_OFFSET;
    public static final long ALLOW_FAST_ROTATION_BYTE_OFFSET;
    public static final long ENABLE_CONTACT_RECYCLING_BYTE_OFFSET;
    public static final long INTERNAL_VALUE_BYTE_OFFSET;

    private final MemorySegment segment;

    private final Vec3 position;
    private final Quat rotation;
    private final Vec3 linearVelocity;
    private final Vec3 angularVelocity;
    private final MotionLocks motionLocks;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("type"),
            Vec3.LAYOUT.withName("position"),
            Quat.LAYOUT.withName("rotation"),
            Vec3.LAYOUT.withName("linearVelocity"),
            Vec3.LAYOUT.withName("angularVelocity"),
            JAVA_FLOAT.withName("linearDamping"),
            JAVA_FLOAT.withName("angularDamping"),
            JAVA_FLOAT.withName("gravityScale"),
            JAVA_FLOAT.withName("sleepThreshold"),
            UNBOUNDED_ADDRESS.withName("name"),
            UNBOUNDED_ADDRESS.withName("userData"),
            MotionLocks.LAYOUT.withName("motionLocks"),
            JAVA_BOOLEAN.withName("enableSleep"),
            JAVA_BOOLEAN.withName("isAwake"),
            JAVA_BOOLEAN.withName("isBullet"),
            JAVA_BOOLEAN.withName("isEnabled"),
            JAVA_BOOLEAN.withName("allowFastRotation"),
            JAVA_BOOLEAN.withName("enableContactRecycling"),
            JAVA_INT.withName("internalValue")
        ).withName("b3BodyDef").withByteAlignment(8);
        
        B3_DEFAULT_BODY_DEF = downcallHandle("b3DefaultBodyDef", BodyDef.LAYOUT);
        
        TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("type"));
        LINEAR_DAMPING_HANDLE = LAYOUT.varHandle(PathElement.groupElement("linearDamping"));
        ANGULAR_DAMPING_HANDLE = LAYOUT.varHandle(PathElement.groupElement("angularDamping"));
        GRAVITY_SCALE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("gravityScale"));
        SLEEP_THRESHOLD_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sleepThreshold"));
        NAME_HANDLE = LAYOUT.varHandle(PathElement.groupElement("name"));
        USER_DATA_HANDLE = LAYOUT.varHandle(PathElement.groupElement("userData"));
        ENABLE_SLEEP_HANDLE = LAYOUT.varHandle(PathElement.groupElement("enableSleep"));
        IS_AWAKE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("isAwake"));
        IS_BULLET_HANDLE = LAYOUT.varHandle(PathElement.groupElement("isBullet"));
        IS_ENABLED_HANDLE = LAYOUT.varHandle(PathElement.groupElement("isEnabled"));
        ALLOW_FAST_ROTATION_HANDLE = LAYOUT.varHandle(PathElement.groupElement("allowFastRotation"));
        ENABLE_CONTACT_RECYCLING_HANDLE = LAYOUT.varHandle(PathElement.groupElement("enableContactRecycling"));
        INTERNAL_VALUE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("internalValue"));
        
        TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("type"));
        POSITION_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("position"));
        ROTATION_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("rotation"));
        LINEAR_VELOCITY_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("linearVelocity"));
        ANGULAR_VELOCITY_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("angularVelocity"));
        LINEAR_DAMPING_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("linearDamping"));
        ANGULAR_DAMPING_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("angularDamping"));
        GRAVITY_SCALE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("gravityScale"));
        SLEEP_THRESHOLD_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sleepThreshold"));
        NAME_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("name"));
        USER_DATA_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("userData"));
        MOTION_LOCKS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("motionLocks"));
        ENABLE_SLEEP_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("enableSleep"));
        IS_AWAKE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("isAwake"));
        IS_BULLET_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("isBullet"));
        IS_ENABLED_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("isEnabled"));
        ALLOW_FAST_ROTATION_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("allowFastRotation"));
        ENABLE_CONTACT_RECYCLING_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("enableContactRecycling"));
        INTERNAL_VALUE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("internalValue"));
        //@formatter:on
    }

    public BodyDef() {
        this(Arena.ofAuto());
    }
    
    public BodyDef(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public BodyDef(MemorySegment segment) {
        this.segment = segment;
    
        position = new Vec3(segment.asSlice(POSITION_BYTE_OFFSET, Vec3.LAYOUT));
        rotation = new Quat(segment.asSlice(ROTATION_BYTE_OFFSET, Quat.LAYOUT));
        linearVelocity = new Vec3(segment.asSlice(LINEAR_VELOCITY_BYTE_OFFSET, Vec3.LAYOUT));
        angularVelocity = new Vec3(segment.asSlice(ANGULAR_VELOCITY_BYTE_OFFSET, Vec3.LAYOUT));
        motionLocks = new MotionLocks(segment.asSlice(MOTION_LOCKS_BYTE_OFFSET, MotionLocks.LAYOUT));
    }

    /// ```
    /// Use this to initialize your body definition
    /// @ingroup body
    /// ```
    public static MemorySegment ndefaultBodyDef(
    	SegmentAllocator allocator
    ) {
    	MethodHandle method = B3_DEFAULT_BODY_DEF.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ndefaultBodyDef].
    public static @Nullable BodyDef defaultBodyDef(
    	SegmentAllocator allocator
    ) {
    	MemorySegment segment = ndefaultBodyDef(
    		allocator
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new BodyDef(segment);
    }
    
    /// @see #type()
    public BodyDef type(int type) {
    	TYPE_HANDLE.set(segment, 0L, type);
    	return this;
    }
    
    /// ```
    /// The body type: static, kinematic, or dynamic.
    /// ```
    public int type() {
    	return (int) TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #linearDamping()
    public BodyDef linearDamping(float linearDamping) {
    	LINEAR_DAMPING_HANDLE.set(segment, 0L, linearDamping);
    	return this;
    }
    
    /// ```
    /// Linear damping is used to reduce the linear velocity. The damping parameter
    /// can be larger than 1 but the damping effect becomes sensitive to the
    /// time step when the damping parameter is large.
    /// Generally linear damping is undesirable because it makes objects move slowly
    /// as if they are floating.
    /// ```
    public float linearDamping() {
    	return (float) LINEAR_DAMPING_HANDLE.get(segment, 0L);
    }
    
    /// @see #angularDamping()
    public BodyDef angularDamping(float angularDamping) {
    	ANGULAR_DAMPING_HANDLE.set(segment, 0L, angularDamping);
    	return this;
    }
    
    /// ```
    /// Angular damping is used to reduce the angular velocity. The damping parameter
    /// can be larger than 1.0f but the damping effect becomes sensitive to the
    /// time step when the damping parameter is large.
    /// Angular damping can be used to slow down rotating bodies.
    /// ```
    public float angularDamping() {
    	return (float) ANGULAR_DAMPING_HANDLE.get(segment, 0L);
    }
    
    /// @see #gravityScale()
    public BodyDef gravityScale(float gravityScale) {
    	GRAVITY_SCALE_HANDLE.set(segment, 0L, gravityScale);
    	return this;
    }
    
    /// ```
    /// Scale the gravity applied to this body. Non-dimensional.
    /// ```
    public float gravityScale() {
    	return (float) GRAVITY_SCALE_HANDLE.get(segment, 0L);
    }
    
    /// @see #sleepThreshold()
    public BodyDef sleepThreshold(float sleepThreshold) {
    	SLEEP_THRESHOLD_HANDLE.set(segment, 0L, sleepThreshold);
    	return this;
    }
    
    /// ```
    /// Sleep speed threshold, default is 0.05 meters per second
    /// ```
    public float sleepThreshold() {
    	return (float) SLEEP_THRESHOLD_HANDLE.get(segment, 0L);
    }
    
    /// @see #name()
    public BodyDef name(Arena arena, String name) {
    	NAME_HANDLE.set(segment, 0L, arena.allocateFrom(name));
    	return this;
    }
    
    /// ```
    /// Optional body name for debugging. Up to B3_BODY_NAME_LENGTH characters (including null termination)
    /// ```
    public @Nullable String name() {
    	MemorySegment segment = (MemorySegment) NAME_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment.getString(0);
    }
    
    /// @see #userData()
    public BodyDef userData(MemorySegment userData) {
    	USER_DATA_HANDLE.set(segment, 0L, userData);
    	return this;
    }
    
    /// ```
    /// Use this to store application specific body data.
    /// ```
    public @Nullable MemorySegment userData() {
    	MemorySegment segment = (MemorySegment) USER_DATA_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #enableSleep()
    public BodyDef enableSleep(boolean enableSleep) {
    	ENABLE_SLEEP_HANDLE.set(segment, 0L, enableSleep);
    	return this;
    }
    
    /// ```
    /// Set this flag to false if this body should never fall asleep.
    /// ```
    public boolean enableSleep() {
    	return (boolean) ENABLE_SLEEP_HANDLE.get(segment, 0L);
    }
    
    /// @see #isAwake()
    public BodyDef isAwake(boolean isAwake) {
    	IS_AWAKE_HANDLE.set(segment, 0L, isAwake);
    	return this;
    }
    
    /// ```
    /// Is this body initially awake or sleeping?
    /// ```
    public boolean isAwake() {
    	return (boolean) IS_AWAKE_HANDLE.get(segment, 0L);
    }
    
    /// @see #isBullet()
    public BodyDef isBullet(boolean isBullet) {
    	IS_BULLET_HANDLE.set(segment, 0L, isBullet);
    	return this;
    }
    
    /// ```
    /// Treat this body as a high speed object that performs continuous collision detection
    /// against dynamic and kinematic bodies, but not other bullet bodies.
    /// @warning Bullets should be used sparingly. They are not a solution for general dynamic-versus-dynamic
    /// continuous collision. They do not guarantee accurate collision if both bodies are fast moving because
    /// the bullet does a continuous check after all non-bullet bodies have moved. You could get unlucky and have
    /// the bullet body end a time step very close to a non-bullet body and the non-bullet body then moves over
    /// the bullet body. In continuous collision, initial overlap is ignored to avoid freezing bodies in place.
    /// I do not recommend using them for game projectiles if precise collision timing is needed. Instead consider
    /// using a ray or shape cast. You can use a marching ray or shape cast for projectile that moves over time.
    /// If you want a fast moving projectile to collide with a fast moving target, you need to consider the relative
    /// movement in your ray or shape cast. This is out of the scope of Box3D.
    /// So what are good use cases for bullets? Pinball games or games with dynamic containers that hold other objects.
    /// It should be a use case where it doesn't break the game if there is a collision missed, but having them
    /// captured improves the quality of the game.
    /// ```
    public boolean isBullet() {
    	return (boolean) IS_BULLET_HANDLE.get(segment, 0L);
    }
    
    /// @see #isEnabled()
    public BodyDef isEnabled(boolean isEnabled) {
    	IS_ENABLED_HANDLE.set(segment, 0L, isEnabled);
    	return this;
    }
    
    /// ```
    /// Used to disable a body. A disabled body does not move or collide.
    /// ```
    public boolean isEnabled() {
    	return (boolean) IS_ENABLED_HANDLE.get(segment, 0L);
    }
    
    /// @see #allowFastRotation()
    public BodyDef allowFastRotation(boolean allowFastRotation) {
    	ALLOW_FAST_ROTATION_HANDLE.set(segment, 0L, allowFastRotation);
    	return this;
    }
    
    /// ```
    /// This allows this body to bypass rotational speed limits. Should only be used
    /// for circular objects, like wheels.
    /// ```
    public boolean allowFastRotation() {
    	return (boolean) ALLOW_FAST_ROTATION_HANDLE.get(segment, 0L);
    }
    
    /// @see #enableContactRecycling()
    public BodyDef enableContactRecycling(boolean enableContactRecycling) {
    	ENABLE_CONTACT_RECYCLING_HANDLE.set(segment, 0L, enableContactRecycling);
    	return this;
    }
    
    /// ```
    /// Enable contact recycling. True by default. Leaving this enabled improves performance
    /// but may lead to ghost collision that should be avoided on characters.
    /// ```
    public boolean enableContactRecycling() {
    	return (boolean) ENABLE_CONTACT_RECYCLING_HANDLE.get(segment, 0L);
    }
    
    /// @see #internalValue()
    public BodyDef internalValue(int internalValue) {
    	INTERNAL_VALUE_HANDLE.set(segment, 0L, internalValue);
    	return this;
    }
    
    /// ```
    /// Used internally to detect a valid definition. DO NOT SET.
    /// ```
    public int internalValue() {
    	return (int) INTERNAL_VALUE_HANDLE.get(segment, 0L);
    }
    
    /// @see #position()
    public BodyDef position(Consumer<Vec3> consumer) {
    	consumer.accept(position);
    	return this;
    }
    
    /// @see #position()
    public BodyDef position(Vec3 other) {
    	position.set(other);
    	return this;
    }
    
    /// ```
    /// The initial world position of the body. Bodies should be created with the desired position.
    /// @note Creating bodies at the origin and then moving them nearly doubles the cost of body creation, especially
    /// if the body is moved after shapes have been added.
    /// ```
    public Vec3 position() {
    	return position;
    }
    
    /// @see #rotation()
    public BodyDef rotation(Consumer<Quat> consumer) {
    	consumer.accept(rotation);
    	return this;
    }
    
    /// @see #rotation()
    public BodyDef rotation(Quat other) {
    	rotation.set(other);
    	return this;
    }
    
    /// ```
    /// The initial world rotation of the body.
    /// ```
    public Quat rotation() {
    	return rotation;
    }
    
    /// @see #linearVelocity()
    public BodyDef linearVelocity(Consumer<Vec3> consumer) {
    	consumer.accept(linearVelocity);
    	return this;
    }
    
    /// @see #linearVelocity()
    public BodyDef linearVelocity(Vec3 other) {
    	linearVelocity.set(other);
    	return this;
    }
    
    /// ```
    /// The initial linear velocity of the body's origin. Usually in meters per second.
    /// ```
    public Vec3 linearVelocity() {
    	return linearVelocity;
    }
    
    /// @see #angularVelocity()
    public BodyDef angularVelocity(Consumer<Vec3> consumer) {
    	consumer.accept(angularVelocity);
    	return this;
    }
    
    /// @see #angularVelocity()
    public BodyDef angularVelocity(Vec3 other) {
    	angularVelocity.set(other);
    	return this;
    }
    
    /// ```
    /// The initial angular velocity of the body. Radians per second.
    /// ```
    public Vec3 angularVelocity() {
    	return angularVelocity;
    }
    
    /// @see #motionLocks()
    public BodyDef motionLocks(Consumer<MotionLocks> consumer) {
    	consumer.accept(motionLocks);
    	return this;
    }
    
    /// @see #motionLocks()
    public BodyDef motionLocks(MotionLocks other) {
    	motionLocks.set(other);
    	return this;
    }
    
    /// ```
    /// Motions locks to restrict linear and angular movement
    /// ```
    public MotionLocks motionLocks() {
    	return motionLocks;
    }
    
    @Override
    public BodyDef set(BodyDef other) {
        return set(other.segment);
    }
    
    @Override
    public BodyDef set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<BodyDef> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<BodyDef> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new BodyDef(segment),
            count
        );
    }
    
    public static NativeStructArray<BodyDef> array(Arena arena, BodyDef... structs) {
        NativeStructArray<BodyDef> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new BodyDef(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<BodyDef> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new BodyDef(segment)
        );
    }
    
}