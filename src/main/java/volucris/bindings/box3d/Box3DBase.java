/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.box3d;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.invoke.MethodHandle;
import org.jspecify.annotations.Nullable;
import volucris.bindings.core.MemoryStack;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class Box3DBase {

    private static final LazyConstant<MethodHandle> B3_SET_ALLOCATOR;
    private static final LazyConstant<MethodHandle> B3_GET_BYTE_COUNT;
    private static final LazyConstant<MethodHandle> B3_SET_ASSERT_FCN;
    private static final LazyConstant<MethodHandle> B3_INTERNAL_ASSERT;
    private static final LazyConstant<MethodHandle> B3_SET_LOG_FCN;
    private static final LazyConstant<MethodHandle> B3_GET_VERSION;
    private static final LazyConstant<MethodHandle> B3_IS_DOUBLE_PRECISION;

    static {
        //@formatter:off
        B3_SET_ALLOCATOR = downcallHandleVoid("b3SetAllocator", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        B3_GET_BYTE_COUNT = downcallHandle("b3GetByteCount", JAVA_INT);
        B3_SET_ASSERT_FCN = downcallHandleVoid("b3SetAssertFcn", UNBOUNDED_ADDRESS);
        B3_INTERNAL_ASSERT = downcallHandle("b3InternalAssert", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT);
        B3_SET_LOG_FCN = downcallHandleVoid("b3SetLogFcn", UNBOUNDED_ADDRESS);
        B3_GET_VERSION = downcallHandle("b3GetVersion", Version.LAYOUT);
        B3_IS_DOUBLE_PRECISION = downcallHandle("b3IsDoublePrecision", JAVA_BOOLEAN);
        //@formatter:on
    }

    private Box3DBase() {
    }

    /// ```
    /// This allows the user to override the allocation functions. These should be
    /// set during application startup.
    /// ```
    public static void setAllocator(
    	MemorySegment allocFcn,
    	MemorySegment freeFcn
    ) {
    	MethodHandle method = B3_SET_ALLOCATOR.get();
    	try {
    		 method.invokeExact(
    			allocFcn,
    			freeFcn
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setAllocator].
    public static void setAllocator(
    	AllocFcn allocFcn,
    	FreeFcn freeFcn
    ) {
    	setAllocator(
    		allocFcn.memorySegment(),
    		freeFcn.memorySegment()
    	);
    }
    
    /// ```
    /// Total bytes allocated by Box3D
    /// ```
    public static int getByteCount() {
    	MethodHandle method = B3_GET_BYTE_COUNT.get();
    	try {
    		return (int) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Override the default assert callback.
    /// @param assertFcn a non-null assert callback
    /// ```
    public static void setAssertFcn(
    	MemorySegment assertFcn
    ) {
    	MethodHandle method = B3_SET_ASSERT_FCN.get();
    	try {
    		 method.invokeExact(
    			assertFcn
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setAssertFcn].
    public static void setAssertFcn(
    	AssertFcn assertFcn
    ) {
    	setAssertFcn(
    		assertFcn.memorySegment()
    	);
    }
    
    /// ```
    /// Internal assertion handler. Allows for host intervention.
    /// ```
    public static int internalAssert(
    	MemorySegment condition,
    	MemorySegment fileName,
    	int lineNumber
    ) {
    	MethodHandle method = B3_INTERNAL_ASSERT.get();
    	try {
    		return (int) method.invokeExact(
    			condition,
    			fileName,
    			lineNumber
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#internalAssert].
    public static int internalAssert(
    	String condition,
    	String fileName,
    	int lineNumber
    ) {
    	try (Arena arena = MemoryStack.stackPush()) {
    		return internalAssert(
    			arena.allocateFrom(condition),
    			arena.allocateFrom(fileName),
    			lineNumber
    		);
    	}
    }
    
    /// ```
    /// Override the default logging callback.
    /// ```
    public static void setLogFcn(
    	MemorySegment logFcn
    ) {
    	MethodHandle method = B3_SET_LOG_FCN.get();
    	try {
    		 method.invokeExact(
    			logFcn
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setLogFcn].
    public static void setLogFcn(
    	LogFcn logFcn
    ) {
    	setLogFcn(
    		logFcn.memorySegment()
    	);
    }
    
    /// ```
    /// Get the current version of Box3D
    /// ```
    public static MemorySegment ngetVersion(
    	SegmentAllocator allocator
    ) {
    	MethodHandle method = B3_GET_VERSION.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ngetVersion].
    public static @Nullable Version getVersion(
    	SegmentAllocator allocator
    ) {
    	MemorySegment segment = ngetVersion(
    		allocator
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new Version(segment);
    }
    
    /// ```
    /// @return true if the library was built with BOX3D_DOUBLE_PRECISION (large world mode)
    /// ```
    public static boolean isDoublePrecision() {
    	MethodHandle method = B3_IS_DOUBLE_PRECISION.get();
    	try {
    		return (boolean) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
}