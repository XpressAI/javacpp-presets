// Targeted by JavaCPP version 1.5.8-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.global;

import org.bytedeco.opencv.opencv_objdetect.*;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
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
import org.bytedeco.opencv.opencv_dnn.*;
import static org.bytedeco.opencv.global.opencv_dnn.*;

public class opencv_objdetect extends org.bytedeco.opencv.presets.opencv_objdetect {
    static { Loader.load(); }

// Parsed from <opencv2/objdetect.hpp>

/*M///////////////////////////////////////////////////////////////////////////////////////
//
//  IMPORTANT: READ BEFORE DOWNLOADING, COPYING, INSTALLING OR USING.
//
//  By downloading, copying, installing or using the software you agree to this license.
//  If you do not agree to this license, do not download, install,
//  copy or use the software.
//
//
//                          License Agreement
//                For Open Source Computer Vision Library
//
// Copyright (C) 2000-2008, Intel Corporation, all rights reserved.
// Copyright (C) 2009, Willow Garage Inc., all rights reserved.
// Copyright (C) 2013, OpenCV Foundation, all rights reserved.
// Third party copyrights are property of their respective owners.
//
// Redistribution and use in source and binary forms, with or without modification,
// are permitted provided that the following conditions are met:
//
//   * Redistribution's of source code must retain the above copyright notice,
//     this list of conditions and the following disclaimer.
//
//   * Redistribution's in binary form must reproduce the above copyright notice,
//     this list of conditions and the following disclaimer in the documentation
//     and/or other materials provided with the distribution.
//
//   * The name of the copyright holders may not be used to endorse or promote products
//     derived from this software without specific prior written permission.
//
// This software is provided by the copyright holders and contributors "as is" and
// any express or implied warranties, including, but not limited to, the implied
// warranties of merchantability and fitness for a particular purpose are disclaimed.
// In no event shall the Intel Corporation or contributors be liable for any direct,
// indirect, incidental, special, exemplary, or consequential damages
// (including, but not limited to, procurement of substitute goods or services;
// loss of use, data, or profits; or business interruption) however caused
// and on any theory of liability, whether in contract, strict liability,
// or tort (including negligence or otherwise) arising in any way out of
// the use of this software, even if advised of the possibility of such damage.
//
//M*/

// #ifndef OPENCV_OBJDETECT_HPP
// #define OPENCV_OBJDETECT_HPP

// #include "opencv2/core.hpp"
// Targeting ../opencv_objdetect/CvHaarClassifierCascade.java


// Targeting ../opencv_objdetect/SimilarRects.java



/** \brief Groups the object candidate rectangles.
<p>
@param rectList Input/output vector of rectangles. Output vector includes retained and grouped
rectangles. (The Python list is not modified in place.)
@param groupThreshold Minimum possible number of rectangles minus 1. The threshold is used in a
group of rectangles to retain it.
@param eps Relative difference between sides of the rectangles to merge them into a group.
<p>
The function is a wrapper for the generic function partition . It clusters all the input rectangles
using the rectangle equivalence criteria that combines rectangles with similar sizes and similar
locations. The similarity is defined by eps. When eps=0 , no clustering is done at all. If
{@code \texttt{eps}\rightarrow +\inf} , all the rectangles are put in one cluster. Then, the small
clusters containing less than or equal to groupThreshold rectangles are rejected. In each other
cluster, the average rectangle is computed and put into the output rectangle list.
 */
@Namespace("cv") public static native void groupRectangles(@ByRef RectVector rectList, int groupThreshold, double eps/*=0.2*/);
@Namespace("cv") public static native void groupRectangles(@ByRef RectVector rectList, int groupThreshold);
/** \overload */
@Namespace("cv") public static native void groupRectangles(@ByRef RectVector rectList, @StdVector IntPointer weights,
                                  int groupThreshold, double eps/*=0.2*/);
@Namespace("cv") public static native void groupRectangles(@ByRef RectVector rectList, @StdVector IntPointer weights,
                                  int groupThreshold);
@Namespace("cv") public static native void groupRectangles(@ByRef RectVector rectList, @StdVector IntBuffer weights,
                                  int groupThreshold, double eps/*=0.2*/);
@Namespace("cv") public static native void groupRectangles(@ByRef RectVector rectList, @StdVector IntBuffer weights,
                                  int groupThreshold);
@Namespace("cv") public static native void groupRectangles(@ByRef RectVector rectList, @StdVector int[] weights,
                                  int groupThreshold, double eps/*=0.2*/);
@Namespace("cv") public static native void groupRectangles(@ByRef RectVector rectList, @StdVector int[] weights,
                                  int groupThreshold);
/** \overload */
@Namespace("cv") public static native void groupRectangles(@ByRef RectVector rectList, int groupThreshold,
                                  double eps, @StdVector IntPointer weights, @StdVector DoublePointer levelWeights );
@Namespace("cv") public static native void groupRectangles(@ByRef RectVector rectList, int groupThreshold,
                                  double eps, @StdVector IntBuffer weights, @StdVector DoubleBuffer levelWeights );
@Namespace("cv") public static native void groupRectangles(@ByRef RectVector rectList, int groupThreshold,
                                  double eps, @StdVector int[] weights, @StdVector double[] levelWeights );
/** \overload */
@Namespace("cv") public static native void groupRectangles(@ByRef RectVector rectList, @StdVector IntPointer rejectLevels,
                                  @StdVector DoublePointer levelWeights, int groupThreshold, double eps/*=0.2*/);
@Namespace("cv") public static native void groupRectangles(@ByRef RectVector rectList, @StdVector IntPointer rejectLevels,
                                  @StdVector DoublePointer levelWeights, int groupThreshold);
@Namespace("cv") public static native void groupRectangles(@ByRef RectVector rectList, @StdVector IntBuffer rejectLevels,
                                  @StdVector DoubleBuffer levelWeights, int groupThreshold, double eps/*=0.2*/);
@Namespace("cv") public static native void groupRectangles(@ByRef RectVector rectList, @StdVector IntBuffer rejectLevels,
                                  @StdVector DoubleBuffer levelWeights, int groupThreshold);
@Namespace("cv") public static native void groupRectangles(@ByRef RectVector rectList, @StdVector int[] rejectLevels,
                                  @StdVector double[] levelWeights, int groupThreshold, double eps/*=0.2*/);
@Namespace("cv") public static native void groupRectangles(@ByRef RectVector rectList, @StdVector int[] rejectLevels,
                                  @StdVector double[] levelWeights, int groupThreshold);
/** \overload */
@Namespace("cv") public static native void groupRectangles_meanshift(@ByRef RectVector rectList, @StdVector DoublePointer foundWeights,
                                            @StdVector DoublePointer foundScales,
                                            double detectThreshold/*=0.0*/, @ByVal(nullValue = "cv::Size(64, 128)") Size winDetSize);
@Namespace("cv") public static native void groupRectangles_meanshift(@ByRef RectVector rectList, @StdVector DoublePointer foundWeights,
                                            @StdVector DoublePointer foundScales);
@Namespace("cv") public static native void groupRectangles_meanshift(@ByRef RectVector rectList, @StdVector DoubleBuffer foundWeights,
                                            @StdVector DoubleBuffer foundScales,
                                            double detectThreshold/*=0.0*/, @ByVal(nullValue = "cv::Size(64, 128)") Size winDetSize);
@Namespace("cv") public static native void groupRectangles_meanshift(@ByRef RectVector rectList, @StdVector DoubleBuffer foundWeights,
                                            @StdVector DoubleBuffer foundScales);
@Namespace("cv") public static native void groupRectangles_meanshift(@ByRef RectVector rectList, @StdVector double[] foundWeights,
                                            @StdVector double[] foundScales,
                                            double detectThreshold/*=0.0*/, @ByVal(nullValue = "cv::Size(64, 128)") Size winDetSize);
@Namespace("cv") public static native void groupRectangles_meanshift(@ByRef RectVector rectList, @StdVector double[] foundWeights,
                                            @StdVector double[] foundScales);
/** \}
 <p>
 *  \addtogroup objdetect_cascade_classifier
 *  \{ */

/** enum cv:: */
public static final int CASCADE_DO_CANNY_PRUNING    = 1,
       CASCADE_SCALE_IMAGE         = 2,
       CASCADE_FIND_BIGGEST_OBJECT = 4,
       CASCADE_DO_ROUGH_SEARCH     = 8;
// Targeting ../opencv_objdetect/BaseCascadeClassifier.java


// Targeting ../opencv_objdetect/CascadeClassifier.java



@Namespace("cv") public static native @Ptr BaseCascadeClassifier.MaskGenerator createFaceDetectionMaskGenerator();
// Targeting ../opencv_objdetect/DetectionROI.java


// Targeting ../opencv_objdetect/HOGDescriptor.java


// Targeting ../opencv_objdetect/QRCodeEncoder.java


// Targeting ../opencv_objdetect/QRCodeDetector.java



/** \} */


// #include "opencv2/objdetect/detection_based_tracker.hpp"
// #include "opencv2/objdetect/face.hpp"

// #endif


// Parsed from <opencv2/objdetect/detection_based_tracker.hpp>

/*M///////////////////////////////////////////////////////////////////////////////////////
//
//  IMPORTANT: READ BEFORE DOWNLOADING, COPYING, INSTALLING OR USING.
//
//  By downloading, copying, installing or using the software you agree to this license.
//  If you do not agree to this license, do not download, install,
//  copy or use the software.
//
//
//                          License Agreement
//                For Open Source Computer Vision Library
//
// Copyright (C) 2000-2008, Intel Corporation, all rights reserved.
// Copyright (C) 2009, Willow Garage Inc., all rights reserved.
// Copyright (C) 2013, OpenCV Foundation, all rights reserved.
// Third party copyrights are property of their respective owners.
//
// Redistribution and use in source and binary forms, with or without modification,
// are permitted provided that the following conditions are met:
//
//   * Redistribution's of source code must retain the above copyright notice,
//     this list of conditions and the following disclaimer.
//
//   * Redistribution's in binary form must reproduce the above copyright notice,
//     this list of conditions and the following disclaimer in the documentation
//     and/or other materials provided with the distribution.
//
//   * The name of the copyright holders may not be used to endorse or promote products
//     derived from this software without specific prior written permission.
//
// This software is provided by the copyright holders and contributors "as is" and
// any express or implied warranties, including, but not limited to, the implied
// warranties of merchantability and fitness for a particular purpose are disclaimed.
// In no event shall the Intel Corporation or contributors be liable for any direct,
// indirect, incidental, special, exemplary, or consequential damages
// (including, but not limited to, procurement of substitute goods or services;
// loss of use, data, or profits; or business interruption) however caused
// and on any theory of liability, whether in contract, strict liability,
// or tort (including negligence or otherwise) arising in any way out of
// the use of this software, even if advised of the possibility of such damage.
//
//M*/

// #ifndef OPENCV_OBJDETECT_DBT_HPP
// #define OPENCV_OBJDETECT_DBT_HPP

// #include <opencv2/core.hpp>

// #include <vector>
// Targeting ../opencv_objdetect/DetectionBasedTracker.java



/** \} */

 //end of cv namespace

// #endif


}
