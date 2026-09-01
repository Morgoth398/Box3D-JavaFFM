/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.box3d.query;

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

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

/// ```
/// Query callback.
/// ```
public abstract class MeshQueryFcn {

    private static final Map<Long, WeakReference<MeshQueryFcn>> CACHE;

    public static final FunctionDescriptor DESCRIPTION;
    public static final MethodHandle HANDLE;

    private final MemorySegment segment;

    static {
        CACHE = new HashMap<>();

        DESCRIPTION = FunctionDescriptor.of(
            JAVA_BOOLEAN, 
            Vec3.LAYOUT, 
            Vec3.LAYOUT, 
            Vec3.LAYOUT, 
            JAVA_INT, 
            UNBOUNDED_ADDRESS
        );

        try {
            HANDLE = MethodHandles.lookup().findVirtual(MeshQueryFcn.class, "invoke", DESCRIPTION.toMethodType());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public MeshQueryFcn() {
        this(Arena.ofAuto());
    }

    public MeshQueryFcn(Arena arena) {
        this.segment = Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTION, arena);

        CACHE.put(this.segment.address(), new WeakReference<>(this));
    }

    public boolean invoke(
        MemorySegment a,
        MemorySegment b,
        MemorySegment c,
        int triangleIndex,
        MemorySegment context
    ) {
        return invoke(
            new Vec3(a),
            new Vec3(b),
            new Vec3(c),
            triangleIndex,
            context
        );
    }

    public boolean invoke(
        Vec3 a,
        Vec3 b,
        Vec3 c,
        int triangleIndex,
        MemorySegment context
    ) {
        throw new UnsupportedOperationException(
            "Override either the typed or raw callback method in MeshQueryFcn."
        );
    };

    public MemorySegment memorySegment() {
        return segment;
    }

    public static @Nullable MeshQueryFcn get(MemorySegment segment) {
        WeakReference<MeshQueryFcn> reference = CACHE.get(segment.address());

        if (reference == null)
            return null;

        return reference.get();
    }

}