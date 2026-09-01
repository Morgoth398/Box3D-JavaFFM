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
import volucris.bindings.box3d.math.Vec3;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;

/// ```
/// Input parameters for b3ShapeCast
/// ```
public final class ShapeCastPairInput
		implements Struct<ShapeCastPairInput> {

    public static final StructLayout LAYOUT;

    public static final VarHandle MAX_FRACTION_HANDLE;
    public static final VarHandle CAN_ENCROACH_HANDLE;

    public static final long PROXY_A_BYTE_OFFSET;
    public static final long PROXY_B_BYTE_OFFSET;
    public static final long TRANSFORM_BYTE_OFFSET;
    public static final long TRANSLATION_B_BYTE_OFFSET;
    public static final long MAX_FRACTION_BYTE_OFFSET;
    public static final long CAN_ENCROACH_BYTE_OFFSET;

    private final MemorySegment segment;

    private final ShapeProxy proxyA;
    private final ShapeProxy proxyB;
    private final Transform transform;
    private final Vec3 translationB;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            ShapeProxy.LAYOUT.withName("proxyA"),
            ShapeProxy.LAYOUT.withName("proxyB"),
            Transform.LAYOUT.withName("transform"),
            Vec3.LAYOUT.withName("translationB"),
            JAVA_FLOAT.withName("maxFraction"),
            JAVA_BOOLEAN.withName("canEncroach"),
            MemoryLayout.paddingLayout(3)
        ).withName("b3ShapeCastPairInput").withByteAlignment(8);
        
        MAX_FRACTION_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxFraction"));
        CAN_ENCROACH_HANDLE = LAYOUT.varHandle(PathElement.groupElement("canEncroach"));
        
        PROXY_A_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("proxyA"));
        PROXY_B_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("proxyB"));
        TRANSFORM_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("transform"));
        TRANSLATION_B_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("translationB"));
        MAX_FRACTION_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxFraction"));
        CAN_ENCROACH_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("canEncroach"));
        //@formatter:on
    }

    public ShapeCastPairInput() {
        this(Arena.ofAuto());
    }
    
    public ShapeCastPairInput(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public ShapeCastPairInput(MemorySegment segment) {
        this.segment = segment;
    
        proxyA = new ShapeProxy(segment.asSlice(PROXY_A_BYTE_OFFSET, ShapeProxy.LAYOUT));
        proxyB = new ShapeProxy(segment.asSlice(PROXY_B_BYTE_OFFSET, ShapeProxy.LAYOUT));
        transform = new Transform(segment.asSlice(TRANSFORM_BYTE_OFFSET, Transform.LAYOUT));
        translationB = new Vec3(segment.asSlice(TRANSLATION_B_BYTE_OFFSET, Vec3.LAYOUT));
    }

    /// @see #maxFraction()
    public ShapeCastPairInput maxFraction(float maxFraction) {
    	MAX_FRACTION_HANDLE.set(segment, 0L, maxFraction);
    	return this;
    }
    
    /// ```
    /// The fraction of the translation to consider, typically 1
    /// ```
    public float maxFraction() {
    	return (float) MAX_FRACTION_HANDLE.get(segment, 0L);
    }
    
    /// @see #canEncroach()
    public ShapeCastPairInput canEncroach(boolean canEncroach) {
    	CAN_ENCROACH_HANDLE.set(segment, 0L, canEncroach);
    	return this;
    }
    
    /// ```
    /// Allows shapes with a radius to move slightly closer if already touching
    /// ```
    public boolean canEncroach() {
    	return (boolean) CAN_ENCROACH_HANDLE.get(segment, 0L);
    }
    
    /// @see #proxyA()
    public ShapeCastPairInput proxyA(Consumer<ShapeProxy> consumer) {
    	consumer.accept(proxyA);
    	return this;
    }
    
    /// @see #proxyA()
    public ShapeCastPairInput proxyA(ShapeProxy other) {
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
    public ShapeCastPairInput proxyB(Consumer<ShapeProxy> consumer) {
    	consumer.accept(proxyB);
    	return this;
    }
    
    /// @see #proxyB()
    public ShapeCastPairInput proxyB(ShapeProxy other) {
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
    public ShapeCastPairInput transform(Consumer<Transform> consumer) {
    	consumer.accept(transform);
    	return this;
    }
    
    /// @see #transform()
    public ShapeCastPairInput transform(Transform other) {
    	transform.set(other);
    	return this;
    }
    
    /// ```
    /// Transform of shape B in shape A's frame, the relative pose B in A
    /// ```
    public Transform transform() {
    	return transform;
    }
    
    /// @see #translationB()
    public ShapeCastPairInput translationB(Consumer<Vec3> consumer) {
    	consumer.accept(translationB);
    	return this;
    }
    
    /// @see #translationB()
    public ShapeCastPairInput translationB(Vec3 other) {
    	translationB.set(other);
    	return this;
    }
    
    /// ```
    /// The translation of shape B, in A's frame
    /// ```
    public Vec3 translationB() {
    	return translationB;
    }
    
    @Override
    public ShapeCastPairInput set(ShapeCastPairInput other) {
        return set(other.segment);
    }
    
    @Override
    public ShapeCastPairInput set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<ShapeCastPairInput> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<ShapeCastPairInput> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new ShapeCastPairInput(segment),
            count
        );
    }
    
    public static NativeStructArray<ShapeCastPairInput> array(Arena arena, ShapeCastPairInput... structs) {
        NativeStructArray<ShapeCastPairInput> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new ShapeCastPairInput(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<ShapeCastPairInput> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new ShapeCastPairInput(segment)
        );
    }
    
}