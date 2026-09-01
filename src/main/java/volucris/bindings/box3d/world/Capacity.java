/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.box3d.world;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;

/// ```
/// Optional world capacities that can be use to avoid run-time allocations
/// @ingroup world
/// ```
public final class Capacity
		implements Struct<Capacity> {

    public static final StructLayout LAYOUT;

    public static final VarHandle STATIC_SHAPE_COUNT_HANDLE;
    public static final VarHandle DYNAMIC_SHAPE_COUNT_HANDLE;
    public static final VarHandle STATIC_BODY_COUNT_HANDLE;
    public static final VarHandle DYNAMIC_BODY_COUNT_HANDLE;
    public static final VarHandle CONTACT_COUNT_HANDLE;

    public static final long STATIC_SHAPE_COUNT_BYTE_OFFSET;
    public static final long DYNAMIC_SHAPE_COUNT_BYTE_OFFSET;
    public static final long STATIC_BODY_COUNT_BYTE_OFFSET;
    public static final long DYNAMIC_BODY_COUNT_BYTE_OFFSET;
    public static final long CONTACT_COUNT_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("staticShapeCount"),
            JAVA_INT.withName("dynamicShapeCount"),
            JAVA_INT.withName("staticBodyCount"),
            JAVA_INT.withName("dynamicBodyCount"),
            JAVA_INT.withName("contactCount")
        ).withName("b3Capacity").withByteAlignment(4);
        
        STATIC_SHAPE_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("staticShapeCount"));
        DYNAMIC_SHAPE_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("dynamicShapeCount"));
        STATIC_BODY_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("staticBodyCount"));
        DYNAMIC_BODY_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("dynamicBodyCount"));
        CONTACT_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("contactCount"));
        
        STATIC_SHAPE_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("staticShapeCount"));
        DYNAMIC_SHAPE_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("dynamicShapeCount"));
        STATIC_BODY_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("staticBodyCount"));
        DYNAMIC_BODY_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("dynamicBodyCount"));
        CONTACT_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("contactCount"));
        //@formatter:on
    }

    public Capacity() {
        this(Arena.ofAuto());
    }
    
    public Capacity(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public Capacity(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #staticShapeCount()
    public Capacity staticShapeCount(int staticShapeCount) {
    	STATIC_SHAPE_COUNT_HANDLE.set(segment, 0L, staticShapeCount);
    	return this;
    }
    
    /// ```
    /// Number of expected static shapes.
    /// ```
    public int staticShapeCount() {
    	return (int) STATIC_SHAPE_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #dynamicShapeCount()
    public Capacity dynamicShapeCount(int dynamicShapeCount) {
    	DYNAMIC_SHAPE_COUNT_HANDLE.set(segment, 0L, dynamicShapeCount);
    	return this;
    }
    
    /// ```
    /// Number of expected dynamic and kinematic shapes.
    /// ```
    public int dynamicShapeCount() {
    	return (int) DYNAMIC_SHAPE_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #staticBodyCount()
    public Capacity staticBodyCount(int staticBodyCount) {
    	STATIC_BODY_COUNT_HANDLE.set(segment, 0L, staticBodyCount);
    	return this;
    }
    
    /// ```
    /// Number of expected static bodies.
    /// ```
    public int staticBodyCount() {
    	return (int) STATIC_BODY_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #dynamicBodyCount()
    public Capacity dynamicBodyCount(int dynamicBodyCount) {
    	DYNAMIC_BODY_COUNT_HANDLE.set(segment, 0L, dynamicBodyCount);
    	return this;
    }
    
    /// ```
    /// Number of expected dynamic and kinematic bodies.
    /// ```
    public int dynamicBodyCount() {
    	return (int) DYNAMIC_BODY_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #contactCount()
    public Capacity contactCount(int contactCount) {
    	CONTACT_COUNT_HANDLE.set(segment, 0L, contactCount);
    	return this;
    }
    
    /// ```
    /// Number of expected contacts.
    /// ```
    public int contactCount() {
    	return (int) CONTACT_COUNT_HANDLE.get(segment, 0L);
    }
    
    @Override
    public Capacity set(Capacity other) {
        return set(other.segment);
    }
    
    @Override
    public Capacity set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<Capacity> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<Capacity> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new Capacity(segment),
            count
        );
    }
    
    public static NativeStructArray<Capacity> array(Arena arena, Capacity... structs) {
        NativeStructArray<Capacity> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new Capacity(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<Capacity> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new Capacity(segment)
        );
    }
    
}