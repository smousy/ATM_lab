package com.company;

import java.util.ArrayList;

public class Transaction {
    private int pinEnter;
    private int pin;
    private int cardID;
    private String name;
    private Check check;

    public void doTransaction(){}
    public boolean endTransaction(Transaction transaction){return true;}//смысла нет как параметр делать транзакцию
    public boolean checkPosibilityPayment(){return true;}

}
