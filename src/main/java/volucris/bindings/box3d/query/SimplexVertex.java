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
/// Simplex vertex for debugging the GJK algorithm
/// ```
public final class SimplexVertex
		implements Struct<SimplexVertex> {

    public static final StructLayout LAYOUT;

    public static final VarHandle A_HANDLE;
    public static final VarHandle INDEX_A_HANDLE;
    public static final VarHandle INDEX_B_HANDLE;

    public static final long W_A_BYTE_OFFSET;
    public static final long W_B_BYTE_OFFSET;
    public static final long W_BYTE_OFFSET;
    public static final long A_BYTE_OFFSET;
    public static final long INDEX_A_BYTE_OFFSET;
    public static final long INDEX_B_BYTE_OFFSET;

    private final MemorySegment segment;

    private final Vec3 wA;
    private final Vec3 wB;
    private final Vec3 w;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            Vec3.LAYOUT.withName("wA"),
            Vec3.LAYOUT.withName("wB"),
            Vec3.LAYOUT.withName("w"),
            JAVA_FLOAT.withName("a"),
            JAVA_INT.withName("indexA"),
            JAVA_INT.withName("indexB")
        ).withName("b3SimplexVertex").withByteAlignment(4);
        
        A_HANDLE = LAYOUT.varHandle(PathElement.groupElement("a"));
        INDEX_A_HANDLE = LAYOUT.varHandle(PathElement.groupElement("indexA"));
        INDEX_B_HANDLE = LAYOUT.varHandle(PathElement.groupElement("indexB"));
        
        W_A_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("wA"));
        W_B_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("wB"));
        W_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("w"));
        A_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("a"));
        INDEX_A_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("indexA"));
        INDEX_B_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("indexB"));
        //@formatter:on
    }

    public SimplexVertex() {
        this(Arena.ofAuto());
    }
    
    public SimplexVertex(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public SimplexVertex(MemorySegment segment) {
        this.segment = segment;
    
        wA = new Vec3(segment.asSlice(W_A_BYTE_OFFSET, Vec3.LAYOUT));
        wB = new Vec3(segment.asSlice(W_B_BYTE_OFFSET, Vec3.LAYOUT));
        w = new Vec3(segment.asSlice(W_BYTE_OFFSET, Vec3.LAYOUT));
    }

    /// @see #a()
    public SimplexVertex a(float a) {
    	A_HANDLE.set(segment, 0L, a);
    	return this;
    }
    
    /// ```
    /// barycentric coordinates
    /// ```
    public float a() {
    	return (float) A_HANDLE.get(segment, 0L);
    }
    
    /// @see #indexA()
    public SimplexVertex indexA(int indexA) {
    	INDEX_A_HANDLE.set(segment, 0L, indexA);
    	return this;
    }
    
    /// ```
    /// wA index
    /// ```
    public int indexA() {
    	return (int) INDEX_A_HANDLE.get(segment, 0L);
    }
    
    /// @see #indexB()
    public SimplexVertex indexB(int indexB) {
    	INDEX_B_HANDLE.set(segment, 0L, indexB);
    	return this;
    }
    
    /// ```
    /// wB index
    /// ```
    public int indexB() {
    	return (int) INDEX_B_HANDLE.get(segment, 0L);
    }
    
    /// @see #wA()
    public SimplexVertex wA(Consumer<Vec3> consumer) {
    	consumer.accept(wA);
    	return this;
    }
    
    /// @see #wA()
    public SimplexVertex wA(Vec3 other) {
    	wA.set(other);
    	return this;
    }
    
    /// ```
    /// support point in proxyA
    /// ```
    public Vec3 wA() {
    	return wA;
    }
    
    /// @see #wB()
    public SimplexVertex wB(Consumer<Vec3> consumer) {
    	consumer.accept(wB);
    	return this;
    }
    
    /// @see #wB()
    public SimplexVertex wB(Vec3 other) {
    	wB.set(other);
    	return this;
    }
    
    /// ```
    /// support point in proxyB
    /// ```
    public Vec3 wB() {
    	return wB;
    }
    
    /// @see #w()
    public SimplexVertex w(Consumer<Vec3> consumer) {
    	consumer.accept(w);
    	return this;
    }
    
    /// @see #w()
    public SimplexVertex w(Vec3 other) {
    	w.set(other);
    	return this;
    }
    
    /// ```
    /// wB - wA
    /// ```
    public Vec3 w() {
    	return w;
    }
    
    @Override
    public SimplexVertex set(SimplexVertex other) {
        return set(other.segment);
    }
    
    @Override
    public SimplexVertex set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<SimplexVertex> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<SimplexVertex> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new SimplexVertex(segment),
            count
        );
    }
    
    public static NativeStructArray<SimplexVertex> array(Arena arena, SimplexVertex... structs) {
        NativeStructArray<SimplexVertex> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new SimplexVertex(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<SimplexVertex> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new SimplexVertex(segment)
        );
    }
    
}