/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.box3d.math;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;

/// ```
/// A 2D vector.
/// ```
public final class Vec2
		implements Struct<Vec2> {

    public static final StructLayout LAYOUT;

    public static final VarHandle X_HANDLE;
    public static final VarHandle Y_HANDLE;

    public static final long X_BYTE_OFFSET;
    public static final long Y_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_FLOAT.withName("x"),
            JAVA_FLOAT.withName("y")
        ).withName("b3Vec2").withByteAlignment(4);
        
        X_HANDLE = LAYOUT.varHandle(PathElement.groupElement("x"));
        Y_HANDLE = LAYOUT.varHandle(PathElement.groupElement("y"));
        
        X_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("x"));
        Y_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("y"));
        //@formatter:on
    }

    public Vec2() {
        this(Arena.ofAuto());
    }
    
    public Vec2(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public Vec2(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #x()
    public Vec2 x(float x) {
    	X_HANDLE.set(segment, 0L, x);
    	return this;
    }
    
    public float x() {
    	return (float) X_HANDLE.get(segment, 0L);
    }
    
    /// @see #y()
    public Vec2 y(float y) {
    	Y_HANDLE.set(segment, 0L, y);
    	return this;
    }
    
    public float y() {
    	return (float) Y_HANDLE.get(segment, 0L);
    }
    
    @Override
    public Vec2 set(Vec2 other) {
        return set(other.segment);
    }
    
    @Override
    public Vec2 set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<Vec2> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<Vec2> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new Vec2(segment),
            count
        );
    }
    
    public static NativeStructArray<Vec2> array(Arena arena, Vec2... structs) {
        NativeStructArray<Vec2> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new Vec2(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<Vec2> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new Vec2(segment)
        );
    }
    
}