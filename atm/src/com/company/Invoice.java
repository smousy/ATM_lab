package com.company;

import java.util.ArrayList;

public class Invoice{
    private String currency;
    private double sum;
    private ArrayList<Card> cards;

    public void newInvoice(){}
    public double invoiceBalance(){return 1;}

    public void doTransaction(){}
    public void createTransaction(){}
    public boolean doViewInvoice(double sum, int data, int human){return true;}

}
