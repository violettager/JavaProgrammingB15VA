package day40_custom_classes;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class CheckingAccount {
    double balance;
    long accountNumber;
    String accountHolder;

    public void setInfo(double pBalance, long pAccNumber, String pAccHolder) {
        balance = pBalance;
        accountNumber = pAccNumber;
        accountHolder = pAccHolder;


    }

    public void getAccountInfo(){
        System.out.println("Checking account: $"+balance+", "+accountNumber+", "+accountHolder);
    }
    public void deposit(double amount){
        System.out.println("depositing $"+amount+" to account number: "+accountNumber);
        balance+=amount;
    }
    public void withDraw(double amount){
        System.out.println("withdrawing $"+amount+" from account number: "+accountNumber);
        if (amount<=balance){
            balance-=amount;
        }else{
            System.out.println("Error: InsufficientFundsException, keep coding java");
        }

    }
    public void purchase(String item, double price){
        System.out.println("purchasing "+item+" for $"+price);
        if(price<=balance){
            System.out.println("transaction successful for "+item);
            balance -=price;
        }else{
            System.out.println("InsufficientFundsException - Overdraft fee is applied");
            balance-=(price+35);


        }
        System.out.println("Transaction completed for "+item+", current balance is: "+balance);
    }
}