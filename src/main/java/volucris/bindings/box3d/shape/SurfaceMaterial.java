/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.box3d.shape;

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
/// Material properties supported per triangle on meshes and height fields
/// @ingroup shape
/// ```
public final class SurfaceMaterial
		implements Struct<SurfaceMaterial> {

    private static final LazyConstant<MethodHandle> B3_DEFAULT_SURFACE_MATERIAL;

    public static final StructLayout LAYOUT;

    public static final VarHandle FRICTION_HANDLE;
    public static final VarHandle RESTITUTION_HANDLE;
    public static final VarHandle ROLLING_RESISTANCE_HANDLE;
    public static final VarHandle USER_MATERIAL_ID_HANDLE;
    public static final VarHandle CUSTOM_COLOR_HANDLE;

    public static final long FRICTION_BYTE_OFFSET;
    public static final long RESTITUTION_BYTE_OFFSET;
    public static final long ROLLING_RESISTANCE_BYTE_OFFSET;
    public static final long TANGENT_VELOCITY_BYTE_OFFSET;
    public static final long USER_MATERIAL_ID_BYTE_OFFSET;
    public static final long CUSTOM_COLOR_BYTE_OFFSET;

    private final MemorySegment segment;

    private final Vec3 tangentVelocity;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_FLOAT.withName("friction"),
            JAVA_FLOAT.withName("restitution"),
            JAVA_FLOAT.withName("rollingResistance"),
            Vec3.LAYOUT.withName("tangentVelocity"),
            JAVA_LONG.withName("userMaterialId"),
            JAVA_INT.withName("customColor"),
            MemoryLayout.paddingLayout(4)
        ).withName("b3SurfaceMaterial").withByteAlignment(8);
        
        B3_DEFAULT_SURFACE_MATERIAL = downcallHandle("b3DefaultSurfaceMaterial", SurfaceMaterial.LAYOUT);
        
        FRICTION_HANDLE = LAYOUT.varHandle(PathElement.groupElement("friction"));
        RESTITUTION_HANDLE = LAYOUT.varHandle(PathElement.groupElement("restitution"));
        ROLLING_RESISTANCE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("rollingResistance"));
        USER_MATERIAL_ID_HANDLE = LAYOUT.varHandle(PathElement.groupElement("userMaterialId"));
        CUSTOM_COLOR_HANDLE = LAYOUT.varHandle(PathElement.groupElement("customColor"));
        
        FRICTION_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("friction"));
        RESTITUTION_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("restitution"));
        ROLLING_RESISTANCE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("rollingResistance"));
        TANGENT_VELOCITY_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("tangentVelocity"));
        USER_MATERIAL_ID_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("userMaterialId"));
        CUSTOM_COLOR_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("customColor"));
        //@formatter:on
    }

    public SurfaceMaterial() {
        this(Arena.ofAuto());
    }
    
    public SurfaceMaterial(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public SurfaceMaterial(MemorySegment segment) {
        this.segment = segment;
    
        tangentVelocity = new Vec3(segment.asSlice(TANGENT_VELOCITY_BYTE_OFFSET, Vec3.LAYOUT));
    }

    /// ```
    /// Use this to initialize your surface material
    /// @ingroup shape
    /// ```
    public static MemorySegment ndefaultSurfaceMaterial(
    	SegmentAllocator allocator
    ) {
    	MethodHandle method = B3_DEFAULT_SURFACE_MATERIAL.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ndefaultSurfaceMaterial].
    public static @Nullable SurfaceMaterial defaultSurfaceMaterial(
    	SegmentAllocator allocator
    ) {
    	MemorySegment segment = ndefaultSurfaceMaterial(
    		allocator
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new SurfaceMaterial(segment);
    }
    
    /// @see #friction()
    public SurfaceMaterial friction(float friction) {
    	FRICTION_HANDLE.set(segment, 0L, friction);
    	return this;
    }
    
    /// ```
    /// The Coulomb (dry) friction coefficient, usually in the range [0,1].
    /// ```
    public float friction() {
    	return (float) FRICTION_HANDLE.get(segment, 0L);
    }
    
    /// @see #restitution()
    public SurfaceMaterial restitution(float restitution) {
    	RESTITUTION_HANDLE.set(segment, 0L, restitution);
    	return this;
    }
    
    /// ```
    /// The coefficient of restitution (bounce) usually in the range [0,1].
    /// https://en.wikipedia.org/wiki/Coefficient_of_restitution
    /// ```
    public float restitution() {
    	return (float) RESTITUTION_HANDLE.get(segment, 0L);
    }
    
    /// @see #rollingResistance()
    public SurfaceMaterial rollingResistance(float rollingResistance) {
    	ROLLING_RESISTANCE_HANDLE.set(segment, 0L, rollingResistance);
    	return this;
    }
    
    /// ```
    /// The rolling resistance usually in the range [0,1]. This is only used for spheres and capsules.
    /// ```
    public float rollingResistance() {
    	return (float) ROLLING_RESISTANCE_HANDLE.get(segment, 0L);
    }
    
    /// @see #userMaterialId()
    public SurfaceMaterial userMaterialId(long userMaterialId) {
    	USER_MATERIAL_ID_HANDLE.set(segment, 0L, userMaterialId);
    	return this;
    }
    
    /// ```
    /// User material identifier. This is passed with query results and to friction and restitution
    /// combining functions. It is not used internally.
    /// ```
    public long userMaterialId() {
    	return (long) USER_MATERIAL_ID_HANDLE.get(segment, 0L);
    }
    
    /// @see #customColor()
    public SurfaceMaterial customColor(int customColor) {
    	CUSTOM_COLOR_HANDLE.set(segment, 0L, customColor);
    	return this;
    }
    
    /// ```
    /// Custom debug draw color. Ignored if 0. The low 24 bits are RGB. The high byte may
    /// carry a b3DebugMaterial preset, see b3MakeDebugColor.
    /// @see b3HexColor
    /// ```
    public int customColor() {
    	return (int) CUSTOM_COLOR_HANDLE.get(segment, 0L);
    }
    
    /// @see #tangentVelocity()
    public SurfaceMaterial tangentVelocity(Consumer<Vec3> consumer) {
    	consumer.accept(tangentVelocity);
    	return this;
    }
    
    /// @see #tangentVelocity()
    public SurfaceMaterial tangentVelocity(Vec3 other) {
    	tangentVelocity.set(other);
    	return this;
    }
    
    /// ```
    /// The tangent velocity for conveyor belts. This is local to the shape and will be projected
    /// onto the contact surface.
    /// ```
    public Vec3 tangentVelocity() {
    	return tangentVelocity;
    }
    
    @Override
    public SurfaceMaterial set(SurfaceMaterial other) {
        return set(other.segment);
    }
    
    @Override
    public SurfaceMaterial set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<SurfaceMaterial> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<SurfaceMaterial> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new SurfaceMaterial(segment),
            count
        );
    }
    
    public static NativeStructArray<SurfaceMaterial> array(Arena arena, SurfaceMaterial... structs) {
        NativeStructArray<SurfaceMaterial> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new SurfaceMaterial(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<SurfaceMaterial> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new SurfaceMaterial(segment)
        );
    }
    
}