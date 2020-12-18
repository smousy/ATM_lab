package com.company;

public class CommunicationPayment extends Transaction{
    private String type;
    private int number;
    private String operator;
    private double sum;

    public void doTransaction(){}
    public boolean endTransaction(CommunicationPayment transaction){return true;}//смысла нет как параметр делать транзакцию
    public boolean checkPosibilityPayment(){return true;}
    public void createTransaction(){}
    public boolean doCommunicationPayment(double sum, String type, int number, String operator){return true;}

}
