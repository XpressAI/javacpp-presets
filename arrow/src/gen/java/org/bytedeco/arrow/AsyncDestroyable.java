// Targeted by JavaCPP version 1.5.7-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import org.bytedeco.arrow.Function;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;


/** An object which should be asynchronously closed before it is destroyed
 * 
 *  Classes can extend this to ensure that the close method is called and completed
 *  before the instance is deleted.  This provides smart_ptr / delete semantics for
 *  objects with an asynchronous destructor.
 * 
 *  Classes which extend this must be constructed using MakeSharedAsync or MakeUniqueAsync */
@Namespace("arrow::util") @NoOffset @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class AsyncDestroyable extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AsyncDestroyable(Pointer p) { super(p); }


  /** A future which will complete when the AsyncDestroyable has finished and is ready
   *  to be deleted.
   * 
   *  This can be used to ensure all work done by this object has been completed before
   *  proceeding. */
  public native @ByVal Future on_closed();
}