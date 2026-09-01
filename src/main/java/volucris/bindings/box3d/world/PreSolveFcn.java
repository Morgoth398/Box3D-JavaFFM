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
import volucris.bindings.box3d.math.Vec3;
import volucris.bindings.box3d.shape.ShapeId;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

/// ```
/// Prototype for a pre-solve callback.
/// This is called after a contact is updated. This allows you to inspect a
/// collision before it goes to the solver.
/// Notes:
/// - this function must be thread-safe
/// - this is only called if the shape has enabled pre-solve events
/// - this may be called for awake dynamic bodies and sensors
/// - this is not called for sensors
/// Return false if you want to disable the contact this step
/// This has limited information because it is used during CCD which does not have the
/// full contact manifold.
/// @warning Do not attempt to modify the world inside this callback
/// @ingroup world
/// ```
public abstract class PreSolveFcn {

    private static final Map<Long, WeakReference<PreSolveFcn>> CACHE;

    public static final FunctionDescriptor DESCRIPTION;
    public static final MethodHandle HANDLE;

    private final MemorySegment segment;

    static {
        CACHE = new HashMap<>();

        DESCRIPTION = FunctionDescriptor.of(
            JAVA_BOOLEAN, 
            ShapeId.LAYOUT, 
            ShapeId.LAYOUT, 
            Vec3.LAYOUT, 
            Vec3.LAYOUT, 
            UNBOUNDED_ADDRESS
        );

        try {
            HANDLE = MethodHandles.lookup().findVirtual(PreSolveFcn.class, "invoke", DESCRIPTION.toMethodType());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public PreSolveFcn() {
        this(Arena.ofAuto());
    }

    public PreSolveFcn(Arena arena) {
        this.segment = Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTION, arena);

        CACHE.put(this.segment.address(), new WeakReference<>(this));
    }

    public boolean invoke(
        MemorySegment shapeIdA,
        MemorySegment shapeIdB,
        MemorySegment point,
        MemorySegment normal,
        MemorySegment context
    ) {
        return invoke(
            new ShapeId(shapeIdA),
            new ShapeId(shapeIdB),
            new Vec3(point),
            new Vec3(normal),
            context
        );
    }

    public boolean invoke(
        ShapeId shapeIdA,
        ShapeId shapeIdB,
        Vec3 point,
        Vec3 normal,
        MemorySegment context
    ) {
        throw new UnsupportedOperationException(
            "Override either the typed or raw callback method in PreSolveFcn."
        );
    };

    public MemorySegment memorySegment() {
        return segment;
    }

    public static @Nullable PreSolveFcn get(MemorySegment segment) {
        WeakReference<PreSolveFcn> reference = CACHE.get(segment.address());

        if (reference == null)
            return null;

        return reference.get();
    }

}