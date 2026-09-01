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
/// Finishes a user task object that wraps a Box3D task. This must block until the task has completed.
/// The step blocks here on the tasks it spawned, so b3World_Step holds its stack across every
/// fork/join. Drive it from a thread you can dedicate to the step, or from a fiber this callback can
/// park to free the underlying thread. In a job system that cannot park a job's stack, do not call
/// b3World_Step from inside a job: a job that blocks on its own sub-jobs without yielding its thread
/// can deadlock. The in-tree scheduler instead runs other pending tasks on the waiting thread.
/// @ingroup world
/// ```
public abstract class FinishTaskCallback {

    private static final Map<Long, WeakReference<FinishTaskCallback>> CACHE;

    public static final FunctionDescriptor DESCRIPTION;
    public static final MethodHandle HANDLE;

    private final MemorySegment segment;

    static {
        CACHE = new HashMap<>();

        DESCRIPTION = FunctionDescriptor.ofVoid(
            UNBOUNDED_ADDRESS, 
            UNBOUNDED_ADDRESS
        );

        try {
            HANDLE = MethodHandles.lookup().findVirtual(FinishTaskCallback.class, "invoke", DESCRIPTION.toMethodType());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public FinishTaskCallback() {
        this(Arena.ofAuto());
    }

    public FinishTaskCallback(Arena arena) {
        this.segment = Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTION, arena);

        CACHE.put(this.segment.address(), new WeakReference<>(this));
    }

    public void invoke(
        MemorySegment userTask,
        MemorySegment userContext
    ) {
        throw new UnsupportedOperationException(
            "Override either the typed or raw callback method in FinishTaskCallback."
        );
    }

    public MemorySegment memorySegment() {
        return segment;
    }

    public static @Nullable FinishTaskCallback get(MemorySegment segment) {
        WeakReference<FinishTaskCallback> reference = CACHE.get(segment.address());

        if (reference == null)
            return null;

        return reference.get();
    }

}