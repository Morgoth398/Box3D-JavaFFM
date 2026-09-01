/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.box3d.dynamicTree;

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
import volucris.bindings.box3d.query.RayCastInput;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

/// ```
/// This function receives clipped ray cast input for a proxy. The function
/// returns the new ray fraction.
/// - return a value of 0 to terminate the ray cast
/// - return a value less than input->maxFraction to clip the ray
/// - return a value of input->maxFraction to continue the ray cast without clipping
/// ```
public abstract class TreeRayCastCallbackFcn {

    private static final Map<Long, WeakReference<TreeRayCastCallbackFcn>> CACHE;

    public static final FunctionDescriptor DESCRIPTION;
    public static final MethodHandle HANDLE;

    private final MemorySegment segment;

    static {
        CACHE = new HashMap<>();

        DESCRIPTION = FunctionDescriptor.of(
            JAVA_FLOAT, 
            UNBOUNDED_ADDRESS, 
            JAVA_INT, 
            JAVA_LONG, 
            UNBOUNDED_ADDRESS
        );

        try {
            HANDLE = MethodHandles.lookup().findVirtual(TreeRayCastCallbackFcn.class, "invoke", DESCRIPTION.toMethodType());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public TreeRayCastCallbackFcn() {
        this(Arena.ofAuto());
    }

    public TreeRayCastCallbackFcn(Arena arena) {
        this.segment = Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTION, arena);

        CACHE.put(this.segment.address(), new WeakReference<>(this));
    }

    public float invoke(
        MemorySegment input,
        int proxyId,
        long userData,
        MemorySegment context
    ) {
        return invoke(
            new RayCastInput(input),
            proxyId,
            userData,
            context
        );
    }

    public float invoke(
        RayCastInput input,
        int proxyId,
        long userData,
        MemorySegment context
    ) {
        throw new UnsupportedOperationException(
            "Override either the typed or raw callback method in TreeRayCastCallbackFcn."
        );
    };

    public MemorySegment memorySegment() {
        return segment;
    }

    public static @Nullable TreeRayCastCallbackFcn get(MemorySegment segment) {
        WeakReference<TreeRayCastCallbackFcn> reference = CACHE.get(segment.address());

        if (reference == null)
            return null;

        return reference.get();
    }

}