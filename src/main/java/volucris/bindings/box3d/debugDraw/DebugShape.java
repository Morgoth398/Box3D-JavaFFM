/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.box3d.debugDraw;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;
import java.util.function.Consumer;
import volucris.bindings.box3d.shape.ShapeId;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;

/// ```
/// This is sent to the user for debug shape creation. The user should know the type in case they have
/// custom sphere or capsule rendering.
/// ```
public final class DebugShape
		implements Struct<DebugShape> {

    public static final StructLayout LAYOUT;

    public static final VarHandle TYPE_HANDLE;

    public static final long SHAPE_ID_BYTE_OFFSET;
    public static final long TYPE_BYTE_OFFSET;

    private final MemorySegment segment;

    private final ShapeId shapeId;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            ShapeId.LAYOUT.withName("shapeId"),
            JAVA_INT.withName("type"),
            MemoryLayout.paddingLayout(12)
        ).withName("b3DebugShape").withByteAlignment(8);
        
        TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("type"));
        
        SHAPE_ID_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shapeId"));
        TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("type"));
        //@formatter:on
    }

    public DebugShape() {
        this(Arena.ofAuto());
    }
    
    public DebugShape(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public DebugShape(MemorySegment segment) {
        this.segment = segment;
    
        shapeId = new ShapeId(segment.asSlice(SHAPE_ID_BYTE_OFFSET, ShapeId.LAYOUT));
    }

    /// @see #type()
    public DebugShape type(int type) {
    	TYPE_HANDLE.set(segment, 0L, type);
    	return this;
    }
    
    /// ```
    /// Shape type.
    /// ```
    public int type() {
    	return (int) TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #shapeId()
    public DebugShape shapeId(Consumer<ShapeId> consumer) {
    	consumer.accept(shapeId);
    	return this;
    }
    
    /// @see #shapeId()
    public DebugShape shapeId(ShapeId other) {
    	shapeId.set(other);
    	return this;
    }
    
    /// ```
    /// Shape id.
    /// ```
    public ShapeId shapeId() {
    	return shapeId;
    }
    
    @Override
    public DebugShape set(DebugShape other) {
        return set(other.segment);
    }
    
    @Override
    public DebugShape set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<DebugShape> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<DebugShape> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new DebugShape(segment),
            count
        );
    }
    
    public static NativeStructArray<DebugShape> array(Arena arena, DebugShape... structs) {
        NativeStructArray<DebugShape> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new DebugShape(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<DebugShape> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new DebugShape(segment)
        );
    }
    
}