package com.retailbank.creditcheckservice;

public class CreditRequest {
    int citizenNumber;

    public CreditRequest() {
    }

    public CreditRequest(int citizenNumber) {
        this.citizenNumber = citizenNumber;
    }

    public int getCitizenNumber() {
        return citizenNumber;
    }

    public void setCitizenNumber(int citizenNumber) {
        this.citizenNumber = citizenNumber;
    }
}
