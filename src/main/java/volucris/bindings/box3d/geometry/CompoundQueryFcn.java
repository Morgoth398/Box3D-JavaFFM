/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.box3d.geometry;

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
/// Callback for compound overlap queries.
/// ```
public abstract class CompoundQueryFcn {

    private static final Map<Long, WeakReference<CompoundQueryFcn>> CACHE;

    public static final FunctionDescriptor DESCRIPTION;
    public static final MethodHandle HANDLE;

    private final MemorySegment segment;

    static {
        CACHE = new HashMap<>();

        DESCRIPTION = FunctionDescriptor.of(
            JAVA_BOOLEAN, 
            UNBOUNDED_ADDRESS, 
            JAVA_INT, 
            UNBOUNDED_ADDRESS
        );

        try {
            HANDLE = MethodHandles.lookup().findVirtual(CompoundQueryFcn.class, "invoke", DESCRIPTION.toMethodType());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public CompoundQueryFcn() {
        this(Arena.ofAuto());
    }

    public CompoundQueryFcn(Arena arena) {
        this.segment = Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTION, arena);

        CACHE.put(this.segment.address(), new WeakReference<>(this));
    }

    public boolean invoke(
        MemorySegment compound,
        int childIndex,
        MemorySegment context
    ) {
        return invoke(
            new CompoundData(compound),
            childIndex,
            context
        );
    }

    public boolean invoke(
        CompoundData compound,
        int childIndex,
        MemorySegment context
    ) {
        throw new UnsupportedOperationException(
            "Override either the typed or raw callback method in CompoundQueryFcn."
        );
    };

    public MemorySegment memorySegment() {
        return segment;
    }

    public static @Nullable CompoundQueryFcn get(MemorySegment segment) {
        WeakReference<CompoundQueryFcn> reference = CACHE.get(segment.address());

        if (reference == null)
            return null;

        return reference.get();
    }

}