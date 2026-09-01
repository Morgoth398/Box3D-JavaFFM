/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.box3d.geometry;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.invoke.MethodHandle;
import org.jspecify.annotations.Nullable;
import volucris.bindings.box3d.math.AABB;
import volucris.bindings.box3d.shape.SurfaceMaterial;
import volucris.bindings.core.NativeByteArray;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class Compound {

    private static final LazyConstant<MethodHandle> B3_QUERY_COMPOUND;
    private static final LazyConstant<MethodHandle> B3_GET_COMPOUND_CAPSULE;
    private static final LazyConstant<MethodHandle> B3_GET_COMPOUND_HULL;
    private static final LazyConstant<MethodHandle> B3_GET_COMPOUND_MESH;
    private static final LazyConstant<MethodHandle> B3_GET_COMPOUND_SPHERE;
    private static final LazyConstant<MethodHandle> B3_GET_COMPOUND_MATERIALS;
    private static final LazyConstant<MethodHandle> B3_CREATE_COMPOUND;
    private static final LazyConstant<MethodHandle> B3_DESTROY_COMPOUND;
    private static final LazyConstant<MethodHandle> B3_CONVERT_COMPOUND_TO_BYTES;
    private static final LazyConstant<MethodHandle> B3_CONVERT_BYTES_TO_COMPOUND;

    static {
        //@formatter:off
        B3_QUERY_COMPOUND = downcallHandleVoid("b3QueryCompound", UNBOUNDED_ADDRESS, AABB.LAYOUT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        B3_GET_COMPOUND_CAPSULE = downcallHandle("b3GetCompoundCapsule", CompoundCapsule.LAYOUT, UNBOUNDED_ADDRESS, JAVA_INT);
        B3_GET_COMPOUND_HULL = downcallHandle("b3GetCompoundHull", CompoundHull.LAYOUT, UNBOUNDED_ADDRESS, JAVA_INT);
        B3_GET_COMPOUND_MESH = downcallHandle("b3GetCompoundMesh", CompoundMesh.LAYOUT, UNBOUNDED_ADDRESS, JAVA_INT);
        B3_GET_COMPOUND_SPHERE = downcallHandle("b3GetCompoundSphere", CompoundSphere.LAYOUT, UNBOUNDED_ADDRESS, JAVA_INT);
        B3_GET_COMPOUND_MATERIALS = downcallHandle("b3GetCompoundMaterials", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        B3_CREATE_COMPOUND = downcallHandle("b3CreateCompound", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        B3_DESTROY_COMPOUND = downcallHandleVoid("b3DestroyCompound", UNBOUNDED_ADDRESS);
        B3_CONVERT_COMPOUND_TO_BYTES = downcallHandle("b3ConvertCompoundToBytes", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        B3_CONVERT_BYTES_TO_COMPOUND = downcallHandle("b3ConvertBytesToCompound", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT);
        //@formatter:on
    }

    private Compound() {
    }

    /// ```
    /// Query a compound shape for children that overlap an AABB.
    /// ```
    public static void queryCompound(
    	MemorySegment compound,
    	MemorySegment aabb,
    	MemorySegment fcn,
    	MemorySegment context
    ) {
    	MethodHandle method = B3_QUERY_COMPOUND.get();
    	try {
    		 method.invokeExact(
    			compound,
    			aabb,
    			fcn,
    			context
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#queryCompound].
    public static void queryCompound(
    	CompoundData compound,
    	AABB aabb,
    	CompoundQueryFcn fcn,
    	MemorySegment context
    ) {
    	queryCompound(
    		compound.memorySegment(),
    		aabb.memorySegment(),
    		fcn.memorySegment(),
    		context
    	);
    }
    
    /// ```
    /// Access a child capsule by index.
    /// ```
    public static MemorySegment getCompoundCapsule(
    	SegmentAllocator allocator,
    	MemorySegment compound,
    	int index
    ) {
    	MethodHandle method = B3_GET_COMPOUND_CAPSULE.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			compound,
    			index
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getCompoundCapsule].
    public static @Nullable CompoundCapsule getCompoundCapsule(
    	SegmentAllocator allocator,
    	CompoundData compound,
    	int index
    ) {
    	MemorySegment segment = getCompoundCapsule(
    		allocator,
    		compound.memorySegment(),
    		index
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new CompoundCapsule(segment);
    }
    
    /// ```
    /// Access a child hull by index.
    /// ```
    public static MemorySegment getCompoundHull(
    	SegmentAllocator allocator,
    	MemorySegment compound,
    	int index
    ) {
    	MethodHandle method = B3_GET_COMPOUND_HULL.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			compound,
    			index
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getCompoundHull].
    public static @Nullable CompoundHull getCompoundHull(
    	SegmentAllocator allocator,
    	CompoundData compound,
    	int index
    ) {
    	MemorySegment segment = getCompoundHull(
    		allocator,
    		compound.memorySegment(),
    		index
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new CompoundHull(segment);
    }
    
    /// ```
    /// Access a child mesh by index.
    /// ```
    public static MemorySegment getCompoundMesh(
    	SegmentAllocator allocator,
    	MemorySegment compound,
    	int index
    ) {
    	MethodHandle method = B3_GET_COMPOUND_MESH.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			compound,
    			index
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getCompoundMesh].
    public static @Nullable CompoundMesh getCompoundMesh(
    	SegmentAllocator allocator,
    	CompoundData compound,
    	int index
    ) {
    	MemorySegment segment = getCompoundMesh(
    		allocator,
    		compound.memorySegment(),
    		index
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new CompoundMesh(segment);
    }
    
    /// ```
    /// Access a child sphere by index.
    /// ```
    public static MemorySegment getCompoundSphere(
    	SegmentAllocator allocator,
    	MemorySegment compound,
    	int index
    ) {
    	MethodHandle method = B3_GET_COMPOUND_SPHERE.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			compound,
    			index
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getCompoundSphere].
    public static @Nullable CompoundSphere getCompoundSphere(
    	SegmentAllocator allocator,
    	CompoundData compound,
    	int index
    ) {
    	MemorySegment segment = getCompoundSphere(
    		allocator,
    		compound.memorySegment(),
    		index
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new CompoundSphere(segment);
    }
    
    /// ```
    /// Access the compound material array.
    /// ```
    public static MemorySegment getCompoundMaterials(
    	MemorySegment compound
    ) {
    	MethodHandle method = B3_GET_COMPOUND_MATERIALS.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			compound
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getCompoundMaterials].
    public static @Nullable SurfaceMaterial getCompoundMaterials(
    	CompoundData compound
    ) {
    	MemorySegment segment = getCompoundMaterials(
    		compound.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new SurfaceMaterial(segment);
    }
    
    /// ```
    /// Create a compound shape. All input data in the definition is cloned into the resulting compound.
    /// ```
    public static MemorySegment createCompound(
    	MemorySegment def
    ) {
    	MethodHandle method = B3_CREATE_COMPOUND.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			def
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#createCompound].
    public static @Nullable CompoundData createCompound(
    	CompoundDef def
    ) {
    	MemorySegment segment = createCompound(
    		def.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new CompoundData(segment);
    }
    
    /// ```
    /// Destroy a compound shape.
    /// ```
    public static void destroyCompound(
    	MemorySegment compound
    ) {
    	MethodHandle method = B3_DESTROY_COMPOUND.get();
    	try {
    		 method.invokeExact(
    			compound
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#destroyCompound].
    public static void destroyCompound(
    	CompoundData compound
    ) {
    	destroyCompound(
    		compound.memorySegment()
    	);
    }
    
    /// ```
    /// If bytes is null then this returns the number of required bytes. This clones all the
    /// data into the bytes buffer. This is expected to run offline or asynchronously.
    /// This mutates the compound to nullify pointers, leaving the compound in an unusable state.
    /// ```
    public static MemorySegment convertCompoundToBytes(
    	MemorySegment compound
    ) {
    	MethodHandle method = B3_CONVERT_COMPOUND_TO_BYTES.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			compound
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#convertCompoundToBytes].
    public static @Nullable NativeByteArray convertCompoundToBytes(
    	CompoundData compound
    ) {
    	MemorySegment segment = convertCompoundToBytes(
    		compound.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativeByteArray(segment);
    }
    
    /// ```
    /// Convert bytes to compound. This does not clone. The bytes must remain in scope while the
    /// compound is used. This is done to improve run-time performance and allow for instancing.
    /// The bytes are mutated to fixup pointers.
    /// ```
    public static MemorySegment convertBytesToCompound(
    	MemorySegment bytes,
    	int byteCount
    ) {
    	MethodHandle method = B3_CONVERT_BYTES_TO_COMPOUND.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			bytes,
    			byteCount
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#convertBytesToCompound].
    public static @Nullable CompoundData convertBytesToCompound(
    	NativeByteArray bytes,
    	int byteCount
    ) {
    	MemorySegment segment = convertBytesToCompound(
    		bytes.memorySegment(),
    		byteCount
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new CompoundData(segment);
    }
    
}