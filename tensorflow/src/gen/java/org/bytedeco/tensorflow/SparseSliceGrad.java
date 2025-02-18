// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** The gradient operator for the SparseSlice op.
 * 
 *  This op takes in the upstream gradient w.r.t. non-empty values of
 *  the sliced {@code SparseTensor}, and outputs the gradients w.r.t.
 *  the non-empty values of input {@code SparseTensor}.
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * backprop_val_grad: 1-D. The gradient with respect to
 *  the non-empty values of the sliced {@code SparseTensor}.
 *  * input_indices: 2-D.  The {@code indices} of the input {@code SparseTensor}.
 *  * input_start: 1-D. tensor represents the start of the slice.
 *  * output_indices: 2-D.  The {@code indices} of the sliced {@code SparseTensor}.
 * 
 *  Returns:
 *  * {@code Output}: 1-D. The gradient with respect to the non-empty values of input {@code SparseTensor}. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class SparseSliceGrad extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SparseSliceGrad(Pointer p) { super(p); }

  public SparseSliceGrad(@Const @ByRef Scope scope, @ByVal Input backprop_val_grad, @ByVal Input input_indices,
                  @ByVal Input input_start, @ByVal Input output_indices) { super((Pointer)null); allocate(scope, backprop_val_grad, input_indices, input_start, output_indices); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input backprop_val_grad, @ByVal Input input_indices,
                  @ByVal Input input_start, @ByVal Input output_indices);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public native @ByRef Operation operation(); public native SparseSliceGrad operation(Operation setter);
  public native @ByRef Output val_grad(); public native SparseSliceGrad val_grad(Output setter);
}
