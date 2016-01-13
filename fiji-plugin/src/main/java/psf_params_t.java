/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */


public class psf_params_t {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected psf_params_t(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(psf_params_t obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        BrecsJNI.delete_psf_params_t(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setPsfwidth(float value) {
    BrecsJNI.psf_params_t_psfwidth_set(swigCPtr, this, value);
  }

  public float getPsfwidth() {
    return BrecsJNI.psf_params_t_psfwidth_get(swigCPtr, this);
  }

  public void setImagewidth(long value) {
    BrecsJNI.psf_params_t_imagewidth_set(swigCPtr, this, value);
  }

  public long getImagewidth() {
    return BrecsJNI.psf_params_t_imagewidth_get(swigCPtr, this);
  }

  public void setOversampling(long value) {
    BrecsJNI.psf_params_t_oversampling_set(swigCPtr, this, value);
  }

  public long getOversampling() {
    return BrecsJNI.psf_params_t_oversampling_get(swigCPtr, this);
  }

  public void setPixsize(float value) {
    BrecsJNI.psf_params_t_pixsize_set(swigCPtr, this, value);
  }

  public float getPixsize() {
    return BrecsJNI.psf_params_t_pixsize_get(swigCPtr, this);
  }

  public psf_params_t() {
    this(BrecsJNI.new_psf_params_t(), true);
  }

}
