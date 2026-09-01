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
/// Draw a line segment.
/// ```
public abstract class DrawSegmentFcn {

    private static final Map<Long, WeakReference<DrawSegmentFcn>> CACHE;

    public static final FunctionDescriptor DESCRIPTION;
    public static final MethodHandle HANDLE;

    private final MemorySegment segment;

    static {
        CACHE = new HashMap<>();

        DESCRIPTION = FunctionDescriptor.ofVoid(
            Vec3.LAYOUT, 
            Vec3.LAYOUT, 
            JAVA_INT, 
            UNBOUNDED_ADDRESS
        );

        try {
            HANDLE = MethodHandles.lookup().findVirtual(DrawSegmentFcn.class, "invoke", DESCRIPTION.toMethodType());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public DrawSegmentFcn() {
        this(Arena.ofAuto());
    }

    public DrawSegmentFcn(Arena arena) {
        this.segment = Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTION, arena);

        CACHE.put(this.segment.address(), new WeakReference<>(this));
    }

    public void invoke(
        MemorySegment p1,
        MemorySegment p2,
        int color,
        MemorySegment context
    ) {
        invoke(
            new Vec3(p1),
            new Vec3(p2),
            color,
            context
        );
    }

    public void invoke(
        Vec3 p1,
        Vec3 p2,
        int color,
        MemorySegment context
    ) {
        throw new UnsupportedOperationException(
            "Override either the typed or raw callback method in DrawSegmentFcn."
        );
    };

    public MemorySegment memorySegment() {
        return segment;
    }

    public static @Nullable DrawSegmentFcn get(MemorySegment segment) {
        WeakReference<DrawSegmentFcn> reference = CACHE.get(segment.address());

        if (reference == null)
            return null;

        return reference.get();
    }

}