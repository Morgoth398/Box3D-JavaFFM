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
import volucris.bindings.box3d.math.Vec3;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

/// ```
/// Draw a capsule.
/// ```
public abstract class DrawCapsuleFcn {

    private static final Map<Long, WeakReference<DrawCapsuleFcn>> CACHE;

    public static final FunctionDescriptor DESCRIPTION;
    public static final MethodHandle HANDLE;

    private final MemorySegment segment;

    static {
        CACHE = new HashMap<>();

        DESCRIPTION = FunctionDescriptor.ofVoid(
            Vec3.LAYOUT, 
            Vec3.LAYOUT, 
            JAVA_FLOAT, 
            JAVA_INT, 
            JAVA_FLOAT, 
            UNBOUNDED_ADDRESS
        );

        try {
            HANDLE = MethodHandles.lookup().findVirtual(DrawCapsuleFcn.class, "invoke", DESCRIPTION.toMethodType());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public DrawCapsuleFcn() {
        this(Arena.ofAuto());
    }

    public DrawCapsuleFcn(Arena arena) {
        this.segment = Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTION, arena);

        CACHE.put(this.segment.address(), new WeakReference<>(this));
    }

    public void invoke(
        MemorySegment p1,
        MemorySegment p2,
        float radius,
        int color,
        float alpha,
        MemorySegment context
    ) {
        invoke(
            new Vec3(p1),
            new Vec3(p2),
            radius,
            color,
            alpha,
            context
        );
    }

    public void invoke(
        Vec3 p1,
        Vec3 p2,
        float radius,
        int color,
        float alpha,
        MemorySegment context
    ) {
        throw new UnsupportedOperationException(
            "Override either the typed or raw callback method in DrawCapsuleFcn."
        );
    };

    public MemorySegment memorySegment() {
        return segment;
    }

    public static @Nullable DrawCapsuleFcn get(MemorySegment segment) {
        WeakReference<DrawCapsuleFcn> reference = CACHE.get(segment.address());

        if (reference == null)
            return null;

        return reference.get();
    }

}