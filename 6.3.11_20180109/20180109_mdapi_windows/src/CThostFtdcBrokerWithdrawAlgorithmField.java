/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ctp.thostmduserapi;

public class CThostFtdcBrokerWithdrawAlgorithmField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CThostFtdcBrokerWithdrawAlgorithmField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcBrokerWithdrawAlgorithmField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        thostmduserapiJNI.delete_CThostFtdcBrokerWithdrawAlgorithmField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    thostmduserapiJNI.CThostFtdcBrokerWithdrawAlgorithmField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return thostmduserapiJNI.CThostFtdcBrokerWithdrawAlgorithmField_BrokerID_get(swigCPtr, this);
  }

  public void setWithdrawAlgorithm(char value) {
    thostmduserapiJNI.CThostFtdcBrokerWithdrawAlgorithmField_WithdrawAlgorithm_set(swigCPtr, this, value);
  }

  public char getWithdrawAlgorithm() {
    return thostmduserapiJNI.CThostFtdcBrokerWithdrawAlgorithmField_WithdrawAlgorithm_get(swigCPtr, this);
  }

  public void setUsingRatio(double value) {
    thostmduserapiJNI.CThostFtdcBrokerWithdrawAlgorithmField_UsingRatio_set(swigCPtr, this, value);
  }

  public double getUsingRatio() {
    return thostmduserapiJNI.CThostFtdcBrokerWithdrawAlgorithmField_UsingRatio_get(swigCPtr, this);
  }

  public void setIncludeCloseProfit(char value) {
    thostmduserapiJNI.CThostFtdcBrokerWithdrawAlgorithmField_IncludeCloseProfit_set(swigCPtr, this, value);
  }

  public char getIncludeCloseProfit() {
    return thostmduserapiJNI.CThostFtdcBrokerWithdrawAlgorithmField_IncludeCloseProfit_get(swigCPtr, this);
  }

  public void setAllWithoutTrade(char value) {
    thostmduserapiJNI.CThostFtdcBrokerWithdrawAlgorithmField_AllWithoutTrade_set(swigCPtr, this, value);
  }

  public char getAllWithoutTrade() {
    return thostmduserapiJNI.CThostFtdcBrokerWithdrawAlgorithmField_AllWithoutTrade_get(swigCPtr, this);
  }

  public void setAvailIncludeCloseProfit(char value) {
    thostmduserapiJNI.CThostFtdcBrokerWithdrawAlgorithmField_AvailIncludeCloseProfit_set(swigCPtr, this, value);
  }

  public char getAvailIncludeCloseProfit() {
    return thostmduserapiJNI.CThostFtdcBrokerWithdrawAlgorithmField_AvailIncludeCloseProfit_get(swigCPtr, this);
  }

  public void setIsBrokerUserEvent(int value) {
    thostmduserapiJNI.CThostFtdcBrokerWithdrawAlgorithmField_IsBrokerUserEvent_set(swigCPtr, this, value);
  }

  public int getIsBrokerUserEvent() {
    return thostmduserapiJNI.CThostFtdcBrokerWithdrawAlgorithmField_IsBrokerUserEvent_get(swigCPtr, this);
  }

  public void setCurrencyID(String value) {
    thostmduserapiJNI.CThostFtdcBrokerWithdrawAlgorithmField_CurrencyID_set(swigCPtr, this, value);
  }

  public String getCurrencyID() {
    return thostmduserapiJNI.CThostFtdcBrokerWithdrawAlgorithmField_CurrencyID_get(swigCPtr, this);
  }

  public void setFundMortgageRatio(double value) {
    thostmduserapiJNI.CThostFtdcBrokerWithdrawAlgorithmField_FundMortgageRatio_set(swigCPtr, this, value);
  }

  public double getFundMortgageRatio() {
    return thostmduserapiJNI.CThostFtdcBrokerWithdrawAlgorithmField_FundMortgageRatio_get(swigCPtr, this);
  }

  public void setBalanceAlgorithm(char value) {
    thostmduserapiJNI.CThostFtdcBrokerWithdrawAlgorithmField_BalanceAlgorithm_set(swigCPtr, this, value);
  }

  public char getBalanceAlgorithm() {
    return thostmduserapiJNI.CThostFtdcBrokerWithdrawAlgorithmField_BalanceAlgorithm_get(swigCPtr, this);
  }

  public CThostFtdcBrokerWithdrawAlgorithmField() {
    this(thostmduserapiJNI.new_CThostFtdcBrokerWithdrawAlgorithmField(), true);
  }

}
