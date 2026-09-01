/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.box3d.shape;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.invoke.MethodHandle;
import org.jspecify.annotations.Nullable;
import volucris.bindings.box3d.body.BodyId;
import volucris.bindings.box3d.events.ContactData;
import volucris.bindings.box3d.geometry.Capsule;
import volucris.bindings.box3d.geometry.CompoundData;
import volucris.bindings.box3d.geometry.HeightFieldData;
import volucris.bindings.box3d.geometry.HullData;
import volucris.bindings.box3d.geometry.MassData;
import volucris.bindings.box3d.geometry.Mesh;
import volucris.bindings.box3d.geometry.MeshData;
import volucris.bindings.box3d.geometry.Sphere;
import volucris.bindings.box3d.math.AABB;
import volucris.bindings.box3d.math.Transform;
import volucris.bindings.box3d.math.Vec3;
import volucris.bindings.box3d.query.CastOutput;
import volucris.bindings.box3d.world.WorldId;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class Shape {

    private static final LazyConstant<MethodHandle> B3_CREATE_SPHERE_SHAPE;
    private static final LazyConstant<MethodHandle> B3_CREATE_CAPSULE_SHAPE;
    private static final LazyConstant<MethodHandle> B3_CREATE_HULL_SHAPE;
    private static final LazyConstant<MethodHandle> B3_CREATE_TRANSFORMED_HULL_SHAPE;
    private static final LazyConstant<MethodHandle> B3_CREATE_MESH_SHAPE;
    private static final LazyConstant<MethodHandle> B3_CREATE_HEIGHT_FIELD_SHAPE;
    private static final LazyConstant<MethodHandle> B3_CREATE_COMPOUND_SHAPE;
    private static final LazyConstant<MethodHandle> B3_DESTROY_SHAPE;
    private static final LazyConstant<MethodHandle> B3_SHAPE_IS_VALID;
    private static final LazyConstant<MethodHandle> B3_SHAPE_GET_TYPE;
    private static final LazyConstant<MethodHandle> B3_SHAPE_GET_BODY;
    private static final LazyConstant<MethodHandle> B3_SHAPE_GET_WORLD;
    private static final LazyConstant<MethodHandle> B3_SHAPE_IS_SENSOR;
    private static final LazyConstant<MethodHandle> B3_SHAPE_SET_USER_DATA;
    private static final LazyConstant<MethodHandle> B3_SHAPE_GET_USER_DATA;
    private static final LazyConstant<MethodHandle> B3_SHAPE_SET_DENSITY;
    private static final LazyConstant<MethodHandle> B3_SHAPE_GET_DENSITY;
    private static final LazyConstant<MethodHandle> B3_SHAPE_SET_FRICTION;
    private static final LazyConstant<MethodHandle> B3_SHAPE_GET_FRICTION;
    private static final LazyConstant<MethodHandle> B3_SHAPE_SET_RESTITUTION;
    private static final LazyConstant<MethodHandle> B3_SHAPE_GET_RESTITUTION;
    private static final LazyConstant<MethodHandle> B3_SHAPE_SET_SURFACE_MATERIAL;
    private static final LazyConstant<MethodHandle> B3_SHAPE_GET_SURFACE_MATERIAL;
    private static final LazyConstant<MethodHandle> B3_SHAPE_GET_MESH_MATERIAL_COUNT;
    private static final LazyConstant<MethodHandle> B3_SHAPE_SET_MESH_MATERIAL;
    private static final LazyConstant<MethodHandle> B3_SHAPE_GET_MESH_SURFACE_MATERIAL;
    private static final LazyConstant<MethodHandle> B3_SHAPE_GET_FILTER;
    private static final LazyConstant<MethodHandle> B3_SHAPE_SET_FILTER;
    private static final LazyConstant<MethodHandle> B3_SHAPE_ENABLE_SENSOR_EVENTS;
    private static final LazyConstant<MethodHandle> B3_SHAPE_ARE_SENSOR_EVENTS_ENABLED;
    private static final LazyConstant<MethodHandle> B3_SHAPE_ENABLE_CONTACT_EVENTS;
    private static final LazyConstant<MethodHandle> B3_SHAPE_ARE_CONTACT_EVENTS_ENABLED;
    private static final LazyConstant<MethodHandle> B3_SHAPE_ENABLE_PRE_SOLVE_EVENTS;
    private static final LazyConstant<MethodHandle> B3_SHAPE_ARE_PRE_SOLVE_EVENTS_ENABLED;
    private static final LazyConstant<MethodHandle> B3_SHAPE_ENABLE_HIT_EVENTS;
    private static final LazyConstant<MethodHandle> B3_SHAPE_ARE_HIT_EVENTS_ENABLED;
    private static final LazyConstant<MethodHandle> B3_SHAPE_RAY_CAST;
    private static final LazyConstant<MethodHandle> B3_SHAPE_GET_SPHERE;
    private static final LazyConstant<MethodHandle> B3_SHAPE_GET_CAPSULE;
    private static final LazyConstant<MethodHandle> B3_SHAPE_GET_HULL;
    private static final LazyConstant<MethodHandle> B3_SHAPE_GET_MESH;
    private static final LazyConstant<MethodHandle> B3_SHAPE_GET_HEIGHT_FIELD;
    private static final LazyConstant<MethodHandle> B3_SHAPE_SET_SPHERE;
    private static final LazyConstant<MethodHandle> B3_SHAPE_SET_CAPSULE;
    private static final LazyConstant<MethodHandle> B3_SHAPE_SET_HULL;
    private static final LazyConstant<MethodHandle> B3_SHAPE_SET_MESH;
    private static final LazyConstant<MethodHandle> B3_SHAPE_GET_CONTACT_CAPACITY;
    private static final LazyConstant<MethodHandle> B3_SHAPE_GET_CONTACT_DATA;
    private static final LazyConstant<MethodHandle> B3_SHAPE_GET_SENSOR_CAPACITY;
    private static final LazyConstant<MethodHandle> B3_SHAPE_GET_SENSOR_DATA;
    private static final LazyConstant<MethodHandle> B3_SHAPE_GET_AABB;
    private static final LazyConstant<MethodHandle> B3_SHAPE_COMPUTE_MASS_DATA;
    private static final LazyConstant<MethodHandle> B3_SHAPE_GET_CLOSEST_POINT;
    private static final LazyConstant<MethodHandle> B3_SHAPE_APPLY_WIND;

    static {
        //@formatter:off
        B3_CREATE_SPHERE_SHAPE = downcallHandle("b3CreateSphereShape", ShapeId.LAYOUT, BodyId.LAYOUT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        B3_CREATE_CAPSULE_SHAPE = downcallHandle("b3CreateCapsuleShape", ShapeId.LAYOUT, BodyId.LAYOUT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        B3_CREATE_HULL_SHAPE = downcallHandle("b3CreateHullShape", ShapeId.LAYOUT, BodyId.LAYOUT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        B3_CREATE_TRANSFORMED_HULL_SHAPE = downcallHandle("b3CreateTransformedHullShape", ShapeId.LAYOUT, BodyId.LAYOUT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, Transform.LAYOUT, Vec3.LAYOUT);
        B3_CREATE_MESH_SHAPE = downcallHandle("b3CreateMeshShape", ShapeId.LAYOUT, BodyId.LAYOUT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, Vec3.LAYOUT);
        B3_CREATE_HEIGHT_FIELD_SHAPE = downcallHandle("b3CreateHeightFieldShape", ShapeId.LAYOUT, BodyId.LAYOUT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        B3_CREATE_COMPOUND_SHAPE = downcallHandle("b3CreateCompoundShape", ShapeId.LAYOUT, BodyId.LAYOUT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        B3_DESTROY_SHAPE = downcallHandleVoid("b3DestroyShape", ShapeId.LAYOUT, JAVA_BOOLEAN);
        B3_SHAPE_IS_VALID = downcallHandle("b3Shape_IsValid", JAVA_BOOLEAN, ShapeId.LAYOUT);
        B3_SHAPE_GET_TYPE = downcallHandle("b3Shape_GetType", JAVA_INT, ShapeId.LAYOUT);
        B3_SHAPE_GET_BODY = downcallHandle("b3Shape_GetBody", BodyId.LAYOUT, ShapeId.LAYOUT);
        B3_SHAPE_GET_WORLD = downcallHandle("b3Shape_GetWorld", WorldId.LAYOUT, ShapeId.LAYOUT);
        B3_SHAPE_IS_SENSOR = downcallHandle("b3Shape_IsSensor", JAVA_BOOLEAN, ShapeId.LAYOUT);
        B3_SHAPE_SET_USER_DATA = downcallHandleVoid("b3Shape_SetUserData", ShapeId.LAYOUT, UNBOUNDED_ADDRESS);
        B3_SHAPE_GET_USER_DATA = downcallHandle("b3Shape_GetUserData", UNBOUNDED_ADDRESS, ShapeId.LAYOUT);
        B3_SHAPE_SET_DENSITY = downcallHandleVoid("b3Shape_SetDensity", ShapeId.LAYOUT, JAVA_FLOAT, JAVA_BOOLEAN);
        B3_SHAPE_GET_DENSITY = downcallHandle("b3Shape_GetDensity", JAVA_FLOAT, ShapeId.LAYOUT);
        B3_SHAPE_SET_FRICTION = downcallHandleVoid("b3Shape_SetFriction", ShapeId.LAYOUT, JAVA_FLOAT);
        B3_SHAPE_GET_FRICTION = downcallHandle("b3Shape_GetFriction", JAVA_FLOAT, ShapeId.LAYOUT);
        B3_SHAPE_SET_RESTITUTION = downcallHandleVoid("b3Shape_SetRestitution", ShapeId.LAYOUT, JAVA_FLOAT);
        B3_SHAPE_GET_RESTITUTION = downcallHandle("b3Shape_GetRestitution", JAVA_FLOAT, ShapeId.LAYOUT);
        B3_SHAPE_SET_SURFACE_MATERIAL = downcallHandleVoid("b3Shape_SetSurfaceMaterial", ShapeId.LAYOUT, SurfaceMaterial.LAYOUT);
        B3_SHAPE_GET_SURFACE_MATERIAL = downcallHandle("b3Shape_GetSurfaceMaterial", SurfaceMaterial.LAYOUT, ShapeId.LAYOUT);
        B3_SHAPE_GET_MESH_MATERIAL_COUNT = downcallHandle("b3Shape_GetMeshMaterialCount", JAVA_INT, ShapeId.LAYOUT);
        B3_SHAPE_SET_MESH_MATERIAL = downcallHandleVoid("b3Shape_SetMeshMaterial", ShapeId.LAYOUT, SurfaceMaterial.LAYOUT, JAVA_INT);
        B3_SHAPE_GET_MESH_SURFACE_MATERIAL = downcallHandle("b3Shape_GetMeshSurfaceMaterial", SurfaceMaterial.LAYOUT, ShapeId.LAYOUT, JAVA_INT);
        B3_SHAPE_GET_FILTER = downcallHandle("b3Shape_GetFilter", Filter.LAYOUT, ShapeId.LAYOUT);
        B3_SHAPE_SET_FILTER = downcallHandleVoid("b3Shape_SetFilter", ShapeId.LAYOUT, Filter.LAYOUT, JAVA_BOOLEAN);
        B3_SHAPE_ENABLE_SENSOR_EVENTS = downcallHandleVoid("b3Shape_EnableSensorEvents", ShapeId.LAYOUT, JAVA_BOOLEAN);
        B3_SHAPE_ARE_SENSOR_EVENTS_ENABLED = downcallHandle("b3Shape_AreSensorEventsEnabled", JAVA_BOOLEAN, ShapeId.LAYOUT);
        B3_SHAPE_ENABLE_CONTACT_EVENTS = downcallHandleVoid("b3Shape_EnableContactEvents", ShapeId.LAYOUT, JAVA_BOOLEAN);
        B3_SHAPE_ARE_CONTACT_EVENTS_ENABLED = downcallHandle("b3Shape_AreContactEventsEnabled", JAVA_BOOLEAN, ShapeId.LAYOUT);
        B3_SHAPE_ENABLE_PRE_SOLVE_EVENTS = downcallHandleVoid("b3Shape_EnablePreSolveEvents", ShapeId.LAYOUT, JAVA_BOOLEAN);
        B3_SHAPE_ARE_PRE_SOLVE_EVENTS_ENABLED = downcallHandle("b3Shape_ArePreSolveEventsEnabled", JAVA_BOOLEAN, ShapeId.LAYOUT);
        B3_SHAPE_ENABLE_HIT_EVENTS = downcallHandleVoid("b3Shape_EnableHitEvents", ShapeId.LAYOUT, JAVA_BOOLEAN);
        B3_SHAPE_ARE_HIT_EVENTS_ENABLED = downcallHandle("b3Shape_AreHitEventsEnabled", JAVA_BOOLEAN, ShapeId.LAYOUT);
        B3_SHAPE_RAY_CAST = downcallHandle("b3Shape_RayCast", CastOutput.LAYOUT, ShapeId.LAYOUT, Vec3.LAYOUT, Vec3.LAYOUT);
        B3_SHAPE_GET_SPHERE = downcallHandle("b3Shape_GetSphere", Sphere.LAYOUT, ShapeId.LAYOUT);
        B3_SHAPE_GET_CAPSULE = downcallHandle("b3Shape_GetCapsule", Capsule.LAYOUT, ShapeId.LAYOUT);
        B3_SHAPE_GET_HULL = downcallHandle("b3Shape_GetHull", UNBOUNDED_ADDRESS, ShapeId.LAYOUT);
        B3_SHAPE_GET_MESH = downcallHandle("b3Shape_GetMesh", Mesh.LAYOUT, ShapeId.LAYOUT);
        B3_SHAPE_GET_HEIGHT_FIELD = downcallHandle("b3Shape_GetHeightField", UNBOUNDED_ADDRESS, ShapeId.LAYOUT);
        B3_SHAPE_SET_SPHERE = downcallHandleVoid("b3Shape_SetSphere", ShapeId.LAYOUT, UNBOUNDED_ADDRESS);
        B3_SHAPE_SET_CAPSULE = downcallHandleVoid("b3Shape_SetCapsule", ShapeId.LAYOUT, UNBOUNDED_ADDRESS);
        B3_SHAPE_SET_HULL = downcallHandleVoid("b3Shape_SetHull", ShapeId.LAYOUT, UNBOUNDED_ADDRESS);
        B3_SHAPE_SET_MESH = downcallHandleVoid("b3Shape_SetMesh", ShapeId.LAYOUT, UNBOUNDED_ADDRESS, Vec3.LAYOUT);
        B3_SHAPE_GET_CONTACT_CAPACITY = downcallHandle("b3Shape_GetContactCapacity", JAVA_INT, ShapeId.LAYOUT);
        B3_SHAPE_GET_CONTACT_DATA = downcallHandle("b3Shape_GetContactData", JAVA_INT, ShapeId.LAYOUT, UNBOUNDED_ADDRESS, JAVA_INT);
        B3_SHAPE_GET_SENSOR_CAPACITY = downcallHandle("b3Shape_GetSensorCapacity", JAVA_INT, ShapeId.LAYOUT);
        B3_SHAPE_GET_SENSOR_DATA = downcallHandle("b3Shape_GetSensorData", JAVA_INT, ShapeId.LAYOUT, UNBOUNDED_ADDRESS, JAVA_INT);
        B3_SHAPE_GET_AABB = downcallHandle("b3Shape_GetAABB", AABB.LAYOUT, ShapeId.LAYOUT);
        B3_SHAPE_COMPUTE_MASS_DATA = downcallHandle("b3Shape_ComputeMassData", MassData.LAYOUT, ShapeId.LAYOUT);
        B3_SHAPE_GET_CLOSEST_POINT = downcallHandle("b3Shape_GetClosestPoint", Vec3.LAYOUT, ShapeId.LAYOUT, Vec3.LAYOUT);
        B3_SHAPE_APPLY_WIND = downcallHandleVoid("b3Shape_ApplyWind", ShapeId.LAYOUT, Vec3.LAYOUT, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT, JAVA_BOOLEAN);
        //@formatter:on
    }

    private Shape() {
    }

    /// ```
    /// Create a circle shape and attach it to a body. The shape definition and geometry are fully cloned.
    /// Contacts are not created until the next time step.
    /// @return the shape id for accessing the shape
    /// ```
    public static MemorySegment createSphereShape(
    	SegmentAllocator allocator,
    	MemorySegment bodyId,
    	MemorySegment def,
    	MemorySegment sphere
    ) {
    	MethodHandle method = B3_CREATE_SPHERE_SHAPE.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			bodyId,
    			def,
    			sphere
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#createSphereShape].
    public static @Nullable ShapeId createSphereShape(
    	SegmentAllocator allocator,
    	BodyId bodyId,
    	ShapeDef def,
    	Sphere sphere
    ) {
    	MemorySegment segment = createSphereShape(
    		allocator,
    		bodyId.memorySegment(),
    		def.memorySegment(),
    		sphere.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new ShapeId(segment);
    }
    
    /// ```
    /// Create a capsule shape and attach it to a body. The shape definition and geometry are fully cloned.
    /// Contacts are not created until the next time step.
    /// @return the shape id for accessing the shape
    /// ```
    public static MemorySegment createCapsuleShape(
    	SegmentAllocator allocator,
    	MemorySegment bodyId,
    	MemorySegment def,
    	MemorySegment capsule
    ) {
    	MethodHandle method = B3_CREATE_CAPSULE_SHAPE.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			bodyId,
    			def,
    			capsule
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#createCapsuleShape].
    public static @Nullable ShapeId createCapsuleShape(
    	SegmentAllocator allocator,
    	BodyId bodyId,
    	ShapeDef def,
    	Capsule capsule
    ) {
    	MemorySegment segment = createCapsuleShape(
    		allocator,
    		bodyId.memorySegment(),
    		def.memorySegment(),
    		capsule.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new ShapeId(segment);
    }
    
    /// ```
    /// Create a convex hull shape and attach it to a body. The shape definition is fully cloned. Contacts are not created
    /// until the next time step.
    /// @return the shape id for accessing the shape
    /// ```
    public static MemorySegment createHullShape(
    	SegmentAllocator allocator,
    	MemorySegment bodyId,
    	MemorySegment def,
    	MemorySegment hull
    ) {
    	MethodHandle method = B3_CREATE_HULL_SHAPE.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			bodyId,
    			def,
    			hull
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#createHullShape].
    public static @Nullable ShapeId createHullShape(
    	SegmentAllocator allocator,
    	BodyId bodyId,
    	ShapeDef def,
    	HullData hull
    ) {
    	MemorySegment segment = createHullShape(
    		allocator,
    		bodyId.memorySegment(),
    		def.memorySegment(),
    		hull.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new ShapeId(segment);
    }
    
    /// ```
    /// Create a convex hull shape and attach it to a body. The hull is cloned then transformed with scale applied first.
    /// Use this for non-uniform or mirrored scale or a baked local transform. The baked result is shared through the
    /// world hull database. The shape definition and geometry are fully cloned. Contacts are not created until the next time step.
    /// @return the shape id for accessing the shape
    /// ```
    public static MemorySegment createTransformedHullShape(
    	SegmentAllocator allocator,
    	MemorySegment bodyId,
    	MemorySegment def,
    	MemorySegment hull,
    	MemorySegment transform,
    	MemorySegment scale
    ) {
    	MethodHandle method = B3_CREATE_TRANSFORMED_HULL_SHAPE.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			bodyId,
    			def,
    			hull,
    			transform,
    			scale
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#createTransformedHullShape].
    public static @Nullable ShapeId createTransformedHullShape(
    	SegmentAllocator allocator,
    	BodyId bodyId,
    	ShapeDef def,
    	HullData hull,
    	Transform transform,
    	Vec3 scale
    ) {
    	MemorySegment segment = createTransformedHullShape(
    		allocator,
    		bodyId.memorySegment(),
    		def.memorySegment(),
    		hull.memorySegment(),
    		transform.memorySegment(),
    		scale.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new ShapeId(segment);
    }
    
    /// ```
    /// Create a mesh hull shape and attach it to a body. The shape definition is fully cloned but the mesh is not.
    /// Contacts are not created until the next time step.
    /// Mesh collision only creates contacts on static bodies.
    /// @warning this holds reference to the input mesh data which must remain valid for the lifetime of this shape
    /// @return the shape id for accessing the shape
    /// ```
    public static MemorySegment createMeshShape(
    	SegmentAllocator allocator,
    	MemorySegment bodyId,
    	MemorySegment def,
    	MemorySegment mesh,
    	MemorySegment scale
    ) {
    	MethodHandle method = B3_CREATE_MESH_SHAPE.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			bodyId,
    			def,
    			mesh,
    			scale
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#createMeshShape].
    public static @Nullable ShapeId createMeshShape(
    	SegmentAllocator allocator,
    	BodyId bodyId,
    	ShapeDef def,
    	MeshData mesh,
    	Vec3 scale
    ) {
    	MemorySegment segment = createMeshShape(
    		allocator,
    		bodyId.memorySegment(),
    		def.memorySegment(),
    		mesh.memorySegment(),
    		scale.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new ShapeId(segment);
    }
    
    /// ```
    /// Create a height-field shape and attach it to a body. The shape definition is fully cloned but the height field is not.
    /// Contacts are not created until the next time step.
    /// Height field is only allowed on static bodies.
    /// @warning this holds reference to the input height field which must remain valid for the lifetime of this shape
    /// @return the shape id for accessing the shape
    /// ```
    public static MemorySegment createHeightFieldShape(
    	SegmentAllocator allocator,
    	MemorySegment bodyId,
    	MemorySegment def,
    	MemorySegment heightField
    ) {
    	MethodHandle method = B3_CREATE_HEIGHT_FIELD_SHAPE.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			bodyId,
    			def,
    			heightField
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#createHeightFieldShape].
    public static @Nullable ShapeId createHeightFieldShape(
    	SegmentAllocator allocator,
    	BodyId bodyId,
    	ShapeDef def,
    	HeightFieldData heightField
    ) {
    	MemorySegment segment = createHeightFieldShape(
    		allocator,
    		bodyId.memorySegment(),
    		def.memorySegment(),
    		heightField.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new ShapeId(segment);
    }
    
    /// ```
    /// Compound shapes are only allowed on static bodies.
    /// ```
    public static MemorySegment createCompoundShape(
    	SegmentAllocator allocator,
    	MemorySegment bodyId,
    	MemorySegment def,
    	MemorySegment compound
    ) {
    	MethodHandle method = B3_CREATE_COMPOUND_SHAPE.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			bodyId,
    			def,
    			compound
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#createCompoundShape].
    public static @Nullable ShapeId createCompoundShape(
    	SegmentAllocator allocator,
    	BodyId bodyId,
    	ShapeDef def,
    	CompoundData compound
    ) {
    	MemorySegment segment = createCompoundShape(
    		allocator,
    		bodyId.memorySegment(),
    		def.memorySegment(),
    		compound.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new ShapeId(segment);
    }
    
    /// ```
    /// Destroy a shape. You may defer the body mass update which can improve performance if several shapes on a
    /// body are destroyed at once.
    /// @see b3Body_ApplyMassFromShapes
    /// ```
    public static void destroyShape(
    	MemorySegment shapeId,
    	boolean updateBodyMass
    ) {
    	MethodHandle method = B3_DESTROY_SHAPE.get();
    	try {
    		 method.invokeExact(
    			shapeId,
    			updateBodyMass
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#destroyShape].
    public static void destroyShape(
    	ShapeId shapeId,
    	boolean updateBodyMass
    ) {
    	destroyShape(
    		shapeId.memorySegment(),
    		updateBodyMass
    	);
    }
    
    /// ```
    /// Shape identifier validation. Provides validation for up to 64K allocations.
    /// ```
    public static boolean isValid(
    	MemorySegment id
    ) {
    	MethodHandle method = B3_SHAPE_IS_VALID.get();
    	try {
    		return (boolean) method.invokeExact(
    			id
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#isValid].
    public static boolean isValid(
    	ShapeId id
    ) {
    	return isValid(
    		id.memorySegment()
    	);
    }
    
    /// ```
    /// Get the type of a shape
    /// ```
    public static int getType(
    	MemorySegment shapeId
    ) {
    	MethodHandle method = B3_SHAPE_GET_TYPE.get();
    	try {
    		return (int) method.invokeExact(
    			shapeId
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getType].
    public static int getType(
    	ShapeId shapeId
    ) {
    	return getType(
    		shapeId.memorySegment()
    	);
    }
    
    /// ```
    /// Get the id of the body that a shape is attached to
    /// ```
    public static MemorySegment getBody(
    	SegmentAllocator allocator,
    	MemorySegment shapeId
    ) {
    	MethodHandle method = B3_SHAPE_GET_BODY.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			shapeId
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getBody].
    public static @Nullable BodyId getBody(
    	SegmentAllocator allocator,
    	ShapeId shapeId
    ) {
    	MemorySegment segment = getBody(
    		allocator,
    		shapeId.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new BodyId(segment);
    }
    
    /// ```
    /// Get the world that owns this shape
    /// ```
    public static MemorySegment getWorld(
    	SegmentAllocator allocator,
    	MemorySegment shapeId
    ) {
    	MethodHandle method = B3_SHAPE_GET_WORLD.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			shapeId
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getWorld].
    public static @Nullable WorldId getWorld(
    	SegmentAllocator allocator,
    	ShapeId shapeId
    ) {
    	MemorySegment segment = getWorld(
    		allocator,
    		shapeId.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new WorldId(segment);
    }
    
    /// ```
    /// Returns true if the shape is a sensor
    /// ```
    public static boolean isSensor(
    	MemorySegment shapeId
    ) {
    	MethodHandle method = B3_SHAPE_IS_SENSOR.get();
    	try {
    		return (boolean) method.invokeExact(
    			shapeId
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#isSensor].
    public static boolean isSensor(
    	ShapeId shapeId
    ) {
    	return isSensor(
    		shapeId.memorySegment()
    	);
    }
    
    /// ```
    /// Set the user data for a shape
    /// ```
    public static void setUserData(
    	MemorySegment shapeId,
    	MemorySegment userData
    ) {
    	MethodHandle method = B3_SHAPE_SET_USER_DATA.get();
    	try {
    		 method.invokeExact(
    			shapeId,
    			userData
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setUserData].
    public static void setUserData(
    	ShapeId shapeId,
    	MemorySegment userData
    ) {
    	setUserData(
    		shapeId.memorySegment(),
    		userData
    	);
    }
    
    /// ```
    /// Get the user data for a shape. This is useful when you get a shape id
    /// from an event or query.
    /// ```
    public static MemorySegment getUserData(
    	MemorySegment shapeId
    ) {
    	MethodHandle method = B3_SHAPE_GET_USER_DATA.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			shapeId
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getUserData].
    public static @Nullable MemorySegment getUserData(
    	ShapeId shapeId
    ) {
    	MemorySegment segment = getUserData(
    		shapeId.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// ```
    /// Set the mass density of a shape, usually in kg/m^3.
    /// This will optionally update the mass properties on the parent body.
    /// @see b3ShapeDef::density, b3Body_ApplyMassFromShapes
    /// ```
    public static void setDensity(
    	MemorySegment shapeId,
    	float density,
    	boolean updateBodyMass
    ) {
    	MethodHandle method = B3_SHAPE_SET_DENSITY.get();
    	try {
    		 method.invokeExact(
    			shapeId,
    			density,
    			updateBodyMass
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setDensity].
    public static void setDensity(
    	ShapeId shapeId,
    	float density,
    	boolean updateBodyMass
    ) {
    	setDensity(
    		shapeId.memorySegment(),
    		density,
    		updateBodyMass
    	);
    }
    
    /// ```
    /// Get the density of a shape, usually in kg/m^3
    /// ```
    public static float getDensity(
    	MemorySegment shapeId
    ) {
    	MethodHandle method = B3_SHAPE_GET_DENSITY.get();
    	try {
    		return (float) method.invokeExact(
    			shapeId
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getDensity].
    public static float getDensity(
    	ShapeId shapeId
    ) {
    	return getDensity(
    		shapeId.memorySegment()
    	);
    }
    
    /// ```
    /// Set the friction on a shape
    /// ```
    public static void setFriction(
    	MemorySegment shapeId,
    	float friction
    ) {
    	MethodHandle method = B3_SHAPE_SET_FRICTION.get();
    	try {
    		 method.invokeExact(
    			shapeId,
    			friction
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setFriction].
    public static void setFriction(
    	ShapeId shapeId,
    	float friction
    ) {
    	setFriction(
    		shapeId.memorySegment(),
    		friction
    	);
    }
    
    /// ```
    /// Get the friction of a shape
    /// ```
    public static float getFriction(
    	MemorySegment shapeId
    ) {
    	MethodHandle method = B3_SHAPE_GET_FRICTION.get();
    	try {
    		return (float) method.invokeExact(
    			shapeId
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getFriction].
    public static float getFriction(
    	ShapeId shapeId
    ) {
    	return getFriction(
    		shapeId.memorySegment()
    	);
    }
    
    /// ```
    /// Set the shape restitution (bounciness)
    /// ```
    public static void setRestitution(
    	MemorySegment shapeId,
    	float restitution
    ) {
    	MethodHandle method = B3_SHAPE_SET_RESTITUTION.get();
    	try {
    		 method.invokeExact(
    			shapeId,
    			restitution
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setRestitution].
    public static void setRestitution(
    	ShapeId shapeId,
    	float restitution
    ) {
    	setRestitution(
    		shapeId.memorySegment(),
    		restitution
    	);
    }
    
    /// ```
    /// Get the shape restitution
    /// ```
    public static float getRestitution(
    	MemorySegment shapeId
    ) {
    	MethodHandle method = B3_SHAPE_GET_RESTITUTION.get();
    	try {
    		return (float) method.invokeExact(
    			shapeId
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getRestitution].
    public static float getRestitution(
    	ShapeId shapeId
    ) {
    	return getRestitution(
    		shapeId.memorySegment()
    	);
    }
    
    /// ```
    /// Set the shape base surface material. Does not change per triangle materials.
    /// ```
    public static void setSurfaceMaterial(
    	MemorySegment shapeId,
    	MemorySegment surfaceMaterial
    ) {
    	MethodHandle method = B3_SHAPE_SET_SURFACE_MATERIAL.get();
    	try {
    		 method.invokeExact(
    			shapeId,
    			surfaceMaterial
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setSurfaceMaterial].
    public static void setSurfaceMaterial(
    	ShapeId shapeId,
    	SurfaceMaterial surfaceMaterial
    ) {
    	setSurfaceMaterial(
    		shapeId.memorySegment(),
    		surfaceMaterial.memorySegment()
    	);
    }
    
    /// ```
    /// Get the base shape surface material.
    /// ```
    public static MemorySegment getSurfaceMaterial(
    	SegmentAllocator allocator,
    	MemorySegment shapeId
    ) {
    	MethodHandle method = B3_SHAPE_GET_SURFACE_MATERIAL.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			shapeId
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getSurfaceMaterial].
    public static @Nullable SurfaceMaterial getSurfaceMaterial(
    	SegmentAllocator allocator,
    	ShapeId shapeId
    ) {
    	MemorySegment segment = getSurfaceMaterial(
    		allocator,
    		shapeId.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new SurfaceMaterial(segment);
    }
    
    /// ```
    /// Get the number of mesh surface materials.
    /// ```
    public static int getMeshMaterialCount(
    	MemorySegment shapeId
    ) {
    	MethodHandle method = B3_SHAPE_GET_MESH_MATERIAL_COUNT.get();
    	try {
    		return (int) method.invokeExact(
    			shapeId
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getMeshMaterialCount].
    public static int getMeshMaterialCount(
    	ShapeId shapeId
    ) {
    	return getMeshMaterialCount(
    		shapeId.memorySegment()
    	);
    }
    
    /// ```
    /// Set a surface material for a mesh shape.
    /// ```
    public static void setMeshMaterial(
    	MemorySegment shapeId,
    	MemorySegment surfaceMaterial,
    	int index
    ) {
    	MethodHandle method = B3_SHAPE_SET_MESH_MATERIAL.get();
    	try {
    		 method.invokeExact(
    			shapeId,
    			surfaceMaterial,
    			index
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setMeshMaterial].
    public static void setMeshMaterial(
    	ShapeId shapeId,
    	SurfaceMaterial surfaceMaterial,
    	int index
    ) {
    	setMeshMaterial(
    		shapeId.memorySegment(),
    		surfaceMaterial.memorySegment(),
    		index
    	);
    }
    
    /// ```
    /// Get a surface material for a mesh shape
    /// ```
    public static MemorySegment getMeshSurfaceMaterial(
    	SegmentAllocator allocator,
    	MemorySegment shapeId,
    	int index
    ) {
    	MethodHandle method = B3_SHAPE_GET_MESH_SURFACE_MATERIAL.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			shapeId,
    			index
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getMeshSurfaceMaterial].
    public static @Nullable SurfaceMaterial getMeshSurfaceMaterial(
    	SegmentAllocator allocator,
    	ShapeId shapeId,
    	int index
    ) {
    	MemorySegment segment = getMeshSurfaceMaterial(
    		allocator,
    		shapeId.memorySegment(),
    		index
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new SurfaceMaterial(segment);
    }
    
    /// ```
    /// Get the shape filter
    /// ```
    public static MemorySegment getFilter(
    	SegmentAllocator allocator,
    	MemorySegment shapeId
    ) {
    	MethodHandle method = B3_SHAPE_GET_FILTER.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			shapeId
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getFilter].
    public static @Nullable Filter getFilter(
    	SegmentAllocator allocator,
    	ShapeId shapeId
    ) {
    	MemorySegment segment = getFilter(
    		allocator,
    		shapeId.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new Filter(segment);
    }
    
    /// ```
    /// Set the current filter. This is almost as expensive as recreating the shape.
    /// @see b3ShapeDef::filter
    /// @param shapeId the shape
    /// @param filter the new filter
    /// @param invokeContacts if true then the shape will have all contacts recomputed the next time step (expensive)
    /// ```
    public static void setFilter(
    	MemorySegment shapeId,
    	MemorySegment filter,
    	boolean invokeContacts
    ) {
    	MethodHandle method = B3_SHAPE_SET_FILTER.get();
    	try {
    		 method.invokeExact(
    			shapeId,
    			filter,
    			invokeContacts
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setFilter].
    public static void setFilter(
    	ShapeId shapeId,
    	Filter filter,
    	boolean invokeContacts
    ) {
    	setFilter(
    		shapeId.memorySegment(),
    		filter.memorySegment(),
    		invokeContacts
    	);
    }
    
    /// ```
    /// Enable sensor events for this shape. Only applies to kinematic and dynamic bodies. Ignored for sensors.
    /// @see b3ShapeDef::isSensor
    /// ```
    public static void enableSensorEvents(
    	MemorySegment shapeId,
    	boolean flag
    ) {
    	MethodHandle method = B3_SHAPE_ENABLE_SENSOR_EVENTS.get();
    	try {
    		 method.invokeExact(
    			shapeId,
    			flag
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#enableSensorEvents].
    public static void enableSensorEvents(
    	ShapeId shapeId,
    	boolean flag
    ) {
    	enableSensorEvents(
    		shapeId.memorySegment(),
    		flag
    	);
    }
    
    /// ```
    /// Returns true if sensor events are enabled
    /// ```
    public static boolean areSensorEventsEnabled(
    	MemorySegment shapeId
    ) {
    	MethodHandle method = B3_SHAPE_ARE_SENSOR_EVENTS_ENABLED.get();
    	try {
    		return (boolean) method.invokeExact(
    			shapeId
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#areSensorEventsEnabled].
    public static boolean areSensorEventsEnabled(
    	ShapeId shapeId
    ) {
    	return areSensorEventsEnabled(
    		shapeId.memorySegment()
    	);
    }
    
    /// ```
    /// Enable contact events for this shape. Only applies to kinematic and dynamic bodies. Ignored for sensors.
    /// @see b3ShapeDef::enableContactEvents
    /// ```
    public static void enableContactEvents(
    	MemorySegment shapeId,
    	boolean flag
    ) {
    	MethodHandle method = B3_SHAPE_ENABLE_CONTACT_EVENTS.get();
    	try {
    		 method.invokeExact(
    			shapeId,
    			flag
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#enableContactEvents].
    public static void enableContactEvents(
    	ShapeId shapeId,
    	boolean flag
    ) {
    	enableContactEvents(
    		shapeId.memorySegment(),
    		flag
    	);
    }
    
    /// ```
    /// Returns true if contact events are enabled
    /// ```
    public static boolean areContactEventsEnabled(
    	MemorySegment shapeId
    ) {
    	MethodHandle method = B3_SHAPE_ARE_CONTACT_EVENTS_ENABLED.get();
    	try {
    		return (boolean) method.invokeExact(
    			shapeId
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#areContactEventsEnabled].
    public static boolean areContactEventsEnabled(
    	ShapeId shapeId
    ) {
    	return areContactEventsEnabled(
    		shapeId.memorySegment()
    	);
    }
    
    /// ```
    /// Enable pre-solve contact events for this shape. Only applies to dynamic bodies. These are expensive
    /// and must be carefully handled due to multithreading. Ignored for sensors.
    /// @see b3PreSolveFcn
    /// ```
    public static void enablePreSolveEvents(
    	MemorySegment shapeId,
    	boolean flag
    ) {
    	MethodHandle method = B3_SHAPE_ENABLE_PRE_SOLVE_EVENTS.get();
    	try {
    		 method.invokeExact(
    			shapeId,
    			flag
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#enablePreSolveEvents].
    public static void enablePreSolveEvents(
    	ShapeId shapeId,
    	boolean flag
    ) {
    	enablePreSolveEvents(
    		shapeId.memorySegment(),
    		flag
    	);
    }
    
    /// ```
    /// Returns true if pre-solve events are enabled
    /// ```
    public static boolean arePreSolveEventsEnabled(
    	MemorySegment shapeId
    ) {
    	MethodHandle method = B3_SHAPE_ARE_PRE_SOLVE_EVENTS_ENABLED.get();
    	try {
    		return (boolean) method.invokeExact(
    			shapeId
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#arePreSolveEventsEnabled].
    public static boolean arePreSolveEventsEnabled(
    	ShapeId shapeId
    ) {
    	return arePreSolveEventsEnabled(
    		shapeId.memorySegment()
    	);
    }
    
    /// ```
    /// Enable contact hit events for this shape. Ignored for sensors.
    /// @see b3WorldDef.hitEventThreshold
    /// ```
    public static void enableHitEvents(
    	MemorySegment shapeId,
    	boolean flag
    ) {
    	MethodHandle method = B3_SHAPE_ENABLE_HIT_EVENTS.get();
    	try {
    		 method.invokeExact(
    			shapeId,
    			flag
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#enableHitEvents].
    public static void enableHitEvents(
    	ShapeId shapeId,
    	boolean flag
    ) {
    	enableHitEvents(
    		shapeId.memorySegment(),
    		flag
    	);
    }
    
    /// ```
    /// Returns true if hit events are enabled
    /// ```
    public static boolean areHitEventsEnabled(
    	MemorySegment shapeId
    ) {
    	MethodHandle method = B3_SHAPE_ARE_HIT_EVENTS_ENABLED.get();
    	try {
    		return (boolean) method.invokeExact(
    			shapeId
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#areHitEventsEnabled].
    public static boolean areHitEventsEnabled(
    	ShapeId shapeId
    ) {
    	return areHitEventsEnabled(
    		shapeId.memorySegment()
    	);
    }
    
    /// ```
    /// Ray cast a shape directly. The ray runs from origin to origin + translation and the hit point
    /// comes back as a world position, so the cast stays precise far from the world origin.
    /// ```
    public static MemorySegment rayCast(
    	SegmentAllocator allocator,
    	MemorySegment shapeId,
    	MemorySegment origin,
    	MemorySegment translation
    ) {
    	MethodHandle method = B3_SHAPE_RAY_CAST.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			shapeId,
    			origin,
    			translation
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#rayCast].
    public static @Nullable CastOutput rayCast(
    	SegmentAllocator allocator,
    	ShapeId shapeId,
    	Vec3 origin,
    	Vec3 translation
    ) {
    	MemorySegment segment = rayCast(
    		allocator,
    		shapeId.memorySegment(),
    		origin.memorySegment(),
    		translation.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new CastOutput(segment);
    }
    
    /// ```
    /// Get a copy of the shape's sphere. Asserts the type is correct.
    /// ```
    public static MemorySegment getSphere(
    	SegmentAllocator allocator,
    	MemorySegment shapeId
    ) {
    	MethodHandle method = B3_SHAPE_GET_SPHERE.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			shapeId
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getSphere].
    public static @Nullable Sphere getSphere(
    	SegmentAllocator allocator,
    	ShapeId shapeId
    ) {
    	MemorySegment segment = getSphere(
    		allocator,
    		shapeId.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new Sphere(segment);
    }
    
    /// ```
    /// Get a copy of the shape's capsule. Asserts the type is correct.
    /// ```
    public static MemorySegment getCapsule(
    	SegmentAllocator allocator,
    	MemorySegment shapeId
    ) {
    	MethodHandle method = B3_SHAPE_GET_CAPSULE.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			shapeId
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getCapsule].
    public static @Nullable Capsule getCapsule(
    	SegmentAllocator allocator,
    	ShapeId shapeId
    ) {
    	MemorySegment segment = getCapsule(
    		allocator,
    		shapeId.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new Capsule(segment);
    }
    
    /// ```
    /// Get the shape's convex hull. Asserts the type is correct.
    /// ```
    public static MemorySegment getHull(
    	MemorySegment shapeId
    ) {
    	MethodHandle method = B3_SHAPE_GET_HULL.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			shapeId
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getHull].
    public static @Nullable HullData getHull(
    	ShapeId shapeId
    ) {
    	MemorySegment segment = getHull(
    		shapeId.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new HullData(segment);
    }
    
    /// ```
    /// Get the shape's mesh. Asserts the type is correct.
    /// ```
    public static MemorySegment getMesh(
    	SegmentAllocator allocator,
    	MemorySegment shapeId
    ) {
    	MethodHandle method = B3_SHAPE_GET_MESH.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			shapeId
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getMesh].
    public static @Nullable Mesh getMesh(
    	SegmentAllocator allocator,
    	ShapeId shapeId
    ) {
    	MemorySegment segment = getMesh(
    		allocator,
    		shapeId.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new Mesh(segment);
    }
    
    /// ```
    /// Get the shape's height field. Asserts the type is correct.
    /// ```
    public static MemorySegment getHeightField(
    	MemorySegment shapeId
    ) {
    	MethodHandle method = B3_SHAPE_GET_HEIGHT_FIELD.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			shapeId
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getHeightField].
    public static @Nullable HeightFieldData getHeightField(
    	ShapeId shapeId
    ) {
    	MemorySegment segment = getHeightField(
    		shapeId.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new HeightFieldData(segment);
    }
    
    /// ```
    /// Allows you to change a shape to be a sphere or update the current sphere.
    /// This does not modify the mass properties.
    /// @see b3Body_ApplyMassFromShapes
    /// ```
    public static void setSphere(
    	MemorySegment shapeId,
    	MemorySegment sphere
    ) {
    	MethodHandle method = B3_SHAPE_SET_SPHERE.get();
    	try {
    		 method.invokeExact(
    			shapeId,
    			sphere
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setSphere].
    public static void setSphere(
    	ShapeId shapeId,
    	Sphere sphere
    ) {
    	setSphere(
    		shapeId.memorySegment(),
    		sphere.memorySegment()
    	);
    }
    
    /// ```
    /// Allows you to change a shape to be a capsule or update the current capsule.
    /// This does not modify the mass properties.
    /// @see b3Body_ApplyMassFromShapes
    /// ```
    public static void setCapsule(
    	MemorySegment shapeId,
    	MemorySegment capsule
    ) {
    	MethodHandle method = B3_SHAPE_SET_CAPSULE.get();
    	try {
    		 method.invokeExact(
    			shapeId,
    			capsule
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setCapsule].
    public static void setCapsule(
    	ShapeId shapeId,
    	Capsule capsule
    ) {
    	setCapsule(
    		shapeId.memorySegment(),
    		capsule.memorySegment()
    	);
    }
    
    /// ```
    /// Allows you to change a shape to be a hull or update the current hull.
    /// This does not modify the mass properties.
    /// @see b3Body_ApplyMassFromShapes
    /// ```
    public static void setHull(
    	MemorySegment shapeId,
    	MemorySegment hull
    ) {
    	MethodHandle method = B3_SHAPE_SET_HULL.get();
    	try {
    		 method.invokeExact(
    			shapeId,
    			hull
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setHull].
    public static void setHull(
    	ShapeId shapeId,
    	HullData hull
    ) {
    	setHull(
    		shapeId.memorySegment(),
    		hull.memorySegment()
    	);
    }
    
    /// ```
    /// Allows you to change a shape to be a mesh or update the current mesh.
    /// This does not modify the mass properties.
    /// @see b3Body_ApplyMassFromShapes
    /// ```
    public static void setMesh(
    	MemorySegment shapeId,
    	MemorySegment meshData,
    	MemorySegment scale
    ) {
    	MethodHandle method = B3_SHAPE_SET_MESH.get();
    	try {
    		 method.invokeExact(
    			shapeId,
    			meshData,
    			scale
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setMesh].
    public static void setMesh(
    	ShapeId shapeId,
    	MeshData meshData,
    	Vec3 scale
    ) {
    	setMesh(
    		shapeId.memorySegment(),
    		meshData.memorySegment(),
    		scale.memorySegment()
    	);
    }
    
    /// ```
    /// Get the maximum capacity required for retrieving all the touching contacts on a shape
    /// ```
    public static int getContactCapacity(
    	MemorySegment shapeId
    ) {
    	MethodHandle method = B3_SHAPE_GET_CONTACT_CAPACITY.get();
    	try {
    		return (int) method.invokeExact(
    			shapeId
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getContactCapacity].
    public static int getContactCapacity(
    	ShapeId shapeId
    ) {
    	return getContactCapacity(
    		shapeId.memorySegment()
    	);
    }
    
    /// ```
    /// Get the touching contact data for a shape. The provided shapeId will be either shapeIdA or shapeIdB on the contact data.
    /// @note Box3D uses speculative collision so some contact points may be separated.
    /// @returns the number of elements filled in the provided array
    /// @warning do not ignore the return value, it specifies the valid number of elements
    /// ```
    public static int getContactData(
    	MemorySegment shapeId,
    	MemorySegment contactData,
    	int capacity
    ) {
    	MethodHandle method = B3_SHAPE_GET_CONTACT_DATA.get();
    	try {
    		return (int) method.invokeExact(
    			shapeId,
    			contactData,
    			capacity
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getContactData].
    public static int getContactData(
    	ShapeId shapeId,
    	ContactData contactData,
    	int capacity
    ) {
    	return getContactData(
    		shapeId.memorySegment(),
    		contactData.memorySegment(),
    		capacity
    	);
    }
    
    /// ```
    /// Get the maximum capacity required for retrieving all the overlapped shapes on a sensor shape.
    /// This returns 0 if the provided shape is not a sensor.
    /// @param shapeId the id of a sensor shape
    /// @returns the required capacity to get all the overlaps in b3Shape_GetSensorOverlaps
    /// ```
    public static int getSensorCapacity(
    	MemorySegment shapeId
    ) {
    	MethodHandle method = B3_SHAPE_GET_SENSOR_CAPACITY.get();
    	try {
    		return (int) method.invokeExact(
    			shapeId
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getSensorCapacity].
    public static int getSensorCapacity(
    	ShapeId shapeId
    ) {
    	return getSensorCapacity(
    		shapeId.memorySegment()
    	);
    }
    
    /// ```
    /// Get the overlap data for a sensor shape.
    /// @param shapeId the id of a sensor shape
    /// @param visitorIds a user allocated array that is filled with the overlapping shapes (visitors)
    /// @param capacity the capacity of overlappedShapes
    /// @returns the number of elements filled in the provided array
    /// @warning do not ignore the return value, it specifies the valid number of elements
    /// @warning overlaps may contain destroyed shapes so use b3Shape_IsValid to confirm each overlap
    /// ```
    public static int getSensorData(
    	MemorySegment shapeId,
    	MemorySegment visitorIds,
    	int capacity
    ) {
    	MethodHandle method = B3_SHAPE_GET_SENSOR_DATA.get();
    	try {
    		return (int) method.invokeExact(
    			shapeId,
    			visitorIds,
    			capacity
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getSensorData].
    public static int getSensorData(
    	ShapeId shapeId,
    	ShapeId visitorIds,
    	int capacity
    ) {
    	return getSensorData(
    		shapeId.memorySegment(),
    		visitorIds.memorySegment(),
    		capacity
    	);
    }
    
    /// ```
    /// Get the current world AABB
    /// ```
    public static MemorySegment getAABB(
    	SegmentAllocator allocator,
    	MemorySegment shapeId
    ) {
    	MethodHandle method = B3_SHAPE_GET_AABB.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			shapeId
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getAABB].
    public static @Nullable AABB getAABB(
    	SegmentAllocator allocator,
    	ShapeId shapeId
    ) {
    	MemorySegment segment = getAABB(
    		allocator,
    		shapeId.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new AABB(segment);
    }
    
    /// ```
    /// Compute the mass data for a shape
    /// ```
    public static MemorySegment computeMassData(
    	SegmentAllocator allocator,
    	MemorySegment shapeId
    ) {
    	MethodHandle method = B3_SHAPE_COMPUTE_MASS_DATA.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			shapeId
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#computeMassData].
    public static @Nullable MassData computeMassData(
    	SegmentAllocator allocator,
    	ShapeId shapeId
    ) {
    	MemorySegment segment = computeMassData(
    		allocator,
    		shapeId.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new MassData(segment);
    }
    
    /// ```
    /// Get the closest point on a shape to a target point. Target and result are in world space.
    /// ```
    public static MemorySegment getClosestPoint(
    	SegmentAllocator allocator,
    	MemorySegment shapeId,
    	MemorySegment target
    ) {
    	MethodHandle method = B3_SHAPE_GET_CLOSEST_POINT.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			shapeId,
    			target
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getClosestPoint].
    public static @Nullable Vec3 getClosestPoint(
    	SegmentAllocator allocator,
    	ShapeId shapeId,
    	Vec3 target
    ) {
    	MemorySegment segment = getClosestPoint(
    		allocator,
    		shapeId.memorySegment(),
    		target.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new Vec3(segment);
    }
    
    /// ```
    /// Apply a wind force to the body for this shape using the density of air. This considers
    /// the projected area of the shape in the wind direction. This also considers
    /// the relative velocity of the shape.
    /// @param shapeId the shape id
    /// @param wind the wind velocity in world space
    /// @param drag the drag coefficient, the force that opposes the relative velocity
    /// @param lift the lift coefficient, the force that is perpendicular to the relative velocity
    /// @param maxSpeed the maximum relative speed. Speed cap is necessary for stability. Typically 10m/s or less.
    /// @param wake should this wake the body
    /// ```
    public static void applyWind(
    	MemorySegment shapeId,
    	MemorySegment wind,
    	float drag,
    	float lift,
    	float maxSpeed,
    	boolean wake
    ) {
    	MethodHandle method = B3_SHAPE_APPLY_WIND.get();
    	try {
    		 method.invokeExact(
    			shapeId,
    			wind,
    			drag,
    			lift,
    			maxSpeed,
    			wake
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#applyWind].
    public static void applyWind(
    	ShapeId shapeId,
    	Vec3 wind,
    	float drag,
    	float lift,
    	float maxSpeed,
    	boolean wake
    ) {
    	applyWind(
    		shapeId.memorySegment(),
    		wind.memorySegment(),
    		drag,
    		lift,
    		maxSpeed,
    		wake
    	);
    }
    
}