/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.box3d.math;

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
/// A plane.
/// separation = dot(normal, point) - offset
/// ```
public final class Plane
		implements Struct<Plane> {

    public static final StructLayout LAYOUT;

    public static final VarHandle OFFSET_HANDLE;

    public static final long NORMAL_BYTE_OFFSET;
    public static final long OFFSET_BYTE_OFFSET;

    private final MemorySegment segment;

    private final Vec3 normal;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            Vec3.LAYOUT.withName("normal"),
            JAVA_FLOAT.withName("offset")
        ).withName("b3Plane").withByteAlignment(4);
        
        OFFSET_HANDLE = LAYOUT.varHandle(PathElement.groupElement("offset"));
        
        NORMAL_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("normal"));
        OFFSET_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("offset"));
        //@formatter:on
    }

    public Plane() {
        this(Arena.ofAuto());
    }
    
    public Plane(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public Plane(MemorySegment segment) {
        this.segment = segment;
    
        normal = new Vec3(segment.asSlice(NORMAL_BYTE_OFFSET, Vec3.LAYOUT));
    }

    /// @see #offset()
    public Plane offset(float offset) {
    	OFFSET_HANDLE.set(segment, 0L, offset);
    	return this;
    }
    
    public float offset() {
    	return (float) OFFSET_HANDLE.get(segment, 0L);
    }
    
    /// @see #normal()
    public Plane normal(Consumer<Vec3> consumer) {
    	consumer.accept(normal);
    	return this;
    }
    
    /// @see #normal()
    public Plane normal(Vec3 other) {
    	normal.set(other);
    	return this;
    }
    
    public Vec3 normal() {
    	return normal;
    }
    
    @Override
    public Plane set(Plane other) {
        return set(other.segment);
    }
    
    @Override
    public Plane set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<Plane> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<Plane> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new Plane(segment),
            count
        );
    }
    
    public static NativeStructArray<Plane> array(Arena arena, Plane... structs) {
        NativeStructArray<Plane> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new Plane(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<Plane> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new Plane(segment)
        );
    }
    
}