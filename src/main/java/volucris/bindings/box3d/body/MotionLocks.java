/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.box3d.body;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;

/// ```
/// Motion locks to restrict the body movement
/// @ingroup body
/// ```
public final class MotionLocks
		implements Struct<MotionLocks> {

    public static final StructLayout LAYOUT;

    public static final VarHandle LINEAR_X_HANDLE;
    public static final VarHandle LINEAR_Y_HANDLE;
    public static final VarHandle LINEAR_Z_HANDLE;
    public static final VarHandle ANGULAR_X_HANDLE;
    public static final VarHandle ANGULAR_Y_HANDLE;
    public static final VarHandle ANGULAR_Z_HANDLE;

    public static final long LINEAR_X_BYTE_OFFSET;
    public static final long LINEAR_Y_BYTE_OFFSET;
    public static final long LINEAR_Z_BYTE_OFFSET;
    public static final long ANGULAR_X_BYTE_OFFSET;
    public static final long ANGULAR_Y_BYTE_OFFSET;
    public static final long ANGULAR_Z_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_BOOLEAN.withName("linearX"),
            JAVA_BOOLEAN.withName("linearY"),
            JAVA_BOOLEAN.withName("linearZ"),
            JAVA_BOOLEAN.withName("angularX"),
            JAVA_BOOLEAN.withName("angularY"),
            JAVA_BOOLEAN.withName("angularZ")
        ).withName("b3MotionLocks").withByteAlignment(1);
        
        LINEAR_X_HANDLE = LAYOUT.varHandle(PathElement.groupElement("linearX"));
        LINEAR_Y_HANDLE = LAYOUT.varHandle(PathElement.groupElement("linearY"));
        LINEAR_Z_HANDLE = LAYOUT.varHandle(PathElement.groupElement("linearZ"));
        ANGULAR_X_HANDLE = LAYOUT.varHandle(PathElement.groupElement("angularX"));
        ANGULAR_Y_HANDLE = LAYOUT.varHandle(PathElement.groupElement("angularY"));
        ANGULAR_Z_HANDLE = LAYOUT.varHandle(PathElement.groupElement("angularZ"));
        
        LINEAR_X_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("linearX"));
        LINEAR_Y_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("linearY"));
        LINEAR_Z_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("linearZ"));
        ANGULAR_X_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("angularX"));
        ANGULAR_Y_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("angularY"));
        ANGULAR_Z_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("angularZ"));
        //@formatter:on
    }

    public MotionLocks() {
        this(Arena.ofAuto());
    }
    
    public MotionLocks(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public MotionLocks(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #linearX()
    public MotionLocks linearX(boolean linearX) {
    	LINEAR_X_HANDLE.set(segment, 0L, linearX);
    	return this;
    }
    
    /// ```
    /// Prevent translation along the x-axis
    /// ```
    public boolean linearX() {
    	return (boolean) LINEAR_X_HANDLE.get(segment, 0L);
    }
    
    /// @see #linearY()
    public MotionLocks linearY(boolean linearY) {
    	LINEAR_Y_HANDLE.set(segment, 0L, linearY);
    	return this;
    }
    
    /// ```
    /// Prevent translation along the y-axis
    /// ```
    public boolean linearY() {
    	return (boolean) LINEAR_Y_HANDLE.get(segment, 0L);
    }
    
    /// @see #linearZ()
    public MotionLocks linearZ(boolean linearZ) {
    	LINEAR_Z_HANDLE.set(segment, 0L, linearZ);
    	return this;
    }
    
    /// ```
    /// Prevent translation along the z-axis
    /// ```
    public boolean linearZ() {
    	return (boolean) LINEAR_Z_HANDLE.get(segment, 0L);
    }
    
    /// @see #angularX()
    public MotionLocks angularX(boolean angularX) {
    	ANGULAR_X_HANDLE.set(segment, 0L, angularX);
    	return this;
    }
    
    /// ```
    /// Prevent rotation around the x-axis
    /// ```
    public boolean angularX() {
    	return (boolean) ANGULAR_X_HANDLE.get(segment, 0L);
    }
    
    /// @see #angularY()
    public MotionLocks angularY(boolean angularY) {
    	ANGULAR_Y_HANDLE.set(segment, 0L, angularY);
    	return this;
    }
    
    /// ```
    /// Prevent rotation around the y-axis
    /// ```
    public boolean angularY() {
    	return (boolean) ANGULAR_Y_HANDLE.get(segment, 0L);
    }
    
    /// @see #angularZ()
    public MotionLocks angularZ(boolean angularZ) {
    	ANGULAR_Z_HANDLE.set(segment, 0L, angularZ);
    	return this;
    }
    
    /// ```
    /// Prevent rotation around the z-axis
    /// ```
    public boolean angularZ() {
    	return (boolean) ANGULAR_Z_HANDLE.get(segment, 0L);
    }
    
    @Override
    public MotionLocks set(MotionLocks other) {
        return set(other.segment);
    }
    
    @Override
    public MotionLocks set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<MotionLocks> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<MotionLocks> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new MotionLocks(segment),
            count
        );
    }
    
    public static NativeStructArray<MotionLocks> array(Arena arena, MotionLocks... structs) {
        NativeStructArray<MotionLocks> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new MotionLocks(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<MotionLocks> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new MotionLocks(segment)
        );
    }
    
}