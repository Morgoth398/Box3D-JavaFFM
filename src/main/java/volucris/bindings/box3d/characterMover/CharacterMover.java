/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.box3d.characterMover;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.invoke.MethodHandle;
import org.jspecify.annotations.Nullable;
import volucris.bindings.box3d.math.Vec3;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class CharacterMover {

    private static final LazyConstant<MethodHandle> B3_SOLVE_PLANES;
    private static final LazyConstant<MethodHandle> B3_CLIP_VECTOR;

    static {
        //@formatter:off
        B3_SOLVE_PLANES = downcallHandle("b3SolvePlanes", PlaneSolverResult.LAYOUT, Vec3.LAYOUT, UNBOUNDED_ADDRESS, JAVA_INT);
        B3_CLIP_VECTOR = downcallHandle("b3ClipVector", Vec3.LAYOUT, Vec3.LAYOUT, UNBOUNDED_ADDRESS, JAVA_INT);
        //@formatter:on
    }

    private CharacterMover() {
    }

    /// ```
    /// Solves the position of a mover that satisfies the given collision planes.
    /// @param targetDelta the desired translation from the position used to generate the collision planes
    /// @param planes the collision planes
    /// @param count the number of collision planes
    /// ```
    public static MemorySegment solvePlanes(
    	SegmentAllocator allocator,
    	MemorySegment targetDelta,
    	MemorySegment planes,
    	int count
    ) {
    	MethodHandle method = B3_SOLVE_PLANES.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			targetDelta,
    			planes,
    			count
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#solvePlanes].
    public static @Nullable PlaneSolverResult solvePlanes(
    	SegmentAllocator allocator,
    	Vec3 targetDelta,
    	CollisionPlane planes,
    	int count
    ) {
    	MemorySegment segment = solvePlanes(
    		allocator,
    		targetDelta.memorySegment(),
    		planes.memorySegment(),
    		count
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new PlaneSolverResult(segment);
    }
    
    /// ```
    /// Clips the velocity against the given collision planes. Planes with zero push or clipVelocity
    /// set to false are skipped.
    /// ```
    public static MemorySegment clipVector(
    	SegmentAllocator allocator,
    	MemorySegment vector,
    	MemorySegment planes,
    	int count
    ) {
    	MethodHandle method = B3_CLIP_VECTOR.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			vector,
    			planes,
    			count
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clipVector].
    public static @Nullable Vec3 clipVector(
    	SegmentAllocator allocator,
    	Vec3 vector,
    	CollisionPlane planes,
    	int count
    ) {
    	MemorySegment segment = clipVector(
    		allocator,
    		vector.memorySegment(),
    		planes.memorySegment(),
    		count
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new Vec3(segment);
    }
    
}