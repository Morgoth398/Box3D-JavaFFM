/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.box3d.world;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.StructLayout;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.util.function.Consumer;
import org.jspecify.annotations.Nullable;
import volucris.bindings.box3d.debugDraw.CreateDebugShapeCallback;
import volucris.bindings.box3d.debugDraw.DestroyDebugShapeCallback;
import volucris.bindings.box3d.math.Vec3;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

/// ```
/// World definition used to create a simulation world. Must be initialized using b3DefaultWorldDef.
/// @ingroup world
/// ```
public final class WorldDef
		implements Struct<WorldDef> {

    private static final LazyConstant<MethodHandle> B3_DEFAULT_WORLD_DEF;

    public static final StructLayout LAYOUT;

    public static final VarHandle RESTITUTION_THRESHOLD_HANDLE;
    public static final VarHandle HIT_EVENT_THRESHOLD_HANDLE;
    public static final VarHandle CONTACT_HERTZ_HANDLE;
    public static final VarHandle CONTACT_DAMPING_RATIO_HANDLE;
    public static final VarHandle CONTACT_SPEED_HANDLE;
    public static final VarHandle MAXIMUM_LINEAR_SPEED_HANDLE;
    public static final VarHandle FRICTION_CALLBACK_HANDLE;
    public static final VarHandle RESTITUTION_CALLBACK_HANDLE;
    public static final VarHandle ENABLE_SLEEP_HANDLE;
    public static final VarHandle ENABLE_CONTINUOUS_HANDLE;
    public static final VarHandle WORKER_COUNT_HANDLE;
    public static final VarHandle ENQUEUE_TASK_HANDLE;
    public static final VarHandle FINISH_TASK_HANDLE;
    public static final VarHandle USER_TASK_CONTEXT_HANDLE;
    public static final VarHandle USER_DATA_HANDLE;
    public static final VarHandle CREATE_DEBUG_SHAPE_HANDLE;
    public static final VarHandle DESTROY_DEBUG_SHAPE_HANDLE;
    public static final VarHandle USER_DEBUG_SHAPE_CONTEXT_HANDLE;
    public static final VarHandle INTERNAL_VALUE_HANDLE;

    public static final long GRAVITY_BYTE_OFFSET;
    public static final long RESTITUTION_THRESHOLD_BYTE_OFFSET;
    public static final long HIT_EVENT_THRESHOLD_BYTE_OFFSET;
    public static final long CONTACT_HERTZ_BYTE_OFFSET;
    public static final long CONTACT_DAMPING_RATIO_BYTE_OFFSET;
    public static final long CONTACT_SPEED_BYTE_OFFSET;
    public static final long MAXIMUM_LINEAR_SPEED_BYTE_OFFSET;
    public static final long FRICTION_CALLBACK_BYTE_OFFSET;
    public static final long RESTITUTION_CALLBACK_BYTE_OFFSET;
    public static final long ENABLE_SLEEP_BYTE_OFFSET;
    public static final long ENABLE_CONTINUOUS_BYTE_OFFSET;
    public static final long WORKER_COUNT_BYTE_OFFSET;
    public static final long ENQUEUE_TASK_BYTE_OFFSET;
    public static final long FINISH_TASK_BYTE_OFFSET;
    public static final long USER_TASK_CONTEXT_BYTE_OFFSET;
    public static final long USER_DATA_BYTE_OFFSET;
    public static final long CREATE_DEBUG_SHAPE_BYTE_OFFSET;
    public static final long DESTROY_DEBUG_SHAPE_BYTE_OFFSET;
    public static final long USER_DEBUG_SHAPE_CONTEXT_BYTE_OFFSET;
    public static final long CAPACITY_BYTE_OFFSET;
    public static final long INTERNAL_VALUE_BYTE_OFFSET;

    private final MemorySegment segment;

    private final Vec3 gravity;
    private final Capacity capacity;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            Vec3.LAYOUT.withName("gravity"),
            JAVA_FLOAT.withName("restitutionThreshold"),
            JAVA_FLOAT.withName("hitEventThreshold"),
            JAVA_FLOAT.withName("contactHertz"),
            JAVA_FLOAT.withName("contactDampingRatio"),
            JAVA_FLOAT.withName("contactSpeed"),
            JAVA_FLOAT.withName("maximumLinearSpeed"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("frictionCallback"),
            UNBOUNDED_ADDRESS.withName("restitutionCallback"),
            JAVA_BOOLEAN.withName("enableSleep"),
            JAVA_BOOLEAN.withName("enableContinuous"),
            MemoryLayout.paddingLayout(2),
            JAVA_INT.withName("workerCount"),
            UNBOUNDED_ADDRESS.withName("enqueueTask"),
            UNBOUNDED_ADDRESS.withName("finishTask"),
            UNBOUNDED_ADDRESS.withName("userTaskContext"),
            UNBOUNDED_ADDRESS.withName("userData"),
            UNBOUNDED_ADDRESS.withName("createDebugShape"),
            UNBOUNDED_ADDRESS.withName("destroyDebugShape"),
            UNBOUNDED_ADDRESS.withName("userDebugShapeContext"),
            Capacity.LAYOUT.withName("capacity"),
            JAVA_INT.withName("internalValue")
        ).withName("b3WorldDef").withByteAlignment(8);
        
        B3_DEFAULT_WORLD_DEF = downcallHandle("b3DefaultWorldDef", WorldDef.LAYOUT);
        
        RESTITUTION_THRESHOLD_HANDLE = LAYOUT.varHandle(PathElement.groupElement("restitutionThreshold"));
        HIT_EVENT_THRESHOLD_HANDLE = LAYOUT.varHandle(PathElement.groupElement("hitEventThreshold"));
        CONTACT_HERTZ_HANDLE = LAYOUT.varHandle(PathElement.groupElement("contactHertz"));
        CONTACT_DAMPING_RATIO_HANDLE = LAYOUT.varHandle(PathElement.groupElement("contactDampingRatio"));
        CONTACT_SPEED_HANDLE = LAYOUT.varHandle(PathElement.groupElement("contactSpeed"));
        MAXIMUM_LINEAR_SPEED_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maximumLinearSpeed"));
        FRICTION_CALLBACK_HANDLE = LAYOUT.varHandle(PathElement.groupElement("frictionCallback"));
        RESTITUTION_CALLBACK_HANDLE = LAYOUT.varHandle(PathElement.groupElement("restitutionCallback"));
        ENABLE_SLEEP_HANDLE = LAYOUT.varHandle(PathElement.groupElement("enableSleep"));
        ENABLE_CONTINUOUS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("enableContinuous"));
        WORKER_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("workerCount"));
        ENQUEUE_TASK_HANDLE = LAYOUT.varHandle(PathElement.groupElement("enqueueTask"));
        FINISH_TASK_HANDLE = LAYOUT.varHandle(PathElement.groupElement("finishTask"));
        USER_TASK_CONTEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("userTaskContext"));
        USER_DATA_HANDLE = LAYOUT.varHandle(PathElement.groupElement("userData"));
        CREATE_DEBUG_SHAPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("createDebugShape"));
        DESTROY_DEBUG_SHAPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("destroyDebugShape"));
        USER_DEBUG_SHAPE_CONTEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("userDebugShapeContext"));
        INTERNAL_VALUE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("internalValue"));
        
        GRAVITY_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("gravity"));
        RESTITUTION_THRESHOLD_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("restitutionThreshold"));
        HIT_EVENT_THRESHOLD_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("hitEventThreshold"));
        CONTACT_HERTZ_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("contactHertz"));
        CONTACT_DAMPING_RATIO_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("contactDampingRatio"));
        CONTACT_SPEED_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("contactSpeed"));
        MAXIMUM_LINEAR_SPEED_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maximumLinearSpeed"));
        FRICTION_CALLBACK_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("frictionCallback"));
        RESTITUTION_CALLBACK_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("restitutionCallback"));
        ENABLE_SLEEP_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("enableSleep"));
        ENABLE_CONTINUOUS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("enableContinuous"));
        WORKER_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("workerCount"));
        ENQUEUE_TASK_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("enqueueTask"));
        FINISH_TASK_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("finishTask"));
        USER_TASK_CONTEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("userTaskContext"));
        USER_DATA_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("userData"));
        CREATE_DEBUG_SHAPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("createDebugShape"));
        DESTROY_DEBUG_SHAPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("destroyDebugShape"));
        USER_DEBUG_SHAPE_CONTEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("userDebugShapeContext"));
        CAPACITY_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("capacity"));
        INTERNAL_VALUE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("internalValue"));
        //@formatter:on
    }

    public WorldDef() {
        this(Arena.ofAuto());
    }
    
    public WorldDef(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public WorldDef(MemorySegment segment) {
        this.segment = segment;
    
        gravity = new Vec3(segment.asSlice(GRAVITY_BYTE_OFFSET, Vec3.LAYOUT));
        capacity = new Capacity(segment.asSlice(CAPACITY_BYTE_OFFSET, Capacity.LAYOUT));
    }

    /// ```
    /// Use this to initialize your world definition
    /// @ingroup world
    /// ```
    public static MemorySegment ndefaultWorldDef(
    	SegmentAllocator allocator
    ) {
    	MethodHandle method = B3_DEFAULT_WORLD_DEF.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ndefaultWorldDef].
    public static @Nullable WorldDef defaultWorldDef(
    	SegmentAllocator allocator
    ) {
    	MemorySegment segment = ndefaultWorldDef(
    		allocator
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new WorldDef(segment);
    }
    
    /// @see #restitutionThreshold()
    public WorldDef restitutionThreshold(float restitutionThreshold) {
    	RESTITUTION_THRESHOLD_HANDLE.set(segment, 0L, restitutionThreshold);
    	return this;
    }
    
    /// ```
    /// Restitution speed threshold, usually in m/s. Collisions above this
    /// speed have restitution applied (will bounce).
    /// ```
    public float restitutionThreshold() {
    	return (float) RESTITUTION_THRESHOLD_HANDLE.get(segment, 0L);
    }
    
    /// @see #hitEventThreshold()
    public WorldDef hitEventThreshold(float hitEventThreshold) {
    	HIT_EVENT_THRESHOLD_HANDLE.set(segment, 0L, hitEventThreshold);
    	return this;
    }
    
    /// ```
    /// Hit event speed threshold, usually in m/s. Collisions above this
    /// speed can generate hit events if the shape also enables hit events.
    /// ```
    public float hitEventThreshold() {
    	return (float) HIT_EVENT_THRESHOLD_HANDLE.get(segment, 0L);
    }
    
    /// @see #contactHertz()
    public WorldDef contactHertz(float contactHertz) {
    	CONTACT_HERTZ_HANDLE.set(segment, 0L, contactHertz);
    	return this;
    }
    
    /// ```
    /// Contact stiffness. Cycles per second. Increasing this increases the speed of overlap recovery, but can introduce jitter.
    /// ```
    public float contactHertz() {
    	return (float) CONTACT_HERTZ_HANDLE.get(segment, 0L);
    }
    
    /// @see #contactDampingRatio()
    public WorldDef contactDampingRatio(float contactDampingRatio) {
    	CONTACT_DAMPING_RATIO_HANDLE.set(segment, 0L, contactDampingRatio);
    	return this;
    }
    
    /// ```
    /// Contact bounciness. Non-dimensional. You can speed up overlap recovery by decreasing this with
    /// the trade-off that overlap resolution becomes more energetic.
    /// ```
    public float contactDampingRatio() {
    	return (float) CONTACT_DAMPING_RATIO_HANDLE.get(segment, 0L);
    }
    
    /// @see #contactSpeed()
    public WorldDef contactSpeed(float contactSpeed) {
    	CONTACT_SPEED_HANDLE.set(segment, 0L, contactSpeed);
    	return this;
    }
    
    /// ```
    /// This parameter controls how fast overlap is resolved and usually has units of meters per second. This only
    /// puts a cap on the resolution speed. The resolution speed is increased by increasing the hertz and/or
    /// decreasing the damping ratio.
    /// ```
    public float contactSpeed() {
    	return (float) CONTACT_SPEED_HANDLE.get(segment, 0L);
    }
    
    /// @see #maximumLinearSpeed()
    public WorldDef maximumLinearSpeed(float maximumLinearSpeed) {
    	MAXIMUM_LINEAR_SPEED_HANDLE.set(segment, 0L, maximumLinearSpeed);
    	return this;
    }
    
    /// ```
    /// Maximum linear speed. Usually meters per second.
    /// ```
    public float maximumLinearSpeed() {
    	return (float) MAXIMUM_LINEAR_SPEED_HANDLE.get(segment, 0L);
    }
    
    /// @see #frictionCallback()
    public WorldDef frictionCallback(FrictionCallback frictionCallback) {
    	FRICTION_CALLBACK_HANDLE.set(segment, 0L, frictionCallback.memorySegment());
    	return this;
    }
    
    /// ```
    /// Optional mixing callback for friction. The default uses sqrt(frictionA * frictionB).
    /// ```
    public @Nullable FrictionCallback frictionCallback() {
    	MemorySegment segment = (MemorySegment) FRICTION_CALLBACK_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return FrictionCallback.get(segment);
    }
    
    /// @see #restitutionCallback()
    public WorldDef restitutionCallback(RestitutionCallback restitutionCallback) {
    	RESTITUTION_CALLBACK_HANDLE.set(segment, 0L, restitutionCallback.memorySegment());
    	return this;
    }
    
    /// ```
    /// Optional mixing callback for restitution. The default uses max(restitutionA, restitutionB).
    /// ```
    public @Nullable RestitutionCallback restitutionCallback() {
    	MemorySegment segment = (MemorySegment) RESTITUTION_CALLBACK_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return RestitutionCallback.get(segment);
    }
    
    /// @see #enableSleep()
    public WorldDef enableSleep(boolean enableSleep) {
    	ENABLE_SLEEP_HANDLE.set(segment, 0L, enableSleep);
    	return this;
    }
    
    /// ```
    /// Can bodies go to sleep to improve performance
    /// ```
    public boolean enableSleep() {
    	return (boolean) ENABLE_SLEEP_HANDLE.get(segment, 0L);
    }
    
    /// @see #enableContinuous()
    public WorldDef enableContinuous(boolean enableContinuous) {
    	ENABLE_CONTINUOUS_HANDLE.set(segment, 0L, enableContinuous);
    	return this;
    }
    
    /// ```
    /// Enable continuous collision
    /// ```
    public boolean enableContinuous() {
    	return (boolean) ENABLE_CONTINUOUS_HANDLE.get(segment, 0L);
    }
    
    /// @see #workerCount()
    public WorldDef workerCount(int workerCount) {
    	WORKER_COUNT_HANDLE.set(segment, 0L, workerCount);
    	return this;
    }
    
    /// ```
    /// Number of workers to use with the provided task system. Box3D performs best when using only
    /// performance cores and accessing a single L2 cache. Efficiency cores and hyper-threading provide
    /// little benefit and may even harm performance.
    /// This is clamped to the range [1, B3_MAX_WORKERS]. Using a value above 1 will turn on multithreading.
    /// If task callbacks are provided then Box3D will use the user provided task system. Otherwise Box3D
    /// will create threads and use an internal scheduler.
    /// ```
    public int workerCount() {
    	return (int) WORKER_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #enqueueTask()
    public WorldDef enqueueTask(EnqueueTaskCallback enqueueTask) {
    	ENQUEUE_TASK_HANDLE.set(segment, 0L, enqueueTask.memorySegment());
    	return this;
    }
    
    /// ```
    /// function to spawn task
    /// ```
    public @Nullable EnqueueTaskCallback enqueueTask() {
    	MemorySegment segment = (MemorySegment) ENQUEUE_TASK_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return EnqueueTaskCallback.get(segment);
    }
    
    /// @see #finishTask()
    public WorldDef finishTask(FinishTaskCallback finishTask) {
    	FINISH_TASK_HANDLE.set(segment, 0L, finishTask.memorySegment());
    	return this;
    }
    
    /// ```
    /// function to finish a task
    /// ```
    public @Nullable FinishTaskCallback finishTask() {
    	MemorySegment segment = (MemorySegment) FINISH_TASK_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return FinishTaskCallback.get(segment);
    }
    
    /// @see #userTaskContext()
    public WorldDef userTaskContext(MemorySegment userTaskContext) {
    	USER_TASK_CONTEXT_HANDLE.set(segment, 0L, userTaskContext);
    	return this;
    }
    
    /// ```
    /// User context that is provided to enqueueTask and finishTask
    /// ```
    public @Nullable MemorySegment userTaskContext() {
    	MemorySegment segment = (MemorySegment) USER_TASK_CONTEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #userData()
    public WorldDef userData(MemorySegment userData) {
    	USER_DATA_HANDLE.set(segment, 0L, userData);
    	return this;
    }
    
    /// ```
    /// User data associated with a world
    /// ```
    public @Nullable MemorySegment userData() {
    	MemorySegment segment = (MemorySegment) USER_DATA_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #createDebugShape()
    public WorldDef createDebugShape(CreateDebugShapeCallback createDebugShape) {
    	CREATE_DEBUG_SHAPE_HANDLE.set(segment, 0L, createDebugShape.memorySegment());
    	return this;
    }
    
    /// ```
    /// Used to create debug draw shapes. This is called when a shape is
    /// first drawn using b3DebugDraw.
    /// ```
    public @Nullable CreateDebugShapeCallback createDebugShape() {
    	MemorySegment segment = (MemorySegment) CREATE_DEBUG_SHAPE_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return CreateDebugShapeCallback.get(segment);
    }
    
    /// @see #destroyDebugShape()
    public WorldDef destroyDebugShape(DestroyDebugShapeCallback destroyDebugShape) {
    	DESTROY_DEBUG_SHAPE_HANDLE.set(segment, 0L, destroyDebugShape.memorySegment());
    	return this;
    }
    
    /// ```
    /// Used to destroy debug draw shapes. This is called when a shape is modified or destroyed.
    /// ```
    public @Nullable DestroyDebugShapeCallback destroyDebugShape() {
    	MemorySegment segment = (MemorySegment) DESTROY_DEBUG_SHAPE_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return DestroyDebugShapeCallback.get(segment);
    }
    
    /// @see #userDebugShapeContext()
    public WorldDef userDebugShapeContext(MemorySegment userDebugShapeContext) {
    	USER_DEBUG_SHAPE_CONTEXT_HANDLE.set(segment, 0L, userDebugShapeContext);
    	return this;
    }
    
    /// ```
    /// This is passed to the debug shape callbacks to provide a user context.
    /// ```
    public @Nullable MemorySegment userDebugShapeContext() {
    	MemorySegment segment = (MemorySegment) USER_DEBUG_SHAPE_CONTEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #internalValue()
    public WorldDef internalValue(int internalValue) {
    	INTERNAL_VALUE_HANDLE.set(segment, 0L, internalValue);
    	return this;
    }
    
    /// ```
    /// Used internally to detect a valid definition. DO NOT SET.
    /// ```
    public int internalValue() {
    	return (int) INTERNAL_VALUE_HANDLE.get(segment, 0L);
    }
    
    /// @see #gravity()
    public WorldDef gravity(Consumer<Vec3> consumer) {
    	consumer.accept(gravity);
    	return this;
    }
    
    /// @see #gravity()
    public WorldDef gravity(Vec3 other) {
    	gravity.set(other);
    	return this;
    }
    
    /// ```
    /// Gravity vector. Box3D has no up-vector defined.
    /// ```
    public Vec3 gravity() {
    	return gravity;
    }
    
    /// @see #capacity()
    public WorldDef capacity(Consumer<Capacity> consumer) {
    	consumer.accept(capacity);
    	return this;
    }
    
    /// @see #capacity()
    public WorldDef capacity(Capacity other) {
    	capacity.set(other);
    	return this;
    }
    
    /// ```
    /// Optional initial capacities
    /// ```
    public Capacity capacity() {
    	return capacity;
    }
    
    @Override
    public WorldDef set(WorldDef other) {
        return set(other.segment);
    }
    
    @Override
    public WorldDef set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<WorldDef> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<WorldDef> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new WorldDef(segment),
            count
        );
    }
    
    public static NativeStructArray<WorldDef> array(Arena arena, WorldDef... structs) {
        NativeStructArray<WorldDef> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new WorldDef(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<WorldDef> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new WorldDef(segment)
        );
    }
    
}