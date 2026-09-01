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
/// Low level ray cast input data.
/// ```
public final class RayCastInput
		implements Struct<RayCastInput> {

    public static final StructLayout LAYOUT;

    public static final VarHandle MAX_FRACTION_HANDLE;

    public static final long ORIGIN_BYTE_OFFSET;
    public static final long TRANSLATION_BYTE_OFFSET;
    public static final long MAX_FRACTION_BYTE_OFFSET;

    private final MemorySegment segment;

    private final Vec3 origin;
    private final Vec3 translation;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            Vec3.LAYOUT.withName("origin"),
            Vec3.LAYOUT.withName("translation"),
            JAVA_FLOAT.withName("maxFraction")
        ).withName("b3RayCastInput").withByteAlignment(4);
        
        MAX_FRACTION_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxFraction"));
        
        ORIGIN_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("origin"));
        TRANSLATION_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("translation"));
        MAX_FRACTION_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxFraction"));
        //@formatter:on
    }

    public RayCastInput() {
        this(Arena.ofAuto());
    }
    
    public RayCastInput(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public RayCastInput(MemorySegment segment) {
        this.segment = segment;
    
        origin = new Vec3(segment.asSlice(ORIGIN_BYTE_OFFSET, Vec3.LAYOUT));
        translation = new Vec3(segment.asSlice(TRANSLATION_BYTE_OFFSET, Vec3.LAYOUT));
    }

    /// @see #maxFraction()
    public RayCastInput maxFraction(float maxFraction) {
    	MAX_FRACTION_HANDLE.set(segment, 0L, maxFraction);
    	return this;
    }
    
    /// ```
    /// The maximum fraction of the translation to consider, typically 1
    /// ```
    public float maxFraction() {
    	return (float) MAX_FRACTION_HANDLE.get(segment, 0L);
    }
    
    /// @see #origin()
    public RayCastInput origin(Consumer<Vec3> consumer) {
    	consumer.accept(origin);
    	return this;
    }
    
    /// @see #origin()
    public RayCastInput origin(Vec3 other) {
    	origin.set(other);
    	return this;
    }
    
    /// ```
    /// Start point of the ray cast.
    /// ```
    public Vec3 origin() {
    	return origin;
    }
    
    /// @see #translation()
    public RayCastInput translation(Consumer<Vec3> consumer) {
    	consumer.accept(translation);
    	return this;
    }
    
    /// @see #translation()
    public RayCastInput translation(Vec3 other) {
    	translation.set(other);
    	return this;
    }
    
    /// ```
    /// Translation of the ray cast.
    /// end = start + translation.
    /// ```
    public Vec3 translation() {
    	return translation;
    }
    
    @Override
    public RayCastInput set(RayCastInput other) {
        return set(other.segment);
    }
    
    @Override
    public RayCastInput set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<RayCastInput> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<RayCastInput> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new RayCastInput(segment),
            count
        );
    }
    
    public static NativeStructArray<RayCastInput> array(Arena arena, RayCastInput... structs) {
        NativeStructArray<RayCastInput> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new RayCastInput(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<RayCastInput> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new RayCastInput(segment)
        );
    }
    
}