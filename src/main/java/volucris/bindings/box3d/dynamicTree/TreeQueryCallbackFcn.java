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
/// This function receives proxies found in the AABB query.
/// @return true if the query should continue
/// ```
public abstract class TreeQueryCallbackFcn {

    private static final Map<Long, WeakReference<TreeQueryCallbackFcn>> CACHE;

    public static final FunctionDescriptor DESCRIPTION;
    public static final MethodHandle HANDLE;

    private final MemorySegment segment;

    static {
        CACHE = new HashMap<>();

        DESCRIPTION = FunctionDescriptor.of(
            JAVA_BOOLEAN, 
            JAVA_INT, 
            JAVA_LONG, 
            UNBOUNDED_ADDRESS
        );

        try {
            HANDLE = MethodHandles.lookup().findVirtual(TreeQueryCallbackFcn.class, "invoke", DESCRIPTION.toMethodType());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public TreeQueryCallbackFcn() {
        this(Arena.ofAuto());
    }

    public TreeQueryCallbackFcn(Arena arena) {
        this.segment = Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTION, arena);

        CACHE.put(this.segment.address(), new WeakReference<>(this));
    }

    public boolean invoke(
        int proxyId,
        long userData,
        MemorySegment context
    ) {
        throw new UnsupportedOperationException(
            "Override either the typed or raw callback method in TreeQueryCallbackFcn."
        );
    }

    public MemorySegment memorySegment() {
        return segment;
    }

    public static @Nullable TreeQueryCallbackFcn get(MemorySegment segment) {
        WeakReference<TreeQueryCallbackFcn> reference = CACHE.get(segment.address());

        if (reference == null)
            return null;

        return reference.get();
    }

}