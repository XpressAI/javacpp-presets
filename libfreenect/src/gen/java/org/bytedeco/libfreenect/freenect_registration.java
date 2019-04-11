// Targeted by JavaCPP version 1.5: DO NOT EDIT THIS FILE

package org.bytedeco.libfreenect;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.libfreenect.global.freenect.*;


/** all data needed for depth->RGB mapping */
@Properties(inherit = org.bytedeco.libfreenect.presets.freenect.class)
public class freenect_registration extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public freenect_registration() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public freenect_registration(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public freenect_registration(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public freenect_registration position(long position) {
        return (freenect_registration)super.position(position);
    }

	public native @ByRef freenect_reg_info reg_info(); public native freenect_registration reg_info(freenect_reg_info setter);
	public native @ByRef freenect_reg_pad_info reg_pad_info(); public native freenect_registration reg_pad_info(freenect_reg_pad_info setter);
	public native @ByRef freenect_zero_plane_info zero_plane_info(); public native freenect_registration zero_plane_info(freenect_zero_plane_info setter);

	public native double const_shift(); public native freenect_registration const_shift(double setter);

	public native @Cast("uint16_t*") ShortPointer raw_to_mm_shift(); public native freenect_registration raw_to_mm_shift(ShortPointer setter);
	public native IntPointer depth_to_rgb_shift(); public native freenect_registration depth_to_rgb_shift(IntPointer setter);
	public native int registration_table(int i, int j); public native freenect_registration registration_table(int i, int j, int setter);
	@MemberGetter public native @Cast("int32_t*") IntPointer registration_table();  // A table of 640*480 pairs of x,y values.
	                                   // Index first by pixel, then x:0 and y:1.
}