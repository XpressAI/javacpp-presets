// Targeted by JavaCPP version 1.5.2-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_cudastereo;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.opencv.opencv_core.*;
import static org.bytedeco.opencv.global.opencv_core.*;
import org.bytedeco.opencv.opencv_imgproc.*;
import static org.bytedeco.opencv.global.opencv_imgproc.*;
import static org.bytedeco.opencv.global.opencv_imgcodecs.*;
import org.bytedeco.opencv.opencv_videoio.*;
import static org.bytedeco.opencv.global.opencv_videoio.*;
import org.bytedeco.opencv.opencv_highgui.*;
import static org.bytedeco.opencv.global.opencv_highgui.*;
import org.bytedeco.opencv.opencv_flann.*;
import static org.bytedeco.opencv.global.opencv_flann.*;
import org.bytedeco.opencv.opencv_features2d.*;
import static org.bytedeco.opencv.global.opencv_features2d.*;
import org.bytedeco.opencv.opencv_calib3d.*;
import static org.bytedeco.opencv.global.opencv_calib3d.*;

import static org.bytedeco.opencv.global.opencv_cudastereo.*;


/** \addtogroup cudastereo
 *  \{
<p>
///////////////////////////////////////// */
// StereoBM

/** \brief Class computing stereo correspondence (disparity map) using the block matching algorithm. :
<p>
@see StereoBM
 */
@Name("cv::cuda::StereoBM") @Properties(inherit = org.bytedeco.opencv.presets.opencv_cudastereo.class)
public class StereoBM extends org.bytedeco.opencv.opencv_calib3d.StereoBM {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public StereoBM(Pointer p) { super(p); }


    public native void compute(@ByVal Mat left, @ByVal Mat right, @ByVal Mat disparity, @ByRef Stream stream);
    public native void compute(@ByVal UMat left, @ByVal UMat right, @ByVal UMat disparity, @ByRef Stream stream);
    public native void compute(@ByVal GpuMat left, @ByVal GpuMat right, @ByVal GpuMat disparity, @ByRef Stream stream);
}