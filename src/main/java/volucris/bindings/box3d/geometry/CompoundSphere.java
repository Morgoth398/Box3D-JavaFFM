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
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;

/// ```
/// A sphere that lives in a compound.
/// ```
public final class CompoundSphere
		implements Struct<CompoundSphere> {

    public static final StructLayout LAYOUT;

    public static final VarHandle MATERIAL_INDEX_HANDLE;

    public static final long SPHERE_BYTE_OFFSET;
    public static final long MATERIAL_INDEX_BYTE_OFFSET;

    private final MemorySegment segment;

    private final Sphere sphere;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            Sphere.LAYOUT.withName("sphere"),
            JAVA_INT.withName("materialIndex")
        ).withName("b3CompoundSphere").withByteAlignment(4);
        
        MATERIAL_INDEX_HANDLE = LAYOUT.varHandle(PathElement.groupElement("materialIndex"));
        
        SPHERE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sphere"));
        MATERIAL_INDEX_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("materialIndex"));
        //@formatter:on
    }

    public CompoundSphere() {
        this(Arena.ofAuto());
    }
    
    public CompoundSphere(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public CompoundSphere(MemorySegment segment) {
        this.segment = segment;
    
        sphere = new Sphere(segment.asSlice(SPHERE_BYTE_OFFSET, Sphere.LAYOUT));
    }

    /// @see #materialIndex()
    public CompoundSphere materialIndex(int materialIndex) {
    	MATERIAL_INDEX_HANDLE.set(segment, 0L, materialIndex);
    	return this;
    }
    
    /// ```
    /// Index to a shared material.
    /// ```
    public int materialIndex() {
    	return (int) MATERIAL_INDEX_HANDLE.get(segment, 0L);
    }
    
    /// @see #sphere()
    public CompoundSphere sphere(Consumer<Sphere> consumer) {
    	consumer.accept(sphere);
    	return this;
    }
    
    /// @see #sphere()
    public CompoundSphere sphere(Sphere other) {
    	sphere.set(other);
    	return this;
    }
    
    /// ```
    /// Local sphere.
    /// ```
    public Sphere sphere() {
    	return sphere;
    }
    
    @Override
    public CompoundSphere set(CompoundSphere other) {
        return set(other.segment);
    }
    
    @Override
    public CompoundSphere set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<CompoundSphere> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<CompoundSphere> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new CompoundSphere(segment),
            count
        );
    }
    
    public static NativeStructArray<CompoundSphere> array(Arena arena, CompoundSphere... structs) {
        NativeStructArray<CompoundSphere> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new CompoundSphere(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<CompoundSphere> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new CompoundSphere(segment)
        );
    }
    
}