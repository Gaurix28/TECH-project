package task8;

import java.util.*;

class ATM{
    int accountNUm;
    // String firstName;
    // String lastName;
    // String fullName=firstName+lastName;
    int pin=1728 ;
    float balance;
    
    public void checkPin(){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter your PIN: ");
        int enteredPin = sc.nextInt();
        if (enteredPin==pin){
            menu();
            
        }else{
            System.out.print("Enter a valid PIN.");
        }
    }

    public void menu(){
        System.out.println("Choices:\n1: Check A/c Balance\n2: Withdraw money\n3: Deposite money\n4: Exit");

        Scanner sc = new Scanner(System.in);
        int opt=sc.nextInt();
        if (opt==1){
            checkBalance();
        }
        else if (opt==2) {
            withdrawMoney();

        }
        else if (opt==3){
            depositeMoney();
        }
        else if(opt==4){
            return;
        }
        else{
            System.out.print("Enter a valid choice.");
        }
           
        
    }

    public void checkBalance(){
        System.out.println("Balance: "+balance);
        menu();
    }
    public void withdrawMoney(){
        System.out.print("Enter amount to withdraw: ");
        Scanner sc= new Scanner(System.in);
        float amount= sc.nextFloat();
        if ( amount>balance){
            System.out.println("Insufficient Balance.");

        }
        else{
            balance=balance-amount;
            System.out.println("Money withdrawl succesfull. ");

        }
        menu();


    }
    public void depositeMoney(){
        System.out.print("Enter the amount: ");
        Scanner sc = new Scanner(System.in);
        float amount=sc.nextFloat();
        balance=balance+amount;
        System.out.println("Money deposited successfully.");
        menu();
    }


}
public class ATMmachine{
    public static void main(String[] args) {
        ATM obj = new ATM();
        obj.checkPin();
    }
}