/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.box3d;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;

/// ```
/// Counters that give details of the simulation size.
/// @ingroup world
/// ```
public final class Counters
		implements Struct<Counters> {

    public static final StructLayout LAYOUT;

    public static final VarHandle BODY_COUNT_HANDLE;
    public static final VarHandle SHAPE_COUNT_HANDLE;
    public static final VarHandle CONTACT_COUNT_HANDLE;
    public static final VarHandle JOINT_COUNT_HANDLE;
    public static final VarHandle ISLAND_COUNT_HANDLE;
    public static final VarHandle STACK_USED_HANDLE;
    public static final VarHandle ARENA_CAPACITY_HANDLE;
    public static final VarHandle STATIC_TREE_HEIGHT_HANDLE;
    public static final VarHandle TREE_HEIGHT_HANDLE;
    public static final VarHandle SAT_CALL_COUNT_HANDLE;
    public static final VarHandle SAT_CACHE_HIT_COUNT_HANDLE;
    public static final VarHandle BYTE_COUNT_HANDLE;
    public static final VarHandle TASK_COUNT_HANDLE;
    public static final VarHandle COLOR_COUNTS_HANDLE;
    public static final VarHandle MANIFOLD_COUNTS_HANDLE;
    public static final VarHandle AWAKE_CONTACT_COUNT_HANDLE;
    public static final VarHandle RECYCLED_CONTACT_COUNT_HANDLE;
    public static final VarHandle DISTANCE_ITERATIONS_HANDLE;
    public static final VarHandle PUSH_BACK_ITERATIONS_HANDLE;
    public static final VarHandle ROOT_ITERATIONS_HANDLE;

    public static final long BODY_COUNT_BYTE_OFFSET;
    public static final long SHAPE_COUNT_BYTE_OFFSET;
    public static final long CONTACT_COUNT_BYTE_OFFSET;
    public static final long JOINT_COUNT_BYTE_OFFSET;
    public static final long ISLAND_COUNT_BYTE_OFFSET;
    public static final long STACK_USED_BYTE_OFFSET;
    public static final long ARENA_CAPACITY_BYTE_OFFSET;
    public static final long STATIC_TREE_HEIGHT_BYTE_OFFSET;
    public static final long TREE_HEIGHT_BYTE_OFFSET;
    public static final long SAT_CALL_COUNT_BYTE_OFFSET;
    public static final long SAT_CACHE_HIT_COUNT_BYTE_OFFSET;
    public static final long BYTE_COUNT_BYTE_OFFSET;
    public static final long TASK_COUNT_BYTE_OFFSET;
    public static final long COLOR_COUNTS_BYTE_OFFSET;
    public static final long MANIFOLD_COUNTS_BYTE_OFFSET;
    public static final long AWAKE_CONTACT_COUNT_BYTE_OFFSET;
    public static final long RECYCLED_CONTACT_COUNT_BYTE_OFFSET;
    public static final long DISTANCE_ITERATIONS_BYTE_OFFSET;
    public static final long PUSH_BACK_ITERATIONS_BYTE_OFFSET;
    public static final long ROOT_ITERATIONS_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("bodyCount"),
            JAVA_INT.withName("shapeCount"),
            JAVA_INT.withName("contactCount"),
            JAVA_INT.withName("jointCount"),
            JAVA_INT.withName("islandCount"),
            JAVA_INT.withName("stackUsed"),
            JAVA_INT.withName("arenaCapacity"),
            JAVA_INT.withName("staticTreeHeight"),
            JAVA_INT.withName("treeHeight"),
            JAVA_INT.withName("satCallCount"),
            JAVA_INT.withName("satCacheHitCount"),
            JAVA_INT.withName("byteCount"),
            JAVA_INT.withName("taskCount"),
            MemoryLayout.sequenceLayout(24, JAVA_INT).withName("colorCounts"),
            MemoryLayout.sequenceLayout(8, JAVA_INT).withName("manifoldCounts"),
            JAVA_INT.withName("awakeContactCount"),
            JAVA_INT.withName("recycledContactCount"),
            JAVA_INT.withName("distanceIterations"),
            JAVA_INT.withName("pushBackIterations"),
            JAVA_INT.withName("rootIterations")
        ).withName("b3Counters").withByteAlignment(4);
        
        BODY_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("bodyCount"));
        SHAPE_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("shapeCount"));
        CONTACT_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("contactCount"));
        JOINT_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("jointCount"));
        ISLAND_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("islandCount"));
        STACK_USED_HANDLE = LAYOUT.varHandle(PathElement.groupElement("stackUsed"));
        ARENA_CAPACITY_HANDLE = LAYOUT.varHandle(PathElement.groupElement("arenaCapacity"));
        STATIC_TREE_HEIGHT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("staticTreeHeight"));
        TREE_HEIGHT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("treeHeight"));
        SAT_CALL_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("satCallCount"));
        SAT_CACHE_HIT_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("satCacheHitCount"));
        BYTE_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("byteCount"));
        TASK_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("taskCount"));
        COLOR_COUNTS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("colorCounts"), PathElement.sequenceElement());
        MANIFOLD_COUNTS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("manifoldCounts"), PathElement.sequenceElement());
        AWAKE_CONTACT_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("awakeContactCount"));
        RECYCLED_CONTACT_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("recycledContactCount"));
        DISTANCE_ITERATIONS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("distanceIterations"));
        PUSH_BACK_ITERATIONS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pushBackIterations"));
        ROOT_ITERATIONS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("rootIterations"));
        
        BODY_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("bodyCount"));
        SHAPE_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shapeCount"));
        CONTACT_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("contactCount"));
        JOINT_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("jointCount"));
        ISLAND_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("islandCount"));
        STACK_USED_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("stackUsed"));
        ARENA_CAPACITY_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("arenaCapacity"));
        STATIC_TREE_HEIGHT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("staticTreeHeight"));
        TREE_HEIGHT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("treeHeight"));
        SAT_CALL_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("satCallCount"));
        SAT_CACHE_HIT_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("satCacheHitCount"));
        BYTE_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("byteCount"));
        TASK_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("taskCount"));
        COLOR_COUNTS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("colorCounts"));
        MANIFOLD_COUNTS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("manifoldCounts"));
        AWAKE_CONTACT_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("awakeContactCount"));
        RECYCLED_CONTACT_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("recycledContactCount"));
        DISTANCE_ITERATIONS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("distanceIterations"));
        PUSH_BACK_ITERATIONS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pushBackIterations"));
        ROOT_ITERATIONS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("rootIterations"));
        //@formatter:on
    }

    public Counters() {
        this(Arena.ofAuto());
    }
    
    public Counters(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public Counters(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #bodyCount()
    public Counters bodyCount(int bodyCount) {
    	BODY_COUNT_HANDLE.set(segment, 0L, bodyCount);
    	return this;
    }
    
    public int bodyCount() {
    	return (int) BODY_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #shapeCount()
    public Counters shapeCount(int shapeCount) {
    	SHAPE_COUNT_HANDLE.set(segment, 0L, shapeCount);
    	return this;
    }
    
    public int shapeCount() {
    	return (int) SHAPE_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #contactCount()
    public Counters contactCount(int contactCount) {
    	CONTACT_COUNT_HANDLE.set(segment, 0L, contactCount);
    	return this;
    }
    
    public int contactCount() {
    	return (int) CONTACT_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #jointCount()
    public Counters jointCount(int jointCount) {
    	JOINT_COUNT_HANDLE.set(segment, 0L, jointCount);
    	return this;
    }
    
    public int jointCount() {
    	return (int) JOINT_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #islandCount()
    public Counters islandCount(int islandCount) {
    	ISLAND_COUNT_HANDLE.set(segment, 0L, islandCount);
    	return this;
    }
    
    public int islandCount() {
    	return (int) ISLAND_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #stackUsed()
    public Counters stackUsed(int stackUsed) {
    	STACK_USED_HANDLE.set(segment, 0L, stackUsed);
    	return this;
    }
    
    public int stackUsed() {
    	return (int) STACK_USED_HANDLE.get(segment, 0L);
    }
    
    /// @see #arenaCapacity()
    public Counters arenaCapacity(int arenaCapacity) {
    	ARENA_CAPACITY_HANDLE.set(segment, 0L, arenaCapacity);
    	return this;
    }
    
    public int arenaCapacity() {
    	return (int) ARENA_CAPACITY_HANDLE.get(segment, 0L);
    }
    
    /// @see #staticTreeHeight()
    public Counters staticTreeHeight(int staticTreeHeight) {
    	STATIC_TREE_HEIGHT_HANDLE.set(segment, 0L, staticTreeHeight);
    	return this;
    }
    
    public int staticTreeHeight() {
    	return (int) STATIC_TREE_HEIGHT_HANDLE.get(segment, 0L);
    }
    
    /// @see #treeHeight()
    public Counters treeHeight(int treeHeight) {
    	TREE_HEIGHT_HANDLE.set(segment, 0L, treeHeight);
    	return this;
    }
    
    public int treeHeight() {
    	return (int) TREE_HEIGHT_HANDLE.get(segment, 0L);
    }
    
    /// @see #satCallCount()
    public Counters satCallCount(int satCallCount) {
    	SAT_CALL_COUNT_HANDLE.set(segment, 0L, satCallCount);
    	return this;
    }
    
    public int satCallCount() {
    	return (int) SAT_CALL_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #satCacheHitCount()
    public Counters satCacheHitCount(int satCacheHitCount) {
    	SAT_CACHE_HIT_COUNT_HANDLE.set(segment, 0L, satCacheHitCount);
    	return this;
    }
    
    public int satCacheHitCount() {
    	return (int) SAT_CACHE_HIT_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #byteCount()
    public Counters byteCount(int byteCount) {
    	BYTE_COUNT_HANDLE.set(segment, 0L, byteCount);
    	return this;
    }
    
    public int byteCount() {
    	return (int) BYTE_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #taskCount()
    public Counters taskCount(int taskCount) {
    	TASK_COUNT_HANDLE.set(segment, 0L, taskCount);
    	return this;
    }
    
    public int taskCount() {
    	return (int) TASK_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #colorCounts(int)
    public Counters colorCounts(int colorCounts, int index0) {
    	COLOR_COUNTS_HANDLE.set(segment, 0L, index0, colorCounts);
    	return this;
    }
    
    public int colorCounts(int index0) {
    	return (int) COLOR_COUNTS_HANDLE.get(segment, 0L, index0);
    }
    
    /// @see #manifoldCounts(int)
    public Counters manifoldCounts(int manifoldCounts, int index0) {
    	MANIFOLD_COUNTS_HANDLE.set(segment, 0L, index0, manifoldCounts);
    	return this;
    }
    
    public int manifoldCounts(int index0) {
    	return (int) MANIFOLD_COUNTS_HANDLE.get(segment, 0L, index0);
    }
    
    /// @see #awakeContactCount()
    public Counters awakeContactCount(int awakeContactCount) {
    	AWAKE_CONTACT_COUNT_HANDLE.set(segment, 0L, awakeContactCount);
    	return this;
    }
    
    /// ```
    /// Number of contacts touched by the collide pass
    /// graph contacts + awake-set non-touching
    /// ```
    public int awakeContactCount() {
    	return (int) AWAKE_CONTACT_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #recycledContactCount()
    public Counters recycledContactCount(int recycledContactCount) {
    	RECYCLED_CONTACT_COUNT_HANDLE.set(segment, 0L, recycledContactCount);
    	return this;
    }
    
    /// ```
    /// Number of contacts recycled in the most recent step.
    /// ```
    public int recycledContactCount() {
    	return (int) RECYCLED_CONTACT_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #distanceIterations()
    public Counters distanceIterations(int distanceIterations) {
    	DISTANCE_ITERATIONS_HANDLE.set(segment, 0L, distanceIterations);
    	return this;
    }
    
    /// ```
    /// Maximum number of time of impact iterations
    /// ```
    public int distanceIterations() {
    	return (int) DISTANCE_ITERATIONS_HANDLE.get(segment, 0L);
    }
    
    /// @see #pushBackIterations()
    public Counters pushBackIterations(int pushBackIterations) {
    	PUSH_BACK_ITERATIONS_HANDLE.set(segment, 0L, pushBackIterations);
    	return this;
    }
    
    public int pushBackIterations() {
    	return (int) PUSH_BACK_ITERATIONS_HANDLE.get(segment, 0L);
    }
    
    /// @see #rootIterations()
    public Counters rootIterations(int rootIterations) {
    	ROOT_ITERATIONS_HANDLE.set(segment, 0L, rootIterations);
    	return this;
    }
    
    public int rootIterations() {
    	return (int) ROOT_ITERATIONS_HANDLE.get(segment, 0L);
    }
    
    @Override
    public Counters set(Counters other) {
        return set(other.segment);
    }
    
    @Override
    public Counters set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<Counters> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<Counters> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new Counters(segment),
            count
        );
    }
    
    public static NativeStructArray<Counters> array(Arena arena, Counters... structs) {
        NativeStructArray<Counters> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new Counters(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<Counters> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new Counters(segment)
        );
    }
    
}