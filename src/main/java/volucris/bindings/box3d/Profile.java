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
/// @cond
/// Profiling data. Times are in milliseconds.
/// @ingroup world
/// ```
public final class Profile
		implements Struct<Profile> {

    public static final StructLayout LAYOUT;

    public static final VarHandle STEP_HANDLE;
    public static final VarHandle PAIRS_HANDLE;
    public static final VarHandle COLLIDE_HANDLE;
    public static final VarHandle SOLVE_HANDLE;
    public static final VarHandle SOLVER_SETUP_HANDLE;
    public static final VarHandle CONSTRAINTS_HANDLE;
    public static final VarHandle PREPARE_CONSTRAINTS_HANDLE;
    public static final VarHandle INTEGRATE_VELOCITIES_HANDLE;
    public static final VarHandle WARM_START_HANDLE;
    public static final VarHandle SOLVE_IMPULSES_HANDLE;
    public static final VarHandle INTEGRATE_POSITIONS_HANDLE;
    public static final VarHandle RELAX_IMPULSES_HANDLE;
    public static final VarHandle APPLY_RESTITUTION_HANDLE;
    public static final VarHandle STORE_IMPULSES_HANDLE;
    public static final VarHandle SPLIT_ISLANDS_HANDLE;
    public static final VarHandle TRANSFORMS_HANDLE;
    public static final VarHandle SENSOR_HITS_HANDLE;
    public static final VarHandle JOINT_EVENTS_HANDLE;
    public static final VarHandle HIT_EVENTS_HANDLE;
    public static final VarHandle REFIT_HANDLE;
    public static final VarHandle BULLETS_HANDLE;
    public static final VarHandle SLEEP_ISLANDS_HANDLE;
    public static final VarHandle SENSORS_HANDLE;

    public static final long STEP_BYTE_OFFSET;
    public static final long PAIRS_BYTE_OFFSET;
    public static final long COLLIDE_BYTE_OFFSET;
    public static final long SOLVE_BYTE_OFFSET;
    public static final long SOLVER_SETUP_BYTE_OFFSET;
    public static final long CONSTRAINTS_BYTE_OFFSET;
    public static final long PREPARE_CONSTRAINTS_BYTE_OFFSET;
    public static final long INTEGRATE_VELOCITIES_BYTE_OFFSET;
    public static final long WARM_START_BYTE_OFFSET;
    public static final long SOLVE_IMPULSES_BYTE_OFFSET;
    public static final long INTEGRATE_POSITIONS_BYTE_OFFSET;
    public static final long RELAX_IMPULSES_BYTE_OFFSET;
    public static final long APPLY_RESTITUTION_BYTE_OFFSET;
    public static final long STORE_IMPULSES_BYTE_OFFSET;
    public static final long SPLIT_ISLANDS_BYTE_OFFSET;
    public static final long TRANSFORMS_BYTE_OFFSET;
    public static final long SENSOR_HITS_BYTE_OFFSET;
    public static final long JOINT_EVENTS_BYTE_OFFSET;
    public static final long HIT_EVENTS_BYTE_OFFSET;
    public static final long REFIT_BYTE_OFFSET;
    public static final long BULLETS_BYTE_OFFSET;
    public static final long SLEEP_ISLANDS_BYTE_OFFSET;
    public static final long SENSORS_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_FLOAT.withName("step"),
            JAVA_FLOAT.withName("pairs"),
            JAVA_FLOAT.withName("collide"),
            JAVA_FLOAT.withName("solve"),
            JAVA_FLOAT.withName("solverSetup"),
            JAVA_FLOAT.withName("constraints"),
            JAVA_FLOAT.withName("prepareConstraints"),
            JAVA_FLOAT.withName("integrateVelocities"),
            JAVA_FLOAT.withName("warmStart"),
            JAVA_FLOAT.withName("solveImpulses"),
            JAVA_FLOAT.withName("integratePositions"),
            JAVA_FLOAT.withName("relaxImpulses"),
            JAVA_FLOAT.withName("applyRestitution"),
            JAVA_FLOAT.withName("storeImpulses"),
            JAVA_FLOAT.withName("splitIslands"),
            JAVA_FLOAT.withName("transforms"),
            JAVA_FLOAT.withName("sensorHits"),
            JAVA_FLOAT.withName("jointEvents"),
            JAVA_FLOAT.withName("hitEvents"),
            JAVA_FLOAT.withName("refit"),
            JAVA_FLOAT.withName("bullets"),
            JAVA_FLOAT.withName("sleepIslands"),
            JAVA_FLOAT.withName("sensors")
        ).withName("b3Profile").withByteAlignment(4);
        
        STEP_HANDLE = LAYOUT.varHandle(PathElement.groupElement("step"));
        PAIRS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pairs"));
        COLLIDE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("collide"));
        SOLVE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("solve"));
        SOLVER_SETUP_HANDLE = LAYOUT.varHandle(PathElement.groupElement("solverSetup"));
        CONSTRAINTS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("constraints"));
        PREPARE_CONSTRAINTS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("prepareConstraints"));
        INTEGRATE_VELOCITIES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("integrateVelocities"));
        WARM_START_HANDLE = LAYOUT.varHandle(PathElement.groupElement("warmStart"));
        SOLVE_IMPULSES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("solveImpulses"));
        INTEGRATE_POSITIONS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("integratePositions"));
        RELAX_IMPULSES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("relaxImpulses"));
        APPLY_RESTITUTION_HANDLE = LAYOUT.varHandle(PathElement.groupElement("applyRestitution"));
        STORE_IMPULSES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("storeImpulses"));
        SPLIT_ISLANDS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("splitIslands"));
        TRANSFORMS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("transforms"));
        SENSOR_HITS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sensorHits"));
        JOINT_EVENTS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("jointEvents"));
        HIT_EVENTS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("hitEvents"));
        REFIT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("refit"));
        BULLETS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("bullets"));
        SLEEP_ISLANDS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sleepIslands"));
        SENSORS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sensors"));
        
        STEP_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("step"));
        PAIRS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pairs"));
        COLLIDE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("collide"));
        SOLVE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("solve"));
        SOLVER_SETUP_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("solverSetup"));
        CONSTRAINTS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("constraints"));
        PREPARE_CONSTRAINTS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("prepareConstraints"));
        INTEGRATE_VELOCITIES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("integrateVelocities"));
        WARM_START_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("warmStart"));
        SOLVE_IMPULSES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("solveImpulses"));
        INTEGRATE_POSITIONS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("integratePositions"));
        RELAX_IMPULSES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("relaxImpulses"));
        APPLY_RESTITUTION_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("applyRestitution"));
        STORE_IMPULSES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("storeImpulses"));
        SPLIT_ISLANDS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("splitIslands"));
        TRANSFORMS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("transforms"));
        SENSOR_HITS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sensorHits"));
        JOINT_EVENTS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("jointEvents"));
        HIT_EVENTS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("hitEvents"));
        REFIT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("refit"));
        BULLETS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("bullets"));
        SLEEP_ISLANDS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sleepIslands"));
        SENSORS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sensors"));
        //@formatter:on
    }

    public Profile() {
        this(Arena.ofAuto());
    }
    
    public Profile(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public Profile(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #step()
    public Profile step(float step) {
    	STEP_HANDLE.set(segment, 0L, step);
    	return this;
    }
    
    public float step() {
    	return (float) STEP_HANDLE.get(segment, 0L);
    }
    
    /// @see #pairs()
    public Profile pairs(float pairs) {
    	PAIRS_HANDLE.set(segment, 0L, pairs);
    	return this;
    }
    
    public float pairs() {
    	return (float) PAIRS_HANDLE.get(segment, 0L);
    }
    
    /// @see #collide()
    public Profile collide(float collide) {
    	COLLIDE_HANDLE.set(segment, 0L, collide);
    	return this;
    }
    
    public float collide() {
    	return (float) COLLIDE_HANDLE.get(segment, 0L);
    }
    
    /// @see #solve()
    public Profile solve(float solve) {
    	SOLVE_HANDLE.set(segment, 0L, solve);
    	return this;
    }
    
    public float solve() {
    	return (float) SOLVE_HANDLE.get(segment, 0L);
    }
    
    /// @see #solverSetup()
    public Profile solverSetup(float solverSetup) {
    	SOLVER_SETUP_HANDLE.set(segment, 0L, solverSetup);
    	return this;
    }
    
    public float solverSetup() {
    	return (float) SOLVER_SETUP_HANDLE.get(segment, 0L);
    }
    
    /// @see #constraints()
    public Profile constraints(float constraints) {
    	CONSTRAINTS_HANDLE.set(segment, 0L, constraints);
    	return this;
    }
    
    public float constraints() {
    	return (float) CONSTRAINTS_HANDLE.get(segment, 0L);
    }
    
    /// @see #prepareConstraints()
    public Profile prepareConstraints(float prepareConstraints) {
    	PREPARE_CONSTRAINTS_HANDLE.set(segment, 0L, prepareConstraints);
    	return this;
    }
    
    public float prepareConstraints() {
    	return (float) PREPARE_CONSTRAINTS_HANDLE.get(segment, 0L);
    }
    
    /// @see #integrateVelocities()
    public Profile integrateVelocities(float integrateVelocities) {
    	INTEGRATE_VELOCITIES_HANDLE.set(segment, 0L, integrateVelocities);
    	return this;
    }
    
    public float integrateVelocities() {
    	return (float) INTEGRATE_VELOCITIES_HANDLE.get(segment, 0L);
    }
    
    /// @see #warmStart()
    public Profile warmStart(float warmStart) {
    	WARM_START_HANDLE.set(segment, 0L, warmStart);
    	return this;
    }
    
    public float warmStart() {
    	return (float) WARM_START_HANDLE.get(segment, 0L);
    }
    
    /// @see #solveImpulses()
    public Profile solveImpulses(float solveImpulses) {
    	SOLVE_IMPULSES_HANDLE.set(segment, 0L, solveImpulses);
    	return this;
    }
    
    public float solveImpulses() {
    	return (float) SOLVE_IMPULSES_HANDLE.get(segment, 0L);
    }
    
    /// @see #integratePositions()
    public Profile integratePositions(float integratePositions) {
    	INTEGRATE_POSITIONS_HANDLE.set(segment, 0L, integratePositions);
    	return this;
    }
    
    public float integratePositions() {
    	return (float) INTEGRATE_POSITIONS_HANDLE.get(segment, 0L);
    }
    
    /// @see #relaxImpulses()
    public Profile relaxImpulses(float relaxImpulses) {
    	RELAX_IMPULSES_HANDLE.set(segment, 0L, relaxImpulses);
    	return this;
    }
    
    public float relaxImpulses() {
    	return (float) RELAX_IMPULSES_HANDLE.get(segment, 0L);
    }
    
    /// @see #applyRestitution()
    public Profile applyRestitution(float applyRestitution) {
    	APPLY_RESTITUTION_HANDLE.set(segment, 0L, applyRestitution);
    	return this;
    }
    
    public float applyRestitution() {
    	return (float) APPLY_RESTITUTION_HANDLE.get(segment, 0L);
    }
    
    /// @see #storeImpulses()
    public Profile storeImpulses(float storeImpulses) {
    	STORE_IMPULSES_HANDLE.set(segment, 0L, storeImpulses);
    	return this;
    }
    
    public float storeImpulses() {
    	return (float) STORE_IMPULSES_HANDLE.get(segment, 0L);
    }
    
    /// @see #splitIslands()
    public Profile splitIslands(float splitIslands) {
    	SPLIT_ISLANDS_HANDLE.set(segment, 0L, splitIslands);
    	return this;
    }
    
    public float splitIslands() {
    	return (float) SPLIT_ISLANDS_HANDLE.get(segment, 0L);
    }
    
    /// @see #transforms()
    public Profile transforms(float transforms) {
    	TRANSFORMS_HANDLE.set(segment, 0L, transforms);
    	return this;
    }
    
    public float transforms() {
    	return (float) TRANSFORMS_HANDLE.get(segment, 0L);
    }
    
    /// @see #sensorHits()
    public Profile sensorHits(float sensorHits) {
    	SENSOR_HITS_HANDLE.set(segment, 0L, sensorHits);
    	return this;
    }
    
    public float sensorHits() {
    	return (float) SENSOR_HITS_HANDLE.get(segment, 0L);
    }
    
    /// @see #jointEvents()
    public Profile jointEvents(float jointEvents) {
    	JOINT_EVENTS_HANDLE.set(segment, 0L, jointEvents);
    	return this;
    }
    
    public float jointEvents() {
    	return (float) JOINT_EVENTS_HANDLE.get(segment, 0L);
    }
    
    /// @see #hitEvents()
    public Profile hitEvents(float hitEvents) {
    	HIT_EVENTS_HANDLE.set(segment, 0L, hitEvents);
    	return this;
    }
    
    public float hitEvents() {
    	return (float) HIT_EVENTS_HANDLE.get(segment, 0L);
    }
    
    /// @see #refit()
    public Profile refit(float refit) {
    	REFIT_HANDLE.set(segment, 0L, refit);
    	return this;
    }
    
    public float refit() {
    	return (float) REFIT_HANDLE.get(segment, 0L);
    }
    
    /// @see #bullets()
    public Profile bullets(float bullets) {
    	BULLETS_HANDLE.set(segment, 0L, bullets);
    	return this;
    }
    
    public float bullets() {
    	return (float) BULLETS_HANDLE.get(segment, 0L);
    }
    
    /// @see #sleepIslands()
    public Profile sleepIslands(float sleepIslands) {
    	SLEEP_ISLANDS_HANDLE.set(segment, 0L, sleepIslands);
    	return this;
    }
    
    public float sleepIslands() {
    	return (float) SLEEP_ISLANDS_HANDLE.get(segment, 0L);
    }
    
    /// @see #sensors()
    public Profile sensors(float sensors) {
    	SENSORS_HANDLE.set(segment, 0L, sensors);
    	return this;
    }
    
    public float sensors() {
    	return (float) SENSORS_HANDLE.get(segment, 0L);
    }
    
    @Override
    public Profile set(Profile other) {
        return set(other.segment);
    }
    
    @Override
    public Profile set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<Profile> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<Profile> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new Profile(segment),
            count
        );
    }
    
    public static NativeStructArray<Profile> array(Arena arena, Profile... structs) {
        NativeStructArray<Profile> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new Profile(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<Profile> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new Profile(segment)
        );
    }
    
}