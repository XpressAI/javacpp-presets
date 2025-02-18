// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.qt.Qt5Gui;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.qt.Qt5Core.*;
import static org.bytedeco.qt.global.Qt5Core.*;

import static org.bytedeco.qt.global.Qt5Gui.*;

// Parsed from QtGui/qevent.h

@Properties(inherit = org.bytedeco.qt.presets.Qt5Gui.class)
public class QCloseEvent extends QEvent {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public QCloseEvent(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public QCloseEvent(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public QCloseEvent position(long position) {
        return (QCloseEvent)super.position(position);
    }
    @Override public QCloseEvent getPointer(long i) {
        return new QCloseEvent((Pointer)this).offsetAddress(i);
    }

    public QCloseEvent() { super((Pointer)null); allocate(); }
    private native void allocate();
}
