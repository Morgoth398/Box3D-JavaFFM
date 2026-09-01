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
/// Prototype for the user assert callback. Return 0 to skip the debugger break.
/// ```
public abstract class AssertFcn {

    private static final Map<Long, WeakReference<AssertFcn>> CACHE;

    public static final FunctionDescriptor DESCRIPTION;
    public static final MethodHandle HANDLE;

    private final MemorySegment segment;

    static {
        CACHE = new HashMap<>();

        DESCRIPTION = FunctionDescriptor.of(
            JAVA_INT, 
            UNBOUNDED_ADDRESS, 
            UNBOUNDED_ADDRESS, 
            JAVA_INT
        );

        try {
            HANDLE = MethodHandles.lookup().findVirtual(AssertFcn.class, "invoke", DESCRIPTION.toMethodType());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public AssertFcn() {
        this(Arena.ofAuto());
    }

    public AssertFcn(Arena arena) {
        this.segment = Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTION, arena);

        CACHE.put(this.segment.address(), new WeakReference<>(this));
    }

    public int invoke(
        MemorySegment condition,
        MemorySegment fileName,
        int lineNumber
    ) {
        return invoke(
            condition.getString(0),
            fileName.getString(0),
            lineNumber
        );
    }

    public int invoke(
        String condition,
        String fileName,
        int lineNumber
    ) {
        throw new UnsupportedOperationException(
            "Override either the typed or raw callback method in AssertFcn."
        );
    };

    public MemorySegment memorySegment() {
        return segment;
    }

    public static @Nullable AssertFcn get(MemorySegment segment) {
        WeakReference<AssertFcn> reference = CACHE.get(segment.address());

        if (reference == null)
            return null;

        return reference.get();
    }

}