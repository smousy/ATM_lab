package com.company;

public class TakeCash extends Transaction {

    private String currency;
    private Double sum;

    public boolean checkPosibilityPayment() {
        return true;
    }

    public void doTransaction() {
    }

    public boolean endTransaction(TakeCash transaction) {
        return true;
    }//смысла нет как параметр делать транзакцию

    public void createTransaction() {
    }

    public Cash takeCash(String currency, Double sum){
        return new Cash();
    }
}
