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
import volucris.bindings.box3d.math.Plane;
import volucris.bindings.box3d.math.Vec3;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;

/// ```
/// Efficient box hull
/// ```
public final class BoxHull
		implements Struct<BoxHull> {

    public static final StructLayout LAYOUT;

    public static final VarHandle PADDING_HANDLE;

    public static final long BASE_BYTE_OFFSET;
    public static final long BOX_VERTICES_BYTE_OFFSET;
    public static final long BOX_POINTS_BYTE_OFFSET;
    public static final long BOX_EDGES_BYTE_OFFSET;
    public static final long BOX_FACES_BYTE_OFFSET;
    public static final long PADDING_BYTE_OFFSET;
    public static final long BOX_PLANES_BYTE_OFFSET;

    private final MemorySegment segment;

    private final HullData base;
    private final HullVertex[] boxVertices;
    private final Vec3[] boxPoints;
    private final HullHalfEdge[] boxEdges;
    private final HullFace[] boxFaces;
    private final Plane[] boxPlanes;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            HullData.LAYOUT.withName("base"),
            MemoryLayout.sequenceLayout(8, HullVertex.LAYOUT).withName("boxVertices"),
            MemoryLayout.sequenceLayout(8, Vec3.LAYOUT).withName("boxPoints"),
            MemoryLayout.sequenceLayout(24, HullHalfEdge.LAYOUT).withName("boxEdges"),
            MemoryLayout.sequenceLayout(6, HullFace.LAYOUT).withName("boxFaces"),
            MemoryLayout.sequenceLayout(2, JAVA_BYTE).withName("padding"),
            MemoryLayout.sequenceLayout(6, Plane.LAYOUT).withName("boxPlanes")
        ).withName("b3BoxHull").withByteAlignment(8);
        
        PADDING_HANDLE = LAYOUT.varHandle(PathElement.groupElement("padding"), PathElement.sequenceElement());
        
        BASE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("base"));
        BOX_VERTICES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("boxVertices"));
        BOX_POINTS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("boxPoints"));
        BOX_EDGES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("boxEdges"));
        BOX_FACES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("boxFaces"));
        PADDING_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("padding"));
        BOX_PLANES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("boxPlanes"));
        //@formatter:on
    }

    public BoxHull() {
        this(Arena.ofAuto());
    }
    
    public BoxHull(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public BoxHull(MemorySegment segment) {
        this.segment = segment;
    
        base = new HullData(segment.asSlice(BASE_BYTE_OFFSET, HullData.LAYOUT));
        boxVertices = new HullVertex[8];
        for (int i = 0; i < 8; i++) {
            long offset = BOX_VERTICES_BYTE_OFFSET + i * HullVertex.LAYOUT.byteSize();
            boxVertices[i] = new HullVertex(segment.asSlice(offset, HullVertex.LAYOUT));
        }
    
        boxPoints = new Vec3[8];
        for (int i = 0; i < 8; i++) {
            long offset = BOX_POINTS_BYTE_OFFSET + i * Vec3.LAYOUT.byteSize();
            boxPoints[i] = new Vec3(segment.asSlice(offset, Vec3.LAYOUT));
        }
    
        boxEdges = new HullHalfEdge[24];
        for (int i = 0; i < 24; i++) {
            long offset = BOX_EDGES_BYTE_OFFSET + i * HullHalfEdge.LAYOUT.byteSize();
            boxEdges[i] = new HullHalfEdge(segment.asSlice(offset, HullHalfEdge.LAYOUT));
        }
    
        boxFaces = new HullFace[6];
        for (int i = 0; i < 6; i++) {
            long offset = BOX_FACES_BYTE_OFFSET + i * HullFace.LAYOUT.byteSize();
            boxFaces[i] = new HullFace(segment.asSlice(offset, HullFace.LAYOUT));
        }
    
        boxPlanes = new Plane[6];
        for (int i = 0; i < 6; i++) {
            long offset = BOX_PLANES_BYTE_OFFSET + i * Plane.LAYOUT.byteSize();
            boxPlanes[i] = new Plane(segment.asSlice(offset, Plane.LAYOUT));
        }
    
    }

    /// @see #padding(int)
    public BoxHull padding(byte padding, int index0) {
    	PADDING_HANDLE.set(segment, 0L, index0, padding);
    	return this;
    }
    
    /// ```
    /// Explicit padding, see b3HullData::padding.
    /// ```
    public byte padding(int index0) {
    	return (byte) PADDING_HANDLE.get(segment, 0L, index0);
    }
    
    /// @see #base()
    public BoxHull base(Consumer<HullData> consumer) {
    	consumer.accept(base);
    	return this;
    }
    
    /// @see #base()
    public BoxHull base(HullData other) {
    	base.set(other);
    	return this;
    }
    
    /// ```
    /// The embedded hull. So the offsets index into the arrays that follow.
    /// ```
    public HullData base() {
    	return base;
    }
    
    /// @see #boxVertices(int)
    public BoxHull boxVertices(Consumer<HullVertex> consumer, int index) {
    	consumer.accept(boxVertices[index]);
    	return this;
    }
    
    /// @see #boxVertices(int)
    public BoxHull boxVertices(HullVertex other, int index) {
    	boxVertices[index].set(other);
    	return this;
    }
    
    /// ```
    /// Box vertices.
    /// ```
    public HullVertex boxVertices(int index) {
    	return boxVertices[index];
    }
    
    /// @see #boxPoints(int)
    public BoxHull boxPoints(Consumer<Vec3> consumer, int index) {
    	consumer.accept(boxPoints[index]);
    	return this;
    }
    
    /// @see #boxPoints(int)
    public BoxHull boxPoints(Vec3 other, int index) {
    	boxPoints[index].set(other);
    	return this;
    }
    
    /// ```
    /// Box points.
    /// ```
    public Vec3 boxPoints(int index) {
    	return boxPoints[index];
    }
    
    /// @see #boxEdges(int)
    public BoxHull boxEdges(Consumer<HullHalfEdge> consumer, int index) {
    	consumer.accept(boxEdges[index]);
    	return this;
    }
    
    /// @see #boxEdges(int)
    public BoxHull boxEdges(HullHalfEdge other, int index) {
    	boxEdges[index].set(other);
    	return this;
    }
    
    /// ```
    /// Box half-edges.
    /// ```
    public HullHalfEdge boxEdges(int index) {
    	return boxEdges[index];
    }
    
    /// @see #boxFaces(int)
    public BoxHull boxFaces(Consumer<HullFace> consumer, int index) {
    	consumer.accept(boxFaces[index]);
    	return this;
    }
    
    /// @see #boxFaces(int)
    public BoxHull boxFaces(HullFace other, int index) {
    	boxFaces[index].set(other);
    	return this;
    }
    
    /// ```
    /// Box faces.
    /// ```
    public HullFace boxFaces(int index) {
    	return boxFaces[index];
    }
    
    /// @see #boxPlanes(int)
    public BoxHull boxPlanes(Consumer<Plane> consumer, int index) {
    	consumer.accept(boxPlanes[index]);
    	return this;
    }
    
    /// @see #boxPlanes(int)
    public BoxHull boxPlanes(Plane other, int index) {
    	boxPlanes[index].set(other);
    	return this;
    }
    
    /// ```
    /// Box face planes.
    /// ```
    public Plane boxPlanes(int index) {
    	return boxPlanes[index];
    }
    
    @Override
    public BoxHull set(BoxHull other) {
        return set(other.segment);
    }
    
    @Override
    public BoxHull set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<BoxHull> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<BoxHull> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new BoxHull(segment),
            count
        );
    }
    
    public static NativeStructArray<BoxHull> array(Arena arena, BoxHull... structs) {
        NativeStructArray<BoxHull> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new BoxHull(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<BoxHull> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new BoxHull(segment)
        );
    }
    
}