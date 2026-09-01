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
/// Definition for a capsule in a compound shape.
/// ```
public final class CompoundCapsuleDef
		implements Struct<CompoundCapsuleDef> {

    public static final StructLayout LAYOUT;

    public static final long CAPSULE_BYTE_OFFSET;
    public static final long MATERIAL_BYTE_OFFSET;

    private final MemorySegment segment;

    private final Capsule capsule;
    private final SurfaceMaterial material;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            Capsule.LAYOUT.withName("capsule"),
            MemoryLayout.paddingLayout(4),
            SurfaceMaterial.LAYOUT.withName("material")
        ).withName("b3CompoundCapsuleDef").withByteAlignment(8);
        
        CAPSULE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("capsule"));
        MATERIAL_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("material"));
        //@formatter:on
    }

    public CompoundCapsuleDef() {
        this(Arena.ofAuto());
    }
    
    public CompoundCapsuleDef(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public CompoundCapsuleDef(MemorySegment segment) {
        this.segment = segment;
    
        capsule = new Capsule(segment.asSlice(CAPSULE_BYTE_OFFSET, Capsule.LAYOUT));
        material = new SurfaceMaterial(segment.asSlice(MATERIAL_BYTE_OFFSET, SurfaceMaterial.LAYOUT));
    }

    /// @see #capsule()
    public CompoundCapsuleDef capsule(Consumer<Capsule> consumer) {
    	consumer.accept(capsule);
    	return this;
    }
    
    /// @see #capsule()
    public CompoundCapsuleDef capsule(Capsule other) {
    	capsule.set(other);
    	return this;
    }
    
    /// ```
    /// Local capsule.
    /// ```
    public Capsule capsule() {
    	return capsule;
    }
    
    /// @see #material()
    public CompoundCapsuleDef material(Consumer<SurfaceMaterial> consumer) {
    	consumer.accept(material);
    	return this;
    }
    
    /// @see #material()
    public CompoundCapsuleDef material(SurfaceMaterial other) {
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
    public CompoundCapsuleDef set(CompoundCapsuleDef other) {
        return set(other.segment);
    }
    
    @Override
    public CompoundCapsuleDef set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<CompoundCapsuleDef> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<CompoundCapsuleDef> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new CompoundCapsuleDef(segment),
            count
        );
    }
    
    public static NativeStructArray<CompoundCapsuleDef> array(Arena arena, CompoundCapsuleDef... structs) {
        NativeStructArray<CompoundCapsuleDef> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new CompoundCapsuleDef(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<CompoundCapsuleDef> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new CompoundCapsuleDef(segment)
        );
    }
    
}