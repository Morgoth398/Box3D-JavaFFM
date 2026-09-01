/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.box3d.world;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.invoke.MethodHandle;
import org.jspecify.annotations.Nullable;
import volucris.bindings.box3d.Counters;
import volucris.bindings.box3d.Profile;
import volucris.bindings.box3d.characterMover.MoverFilterFcn;
import volucris.bindings.box3d.characterMover.PlaneResultFcn;
import volucris.bindings.box3d.debugDraw.DebugDraw;
import volucris.bindings.box3d.dynamicTree.TreeStats;
import volucris.bindings.box3d.events.BodyEvents;
import volucris.bindings.box3d.events.ContactEvents;
import volucris.bindings.box3d.events.JointEvents;
import volucris.bindings.box3d.events.SensorEvents;
import volucris.bindings.box3d.geometry.Capsule;
import volucris.bindings.box3d.math.AABB;
import volucris.bindings.box3d.math.Vec3;
import volucris.bindings.box3d.query.QueryFilter;
import volucris.bindings.box3d.query.RayResult;
import volucris.bindings.box3d.query.ShapeProxy;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class World {

    private static final LazyConstant<MethodHandle> B3_CREATE_WORLD;
    private static final LazyConstant<MethodHandle> B3_DESTROY_WORLD;
    private static final LazyConstant<MethodHandle> B3_GET_WORLD_COUNT;
    private static final LazyConstant<MethodHandle> B3_GET_MAX_WORLD_COUNT;
    private static final LazyConstant<MethodHandle> B3_WORLD_IS_VALID;
    private static final LazyConstant<MethodHandle> B3_WORLD_STEP;
    private static final LazyConstant<MethodHandle> B3_WORLD_DRAW;
    private static final LazyConstant<MethodHandle> B3_WORLD_GET_BOUNDS;
    private static final LazyConstant<MethodHandle> B3_WORLD_GET_BODY_EVENTS;
    private static final LazyConstant<MethodHandle> B3_WORLD_GET_SENSOR_EVENTS;
    private static final LazyConstant<MethodHandle> B3_WORLD_GET_CONTACT_EVENTS;
    private static final LazyConstant<MethodHandle> B3_WORLD_GET_JOINT_EVENTS;
    private static final LazyConstant<MethodHandle> B3_WORLD_OVERLAP_AABB;
    private static final LazyConstant<MethodHandle> B3_WORLD_OVERLAP_SHAPE;
    private static final LazyConstant<MethodHandle> B3_WORLD_CAST_RAY;
    private static final LazyConstant<MethodHandle> B3_WORLD_CAST_RAY_CLOSEST;
    private static final LazyConstant<MethodHandle> B3_WORLD_CAST_SHAPE;
    private static final LazyConstant<MethodHandle> B3_WORLD_CAST_MOVER;
    private static final LazyConstant<MethodHandle> B3_WORLD_COLLIDE_MOVER;
    private static final LazyConstant<MethodHandle> B3_WORLD_ENABLE_SLEEPING;
    private static final LazyConstant<MethodHandle> B3_WORLD_IS_SLEEPING_ENABLED;
    private static final LazyConstant<MethodHandle> B3_WORLD_ENABLE_CONTINUOUS;
    private static final LazyConstant<MethodHandle> B3_WORLD_IS_CONTINUOUS_ENABLED;
    private static final LazyConstant<MethodHandle> B3_WORLD_SET_RESTITUTION_THRESHOLD;
    private static final LazyConstant<MethodHandle> B3_WORLD_GET_RESTITUTION_THRESHOLD;
    private static final LazyConstant<MethodHandle> B3_WORLD_SET_HIT_EVENT_THRESHOLD;
    private static final LazyConstant<MethodHandle> B3_WORLD_GET_HIT_EVENT_THRESHOLD;
    private static final LazyConstant<MethodHandle> B3_WORLD_SET_CUSTOM_FILTER_CALLBACK;
    private static final LazyConstant<MethodHandle> B3_WORLD_SET_PRE_SOLVE_CALLBACK;
    private static final LazyConstant<MethodHandle> B3_WORLD_SET_GRAVITY;
    private static final LazyConstant<MethodHandle> B3_WORLD_GET_GRAVITY;
    private static final LazyConstant<MethodHandle> B3_WORLD_EXPLODE;
    private static final LazyConstant<MethodHandle> B3_WORLD_SET_CONTACT_TUNING;
    private static final LazyConstant<MethodHandle> B3_WORLD_SET_CONTACT_RECYCLE_DISTANCE;
    private static final LazyConstant<MethodHandle> B3_WORLD_GET_CONTACT_RECYCLE_DISTANCE;
    private static final LazyConstant<MethodHandle> B3_WORLD_SET_MAXIMUM_LINEAR_SPEED;
    private static final LazyConstant<MethodHandle> B3_WORLD_GET_MAXIMUM_LINEAR_SPEED;
    private static final LazyConstant<MethodHandle> B3_WORLD_ENABLE_WARM_STARTING;
    private static final LazyConstant<MethodHandle> B3_WORLD_IS_WARM_STARTING_ENABLED;
    private static final LazyConstant<MethodHandle> B3_WORLD_GET_AWAKE_BODY_COUNT;
    private static final LazyConstant<MethodHandle> B3_WORLD_GET_PROFILE;
    private static final LazyConstant<MethodHandle> B3_WORLD_GET_COUNTERS;
    private static final LazyConstant<MethodHandle> B3_WORLD_GET_MAX_CAPACITY;
    private static final LazyConstant<MethodHandle> B3_WORLD_SET_USER_DATA;
    private static final LazyConstant<MethodHandle> B3_WORLD_GET_USER_DATA;
    private static final LazyConstant<MethodHandle> B3_WORLD_SET_FRICTION_CALLBACK;
    private static final LazyConstant<MethodHandle> B3_WORLD_SET_RESTITUTION_CALLBACK;
    private static final LazyConstant<MethodHandle> B3_WORLD_SET_WORKER_COUNT;
    private static final LazyConstant<MethodHandle> B3_WORLD_GET_WORKER_COUNT;
    private static final LazyConstant<MethodHandle> B3_WORLD_DUMP_MEMORY_STATS;
    private static final LazyConstant<MethodHandle> B3_WORLD_DUMP_SHAPE_BOUNDS;
    private static final LazyConstant<MethodHandle> B3_WORLD_REBUILD_STATIC_TREE;
    private static final LazyConstant<MethodHandle> B3_WORLD_ENABLE_SPECULATIVE;
    private static final LazyConstant<MethodHandle> B3_WORLD_DUMP_AWAKE;
    private static final LazyConstant<MethodHandle> B3_WORLD_DUMP;

    static {
        //@formatter:off
        B3_CREATE_WORLD = downcallHandle("b3CreateWorld", WorldId.LAYOUT, UNBOUNDED_ADDRESS);
        B3_DESTROY_WORLD = downcallHandleVoid("b3DestroyWorld", WorldId.LAYOUT);
        B3_GET_WORLD_COUNT = downcallHandle("b3GetWorldCount", JAVA_INT);
        B3_GET_MAX_WORLD_COUNT = downcallHandle("b3GetMaxWorldCount", JAVA_INT);
        B3_WORLD_IS_VALID = downcallHandle("b3World_IsValid", JAVA_BOOLEAN, WorldId.LAYOUT);
        B3_WORLD_STEP = downcallHandleVoid("b3World_Step", WorldId.LAYOUT, JAVA_FLOAT, JAVA_INT);
        B3_WORLD_DRAW = downcallHandleVoid("b3World_Draw", WorldId.LAYOUT, UNBOUNDED_ADDRESS, JAVA_LONG);
        B3_WORLD_GET_BOUNDS = downcallHandle("b3World_GetBounds", AABB.LAYOUT, WorldId.LAYOUT);
        B3_WORLD_GET_BODY_EVENTS = downcallHandle("b3World_GetBodyEvents", BodyEvents.LAYOUT, WorldId.LAYOUT);
        B3_WORLD_GET_SENSOR_EVENTS = downcallHandle("b3World_GetSensorEvents", SensorEvents.LAYOUT, WorldId.LAYOUT);
        B3_WORLD_GET_CONTACT_EVENTS = downcallHandle("b3World_GetContactEvents", ContactEvents.LAYOUT, WorldId.LAYOUT);
        B3_WORLD_GET_JOINT_EVENTS = downcallHandle("b3World_GetJointEvents", JointEvents.LAYOUT, WorldId.LAYOUT);
        B3_WORLD_OVERLAP_AABB = downcallHandle("b3World_OverlapAABB", TreeStats.LAYOUT, WorldId.LAYOUT, AABB.LAYOUT, QueryFilter.LAYOUT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        B3_WORLD_OVERLAP_SHAPE = downcallHandle("b3World_OverlapShape", TreeStats.LAYOUT, WorldId.LAYOUT, Vec3.LAYOUT, UNBOUNDED_ADDRESS, QueryFilter.LAYOUT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        B3_WORLD_CAST_RAY = downcallHandle("b3World_CastRay", TreeStats.LAYOUT, WorldId.LAYOUT, Vec3.LAYOUT, Vec3.LAYOUT, QueryFilter.LAYOUT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        B3_WORLD_CAST_RAY_CLOSEST = downcallHandle("b3World_CastRayClosest", RayResult.LAYOUT, WorldId.LAYOUT, Vec3.LAYOUT, Vec3.LAYOUT, QueryFilter.LAYOUT);
        B3_WORLD_CAST_SHAPE = downcallHandle("b3World_CastShape", TreeStats.LAYOUT, WorldId.LAYOUT, Vec3.LAYOUT, UNBOUNDED_ADDRESS, Vec3.LAYOUT, QueryFilter.LAYOUT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        B3_WORLD_CAST_MOVER = downcallHandle("b3World_CastMover", JAVA_FLOAT, WorldId.LAYOUT, Vec3.LAYOUT, UNBOUNDED_ADDRESS, Vec3.LAYOUT, QueryFilter.LAYOUT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        B3_WORLD_COLLIDE_MOVER = downcallHandleVoid("b3World_CollideMover", WorldId.LAYOUT, Vec3.LAYOUT, UNBOUNDED_ADDRESS, QueryFilter.LAYOUT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        B3_WORLD_ENABLE_SLEEPING = downcallHandleVoid("b3World_EnableSleeping", WorldId.LAYOUT, JAVA_BOOLEAN);
        B3_WORLD_IS_SLEEPING_ENABLED = downcallHandle("b3World_IsSleepingEnabled", JAVA_BOOLEAN, WorldId.LAYOUT);
        B3_WORLD_ENABLE_CONTINUOUS = downcallHandleVoid("b3World_EnableContinuous", WorldId.LAYOUT, JAVA_BOOLEAN);
        B3_WORLD_IS_CONTINUOUS_ENABLED = downcallHandle("b3World_IsContinuousEnabled", JAVA_BOOLEAN, WorldId.LAYOUT);
        B3_WORLD_SET_RESTITUTION_THRESHOLD = downcallHandleVoid("b3World_SetRestitutionThreshold", WorldId.LAYOUT, JAVA_FLOAT);
        B3_WORLD_GET_RESTITUTION_THRESHOLD = downcallHandle("b3World_GetRestitutionThreshold", JAVA_FLOAT, WorldId.LAYOUT);
        B3_WORLD_SET_HIT_EVENT_THRESHOLD = downcallHandleVoid("b3World_SetHitEventThreshold", WorldId.LAYOUT, JAVA_FLOAT);
        B3_WORLD_GET_HIT_EVENT_THRESHOLD = downcallHandle("b3World_GetHitEventThreshold", JAVA_FLOAT, WorldId.LAYOUT);
        B3_WORLD_SET_CUSTOM_FILTER_CALLBACK = downcallHandleVoid("b3World_SetCustomFilterCallback", WorldId.LAYOUT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        B3_WORLD_SET_PRE_SOLVE_CALLBACK = downcallHandleVoid("b3World_SetPreSolveCallback", WorldId.LAYOUT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        B3_WORLD_SET_GRAVITY = downcallHandleVoid("b3World_SetGravity", WorldId.LAYOUT, Vec3.LAYOUT);
        B3_WORLD_GET_GRAVITY = downcallHandle("b3World_GetGravity", Vec3.LAYOUT, WorldId.LAYOUT);
        B3_WORLD_EXPLODE = downcallHandleVoid("b3World_Explode", WorldId.LAYOUT, UNBOUNDED_ADDRESS);
        B3_WORLD_SET_CONTACT_TUNING = downcallHandleVoid("b3World_SetContactTuning", WorldId.LAYOUT, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT);
        B3_WORLD_SET_CONTACT_RECYCLE_DISTANCE = downcallHandleVoid("b3World_SetContactRecycleDistance", WorldId.LAYOUT, JAVA_FLOAT);
        B3_WORLD_GET_CONTACT_RECYCLE_DISTANCE = downcallHandle("b3World_GetContactRecycleDistance", JAVA_FLOAT, WorldId.LAYOUT);
        B3_WORLD_SET_MAXIMUM_LINEAR_SPEED = downcallHandleVoid("b3World_SetMaximumLinearSpeed", WorldId.LAYOUT, JAVA_FLOAT);
        B3_WORLD_GET_MAXIMUM_LINEAR_SPEED = downcallHandle("b3World_GetMaximumLinearSpeed", JAVA_FLOAT, WorldId.LAYOUT);
        B3_WORLD_ENABLE_WARM_STARTING = downcallHandleVoid("b3World_EnableWarmStarting", WorldId.LAYOUT, JAVA_BOOLEAN);
        B3_WORLD_IS_WARM_STARTING_ENABLED = downcallHandle("b3World_IsWarmStartingEnabled", JAVA_BOOLEAN, WorldId.LAYOUT);
        B3_WORLD_GET_AWAKE_BODY_COUNT = downcallHandle("b3World_GetAwakeBodyCount", JAVA_INT, WorldId.LAYOUT);
        B3_WORLD_GET_PROFILE = downcallHandle("b3World_GetProfile", Profile.LAYOUT, WorldId.LAYOUT);
        B3_WORLD_GET_COUNTERS = downcallHandle("b3World_GetCounters", Counters.LAYOUT, WorldId.LAYOUT);
        B3_WORLD_GET_MAX_CAPACITY = downcallHandle("b3World_GetMaxCapacity", Capacity.LAYOUT, WorldId.LAYOUT);
        B3_WORLD_SET_USER_DATA = downcallHandleVoid("b3World_SetUserData", WorldId.LAYOUT, UNBOUNDED_ADDRESS);
        B3_WORLD_GET_USER_DATA = downcallHandle("b3World_GetUserData", UNBOUNDED_ADDRESS, WorldId.LAYOUT);
        B3_WORLD_SET_FRICTION_CALLBACK = downcallHandleVoid("b3World_SetFrictionCallback", WorldId.LAYOUT, UNBOUNDED_ADDRESS);
        B3_WORLD_SET_RESTITUTION_CALLBACK = downcallHandleVoid("b3World_SetRestitutionCallback", WorldId.LAYOUT, UNBOUNDED_ADDRESS);
        B3_WORLD_SET_WORKER_COUNT = downcallHandleVoid("b3World_SetWorkerCount", WorldId.LAYOUT, JAVA_INT);
        B3_WORLD_GET_WORKER_COUNT = downcallHandle("b3World_GetWorkerCount", JAVA_INT, WorldId.LAYOUT);
        B3_WORLD_DUMP_MEMORY_STATS = downcallHandleVoid("b3World_DumpMemoryStats", WorldId.LAYOUT);
        B3_WORLD_DUMP_SHAPE_BOUNDS = downcallHandleVoid("b3World_DumpShapeBounds", WorldId.LAYOUT, JAVA_INT);
        B3_WORLD_REBUILD_STATIC_TREE = downcallHandleVoid("b3World_RebuildStaticTree", WorldId.LAYOUT);
        B3_WORLD_ENABLE_SPECULATIVE = downcallHandleVoid("b3World_EnableSpeculative", WorldId.LAYOUT, JAVA_BOOLEAN);
        B3_WORLD_DUMP_AWAKE = downcallHandleVoid("b3World_DumpAwake", WorldId.LAYOUT);
        B3_WORLD_DUMP = downcallHandleVoid("b3World_Dump", WorldId.LAYOUT);
        //@formatter:on
    }

    private World() {
    }

    /// ```
    /// Create a world for rigid body simulation. A world contains bodies, shapes, and constraints. You may create
    /// up to 128 worlds. Each world is completely independent and may be simulated in parallel.
    /// @return the world id.
    /// ```
    public static MemorySegment createWorld(
    	SegmentAllocator allocator,
    	MemorySegment def
    ) {
    	MethodHandle method = B3_CREATE_WORLD.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			def
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#createWorld].
    public static @Nullable WorldId createWorld(
    	SegmentAllocator allocator,
    	WorldDef def
    ) {
    	MemorySegment segment = createWorld(
    		allocator,
    		def.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new WorldId(segment);
    }
    
    /// ```
    /// Destroy a world
    /// ```
    public static void destroyWorld(
    	MemorySegment worldId
    ) {
    	MethodHandle method = B3_DESTROY_WORLD.get();
    	try {
    		 method.invokeExact(
    			worldId
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#destroyWorld].
    public static void destroyWorld(
    	WorldId worldId
    ) {
    	destroyWorld(
    		worldId.memorySegment()
    	);
    }
    
    /// ```
    /// Get the current number of worlds
    /// ```
    public static int getWorldCount() {
    	MethodHandle method = B3_GET_WORLD_COUNT.get();
    	try {
    		return (int) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Get the maximum number of simultaneous worlds that have been created
    /// ```
    public static int getMaxWorldCount() {
    	MethodHandle method = B3_GET_MAX_WORLD_COUNT.get();
    	try {
    		return (int) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// World id validation. Provides validation for up to 64K allocations.
    /// ```
    public static boolean isValid(
    	MemorySegment id
    ) {
    	MethodHandle method = B3_WORLD_IS_VALID.get();
    	try {
    		return (boolean) method.invokeExact(
    			id
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#isValid].
    public static boolean isValid(
    	WorldId id
    ) {
    	return isValid(
    		id.memorySegment()
    	);
    }
    
    /// ```
    /// Simulate a world for one time step. This performs collision detection, integration, and constraint solution.
    /// @param worldId The world to simulate
    /// @param timeStep The amount of time to simulate, this should be a fixed number. Usually 1/60.
    /// @param subStepCount The number of sub-steps, increasing the sub-step count can increase accuracy. Usually 4.
    /// ```
    public static void step(
    	MemorySegment worldId,
    	float timeStep,
    	int subStepCount
    ) {
    	MethodHandle method = B3_WORLD_STEP.get();
    	try {
    		 method.invokeExact(
    			worldId,
    			timeStep,
    			subStepCount
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#step].
    public static void step(
    	WorldId worldId,
    	float timeStep,
    	int subStepCount
    ) {
    	step(
    		worldId.memorySegment(),
    		timeStep,
    		subStepCount
    	);
    }
    
    /// ```
    /// Call this to draw shapes and other debug draw data
    /// ```
    public static void draw(
    	MemorySegment worldId,
    	MemorySegment draw,
    	long maskBits
    ) {
    	MethodHandle method = B3_WORLD_DRAW.get();
    	try {
    		 method.invokeExact(
    			worldId,
    			draw,
    			maskBits
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#draw].
    public static void draw(
    	WorldId worldId,
    	DebugDraw draw,
    	long maskBits
    ) {
    	draw(
    		worldId.memorySegment(),
    		draw.memorySegment(),
    		maskBits
    	);
    }
    
    /// ```
    /// Get the world's bounds. This is the bounding box that covers the current simulation. May have a small
    /// amount of padding.
    /// ```
    public static MemorySegment getBounds(
    	SegmentAllocator allocator,
    	MemorySegment worldId
    ) {
    	MethodHandle method = B3_WORLD_GET_BOUNDS.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			worldId
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getBounds].
    public static @Nullable AABB getBounds(
    	SegmentAllocator allocator,
    	WorldId worldId
    ) {
    	MemorySegment segment = getBounds(
    		allocator,
    		worldId.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new AABB(segment);
    }
    
    /// ```
    /// Get the body events for the current time step. The event data is transient. Do not store a reference to this data.
    /// ```
    public static MemorySegment getBodyEvents(
    	SegmentAllocator allocator,
    	MemorySegment worldId
    ) {
    	MethodHandle method = B3_WORLD_GET_BODY_EVENTS.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			worldId
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getBodyEvents].
    public static @Nullable BodyEvents getBodyEvents(
    	SegmentAllocator allocator,
    	WorldId worldId
    ) {
    	MemorySegment segment = getBodyEvents(
    		allocator,
    		worldId.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new BodyEvents(segment);
    }
    
    /// ```
    /// Get sensor events for the current time step. The event data is transient. Do not store a reference to this data.
    /// ```
    public static MemorySegment getSensorEvents(
    	SegmentAllocator allocator,
    	MemorySegment worldId
    ) {
    	MethodHandle method = B3_WORLD_GET_SENSOR_EVENTS.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			worldId
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getSensorEvents].
    public static @Nullable SensorEvents getSensorEvents(
    	SegmentAllocator allocator,
    	WorldId worldId
    ) {
    	MemorySegment segment = getSensorEvents(
    		allocator,
    		worldId.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new SensorEvents(segment);
    }
    
    /// ```
    /// Get contact events for this current time step. The event data is transient. Do not store a reference to this data.
    /// ```
    public static MemorySegment getContactEvents(
    	SegmentAllocator allocator,
    	MemorySegment worldId
    ) {
    	MethodHandle method = B3_WORLD_GET_CONTACT_EVENTS.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			worldId
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getContactEvents].
    public static @Nullable ContactEvents getContactEvents(
    	SegmentAllocator allocator,
    	WorldId worldId
    ) {
    	MemorySegment segment = getContactEvents(
    		allocator,
    		worldId.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new ContactEvents(segment);
    }
    
    /// ```
    /// Get the joint events for the current time step. The event data is transient. Do not store a reference to this data.
    /// ```
    public static MemorySegment getJointEvents(
    	SegmentAllocator allocator,
    	MemorySegment worldId
    ) {
    	MethodHandle method = B3_WORLD_GET_JOINT_EVENTS.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			worldId
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getJointEvents].
    public static @Nullable JointEvents getJointEvents(
    	SegmentAllocator allocator,
    	WorldId worldId
    ) {
    	MemorySegment segment = getJointEvents(
    		allocator,
    		worldId.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new JointEvents(segment);
    }
    
    /// ```
    /// Overlap test for all shapes that *potentially* overlap the provided AABB
    /// ```
    public static MemorySegment overlapAABB(
    	SegmentAllocator allocator,
    	MemorySegment worldId,
    	MemorySegment aabb,
    	MemorySegment filter,
    	MemorySegment fcn,
    	MemorySegment context
    ) {
    	MethodHandle method = B3_WORLD_OVERLAP_AABB.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			worldId,
    			aabb,
    			filter,
    			fcn,
    			context
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#overlapAABB].
    public static @Nullable TreeStats overlapAABB(
    	SegmentAllocator allocator,
    	WorldId worldId,
    	AABB aabb,
    	QueryFilter filter,
    	OverlapResultFcn fcn,
    	MemorySegment context
    ) {
    	MemorySegment segment = overlapAABB(
    		allocator,
    		worldId.memorySegment(),
    		aabb.memorySegment(),
    		filter.memorySegment(),
    		fcn.memorySegment(),
    		context
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new TreeStats(segment);
    }
    
    /// ```
    /// Overlap test for all shapes that overlap the provided shape proxy. The proxy points are relative
    /// to the world origin, which lets the query stay precise far from the world origin.
    /// ```
    public static MemorySegment overlapShape(
    	SegmentAllocator allocator,
    	MemorySegment worldId,
    	MemorySegment origin,
    	MemorySegment proxy,
    	MemorySegment filter,
    	MemorySegment fcn,
    	MemorySegment context
    ) {
    	MethodHandle method = B3_WORLD_OVERLAP_SHAPE.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			worldId,
    			origin,
    			proxy,
    			filter,
    			fcn,
    			context
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#overlapShape].
    public static @Nullable TreeStats overlapShape(
    	SegmentAllocator allocator,
    	WorldId worldId,
    	Vec3 origin,
    	ShapeProxy proxy,
    	QueryFilter filter,
    	OverlapResultFcn fcn,
    	MemorySegment context
    ) {
    	MemorySegment segment = overlapShape(
    		allocator,
    		worldId.memorySegment(),
    		origin.memorySegment(),
    		proxy.memorySegment(),
    		filter.memorySegment(),
    		fcn.memorySegment(),
    		context
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new TreeStats(segment);
    }
    
    /// ```
    /// Cast a ray into the world to collect shapes in the path of the ray.
    /// Your callback function controls whether you get the closest point, any point, or n-points.
    /// @note The callback function may receive shapes in any order
    /// @param worldId The world to cast the ray against
    /// @param origin The start point of the ray
    /// @param translation The translation of the ray from the start point to the end point
    /// @param filter Contains bit flags to filter unwanted shapes from the results
    /// @param fcn A user implemented callback function
    /// @param context A user context that is passed along to the callback function
    /// @return traversal performance counters
    /// ```
    public static MemorySegment castRay(
    	SegmentAllocator allocator,
    	MemorySegment worldId,
    	MemorySegment origin,
    	MemorySegment translation,
    	MemorySegment filter,
    	MemorySegment fcn,
    	MemorySegment context
    ) {
    	MethodHandle method = B3_WORLD_CAST_RAY.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			worldId,
    			origin,
    			translation,
    			filter,
    			fcn,
    			context
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#castRay].
    public static @Nullable TreeStats castRay(
    	SegmentAllocator allocator,
    	WorldId worldId,
    	Vec3 origin,
    	Vec3 translation,
    	QueryFilter filter,
    	CastResultFcn fcn,
    	MemorySegment context
    ) {
    	MemorySegment segment = castRay(
    		allocator,
    		worldId.memorySegment(),
    		origin.memorySegment(),
    		translation.memorySegment(),
    		filter.memorySegment(),
    		fcn.memorySegment(),
    		context
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new TreeStats(segment);
    }
    
    /// ```
    /// Cast a ray into the world to collect the closest hit. This is a convenience function. Ignores initial overlap.
    /// This is less general than b3World_CastRay() and does not allow for custom filtering.
    /// ```
    public static MemorySegment castRayClosest(
    	SegmentAllocator allocator,
    	MemorySegment worldId,
    	MemorySegment origin,
    	MemorySegment translation,
    	MemorySegment filter
    ) {
    	MethodHandle method = B3_WORLD_CAST_RAY_CLOSEST.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			worldId,
    			origin,
    			translation,
    			filter
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#castRayClosest].
    public static @Nullable RayResult castRayClosest(
    	SegmentAllocator allocator,
    	WorldId worldId,
    	Vec3 origin,
    	Vec3 translation,
    	QueryFilter filter
    ) {
    	MemorySegment segment = castRayClosest(
    		allocator,
    		worldId.memorySegment(),
    		origin.memorySegment(),
    		translation.memorySegment(),
    		filter.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new RayResult(segment);
    }
    
    /// ```
    /// Cast a shape through the world. Similar to a cast ray except that a shape is cast instead of a point.
    /// The proxy points are relative to the origin and the hit points come back as world positions, so the
    /// cast stays precise far from the world origin.
    /// @see b3World_CastRay
    /// ```
    public static MemorySegment castShape(
    	SegmentAllocator allocator,
    	MemorySegment worldId,
    	MemorySegment origin,
    	MemorySegment proxy,
    	MemorySegment translation,
    	MemorySegment filter,
    	MemorySegment fcn,
    	MemorySegment context
    ) {
    	MethodHandle method = B3_WORLD_CAST_SHAPE.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			worldId,
    			origin,
    			proxy,
    			translation,
    			filter,
    			fcn,
    			context
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#castShape].
    public static @Nullable TreeStats castShape(
    	SegmentAllocator allocator,
    	WorldId worldId,
    	Vec3 origin,
    	ShapeProxy proxy,
    	Vec3 translation,
    	QueryFilter filter,
    	CastResultFcn fcn,
    	MemorySegment context
    ) {
    	MemorySegment segment = castShape(
    		allocator,
    		worldId.memorySegment(),
    		origin.memorySegment(),
    		proxy.memorySegment(),
    		translation.memorySegment(),
    		filter.memorySegment(),
    		fcn.memorySegment(),
    		context
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new TreeStats(segment);
    }
    
    /// ```
    /// Cast a capsule mover through the world. This is a special shape cast that handles sliding along other shapes while reducing
    /// clipping. This is not a good source of information about what the mover is touching. Instead use the planes returned by
    /// b3World_CollideMover.
    /// @param worldId World to cast the mover against
    /// @param origin World position the mover capsule is relative to
    /// @param mover Capsule mover, relative to the origin
    /// @param translation Desired mover translation
    /// @param filter Contains bit flags to filter unwanted shapes from the results
    /// @param fcn Optional callback for custom shape filtering
    /// @param context A user context that is passed along to the callback function
    /// @return the translation fraction
    /// ```
    public static float castMover(
    	MemorySegment worldId,
    	MemorySegment origin,
    	MemorySegment mover,
    	MemorySegment translation,
    	MemorySegment filter,
    	MemorySegment fcn,
    	MemorySegment context
    ) {
    	MethodHandle method = B3_WORLD_CAST_MOVER.get();
    	try {
    		return (float) method.invokeExact(
    			worldId,
    			origin,
    			mover,
    			translation,
    			filter,
    			fcn,
    			context
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#castMover].
    public static float castMover(
    	WorldId worldId,
    	Vec3 origin,
    	Capsule mover,
    	Vec3 translation,
    	QueryFilter filter,
    	MoverFilterFcn fcn,
    	MemorySegment context
    ) {
    	return castMover(
    		worldId.memorySegment(),
    		origin.memorySegment(),
    		mover.memorySegment(),
    		translation.memorySegment(),
    		filter.memorySegment(),
    		fcn.memorySegment(),
    		context
    	);
    }
    
    /// ```
    /// Collide a capsule mover with the world, gathering collision planes that can be fed to b3SolvePlanes. Useful for
    /// kinematic character movement. The mover and the returned planes are relative to the origin.
    /// ```
    public static void collideMover(
    	MemorySegment worldId,
    	MemorySegment origin,
    	MemorySegment mover,
    	MemorySegment filter,
    	MemorySegment fcn,
    	MemorySegment context
    ) {
    	MethodHandle method = B3_WORLD_COLLIDE_MOVER.get();
    	try {
    		 method.invokeExact(
    			worldId,
    			origin,
    			mover,
    			filter,
    			fcn,
    			context
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#collideMover].
    public static void collideMover(
    	WorldId worldId,
    	Vec3 origin,
    	Capsule mover,
    	QueryFilter filter,
    	PlaneResultFcn fcn,
    	MemorySegment context
    ) {
    	collideMover(
    		worldId.memorySegment(),
    		origin.memorySegment(),
    		mover.memorySegment(),
    		filter.memorySegment(),
    		fcn.memorySegment(),
    		context
    	);
    }
    
    /// ```
    /// Enable/disable sleep. If your application does not need sleeping, you can gain some performance
    /// by disabling sleep completely at the world level.
    /// @see b3WorldDef
    /// ```
    public static void enableSleeping(
    	MemorySegment worldId,
    	boolean flag
    ) {
    	MethodHandle method = B3_WORLD_ENABLE_SLEEPING.get();
    	try {
    		 method.invokeExact(
    			worldId,
    			flag
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#enableSleeping].
    public static void enableSleeping(
    	WorldId worldId,
    	boolean flag
    ) {
    	enableSleeping(
    		worldId.memorySegment(),
    		flag
    	);
    }
    
    /// ```
    /// Is body sleeping enabled?
    /// ```
    public static boolean isSleepingEnabled(
    	MemorySegment worldId
    ) {
    	MethodHandle method = B3_WORLD_IS_SLEEPING_ENABLED.get();
    	try {
    		return (boolean) method.invokeExact(
    			worldId
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#isSleepingEnabled].
    public static boolean isSleepingEnabled(
    	WorldId worldId
    ) {
    	return isSleepingEnabled(
    		worldId.memorySegment()
    	);
    }
    
    /// ```
    /// Enable/disable continuous collision between dynamic and static bodies. Generally you should keep continuous
    /// collision enabled to prevent fast moving objects from going through static objects. The performance gain from
    /// disabling continuous collision is minor.
    /// @see b3WorldDef
    /// ```
    public static void enableContinuous(
    	MemorySegment worldId,
    	boolean flag
    ) {
    	MethodHandle method = B3_WORLD_ENABLE_CONTINUOUS.get();
    	try {
    		 method.invokeExact(
    			worldId,
    			flag
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#enableContinuous].
    public static void enableContinuous(
    	WorldId worldId,
    	boolean flag
    ) {
    	enableContinuous(
    		worldId.memorySegment(),
    		flag
    	);
    }
    
    /// ```
    /// Is continuous collision enabled?
    /// ```
    public static boolean isContinuousEnabled(
    	MemorySegment worldId
    ) {
    	MethodHandle method = B3_WORLD_IS_CONTINUOUS_ENABLED.get();
    	try {
    		return (boolean) method.invokeExact(
    			worldId
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#isContinuousEnabled].
    public static boolean isContinuousEnabled(
    	WorldId worldId
    ) {
    	return isContinuousEnabled(
    		worldId.memorySegment()
    	);
    }
    
    /// ```
    /// Adjust the restitution threshold. It is recommended not to make this value very small
    /// because it will prevent bodies from sleeping. Usually in meters per second.
    /// @see b3WorldDef
    /// ```
    public static void setRestitutionThreshold(
    	MemorySegment worldId,
    	float value
    ) {
    	MethodHandle method = B3_WORLD_SET_RESTITUTION_THRESHOLD.get();
    	try {
    		 method.invokeExact(
    			worldId,
    			value
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setRestitutionThreshold].
    public static void setRestitutionThreshold(
    	WorldId worldId,
    	float value
    ) {
    	setRestitutionThreshold(
    		worldId.memorySegment(),
    		value
    	);
    }
    
    /// ```
    /// Get the restitution speed threshold. Usually in meters per second.
    /// ```
    public static float getRestitutionThreshold(
    	MemorySegment worldId
    ) {
    	MethodHandle method = B3_WORLD_GET_RESTITUTION_THRESHOLD.get();
    	try {
    		return (float) method.invokeExact(
    			worldId
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getRestitutionThreshold].
    public static float getRestitutionThreshold(
    	WorldId worldId
    ) {
    	return getRestitutionThreshold(
    		worldId.memorySegment()
    	);
    }
    
    /// ```
    /// Adjust the hit event threshold. This controls the collision speed needed to generate a b3ContactHitEvent.
    /// Usually in meters per second.
    /// @see b3WorldDef::hitEventThreshold
    /// ```
    public static void setHitEventThreshold(
    	MemorySegment worldId,
    	float value
    ) {
    	MethodHandle method = B3_WORLD_SET_HIT_EVENT_THRESHOLD.get();
    	try {
    		 method.invokeExact(
    			worldId,
    			value
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setHitEventThreshold].
    public static void setHitEventThreshold(
    	WorldId worldId,
    	float value
    ) {
    	setHitEventThreshold(
    		worldId.memorySegment(),
    		value
    	);
    }
    
    /// ```
    /// Get the hit event speed threshold. Usually in meters per second.
    /// ```
    public static float getHitEventThreshold(
    	MemorySegment worldId
    ) {
    	MethodHandle method = B3_WORLD_GET_HIT_EVENT_THRESHOLD.get();
    	try {
    		return (float) method.invokeExact(
    			worldId
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getHitEventThreshold].
    public static float getHitEventThreshold(
    	WorldId worldId
    ) {
    	return getHitEventThreshold(
    		worldId.memorySegment()
    	);
    }
    
    /// ```
    /// Register the custom filter callback. This is optional.
    /// ```
    public static void setCustomFilterCallback(
    	MemorySegment worldId,
    	MemorySegment fcn,
    	MemorySegment context
    ) {
    	MethodHandle method = B3_WORLD_SET_CUSTOM_FILTER_CALLBACK.get();
    	try {
    		 method.invokeExact(
    			worldId,
    			fcn,
    			context
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setCustomFilterCallback].
    public static void setCustomFilterCallback(
    	WorldId worldId,
    	CustomFilterFcn fcn,
    	MemorySegment context
    ) {
    	setCustomFilterCallback(
    		worldId.memorySegment(),
    		fcn.memorySegment(),
    		context
    	);
    }
    
    /// ```
    /// Register the pre-solve callback. This is optional.
    /// ```
    public static void setPreSolveCallback(
    	MemorySegment worldId,
    	MemorySegment fcn,
    	MemorySegment context
    ) {
    	MethodHandle method = B3_WORLD_SET_PRE_SOLVE_CALLBACK.get();
    	try {
    		 method.invokeExact(
    			worldId,
    			fcn,
    			context
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setPreSolveCallback].
    public static void setPreSolveCallback(
    	WorldId worldId,
    	PreSolveFcn fcn,
    	MemorySegment context
    ) {
    	setPreSolveCallback(
    		worldId.memorySegment(),
    		fcn.memorySegment(),
    		context
    	);
    }
    
    /// ```
    /// Set the gravity vector for the entire world. Box3D has no concept of an up direction and this
    /// is left as a decision for the application. Usually in m/s^2.
    /// @see b3WorldDef
    /// ```
    public static void setGravity(
    	MemorySegment worldId,
    	MemorySegment gravity
    ) {
    	MethodHandle method = B3_WORLD_SET_GRAVITY.get();
    	try {
    		 method.invokeExact(
    			worldId,
    			gravity
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setGravity].
    public static void setGravity(
    	WorldId worldId,
    	Vec3 gravity
    ) {
    	setGravity(
    		worldId.memorySegment(),
    		gravity.memorySegment()
    	);
    }
    
    /// ```
    /// Get the gravity vector
    /// ```
    public static MemorySegment getGravity(
    	SegmentAllocator allocator,
    	MemorySegment worldId
    ) {
    	MethodHandle method = B3_WORLD_GET_GRAVITY.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			worldId
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getGravity].
    public static @Nullable Vec3 getGravity(
    	SegmentAllocator allocator,
    	WorldId worldId
    ) {
    	MemorySegment segment = getGravity(
    		allocator,
    		worldId.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new Vec3(segment);
    }
    
    /// ```
    /// Apply a radial explosion
    /// @param worldId The world id
    /// @param explosionDef The explosion definition
    /// ```
    public static void explode(
    	MemorySegment worldId,
    	MemorySegment explosionDef
    ) {
    	MethodHandle method = B3_WORLD_EXPLODE.get();
    	try {
    		 method.invokeExact(
    			worldId,
    			explosionDef
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#explode].
    public static void explode(
    	WorldId worldId,
    	ExplosionDef explosionDef
    ) {
    	explode(
    		worldId.memorySegment(),
    		explosionDef.memorySegment()
    	);
    }
    
    /// ```
    /// Adjust contact tuning parameters
    /// @param worldId The world id
    /// @param hertz The contact stiffness (cycles per second)
    /// @param dampingRatio The contact bounciness with 1 being critical damping (non-dimensional)
    /// @param contactSpeed The maximum contact constraint push out speed (meters per second)
    /// @note Advanced feature
    /// ```
    public static void setContactTuning(
    	MemorySegment worldId,
    	float hertz,
    	float dampingRatio,
    	float contactSpeed
    ) {
    	MethodHandle method = B3_WORLD_SET_CONTACT_TUNING.get();
    	try {
    		 method.invokeExact(
    			worldId,
    			hertz,
    			dampingRatio,
    			contactSpeed
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setContactTuning].
    public static void setContactTuning(
    	WorldId worldId,
    	float hertz,
    	float dampingRatio,
    	float contactSpeed
    ) {
    	setContactTuning(
    		worldId.memorySegment(),
    		hertz,
    		dampingRatio,
    		contactSpeed
    	);
    }
    
    /// ```
    /// Set the contact point recycling distance. Setting this to zero disables contact point recycling.
    /// Usually in meters.
    /// ```
    public static void setContactRecycleDistance(
    	MemorySegment worldId,
    	float recycleDistance
    ) {
    	MethodHandle method = B3_WORLD_SET_CONTACT_RECYCLE_DISTANCE.get();
    	try {
    		 method.invokeExact(
    			worldId,
    			recycleDistance
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setContactRecycleDistance].
    public static void setContactRecycleDistance(
    	WorldId worldId,
    	float recycleDistance
    ) {
    	setContactRecycleDistance(
    		worldId.memorySegment(),
    		recycleDistance
    	);
    }
    
    /// ```
    /// Get the contact point recycling distance. Usually in meters.
    /// ```
    public static float getContactRecycleDistance(
    	MemorySegment worldId
    ) {
    	MethodHandle method = B3_WORLD_GET_CONTACT_RECYCLE_DISTANCE.get();
    	try {
    		return (float) method.invokeExact(
    			worldId
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getContactRecycleDistance].
    public static float getContactRecycleDistance(
    	WorldId worldId
    ) {
    	return getContactRecycleDistance(
    		worldId.memorySegment()
    	);
    }
    
    /// ```
    /// Set the maximum linear speed. Usually in m/s.
    /// ```
    public static void setMaximumLinearSpeed(
    	MemorySegment worldId,
    	float maximumLinearSpeed
    ) {
    	MethodHandle method = B3_WORLD_SET_MAXIMUM_LINEAR_SPEED.get();
    	try {
    		 method.invokeExact(
    			worldId,
    			maximumLinearSpeed
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setMaximumLinearSpeed].
    public static void setMaximumLinearSpeed(
    	WorldId worldId,
    	float maximumLinearSpeed
    ) {
    	setMaximumLinearSpeed(
    		worldId.memorySegment(),
    		maximumLinearSpeed
    	);
    }
    
    /// ```
    /// Get the maximum linear speed. Usually in m/s.
    /// ```
    public static float getMaximumLinearSpeed(
    	MemorySegment worldId
    ) {
    	MethodHandle method = B3_WORLD_GET_MAXIMUM_LINEAR_SPEED.get();
    	try {
    		return (float) method.invokeExact(
    			worldId
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getMaximumLinearSpeed].
    public static float getMaximumLinearSpeed(
    	WorldId worldId
    ) {
    	return getMaximumLinearSpeed(
    		worldId.memorySegment()
    	);
    }
    
    /// ```
    /// Enable/disable constraint warm starting. Advanced feature for testing. Disabling
    /// warm starting greatly reduces stability and provides no performance gain.
    /// ```
    public static void enableWarmStarting(
    	MemorySegment worldId,
    	boolean flag
    ) {
    	MethodHandle method = B3_WORLD_ENABLE_WARM_STARTING.get();
    	try {
    		 method.invokeExact(
    			worldId,
    			flag
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#enableWarmStarting].
    public static void enableWarmStarting(
    	WorldId worldId,
    	boolean flag
    ) {
    	enableWarmStarting(
    		worldId.memorySegment(),
    		flag
    	);
    }
    
    /// ```
    /// Is constraint warm starting enabled?
    /// ```
    public static boolean isWarmStartingEnabled(
    	MemorySegment worldId
    ) {
    	MethodHandle method = B3_WORLD_IS_WARM_STARTING_ENABLED.get();
    	try {
    		return (boolean) method.invokeExact(
    			worldId
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#isWarmStartingEnabled].
    public static boolean isWarmStartingEnabled(
    	WorldId worldId
    ) {
    	return isWarmStartingEnabled(
    		worldId.memorySegment()
    	);
    }
    
    /// ```
    /// Get the number of awake bodies
    /// ```
    public static int getAwakeBodyCount(
    	MemorySegment worldId
    ) {
    	MethodHandle method = B3_WORLD_GET_AWAKE_BODY_COUNT.get();
    	try {
    		return (int) method.invokeExact(
    			worldId
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getAwakeBodyCount].
    public static int getAwakeBodyCount(
    	WorldId worldId
    ) {
    	return getAwakeBodyCount(
    		worldId.memorySegment()
    	);
    }
    
    /// ```
    /// Get the current world performance profile
    /// ```
    public static MemorySegment getProfile(
    	SegmentAllocator allocator,
    	MemorySegment worldId
    ) {
    	MethodHandle method = B3_WORLD_GET_PROFILE.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			worldId
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getProfile].
    public static @Nullable Profile getProfile(
    	SegmentAllocator allocator,
    	WorldId worldId
    ) {
    	MemorySegment segment = getProfile(
    		allocator,
    		worldId.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new Profile(segment);
    }
    
    /// ```
    /// Get world counters and sizes
    /// ```
    public static MemorySegment getCounters(
    	SegmentAllocator allocator,
    	MemorySegment worldId
    ) {
    	MethodHandle method = B3_WORLD_GET_COUNTERS.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			worldId
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getCounters].
    public static @Nullable Counters getCounters(
    	SegmentAllocator allocator,
    	WorldId worldId
    ) {
    	MemorySegment segment = getCounters(
    		allocator,
    		worldId.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new Counters(segment);
    }
    
    /// ```
    /// Get max capacity. This can be used with b3WorldDef to avoid run-time allocations and copies
    /// ```
    public static MemorySegment getMaxCapacity(
    	SegmentAllocator allocator,
    	MemorySegment worldId
    ) {
    	MethodHandle method = B3_WORLD_GET_MAX_CAPACITY.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			worldId
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getMaxCapacity].
    public static @Nullable Capacity getMaxCapacity(
    	SegmentAllocator allocator,
    	WorldId worldId
    ) {
    	MemorySegment segment = getMaxCapacity(
    		allocator,
    		worldId.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new Capacity(segment);
    }
    
    /// ```
    /// Set the user data pointer.
    /// ```
    public static void setUserData(
    	MemorySegment worldId,
    	MemorySegment userData
    ) {
    	MethodHandle method = B3_WORLD_SET_USER_DATA.get();
    	try {
    		 method.invokeExact(
    			worldId,
    			userData
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setUserData].
    public static void setUserData(
    	WorldId worldId,
    	MemorySegment userData
    ) {
    	setUserData(
    		worldId.memorySegment(),
    		userData
    	);
    }
    
    /// ```
    /// Get the user data pointer.
    /// ```
    public static MemorySegment getUserData(
    	MemorySegment worldId
    ) {
    	MethodHandle method = B3_WORLD_GET_USER_DATA.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			worldId
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getUserData].
    public static @Nullable MemorySegment getUserData(
    	WorldId worldId
    ) {
    	MemorySegment segment = getUserData(
    		worldId.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// ```
    /// Set the friction callback. Passing NULL resets to default.
    /// ```
    public static void setFrictionCallback(
    	MemorySegment worldId,
    	MemorySegment callback
    ) {
    	MethodHandle method = B3_WORLD_SET_FRICTION_CALLBACK.get();
    	try {
    		 method.invokeExact(
    			worldId,
    			callback
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setFrictionCallback].
    public static void setFrictionCallback(
    	WorldId worldId,
    	FrictionCallback callback
    ) {
    	setFrictionCallback(
    		worldId.memorySegment(),
    		callback.memorySegment()
    	);
    }
    
    /// ```
    /// Set the restitution callback. Passing NULL resets to default.
    /// ```
    public static void setRestitutionCallback(
    	MemorySegment worldId,
    	MemorySegment callback
    ) {
    	MethodHandle method = B3_WORLD_SET_RESTITUTION_CALLBACK.get();
    	try {
    		 method.invokeExact(
    			worldId,
    			callback
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setRestitutionCallback].
    public static void setRestitutionCallback(
    	WorldId worldId,
    	RestitutionCallback callback
    ) {
    	setRestitutionCallback(
    		worldId.memorySegment(),
    		callback.memorySegment()
    	);
    }
    
    /// ```
    /// Set the worker count. Must be in the range [1, B3_MAX_WORKERS]
    /// ```
    public static void setWorkerCount(
    	MemorySegment worldId,
    	int count
    ) {
    	MethodHandle method = B3_WORLD_SET_WORKER_COUNT.get();
    	try {
    		 method.invokeExact(
    			worldId,
    			count
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setWorkerCount].
    public static void setWorkerCount(
    	WorldId worldId,
    	int count
    ) {
    	setWorkerCount(
    		worldId.memorySegment(),
    		count
    	);
    }
    
    /// ```
    /// Get the worker count.
    /// ```
    public static int getWorkerCount(
    	MemorySegment worldId
    ) {
    	MethodHandle method = B3_WORLD_GET_WORKER_COUNT.get();
    	try {
    		return (int) method.invokeExact(
    			worldId
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getWorkerCount].
    public static int getWorkerCount(
    	WorldId worldId
    ) {
    	return getWorkerCount(
    		worldId.memorySegment()
    	);
    }
    
    /// ```
    /// Dump memory stats to log.
    /// ```
    public static void dumpMemoryStats(
    	MemorySegment worldId
    ) {
    	MethodHandle method = B3_WORLD_DUMP_MEMORY_STATS.get();
    	try {
    		 method.invokeExact(
    			worldId
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#dumpMemoryStats].
    public static void dumpMemoryStats(
    	WorldId worldId
    ) {
    	dumpMemoryStats(
    		worldId.memorySegment()
    	);
    }
    
    /// ```
    /// Dump shape bounds to box3d_bounds.txt
    /// ```
    public static void dumpShapeBounds(
    	MemorySegment worldId,
    	int type
    ) {
    	MethodHandle method = B3_WORLD_DUMP_SHAPE_BOUNDS.get();
    	try {
    		 method.invokeExact(
    			worldId,
    			type
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#dumpShapeBounds].
    public static void dumpShapeBounds(
    	WorldId worldId,
    	int type
    ) {
    	dumpShapeBounds(
    		worldId.memorySegment(),
    		type
    	);
    }
    
    /// ```
    /// This is for internal testing
    /// ```
    public static void rebuildStaticTree(
    	MemorySegment worldId
    ) {
    	MethodHandle method = B3_WORLD_REBUILD_STATIC_TREE.get();
    	try {
    		 method.invokeExact(
    			worldId
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#rebuildStaticTree].
    public static void rebuildStaticTree(
    	WorldId worldId
    ) {
    	rebuildStaticTree(
    		worldId.memorySegment()
    	);
    }
    
    /// ```
    /// This is for internal testing
    /// ```
    public static void enableSpeculative(
    	MemorySegment worldId,
    	boolean flag
    ) {
    	MethodHandle method = B3_WORLD_ENABLE_SPECULATIVE.get();
    	try {
    		 method.invokeExact(
    			worldId,
    			flag
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#enableSpeculative].
    public static void enableSpeculative(
    	WorldId worldId,
    	boolean flag
    ) {
    	enableSpeculative(
    		worldId.memorySegment(),
    		flag
    	);
    }
    
    /// ```
    /// Dump world to a text file. Saves only awake bodies and associated static bodies.
    /// Meshes are saved to binary b3m files.
    /// ```
    public static void dumpAwake(
    	MemorySegment worldId
    ) {
    	MethodHandle method = B3_WORLD_DUMP_AWAKE.get();
    	try {
    		 method.invokeExact(
    			worldId
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#dumpAwake].
    public static void dumpAwake(
    	WorldId worldId
    ) {
    	dumpAwake(
    		worldId.memorySegment()
    	);
    }
    
    /// ```
    /// Dump world to a text file. Meshes are saved to binary b3m files.
    /// ```
    public static void dump(
    	MemorySegment worldId
    ) {
    	MethodHandle method = B3_WORLD_DUMP.get();
    	try {
    		 method.invokeExact(
    			worldId
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#dump].
    public static void dump(
    	WorldId worldId
    ) {
    	dump(
    		worldId.memorySegment()
    	);
    }
    
}