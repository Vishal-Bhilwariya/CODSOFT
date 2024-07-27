//  <<<<<<<<<<<<<<<<     TASK 3 -> ATM INTERFACE    >>>>>>>>>>>>>>>>>
// 1.Create a class to represent the ATM machine.
// 2. Design the user interface for the ATM, including options such as withdrawing, depositing, and checking the balance.
// 3. Implement methods for each option, such as withdraw(amount), deposit(amount), and checkBalance().
// 4. Create a class to represent the user's bank account, which stores the account balance.
// 5. Connect the ATM class with the user's bank account class to access and modify the account balance.
// 6. Validate user input to ensure it is within acceptable limits (e.g., sufficient balance for withdrawals).
// 7. Display appropriate messages to the user based on their chosen options and the success or failure of their transactions.

import java.util.Scanner;

public class ATM_MACHINE {

    public static void main(String[] args) {
        BankAccount userAccount = new BankAccount(1000.0f); 
        ATM atm = new ATM(userAccount); 
        atm.run();
    }
}

// BANK ACCOUNT DATA STORED HERE
class BankAccount {
    private float balance_amt;

    public BankAccount(float initial_balance) {
        this.balance_amt = initial_balance; 
    }

    // function to get balance
    public float Get_Balance() { 
        return balance_amt;
    }

    // function to deposit money into your account
    public void Deposit_Money(float deposit_amt) { 
        if (deposit_amt > 0) {
            balance_amt = balance_amt + deposit_amt; 
            System.out.println("MONEY DEPOSITED SUCCESSFULLY\nTOTAL BALANCE: " + balance_amt + "/-");
        } else {
            System.out.println("Invalid amount.");
        }
    }

    // function to withdraw money from your account
    public boolean Withdraw_Amount(float withdraw_amt) { 
        if (withdraw_amt > 0) {
            if (withdraw_amt <= balance_amt) {
                balance_amt -= withdraw_amt;
                System.out.println("AMOUNT WITHDRAWN SUCCESSFULLY\nBalance left: " + balance_amt + "/-");
                return true;
            } else {
                System.out.println("<INVALID AMOUNT> - Withdraw amount is more than balance in account.");
            }
        } else {
            System.out.println("<INVALID AMOUNT> - Negative values not allowed.");
        }
        return false;
    }
}

// ATM interface
class ATM {
    private BankAccount bankAccount;

    public ATM(BankAccount bankAccount) { 
        this.bankAccount = bankAccount;
    }

    public void display() {
        System.out.println("--------------------------------------------------");
        System.out.println("Welcome to the ATM!");
        System.out.println("1) Want to \"Check Balance\"? If yes, enter 1");
        System.out.println("2) Want to \"Deposit money\"? If yes, enter 2");
        System.out.println("3) Want to \"Withdraw money\"? If yes, enter 3");
        System.out.println("4) Want to \"Exit\"? If yes, enter 4");
        System.out.println("--------------------------------------------------");
    }

    public void run() {
        Scanner sc = new Scanner(System.in);

        while (true) { 
            display();
            System.out.print("Choose your choice (1, 2, 3, 4): ");
            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.println(".........................................");
                System.out.println("BALANCE: " + bankAccount.Get_Balance());
                System.out.println(".........................................");
            }
            else if (choice == 2) {
                System.out.println(".........................................");
                System.out.print("Enter amount: ");
                Float deposit = sc.nextFloat();
                bankAccount.Deposit_Money(deposit); 
                System.out.println(".........................................");
            }
            else if (choice == 3) {
                System.out.println(".........................................");
                System.out.print("Enter withdraw amount: ");
                int withdraw_amount = sc.nextInt();
                boolean withdraw_success = bankAccount.Withdraw_Amount(withdraw_amount); 
                if (withdraw_success) {
                    System.out.println("WITHDRAW SUCCESS");
                }
                System.out.println(".........................................");
            }
            else if (choice == 4) {
                System.out.println(".........................................");
                System.out.println("THANK YOU FOR USING ATM. \nExit");
                System.out.println(".........................................");
                break;
            }
            else{
                System.out.println("<Invalid choice> - you can only choose any from (1, 2, 3, 4) only");
            }
        }
    }
}
