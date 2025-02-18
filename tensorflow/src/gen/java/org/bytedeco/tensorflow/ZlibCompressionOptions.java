// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


@Namespace("tensorflow::io") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class ZlibCompressionOptions extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ZlibCompressionOptions(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public ZlibCompressionOptions(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public ZlibCompressionOptions position(long position) {
        return (ZlibCompressionOptions)super.position(position);
    }
    @Override public ZlibCompressionOptions getPointer(long i) {
        return new ZlibCompressionOptions((Pointer)this).offsetAddress(i);
    }

  public ZlibCompressionOptions() { super((Pointer)null); allocate(); }
  private native void allocate();

  public static native @ByVal ZlibCompressionOptions DEFAULT();
  public static native @ByVal ZlibCompressionOptions RAW();
  public static native @ByVal ZlibCompressionOptions GZIP();

  // Defaults to Z_NO_FLUSH
  public native @Cast("tensorflow::int8") byte flush_mode(); public native ZlibCompressionOptions flush_mode(byte setter);

  // Size of the buffer used for caching the data read from source file.
  public native @Cast("tensorflow::int64") long input_buffer_size(); public native ZlibCompressionOptions input_buffer_size(long setter);

  // Size of the sink buffer where the compressed/decompressed data produced by
  // zlib is cached.
  public native @Cast("tensorflow::int64") long output_buffer_size(); public native ZlibCompressionOptions output_buffer_size(long setter);

  // The window_bits parameter is the base two logarithm of the window size
  // (the size of the history buffer). Larger values of buffer size result in
  // better compression at the expense of memory usage.
  //
  // Accepted values:
  //
  // 8..15:
  // Normal deflate with zlib header and checksum.
  //
  // -8..-15:
  // Negative values can be used for raw deflate/inflate. In this case,
  // -window_bits determines the window size. deflate() will then generate raw
  // deflate data  with no zlib header or trailer, and will not compute an
  // adler32 check value. inflate() will then process raw deflate data, not
  // looking for a zlib or gzip header, not generating a check value, and not
  // looking for any check values for comparison at the end of the stream.
  //
  // 16 + [8..15]:
  // window_bits can also be greater than 15 for optional gzip encoding. Add 16
  // to window_bits to write a simple gzip header and trailer around the
  // compressed data instead of a zlib wrapper. The gzip header will have no
  // file name, no extra data, no comment, no modification time (set to zero),
  // no header crc, and the operating system will be set to 255 (unknown). If a
  // gzip stream is being written, strm->adler is a crc32 instead of an adler32.
  //
  // 0:
  // window_bits can also be zero to request that inflate use the window size
  // in the zlib header of the compressed stream.
  //
  // While inflating, window_bits must be greater than or equal to the
  // window_bits value provided used while compressing. If a compressed stream
  // with a larger window size is given as input, inflate() will return with the
  // error code Z_DATA_ERROR instead of trying to allocate a larger window.
  //
  // Defaults to MAX_WBITS
  public native @Cast("tensorflow::int8") byte window_bits(); public native ZlibCompressionOptions window_bits(byte setter);

  // From the zlib manual (http://www.zlib.net/manual.html):
  // The compression level must be Z_DEFAULT_COMPRESSION, or between 0 and 9:
  // 1 gives best speed, 9 gives best compression, 0 gives no compression at all
  // (the input data is simply copied a block at a time). Z_DEFAULT_COMPRESSION
  // requests a default compromise between speed and compression (currently
  // equivalent to level 6).
  public native @Cast("tensorflow::int8") byte compression_level(); public native ZlibCompressionOptions compression_level(byte setter);

  // Only Z_DEFLATED is supported at this time.
  public native @Cast("tensorflow::int8") byte compression_method(); public native ZlibCompressionOptions compression_method(byte setter);

  // From the zlib manual (http://www.zlib.net/manual.html):
  // The mem_level parameter specifies how much memory should be allocated for
  // the internal compression state. mem_level=1 uses minimum memory but is slow
  // and reduces compression ratio; mem_level=9 uses maximum memory for optimal
  // speed. The default value is 8.
  public native @Cast("tensorflow::int8") byte mem_level(); public native ZlibCompressionOptions mem_level(byte setter);

  // From the zlib manual (http://www.zlib.net/manual.html):
  // The strategy parameter is used to tune the compression algorithm. Use the
  // value Z_DEFAULT_STRATEGY for normal data, Z_FILTERED for data produced by
  // a filter (or predictor), Z_HUFFMAN_ONLY to force Huffman encoding only
  // (no string match), or Z_RLE to limit match distances to one
  // (run-length encoding). Filtered data consists mostly of small values with
  // a somewhat random distribution. In this case, the compression algorithm is
  // tuned to compress them better. The effect of Z_FILTERED is to force more
  // Huffman coding and less string matching; it is somewhat intermediate
  // between Z_DEFAULT_STRATEGY and Z_HUFFMAN_ONLY. Z_RLE is designed to be
  // almost as fast as Z_HUFFMAN_ONLY, but give better compression for
  // PNG image data. The strategy parameter only affects the compression ratio
  // but not the correctness of the compressed output even if it is not set
  // appropriately. Z_FIXED prevents the use of dynamic Huffman codes, allowing
  // for a simpler decoder for special applications.
  public native @Cast("tensorflow::int8") byte compression_strategy(); public native ZlibCompressionOptions compression_strategy(byte setter);
}
