/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.box3d.world;

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
/// Prototype callback for overlap queries.
/// Called for each shape found in the query.
/// @see b3World_OverlapAABB
/// @return false to terminate the query.
/// @ingroup world
/// ```
public abstract class OverlapResultFcn {

    private static final Map<Long, WeakReference<OverlapResultFcn>> CACHE;

    public static final FunctionDescriptor DESCRIPTION;
    public static final MethodHandle HANDLE;

    private final MemorySegment segment;

    static {
        CACHE = new HashMap<>();

        DESCRIPTION = FunctionDescriptor.of(
            JAVA_BOOLEAN, 
            ShapeId.LAYOUT, 
            UNBOUNDED_ADDRESS
        );

        try {
            HANDLE = MethodHandles.lookup().findVirtual(OverlapResultFcn.class, "invoke", DESCRIPTION.toMethodType());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public OverlapResultFcn() {
        this(Arena.ofAuto());
    }

    public OverlapResultFcn(Arena arena) {
        this.segment = Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTION, arena);

        CACHE.put(this.segment.address(), new WeakReference<>(this));
    }

    public boolean invoke(
        MemorySegment shapeId,
        MemorySegment context
    ) {
        return invoke(
            new ShapeId(shapeId),
            context
        );
    }

    public boolean invoke(
        ShapeId shapeId,
        MemorySegment context
    ) {
        throw new UnsupportedOperationException(
            "Override either the typed or raw callback method in OverlapResultFcn."
        );
    };

    public MemorySegment memorySegment() {
        return segment;
    }

    public static @Nullable OverlapResultFcn get(MemorySegment segment) {
        WeakReference<OverlapResultFcn> reference = CACHE.get(segment.address());

        if (reference == null)
            return null;

        return reference.get();
    }

}