/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.box3d.characterMover;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;
import java.util.function.Consumer;
import volucris.bindings.box3d.math.Vec3;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;

/// ```
/// Result returned by b3SolvePlanes.
/// ```
public final class PlaneSolverResult
		implements Struct<PlaneSolverResult> {

    public static final StructLayout LAYOUT;

    public static final VarHandle ITERATION_COUNT_HANDLE;

    public static final long DELTA_BYTE_OFFSET;
    public static final long ITERATION_COUNT_BYTE_OFFSET;

    private final MemorySegment segment;

    private final Vec3 delta;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            Vec3.LAYOUT.withName("delta"),
            JAVA_INT.withName("iterationCount")
        ).withName("b3PlaneSolverResult").withByteAlignment(4);
        
        ITERATION_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("iterationCount"));
        
        DELTA_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("delta"));
        ITERATION_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("iterationCount"));
        //@formatter:on
    }

    public PlaneSolverResult() {
        this(Arena.ofAuto());
    }
    
    public PlaneSolverResult(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public PlaneSolverResult(MemorySegment segment) {
        this.segment = segment;
    
        delta = new Vec3(segment.asSlice(DELTA_BYTE_OFFSET, Vec3.LAYOUT));
    }

    /// @see #iterationCount()
    public PlaneSolverResult iterationCount(int iterationCount) {
    	ITERATION_COUNT_HANDLE.set(segment, 0L, iterationCount);
    	return this;
    }
    
    /// ```
    /// The number of iterations used by the plane solver. For diagnostics.
    /// ```
    public int iterationCount() {
    	return (int) ITERATION_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #delta()
    public PlaneSolverResult delta(Consumer<Vec3> consumer) {
    	consumer.accept(delta);
    	return this;
    }
    
    /// @see #delta()
    public PlaneSolverResult delta(Vec3 other) {
    	delta.set(other);
    	return this;
    }
    
    /// ```
    /// The final relative translation.
    /// ```
    public Vec3 delta() {
    	return delta;
    }
    
    @Override
    public PlaneSolverResult set(PlaneSolverResult other) {
        return set(other.segment);
    }
    
    @Override
    public PlaneSolverResult set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<PlaneSolverResult> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<PlaneSolverResult> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new PlaneSolverResult(segment),
            count
        );
    }
    
    public static NativeStructArray<PlaneSolverResult> array(Arena arena, PlaneSolverResult... structs) {
        NativeStructArray<PlaneSolverResult> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new PlaneSolverResult(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<PlaneSolverResult> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new PlaneSolverResult(segment)
        );
    }
    
}