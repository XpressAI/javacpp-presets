// Targeted by JavaCPP version 1.5.8-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.cpu_features;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.cpu_features.global.cpu_features.*;

// #endif

@Namespace("cpu_features") @Properties(inherit = org.bytedeco.cpu_features.presets.cpu_features.class)
public class HardwareCapabilities extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public HardwareCapabilities() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public HardwareCapabilities(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public HardwareCapabilities(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public HardwareCapabilities position(long position) {
        return (HardwareCapabilities)super.position(position);
    }
    @Override public HardwareCapabilities getPointer(long i) {
        return new HardwareCapabilities((Pointer)this).offsetAddress(i);
    }

  public native @Cast("unsigned long") long hwcaps(); public native HardwareCapabilities hwcaps(long setter);
  public native @Cast("unsigned long") long hwcaps2(); public native HardwareCapabilities hwcaps2(long setter);
}
