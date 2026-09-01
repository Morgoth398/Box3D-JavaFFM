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
import volucris.bindings.box3d.math.Vec3;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;

/// ```
/// Low level shape cast input in generic form. This allows casting an arbitrary point
/// cloud wrap with a radius. For example, a sphere is a single point with a non-zero radius.
/// A capsule is two points with a non-zero radius. A box is four points with a zero radius.
/// ```
public final class ShapeCastInput
		implements Struct<ShapeCastInput> {

    public static final StructLayout LAYOUT;

    public static final VarHandle MAX_FRACTION_HANDLE;
    public static final VarHandle CAN_ENCROACH_HANDLE;

    public static final long PROXY_BYTE_OFFSET;
    public static final long TRANSLATION_BYTE_OFFSET;
    public static final long MAX_FRACTION_BYTE_OFFSET;
    public static final long CAN_ENCROACH_BYTE_OFFSET;

    private final MemorySegment segment;

    private final ShapeProxy proxy;
    private final Vec3 translation;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            ShapeProxy.LAYOUT.withName("proxy"),
            Vec3.LAYOUT.withName("translation"),
            JAVA_FLOAT.withName("maxFraction"),
            JAVA_BOOLEAN.withName("canEncroach"),
            MemoryLayout.paddingLayout(7)
        ).withName("b3ShapeCastInput").withByteAlignment(8);
        
        MAX_FRACTION_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxFraction"));
        CAN_ENCROACH_HANDLE = LAYOUT.varHandle(PathElement.groupElement("canEncroach"));
        
        PROXY_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("proxy"));
        TRANSLATION_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("translation"));
        MAX_FRACTION_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxFraction"));
        CAN_ENCROACH_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("canEncroach"));
        //@formatter:on
    }

    public ShapeCastInput() {
        this(Arena.ofAuto());
    }
    
    public ShapeCastInput(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public ShapeCastInput(MemorySegment segment) {
        this.segment = segment;
    
        proxy = new ShapeProxy(segment.asSlice(PROXY_BYTE_OFFSET, ShapeProxy.LAYOUT));
        translation = new Vec3(segment.asSlice(TRANSLATION_BYTE_OFFSET, Vec3.LAYOUT));
    }

    /// @see #maxFraction()
    public ShapeCastInput maxFraction(float maxFraction) {
    	MAX_FRACTION_HANDLE.set(segment, 0L, maxFraction);
    	return this;
    }
    
    /// ```
    /// The maximum fraction of the translation to consider, typically 1.
    /// ```
    public float maxFraction() {
    	return (float) MAX_FRACTION_HANDLE.get(segment, 0L);
    }
    
    /// @see #canEncroach()
    public ShapeCastInput canEncroach(boolean canEncroach) {
    	CAN_ENCROACH_HANDLE.set(segment, 0L, canEncroach);
    	return this;
    }
    
    /// ```
    /// Allow shape cast to encroach when initially touching. This only works if the radius is greater than zero.
    /// ```
    public boolean canEncroach() {
    	return (boolean) CAN_ENCROACH_HANDLE.get(segment, 0L);
    }
    
    /// @see #proxy()
    public ShapeCastInput proxy(Consumer<ShapeProxy> consumer) {
    	consumer.accept(proxy);
    	return this;
    }
    
    /// @see #proxy()
    public ShapeCastInput proxy(ShapeProxy other) {
    	proxy.set(other);
    	return this;
    }
    
    /// ```
    /// A generic query shape.
    /// ```
    public ShapeProxy proxy() {
    	return proxy;
    }
    
    /// @see #translation()
    public ShapeCastInput translation(Consumer<Vec3> consumer) {
    	consumer.accept(translation);
    	return this;
    }
    
    /// @see #translation()
    public ShapeCastInput translation(Vec3 other) {
    	translation.set(other);
    	return this;
    }
    
    /// ```
    /// The translation of the shape cast.
    /// ```
    public Vec3 translation() {
    	return translation;
    }
    
    @Override
    public ShapeCastInput set(ShapeCastInput other) {
        return set(other.segment);
    }
    
    @Override
    public ShapeCastInput set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<ShapeCastInput> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<ShapeCastInput> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new ShapeCastInput(segment),
            count
        );
    }
    
    public static NativeStructArray<ShapeCastInput> array(Arena arena, ShapeCastInput... structs) {
        NativeStructArray<ShapeCastInput> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new ShapeCastInput(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<ShapeCastInput> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new ShapeCastInput(segment)
        );
    }
    
}