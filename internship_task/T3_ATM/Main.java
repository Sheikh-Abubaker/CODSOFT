import java.util.Scanner;

class bankAccount {

    double balance;

    public bankAccount (double initialBalance) {

        this.balance = initialBalance;

    }

    public double getBalance() {

        return balance;

    }

    public void deposit(double amount){

        balance = balance + amount;

    }

    public void withdraw (double amount){

        if (amount>balance){

            System.out.println("Sorry!!Insuficient funds");

        }

        else {

            balance = balance - amount;
            System.out.println("Withdrawl successfull, remaining balance is: $"+ balance);

        }

    }

}

class ATM {

    bankAccount userAccount;

    public ATM (bankAccount userAccount){

        this.userAccount = userAccount;

    }

    public void display() {

        System.out.println("ATM Menu:");
        System.out.println("1. Withdraw");
        System.out.println("2. Deposit");
        System.out.println("3. checkBalance");
        System.out.println("4. Exit");

        System.out.println("Enter your choice");
        Scanner sc = new Scanner(System.in);
        int ch = sc.nextInt();

        switch(ch) {

            case 1:
                withdraw();
                break;
            case 2:
                deposit();
                break;
            case 3:
                checkBalance();
                break;
            case 4:
                System.out.println("Exiting ATM. Thank you!");
                System.exit(0);
                break;
            default:
                System.out.println("Invalid choice");     

        }
    }

    private void withdraw(){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the withdrawl amount: $");
        double amount = sc.nextDouble();
        userAccount.withdraw(amount);
    }

    private void deposit(){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount to deposit: $");
        double amount = sc.nextDouble();
        userAccount.deposit(amount);
        System.out.println("Deposit Successfull. Updated Balance: $"+userAccount.getBalance());

    }

    private void checkBalance(){

        System.out.println("Current Balance: $"+userAccount.getBalance());

    }
}

public class Main{

    public static void main (String[] args){

        bankAccount userAccount = new bankAccount(1000);

        ATM atm = new ATM(userAccount);

        while (true){

            atm.display();

        }

    }
}