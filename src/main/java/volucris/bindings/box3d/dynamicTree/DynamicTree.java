/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.box3d.dynamicTree;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.StructLayout;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import org.jspecify.annotations.Nullable;
import volucris.bindings.box3d.math.AABB;
import volucris.bindings.box3d.math.Vec3;
import volucris.bindings.box3d.query.BoxCastInput;
import volucris.bindings.box3d.query.RayCastInput;
import volucris.bindings.core.NativeByteArray;
import volucris.bindings.core.NativeFloatArray;
import volucris.bindings.core.NativeIntArray;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

/// ```
/// The dynamic tree structure. This should be considered private data.
/// It is placed here for performance reasons.
/// ```
public final class DynamicTree
		implements Struct<DynamicTree> {

    private static final LazyConstant<MethodHandle> B3_DYNAMIC_TREE_CREATE;
    private static final LazyConstant<MethodHandle> B3_DYNAMIC_TREE_DESTROY;
    private static final LazyConstant<MethodHandle> B3_DYNAMIC_TREE_CREATE_PROXY;
    private static final LazyConstant<MethodHandle> B3_DYNAMIC_TREE_DESTROY_PROXY;
    private static final LazyConstant<MethodHandle> B3_DYNAMIC_TREE_MOVE_PROXY;
    private static final LazyConstant<MethodHandle> B3_DYNAMIC_TREE_ENLARGE_PROXY;
    private static final LazyConstant<MethodHandle> B3_DYNAMIC_TREE_SET_CATEGORY_BITS;
    private static final LazyConstant<MethodHandle> B3_DYNAMIC_TREE_GET_CATEGORY_BITS;
    private static final LazyConstant<MethodHandle> B3_DYNAMIC_TREE_QUERY;
    private static final LazyConstant<MethodHandle> B3_DYNAMIC_TREE_QUERY_CLOSEST;
    private static final LazyConstant<MethodHandle> B3_DYNAMIC_TREE_RAY_CAST;
    private static final LazyConstant<MethodHandle> B3_DYNAMIC_TREE_BOX_CAST;
    private static final LazyConstant<MethodHandle> B3_DYNAMIC_TREE_VALIDATE;
    private static final LazyConstant<MethodHandle> B3_DYNAMIC_TREE_GET_HEIGHT;
    private static final LazyConstant<MethodHandle> B3_DYNAMIC_TREE_GET_AREA_RATIO;
    private static final LazyConstant<MethodHandle> B3_DYNAMIC_TREE_GET_ROOT_BOUNDS;
    private static final LazyConstant<MethodHandle> B3_DYNAMIC_TREE_GET_PROXY_COUNT;
    private static final LazyConstant<MethodHandle> B3_DYNAMIC_TREE_REBUILD;
    private static final LazyConstant<MethodHandle> B3_DYNAMIC_TREE_GET_BYTE_COUNT;
    private static final LazyConstant<MethodHandle> B3_DYNAMIC_TREE_VALIDATE_NO_ENLARGED;
    private static final LazyConstant<MethodHandle> B3_DYNAMIC_TREE_SAVE;
    private static final LazyConstant<MethodHandle> B3_DYNAMIC_TREE_LOAD;

    public static final StructLayout LAYOUT;

    public static final VarHandle VERSION_HANDLE;
    public static final VarHandle NODES_HANDLE;
    public static final VarHandle ROOT_HANDLE;
    public static final VarHandle NODE_COUNT_HANDLE;
    public static final VarHandle NODE_CAPACITY_HANDLE;
    public static final VarHandle PROXY_COUNT_HANDLE;
    public static final VarHandle FREE_LIST_HANDLE;
    public static final VarHandle LEAF_INDICES_HANDLE;
    public static final VarHandle LEAF_BOXES_HANDLE;
    public static final VarHandle LEAF_CENTERS_HANDLE;
    public static final VarHandle BIN_INDICES_HANDLE;
    public static final VarHandle REBUILD_CAPACITY_HANDLE;

    public static final long VERSION_BYTE_OFFSET;
    public static final long NODES_BYTE_OFFSET;
    public static final long ROOT_BYTE_OFFSET;
    public static final long NODE_COUNT_BYTE_OFFSET;
    public static final long NODE_CAPACITY_BYTE_OFFSET;
    public static final long PROXY_COUNT_BYTE_OFFSET;
    public static final long FREE_LIST_BYTE_OFFSET;
    public static final long LEAF_INDICES_BYTE_OFFSET;
    public static final long LEAF_BOXES_BYTE_OFFSET;
    public static final long LEAF_CENTERS_BYTE_OFFSET;
    public static final long BIN_INDICES_BYTE_OFFSET;
    public static final long REBUILD_CAPACITY_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_LONG.withName("version"),
            UNBOUNDED_ADDRESS.withName("nodes"),
            JAVA_INT.withName("root"),
            JAVA_INT.withName("nodeCount"),
            JAVA_INT.withName("nodeCapacity"),
            JAVA_INT.withName("proxyCount"),
            JAVA_INT.withName("freeList"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("leafIndices"),
            UNBOUNDED_ADDRESS.withName("leafBoxes"),
            UNBOUNDED_ADDRESS.withName("leafCenters"),
            UNBOUNDED_ADDRESS.withName("binIndices"),
            JAVA_INT.withName("rebuildCapacity"),
            MemoryLayout.paddingLayout(4)
        ).withName("b3DynamicTree").withByteAlignment(8);
        
        B3_DYNAMIC_TREE_CREATE = downcallHandle("b3DynamicTree_Create", DynamicTree.LAYOUT, JAVA_INT);
        B3_DYNAMIC_TREE_DESTROY = downcallHandleVoid("b3DynamicTree_Destroy", UNBOUNDED_ADDRESS);
        B3_DYNAMIC_TREE_CREATE_PROXY = downcallHandle("b3DynamicTree_CreateProxy", JAVA_INT, UNBOUNDED_ADDRESS, AABB.LAYOUT, JAVA_LONG, JAVA_LONG);
        B3_DYNAMIC_TREE_DESTROY_PROXY = downcallHandleVoid("b3DynamicTree_DestroyProxy", UNBOUNDED_ADDRESS, JAVA_INT);
        B3_DYNAMIC_TREE_MOVE_PROXY = downcallHandleVoid("b3DynamicTree_MoveProxy", UNBOUNDED_ADDRESS, JAVA_INT, AABB.LAYOUT);
        B3_DYNAMIC_TREE_ENLARGE_PROXY = downcallHandleVoid("b3DynamicTree_EnlargeProxy", UNBOUNDED_ADDRESS, JAVA_INT, AABB.LAYOUT);
        B3_DYNAMIC_TREE_SET_CATEGORY_BITS = downcallHandleVoid("b3DynamicTree_SetCategoryBits", UNBOUNDED_ADDRESS, JAVA_INT, JAVA_LONG);
        B3_DYNAMIC_TREE_GET_CATEGORY_BITS = downcallHandle("b3DynamicTree_GetCategoryBits", JAVA_LONG, UNBOUNDED_ADDRESS, JAVA_INT);
        B3_DYNAMIC_TREE_QUERY = downcallHandle("b3DynamicTree_Query", TreeStats.LAYOUT, UNBOUNDED_ADDRESS, AABB.LAYOUT, JAVA_LONG, JAVA_BOOLEAN, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        B3_DYNAMIC_TREE_QUERY_CLOSEST = downcallHandle("b3DynamicTree_QueryClosest", TreeStats.LAYOUT, UNBOUNDED_ADDRESS, Vec3.LAYOUT, JAVA_LONG, JAVA_BOOLEAN, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        B3_DYNAMIC_TREE_RAY_CAST = downcallHandle("b3DynamicTree_RayCast", TreeStats.LAYOUT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_BOOLEAN, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        B3_DYNAMIC_TREE_BOX_CAST = downcallHandle("b3DynamicTree_BoxCast", TreeStats.LAYOUT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_BOOLEAN, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        B3_DYNAMIC_TREE_VALIDATE = downcallHandleVoid("b3DynamicTree_Validate", UNBOUNDED_ADDRESS);
        B3_DYNAMIC_TREE_GET_HEIGHT = downcallHandle("b3DynamicTree_GetHeight", JAVA_INT, UNBOUNDED_ADDRESS);
        B3_DYNAMIC_TREE_GET_AREA_RATIO = downcallHandle("b3DynamicTree_GetAreaRatio", JAVA_FLOAT, UNBOUNDED_ADDRESS);
        B3_DYNAMIC_TREE_GET_ROOT_BOUNDS = downcallHandle("b3DynamicTree_GetRootBounds", AABB.LAYOUT, UNBOUNDED_ADDRESS);
        B3_DYNAMIC_TREE_GET_PROXY_COUNT = downcallHandle("b3DynamicTree_GetProxyCount", JAVA_INT, UNBOUNDED_ADDRESS);
        B3_DYNAMIC_TREE_REBUILD = downcallHandle("b3DynamicTree_Rebuild", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_BOOLEAN);
        B3_DYNAMIC_TREE_GET_BYTE_COUNT = downcallHandle("b3DynamicTree_GetByteCount", JAVA_INT, UNBOUNDED_ADDRESS);
        B3_DYNAMIC_TREE_VALIDATE_NO_ENLARGED = downcallHandleVoid("b3DynamicTree_ValidateNoEnlarged", UNBOUNDED_ADDRESS);
        B3_DYNAMIC_TREE_SAVE = downcallHandleVoid("b3DynamicTree_Save", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        B3_DYNAMIC_TREE_LOAD = downcallHandle("b3DynamicTree_Load", DynamicTree.LAYOUT, UNBOUNDED_ADDRESS, JAVA_FLOAT);
        
        VERSION_HANDLE = LAYOUT.varHandle(PathElement.groupElement("version"));
        NODES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("nodes"));
        ROOT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("root"));
        NODE_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("nodeCount"));
        NODE_CAPACITY_HANDLE = LAYOUT.varHandle(PathElement.groupElement("nodeCapacity"));
        PROXY_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("proxyCount"));
        FREE_LIST_HANDLE = LAYOUT.varHandle(PathElement.groupElement("freeList"));
        LEAF_INDICES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("leafIndices"));
        LEAF_BOXES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("leafBoxes"));
        LEAF_CENTERS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("leafCenters"));
        BIN_INDICES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("binIndices"));
        REBUILD_CAPACITY_HANDLE = LAYOUT.varHandle(PathElement.groupElement("rebuildCapacity"));
        
        VERSION_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("version"));
        NODES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("nodes"));
        ROOT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("root"));
        NODE_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("nodeCount"));
        NODE_CAPACITY_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("nodeCapacity"));
        PROXY_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("proxyCount"));
        FREE_LIST_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("freeList"));
        LEAF_INDICES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("leafIndices"));
        LEAF_BOXES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("leafBoxes"));
        LEAF_CENTERS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("leafCenters"));
        BIN_INDICES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("binIndices"));
        REBUILD_CAPACITY_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("rebuildCapacity"));
        //@formatter:on
    }

    public DynamicTree() {
        this(Arena.ofAuto());
    }
    
    public DynamicTree(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public DynamicTree(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// ```
    /// Constructing the tree initializes the node pool.
    /// ```
    public static MemorySegment ncreate(
    	SegmentAllocator allocator,
    	int proxyCapacity
    ) {
    	MethodHandle method = B3_DYNAMIC_TREE_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			proxyCapacity
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ncreate].
    public static @Nullable DynamicTree create(
    	SegmentAllocator allocator,
    	int proxyCapacity
    ) {
    	MemorySegment segment = ncreate(
    		allocator,
    		proxyCapacity
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new DynamicTree(segment);
    }
    
    /// ```
    /// Destroy the tree, freeing the node pool.
    /// ```
    public static void destroy(
    	MemorySegment tree
    ) {
    	MethodHandle method = B3_DYNAMIC_TREE_DESTROY.get();
    	try {
    		 method.invokeExact(
    			tree
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#destroy].
    public static void destroy(
    	DynamicTree tree
    ) {
    	destroy(
    		tree.memorySegment()
    	);
    }
    
    /// ```
    /// Create a proxy. Provide an AABB and a userData value.
    /// ```
    public static int createProxy(
    	MemorySegment tree,
    	MemorySegment aabb,
    	long categoryBits,
    	long userData
    ) {
    	MethodHandle method = B3_DYNAMIC_TREE_CREATE_PROXY.get();
    	try {
    		return (int) method.invokeExact(
    			tree,
    			aabb,
    			categoryBits,
    			userData
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#createProxy].
    public static int createProxy(
    	DynamicTree tree,
    	AABB aabb,
    	long categoryBits,
    	long userData
    ) {
    	return createProxy(
    		tree.memorySegment(),
    		aabb.memorySegment(),
    		categoryBits,
    		userData
    	);
    }
    
    /// ```
    /// Destroy a proxy. This asserts if the id is invalid.
    /// ```
    public static void destroyProxy(
    	MemorySegment tree,
    	int proxyId
    ) {
    	MethodHandle method = B3_DYNAMIC_TREE_DESTROY_PROXY.get();
    	try {
    		 method.invokeExact(
    			tree,
    			proxyId
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#destroyProxy].
    public static void destroyProxy(
    	DynamicTree tree,
    	int proxyId
    ) {
    	destroyProxy(
    		tree.memorySegment(),
    		proxyId
    	);
    }
    
    /// ```
    /// Move a proxy to a new AABB by removing and reinserting into the tree.
    /// ```
    public static void moveProxy(
    	MemorySegment tree,
    	int proxyId,
    	MemorySegment aabb
    ) {
    	MethodHandle method = B3_DYNAMIC_TREE_MOVE_PROXY.get();
    	try {
    		 method.invokeExact(
    			tree,
    			proxyId,
    			aabb
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#moveProxy].
    public static void moveProxy(
    	DynamicTree tree,
    	int proxyId,
    	AABB aabb
    ) {
    	moveProxy(
    		tree.memorySegment(),
    		proxyId,
    		aabb.memorySegment()
    	);
    }
    
    /// ```
    /// Enlarge a proxy and enlarge ancestors as necessary.
    /// ```
    public static void enlargeProxy(
    	MemorySegment tree,
    	int proxyId,
    	MemorySegment aabb
    ) {
    	MethodHandle method = B3_DYNAMIC_TREE_ENLARGE_PROXY.get();
    	try {
    		 method.invokeExact(
    			tree,
    			proxyId,
    			aabb
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#enlargeProxy].
    public static void enlargeProxy(
    	DynamicTree tree,
    	int proxyId,
    	AABB aabb
    ) {
    	enlargeProxy(
    		tree.memorySegment(),
    		proxyId,
    		aabb.memorySegment()
    	);
    }
    
    /// ```
    /// Modify the category bits on a proxy. This is an expensive operation.
    /// ```
    public static void setCategoryBits(
    	MemorySegment tree,
    	int proxyId,
    	long categoryBits
    ) {
    	MethodHandle method = B3_DYNAMIC_TREE_SET_CATEGORY_BITS.get();
    	try {
    		 method.invokeExact(
    			tree,
    			proxyId,
    			categoryBits
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setCategoryBits].
    public static void setCategoryBits(
    	DynamicTree tree,
    	int proxyId,
    	long categoryBits
    ) {
    	setCategoryBits(
    		tree.memorySegment(),
    		proxyId,
    		categoryBits
    	);
    }
    
    /// ```
    /// Get the category bits on a proxy.
    /// ```
    public static long getCategoryBits(
    	MemorySegment tree,
    	int proxyId
    ) {
    	MethodHandle method = B3_DYNAMIC_TREE_GET_CATEGORY_BITS.get();
    	try {
    		return (long) method.invokeExact(
    			tree,
    			proxyId
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getCategoryBits].
    public static long getCategoryBits(
    	DynamicTree tree,
    	int proxyId
    ) {
    	return getCategoryBits(
    		tree.memorySegment(),
    		proxyId
    	);
    }
    
    /// ```
    /// Query an AABB for overlapping proxies. The callback function is called for each proxy that overlaps the supplied AABB.
    /// @return performance data
    /// ```
    public static MemorySegment query(
    	SegmentAllocator allocator,
    	MemorySegment tree,
    	MemorySegment aabb,
    	long maskBits,
    	boolean requireAllBits,
    	MemorySegment callback,
    	MemorySegment context
    ) {
    	MethodHandle method = B3_DYNAMIC_TREE_QUERY.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			tree,
    			aabb,
    			maskBits,
    			requireAllBits,
    			callback,
    			context
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#query].
    public static @Nullable TreeStats query(
    	SegmentAllocator allocator,
    	DynamicTree tree,
    	AABB aabb,
    	long maskBits,
    	boolean requireAllBits,
    	TreeQueryCallbackFcn callback,
    	MemorySegment context
    ) {
    	MemorySegment segment = query(
    		allocator,
    		tree.memorySegment(),
    		aabb.memorySegment(),
    		maskBits,
    		requireAllBits,
    		callback.memorySegment(),
    		context
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new TreeStats(segment);
    }
    
    /// ```
    /// Query an AABB for the closest object. The callback function is called for each proxy that might be closest to the supplied point.
    /// @param tree the dynamic tree to query
    /// @param point the query point
    /// @param maskBits nodes are skipped if the bit-wise AND with the node category bits is zero
    /// @param requireAllBits nodes are skipped if the bit-wise AND with the node category bits does not equal the maskBits
    /// @param callback a user provided instance of b3TreeQueryClosestCallbackFcn
    /// @param context a user context object that is provided to the callback
    /// @param minDistanceSqr the initial and final minimum squared distance. Provide a small initial to restrict the search and
    /// improve performance. If the value is large this query has performance that scales linearly with the number of proxies and
    /// would be slower than a brute force search.
    /// @return performance data
    /// ```
    public static MemorySegment queryClosest(
    	SegmentAllocator allocator,
    	MemorySegment tree,
    	MemorySegment point,
    	long maskBits,
    	boolean requireAllBits,
    	MemorySegment callback,
    	MemorySegment context,
    	MemorySegment minDistanceSqr
    ) {
    	MethodHandle method = B3_DYNAMIC_TREE_QUERY_CLOSEST.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			tree,
    			point,
    			maskBits,
    			requireAllBits,
    			callback,
    			context,
    			minDistanceSqr
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#queryClosest].
    public static @Nullable TreeStats queryClosest(
    	SegmentAllocator allocator,
    	DynamicTree tree,
    	Vec3 point,
    	long maskBits,
    	boolean requireAllBits,
    	TreeQueryClosestCallbackFcn callback,
    	MemorySegment context,
    	NativeFloatArray minDistanceSqr
    ) {
    	MemorySegment segment = queryClosest(
    		allocator,
    		tree.memorySegment(),
    		point.memorySegment(),
    		maskBits,
    		requireAllBits,
    		callback.memorySegment(),
    		context,
    		minDistanceSqr.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new TreeStats(segment);
    }
    
    /// ```
    /// Ray cast against the proxies in the tree. This relies on the callback
    /// to perform an exact ray cast in the case where the proxy contains a shape.
    /// The callback also performs any collision filtering. This has performance
    /// roughly equal to k * log(n), where k is the number of collisions and n is the
    /// number of proxies in the tree.
    /// Bit-wise filtering using mask bits can greatly improve performance in some scenarios.
    /// However, this filtering may be approximate, so the user should still apply filtering to results.
    /// @param tree the dynamic tree to ray cast
    /// @param input the ray cast input data. The ray extends from p1 to p1 + maxFraction * (p2 - p1)
    /// @param maskBits bit mask test: `bool accept = (maskBits & node->categoryBits) != 0;`
    /// @param requireAllBits modifies bit mask test: `bool accept = (maskBits & node->categoryBits) == maskBits;`
    /// @param callback a callback function that is called for each proxy that is hit by the ray
    /// @param context user context that is passed to the callback
    /// @return performance data
    /// ```
    public static MemorySegment rayCast(
    	SegmentAllocator allocator,
    	MemorySegment tree,
    	MemorySegment input,
    	long maskBits,
    	boolean requireAllBits,
    	MemorySegment callback,
    	MemorySegment context
    ) {
    	MethodHandle method = B3_DYNAMIC_TREE_RAY_CAST.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			tree,
    			input,
    			maskBits,
    			requireAllBits,
    			callback,
    			context
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#rayCast].
    public static @Nullable TreeStats rayCast(
    	SegmentAllocator allocator,
    	DynamicTree tree,
    	RayCastInput input,
    	long maskBits,
    	boolean requireAllBits,
    	TreeRayCastCallbackFcn callback,
    	MemorySegment context
    ) {
    	MemorySegment segment = rayCast(
    		allocator,
    		tree.memorySegment(),
    		input.memorySegment(),
    		maskBits,
    		requireAllBits,
    		callback.memorySegment(),
    		context
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new TreeStats(segment);
    }
    
    /// ```
    /// Sweep an AABB through the tree. The box is in the tree's world float frame and the callback
    /// re-differences each shape at full precision against the query origin. Used by the large world
    /// spatial queries so the tree traversal stays float while the narrow phase stays precise.
    /// ```
    public static MemorySegment boxCast(
    	SegmentAllocator allocator,
    	MemorySegment tree,
    	MemorySegment input,
    	long maskBits,
    	boolean requireAllBits,
    	MemorySegment callback,
    	MemorySegment context
    ) {
    	MethodHandle method = B3_DYNAMIC_TREE_BOX_CAST.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			tree,
    			input,
    			maskBits,
    			requireAllBits,
    			callback,
    			context
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#boxCast].
    public static @Nullable TreeStats boxCast(
    	SegmentAllocator allocator,
    	DynamicTree tree,
    	BoxCastInput input,
    	long maskBits,
    	boolean requireAllBits,
    	TreeBoxCastCallbackFcn callback,
    	MemorySegment context
    ) {
    	MemorySegment segment = boxCast(
    		allocator,
    		tree.memorySegment(),
    		input.memorySegment(),
    		maskBits,
    		requireAllBits,
    		callback.memorySegment(),
    		context
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new TreeStats(segment);
    }
    
    /// ```
    /// Validate this tree. For testing.
    /// ```
    public static void validate(
    	MemorySegment tree
    ) {
    	MethodHandle method = B3_DYNAMIC_TREE_VALIDATE.get();
    	try {
    		 method.invokeExact(
    			tree
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#validate].
    public static void validate(
    	DynamicTree tree
    ) {
    	validate(
    		tree.memorySegment()
    	);
    }
    
    /// ```
    /// Get the height of the binary tree.
    /// ```
    public static int getHeight(
    	MemorySegment tree
    ) {
    	MethodHandle method = B3_DYNAMIC_TREE_GET_HEIGHT.get();
    	try {
    		return (int) method.invokeExact(
    			tree
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getHeight].
    public static int getHeight(
    	DynamicTree tree
    ) {
    	return getHeight(
    		tree.memorySegment()
    	);
    }
    
    /// ```
    /// Get the ratio of the sum of the node areas to the root area.
    /// ```
    public static float getAreaRatio(
    	MemorySegment tree
    ) {
    	MethodHandle method = B3_DYNAMIC_TREE_GET_AREA_RATIO.get();
    	try {
    		return (float) method.invokeExact(
    			tree
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getAreaRatio].
    public static float getAreaRatio(
    	DynamicTree tree
    ) {
    	return getAreaRatio(
    		tree.memorySegment()
    	);
    }
    
    /// ```
    /// Get the bounding box that contains the entire tree
    /// ```
    public static MemorySegment getRootBounds(
    	SegmentAllocator allocator,
    	MemorySegment tree
    ) {
    	MethodHandle method = B3_DYNAMIC_TREE_GET_ROOT_BOUNDS.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			tree
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getRootBounds].
    public static @Nullable AABB getRootBounds(
    	SegmentAllocator allocator,
    	DynamicTree tree
    ) {
    	MemorySegment segment = getRootBounds(
    		allocator,
    		tree.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new AABB(segment);
    }
    
    /// ```
    /// Get the number of proxies created
    /// ```
    public static int getProxyCount(
    	MemorySegment tree
    ) {
    	MethodHandle method = B3_DYNAMIC_TREE_GET_PROXY_COUNT.get();
    	try {
    		return (int) method.invokeExact(
    			tree
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getProxyCount].
    public static int getProxyCount(
    	DynamicTree tree
    ) {
    	return getProxyCount(
    		tree.memorySegment()
    	);
    }
    
    /// ```
    /// Rebuild the tree while retaining subtrees that haven't changed. Returns the number of boxes sorted.
    /// ```
    public static int rebuild(
    	MemorySegment tree,
    	boolean fullBuild
    ) {
    	MethodHandle method = B3_DYNAMIC_TREE_REBUILD.get();
    	try {
    		return (int) method.invokeExact(
    			tree,
    			fullBuild
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#rebuild].
    public static int rebuild(
    	DynamicTree tree,
    	boolean fullBuild
    ) {
    	return rebuild(
    		tree.memorySegment(),
    		fullBuild
    	);
    }
    
    /// ```
    /// Get the number of bytes used by this tree
    /// ```
    public static int getByteCount(
    	MemorySegment tree
    ) {
    	MethodHandle method = B3_DYNAMIC_TREE_GET_BYTE_COUNT.get();
    	try {
    		return (int) method.invokeExact(
    			tree
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getByteCount].
    public static int getByteCount(
    	DynamicTree tree
    ) {
    	return getByteCount(
    		tree.memorySegment()
    	);
    }
    
    /// ```
    /// Validate this tree has no enlarged AABBs. For testing.
    /// ```
    public static void validateNoEnlarged(
    	MemorySegment tree
    ) {
    	MethodHandle method = B3_DYNAMIC_TREE_VALIDATE_NO_ENLARGED.get();
    	try {
    		 method.invokeExact(
    			tree
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#validateNoEnlarged].
    public static void validateNoEnlarged(
    	DynamicTree tree
    ) {
    	validateNoEnlarged(
    		tree.memorySegment()
    	);
    }
    
    /// ```
    /// Save this tree to a file for debugging
    /// ```
    public static void save(
    	MemorySegment tree,
    	MemorySegment fileName
    ) {
    	MethodHandle method = B3_DYNAMIC_TREE_SAVE.get();
    	try {
    		 method.invokeExact(
    			tree,
    			fileName
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#save].
    public static void save(
    	DynamicTree tree,
    	NativeByteArray fileName
    ) {
    	save(
    		tree.memorySegment(),
    		fileName.memorySegment()
    	);
    }
    
    /// ```
    /// Load a file for debugging
    /// ```
    public static MemorySegment load(
    	SegmentAllocator allocator,
    	MemorySegment fileName,
    	float scale
    ) {
    	MethodHandle method = B3_DYNAMIC_TREE_LOAD.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			fileName,
    			scale
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#load].
    public static @Nullable DynamicTree load(
    	SegmentAllocator allocator,
    	NativeByteArray fileName,
    	float scale
    ) {
    	MemorySegment segment = load(
    		allocator,
    		fileName.memorySegment(),
    		scale
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new DynamicTree(segment);
    }
    
    /// @see #version()
    public DynamicTree version(long version) {
    	VERSION_HANDLE.set(segment, 0L, version);
    	return this;
    }
    
    /// ```
    /// The dynamic tree version. Always the first field. Useful
    /// if the tree is serialized.
    /// ```
    public long version() {
    	return (long) VERSION_HANDLE.get(segment, 0L);
    }
    
    /// @see #nodes()
    public DynamicTree nodes(NativeStructArray<TreeNode> nodes) {
    	NODES_HANDLE.set(segment, 0L, nodes.memorySegment());
    	return this;
    }
    
    /// ```
    /// The tree nodes
    /// ```
    public @Nullable NativeStructArray<TreeNode> nodes() {
    	MemorySegment segment = (MemorySegment) NODES_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    
    	return TreeNode.array(segment);
    }
    
    /// @see #root()
    public DynamicTree root(int root) {
    	ROOT_HANDLE.set(segment, 0L, root);
    	return this;
    }
    
    /// ```
    /// The root index
    /// ```
    public int root() {
    	return (int) ROOT_HANDLE.get(segment, 0L);
    }
    
    /// @see #nodeCount()
    public DynamicTree nodeCount(int nodeCount) {
    	NODE_COUNT_HANDLE.set(segment, 0L, nodeCount);
    	return this;
    }
    
    /// ```
    /// The number of nodes
    /// ```
    public int nodeCount() {
    	return (int) NODE_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #nodeCapacity()
    public DynamicTree nodeCapacity(int nodeCapacity) {
    	NODE_CAPACITY_HANDLE.set(segment, 0L, nodeCapacity);
    	return this;
    }
    
    /// ```
    /// The allocated node space
    /// ```
    public int nodeCapacity() {
    	return (int) NODE_CAPACITY_HANDLE.get(segment, 0L);
    }
    
    /// @see #proxyCount()
    public DynamicTree proxyCount(int proxyCount) {
    	PROXY_COUNT_HANDLE.set(segment, 0L, proxyCount);
    	return this;
    }
    
    /// ```
    /// Number of proxies created
    /// ```
    public int proxyCount() {
    	return (int) PROXY_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #freeList()
    public DynamicTree freeList(int freeList) {
    	FREE_LIST_HANDLE.set(segment, 0L, freeList);
    	return this;
    }
    
    /// ```
    /// Node free list
    /// ```
    public int freeList() {
    	return (int) FREE_LIST_HANDLE.get(segment, 0L);
    }
    
    /// @see #leafIndices()
    public DynamicTree leafIndices(NativeIntArray leafIndices) {
    	LEAF_INDICES_HANDLE.set(segment, 0L, leafIndices.memorySegment());
    	return this;
    }
    
    /// ```
    /// Leaf indices for rebuild
    /// ```
    public @Nullable NativeIntArray leafIndices() {
    	MemorySegment segment = (MemorySegment) LEAF_INDICES_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativeIntArray(segment);
    }
    
    /// @see #leafBoxes()
    public DynamicTree leafBoxes(AABB leafBoxes) {
    	LEAF_BOXES_HANDLE.set(segment, 0L, leafBoxes.memorySegment());
    	return this;
    }
    
    /// ```
    /// Leaf bounding boxes for rebuild
    /// ```
    public @Nullable AABB leafBoxes() {
    	MemorySegment segment = (MemorySegment) LEAF_BOXES_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new AABB(segment);
    }
    
    /// @see #leafCenters()
    public DynamicTree leafCenters(Vec3 leafCenters) {
    	LEAF_CENTERS_HANDLE.set(segment, 0L, leafCenters.memorySegment());
    	return this;
    }
    
    /// ```
    /// Leaf bounding box centers for rebuild
    /// ```
    public @Nullable Vec3 leafCenters() {
    	MemorySegment segment = (MemorySegment) LEAF_CENTERS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new Vec3(segment);
    }
    
    /// @see #binIndices()
    public DynamicTree binIndices(NativeIntArray binIndices) {
    	BIN_INDICES_HANDLE.set(segment, 0L, binIndices.memorySegment());
    	return this;
    }
    
    /// ```
    /// Bins for sorting during rebuild
    /// ```
    public @Nullable NativeIntArray binIndices() {
    	MemorySegment segment = (MemorySegment) BIN_INDICES_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativeIntArray(segment);
    }
    
    /// @see #rebuildCapacity()
    public DynamicTree rebuildCapacity(int rebuildCapacity) {
    	REBUILD_CAPACITY_HANDLE.set(segment, 0L, rebuildCapacity);
    	return this;
    }
    
    /// ```
    /// Allocated space for rebuilding
    /// ```
    public int rebuildCapacity() {
    	return (int) REBUILD_CAPACITY_HANDLE.get(segment, 0L);
    }
    
    @Override
    public DynamicTree set(DynamicTree other) {
        return set(other.segment);
    }
    
    @Override
    public DynamicTree set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<DynamicTree> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<DynamicTree> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new DynamicTree(segment),
            count
        );
    }
    
    public static NativeStructArray<DynamicTree> array(Arena arena, DynamicTree... structs) {
        NativeStructArray<DynamicTree> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new DynamicTree(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<DynamicTree> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new DynamicTree(segment)
        );
    }
    
}