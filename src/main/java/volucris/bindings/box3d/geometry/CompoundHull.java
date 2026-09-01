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
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

/// ```
/// A hull that lives in a compound.
/// ```
public final class CompoundHull
		implements Struct<CompoundHull> {

    public static final StructLayout LAYOUT;

    public static final VarHandle HULL_HANDLE;
    public static final VarHandle MATERIAL_INDEX_HANDLE;

    public static final long HULL_BYTE_OFFSET;
    public static final long TRANSFORM_BYTE_OFFSET;
    public static final long MATERIAL_INDEX_BYTE_OFFSET;

    private final MemorySegment segment;

    private final Transform transform;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            UNBOUNDED_ADDRESS.withName("hull"),
            Transform.LAYOUT.withName("transform"),
            JAVA_INT.withName("materialIndex")
        ).withName("b3CompoundHull").withByteAlignment(8);
        
        HULL_HANDLE = LAYOUT.varHandle(PathElement.groupElement("hull"));
        MATERIAL_INDEX_HANDLE = LAYOUT.varHandle(PathElement.groupElement("materialIndex"));
        
        HULL_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("hull"));
        TRANSFORM_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("transform"));
        MATERIAL_INDEX_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("materialIndex"));
        //@formatter:on
    }

    public CompoundHull() {
        this(Arena.ofAuto());
    }
    
    public CompoundHull(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public CompoundHull(MemorySegment segment) {
        this.segment = segment;
    
        transform = new Transform(segment.asSlice(TRANSFORM_BYTE_OFFSET, Transform.LAYOUT));
    }

    /// @see #hull()
    public CompoundHull hull(HullData hull) {
    	HULL_HANDLE.set(segment, 0L, hull.memorySegment());
    	return this;
    }
    
    /// ```
    /// Pointer to the unique shared hull.
    /// ```
    public @Nullable HullData hull() {
    	MemorySegment segment = (MemorySegment) HULL_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new HullData(segment);
    }
    
    /// @see #materialIndex()
    public CompoundHull materialIndex(int materialIndex) {
    	MATERIAL_INDEX_HANDLE.set(segment, 0L, materialIndex);
    	return this;
    }
    
    /// ```
    /// Index to a shared material.
    /// ```
    public int materialIndex() {
    	return (int) MATERIAL_INDEX_HANDLE.get(segment, 0L);
    }
    
    /// @see #transform()
    public CompoundHull transform(Consumer<Transform> consumer) {
    	consumer.accept(transform);
    	return this;
    }
    
    /// @see #transform()
    public CompoundHull transform(Transform other) {
    	transform.set(other);
    	return this;
    }
    
    /// ```
    /// The transform of this hull instance.
    /// ```
    public Transform transform() {
    	return transform;
    }
    
    @Override
    public CompoundHull set(CompoundHull other) {
        return set(other.segment);
    }
    
    @Override
    public CompoundHull set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<CompoundHull> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<CompoundHull> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new CompoundHull(segment),
            count
        );
    }
    
    public static NativeStructArray<CompoundHull> array(Arena arena, CompoundHull... structs) {
        NativeStructArray<CompoundHull> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new CompoundHull(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<CompoundHull> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new CompoundHull(segment)
        );
    }
    
}