package com.company;

public class TransactionMoney extends Transaction{
    private int human;
    private int data;
    private double sum;

    public void doTransaction(){}
    public boolean endTransaction(TransactionMoney transaction){return true;}//смысла нет как параметр делать транзакцию
    public boolean checkPosibilityPayment(){return true;}
    public void createTransaction(){}
    public boolean doTransactionMoney(double sum, int data, int human){return true;}

}
