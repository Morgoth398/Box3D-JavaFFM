/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.box3d;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.invoke.MethodHandle;
import org.jspecify.annotations.Nullable;
import volucris.bindings.box3d.events.ContactData;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class Contact {

    private static final LazyConstant<MethodHandle> B3_CONTACT_IS_VALID;
    private static final LazyConstant<MethodHandle> B3_CONTACT_GET_DATA;

    private final MemorySegment segment;

    static {
        //@formatter:off
        B3_CONTACT_IS_VALID = downcallHandle("b3Contact_IsValid", JAVA_BOOLEAN, ContactId.LAYOUT);
        B3_CONTACT_GET_DATA = downcallHandle("b3Contact_GetData", ContactData.LAYOUT, ContactId.LAYOUT);
        //@formatter:on
    }

    public Contact(MemorySegment segment) {
    	this.segment = segment;
    }

    /// ```
    /// Contact identifier validation. Provides validation for up to 2^32 allocations.
    /// ```
    public static boolean isValid(
    	MemorySegment id
    ) {
    	MethodHandle method = B3_CONTACT_IS_VALID.get();
    	try {
    		return (boolean) method.invokeExact(
    			id
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#isValid].
    public final boolean isValid(
    	ContactId id
    ) {
    	return isValid(
    		id.memorySegment()
    	);
    }
    
    /// ```
    /// Get the manifolds for a contact. The manifold may have no points if the contact is not touching.
    /// ```
    public static MemorySegment getData(
    	SegmentAllocator allocator,
    	MemorySegment contactId
    ) {
    	MethodHandle method = B3_CONTACT_GET_DATA.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			contactId
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getData].
    public final @Nullable ContactData getData(
    	SegmentAllocator allocator,
    	ContactId contactId
    ) {
    	MemorySegment segment = getData(
    		allocator,
    		contactId.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new ContactData(segment);
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }
    
}