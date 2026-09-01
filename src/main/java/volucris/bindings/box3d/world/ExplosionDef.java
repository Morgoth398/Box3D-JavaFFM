/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.box3d.world;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.StructLayout;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.util.function.Consumer;
import org.jspecify.annotations.Nullable;
import volucris.bindings.box3d.math.Vec3;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

/// ```
/// The explosion definition is used to configure options for explosions. Explosions
/// consider shape geometry when computing the impulse.
/// @ingroup world
/// ```
public final class ExplosionDef
		implements Struct<ExplosionDef> {

    private static final LazyConstant<MethodHandle> B3_DEFAULT_EXPLOSION_DEF;

    public static final StructLayout LAYOUT;

    public static final VarHandle MASK_BITS_HANDLE;
    public static final VarHandle RADIUS_HANDLE;
    public static final VarHandle FALLOFF_HANDLE;
    public static final VarHandle IMPULSE_PER_AREA_HANDLE;

    public static final long MASK_BITS_BYTE_OFFSET;
    public static final long POSITION_BYTE_OFFSET;
    public static final long RADIUS_BYTE_OFFSET;
    public static final long FALLOFF_BYTE_OFFSET;
    public static final long IMPULSE_PER_AREA_BYTE_OFFSET;

    private final MemorySegment segment;

    private final Vec3 position;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_LONG.withName("maskBits"),
            Vec3.LAYOUT.withName("position"),
            JAVA_FLOAT.withName("radius"),
            JAVA_FLOAT.withName("falloff"),
            JAVA_FLOAT.withName("impulsePerArea")
        ).withName("b3ExplosionDef").withByteAlignment(8);
        
        B3_DEFAULT_EXPLOSION_DEF = downcallHandle("b3DefaultExplosionDef", ExplosionDef.LAYOUT);
        
        MASK_BITS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maskBits"));
        RADIUS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("radius"));
        FALLOFF_HANDLE = LAYOUT.varHandle(PathElement.groupElement("falloff"));
        IMPULSE_PER_AREA_HANDLE = LAYOUT.varHandle(PathElement.groupElement("impulsePerArea"));
        
        MASK_BITS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maskBits"));
        POSITION_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("position"));
        RADIUS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("radius"));
        FALLOFF_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("falloff"));
        IMPULSE_PER_AREA_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("impulsePerArea"));
        //@formatter:on
    }

    public ExplosionDef() {
        this(Arena.ofAuto());
    }
    
    public ExplosionDef(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public ExplosionDef(MemorySegment segment) {
        this.segment = segment;
    
        position = new Vec3(segment.asSlice(POSITION_BYTE_OFFSET, Vec3.LAYOUT));
    }

    /// ```
    /// Use this to initialize your explosion definition
    /// @ingroup world
    /// ```
    public static MemorySegment ndefaultExplosionDef(
    	SegmentAllocator allocator
    ) {
    	MethodHandle method = B3_DEFAULT_EXPLOSION_DEF.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ndefaultExplosionDef].
    public static @Nullable ExplosionDef defaultExplosionDef(
    	SegmentAllocator allocator
    ) {
    	MemorySegment segment = ndefaultExplosionDef(
    		allocator
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new ExplosionDef(segment);
    }
    
    /// @see #maskBits()
    public ExplosionDef maskBits(long maskBits) {
    	MASK_BITS_HANDLE.set(segment, 0L, maskBits);
    	return this;
    }
    
    /// ```
    /// Mask bits to filter shapes
    /// ```
    public long maskBits() {
    	return (long) MASK_BITS_HANDLE.get(segment, 0L);
    }
    
    /// @see #radius()
    public ExplosionDef radius(float radius) {
    	RADIUS_HANDLE.set(segment, 0L, radius);
    	return this;
    }
    
    /// ```
    /// The radius of the explosion
    /// ```
    public float radius() {
    	return (float) RADIUS_HANDLE.get(segment, 0L);
    }
    
    /// @see #falloff()
    public ExplosionDef falloff(float falloff) {
    	FALLOFF_HANDLE.set(segment, 0L, falloff);
    	return this;
    }
    
    /// ```
    /// The falloff distance beyond the radius. Impulse is reduced to zero at this distance.
    /// ```
    public float falloff() {
    	return (float) FALLOFF_HANDLE.get(segment, 0L);
    }
    
    /// @see #impulsePerArea()
    public ExplosionDef impulsePerArea(float impulsePerArea) {
    	IMPULSE_PER_AREA_HANDLE.set(segment, 0L, impulsePerArea);
    	return this;
    }
    
    /// ```
    /// Impulse per unit area. This applies an impulse according to the shape area that
    /// is facing the explosion. Explosions only apply to spheres, capsules, and hulls. This
    /// may be negative for implosions.
    /// ```
    public float impulsePerArea() {
    	return (float) IMPULSE_PER_AREA_HANDLE.get(segment, 0L);
    }
    
    /// @see #position()
    public ExplosionDef position(Consumer<Vec3> consumer) {
    	consumer.accept(position);
    	return this;
    }
    
    /// @see #position()
    public ExplosionDef position(Vec3 other) {
    	position.set(other);
    	return this;
    }
    
    /// ```
    /// The center of the explosion in world space
    /// ```
    public Vec3 position() {
    	return position;
    }
    
    @Override
    public ExplosionDef set(ExplosionDef other) {
        return set(other.segment);
    }
    
    @Override
    public ExplosionDef set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<ExplosionDef> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<ExplosionDef> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new ExplosionDef(segment),
            count
        );
    }
    
    public static NativeStructArray<ExplosionDef> array(Arena arena, ExplosionDef... structs) {
        NativeStructArray<ExplosionDef> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new ExplosionDef(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<ExplosionDef> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new ExplosionDef(segment)
        );
    }
    
}