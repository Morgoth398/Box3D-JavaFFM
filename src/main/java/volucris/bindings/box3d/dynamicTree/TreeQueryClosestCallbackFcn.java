/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.box3d.dynamicTree;

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

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

/// ```
/// This function receives the minimum distance squared so far and proxy to check in the closest query.
/// @return minimum distance squared to user objects in the proxy
/// ```
public abstract class TreeQueryClosestCallbackFcn {

    private static final Map<Long, WeakReference<TreeQueryClosestCallbackFcn>> CACHE;

    public static final FunctionDescriptor DESCRIPTION;
    public static final MethodHandle HANDLE;

    private final MemorySegment segment;

    static {
        CACHE = new HashMap<>();

        DESCRIPTION = FunctionDescriptor.of(
            JAVA_FLOAT, 
            JAVA_FLOAT, 
            JAVA_INT, 
            JAVA_LONG, 
            UNBOUNDED_ADDRESS
        );

        try {
            HANDLE = MethodHandles.lookup().findVirtual(TreeQueryClosestCallbackFcn.class, "invoke", DESCRIPTION.toMethodType());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public TreeQueryClosestCallbackFcn() {
        this(Arena.ofAuto());
    }

    public TreeQueryClosestCallbackFcn(Arena arena) {
        this.segment = Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTION, arena);

        CACHE.put(this.segment.address(), new WeakReference<>(this));
    }

    public float invoke(
        float distanceSqrMin,
        int proxyId,
        long userData,
        MemorySegment context
    ) {
        throw new UnsupportedOperationException(
            "Override either the typed or raw callback method in TreeQueryClosestCallbackFcn."
        );
    }

    public MemorySegment memorySegment() {
        return segment;
    }

    public static @Nullable TreeQueryClosestCallbackFcn get(MemorySegment segment) {
        WeakReference<TreeQueryClosestCallbackFcn> reference = CACHE.get(segment.address());

        if (reference == null)
            return null;

        return reference.get();
    }

}