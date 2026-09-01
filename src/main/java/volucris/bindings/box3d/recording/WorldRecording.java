/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.box3d.recording;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.invoke.MethodHandle;
import org.jspecify.annotations.Nullable;
import volucris.bindings.box3d.body.BodyId;
import volucris.bindings.box3d.debugDraw.CreateDebugShapeCallback;
import volucris.bindings.box3d.debugDraw.DebugDraw;
import volucris.bindings.box3d.debugDraw.DestroyDebugShapeCallback;
import volucris.bindings.box3d.world.WorldId;
import volucris.bindings.core.MemoryStack;
import volucris.bindings.core.NativeByteArray;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class WorldRecording {

    private static final LazyConstant<MethodHandle> B3_CREATE_RECORDING;
    private static final LazyConstant<MethodHandle> B3_DESTROY_RECORDING;
    private static final LazyConstant<MethodHandle> B3_RECORDING_GET_DATA;
    private static final LazyConstant<MethodHandle> B3_RECORDING_GET_SIZE;
    private static final LazyConstant<MethodHandle> B3_WORLD_START_RECORDING;
    private static final LazyConstant<MethodHandle> B3_WORLD_STOP_RECORDING;
    private static final LazyConstant<MethodHandle> B3_SAVE_RECORDING_TO_FILE;
    private static final LazyConstant<MethodHandle> B3_LOAD_RECORDING_FROM_FILE;
    private static final LazyConstant<MethodHandle> B3_VALIDATE_REPLAY;
    private static final LazyConstant<MethodHandle> B3_REC_PLAYER_CREATE;
    private static final LazyConstant<MethodHandle> B3_REC_PLAYER_DESTROY;
    private static final LazyConstant<MethodHandle> B3_REC_PLAYER_STEP_FRAME;
    private static final LazyConstant<MethodHandle> B3_REC_PLAYER_RESTART;
    private static final LazyConstant<MethodHandle> B3_REC_PLAYER_SEEK_FRAME;
    private static final LazyConstant<MethodHandle> B3_REC_PLAYER_GET_WORLD_ID;
    private static final LazyConstant<MethodHandle> B3_REC_PLAYER_GET_FRAME;
    private static final LazyConstant<MethodHandle> B3_REC_PLAYER_GET_FRAME_COUNT;
    private static final LazyConstant<MethodHandle> B3_REC_PLAYER_IS_AT_END;
    private static final LazyConstant<MethodHandle> B3_REC_PLAYER_HAS_DIVERGED;
    private static final LazyConstant<MethodHandle> B3_REC_PLAYER_GET_INFO;
    private static final LazyConstant<MethodHandle> B3_REC_PLAYER_GET_DIVERGE_FRAME;
    private static final LazyConstant<MethodHandle> B3_REC_PLAYER_SET_WORKER_COUNT;
    private static final LazyConstant<MethodHandle> B3_REC_PLAYER_SET_KEYFRAME_POLICY;
    private static final LazyConstant<MethodHandle> B3_REC_PLAYER_GET_KEYFRAME_BUDGET;
    private static final LazyConstant<MethodHandle> B3_REC_PLAYER_GET_KEYFRAME_MIN_INTERVAL;
    private static final LazyConstant<MethodHandle> B3_REC_PLAYER_GET_KEYFRAME_INTERVAL;
    private static final LazyConstant<MethodHandle> B3_REC_PLAYER_GET_KEYFRAME_BYTES;
    private static final LazyConstant<MethodHandle> B3_REC_PLAYER_GET_BODY_COUNT;
    private static final LazyConstant<MethodHandle> B3_REC_PLAYER_GET_BODY_ID;
    private static final LazyConstant<MethodHandle> B3_REC_PLAYER_SET_DEBUG_SHAPE_CALLBACKS;
    private static final LazyConstant<MethodHandle> B3_REC_PLAYER_DRAW_FRAME_QUERIES;
    private static final LazyConstant<MethodHandle> B3_REC_PLAYER_GET_FRAME_QUERY_COUNT;
    private static final LazyConstant<MethodHandle> B3_REC_PLAYER_GET_FRAME_QUERY;
    private static final LazyConstant<MethodHandle> B3_REC_PLAYER_GET_FRAME_QUERY_HIT;

    static {
        //@formatter:off
        B3_CREATE_RECORDING = downcallHandle("b3CreateRecording", UNBOUNDED_ADDRESS, JAVA_INT);
        B3_DESTROY_RECORDING = downcallHandleVoid("b3DestroyRecording", UNBOUNDED_ADDRESS);
        B3_RECORDING_GET_DATA = downcallHandle("b3Recording_GetData", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        B3_RECORDING_GET_SIZE = downcallHandle("b3Recording_GetSize", JAVA_INT, UNBOUNDED_ADDRESS);
        B3_WORLD_START_RECORDING = downcallHandleVoid("b3World_StartRecording", WorldId.LAYOUT, UNBOUNDED_ADDRESS);
        B3_WORLD_STOP_RECORDING = downcallHandleVoid("b3World_StopRecording", WorldId.LAYOUT);
        B3_SAVE_RECORDING_TO_FILE = downcallHandle("b3SaveRecordingToFile", JAVA_BOOLEAN, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        B3_LOAD_RECORDING_FROM_FILE = downcallHandle("b3LoadRecordingFromFile", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        B3_VALIDATE_REPLAY = downcallHandle("b3ValidateReplay", JAVA_BOOLEAN, UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT);
        B3_REC_PLAYER_CREATE = downcallHandle("b3RecPlayer_Create", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT);
        B3_REC_PLAYER_DESTROY = downcallHandleVoid("b3RecPlayer_Destroy", UNBOUNDED_ADDRESS);
        B3_REC_PLAYER_STEP_FRAME = downcallHandle("b3RecPlayer_StepFrame", JAVA_BOOLEAN, UNBOUNDED_ADDRESS);
        B3_REC_PLAYER_RESTART = downcallHandleVoid("b3RecPlayer_Restart", UNBOUNDED_ADDRESS);
        B3_REC_PLAYER_SEEK_FRAME = downcallHandleVoid("b3RecPlayer_SeekFrame", UNBOUNDED_ADDRESS, JAVA_INT);
        B3_REC_PLAYER_GET_WORLD_ID = downcallHandle("b3RecPlayer_GetWorldId", WorldId.LAYOUT, UNBOUNDED_ADDRESS);
        B3_REC_PLAYER_GET_FRAME = downcallHandle("b3RecPlayer_GetFrame", JAVA_INT, UNBOUNDED_ADDRESS);
        B3_REC_PLAYER_GET_FRAME_COUNT = downcallHandle("b3RecPlayer_GetFrameCount", JAVA_INT, UNBOUNDED_ADDRESS);
        B3_REC_PLAYER_IS_AT_END = downcallHandle("b3RecPlayer_IsAtEnd", JAVA_BOOLEAN, UNBOUNDED_ADDRESS);
        B3_REC_PLAYER_HAS_DIVERGED = downcallHandle("b3RecPlayer_HasDiverged", JAVA_BOOLEAN, UNBOUNDED_ADDRESS);
        B3_REC_PLAYER_GET_INFO = downcallHandle("b3RecPlayer_GetInfo", RecPlayerInfo.LAYOUT, UNBOUNDED_ADDRESS);
        B3_REC_PLAYER_GET_DIVERGE_FRAME = downcallHandle("b3RecPlayer_GetDivergeFrame", JAVA_INT, UNBOUNDED_ADDRESS);
        B3_REC_PLAYER_SET_WORKER_COUNT = downcallHandleVoid("b3RecPlayer_SetWorkerCount", UNBOUNDED_ADDRESS, JAVA_INT);
        B3_REC_PLAYER_SET_KEYFRAME_POLICY = downcallHandleVoid("b3RecPlayer_SetKeyframePolicy", UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_INT);
        B3_REC_PLAYER_GET_KEYFRAME_BUDGET = downcallHandle("b3RecPlayer_GetKeyframeBudget", JAVA_LONG, UNBOUNDED_ADDRESS);
        B3_REC_PLAYER_GET_KEYFRAME_MIN_INTERVAL = downcallHandle("b3RecPlayer_GetKeyframeMinInterval", JAVA_INT, UNBOUNDED_ADDRESS);
        B3_REC_PLAYER_GET_KEYFRAME_INTERVAL = downcallHandle("b3RecPlayer_GetKeyframeInterval", JAVA_INT, UNBOUNDED_ADDRESS);
        B3_REC_PLAYER_GET_KEYFRAME_BYTES = downcallHandle("b3RecPlayer_GetKeyframeBytes", JAVA_LONG, UNBOUNDED_ADDRESS);
        B3_REC_PLAYER_GET_BODY_COUNT = downcallHandle("b3RecPlayer_GetBodyCount", JAVA_INT, UNBOUNDED_ADDRESS);
        B3_REC_PLAYER_GET_BODY_ID = downcallHandle("b3RecPlayer_GetBodyId", BodyId.LAYOUT, UNBOUNDED_ADDRESS, JAVA_INT);
        B3_REC_PLAYER_SET_DEBUG_SHAPE_CALLBACKS = downcallHandleVoid("b3RecPlayer_SetDebugShapeCallbacks", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        B3_REC_PLAYER_DRAW_FRAME_QUERIES = downcallHandleVoid("b3RecPlayer_DrawFrameQueries", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT);
        B3_REC_PLAYER_GET_FRAME_QUERY_COUNT = downcallHandle("b3RecPlayer_GetFrameQueryCount", JAVA_INT, UNBOUNDED_ADDRESS);
        B3_REC_PLAYER_GET_FRAME_QUERY = downcallHandle("b3RecPlayer_GetFrameQuery", RecQueryInfo.LAYOUT, UNBOUNDED_ADDRESS, JAVA_INT);
        B3_REC_PLAYER_GET_FRAME_QUERY_HIT = downcallHandle("b3RecPlayer_GetFrameQueryHit", RecQueryHit.LAYOUT, UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT);
        //@formatter:on
    }

    private WorldRecording() {
    }

    /// ```
    /// Create a recording buffer with an optional initial byte capacity.
    /// Pass 0 to use the default (64 KiB). The buffer grows on demand.
    /// @return a new recording, owned by the caller
    /// ```
    public static MemorySegment ncreateRecording(
    	int byteCapacity
    ) {
    	MethodHandle method = B3_CREATE_RECORDING.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			byteCapacity
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ncreateRecording].
    public static @Nullable Recording createRecording(
    	int byteCapacity
    ) {
    	MemorySegment segment = ncreateRecording(
    		byteCapacity
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new Recording(segment);
    }
    
    /// ```
    /// Destroy a recording and free its buffer.
    /// @param recording may be NULL
    /// ```
    public static void destroyRecording(
    	MemorySegment recording
    ) {
    	MethodHandle method = B3_DESTROY_RECORDING.get();
    	try {
    		 method.invokeExact(
    			recording
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#destroyRecording].
    public static void destroyRecording(
    	Recording recording
    ) {
    	destroyRecording(
    		recording.memorySegment()
    	);
    }
    
    /// ```
    /// Get a pointer to the raw recording bytes.
    /// Valid until the recording buffer is modified or destroyed.
    /// @param recording the recording handle
    /// @return pointer to the byte buffer, or NULL if no bytes have been written
    /// ```
    public static MemorySegment getData(
    	MemorySegment recording
    ) {
    	MethodHandle method = B3_RECORDING_GET_DATA.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			recording
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getData].
    public static @Nullable NativeByteArray getData(
    	Recording recording
    ) {
    	MemorySegment segment = getData(
    		recording.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativeByteArray(segment);
    }
    
    /// ```
    /// Get the number of bytes currently in the recording buffer.
    /// @param recording the recording handle
    /// ```
    public static int getSize(
    	MemorySegment recording
    ) {
    	MethodHandle method = B3_RECORDING_GET_SIZE.get();
    	try {
    		return (int) method.invokeExact(
    			recording
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getSize].
    public static int getSize(
    	Recording recording
    ) {
    	return getSize(
    		recording.memorySegment()
    	);
    }
    
    /// ```
    /// Begin recording world mutations into the provided buffer.
    /// The buffer is reset on each call so a single b3Recording can be reused for multiple sessions.
    /// @param worldId the world to record
    /// @param recording the recording handle to write into
    /// ```
    public static void startRecording(
    	MemorySegment worldId,
    	MemorySegment recording
    ) {
    	MethodHandle method = B3_WORLD_START_RECORDING.get();
    	try {
    		 method.invokeExact(
    			worldId,
    			recording
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#startRecording].
    public static void startRecording(
    	WorldId worldId,
    	Recording recording
    ) {
    	startRecording(
    		worldId.memorySegment(),
    		recording.memorySegment()
    	);
    }
    
    /// ```
    /// End the current recording session. Writes the trailing geometry registry and
    /// backpatches the header. The buffer remains valid until the recording is destroyed.
    /// @param worldId the world currently being recorded
    /// ```
    public static void stopRecording(
    	MemorySegment worldId
    ) {
    	MethodHandle method = B3_WORLD_STOP_RECORDING.get();
    	try {
    		 method.invokeExact(
    			worldId
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#stopRecording].
    public static void stopRecording(
    	WorldId worldId
    ) {
    	stopRecording(
    		worldId.memorySegment()
    	);
    }
    
    /// ```
    /// Save the recording buffer to a file. Returns true on success.
    /// @param recording the recording to save
    /// @param path file path to write
    /// ```
    public static boolean saveRecordingToFile(
    	MemorySegment recording,
    	MemorySegment path
    ) {
    	MethodHandle method = B3_SAVE_RECORDING_TO_FILE.get();
    	try {
    		return (boolean) method.invokeExact(
    			recording,
    			path
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#saveRecordingToFile].
    public static boolean saveRecordingToFile(
    	Recording recording,
    	String path
    ) {
    	try (Arena arena = MemoryStack.stackPush()) {
    		return saveRecordingToFile(
    			recording.memorySegment(),
    			arena.allocateFrom(path)
    		);
    	}
    }
    
    /// ```
    /// Load a recording from a file. Returns NULL on failure (file not found, wrong magic).
    /// The caller owns the returned recording and must destroy it with b3DestroyRecording.
    /// @param path file path to read
    /// ```
    public static MemorySegment loadRecordingFromFile(
    	MemorySegment path
    ) {
    	MethodHandle method = B3_LOAD_RECORDING_FROM_FILE.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			path
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#loadRecordingFromFile].
    public static @Nullable Recording loadRecordingFromFile(
    	NativeByteArray path
    ) {
    	MemorySegment segment = loadRecordingFromFile(
    		path.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new Recording(segment);
    }
    
    /// ```
    /// Replay a recording from memory and verify it reproduces the same world-state hashes.
    /// Stands up a fresh world, restores the seed snapshot, replays every op, and checks each embedded
    /// StateHash record. Returns true if replay completed without id mismatches or hash divergences.
    /// @param data pointer to recording bytes
    /// @param size byte count of the recording
    /// @param workerCount reserved for future multithreaded replay; pass 1 for now
    /// ```
    public static boolean validateReplay(
    	MemorySegment data,
    	int size,
    	int workerCount
    ) {
    	MethodHandle method = B3_VALIDATE_REPLAY.get();
    	try {
    		return (boolean) method.invokeExact(
    			data,
    			size,
    			workerCount
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Create a player over a recording. Owns a private copy of the bytes.
    /// @param data pointer to recording bytes
    /// @param size byte count of the recording
    /// @param workerCount worker count for the replay world; pass 1 to match a serial recording.
    /// Replaying at a different count re-partitions the constraint graph, so the StateHash check
    /// becomes a cross-thread determinism test. Adjustable later with b3RecPlayer_SetWorkerCount.
    /// @return a new player, or NULL on bad header or deserialization failure
    /// ```
    public static MemorySegment ncreate(
    	MemorySegment data,
    	int size,
    	int workerCount
    ) {
    	MethodHandle method = B3_REC_PLAYER_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			data,
    			size,
    			workerCount
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ncreate].
    public static @Nullable RecPlayer create(
    	MemorySegment data,
    	int size,
    	int workerCount
    ) {
    	MemorySegment segment = ncreate(
    		data,
    		size,
    		workerCount
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new RecPlayer(segment);
    }
    
    /// ```
    /// Destroy the player and free all memory. Restores the previous global length scale.
    /// ```
    public static void destroy(
    	MemorySegment player
    ) {
    	MethodHandle method = B3_REC_PLAYER_DESTROY.get();
    	try {
    		 method.invokeExact(
    			player
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#destroy].
    public static void destroy(
    	RecPlayer player
    ) {
    	destroy(
    		player.memorySegment()
    	);
    }
    
    /// ```
    /// Advance one frame: dispatch ops until the next Step completes.
    /// @return true when a frame was stepped, false at end-of-recording
    /// ```
    public static boolean stepFrame(
    	MemorySegment player
    ) {
    	MethodHandle method = B3_REC_PLAYER_STEP_FRAME.get();
    	try {
    		return (boolean) method.invokeExact(
    			player
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#stepFrame].
    public static boolean stepFrame(
    	RecPlayer player
    ) {
    	return stepFrame(
    		player.memorySegment()
    	);
    }
    
    /// ```
    /// Rewind to frame 0 (in-place restore so the world id stays stable).
    /// ```
    public static void restart(
    	MemorySegment player
    ) {
    	MethodHandle method = B3_REC_PLAYER_RESTART.get();
    	try {
    		 method.invokeExact(
    			player
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#restart].
    public static void restart(
    	RecPlayer player
    ) {
    	restart(
    		player.memorySegment()
    	);
    }
    
    /// ```
    /// Seek to a specific frame. Forward seek steps op-by-op; backward seek restores
    /// the nearest keyframe then re-steps the remaining gap.
    /// ```
    public static void seekFrame(
    	MemorySegment player,
    	int targetFrame
    ) {
    	MethodHandle method = B3_REC_PLAYER_SEEK_FRAME.get();
    	try {
    		 method.invokeExact(
    			player,
    			targetFrame
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#seekFrame].
    public static void seekFrame(
    	RecPlayer player,
    	int targetFrame
    ) {
    	seekFrame(
    		player.memorySegment(),
    		targetFrame
    	);
    }
    
    /// ```
    /// @return the world currently driven by this player
    /// ```
    public static MemorySegment getWorldId(
    	SegmentAllocator allocator,
    	MemorySegment player
    ) {
    	MethodHandle method = B3_REC_PLAYER_GET_WORLD_ID.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			player
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getWorldId].
    public static @Nullable WorldId getWorldId(
    	SegmentAllocator allocator,
    	RecPlayer player
    ) {
    	MemorySegment segment = getWorldId(
    		allocator,
    		player.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new WorldId(segment);
    }
    
    /// ```
    /// @return the last fully-stepped frame index (0 before any step)
    /// ```
    public static int getFrame(
    	MemorySegment player
    ) {
    	MethodHandle method = B3_REC_PLAYER_GET_FRAME.get();
    	try {
    		return (int) method.invokeExact(
    			player
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getFrame].
    public static int getFrame(
    	RecPlayer player
    ) {
    	return getFrame(
    		player.memorySegment()
    	);
    }
    
    /// ```
    /// @return total number of recorded frames
    /// ```
    public static int getFrameCount(
    	MemorySegment player
    ) {
    	MethodHandle method = B3_REC_PLAYER_GET_FRAME_COUNT.get();
    	try {
    		return (int) method.invokeExact(
    			player
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getFrameCount].
    public static int getFrameCount(
    	RecPlayer player
    ) {
    	return getFrameCount(
    		player.memorySegment()
    	);
    }
    
    /// ```
    /// @return true when the op stream is exhausted
    /// ```
    public static boolean isAtEnd(
    	MemorySegment player
    ) {
    	MethodHandle method = B3_REC_PLAYER_IS_AT_END.get();
    	try {
    		return (boolean) method.invokeExact(
    			player
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#isAtEnd].
    public static boolean isAtEnd(
    	RecPlayer player
    ) {
    	return isAtEnd(
    		player.memorySegment()
    	);
    }
    
    /// ```
    /// @return true when any StateHash mismatch has been detected
    /// ```
    public static boolean hasDiverged(
    	MemorySegment player
    ) {
    	MethodHandle method = B3_REC_PLAYER_HAS_DIVERGED.get();
    	try {
    		return (boolean) method.invokeExact(
    			player
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#hasDiverged].
    public static boolean hasDiverged(
    	RecPlayer player
    ) {
    	return hasDiverged(
    		player.memorySegment()
    	);
    }
    
    /// ```
    /// @return a summary of the recording read at open: frame count, recorded tuning, and bounds
    /// ```
    public static MemorySegment getInfo(
    	SegmentAllocator allocator,
    	MemorySegment player
    ) {
    	MethodHandle method = B3_REC_PLAYER_GET_INFO.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			player
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getInfo].
    public static @Nullable RecPlayerInfo getInfo(
    	SegmentAllocator allocator,
    	RecPlayer player
    ) {
    	MemorySegment segment = getInfo(
    		allocator,
    		player.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new RecPlayerInfo(segment);
    }
    
    /// ```
    /// @return the first frame at which replay diverged, or -1 if it has not diverged
    /// ```
    public static int getDivergeFrame(
    	MemorySegment player
    ) {
    	MethodHandle method = B3_REC_PLAYER_GET_DIVERGE_FRAME.get();
    	try {
    		return (int) method.invokeExact(
    			player
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getDivergeFrame].
    public static int getDivergeFrame(
    	RecPlayer player
    ) {
    	return getDivergeFrame(
    		player.memorySegment()
    	);
    }
    
    /// ```
    /// Set the worker count of the replay world. Clamped to [1, B3_MAX_WORKERS]. Applied to the live
    /// world at once and reused whenever the player rebuilds its world on Restart or a backward seek.
    /// Replaying at a different count than recorded re-partitions the constraint graph, so the StateHash
    /// check becomes a cross-thread determinism test.
    /// ```
    public static void setWorkerCount(
    	MemorySegment player,
    	int count
    ) {
    	MethodHandle method = B3_REC_PLAYER_SET_WORKER_COUNT.get();
    	try {
    		 method.invokeExact(
    			player,
    			count
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setWorkerCount].
    public static void setWorkerCount(
    	RecPlayer player,
    	int count
    ) {
    	setWorkerCount(
    		player.memorySegment(),
    		count
    	);
    }
    
    /// ```
    /// Tune the keyframe ring used to speed up backward seeking. A keyframe is a periodic snapshot the
    /// player restores from instead of replaying from the start, trading memory for seek speed.
    /// @param player the recording player
    /// @param budgetBytes memory cap for the kept snapshots; the spacing widens to stay under it
    /// @param minIntervalFrames finest spacing between keyframes, in frames
    /// A zero budget or a non-positive interval keeps that value. Clears the existing ring, so call
    /// b3RecPlayer_Restart afterward to repopulate it under the new policy.
    /// ```
    public static void setKeyframePolicy(
    	MemorySegment player,
    	long budgetBytes,
    	int minIntervalFrames
    ) {
    	MethodHandle method = B3_REC_PLAYER_SET_KEYFRAME_POLICY.get();
    	try {
    		 method.invokeExact(
    			player,
    			budgetBytes,
    			minIntervalFrames
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setKeyframePolicy].
    public static void setKeyframePolicy(
    	RecPlayer player,
    	long budgetBytes,
    	int minIntervalFrames
    ) {
    	setKeyframePolicy(
    		player.memorySegment(),
    		budgetBytes,
    		minIntervalFrames
    	);
    }
    
    /// ```
    /// @return the keyframe memory budget in bytes
    /// ```
    public static long getKeyframeBudget(
    	MemorySegment player
    ) {
    	MethodHandle method = B3_REC_PLAYER_GET_KEYFRAME_BUDGET.get();
    	try {
    		return (long) method.invokeExact(
    			player
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getKeyframeBudget].
    public static long getKeyframeBudget(
    	RecPlayer player
    ) {
    	return getKeyframeBudget(
    		player.memorySegment()
    	);
    }
    
    /// ```
    /// @return the finest keyframe spacing in frames
    /// ```
    public static int getKeyframeMinInterval(
    	MemorySegment player
    ) {
    	MethodHandle method = B3_REC_PLAYER_GET_KEYFRAME_MIN_INTERVAL.get();
    	try {
    		return (int) method.invokeExact(
    			player
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getKeyframeMinInterval].
    public static int getKeyframeMinInterval(
    	RecPlayer player
    ) {
    	return getKeyframeMinInterval(
    		player.memorySegment()
    	);
    }
    
    /// ```
    /// @return the current keyframe spacing in frames; starts at the min interval and doubles as the
    /// ring evicts to stay under budget, so it reflects the effective backward-seek granularity now
    /// ```
    public static int getKeyframeInterval(
    	MemorySegment player
    ) {
    	MethodHandle method = B3_REC_PLAYER_GET_KEYFRAME_INTERVAL.get();
    	try {
    		return (int) method.invokeExact(
    			player
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getKeyframeInterval].
    public static int getKeyframeInterval(
    	RecPlayer player
    ) {
    	return getKeyframeInterval(
    		player.memorySegment()
    	);
    }
    
    /// ```
    /// @return the memory currently held by keyframe snapshots, in bytes
    /// ```
    public static long getKeyframeBytes(
    	MemorySegment player
    ) {
    	MethodHandle method = B3_REC_PLAYER_GET_KEYFRAME_BYTES.get();
    	try {
    		return (long) method.invokeExact(
    			player
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getKeyframeBytes].
    public static long getKeyframeBytes(
    	RecPlayer player
    ) {
    	return getKeyframeBytes(
    		player.memorySegment()
    	);
    }
    
    /// ```
    /// @return the number of bodies tracked in creation order (including holes for destroyed bodies)
    /// ```
    public static int getBodyCount(
    	MemorySegment player
    ) {
    	MethodHandle method = B3_REC_PLAYER_GET_BODY_COUNT.get();
    	try {
    		return (int) method.invokeExact(
    			player
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getBodyCount].
    public static int getBodyCount(
    	RecPlayer player
    ) {
    	return getBodyCount(
    		player.memorySegment()
    	);
    }
    
    /// ```
    /// Resolve a creation ordinal to the live body id at the current frame.
    /// @return the body id, or a null id if that ordinal is out of range or its body is destroyed
    /// ```
    public static MemorySegment getBodyId(
    	SegmentAllocator allocator,
    	MemorySegment player,
    	int index
    ) {
    	MethodHandle method = B3_REC_PLAYER_GET_BODY_ID.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			player,
    			index
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getBodyId].
    public static @Nullable BodyId getBodyId(
    	SegmentAllocator allocator,
    	RecPlayer player,
    	int index
    ) {
    	MemorySegment segment = getBodyId(
    		allocator,
    		player.memorySegment(),
    		index
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new BodyId(segment);
    }
    
    /// ```
    /// Wire host debug-shape callbacks into the player's replay world so a renderer can build
    /// per-shape draw resources (the 3D sample needs this or the replay world draws nothing).
    /// Rebuilds the current world under the new callbacks and rewinds to frame 0, so call it
    /// once right after b3RecPlayer_Create and re-read the world id afterward. The callbacks
    /// persist across Restart and backward seeks, which recreate the world internally.
    /// @param player the player to configure
    /// @param createDebugShape called when a replayed shape is added; returns a user draw handle
    /// @param destroyDebugShape called when a replayed shape is removed; may be NULL
    /// @param context user context passed to both callbacks
    /// ```
    public static void setDebugShapeCallbacks(
    	MemorySegment player,
    	MemorySegment createDebugShape,
    	MemorySegment destroyDebugShape,
    	MemorySegment context
    ) {
    	MethodHandle method = B3_REC_PLAYER_SET_DEBUG_SHAPE_CALLBACKS.get();
    	try {
    		 method.invokeExact(
    			player,
    			createDebugShape,
    			destroyDebugShape,
    			context
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setDebugShapeCallbacks].
    public static void setDebugShapeCallbacks(
    	RecPlayer player,
    	CreateDebugShapeCallback createDebugShape,
    	DestroyDebugShapeCallback destroyDebugShape,
    	MemorySegment context
    ) {
    	setDebugShapeCallbacks(
    		player.memorySegment(),
    		createDebugShape.memorySegment(),
    		destroyDebugShape.memorySegment(),
    		context
    	);
    }
    
    /// ```
    /// Draw the spatial queries recorded during the most recently replayed frame, layered on top of the
    /// world. Call after b3World_Draw. NULL draw function pointers are skipped.
    /// @param player a valid player handle
    /// @param draw debug draw callbacks
    /// @param queryIndex index of the frame query to draw, or -1 to draw all of them
    /// @param selectedIndex index of the query to emphasize (reserved color plus a label), or -1 for none
    /// ```
    public static void drawFrameQueries(
    	MemorySegment player,
    	MemorySegment draw,
    	int queryIndex,
    	int selectedIndex
    ) {
    	MethodHandle method = B3_REC_PLAYER_DRAW_FRAME_QUERIES.get();
    	try {
    		 method.invokeExact(
    			player,
    			draw,
    			queryIndex,
    			selectedIndex
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#drawFrameQueries].
    public static void drawFrameQueries(
    	RecPlayer player,
    	DebugDraw draw,
    	int queryIndex,
    	int selectedIndex
    ) {
    	drawFrameQueries(
    		player.memorySegment(),
    		draw.memorySegment(),
    		queryIndex,
    		selectedIndex
    	);
    }
    
    /// ```
    /// @return the number of spatial queries recorded for the most recently replayed frame
    /// ```
    public static int getFrameQueryCount(
    	MemorySegment player
    ) {
    	MethodHandle method = B3_REC_PLAYER_GET_FRAME_QUERY_COUNT.get();
    	try {
    		return (int) method.invokeExact(
    			player
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getFrameQueryCount].
    public static int getFrameQueryCount(
    	RecPlayer player
    ) {
    	return getFrameQueryCount(
    		player.memorySegment()
    	);
    }
    
    /// ```
    /// Get a recorded query from the most recently replayed frame by index.
    /// ```
    public static MemorySegment getFrameQuery(
    	SegmentAllocator allocator,
    	MemorySegment player,
    	int index
    ) {
    	MethodHandle method = B3_REC_PLAYER_GET_FRAME_QUERY.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			player,
    			index
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getFrameQuery].
    public static @Nullable RecQueryInfo getFrameQuery(
    	SegmentAllocator allocator,
    	RecPlayer player,
    	int index
    ) {
    	MemorySegment segment = getFrameQuery(
    		allocator,
    		player.memorySegment(),
    		index
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new RecQueryInfo(segment);
    }
    
    /// ```
    /// Get one result of a recorded query from the most recently replayed frame.
    /// ```
    public static MemorySegment getFrameQueryHit(
    	SegmentAllocator allocator,
    	MemorySegment player,
    	int queryIndex,
    	int hitIndex
    ) {
    	MethodHandle method = B3_REC_PLAYER_GET_FRAME_QUERY_HIT.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			player,
    			queryIndex,
    			hitIndex
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getFrameQueryHit].
    public static @Nullable RecQueryHit getFrameQueryHit(
    	SegmentAllocator allocator,
    	RecPlayer player,
    	int queryIndex,
    	int hitIndex
    ) {
    	MemorySegment segment = getFrameQueryHit(
    		allocator,
    		player.memorySegment(),
    		queryIndex,
    		hitIndex
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new RecQueryHit(segment);
    }
    
}