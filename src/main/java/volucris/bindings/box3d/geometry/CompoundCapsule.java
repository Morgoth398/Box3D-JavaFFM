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
/// A capsule that lives in a compound.
/// ```
public final class CompoundCapsule
		implements Struct<CompoundCapsule> {

    public static final StructLayout LAYOUT;

    public static final VarHandle MATERIAL_INDEX_HANDLE;

    public static final long CAPSULE_BYTE_OFFSET;
    public static final long MATERIAL_INDEX_BYTE_OFFSET;

    private final MemorySegment segment;

    private final Capsule capsule;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            Capsule.LAYOUT.withName("capsule"),
            JAVA_INT.withName("materialIndex")
        ).withName("b3CompoundCapsule").withByteAlignment(4);
        
        MATERIAL_INDEX_HANDLE = LAYOUT.varHandle(PathElement.groupElement("materialIndex"));
        
        CAPSULE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("capsule"));
        MATERIAL_INDEX_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("materialIndex"));
        //@formatter:on
    }

    public CompoundCapsule() {
        this(Arena.ofAuto());
    }
    
    public CompoundCapsule(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public CompoundCapsule(MemorySegment segment) {
        this.segment = segment;
    
        capsule = new Capsule(segment.asSlice(CAPSULE_BYTE_OFFSET, Capsule.LAYOUT));
    }

    /// @see #materialIndex()
    public CompoundCapsule materialIndex(int materialIndex) {
    	MATERIAL_INDEX_HANDLE.set(segment, 0L, materialIndex);
    	return this;
    }
    
    /// ```
    /// Index to a shared material.
    /// ```
    public int materialIndex() {
    	return (int) MATERIAL_INDEX_HANDLE.get(segment, 0L);
    }
    
    /// @see #capsule()
    public CompoundCapsule capsule(Consumer<Capsule> consumer) {
    	consumer.accept(capsule);
    	return this;
    }
    
    /// @see #capsule()
    public CompoundCapsule capsule(Capsule other) {
    	capsule.set(other);
    	return this;
    }
    
    /// ```
    /// Local capsule.
    /// ```
    public Capsule capsule() {
    	return capsule;
    }
    
    @Override
    public CompoundCapsule set(CompoundCapsule other) {
        return set(other.segment);
    }
    
    @Override
    public CompoundCapsule set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<CompoundCapsule> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<CompoundCapsule> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new CompoundCapsule(segment),
            count
        );
    }
    
    public static NativeStructArray<CompoundCapsule> array(Arena arena, CompoundCapsule... structs) {
        NativeStructArray<CompoundCapsule> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new CompoundCapsule(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<CompoundCapsule> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new CompoundCapsule(segment)
        );
    }
    
}