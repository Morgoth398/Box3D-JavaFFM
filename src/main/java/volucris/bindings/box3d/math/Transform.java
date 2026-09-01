/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.box3d.math;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.util.function.Consumer;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;

/// ```
/// A rigid transform.
/// ```
public final class Transform
		implements Struct<Transform> {

    public static final StructLayout LAYOUT;

    public static final long P_BYTE_OFFSET;
    public static final long Q_BYTE_OFFSET;

    private final MemorySegment segment;

    private final Vec3 p;
    private final Quat q;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            Vec3.LAYOUT.withName("p"),
            Quat.LAYOUT.withName("q")
        ).withName("b3Transform").withByteAlignment(4);
        
        P_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("p"));
        Q_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("q"));
        //@formatter:on
    }

    public Transform() {
        this(Arena.ofAuto());
    }
    
    public Transform(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public Transform(MemorySegment segment) {
        this.segment = segment;
    
        p = new Vec3(segment.asSlice(P_BYTE_OFFSET, Vec3.LAYOUT));
        q = new Quat(segment.asSlice(Q_BYTE_OFFSET, Quat.LAYOUT));
    }

    /// @see #p()
    public Transform p(Consumer<Vec3> consumer) {
    	consumer.accept(p);
    	return this;
    }
    
    /// @see #p()
    public Transform p(Vec3 other) {
    	p.set(other);
    	return this;
    }
    
    public Vec3 p() {
    	return p;
    }
    
    /// @see #q()
    public Transform q(Consumer<Quat> consumer) {
    	consumer.accept(q);
    	return this;
    }
    
    /// @see #q()
    public Transform q(Quat other) {
    	q.set(other);
    	return this;
    }
    
    public Quat q() {
    	return q;
    }
    
    @Override
    public Transform set(Transform other) {
        return set(other.segment);
    }
    
    @Override
    public Transform set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<Transform> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<Transform> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new Transform(segment),
            count
        );
    }
    
    public static NativeStructArray<Transform> array(Arena arena, Transform... structs) {
        NativeStructArray<Transform> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new Transform(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<Transform> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new Transform(segment)
        );
    }
    
}