import java.util.Scanner;

public class ATM 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int balance = 0;
        int attempts = 3;

        System.out.println("Welcome to the ATM!");
        System.out.println("Please enter your PIN:");

        for (int i = 1; i <= attempts; i++) 
        {
            int pin = scanner.nextInt();

            if (pin == 1234) {
                System.out.println("PIN accepted. Please select an option:");
                System.out.println("1. Withdraw");
                System.out.println("2. Deposit");
                System.out.println("3. Check balance");
                System.out.println("4. Transfer funds");
                System.out.println("5. Exit");
                System.out.print("Enter your choice: ");
                
                int choice = scanner.nextInt();
                while (choice != 5)
                {
                    switch (choice) 
                    {
                        case 1:
                            System.out.print("Enter amount to withdraw: ");
                            int amount = scanner.nextInt();

                            if (amount > balance) 
                            {
                                System.out.println("Insufficient balance.");
                            } 
                            else 
                            {
                                balance -= amount;
                                System.out.println("Please collect your cash.");
                            }
                            
                            break;

                        case 2:
                            System.out.print("Enter amount to deposit: ");
                            amount = scanner.nextInt();

                            balance += amount;
                            System.out.println("Deposit successful.");
                            System.out.println("Your balance is: " + balance);
                            break;

                        case 3:
                            System.out.println("Your balance is: " + balance);

                            break;

                        case 4:
                            System.out.print("Enter account number to transfer funds: ");
                            String accountNumber = scanner.next();

                            System.out.print("Enter amount to transfer: ");
                            amount = scanner.nextInt();

                            if (amount > balance) 
                            {
                                System.out.println("Insufficient balance.");
                            } 
                            else 
                            {
                                balance -= amount;
                                System.out.println("Funds transferred to account " + accountNumber + ".");
                            }

                            break;

                        default:
                            System.out.println("Invalid choice.");

                            break;
                        
                        
                    
                    }
                System.out.println("Enter your choice:");
                choice = scanner.nextInt();
                }
                return;
            } 
            else 
            {
                System.out.println("Invalid PIN. Please try again.");
            }
        }

        System.out.println("Maximum attempts exceeded. Please try again later.");
    }
}
