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
/// Prototype callback for ray casts.
/// Called for each shape found in the query. You control how the ray cast
/// proceeds by returning a float:
/// return -1: ignore this shape and continue
/// return 0: terminate the ray cast
/// return fraction: clip the ray to this point
/// return 1: don't clip the ray and continue
/// @param shapeId the shape hit by the ray
/// @param point the point of initial intersection
/// @param normal the normal vector at the point of intersection
/// @param fraction the fraction along the ray at the point of intersection
/// @param userMaterialId the shape or triangle surface type
/// @param triangleIndex the triangle index for mesh or height field shapes or -1 for other shape types
/// @param childIndex the child shape index for compound shapes
/// @param context the user context
/// @return -1 to filter, 0 to terminate, fraction to clip the ray for closest hit, 1 to continue
/// @see b3World_CastRay
/// @ingroup world
/// ```
public abstract class CastResultFcn {

    private static final Map<Long, WeakReference<CastResultFcn>> CACHE;

    public static final FunctionDescriptor DESCRIPTION;
    public static final MethodHandle HANDLE;

    private final MemorySegment segment;

    static {
        CACHE = new HashMap<>();

        DESCRIPTION = FunctionDescriptor.of(
            JAVA_FLOAT, 
            ShapeId.LAYOUT, 
            Vec3.LAYOUT, 
            Vec3.LAYOUT, 
            JAVA_FLOAT, 
            JAVA_LONG, 
            JAVA_INT, 
            JAVA_INT, 
            UNBOUNDED_ADDRESS
        );

        try {
            HANDLE = MethodHandles.lookup().findVirtual(CastResultFcn.class, "invoke", DESCRIPTION.toMethodType());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public CastResultFcn() {
        this(Arena.ofAuto());
    }

    public CastResultFcn(Arena arena) {
        this.segment = Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTION, arena);

        CACHE.put(this.segment.address(), new WeakReference<>(this));
    }

    public float invoke(
        MemorySegment shapeId,
        MemorySegment point,
        MemorySegment normal,
        float fraction,
        long userMaterialId,
        int triangleIndex,
        int childIndex,
        MemorySegment context
    ) {
        return invoke(
            new ShapeId(shapeId),
            new Vec3(point),
            new Vec3(normal),
            fraction,
            userMaterialId,
            triangleIndex,
            childIndex,
            context
        );
    }

    public float invoke(
        ShapeId shapeId,
        Vec3 point,
        Vec3 normal,
        float fraction,
        long userMaterialId,
        int triangleIndex,
        int childIndex,
        MemorySegment context
    ) {
        throw new UnsupportedOperationException(
            "Override either the typed or raw callback method in CastResultFcn."
        );
    };

    public MemorySegment memorySegment() {
        return segment;
    }

    public static @Nullable CastResultFcn get(MemorySegment segment) {
        WeakReference<CastResultFcn> reference = CACHE.get(segment.address());

        if (reference == null)
            return null;

        return reference.get();
    }

}