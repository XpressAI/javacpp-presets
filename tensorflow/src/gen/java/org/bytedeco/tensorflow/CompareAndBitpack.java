// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Compare values of {@code input} to {@code threshold} and pack resulting bits into a {@code uint8}.
 * 
 *  Each comparison returns a boolean {@code true} (if {@code input_value > threshold})
 *  or and {@code false} otherwise.
 * 
 *  This operation is useful for Locality-Sensitive-Hashing (LSH) and other
 *  algorithms that use hashing approximations of cosine and {@code L2} distances;
 *  codes can be generated from an input via:
 * 
 *  <pre>{@code python
 *  codebook_size = 50
 *  codebook_bits = codebook_size * 32
 *  codebook = tf.get_variable('codebook', [x.shape[-1].value, codebook_bits],
 *                             dtype=x.dtype,
 *                             initializer=tf.orthogonal_initializer())
 *  codes = compare_and_threshold(tf.matmul(x, codebook), threshold=0.)
 *  codes = tf.bitcast(codes, tf.int32)  # go from uint8 to int32
 *  # now codes has shape x.shape[:-1] + [codebook_size]
 *  }</pre>
 * 
 *  **NOTE**: Currently, the innermost dimension of the tensor must be divisible
 *  by 8.
 * 
 *  Given an {@code input} shaped {@code [s0, s1, ..., s_n]}, the output is
 *  a {@code uint8} tensor shaped {@code [s0, s1, ..., s_n / 8]}.
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * input: Values to compare against {@code threshold} and bitpack.
 *  * threshold: Threshold to compare against.
 * 
 *  Returns:
 *  * {@code Output}: The bitpacked comparisons. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class CompareAndBitpack extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CompareAndBitpack(Pointer p) { super(p); }

  public CompareAndBitpack(@Const @ByRef Scope scope, @ByVal Input input,
                    @ByVal Input threshold) { super((Pointer)null); allocate(scope, input, threshold); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input input,
                    @ByVal Input threshold);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public native @ByRef Operation operation(); public native CompareAndBitpack operation(Operation setter);
  public native @ByRef Output output(); public native CompareAndBitpack output(Output setter);
}
