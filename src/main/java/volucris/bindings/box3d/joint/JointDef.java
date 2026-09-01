/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.box3d.joint;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;
import java.util.function.Consumer;
import org.jspecify.annotations.Nullable;
import volucris.bindings.box3d.body.BodyId;
import volucris.bindings.box3d.math.Transform;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

/// ```
/// Base joint definition used by all joint types. The local frames are measured from the
/// body's origin rather than the center of mass because:
/// 1. You might not know where the center of mass will be.
/// 2. If you add/remove shapes from a body and recompute the mass, the joints will be broken.
/// @ingroup joint
/// ```
public final class JointDef
		implements Struct<JointDef> {

    public static final StructLayout LAYOUT;

    public static final VarHandle USER_DATA_HANDLE;
    public static final VarHandle FORCE_THRESHOLD_HANDLE;
    public static final VarHandle TORQUE_THRESHOLD_HANDLE;
    public static final VarHandle CONSTRAINT_HERTZ_HANDLE;
    public static final VarHandle CONSTRAINT_DAMPING_RATIO_HANDLE;
    public static final VarHandle DRAW_SCALE_HANDLE;
    public static final VarHandle COLLIDE_CONNECTED_HANDLE;
    public static final VarHandle INTERNAL_VALUE_HANDLE;

    public static final long USER_DATA_BYTE_OFFSET;
    public static final long BODY_ID_A_BYTE_OFFSET;
    public static final long BODY_ID_B_BYTE_OFFSET;
    public static final long LOCAL_FRAME_A_BYTE_OFFSET;
    public static final long LOCAL_FRAME_B_BYTE_OFFSET;
    public static final long FORCE_THRESHOLD_BYTE_OFFSET;
    public static final long TORQUE_THRESHOLD_BYTE_OFFSET;
    public static final long CONSTRAINT_HERTZ_BYTE_OFFSET;
    public static final long CONSTRAINT_DAMPING_RATIO_BYTE_OFFSET;
    public static final long DRAW_SCALE_BYTE_OFFSET;
    public static final long COLLIDE_CONNECTED_BYTE_OFFSET;
    public static final long INTERNAL_VALUE_BYTE_OFFSET;

    private final MemorySegment segment;

    private final BodyId bodyIdA;
    private final BodyId bodyIdB;
    private final Transform localFrameA;
    private final Transform localFrameB;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            UNBOUNDED_ADDRESS.withName("userData"),
            BodyId.LAYOUT.withName("bodyIdA"),
            BodyId.LAYOUT.withName("bodyIdB"),
            Transform.LAYOUT.withName("localFrameA"),
            Transform.LAYOUT.withName("localFrameB"),
            JAVA_FLOAT.withName("forceThreshold"),
            JAVA_FLOAT.withName("torqueThreshold"),
            JAVA_FLOAT.withName("constraintHertz"),
            JAVA_FLOAT.withName("constraintDampingRatio"),
            JAVA_FLOAT.withName("drawScale"),
            JAVA_BOOLEAN.withName("collideConnected"),
            MemoryLayout.paddingLayout(3),
            JAVA_INT.withName("internalValue"),
            MemoryLayout.paddingLayout(4)
        ).withName("b3JointDef").withByteAlignment(8);
        
        USER_DATA_HANDLE = LAYOUT.varHandle(PathElement.groupElement("userData"));
        FORCE_THRESHOLD_HANDLE = LAYOUT.varHandle(PathElement.groupElement("forceThreshold"));
        TORQUE_THRESHOLD_HANDLE = LAYOUT.varHandle(PathElement.groupElement("torqueThreshold"));
        CONSTRAINT_HERTZ_HANDLE = LAYOUT.varHandle(PathElement.groupElement("constraintHertz"));
        CONSTRAINT_DAMPING_RATIO_HANDLE = LAYOUT.varHandle(PathElement.groupElement("constraintDampingRatio"));
        DRAW_SCALE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("drawScale"));
        COLLIDE_CONNECTED_HANDLE = LAYOUT.varHandle(PathElement.groupElement("collideConnected"));
        INTERNAL_VALUE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("internalValue"));
        
        USER_DATA_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("userData"));
        BODY_ID_A_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("bodyIdA"));
        BODY_ID_B_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("bodyIdB"));
        LOCAL_FRAME_A_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("localFrameA"));
        LOCAL_FRAME_B_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("localFrameB"));
        FORCE_THRESHOLD_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("forceThreshold"));
        TORQUE_THRESHOLD_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("torqueThreshold"));
        CONSTRAINT_HERTZ_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("constraintHertz"));
        CONSTRAINT_DAMPING_RATIO_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("constraintDampingRatio"));
        DRAW_SCALE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("drawScale"));
        COLLIDE_CONNECTED_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("collideConnected"));
        INTERNAL_VALUE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("internalValue"));
        //@formatter:on
    }

    public JointDef() {
        this(Arena.ofAuto());
    }
    
    public JointDef(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public JointDef(MemorySegment segment) {
        this.segment = segment;
    
        bodyIdA = new BodyId(segment.asSlice(BODY_ID_A_BYTE_OFFSET, BodyId.LAYOUT));
        bodyIdB = new BodyId(segment.asSlice(BODY_ID_B_BYTE_OFFSET, BodyId.LAYOUT));
        localFrameA = new Transform(segment.asSlice(LOCAL_FRAME_A_BYTE_OFFSET, Transform.LAYOUT));
        localFrameB = new Transform(segment.asSlice(LOCAL_FRAME_B_BYTE_OFFSET, Transform.LAYOUT));
    }

    /// @see #userData()
    public JointDef userData(MemorySegment userData) {
    	USER_DATA_HANDLE.set(segment, 0L, userData);
    	return this;
    }
    
    /// ```
    /// User data pointer
    /// ```
    public @Nullable MemorySegment userData() {
    	MemorySegment segment = (MemorySegment) USER_DATA_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #forceThreshold()
    public JointDef forceThreshold(float forceThreshold) {
    	FORCE_THRESHOLD_HANDLE.set(segment, 0L, forceThreshold);
    	return this;
    }
    
    /// ```
    /// Force threshold for joint events
    /// ```
    public float forceThreshold() {
    	return (float) FORCE_THRESHOLD_HANDLE.get(segment, 0L);
    }
    
    /// @see #torqueThreshold()
    public JointDef torqueThreshold(float torqueThreshold) {
    	TORQUE_THRESHOLD_HANDLE.set(segment, 0L, torqueThreshold);
    	return this;
    }
    
    /// ```
    /// Torque threshold for joint events
    /// ```
    public float torqueThreshold() {
    	return (float) TORQUE_THRESHOLD_HANDLE.get(segment, 0L);
    }
    
    /// @see #constraintHertz()
    public JointDef constraintHertz(float constraintHertz) {
    	CONSTRAINT_HERTZ_HANDLE.set(segment, 0L, constraintHertz);
    	return this;
    }
    
    /// ```
    /// Constraint hertz (advanced feature)
    /// ```
    public float constraintHertz() {
    	return (float) CONSTRAINT_HERTZ_HANDLE.get(segment, 0L);
    }
    
    /// @see #constraintDampingRatio()
    public JointDef constraintDampingRatio(float constraintDampingRatio) {
    	CONSTRAINT_DAMPING_RATIO_HANDLE.set(segment, 0L, constraintDampingRatio);
    	return this;
    }
    
    /// ```
    /// Constraint damping ratio (advanced feature)
    /// ```
    public float constraintDampingRatio() {
    	return (float) CONSTRAINT_DAMPING_RATIO_HANDLE.get(segment, 0L);
    }
    
    /// @see #drawScale()
    public JointDef drawScale(float drawScale) {
    	DRAW_SCALE_HANDLE.set(segment, 0L, drawScale);
    	return this;
    }
    
    /// ```
    /// Debug draw scale
    /// ```
    public float drawScale() {
    	return (float) DRAW_SCALE_HANDLE.get(segment, 0L);
    }
    
    /// @see #collideConnected()
    public JointDef collideConnected(boolean collideConnected) {
    	COLLIDE_CONNECTED_HANDLE.set(segment, 0L, collideConnected);
    	return this;
    }
    
    /// ```
    /// Set this flag to true if the attached bodies should collide
    /// ```
    public boolean collideConnected() {
    	return (boolean) COLLIDE_CONNECTED_HANDLE.get(segment, 0L);
    }
    
    /// @see #internalValue()
    public JointDef internalValue(int internalValue) {
    	INTERNAL_VALUE_HANDLE.set(segment, 0L, internalValue);
    	return this;
    }
    
    /// ```
    /// Used internally to detect a valid definition. DO NOT SET.
    /// ```
    public int internalValue() {
    	return (int) INTERNAL_VALUE_HANDLE.get(segment, 0L);
    }
    
    /// @see #bodyIdA()
    public JointDef bodyIdA(Consumer<BodyId> consumer) {
    	consumer.accept(bodyIdA);
    	return this;
    }
    
    /// @see #bodyIdA()
    public JointDef bodyIdA(BodyId other) {
    	bodyIdA.set(other);
    	return this;
    }
    
    /// ```
    /// The first attached body
    /// ```
    public BodyId bodyIdA() {
    	return bodyIdA;
    }
    
    /// @see #bodyIdB()
    public JointDef bodyIdB(Consumer<BodyId> consumer) {
    	consumer.accept(bodyIdB);
    	return this;
    }
    
    /// @see #bodyIdB()
    public JointDef bodyIdB(BodyId other) {
    	bodyIdB.set(other);
    	return this;
    }
    
    /// ```
    /// The second attached body
    /// ```
    public BodyId bodyIdB() {
    	return bodyIdB;
    }
    
    /// @see #localFrameA()
    public JointDef localFrameA(Consumer<Transform> consumer) {
    	consumer.accept(localFrameA);
    	return this;
    }
    
    /// @see #localFrameA()
    public JointDef localFrameA(Transform other) {
    	localFrameA.set(other);
    	return this;
    }
    
    /// ```
    /// The first local joint frame
    /// ```
    public Transform localFrameA() {
    	return localFrameA;
    }
    
    /// @see #localFrameB()
    public JointDef localFrameB(Consumer<Transform> consumer) {
    	consumer.accept(localFrameB);
    	return this;
    }
    
    /// @see #localFrameB()
    public JointDef localFrameB(Transform other) {
    	localFrameB.set(other);
    	return this;
    }
    
    /// ```
    /// The second local joint frame
    /// ```
    public Transform localFrameB() {
    	return localFrameB;
    }
    
    @Override
    public JointDef set(JointDef other) {
        return set(other.segment);
    }
    
    @Override
    public JointDef set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<JointDef> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<JointDef> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new JointDef(segment),
            count
        );
    }
    
    public static NativeStructArray<JointDef> array(Arena arena, JointDef... structs) {
        NativeStructArray<JointDef> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new JointDef(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<JointDef> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new JointDef(segment)
        );
    }
    
}