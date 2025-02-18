// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.liquidfun;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.liquidfun.global.liquidfun.*;


/** Implement this class to provide collision filtering. In other words, you can implement
 *  this class if you want finer control over contact creation. */
@Properties(inherit = org.bytedeco.liquidfun.presets.liquidfun.class)
public class b2ContactFilter extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public b2ContactFilter() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public b2ContactFilter(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public b2ContactFilter(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public b2ContactFilter position(long position) {
        return (b2ContactFilter)super.position(position);
    }
    @Override public b2ContactFilter getPointer(long i) {
        return new b2ContactFilter((Pointer)this).offsetAddress(i);
    }


	/** Return true if contact calculations should be performed between these two shapes.
	 *  \warning for performance reasons this is only called when the AABBs begin to overlap. */
	@Virtual public native @Cast("bool") boolean ShouldCollide(b2Fixture fixtureA, b2Fixture fixtureB);

	/** Return true if contact calculations should be performed between a
	 *  fixture and particle.  This is only called if the
	 *  b2_fixtureContactListenerParticle flag is set on the particle. */
	@Virtual public native @Cast("bool") boolean ShouldCollide(b2Fixture fixture,
								   b2ParticleSystem particleSystem,
								   @Cast("int32") int particleIndex);

	/** Return true if contact calculations should be performed between two
	 *  particles.  This is only called if the
	 *  b2_particleContactListenerParticle flag is set on the particle. */
	@Virtual public native @Cast("bool") boolean ShouldCollide(b2ParticleSystem particleSystem,
								   @Cast("int32") int particleIndexA, @Cast("int32") int particleIndexB);
}
