package com.company;

public class UtilitiesPayment extends Transaction{
    private int human;
    private int data;
    private double sum;

    public void doTransaction(){}
    public boolean endTransaction(UtilitiesPayment transaction){return true;}//смысла нет как параметр делать транзакцию
    public boolean checkPosibilityPayment(){return true;}
    public void createTransaction(){}
    public boolean doUtilitiesPayment(double sum, int data, int human){return true;}

}
