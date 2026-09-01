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
/// The closest points between to segments or infinite lines.
/// ```
public final class SegmentDistanceResult
		implements Struct<SegmentDistanceResult> {

    public static final StructLayout LAYOUT;

    public static final VarHandle FRACTION1_HANDLE;
    public static final VarHandle FRACTION2_HANDLE;

    public static final long POINT1_BYTE_OFFSET;
    public static final long FRACTION1_BYTE_OFFSET;
    public static final long POINT2_BYTE_OFFSET;
    public static final long FRACTION2_BYTE_OFFSET;

    private final MemorySegment segment;

    private final Vec3 point1;
    private final Vec3 point2;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            Vec3.LAYOUT.withName("point1"),
            JAVA_FLOAT.withName("fraction1"),
            Vec3.LAYOUT.withName("point2"),
            JAVA_FLOAT.withName("fraction2")
        ).withName("b3SegmentDistanceResult").withByteAlignment(4);
        
        FRACTION1_HANDLE = LAYOUT.varHandle(PathElement.groupElement("fraction1"));
        FRACTION2_HANDLE = LAYOUT.varHandle(PathElement.groupElement("fraction2"));
        
        POINT1_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("point1"));
        FRACTION1_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("fraction1"));
        POINT2_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("point2"));
        FRACTION2_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("fraction2"));
        //@formatter:on
    }

    public SegmentDistanceResult() {
        this(Arena.ofAuto());
    }
    
    public SegmentDistanceResult(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public SegmentDistanceResult(MemorySegment segment) {
        this.segment = segment;
    
        point1 = new Vec3(segment.asSlice(POINT1_BYTE_OFFSET, Vec3.LAYOUT));
        point2 = new Vec3(segment.asSlice(POINT2_BYTE_OFFSET, Vec3.LAYOUT));
    }

    /// @see #fraction1()
    public SegmentDistanceResult fraction1(float fraction1) {
    	FRACTION1_HANDLE.set(segment, 0L, fraction1);
    	return this;
    }
    
    public float fraction1() {
    	return (float) FRACTION1_HANDLE.get(segment, 0L);
    }
    
    /// @see #fraction2()
    public SegmentDistanceResult fraction2(float fraction2) {
    	FRACTION2_HANDLE.set(segment, 0L, fraction2);
    	return this;
    }
    
    public float fraction2() {
    	return (float) FRACTION2_HANDLE.get(segment, 0L);
    }
    
    /// @see #point1()
    public SegmentDistanceResult point1(Consumer<Vec3> consumer) {
    	consumer.accept(point1);
    	return this;
    }
    
    /// @see #point1()
    public SegmentDistanceResult point1(Vec3 other) {
    	point1.set(other);
    	return this;
    }
    
    public Vec3 point1() {
    	return point1;
    }
    
    /// @see #point2()
    public SegmentDistanceResult point2(Consumer<Vec3> consumer) {
    	consumer.accept(point2);
    	return this;
    }
    
    /// @see #point2()
    public SegmentDistanceResult point2(Vec3 other) {
    	point2.set(other);
    	return this;
    }
    
    public Vec3 point2() {
    	return point2;
    }
    
    @Override
    public SegmentDistanceResult set(SegmentDistanceResult other) {
        return set(other.segment);
    }
    
    @Override
    public SegmentDistanceResult set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<SegmentDistanceResult> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<SegmentDistanceResult> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new SegmentDistanceResult(segment),
            count
        );
    }
    
    public static NativeStructArray<SegmentDistanceResult> array(Arena arena, SegmentDistanceResult... structs) {
        NativeStructArray<SegmentDistanceResult> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new SegmentDistanceResult(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<SegmentDistanceResult> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new SegmentDistanceResult(segment)
        );
    }
    
}