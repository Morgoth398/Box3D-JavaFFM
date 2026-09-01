/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.box3d.query;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.util.function.Consumer;
import volucris.bindings.box3d.math.Quat;
import volucris.bindings.box3d.math.Vec3;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;

/// ```
/// This describes the motion of a body/shape for TOI computation. Shapes are defined with respect to the body origin,
/// which may not coincide with the center of mass. However, to support dynamics we must interpolate the center of mass
/// position.
/// ```
public final class Sweep
		implements Struct<Sweep> {

    public static final StructLayout LAYOUT;

    public static final long LOCAL_CENTER_BYTE_OFFSET;
    public static final long C1_BYTE_OFFSET;
    public static final long C2_BYTE_OFFSET;
    public static final long Q1_BYTE_OFFSET;
    public static final long Q2_BYTE_OFFSET;

    private final MemorySegment segment;

    private final Vec3 localCenter;
    private final Vec3 c1;
    private final Vec3 c2;
    private final Quat q1;
    private final Quat q2;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            Vec3.LAYOUT.withName("localCenter"),
            Vec3.LAYOUT.withName("c1"),
            Vec3.LAYOUT.withName("c2"),
            Quat.LAYOUT.withName("q1"),
            Quat.LAYOUT.withName("q2")
        ).withName("b3Sweep").withByteAlignment(4);
        
        LOCAL_CENTER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("localCenter"));
        C1_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("c1"));
        C2_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("c2"));
        Q1_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("q1"));
        Q2_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("q2"));
        //@formatter:on
    }

    public Sweep() {
        this(Arena.ofAuto());
    }
    
    public Sweep(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public Sweep(MemorySegment segment) {
        this.segment = segment;
    
        localCenter = new Vec3(segment.asSlice(LOCAL_CENTER_BYTE_OFFSET, Vec3.LAYOUT));
        c1 = new Vec3(segment.asSlice(C1_BYTE_OFFSET, Vec3.LAYOUT));
        c2 = new Vec3(segment.asSlice(C2_BYTE_OFFSET, Vec3.LAYOUT));
        q1 = new Quat(segment.asSlice(Q1_BYTE_OFFSET, Quat.LAYOUT));
        q2 = new Quat(segment.asSlice(Q2_BYTE_OFFSET, Quat.LAYOUT));
    }

    /// @see #localCenter()
    public Sweep localCenter(Consumer<Vec3> consumer) {
    	consumer.accept(localCenter);
    	return this;
    }
    
    /// @see #localCenter()
    public Sweep localCenter(Vec3 other) {
    	localCenter.set(other);
    	return this;
    }
    
    /// ```
    /// Local center of mass position
    /// ```
    public Vec3 localCenter() {
    	return localCenter;
    }
    
    /// @see #c1()
    public Sweep c1(Consumer<Vec3> consumer) {
    	consumer.accept(c1);
    	return this;
    }
    
    /// @see #c1()
    public Sweep c1(Vec3 other) {
    	c1.set(other);
    	return this;
    }
    
    /// ```
    /// Starting center of mass world position
    /// ```
    public Vec3 c1() {
    	return c1;
    }
    
    /// @see #c2()
    public Sweep c2(Consumer<Vec3> consumer) {
    	consumer.accept(c2);
    	return this;
    }
    
    /// @see #c2()
    public Sweep c2(Vec3 other) {
    	c2.set(other);
    	return this;
    }
    
    /// ```
    /// Ending center of mass world position
    /// ```
    public Vec3 c2() {
    	return c2;
    }
    
    /// @see #q1()
    public Sweep q1(Consumer<Quat> consumer) {
    	consumer.accept(q1);
    	return this;
    }
    
    /// @see #q1()
    public Sweep q1(Quat other) {
    	q1.set(other);
    	return this;
    }
    
    /// ```
    /// Starting world rotation
    /// ```
    public Quat q1() {
    	return q1;
    }
    
    /// @see #q2()
    public Sweep q2(Consumer<Quat> consumer) {
    	consumer.accept(q2);
    	return this;
    }
    
    /// @see #q2()
    public Sweep q2(Quat other) {
    	q2.set(other);
    	return this;
    }
    
    /// ```
    /// Ending world rotation
    /// ```
    public Quat q2() {
    	return q2;
    }
    
    @Override
    public Sweep set(Sweep other) {
        return set(other.segment);
    }
    
    @Override
    public Sweep set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<Sweep> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<Sweep> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new Sweep(segment),
            count
        );
    }
    
    public static NativeStructArray<Sweep> array(Arena arena, Sweep... structs) {
        NativeStructArray<Sweep> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new Sweep(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<Sweep> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new Sweep(segment)
        );
    }
    
}