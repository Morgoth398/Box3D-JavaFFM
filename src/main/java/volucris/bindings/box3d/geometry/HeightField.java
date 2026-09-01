/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.box3d.geometry;

import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import org.jspecify.annotations.Nullable;
import volucris.bindings.box3d.math.Vec3;
import volucris.bindings.core.NativeByteArray;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class HeightField {

    private static final LazyConstant<MethodHandle> B3_CREATE_HEIGHT_FIELD;
    private static final LazyConstant<MethodHandle> B3_CREATE_GRID;
    private static final LazyConstant<MethodHandle> B3_CREATE_WAVE;
    private static final LazyConstant<MethodHandle> B3_DESTROY_HEIGHT_FIELD;
    private static final LazyConstant<MethodHandle> B3_DUMP_HEIGHT_DATA;
    private static final LazyConstant<MethodHandle> B3_LOAD_HEIGHT_FIELD;

    static {
        //@formatter:off
        B3_CREATE_HEIGHT_FIELD = downcallHandle("b3CreateHeightField", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        B3_CREATE_GRID = downcallHandle("b3CreateGrid", UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT, Vec3.LAYOUT, JAVA_BOOLEAN);
        B3_CREATE_WAVE = downcallHandle("b3CreateWave", UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT, Vec3.LAYOUT, JAVA_FLOAT, JAVA_FLOAT, JAVA_BOOLEAN);
        B3_DESTROY_HEIGHT_FIELD = downcallHandleVoid("b3DestroyHeightField", UNBOUNDED_ADDRESS);
        B3_DUMP_HEIGHT_DATA = downcallHandleVoid("b3DumpHeightData", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        B3_LOAD_HEIGHT_FIELD = downcallHandle("b3LoadHeightField", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        //@formatter:on
    }

    private HeightField() {
    }

    /// ```
    /// Create a generic height field.
    /// ```
    public static MemorySegment createHeightField(
    	MemorySegment data
    ) {
    	MethodHandle method = B3_CREATE_HEIGHT_FIELD.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			data
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#createHeightField].
    public static @Nullable HeightFieldData createHeightField(
    	HeightFieldDef data
    ) {
    	MemorySegment segment = createHeightField(
    		data.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new HeightFieldData(segment);
    }
    
    /// ```
    /// Create a grid as a height field.
    /// ```
    public static MemorySegment createGrid(
    	int rowCount,
    	int columnCount,
    	MemorySegment scale,
    	boolean makeHoles
    ) {
    	MethodHandle method = B3_CREATE_GRID.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			rowCount,
    			columnCount,
    			scale,
    			makeHoles
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#createGrid].
    public static @Nullable HeightFieldData createGrid(
    	int rowCount,
    	int columnCount,
    	Vec3 scale,
    	boolean makeHoles
    ) {
    	MemorySegment segment = createGrid(
    		rowCount,
    		columnCount,
    		scale.memorySegment(),
    		makeHoles
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new HeightFieldData(segment);
    }
    
    /// ```
    /// Create a wave grid as a height field.
    /// ```
    public static MemorySegment createWave(
    	int rowCount,
    	int columnCount,
    	MemorySegment scale,
    	float rowFrequency,
    	float columnFrequency,
    	boolean makeHoles
    ) {
    	MethodHandle method = B3_CREATE_WAVE.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			rowCount,
    			columnCount,
    			scale,
    			rowFrequency,
    			columnFrequency,
    			makeHoles
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#createWave].
    public static @Nullable HeightFieldData createWave(
    	int rowCount,
    	int columnCount,
    	Vec3 scale,
    	float rowFrequency,
    	float columnFrequency,
    	boolean makeHoles
    ) {
    	MemorySegment segment = createWave(
    		rowCount,
    		columnCount,
    		scale.memorySegment(),
    		rowFrequency,
    		columnFrequency,
    		makeHoles
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new HeightFieldData(segment);
    }
    
    /// ```
    /// Destroy a height field.
    /// ```
    public static void destroyHeightField(
    	MemorySegment heightField
    ) {
    	MethodHandle method = B3_DESTROY_HEIGHT_FIELD.get();
    	try {
    		 method.invokeExact(
    			heightField
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#destroyHeightField].
    public static void destroyHeightField(
    	HeightFieldData heightField
    ) {
    	destroyHeightField(
    		heightField.memorySegment()
    	);
    }
    
    /// ```
    /// Save input height data to a file
    /// ```
    public static void dumpHeightData(
    	MemorySegment data,
    	MemorySegment fileName
    ) {
    	MethodHandle method = B3_DUMP_HEIGHT_DATA.get();
    	try {
    		 method.invokeExact(
    			data,
    			fileName
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#dumpHeightData].
    public static void dumpHeightData(
    	HeightFieldDef data,
    	NativeByteArray fileName
    ) {
    	dumpHeightData(
    		data.memorySegment(),
    		fileName.memorySegment()
    	);
    }
    
    /// ```
    /// Create a height field by loading a previously saved height data
    /// ```
    public static MemorySegment loadHeightField(
    	MemorySegment fileName
    ) {
    	MethodHandle method = B3_LOAD_HEIGHT_FIELD.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			fileName
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#loadHeightField].
    public static @Nullable HeightFieldData loadHeightField(
    	NativeByteArray fileName
    ) {
    	MemorySegment segment = loadHeightField(
    		fileName.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new HeightFieldData(segment);
    }
    
}