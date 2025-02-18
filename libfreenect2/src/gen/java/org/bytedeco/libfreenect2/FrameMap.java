// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.libfreenect2;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.libfreenect2.global.freenect2.*;

@Name("std::map<libfreenect2::Frame::Type,libfreenect2::Frame*>") @Properties(inherit = org.bytedeco.libfreenect2.presets.freenect2.class)
public class FrameMap extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public FrameMap(Pointer p) { super(p); }
    public FrameMap()       { allocate();  }
    private native void allocate();
    public native @Name("operator =") @ByRef FrameMap put(@ByRef FrameMap x);

    public boolean empty() { return size() == 0; }
    public native long size();

    @Index public native Frame get(@Cast("libfreenect2::Frame::Type") int i);
    public native FrameMap put(@Cast("libfreenect2::Frame::Type") int i, Frame value);

    public native void erase(@ByVal Iterator pos);
    public native @ByVal Iterator begin();
    public native @ByVal Iterator end();
    @NoOffset @Name("iterator") public static class Iterator extends Pointer {
        public Iterator(Pointer p) { super(p); }
        public Iterator() { }

        public native @Name("operator ++") @ByRef Iterator increment();
        public native @Name("operator ==") boolean equals(@ByRef Iterator it);
        public native @Name("operator *().first") @MemberGetter @Cast("libfreenect2::Frame::Type") int first();
        public native @Name("operator *().second") @MemberGetter @Const Frame second();
    }
}

