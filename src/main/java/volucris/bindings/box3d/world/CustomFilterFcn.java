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
/// Prototype for a contact filter callback.
/// This is called when a contact pair is considered for collision. This allows you to
/// perform custom logic to prevent collision between shapes. This is only called if
/// one of the two shapes has custom filtering enabled. @see b3ShapeDef.
/// Notes:
/// - this function must be thread-safe
/// - this is only called if one of the two shapes has enabled custom filtering
/// - this is called only for awake dynamic bodies
/// Return false if you want to disable the collision
/// @warning Do not attempt to modify the world inside this callback
/// @ingroup world
/// ```
public abstract class CustomFilterFcn {

    private static final Map<Long, WeakReference<CustomFilterFcn>> CACHE;

    public static final FunctionDescriptor DESCRIPTION;
    public static final MethodHandle HANDLE;

    private final MemorySegment segment;

    static {
        CACHE = new HashMap<>();

        DESCRIPTION = FunctionDescriptor.of(
            JAVA_BOOLEAN, 
            ShapeId.LAYOUT, 
            ShapeId.LAYOUT, 
            UNBOUNDED_ADDRESS
        );

        try {
            HANDLE = MethodHandles.lookup().findVirtual(CustomFilterFcn.class, "invoke", DESCRIPTION.toMethodType());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public CustomFilterFcn() {
        this(Arena.ofAuto());
    }

    public CustomFilterFcn(Arena arena) {
        this.segment = Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTION, arena);

        CACHE.put(this.segment.address(), new WeakReference<>(this));
    }

    public boolean invoke(
        MemorySegment shapeIdA,
        MemorySegment shapeIdB,
        MemorySegment context
    ) {
        return invoke(
            new ShapeId(shapeIdA),
            new ShapeId(shapeIdB),
            context
        );
    }

    public boolean invoke(
        ShapeId shapeIdA,
        ShapeId shapeIdB,
        MemorySegment context
    ) {
        throw new UnsupportedOperationException(
            "Override either the typed or raw callback method in CustomFilterFcn."
        );
    };

    public MemorySegment memorySegment() {
        return segment;
    }

    public static @Nullable CustomFilterFcn get(MemorySegment segment) {
        WeakReference<CustomFilterFcn> reference = CACHE.get(segment.address());

        if (reference == null)
            return null;

        return reference.get();
    }

}