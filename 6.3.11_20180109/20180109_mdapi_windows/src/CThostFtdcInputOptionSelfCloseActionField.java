/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package test.thostmduserapi;

public class CThostFtdcInputOptionSelfCloseActionField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CThostFtdcInputOptionSelfCloseActionField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcInputOptionSelfCloseActionField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        thostmduserapiJNI.delete_CThostFtdcInputOptionSelfCloseActionField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    thostmduserapiJNI.CThostFtdcInputOptionSelfCloseActionField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return thostmduserapiJNI.CThostFtdcInputOptionSelfCloseActionField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    thostmduserapiJNI.CThostFtdcInputOptionSelfCloseActionField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return thostmduserapiJNI.CThostFtdcInputOptionSelfCloseActionField_InvestorID_get(swigCPtr, this);
  }

  public void setOptionSelfCloseActionRef(int value) {
    thostmduserapiJNI.CThostFtdcInputOptionSelfCloseActionField_OptionSelfCloseActionRef_set(swigCPtr, this, value);
  }

  public int getOptionSelfCloseActionRef() {
    return thostmduserapiJNI.CThostFtdcInputOptionSelfCloseActionField_OptionSelfCloseActionRef_get(swigCPtr, this);
  }

  public void setOptionSelfCloseRef(String value) {
    thostmduserapiJNI.CThostFtdcInputOptionSelfCloseActionField_OptionSelfCloseRef_set(swigCPtr, this, value);
  }

  public String getOptionSelfCloseRef() {
    return thostmduserapiJNI.CThostFtdcInputOptionSelfCloseActionField_OptionSelfCloseRef_get(swigCPtr, this);
  }

  public void setRequestID(int value) {
    thostmduserapiJNI.CThostFtdcInputOptionSelfCloseActionField_RequestID_set(swigCPtr, this, value);
  }

  public int getRequestID() {
    return thostmduserapiJNI.CThostFtdcInputOptionSelfCloseActionField_RequestID_get(swigCPtr, this);
  }

  public void setFrontID(int value) {
    thostmduserapiJNI.CThostFtdcInputOptionSelfCloseActionField_FrontID_set(swigCPtr, this, value);
  }

  public int getFrontID() {
    return thostmduserapiJNI.CThostFtdcInputOptionSelfCloseActionField_FrontID_get(swigCPtr, this);
  }

  public void setSessionID(int value) {
    thostmduserapiJNI.CThostFtdcInputOptionSelfCloseActionField_SessionID_set(swigCPtr, this, value);
  }

  public int getSessionID() {
    return thostmduserapiJNI.CThostFtdcInputOptionSelfCloseActionField_SessionID_get(swigCPtr, this);
  }

  public void setExchangeID(String value) {
    thostmduserapiJNI.CThostFtdcInputOptionSelfCloseActionField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return thostmduserapiJNI.CThostFtdcInputOptionSelfCloseActionField_ExchangeID_get(swigCPtr, this);
  }

  public void setOptionSelfCloseSysID(String value) {
    thostmduserapiJNI.CThostFtdcInputOptionSelfCloseActionField_OptionSelfCloseSysID_set(swigCPtr, this, value);
  }

  public String getOptionSelfCloseSysID() {
    return thostmduserapiJNI.CThostFtdcInputOptionSelfCloseActionField_OptionSelfCloseSysID_get(swigCPtr, this);
  }

  public void setActionFlag(char value) {
    thostmduserapiJNI.CThostFtdcInputOptionSelfCloseActionField_ActionFlag_set(swigCPtr, this, value);
  }

  public char getActionFlag() {
    return thostmduserapiJNI.CThostFtdcInputOptionSelfCloseActionField_ActionFlag_get(swigCPtr, this);
  }

  public void setUserID(String value) {
    thostmduserapiJNI.CThostFtdcInputOptionSelfCloseActionField_UserID_set(swigCPtr, this, value);
  }

  public String getUserID() {
    return thostmduserapiJNI.CThostFtdcInputOptionSelfCloseActionField_UserID_get(swigCPtr, this);
  }

  public void setInstrumentID(String value) {
    thostmduserapiJNI.CThostFtdcInputOptionSelfCloseActionField_InstrumentID_set(swigCPtr, this, value);
  }

  public String getInstrumentID() {
    return thostmduserapiJNI.CThostFtdcInputOptionSelfCloseActionField_InstrumentID_get(swigCPtr, this);
  }

  public void setInvestUnitID(String value) {
    thostmduserapiJNI.CThostFtdcInputOptionSelfCloseActionField_InvestUnitID_set(swigCPtr, this, value);
  }

  public String getInvestUnitID() {
    return thostmduserapiJNI.CThostFtdcInputOptionSelfCloseActionField_InvestUnitID_get(swigCPtr, this);
  }

  public void setIPAddress(String value) {
    thostmduserapiJNI.CThostFtdcInputOptionSelfCloseActionField_IPAddress_set(swigCPtr, this, value);
  }

  public String getIPAddress() {
    return thostmduserapiJNI.CThostFtdcInputOptionSelfCloseActionField_IPAddress_get(swigCPtr, this);
  }

  public void setMacAddress(String value) {
    thostmduserapiJNI.CThostFtdcInputOptionSelfCloseActionField_MacAddress_set(swigCPtr, this, value);
  }

  public String getMacAddress() {
    return thostmduserapiJNI.CThostFtdcInputOptionSelfCloseActionField_MacAddress_get(swigCPtr, this);
  }

  public CThostFtdcInputOptionSelfCloseActionField() {
    this(thostmduserapiJNI.new_CThostFtdcInputOptionSelfCloseActionField(), true);
  }

}