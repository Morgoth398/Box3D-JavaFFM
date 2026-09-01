/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.box3d.query;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;
import java.util.function.Consumer;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;

/// ```
/// Time of impact input
/// ```
public final class TOIInput
		implements Struct<TOIInput> {

    public static final StructLayout LAYOUT;

    public static final VarHandle MAX_FRACTION_HANDLE;

    public static final long PROXY_A_BYTE_OFFSET;
    public static final long PROXY_B_BYTE_OFFSET;
    public static final long SWEEP_A_BYTE_OFFSET;
    public static final long SWEEP_B_BYTE_OFFSET;
    public static final long MAX_FRACTION_BYTE_OFFSET;

    private final MemorySegment segment;

    private final ShapeProxy proxyA;
    private final ShapeProxy proxyB;
    private final Sweep sweepA;
    private final Sweep sweepB;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            ShapeProxy.LAYOUT.withName("proxyA"),
            ShapeProxy.LAYOUT.withName("proxyB"),
            Sweep.LAYOUT.withName("sweepA"),
            Sweep.LAYOUT.withName("sweepB"),
            JAVA_FLOAT.withName("maxFraction"),
            MemoryLayout.paddingLayout(4)
        ).withName("b3TOIInput").withByteAlignment(8);
        
        MAX_FRACTION_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxFraction"));
        
        PROXY_A_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("proxyA"));
        PROXY_B_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("proxyB"));
        SWEEP_A_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sweepA"));
        SWEEP_B_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sweepB"));
        MAX_FRACTION_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxFraction"));
        //@formatter:on
    }

    public TOIInput() {
        this(Arena.ofAuto());
    }
    
    public TOIInput(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public TOIInput(MemorySegment segment) {
        this.segment = segment;
    
        proxyA = new ShapeProxy(segment.asSlice(PROXY_A_BYTE_OFFSET, ShapeProxy.LAYOUT));
        proxyB = new ShapeProxy(segment.asSlice(PROXY_B_BYTE_OFFSET, ShapeProxy.LAYOUT));
        sweepA = new Sweep(segment.asSlice(SWEEP_A_BYTE_OFFSET, Sweep.LAYOUT));
        sweepB = new Sweep(segment.asSlice(SWEEP_B_BYTE_OFFSET, Sweep.LAYOUT));
    }

    /// @see #maxFraction()
    public TOIInput maxFraction(float maxFraction) {
    	MAX_FRACTION_HANDLE.set(segment, 0L, maxFraction);
    	return this;
    }
    
    /// ```
    /// Defines the sweep interval [0, tMax]
    /// ```
    public float maxFraction() {
    	return (float) MAX_FRACTION_HANDLE.get(segment, 0L);
    }
    
    /// @see #proxyA()
    public TOIInput proxyA(Consumer<ShapeProxy> consumer) {
    	consumer.accept(proxyA);
    	return this;
    }
    
    /// @see #proxyA()
    public TOIInput proxyA(ShapeProxy other) {
    	proxyA.set(other);
    	return this;
    }
    
    /// ```
    /// The proxy for shape A
    /// ```
    public ShapeProxy proxyA() {
    	return proxyA;
    }
    
    /// @see #proxyB()
    public TOIInput proxyB(Consumer<ShapeProxy> consumer) {
    	consumer.accept(proxyB);
    	return this;
    }
    
    /// @see #proxyB()
    public TOIInput proxyB(ShapeProxy other) {
    	proxyB.set(other);
    	return this;
    }
    
    /// ```
    /// The proxy for shape B
    /// ```
    public ShapeProxy proxyB() {
    	return proxyB;
    }
    
    /// @see #sweepA()
    public TOIInput sweepA(Consumer<Sweep> consumer) {
    	consumer.accept(sweepA);
    	return this;
    }
    
    /// @see #sweepA()
    public TOIInput sweepA(Sweep other) {
    	sweepA.set(other);
    	return this;
    }
    
    /// ```
    /// The movement of shape A
    /// ```
    public Sweep sweepA() {
    	return sweepA;
    }
    
    /// @see #sweepB()
    public TOIInput sweepB(Consumer<Sweep> consumer) {
    	consumer.accept(sweepB);
    	return this;
    }
    
    /// @see #sweepB()
    public TOIInput sweepB(Sweep other) {
    	sweepB.set(other);
    	return this;
    }
    
    /// ```
    /// The movement of shape B
    /// ```
    public Sweep sweepB() {
    	return sweepB;
    }
    
    @Override
    public TOIInput set(TOIInput other) {
        return set(other.segment);
    }
    
    @Override
    public TOIInput set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<TOIInput> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<TOIInput> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new TOIInput(segment),
            count
        );
    }
    
    public static NativeStructArray<TOIInput> array(Arena arena, TOIInput... structs) {
        NativeStructArray<TOIInput> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new TOIInput(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<TOIInput> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new TOIInput(segment)
        );
    }
    
}