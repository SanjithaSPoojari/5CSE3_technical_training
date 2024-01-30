import java.util.Scanner;

public class Atm {
    private static int balance=0;
    private static int initialpin=1234;
    private static int deposit(int depositAmount)
    {
        balance=balance+depositAmount;
        return balance;
    }

    private static int withdraw(int withdrawAmount)
    {
        if(withdrawAmount<=balance)
        {
            balance=balance-withdrawAmount;
        }
        else
        {
            System.out.println("Insufficient balance.Withdarawal failed");
        }
        return balance;
    }
    private static void pinchange(int newPIN)
    {
        initialpin=newPIN;
        System.out.println("PIN changed successfully");
    }
    public static void main(String[] args) {
        
        
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Enter the account PIN");
            int enteredpin=scan.nextInt();
            if(enteredpin==initialpin)
            {
                
                int choice;
                do{
                    System.out.println("1.Deposit\n2.Withdraw\n3.Balance enquiry\n4.PIN change\n5.Exit");
                    System.out.println("Enter your choice");
                    choice=scan.nextInt();
                    switch(choice)
                    {
                        case 1:System.out.println("Enter the amount to be deposited");
                                int depositAmount=scan.nextInt();
                                balance=deposit(depositAmount);
                                System.out.println("Balance="+balance);
                                break;
                        case 2:System.out.println("Enter the amount to be withdrawed");
                                int withdrawAmount=scan.nextInt();
                                balance=withdraw(withdrawAmount);
                                System.out.println("Balance="+balance);
                                break;
                        case 3:System.out.println("Balance enquiry="+balance);
                    
                                break;
                        case 4:System.out.println("Enter the new PIN");
                                int newPIN=scan.nextInt();
                                pinchange(newPIN);
                                break;
                        case 5:System.exit(0);
                        default:System.out.println("Invalid choice");

                    }
                }while(choice!=5);
            }
        }
    }
}
