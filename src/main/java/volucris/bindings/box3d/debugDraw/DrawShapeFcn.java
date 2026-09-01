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

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

/// ```
/// Draws a shape and returns true if drawing should continue
/// ```
public abstract class DrawShapeFcn {

    private static final Map<Long, WeakReference<DrawShapeFcn>> CACHE;

    public static final FunctionDescriptor DESCRIPTION;
    public static final MethodHandle HANDLE;

    private final MemorySegment segment;

    static {
        CACHE = new HashMap<>();

        DESCRIPTION = FunctionDescriptor.of(
            JAVA_BOOLEAN, 
            UNBOUNDED_ADDRESS, 
            Transform.LAYOUT, 
            JAVA_INT, 
            UNBOUNDED_ADDRESS
        );

        try {
            HANDLE = MethodHandles.lookup().findVirtual(DrawShapeFcn.class, "invoke", DESCRIPTION.toMethodType());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public DrawShapeFcn() {
        this(Arena.ofAuto());
    }

    public DrawShapeFcn(Arena arena) {
        this.segment = Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTION, arena);

        CACHE.put(this.segment.address(), new WeakReference<>(this));
    }

    public boolean invoke(
        MemorySegment userShape,
        MemorySegment transform,
        int color,
        MemorySegment context
    ) {
        return invoke(
            userShape,
            new Transform(transform),
            color,
            context
        );
    }

    public boolean invoke(
        MemorySegment userShape,
        Transform transform,
        int color,
        MemorySegment context
    ) {
        throw new UnsupportedOperationException(
            "Override either the typed or raw callback method in DrawShapeFcn."
        );
    };

    public MemorySegment memorySegment() {
        return segment;
    }

    public static @Nullable DrawShapeFcn get(MemorySegment segment) {
        WeakReference<DrawShapeFcn> reference = CACHE.get(segment.address());

        if (reference == null)
            return null;

        return reference.get();
    }

}