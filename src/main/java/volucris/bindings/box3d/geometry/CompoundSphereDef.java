/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.box3d.geometry;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.util.function.Consumer;
import volucris.bindings.box3d.shape.SurfaceMaterial;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;

/// ```
/// Definition for a sphere in a compound shape.
/// ```
public final class CompoundSphereDef
		implements Struct<CompoundSphereDef> {

    public static final StructLayout LAYOUT;

    public static final long SPHERE_BYTE_OFFSET;
    public static final long MATERIAL_BYTE_OFFSET;

    private final MemorySegment segment;

    private final Sphere sphere;
    private final SurfaceMaterial material;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            Sphere.LAYOUT.withName("sphere"),
            SurfaceMaterial.LAYOUT.withName("material")
        ).withName("b3CompoundSphereDef").withByteAlignment(8);
        
        SPHERE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sphere"));
        MATERIAL_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("material"));
        //@formatter:on
    }

    public CompoundSphereDef() {
        this(Arena.ofAuto());
    }
    
    public CompoundSphereDef(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public CompoundSphereDef(MemorySegment segment) {
        this.segment = segment;
    
        sphere = new Sphere(segment.asSlice(SPHERE_BYTE_OFFSET, Sphere.LAYOUT));
        material = new SurfaceMaterial(segment.asSlice(MATERIAL_BYTE_OFFSET, SurfaceMaterial.LAYOUT));
    }

    /// @see #sphere()
    public CompoundSphereDef sphere(Consumer<Sphere> consumer) {
    	consumer.accept(sphere);
    	return this;
    }
    
    /// @see #sphere()
    public CompoundSphereDef sphere(Sphere other) {
    	sphere.set(other);
    	return this;
    }
    
    /// ```
    /// Local sphere.
    /// ```
    public Sphere sphere() {
    	return sphere;
    }
    
    /// @see #material()
    public CompoundSphereDef material(Consumer<SurfaceMaterial> consumer) {
    	consumer.accept(material);
    	return this;
    }
    
    /// @see #material()
    public CompoundSphereDef material(SurfaceMaterial other) {
    	material.set(other);
    	return this;
    }
    
    /// ```
    /// Material properties.
    /// ```
    public SurfaceMaterial material() {
    	return material;
    }
    
    @Override
    public CompoundSphereDef set(CompoundSphereDef other) {
        return set(other.segment);
    }
    
    @Override
    public CompoundSphereDef set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<CompoundSphereDef> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<CompoundSphereDef> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new CompoundSphereDef(segment),
            count
        );
    }
    
    public static NativeStructArray<CompoundSphereDef> array(Arena arena, CompoundSphereDef... structs) {
        NativeStructArray<CompoundSphereDef> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new CompoundSphereDef(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<CompoundSphereDef> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new CompoundSphereDef(segment)
        );
    }
    
}