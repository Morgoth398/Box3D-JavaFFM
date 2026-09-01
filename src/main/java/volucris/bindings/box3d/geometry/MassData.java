/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.box3d.geometry;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;
import java.util.function.Consumer;
import volucris.bindings.box3d.math.Matrix3;
import volucris.bindings.box3d.math.Vec3;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;

/// ```
/// This holds the mass data computed for a shape.
/// ```
public final class MassData
		implements Struct<MassData> {

    public static final StructLayout LAYOUT;

    public static final VarHandle MASS_HANDLE;

    public static final long MASS_BYTE_OFFSET;
    public static final long CENTER_BYTE_OFFSET;
    public static final long INERTIA_BYTE_OFFSET;

    private final MemorySegment segment;

    private final Vec3 center;
    private final Matrix3 inertia;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_FLOAT.withName("mass"),
            Vec3.LAYOUT.withName("center"),
            Matrix3.LAYOUT.withName("inertia")
        ).withName("b3MassData").withByteAlignment(4);
        
        MASS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("mass"));
        
        MASS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("mass"));
        CENTER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("center"));
        INERTIA_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("inertia"));
        //@formatter:on
    }

    public MassData() {
        this(Arena.ofAuto());
    }
    
    public MassData(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public MassData(MemorySegment segment) {
        this.segment = segment;
    
        center = new Vec3(segment.asSlice(CENTER_BYTE_OFFSET, Vec3.LAYOUT));
        inertia = new Matrix3(segment.asSlice(INERTIA_BYTE_OFFSET, Matrix3.LAYOUT));
    }

    /// @see #mass()
    public MassData mass(float mass) {
    	MASS_HANDLE.set(segment, 0L, mass);
    	return this;
    }
    
    /// ```
    /// The shape mass
    /// ```
    public float mass() {
    	return (float) MASS_HANDLE.get(segment, 0L);
    }
    
    /// @see #center()
    public MassData center(Consumer<Vec3> consumer) {
    	consumer.accept(center);
    	return this;
    }
    
    /// @see #center()
    public MassData center(Vec3 other) {
    	center.set(other);
    	return this;
    }
    
    /// ```
    /// The local center of mass position.
    /// ```
    public Vec3 center() {
    	return center;
    }
    
    /// @see #inertia()
    public MassData inertia(Consumer<Matrix3> consumer) {
    	consumer.accept(inertia);
    	return this;
    }
    
    /// @see #inertia()
    public MassData inertia(Matrix3 other) {
    	inertia.set(other);
    	return this;
    }
    
    /// ```
    /// The inertia tensor about the shape center of mass.
    /// ```
    public Matrix3 inertia() {
    	return inertia;
    }
    
    @Override
    public MassData set(MassData other) {
        return set(other.segment);
    }
    
    @Override
    public MassData set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<MassData> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<MassData> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new MassData(segment),
            count
        );
    }
    
    public static NativeStructArray<MassData> array(Arena arena, MassData... structs) {
        NativeStructArray<MassData> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new MassData(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<MassData> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new MassData(segment)
        );
    }
    
}