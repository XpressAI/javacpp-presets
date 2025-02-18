// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


// A class for handling async execution (see TFE_ContextSetAsync).
// Note that this class is thread-safe.
// TODO(agarwal): TFE_OpAddInput may currently block if it tries to access the
// device of the input handle. Fix that.
// TODO(agarwal): On error, mark all affected handles as corrupted.
// TODO(agarwal): Implement support for control dependencies.
// TODO(agarwal): Support out-of-order execution and dispatching multiple
// EagerNode in parallel.
// TODO(agarwal): Implement optimizations over EagerNode traces.
@Namespace("tensorflow") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class EagerExecutor extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public EagerExecutor(Pointer p) { super(p); }

  public EagerExecutor(@Cast("bool") boolean async) { super((Pointer)null); allocate(async); }
  private native void allocate(@Cast("bool") boolean async);

  // Puts this in a shutdown state. In this state, Add() will return an error
  // and not add new EagerNodes. After putting this in the shutdown state,
  // blocks until all pendings nodes have finished running.
  // Returns the status of executing pending nodes.
  // If async was not enabled, aborts and destroys all pending nodes.
  public native @ByVal Status ShutDown();

  public native @Cast("bool") boolean Async();

  // Schedules `node` for execution. If an error occurs (e.g. EagerExecutor
  // has already been shut down), the `node` is not added to this executor
  // and its Abort() method is called.
  public native @ByVal Status Add(@MoveUniquePtr EagerNode node);

  // Blocks till all currently pending ops are done.
  // In particular, if EnableAsync() has not beed called, it will not return
  // until that happens (and pendings, at the time of call, nodes finish
  // running). If this executor has already been shut down, its final status is
  // returned.
  public native @ByVal Status WaitForAllPendingNodes();

  // Clears all currently set errors which re-enables async execution.
  public native void ClearError();

  // Returns Status based on any errors that occurred during async execution.
  public native @ByVal Status status();
}
