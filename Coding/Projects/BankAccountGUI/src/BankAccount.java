//Adish Shah
//Computer Science 20
//Henry Wise Wood High School
//2020-2021 Semester 1

import java.time.LocalDateTime;
import java.util.ArrayList;

//BankAccount Class
public class BankAccount {
    private String accountNumber;
    private double balance;
    private double withdrawalFee;
    private double annualInterestRate;
    private String defaultDepositMessage = "standardDeposit";
    private String defaultWithdrawMessage = "standardWithdraw";
    private ArrayList<Transaction> transactions = new ArrayList<>();
    private ArrayList<Transaction> tempTransactions = new ArrayList<>();
    private ArrayList<Transaction> tempTransactions1 = new ArrayList<>();
    private ArrayList<Transaction> tempTransactions2 = new ArrayList<>();

    //First Constructor taking one parameter (String accountNumber)
    public BankAccount(String acctNum) {
        accountNumber = acctNum;
    }

    //Second Constructor taking two parameters (String accountNumber,double initialBalance)
    public BankAccount(String acctNum, double initialBalance) {
        accountNumber = acctNum;
        balance = initialBalance;
    }
    //Third Constructor taking parameters for all instance variables
    public BankAccount(String acctNum, double initialBalance, double withDrlFee, double annualIntRate) {
        accountNumber = acctNum;
        balance = initialBalance;
        withdrawalFee = withDrlFee;
        annualInterestRate = annualIntRate;
    }

    //public methods
    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public double getWithdrawalFee() {
        return withdrawalFee;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annIntRate) {
        annualInterestRate = annIntRate;
    }

    public void setWithdrawalFee(double withDrawFee) {
        withdrawalFee = withDrawFee;
    }

    //void deposit and void withdraw public method

    public void deposit(LocalDateTime transactionTime, double amount, String description) { //overloaded deposit method with LocalDateTime transactionTime, double amount, String description
        balance = getBalance() + amount;
        Transaction transaction = new Transaction(transactionTime,amount,description);

        if(transactions.size()==0){            //if there are no transactions, add transaction
            transactions.add(transaction);

        }
        else{
            for(int i = 0 ; i < transactions.size(); i++){               //if there are transactions and transaction equals to the transaction size, then add transaction to the bottom of the list
                                                                         // otherwise, add the transaction to the specific location depending on the transaction time


                if(transactionTime.isBefore(transactions.get(i).getTransactionTime())){
                    transactions.add(i,transaction);
                    break;
                }

                if(i == transactions.size()-1){
                    transactions.add(transaction);
                    break;
                }

            }
            
        }

    }

    public void deposit(double amount){
         deposit(LocalDateTime.now(), amount, defaultDepositMessage); //overloaded deposit method
    }



    public void deposit(double amount, String description){
        deposit(LocalDateTime.now(), amount, description);   //overloaded deposit method
    }

    public void withdraw(LocalDateTime transactionTime, double amount, String description) {      //overloaded withdraw method with LocalDateTime transactionTime, double amount, String description
        balance = getBalance() - amount - getWithdrawalFee();
        Transaction transaction = new Transaction(transactionTime, amount, description);
        if (transactions.size() == 0)                                                             //if there are no transactions, add transaction
        {
            transactions.add(transaction);
        }
        else{

            for (int i = 0; i < transactions.size(); i++) {                                       //if there are transactions and transaction equals to the transaction size, then add transaction to the bottom of the list
                                                                                                 // otherwise, add the transaction to the specific location depending on the transaction time

                if (transactionTime.isBefore(transactions.get(i).getTransactionTime())) {
                        transactions.add(i, transaction);
                        break;
                }

                if(i == transactions.size()-1){
                    transactions.add(transaction);
                    break;
                }

            }



            
        }

    }
    

    public void withdraw(double amount, String description){ //overloaded withdraw method
        withdraw(LocalDateTime.now(),amount, description);

    }


    public void withdraw(double amount){
        withdraw(LocalDateTime.now(), amount, defaultWithdrawMessage);   //overloaded withdraw method
    }

    //boolean isOverDrawn() public method
    public boolean isOverDrawn(){
        if (getBalance()<0){
            return true;
        }
        else {
            return false;
        }
    }

    public ArrayList<Transaction> getTransactions(LocalDateTime startTime, LocalDateTime endTime){
        if(startTime == null && endTime != null) {
            for (int i = 0; i < transactions.size(); i++) {
                if (transactions.get(i).getTransactionTime().isBefore(endTime)){                    //add transaction if transaction happens before the end time
                    tempTransactions.add(transactions.get(i));
                }

                else if(transactions.get(i).getTransactionTime().isEqual(endTime)){                 //add transaction if transaction happens at the end time
                    tempTransactions.add(transactions.get(i));
                }
            }
            return tempTransactions;                    //return all transactions that occurred before or at the end time


        }
        else if(endTime == null && startTime != null){
            for (int i = 0; i < transactions.size(); i++) {
                if (transactions.get(i).getTransactionTime().isAfter(startTime)){                 //add transaction if transaction happens after the start time
                    tempTransactions1.add(transactions.get(i));
                }
                else if(transactions.get(i).getTransactionTime().isEqual(startTime)){             //add transaction if transaction happens at the start time
                    tempTransactions1.add(transactions.get(i));
                }
            }
            return tempTransactions1;               //return all transactions that occurred after or at the start time

        }
        else if(startTime == null && endTime == null){
            return transactions;                           //if there is no start and end time, return all transactions that occurred from the beginning

        }
        else if(startTime != null && endTime != null){         //if there is a start and end time, then return all transactions between these times and at these times if transaction(s) took place

            for (int i = 0; i < transactions.size(); i++) {
                if (transactions.get(i).getTransactionTime().isAfter(startTime) && transactions.get(i).getTransactionTime().isBefore(endTime)){
                        tempTransactions2.add(transactions.get(i));
                }

                else if(transactions.get(i).getTransactionTime().isEqual(startTime) || transactions.get(i).getTransactionTime().isEqual(endTime)){
                    tempTransactions2.add(transactions.get(i));
                }

            }
            return tempTransactions2;         //return all transactions that took place between start and end times and at these times if transaction(s) took place

        }
        return null;

    }

    // String toString() public method
    public String toString(){
        String result;

        double balance = getBalance()<0 ? Math.abs(getBalance()) : getBalance();
        if (isOverDrawn() == true)
        {
            result = String.format("BankAccount %s: ($%.2f)", getAccountNumber() ,balance);
        }
        else
        {
            result = String.format("BankAccount %s: $%.2f", getAccountNumber() ,balance);
        }
        return result;
    }

    
}
