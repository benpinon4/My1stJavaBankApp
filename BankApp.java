import java.util.Scanner;

public class BankApp {

    public static void main(String[] args) {
       BankAccount bankAccount = new BankAccount("Bobby Mcdog", "2255");
       bankAccount.showMenu();

    }

}


class BankAccount {

    int accountBalance;
    int lastTransaction;  
    String accountID;
    String customerName;

    BankAccount(String cname, String cID){
        customerName = cname;
        accountID = cID;
    
    }



    void deposit(int amount){
        if(amount != 0){
            accountBalance = accountBalance + amount;
            lastTransaction = amount;
        } 
    }

    void withdraw(int amount){
        if(amount != 0){
            accountBalance = accountBalance - amount;
            lastTransaction = -amount;
        }
    }

    void lastTrans(){
        if(lastTransaction > 0){
            System.out.println("Deposited: " + lastTransaction);

        } else if(lastTransaction < 0){
            System.out.println("Withdrew: " + Math.abs(lastTransaction));

        } else {
            System.out.println("No Transaction Occurred.");
        }
    }


    void showMenu(){
        char option = '\0';
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello and Welcome to the Banking Application");
        System.out.println("Your Account ID is: " + accountID );
        System.out.println("Your Name is : " + customerName);
        System.out.println("Please Enter an Option from the Menu Below");
        System.out.println("\n");
        System.out.println("A: Check Balance");
        System.out.println("B: Deposit");
        System.out.println("C: Withdraw");
        System.out.println("D: Previous Transaction");
        System.out.println("E: Exit");

        do {

            System.out.println("----------------------------------------------------");
            System.err.println("Please Enter an Option");
            System.out.println("----------------------------------------------------");
            char userSelection = scanner.next().charAt(0);
            option = userSelection;
            System.out.println("\n");

            switch (userSelection) {
                case 'A':
                    System.out.println("====================");
                    System.out.println("Balance: " + accountBalance);
                    System.out.println("====================");
                    System.out.println("\n");
                    
                    break;
                case 'B':
                System.out.println("====================");
                System.out.println("Please Enter Deposit Ammount");
                int depositAmount = scanner.nextInt();
                deposit(depositAmount);
                System.out.println("====================");
                System.out.println("Thank you, you deposited $" + depositAmount);
                System.out.println("====================");
                System.out.println("\n");

                    break;
                case 'C':
                System.out.println("====================");
                System.out.println("Please Enter Withdrawal Ammount");
                int withdrawAmount = scanner.nextInt();
                withdraw(withdrawAmount);
                System.out.println("====================");
                System.out.println("Thank you, you withdrew $" + withdrawAmount);
                System.out.println("====================");
                System.out.println("\n");
                    
                    break;                    
                case 'D':
                System.out.println("====================");
                lastTrans();
                System.out.println("====================");
                System.out.println("\n");
                    
                    break;
                case 'E':
                System.out.println("====================");

                System.out.println("====================");
                System.out.println("\n");

                    break;
                  
                
                default:
                System.out.println("Invalid Character Try Again");
                    break;
            }
            
            
        } while (option != 'E');
                System.out.println("Thank you for banking with us. Have a really fucking nice day.");
        

    }

}


