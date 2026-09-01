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
import volucris.bindings.box3d.math.Vec3;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

/// ```
/// This allows mesh data to be re-used with different scales.
/// ```
public final class Mesh
		implements Struct<Mesh> {

    public static final StructLayout LAYOUT;

    public static final VarHandle DATA_HANDLE;

    public static final long DATA_BYTE_OFFSET;
    public static final long SCALE_BYTE_OFFSET;

    private final MemorySegment segment;

    private final Vec3 scale;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            UNBOUNDED_ADDRESS.withName("data"),
            Vec3.LAYOUT.withName("scale"),
            MemoryLayout.paddingLayout(4)
        ).withName("b3Mesh").withByteAlignment(8);
        
        DATA_HANDLE = LAYOUT.varHandle(PathElement.groupElement("data"));
        
        DATA_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("data"));
        SCALE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("scale"));
        //@formatter:on
    }

    public Mesh() {
        this(Arena.ofAuto());
    }
    
    public Mesh(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public Mesh(MemorySegment segment) {
        this.segment = segment;
    
        scale = new Vec3(segment.asSlice(SCALE_BYTE_OFFSET, Vec3.LAYOUT));
    }

    /// @see #data()
    public Mesh data(MeshData data) {
    	DATA_HANDLE.set(segment, 0L, data.memorySegment());
    	return this;
    }
    
    /// ```
    /// Immutable pointer to the mesh data.
    /// ```
    public @Nullable MeshData data() {
    	MemorySegment segment = (MemorySegment) DATA_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new MeshData(segment);
    }
    
    /// @see #scale()
    public Mesh scale(Consumer<Vec3> consumer) {
    	consumer.accept(scale);
    	return this;
    }
    
    /// @see #scale()
    public Mesh scale(Vec3 other) {
    	scale.set(other);
    	return this;
    }
    
    /// ```
    /// This scale may be non-uniform and have negative components. However,
    /// no component may be very small in magnitude.
    /// ```
    public Vec3 scale() {
    	return scale;
    }
    
    @Override
    public Mesh set(Mesh other) {
        return set(other.segment);
    }
    
    @Override
    public Mesh set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<Mesh> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<Mesh> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new Mesh(segment),
            count
        );
    }
    
    public static NativeStructArray<Mesh> array(Arena arena, Mesh... structs) {
        NativeStructArray<Mesh> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new Mesh(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<Mesh> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new Mesh(segment)
        );
    }
    
}