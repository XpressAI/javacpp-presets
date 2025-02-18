// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.mkldnn;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.mkldnn.global.mklml.*;

import static org.bytedeco.mkldnn.global.mkldnn.*;


/** Description of tensor of weights for winograd 2x3 convolution. */
@Properties(inherit = org.bytedeco.mkldnn.presets.mkldnn.class)
public class mkldnn_wino_desc_t extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public mkldnn_wino_desc_t() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public mkldnn_wino_desc_t(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public mkldnn_wino_desc_t(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public mkldnn_wino_desc_t position(long position) {
        return (mkldnn_wino_desc_t)super.position(position);
    }
    @Override public mkldnn_wino_desc_t getPointer(long i) {
        return new mkldnn_wino_desc_t((Pointer)this).offsetAddress(i);
    }

    public native @Cast("mkldnn_wino_memory_format_t") int wino_format(); public native mkldnn_wino_desc_t wino_format(int setter);
    public native int r(); public native mkldnn_wino_desc_t r(int setter);
    public native int alpha(); public native mkldnn_wino_desc_t alpha(int setter);
    public native int ic(); public native mkldnn_wino_desc_t ic(int setter);
    public native int oc(); public native mkldnn_wino_desc_t oc(int setter);
    public native int ic_block(); public native mkldnn_wino_desc_t ic_block(int setter);
    public native int oc_block(); public native mkldnn_wino_desc_t oc_block(int setter);
    public native int ic2_block(); public native mkldnn_wino_desc_t ic2_block(int setter);
    public native int oc2_block(); public native mkldnn_wino_desc_t oc2_block(int setter);
    public native float adj_scale(); public native mkldnn_wino_desc_t adj_scale(float setter);
    public native @Cast("size_t") long size(); public native mkldnn_wino_desc_t size(long setter);
}
