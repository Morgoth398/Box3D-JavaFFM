/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.box3d.world;

import java.lang.foreign.Arena;
import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.Linker;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.jspecify.annotations.Nullable;

import static volucris.bindings.core.FFMUtils.*;

/// ```
/// These functions can be provided to Box3D to invoke a task system.
/// Returns a pointer to the user's task object. May be nullptr. A nullptr indicates to Box3D that the work was executed
/// serially within the callback and there is no need to call b3FinishTaskCallback. Otherwise the returned
/// value must be non-null will be passed to b3FinishTaskCallback as the userTask.
/// @param task the Box3D task to be called by the scheduler
/// @param taskContext the Box3D context object that the scheduler must pass to the task
/// @param userContext the scheduler context object that is opaque to Box3D
/// @param taskName the Box3D task name that the scheduler can use for diagnostics
/// @ingroup world
/// ```
public abstract class EnqueueTaskCallback {

    private static final Map<Long, WeakReference<EnqueueTaskCallback>> CACHE;

    public static final FunctionDescriptor DESCRIPTION;
    public static final MethodHandle HANDLE;

    private final MemorySegment segment;

    static {
        CACHE = new HashMap<>();

        DESCRIPTION = FunctionDescriptor.of(
            UNBOUNDED_ADDRESS, 
            UNBOUNDED_ADDRESS, 
            UNBOUNDED_ADDRESS, 
            UNBOUNDED_ADDRESS, 
            UNBOUNDED_ADDRESS
        );

        try {
            HANDLE = MethodHandles.lookup().findVirtual(EnqueueTaskCallback.class, "invoke", DESCRIPTION.toMethodType());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public EnqueueTaskCallback() {
        this(Arena.ofAuto());
    }

    public EnqueueTaskCallback(Arena arena) {
        this.segment = Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTION, arena);

        CACHE.put(this.segment.address(), new WeakReference<>(this));
    }

    public MemorySegment invoke(
        MemorySegment task,
        MemorySegment taskContext,
        MemorySegment userContext,
        MemorySegment taskName
    ) {
        return invoke(
            TaskCallback.get(task),
            taskContext,
            userContext,
            taskName.getString(0)
        );
    }

    public MemorySegment invoke(
        TaskCallback task,
        MemorySegment taskContext,
        MemorySegment userContext,
        String taskName
    ) {
        throw new UnsupportedOperationException(
            "Override either the typed or raw callback method in EnqueueTaskCallback."
        );
    };

    public MemorySegment memorySegment() {
        return segment;
    }

    public static @Nullable EnqueueTaskCallback get(MemorySegment segment) {
        WeakReference<EnqueueTaskCallback> reference = CACHE.get(segment.address());

        if (reference == null)
            return null;

        return reference.get();
    }

}