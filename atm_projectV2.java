import java.util.Scanner;

public class atm_projectV2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        boolean continueATM = true;

        while (continueATM) {
            System.out.println("Enter number 1 for Account inquiry");
            System.out.println("Enter number 2 to withdraw ");
            System.out.println("Enter number 3 to deposit");
            System.out.println("Enter number 0 to exit");
            System.out.println("Enter your process number");

            int PN = console.nextInt(); // رقم العملية

            switch (PN) {
                case 0:
                    // Exit the ATM
                    System.out.println("Exiting ATM. Thank you!");
                    continueATM = false;
                    break;

                case 1:
                    // Process for account inquiry
                    System.out.println("your account number : 5114 7885 1321 9781");
                    System.out.println("your card number : 2530 1960 2003 2005");
                    System.out.println("your account balance : 2,250,750");
                    System.out.println("last cash Deposit activity was on 12/12/2023");
                    System.out.println("last cash withdrawal activity was on 12/12/2023");
                    break;

                case 2:
                    // Process for withdrawal
                    System.out.println("If you want to withdraw 1000 $ press :   1");
                    System.out.println("If you want to withdraw 2000 $ press :   2");
                    System.out.println("If you want to withdraw 3000 $ press:   3");
                    System.out.println("Else press :   4");

                    int AB = 2250750;

                    System.out.println("please enter your process number:");
                    int WPN = console.nextInt();

                    switch (WPN) {
                        case 1:
                            if (AB >= 1000) {
                                AB = AB - 1000;
                                System.out.println("withdraw successful please take your money  ");
                                System.out.println("your new bank balance is :" + AB);
                            } else {
                                System.out.println("No enough balance .");
                                System.out.println("your  bank balance is :" + AB);
                            }
                            break;

                        case 2:
                            if (AB >= 2000) {
                                AB = AB - 2000;
                                System.out.println("withdraw successful please take your money  ");
                                System.out.println("your new bank balance is :" + AB);
                            } else {
                                System.out.println("No enough balance .");
                                System.out.println("your  bank balance is :" + AB);
                            }
                            break;

                        case 3:
                            if (AB >= 3000) {
                                AB = AB - 3000;
                                System.out.println("withdraw successful please take your money  ");
                                System.out.println("your new bank balance is :" + AB);
                            } else {
                                System.out.println("No enough balance .");
                                System.out.println("your  bank balance is :" + AB);
                            }
                            break;

                        case 4:
                            while (true) {
                                System.out.println("Enter the amount to withdraw: ");
                                int AoW = console.nextInt();

                                if (AoW <= AB) {
                                    if (AoW <= 20000) {
                                        System.out.println("Withdrawal successful. Please take your cash.");
                                        AB -= AoW;
                                        System.out.println("Your new balance is: " + AB);
                                        break; // Exit the loop if withdrawal is successful
                                    } else {
                                        System.out.println("Your withdrawal limit is 20,000.");
                                    }
                                } else {
                                    System.out.println("Not enough balance.");
                                    System.out.println("Your bank balance is: " + AB);
                                }
                            }
                            break;

                        default:
                            System.out.println("please, enter a valid number between 1 and 4");
                    }
                    break;

                case 3:
                    // Process for deposit
                    System.out.print("Enter the amount to deposit: ");
                    int AoD = console.nextInt();
                    AB = 2250750;
                    AB += AoD;
                    System.out.println("Deposit successful. Your new balance is: " + AB);
                    break;

                default:
                    System.out.println("Please, enter a valid number");
                    break;
            }
        }
    }
}
