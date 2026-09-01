/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.box3d.geometry;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;
import org.jspecify.annotations.Nullable;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

/// ```
/// Definition for creating a compound shape. All this data is fully cloned
/// into the run-time compound shape.
/// ```
public final class CompoundDef
		implements Struct<CompoundDef> {

    public static final StructLayout LAYOUT;

    public static final VarHandle CAPSULES_HANDLE;
    public static final VarHandle CAPSULE_COUNT_HANDLE;
    public static final VarHandle HULLS_HANDLE;
    public static final VarHandle HULL_COUNT_HANDLE;
    public static final VarHandle MESHES_HANDLE;
    public static final VarHandle MESH_COUNT_HANDLE;
    public static final VarHandle SPHERES_HANDLE;
    public static final VarHandle SPHERE_COUNT_HANDLE;

    public static final long CAPSULES_BYTE_OFFSET;
    public static final long CAPSULE_COUNT_BYTE_OFFSET;
    public static final long HULLS_BYTE_OFFSET;
    public static final long HULL_COUNT_BYTE_OFFSET;
    public static final long MESHES_BYTE_OFFSET;
    public static final long MESH_COUNT_BYTE_OFFSET;
    public static final long SPHERES_BYTE_OFFSET;
    public static final long SPHERE_COUNT_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            UNBOUNDED_ADDRESS.withName("capsules"),
            JAVA_INT.withName("capsuleCount"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("hulls"),
            JAVA_INT.withName("hullCount"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("meshes"),
            JAVA_INT.withName("meshCount"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("spheres"),
            JAVA_INT.withName("sphereCount"),
            MemoryLayout.paddingLayout(4)
        ).withName("b3CompoundDef").withByteAlignment(8);
        
        CAPSULES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("capsules"));
        CAPSULE_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("capsuleCount"));
        HULLS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("hulls"));
        HULL_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("hullCount"));
        MESHES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("meshes"));
        MESH_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("meshCount"));
        SPHERES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("spheres"));
        SPHERE_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sphereCount"));
        
        CAPSULES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("capsules"));
        CAPSULE_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("capsuleCount"));
        HULLS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("hulls"));
        HULL_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("hullCount"));
        MESHES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("meshes"));
        MESH_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("meshCount"));
        SPHERES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("spheres"));
        SPHERE_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sphereCount"));
        //@formatter:on
    }

    public CompoundDef() {
        this(Arena.ofAuto());
    }
    
    public CompoundDef(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public CompoundDef(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #capsules()
    public CompoundDef capsules(CompoundCapsuleDef capsules) {
    	CAPSULES_HANDLE.set(segment, 0L, capsules.memorySegment());
    	return this;
    }
    
    /// ```
    /// Capsule instances.
    /// ```
    public @Nullable CompoundCapsuleDef capsules() {
    	MemorySegment segment = (MemorySegment) CAPSULES_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new CompoundCapsuleDef(segment);
    }
    
    /// @see #capsuleCount()
    public CompoundDef capsuleCount(int capsuleCount) {
    	CAPSULE_COUNT_HANDLE.set(segment, 0L, capsuleCount);
    	return this;
    }
    
    /// ```
    /// Number of capsules.
    /// ```
    public int capsuleCount() {
    	return (int) CAPSULE_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #hulls()
    public CompoundDef hulls(CompoundHullDef hulls) {
    	HULLS_HANDLE.set(segment, 0L, hulls.memorySegment());
    	return this;
    }
    
    /// ```
    /// Hulls instances.
    /// ```
    public @Nullable CompoundHullDef hulls() {
    	MemorySegment segment = (MemorySegment) HULLS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new CompoundHullDef(segment);
    }
    
    /// @see #hullCount()
    public CompoundDef hullCount(int hullCount) {
    	HULL_COUNT_HANDLE.set(segment, 0L, hullCount);
    	return this;
    }
    
    /// ```
    /// Number of hull instances.
    /// ```
    public int hullCount() {
    	return (int) HULL_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #meshes()
    public CompoundDef meshes(CompoundMeshDef meshes) {
    	MESHES_HANDLE.set(segment, 0L, meshes.memorySegment());
    	return this;
    }
    
    /// ```
    /// Mesh instances.
    /// ```
    public @Nullable CompoundMeshDef meshes() {
    	MemorySegment segment = (MemorySegment) MESHES_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new CompoundMeshDef(segment);
    }
    
    /// @see #meshCount()
    public CompoundDef meshCount(int meshCount) {
    	MESH_COUNT_HANDLE.set(segment, 0L, meshCount);
    	return this;
    }
    
    /// ```
    /// Number of mesh instances.
    /// ```
    public int meshCount() {
    	return (int) MESH_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #spheres()
    public CompoundDef spheres(CompoundSphereDef spheres) {
    	SPHERES_HANDLE.set(segment, 0L, spheres.memorySegment());
    	return this;
    }
    
    /// ```
    /// Sphere instances.
    /// ```
    public @Nullable CompoundSphereDef spheres() {
    	MemorySegment segment = (MemorySegment) SPHERES_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new CompoundSphereDef(segment);
    }
    
    /// @see #sphereCount()
    public CompoundDef sphereCount(int sphereCount) {
    	SPHERE_COUNT_HANDLE.set(segment, 0L, sphereCount);
    	return this;
    }
    
    /// ```
    /// Number of spheres.
    /// ```
    public int sphereCount() {
    	return (int) SPHERE_COUNT_HANDLE.get(segment, 0L);
    }
    
    @Override
    public CompoundDef set(CompoundDef other) {
        return set(other.segment);
    }
    
    @Override
    public CompoundDef set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<CompoundDef> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<CompoundDef> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new CompoundDef(segment),
            count
        );
    }
    
    public static NativeStructArray<CompoundDef> array(Arena arena, CompoundDef... structs) {
        NativeStructArray<CompoundDef> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new CompoundDef(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<CompoundDef> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new CompoundDef(segment)
        );
    }
    
}