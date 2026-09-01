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
/// A 3x3 matrix.
/// ```
public final class Matrix3
		implements Struct<Matrix3> {

    public static final StructLayout LAYOUT;

    public static final long CX_BYTE_OFFSET;
    public static final long CY_BYTE_OFFSET;
    public static final long CZ_BYTE_OFFSET;

    private final MemorySegment segment;

    private final Vec3 cx;
    private final Vec3 cy;
    private final Vec3 cz;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            Vec3.LAYOUT.withName("cx"),
            Vec3.LAYOUT.withName("cy"),
            Vec3.LAYOUT.withName("cz")
        ).withName("b3Matrix3").withByteAlignment(4);
        
        CX_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("cx"));
        CY_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("cy"));
        CZ_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("cz"));
        //@formatter:on
    }

    public Matrix3() {
        this(Arena.ofAuto());
    }
    
    public Matrix3(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public Matrix3(MemorySegment segment) {
        this.segment = segment;
    
        cx = new Vec3(segment.asSlice(CX_BYTE_OFFSET, Vec3.LAYOUT));
        cy = new Vec3(segment.asSlice(CY_BYTE_OFFSET, Vec3.LAYOUT));
        cz = new Vec3(segment.asSlice(CZ_BYTE_OFFSET, Vec3.LAYOUT));
    }

    /// @see #cx()
    public Matrix3 cx(Consumer<Vec3> consumer) {
    	consumer.accept(cx);
    	return this;
    }
    
    /// @see #cx()
    public Matrix3 cx(Vec3 other) {
    	cx.set(other);
    	return this;
    }
    
    public Vec3 cx() {
    	return cx;
    }
    
    /// @see #cy()
    public Matrix3 cy(Consumer<Vec3> consumer) {
    	consumer.accept(cy);
    	return this;
    }
    
    /// @see #cy()
    public Matrix3 cy(Vec3 other) {
    	cy.set(other);
    	return this;
    }
    
    public Vec3 cy() {
    	return cy;
    }
    
    /// @see #cz()
    public Matrix3 cz(Consumer<Vec3> consumer) {
    	consumer.accept(cz);
    	return this;
    }
    
    /// @see #cz()
    public Matrix3 cz(Vec3 other) {
    	cz.set(other);
    	return this;
    }
    
    public Vec3 cz() {
    	return cz;
    }
    
    @Override
    public Matrix3 set(Matrix3 other) {
        return set(other.segment);
    }
    
    @Override
    public Matrix3 set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<Matrix3> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<Matrix3> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new Matrix3(segment),
            count
        );
    }
    
    public static NativeStructArray<Matrix3> array(Arena arena, Matrix3... structs) {
        NativeStructArray<Matrix3> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new Matrix3(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<Matrix3> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new Matrix3(segment)
        );
    }
    
}