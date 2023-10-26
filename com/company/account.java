package com.company;

public class account {
    String NAME;
    int ACCOUNT_NUMBER;
    double BALANCE;
    String eMAIL;
    int PHONE_NUMBER;

    public account(String NAME,int ACCOUNT_NUMBER,double BALANCE,String eMAIL,int PHONE_NUMBER){
        this.NAME=NAME;
        this.ACCOUNT_NUMBER=ACCOUNT_NUMBER;
        this.BALANCE=BALANCE;
        this.eMAIL=eMAIL;
        this.PHONE_NUMBER=PHONE_NUMBER;
    }

    public String getNAME() {
        return NAME;
    }
    public int getACCOUNT_NUMBER() {
        return ACCOUNT_NUMBER;
    }

    public double getBALANCE() {
        return BALANCE;
    }
    public String geteMAIL() {
        return eMAIL;
    }

    public int getPHONE_NUMBER() {
        return PHONE_NUMBER;
    }


    public void deposit(double depositmoney){
        this.BALANCE+=depositmoney;
        System.out.println("DEPOSIT IS SUCCESSFUL  ,  NEW BALANCE ="+this.BALANCE);
    }
    public void withdraw(double withdrawalmoney){
        if(this.BALANCE==0){
            System.out.println("you have not any money to withdrawal");
        } else if (this.BALANCE-withdrawalmoney<0) {
            System.out.println("withdrawal is not possible because you have only"+this.BALANCE);
        }
        else {
            this.BALANCE-=withdrawalmoney;
            System.out.println("withdrawal successful and the current balance is"+this.BALANCE);
        }
    }

    public static void main(String[] args) {
        account a=new account("sagar",0123435,0,"s@gmail.com",0101);
      a.deposit(1095);
      a.withdraw(250);
    }
}
