/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.box3d.query;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;
import java.util.function.Consumer;
import volucris.bindings.box3d.math.Vec3;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;

/// ```
/// Time of impact output
/// ```
public final class TOIOutput
		implements Struct<TOIOutput> {

    public static final StructLayout LAYOUT;

    public static final VarHandle STATE_HANDLE;
    public static final VarHandle FRACTION_HANDLE;
    public static final VarHandle DISTANCE_HANDLE;
    public static final VarHandle DISTANCE_ITERATIONS_HANDLE;
    public static final VarHandle PUSH_BACK_ITERATIONS_HANDLE;
    public static final VarHandle ROOT_ITERATIONS_HANDLE;
    public static final VarHandle USED_FALLBACK_HANDLE;

    public static final long STATE_BYTE_OFFSET;
    public static final long POINT_BYTE_OFFSET;
    public static final long NORMAL_BYTE_OFFSET;
    public static final long FRACTION_BYTE_OFFSET;
    public static final long DISTANCE_BYTE_OFFSET;
    public static final long DISTANCE_ITERATIONS_BYTE_OFFSET;
    public static final long PUSH_BACK_ITERATIONS_BYTE_OFFSET;
    public static final long ROOT_ITERATIONS_BYTE_OFFSET;
    public static final long USED_FALLBACK_BYTE_OFFSET;

    private final MemorySegment segment;

    private final Vec3 point;
    private final Vec3 normal;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("state"),
            Vec3.LAYOUT.withName("point"),
            Vec3.LAYOUT.withName("normal"),
            JAVA_FLOAT.withName("fraction"),
            JAVA_FLOAT.withName("distance"),
            JAVA_INT.withName("distanceIterations"),
            JAVA_INT.withName("pushBackIterations"),
            JAVA_INT.withName("rootIterations"),
            JAVA_BOOLEAN.withName("usedFallback"),
            MemoryLayout.paddingLayout(3)
        ).withName("b3TOIOutput").withByteAlignment(4);
        
        STATE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("state"));
        FRACTION_HANDLE = LAYOUT.varHandle(PathElement.groupElement("fraction"));
        DISTANCE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("distance"));
        DISTANCE_ITERATIONS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("distanceIterations"));
        PUSH_BACK_ITERATIONS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pushBackIterations"));
        ROOT_ITERATIONS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("rootIterations"));
        USED_FALLBACK_HANDLE = LAYOUT.varHandle(PathElement.groupElement("usedFallback"));
        
        STATE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("state"));
        POINT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("point"));
        NORMAL_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("normal"));
        FRACTION_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("fraction"));
        DISTANCE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("distance"));
        DISTANCE_ITERATIONS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("distanceIterations"));
        PUSH_BACK_ITERATIONS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pushBackIterations"));
        ROOT_ITERATIONS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("rootIterations"));
        USED_FALLBACK_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("usedFallback"));
        //@formatter:on
    }

    public TOIOutput() {
        this(Arena.ofAuto());
    }
    
    public TOIOutput(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public TOIOutput(MemorySegment segment) {
        this.segment = segment;
    
        point = new Vec3(segment.asSlice(POINT_BYTE_OFFSET, Vec3.LAYOUT));
        normal = new Vec3(segment.asSlice(NORMAL_BYTE_OFFSET, Vec3.LAYOUT));
    }

    /// @see #state()
    public TOIOutput state(int state) {
    	STATE_HANDLE.set(segment, 0L, state);
    	return this;
    }
    
    /// ```
    /// The type of result
    /// ```
    public int state() {
    	return (int) STATE_HANDLE.get(segment, 0L);
    }
    
    /// @see #fraction()
    public TOIOutput fraction(float fraction) {
    	FRACTION_HANDLE.set(segment, 0L, fraction);
    	return this;
    }
    
    /// ```
    /// The sweep time of the collision
    /// ```
    public float fraction() {
    	return (float) FRACTION_HANDLE.get(segment, 0L);
    }
    
    /// @see #distance()
    public TOIOutput distance(float distance) {
    	DISTANCE_HANDLE.set(segment, 0L, distance);
    	return this;
    }
    
    /// ```
    /// The final distance
    /// ```
    public float distance() {
    	return (float) DISTANCE_HANDLE.get(segment, 0L);
    }
    
    /// @see #distanceIterations()
    public TOIOutput distanceIterations(int distanceIterations) {
    	DISTANCE_ITERATIONS_HANDLE.set(segment, 0L, distanceIterations);
    	return this;
    }
    
    /// ```
    /// Number of outer iterations
    /// ```
    public int distanceIterations() {
    	return (int) DISTANCE_ITERATIONS_HANDLE.get(segment, 0L);
    }
    
    /// @see #pushBackIterations()
    public TOIOutput pushBackIterations(int pushBackIterations) {
    	PUSH_BACK_ITERATIONS_HANDLE.set(segment, 0L, pushBackIterations);
    	return this;
    }
    
    /// ```
    /// Total number of push back iterations
    /// ```
    public int pushBackIterations() {
    	return (int) PUSH_BACK_ITERATIONS_HANDLE.get(segment, 0L);
    }
    
    /// @see #rootIterations()
    public TOIOutput rootIterations(int rootIterations) {
    	ROOT_ITERATIONS_HANDLE.set(segment, 0L, rootIterations);
    	return this;
    }
    
    /// ```
    /// Total number of root iterations
    /// ```
    public int rootIterations() {
    	return (int) ROOT_ITERATIONS_HANDLE.get(segment, 0L);
    }
    
    /// @see #usedFallback()
    public TOIOutput usedFallback(boolean usedFallback) {
    	USED_FALLBACK_HANDLE.set(segment, 0L, usedFallback);
    	return this;
    }
    
    /// ```
    /// Indicates that the time of impact detected initial
    /// overlap and used a fallback sphere as a last ditch effort
    /// to prevent tunneling.
    /// ```
    public boolean usedFallback() {
    	return (boolean) USED_FALLBACK_HANDLE.get(segment, 0L);
    }
    
    /// @see #point()
    public TOIOutput point(Consumer<Vec3> consumer) {
    	consumer.accept(point);
    	return this;
    }
    
    /// @see #point()
    public TOIOutput point(Vec3 other) {
    	point.set(other);
    	return this;
    }
    
    /// ```
    /// The hit point
    /// ```
    public Vec3 point() {
    	return point;
    }
    
    /// @see #normal()
    public TOIOutput normal(Consumer<Vec3> consumer) {
    	consumer.accept(normal);
    	return this;
    }
    
    /// @see #normal()
    public TOIOutput normal(Vec3 other) {
    	normal.set(other);
    	return this;
    }
    
    /// ```
    /// The hit normal
    /// ```
    public Vec3 normal() {
    	return normal;
    }
    
    @Override
    public TOIOutput set(TOIOutput other) {
        return set(other.segment);
    }
    
    @Override
    public TOIOutput set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<TOIOutput> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<TOIOutput> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new TOIOutput(segment),
            count
        );
    }
    
    public static NativeStructArray<TOIOutput> array(Arena arena, TOIOutput... structs) {
        NativeStructArray<TOIOutput> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new TOIOutput(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<TOIOutput> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new TOIOutput(segment)
        );
    }
    
}