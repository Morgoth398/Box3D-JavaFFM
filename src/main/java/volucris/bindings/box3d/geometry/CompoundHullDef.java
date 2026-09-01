/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.box3d.geometry;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;
import java.util.function.Consumer;
import org.jspecify.annotations.Nullable;
import volucris.bindings.box3d.math.Transform;
import volucris.bindings.box3d.shape.SurfaceMaterial;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

/// ```
/// Definition for a convex hull in a compound shape.
/// ```
public final class CompoundHullDef
		implements Struct<CompoundHullDef> {

    public static final StructLayout LAYOUT;

    public static final VarHandle HULL_HANDLE;

    public static final long HULL_BYTE_OFFSET;
    public static final long TRANSFORM_BYTE_OFFSET;
    public static final long MATERIAL_BYTE_OFFSET;

    private final MemorySegment segment;

    private final Transform transform;
    private final SurfaceMaterial material;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            UNBOUNDED_ADDRESS.withName("hull"),
            Transform.LAYOUT.withName("transform"),
            MemoryLayout.paddingLayout(4),
            SurfaceMaterial.LAYOUT.withName("material")
        ).withName("b3CompoundHullDef").withByteAlignment(8);
        
        HULL_HANDLE = LAYOUT.varHandle(PathElement.groupElement("hull"));
        
        HULL_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("hull"));
        TRANSFORM_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("transform"));
        MATERIAL_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("material"));
        //@formatter:on
    }

    public CompoundHullDef() {
        this(Arena.ofAuto());
    }
    
    public CompoundHullDef(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public CompoundHullDef(MemorySegment segment) {
        this.segment = segment;
    
        transform = new Transform(segment.asSlice(TRANSFORM_BYTE_OFFSET, Transform.LAYOUT));
        material = new SurfaceMaterial(segment.asSlice(MATERIAL_BYTE_OFFSET, SurfaceMaterial.LAYOUT));
    }

    /// @see #hull()
    public CompoundHullDef hull(HullData hull) {
    	HULL_HANDLE.set(segment, 0L, hull.memorySegment());
    	return this;
    }
    
    /// ```
    /// Shared hull.
    /// ```
    public @Nullable HullData hull() {
    	MemorySegment segment = (MemorySegment) HULL_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new HullData(segment);
    }
    
    /// @see #transform()
    public CompoundHullDef transform(Consumer<Transform> consumer) {
    	consumer.accept(transform);
    	return this;
    }
    
    /// @see #transform()
    public CompoundHullDef transform(Transform other) {
    	transform.set(other);
    	return this;
    }
    
    /// ```
    /// Transform of the shared hull into compound local space.
    /// ```
    public Transform transform() {
    	return transform;
    }
    
    /// @see #material()
    public CompoundHullDef material(Consumer<SurfaceMaterial> consumer) {
    	consumer.accept(material);
    	return this;
    }
    
    /// @see #material()
    public CompoundHullDef material(SurfaceMaterial other) {
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
    public CompoundHullDef set(CompoundHullDef other) {
        return set(other.segment);
    }
    
    @Override
    public CompoundHullDef set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<CompoundHullDef> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<CompoundHullDef> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new CompoundHullDef(segment),
            count
        );
    }
    
    public static NativeStructArray<CompoundHullDef> array(Arena arena, CompoundHullDef... structs) {
        NativeStructArray<CompoundHullDef> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new CompoundHullDef(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<CompoundHullDef> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new CompoundHullDef(segment)
        );
    }
    
}