/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.box3d.characterMover;

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
import volucris.bindings.box3d.shape.ShapeId;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

/// ```
/// Used to collect collision planes for character movers.
/// Return true to continue gathering planes.
/// ```
public abstract class PlaneResultFcn {

    private static final Map<Long, WeakReference<PlaneResultFcn>> CACHE;

    public static final FunctionDescriptor DESCRIPTION;
    public static final MethodHandle HANDLE;

    private final MemorySegment segment;

    static {
        CACHE = new HashMap<>();

        DESCRIPTION = FunctionDescriptor.of(
            JAVA_BOOLEAN, 
            ShapeId.LAYOUT, 
            UNBOUNDED_ADDRESS, 
            JAVA_INT, 
            UNBOUNDED_ADDRESS
        );

        try {
            HANDLE = MethodHandles.lookup().findVirtual(PlaneResultFcn.class, "invoke", DESCRIPTION.toMethodType());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public PlaneResultFcn() {
        this(Arena.ofAuto());
    }

    public PlaneResultFcn(Arena arena) {
        this.segment = Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTION, arena);

        CACHE.put(this.segment.address(), new WeakReference<>(this));
    }

    public boolean invoke(
        MemorySegment shapeId,
        MemorySegment plane,
        int planeCount,
        MemorySegment context
    ) {
        return invoke(
            new ShapeId(shapeId),
            new PlaneResult(plane),
            planeCount,
            context
        );
    }

    public boolean invoke(
        ShapeId shapeId,
        PlaneResult plane,
        int planeCount,
        MemorySegment context
    ) {
        throw new UnsupportedOperationException(
            "Override either the typed or raw callback method in PlaneResultFcn."
        );
    };

    public MemorySegment memorySegment() {
        return segment;
    }

    public static @Nullable PlaneResultFcn get(MemorySegment segment) {
        WeakReference<PlaneResultFcn> reference = CACHE.get(segment.address());

        if (reference == null)
            return null;

        return reference.get();
    }

}