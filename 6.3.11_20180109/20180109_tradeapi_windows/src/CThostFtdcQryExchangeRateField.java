/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ctp.thosttraderapi;

public class CThostFtdcQryExchangeRateField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CThostFtdcQryExchangeRateField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcQryExchangeRateField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        thosttradeapiJNI.delete_CThostFtdcQryExchangeRateField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    thosttradeapiJNI.CThostFtdcQryExchangeRateField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return thosttradeapiJNI.CThostFtdcQryExchangeRateField_BrokerID_get(swigCPtr, this);
  }

  public void setFromCurrencyID(String value) {
    thosttradeapiJNI.CThostFtdcQryExchangeRateField_FromCurrencyID_set(swigCPtr, this, value);
  }

  public String getFromCurrencyID() {
    return thosttradeapiJNI.CThostFtdcQryExchangeRateField_FromCurrencyID_get(swigCPtr, this);
  }

  public void setToCurrencyID(String value) {
    thosttradeapiJNI.CThostFtdcQryExchangeRateField_ToCurrencyID_set(swigCPtr, this, value);
  }

  public String getToCurrencyID() {
    return thosttradeapiJNI.CThostFtdcQryExchangeRateField_ToCurrencyID_get(swigCPtr, this);
  }

  public CThostFtdcQryExchangeRateField() {
    this(thosttradeapiJNI.new_CThostFtdcQryExchangeRateField(), true);
  }

}
