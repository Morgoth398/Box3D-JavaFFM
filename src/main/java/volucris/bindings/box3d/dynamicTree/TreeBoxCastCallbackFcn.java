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
import volucris.bindings.box3d.query.BoxCastInput;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

/// ```
/// This function receives clipped AABB cast input for a proxy. The function returns the new cast
/// fraction.
/// - return a value of 0 to terminate the cast
/// - return a value less than input->maxFraction to clip the cast
/// - return a value of input->maxFraction to continue the cast without clipping
/// ```
public abstract class TreeBoxCastCallbackFcn {

    private static final Map<Long, WeakReference<TreeBoxCastCallbackFcn>> CACHE;

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
            HANDLE = MethodHandles.lookup().findVirtual(TreeBoxCastCallbackFcn.class, "invoke", DESCRIPTION.toMethodType());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public TreeBoxCastCallbackFcn() {
        this(Arena.ofAuto());
    }

    public TreeBoxCastCallbackFcn(Arena arena) {
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
            new BoxCastInput(input),
            proxyId,
            userData,
            context
        );
    }

    public float invoke(
        BoxCastInput input,
        int proxyId,
        long userData,
        MemorySegment context
    ) {
        throw new UnsupportedOperationException(
            "Override either the typed or raw callback method in TreeBoxCastCallbackFcn."
        );
    };

    public MemorySegment memorySegment() {
        return segment;
    }

    public static @Nullable TreeBoxCastCallbackFcn get(MemorySegment segment) {
        WeakReference<TreeBoxCastCallbackFcn> reference = CACHE.get(segment.address());

        if (reference == null)
            return null;

        return reference.get();
    }

}