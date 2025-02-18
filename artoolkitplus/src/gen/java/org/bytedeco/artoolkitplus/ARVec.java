// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.artoolkitplus;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.artoolkitplus.global.ARToolKitPlus.*;


@Namespace("ARToolKitPlus") @Properties(inherit = org.bytedeco.artoolkitplus.presets.ARToolKitPlus.class)
public class ARVec extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public ARVec() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public ARVec(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ARVec(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public ARVec position(long position) {
        return (ARVec)super.position(position);
    }
    @Override public ARVec getPointer(long i) {
        return new ARVec((Pointer)this).offsetAddress(i);
    }

	public native @Cast("ARFloat*") FloatPointer v(); public native ARVec v(FloatPointer setter);
	public native int clm(); public native ARVec clm(int setter);
}
