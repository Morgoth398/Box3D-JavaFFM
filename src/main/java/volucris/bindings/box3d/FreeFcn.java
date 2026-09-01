/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.box3d;

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
/// Prototype for user free function.
/// @param mem the memory previously allocated through `b3AllocFcn`
/// ```
public abstract class FreeFcn {

    private static final Map<Long, WeakReference<FreeFcn>> CACHE;

    public static final FunctionDescriptor DESCRIPTION;
    public static final MethodHandle HANDLE;

    private final MemorySegment segment;

    static {
        CACHE = new HashMap<>();

        DESCRIPTION = FunctionDescriptor.ofVoid(
            UNBOUNDED_ADDRESS
        );

        try {
            HANDLE = MethodHandles.lookup().findVirtual(FreeFcn.class, "invoke", DESCRIPTION.toMethodType());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public FreeFcn() {
        this(Arena.ofAuto());
    }

    public FreeFcn(Arena arena) {
        this.segment = Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTION, arena);

        CACHE.put(this.segment.address(), new WeakReference<>(this));
    }

    public void invoke(
        MemorySegment mem
    ) {
        throw new UnsupportedOperationException(
            "Override either the typed or raw callback method in FreeFcn."
        );
    }

    public MemorySegment memorySegment() {
        return segment;
    }

    public static @Nullable FreeFcn get(MemorySegment segment) {
        WeakReference<FreeFcn> reference = CACHE.get(segment.address());

        if (reference == null)
            return null;

        return reference.get();
    }

}