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

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

/// ```
/// Prototype for user allocation function.
/// @param size the allocation size in bytes
/// @param alignment the required alignment, guaranteed to be a power of 2
/// ```
public abstract class AllocFcn {

    private static final Map<Long, WeakReference<AllocFcn>> CACHE;

    public static final FunctionDescriptor DESCRIPTION;
    public static final MethodHandle HANDLE;

    private final MemorySegment segment;

    static {
        CACHE = new HashMap<>();

        DESCRIPTION = FunctionDescriptor.of(
            UNBOUNDED_ADDRESS, 
            JAVA_INT, 
            JAVA_INT
        );

        try {
            HANDLE = MethodHandles.lookup().findVirtual(AllocFcn.class, "invoke", DESCRIPTION.toMethodType());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public AllocFcn() {
        this(Arena.ofAuto());
    }

    public AllocFcn(Arena arena) {
        this.segment = Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTION, arena);

        CACHE.put(this.segment.address(), new WeakReference<>(this));
    }

    public MemorySegment invoke(
        int size,
        int alignment
    ) {
        throw new UnsupportedOperationException(
            "Override either the typed or raw callback method in AllocFcn."
        );
    }

    public MemorySegment memorySegment() {
        return segment;
    }

    public static @Nullable AllocFcn get(MemorySegment segment) {
        WeakReference<AllocFcn> reference = CACHE.get(segment.address());

        if (reference == null)
            return null;

        return reference.get();
    }

}