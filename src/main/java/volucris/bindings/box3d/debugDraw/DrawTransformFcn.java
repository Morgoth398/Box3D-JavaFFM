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
import volucris.bindings.box3d.math.Transform;

import static volucris.bindings.core.FFMUtils.*;

/// ```
/// Draw a transform. Choose your own length scale.
/// ```
public abstract class DrawTransformFcn {

    private static final Map<Long, WeakReference<DrawTransformFcn>> CACHE;

    public static final FunctionDescriptor DESCRIPTION;
    public static final MethodHandle HANDLE;

    private final MemorySegment segment;

    static {
        CACHE = new HashMap<>();

        DESCRIPTION = FunctionDescriptor.ofVoid(
            Transform.LAYOUT, 
            UNBOUNDED_ADDRESS
        );

        try {
            HANDLE = MethodHandles.lookup().findVirtual(DrawTransformFcn.class, "invoke", DESCRIPTION.toMethodType());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public DrawTransformFcn() {
        this(Arena.ofAuto());
    }

    public DrawTransformFcn(Arena arena) {
        this.segment = Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTION, arena);

        CACHE.put(this.segment.address(), new WeakReference<>(this));
    }

    public void invoke(
        MemorySegment transform,
        MemorySegment context
    ) {
        invoke(
            new Transform(transform),
            context
        );
    }

    public void invoke(
        Transform transform,
        MemorySegment context
    ) {
        throw new UnsupportedOperationException(
            "Override either the typed or raw callback method in DrawTransformFcn."
        );
    };

    public MemorySegment memorySegment() {
        return segment;
    }

    public static @Nullable DrawTransformFcn get(MemorySegment segment) {
        WeakReference<DrawTransformFcn> reference = CACHE.get(segment.address());

        if (reference == null)
            return null;

        return reference.get();
    }

}