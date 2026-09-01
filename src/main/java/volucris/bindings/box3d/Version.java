/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.box3d;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;

/// ```
/// Version numbering scheme.
/// See https://semver.org/
/// ```
public final class Version
		implements Struct<Version> {

    public static final StructLayout LAYOUT;

    public static final VarHandle MAJOR_HANDLE;
    public static final VarHandle MINOR_HANDLE;
    public static final VarHandle REVISION_HANDLE;

    public static final long MAJOR_BYTE_OFFSET;
    public static final long MINOR_BYTE_OFFSET;
    public static final long REVISION_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("major"),
            JAVA_INT.withName("minor"),
            JAVA_INT.withName("revision")
        ).withName("b3Version").withByteAlignment(4);
        
        MAJOR_HANDLE = LAYOUT.varHandle(PathElement.groupElement("major"));
        MINOR_HANDLE = LAYOUT.varHandle(PathElement.groupElement("minor"));
        REVISION_HANDLE = LAYOUT.varHandle(PathElement.groupElement("revision"));
        
        MAJOR_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("major"));
        MINOR_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("minor"));
        REVISION_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("revision"));
        //@formatter:on
    }

    public Version() {
        this(Arena.ofAuto());
    }
    
    public Version(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public Version(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #major()
    public Version major(int major) {
    	MAJOR_HANDLE.set(segment, 0L, major);
    	return this;
    }
    
    /// ```
    /// Significant changes
    /// ```
    public int major() {
    	return (int) MAJOR_HANDLE.get(segment, 0L);
    }
    
    /// @see #minor()
    public Version minor(int minor) {
    	MINOR_HANDLE.set(segment, 0L, minor);
    	return this;
    }
    
    /// ```
    /// Incremental changes
    /// ```
    public int minor() {
    	return (int) MINOR_HANDLE.get(segment, 0L);
    }
    
    /// @see #revision()
    public Version revision(int revision) {
    	REVISION_HANDLE.set(segment, 0L, revision);
    	return this;
    }
    
    /// ```
    /// Bug fixes
    /// ```
    public int revision() {
    	return (int) REVISION_HANDLE.get(segment, 0L);
    }
    
    @Override
    public Version set(Version other) {
        return set(other.segment);
    }
    
    @Override
    public Version set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<Version> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<Version> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new Version(segment),
            count
        );
    }
    
    public static NativeStructArray<Version> array(Arena arena, Version... structs) {
        NativeStructArray<Version> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new Version(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<Version> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new Version(segment)
        );
    }
    
}