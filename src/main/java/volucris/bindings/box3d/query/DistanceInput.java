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
import volucris.bindings.box3d.math.Transform;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;

/// ```
/// Input for b3ShapeDistance
/// ```
public final class DistanceInput
		implements Struct<DistanceInput> {

    public static final StructLayout LAYOUT;

    public static final VarHandle USE_RADII_HANDLE;

    public static final long PROXY_A_BYTE_OFFSET;
    public static final long PROXY_B_BYTE_OFFSET;
    public static final long TRANSFORM_BYTE_OFFSET;
    public static final long USE_RADII_BYTE_OFFSET;

    private final MemorySegment segment;

    private final ShapeProxy proxyA;
    private final ShapeProxy proxyB;
    private final Transform transform;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            ShapeProxy.LAYOUT.withName("proxyA"),
            ShapeProxy.LAYOUT.withName("proxyB"),
            Transform.LAYOUT.withName("transform"),
            JAVA_BOOLEAN.withName("useRadii"),
            MemoryLayout.paddingLayout(3)
        ).withName("b3DistanceInput").withByteAlignment(8);
        
        USE_RADII_HANDLE = LAYOUT.varHandle(PathElement.groupElement("useRadii"));
        
        PROXY_A_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("proxyA"));
        PROXY_B_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("proxyB"));
        TRANSFORM_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("transform"));
        USE_RADII_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("useRadii"));
        //@formatter:on
    }

    public DistanceInput() {
        this(Arena.ofAuto());
    }
    
    public DistanceInput(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public DistanceInput(MemorySegment segment) {
        this.segment = segment;
    
        proxyA = new ShapeProxy(segment.asSlice(PROXY_A_BYTE_OFFSET, ShapeProxy.LAYOUT));
        proxyB = new ShapeProxy(segment.asSlice(PROXY_B_BYTE_OFFSET, ShapeProxy.LAYOUT));
        transform = new Transform(segment.asSlice(TRANSFORM_BYTE_OFFSET, Transform.LAYOUT));
    }

    /// @see #useRadii()
    public DistanceInput useRadii(boolean useRadii) {
    	USE_RADII_HANDLE.set(segment, 0L, useRadii);
    	return this;
    }
    
    /// ```
    /// Should the proxy radius be considered?
    /// ```
    public boolean useRadii() {
    	return (boolean) USE_RADII_HANDLE.get(segment, 0L);
    }
    
    /// @see #proxyA()
    public DistanceInput proxyA(Consumer<ShapeProxy> consumer) {
    	consumer.accept(proxyA);
    	return this;
    }
    
    /// @see #proxyA()
    public DistanceInput proxyA(ShapeProxy other) {
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
    public DistanceInput proxyB(Consumer<ShapeProxy> consumer) {
    	consumer.accept(proxyB);
    	return this;
    }
    
    /// @see #proxyB()
    public DistanceInput proxyB(ShapeProxy other) {
    	proxyB.set(other);
    	return this;
    }
    
    /// ```
    /// The proxy for shape B
    /// ```
    public ShapeProxy proxyB() {
    	return proxyB;
    }
    
    /// @see #transform()
    public DistanceInput transform(Consumer<Transform> consumer) {
    	consumer.accept(transform);
    	return this;
    }
    
    /// @see #transform()
    public DistanceInput transform(Transform other) {
    	transform.set(other);
    	return this;
    }
    
    /// ```
    /// Transform of shape B in shape A's frame, the relative pose B in A
    /// (b3InvMulWorldTransforms( worldA, worldB )). The query is origin independent and runs in frame A.
    /// ```
    public Transform transform() {
    	return transform;
    }
    
    @Override
    public DistanceInput set(DistanceInput other) {
        return set(other.segment);
    }
    
    @Override
    public DistanceInput set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<DistanceInput> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<DistanceInput> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new DistanceInput(segment),
            count
        );
    }
    
    public static NativeStructArray<DistanceInput> array(Arena arena, DistanceInput... structs) {
        NativeStructArray<DistanceInput> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new DistanceInput(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<DistanceInput> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new DistanceInput(segment)
        );
    }
    
}