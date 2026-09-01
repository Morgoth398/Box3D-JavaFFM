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

/// ```
/// The user needs to be able to create debug draw shapes for multi-pass rendering to work efficiently.
/// These user shapes are created and destroyed via callback so they can be bound to shape lifetime and scaling updates.
/// @ingroup debug_draw
/// ```
public abstract class CreateDebugShapeCallback {

    private static final Map<Long, WeakReference<CreateDebugShapeCallback>> CACHE;

    public static final FunctionDescriptor DESCRIPTION;
    public static final MethodHandle HANDLE;

    private final MemorySegment segment;

    static {
        CACHE = new HashMap<>();

        DESCRIPTION = FunctionDescriptor.of(
            UNBOUNDED_ADDRESS, 
            UNBOUNDED_ADDRESS, 
            UNBOUNDED_ADDRESS
        );

        try {
            HANDLE = MethodHandles.lookup().findVirtual(CreateDebugShapeCallback.class, "invoke", DESCRIPTION.toMethodType());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public CreateDebugShapeCallback() {
        this(Arena.ofAuto());
    }

    public CreateDebugShapeCallback(Arena arena) {
        this.segment = Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTION, arena);

        CACHE.put(this.segment.address(), new WeakReference<>(this));
    }

    public MemorySegment invoke(
        MemorySegment debugShape,
        MemorySegment userContext
    ) {
        return invoke(
            new DebugShape(debugShape),
            userContext
        );
    }

    public MemorySegment invoke(
        DebugShape debugShape,
        MemorySegment userContext
    ) {
        throw new UnsupportedOperationException(
            "Override either the typed or raw callback method in CreateDebugShapeCallback."
        );
    };

    public MemorySegment memorySegment() {
        return segment;
    }

    public static @Nullable CreateDebugShapeCallback get(MemorySegment segment) {
        WeakReference<CreateDebugShapeCallback> reference = CACHE.get(segment.address());

        if (reference == null)
            return null;

        return reference.get();
    }

}