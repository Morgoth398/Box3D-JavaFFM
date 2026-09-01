/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.box3d.debugDraw;

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

public abstract class DestroyDebugShapeCallback {

    private static final Map<Long, WeakReference<DestroyDebugShapeCallback>> CACHE;

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
            HANDLE = MethodHandles.lookup().findVirtual(DestroyDebugShapeCallback.class, "invoke", DESCRIPTION.toMethodType());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public DestroyDebugShapeCallback() {
        this(Arena.ofAuto());
    }

    public DestroyDebugShapeCallback(Arena arena) {
        this.segment = Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTION, arena);

        CACHE.put(this.segment.address(), new WeakReference<>(this));
    }

    public void invoke(
        MemorySegment userShape,
        MemorySegment userContext
    ) {
        throw new UnsupportedOperationException(
            "Override either the typed or raw callback method in DestroyDebugShapeCallback."
        );
    }

    public MemorySegment memorySegment() {
        return segment;
    }

    public static @Nullable DestroyDebugShapeCallback get(MemorySegment segment) {
        WeakReference<DestroyDebugShapeCallback> reference = CACHE.get(segment.address());

        if (reference == null)
            return null;

        return reference.get();
    }

}