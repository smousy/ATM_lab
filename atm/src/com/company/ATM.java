package com.company;

import java.util.ArrayList;

public class ATM {
    private String address;
    private String bank;
    private Card card;
    private ArrayList<Transaction> transactions;
    public Transaction addTransaction(String transaction){
        return new Transaction();
    }
    public boolean exit(){
        return true;
    }
    public boolean checkPin(int pin){return true;}
    public ArrayList<Transaction> viewAllTransaction(){
        return new ArrayList<Transaction>();
    }
    public static void main(String[] args){//не хватало функции мэйн
AuthorizationWindow authorizationWindow = new AuthorizationWindow();
    authorizationWindow.init();
}}
