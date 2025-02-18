// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


// Options for calling ImportGraphDef().
@Namespace("tensorflow") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class ImportGraphDefOptions extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ImportGraphDefOptions(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public ImportGraphDefOptions(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public ImportGraphDefOptions position(long position) {
        return (ImportGraphDefOptions)super.position(position);
    }
    @Override public ImportGraphDefOptions getPointer(long i) {
        return new ImportGraphDefOptions((Pointer)this).offsetAddress(i);
    }

  public ImportGraphDefOptions() { super((Pointer)null); allocate(); }
  private native void allocate();

  // Name prefix to use for nodes imported from the GraphDef.  For example, if
  // prefix="animals" and GraphDef contains a node "bunny" then the node will be
  // named "animals/bunny" in *g. Must not be already used as a node name or
  // prefix in the graph.
  public native @StdString BytePointer prefix(); public native ImportGraphDefOptions prefix(BytePointer setter);

  // If true, imported node names will be modified if their name already exists
  // in the graph. If false, conflicting names will be treated as an error. Note
  // that this option has no effect if `prefix` is specified, since `prefix`
  // will guarantee all node names are unique.
  public native @Cast("bool") boolean uniquify_names(); public native ImportGraphDefOptions uniquify_names(boolean setter);

  // If true, `prefix` will be modified if it already exists as a node name or
  // prefix in the graph. If false, a conflicting prefix will be treated as an
  // error. This option has no effect if `prefix` isn't specified.
  public native @Cast("bool") boolean uniquify_prefix(); public native ImportGraphDefOptions uniquify_prefix(boolean setter);

  // Maps tensors in `gdef` to existing tensors in `g`. Inputs in `gdef`
  // corresponding to `input_map` keys will be remapped to the nodes in `g`
  // corresponding to the values.
  //
  // Keys should not include `prefix`, i.e., a key ID's name should be the name
  // as it originally appears in `gdef`.
  //
  // If this is non-empty, ImportGraphDef must be called with the shape refiner
  // used to create the existing nodes referenced in `input_map`.
  // TODO(skyewm): can we remove this requirement? How do we access the original
  // shape refiner?
  public native @ByRef SafeTensorIdTensorIdMap input_map(); public native ImportGraphDefOptions input_map(SafeTensorIdTensorIdMap setter);

  // If true, nodes that will have all output edges removed because of
  // overrides in `input_map` will not be imported.
  public native @Cast("bool") boolean skip_mapped_nodes(); public native ImportGraphDefOptions skip_mapped_nodes(boolean setter);

  // The names of existing nodes in `g` that the imported graph should have
  // control dependencies on.
  //
  // Note that to avoid creating many redundant control edges, ImportGraphDef()
  // won't add control edges to nodes that will inherit the dependencies from
  // other nodes in `gdef`.
  public native @ByRef StringVector control_dependencies(); public native ImportGraphDefOptions control_dependencies(StringVector setter);

  // Tensors in `gdef` that will be returned via the ImportGraphDefResults
  // output parameter of `ImportGraphDef()`. If this list is non-empty, the
  // caller must pass a results object to `ImportGraphDef()`. The
  // `return_tensors` field will be populated with the imported nodes in `g`.
  //
  // Entries should not include `prefix`, i.e., each ID's name should be the
  // name as it originally appears in `gdef`.
  //
  // If this contains a tensor that's also being remapped via `input_map`, the
  // corresponding existing tensor in `g` will be returned.
  public native @StdVector SafeTensorId return_tensors(); public native ImportGraphDefOptions return_tensors(SafeTensorId setter);

  // The names of nodes in `gdef` that will be returned via the
  // ImportGraphDefResults output parameter of `ImportGraphDef()`. If this list
  // is non-empty, the caller must pass a results object to
  // `ImportGraphDef()`. The `return_nodes` field will be populated with the
  // imported nodes in `g`.
  //
  // Entries should not include `prefix`, i.e., each node's name should be the
  // name as it originally appears in `gdef`.
  //
  // Unlike `return_tensors`, `input_map` has no effect on the nodes
  // returned. `return_nodes` must be empty if `skip_mapped_nodes` is true.
  // TODO(skyewm): make this work with `skip_mapped_nodes` if there's a need.
  public native @ByRef StringVector return_nodes(); public native ImportGraphDefOptions return_nodes(StringVector setter);

  // If true, checks that all colocation constraints are nodes in the GraphDef.
  public native @Cast("bool") boolean validate_colocation_constraints(); public native ImportGraphDefOptions validate_colocation_constraints(boolean setter);

  // If false skips shape validation.
  public native @Cast("bool") boolean validate_shape(); public native ImportGraphDefOptions validate_shape(boolean setter);

  // TODO(ashankar): Enable handling of GraphDefs produced by newer binaries
  // with ops that are not defined in the binary calling ImportGraphDef.
  // Similar to the producer_op_list argument to import_graph_def in the
  // python API.

  // Try to set default execution device for this grapth.
  public native @StdString BytePointer default_device(); public native ImportGraphDefOptions default_device(BytePointer setter);
}
