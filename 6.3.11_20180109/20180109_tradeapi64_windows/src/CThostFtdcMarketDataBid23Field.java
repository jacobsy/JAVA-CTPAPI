/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ctp.thosttraderapi;

public class CThostFtdcMarketDataBid23Field {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CThostFtdcMarketDataBid23Field(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcMarketDataBid23Field obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        thosttradeapiJNI.delete_CThostFtdcMarketDataBid23Field(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBidPrice2(double value) {
    thosttradeapiJNI.CThostFtdcMarketDataBid23Field_BidPrice2_set(swigCPtr, this, value);
  }

  public double getBidPrice2() {
    return thosttradeapiJNI.CThostFtdcMarketDataBid23Field_BidPrice2_get(swigCPtr, this);
  }

  public void setBidVolume2(int value) {
    thosttradeapiJNI.CThostFtdcMarketDataBid23Field_BidVolume2_set(swigCPtr, this, value);
  }

  public int getBidVolume2() {
    return thosttradeapiJNI.CThostFtdcMarketDataBid23Field_BidVolume2_get(swigCPtr, this);
  }

  public void setBidPrice3(double value) {
    thosttradeapiJNI.CThostFtdcMarketDataBid23Field_BidPrice3_set(swigCPtr, this, value);
  }

  public double getBidPrice3() {
    return thosttradeapiJNI.CThostFtdcMarketDataBid23Field_BidPrice3_get(swigCPtr, this);
  }

  public void setBidVolume3(int value) {
    thosttradeapiJNI.CThostFtdcMarketDataBid23Field_BidVolume3_set(swigCPtr, this, value);
  }

  public int getBidVolume3() {
    return thosttradeapiJNI.CThostFtdcMarketDataBid23Field_BidVolume3_get(swigCPtr, this);
  }

  public CThostFtdcMarketDataBid23Field() {
    this(thosttradeapiJNI.new_CThostFtdcMarketDataBid23Field(), true);
  }

}
