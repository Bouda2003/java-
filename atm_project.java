import java.util.Scanner;

public class atm_project {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

            System.out.println("Enter number 1 for Account inquiry");
            System.out.println("Enter number 2 to withdraw ");
            System.out.println("Enter number 3 to deposit");
        while (true) {
            System.out.println("Enter your process number");
            int PN = console.nextInt(); // رقم العملية

            switch (PN) {
                case 1:
                    // عملية استعلام حساب
                    System.out.println("your account number : 5114 7885 1321 9781");
                    System.out.println("your card number : 2530 1960 2003 2005");
                    System.out.println("your account balance : 2,250,750");
                    System.out.println("last cash Deposit activity was on 12/12/2023");
                    System.out.println("last cash withdrawal activity was on 12/12/2023");
                    break;

                case 2:
                    // عملية السحب
                    System.out.println("If you want to withdraw 1000 $ press :   1");
                    System.out.println("If you want to withdraw 2000 $ press :   2");
                    System.out.println("If you want to withdraw 3000 $ press:   3");
                    System.out.println("Else press :   4");
                    int AoW = console.nextInt();
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
                            System.out.print("Enter the amount to withdraw: ");
                            if (AoW <= AB) {
                                if (AoW <= 10000) {
                                    System.out.println("Withdrawal successful. Please take your cash.");
                                    AB -= AoW;
                                    System.out.println("your new balance is: " + AB);
                                } else {
                                    System.out.println("Your withdraw limit is 10,000.");
                                }
                            } else {
                                System.out.println("No enough balance .");
                                System.out.println("your  bank balance is :" + AB);
                            }
                            break;

                        default :
                                System.out.println("Invalid process number. Please try again.");
                            break;
                    }

                 break;

                case 3:
                    // عملية الإيداع
                    System.out.print("Enter the amount to deposit: ");
                    int AoD = console.nextInt();
                    AB = 2250750;
                    AB += AoD;
                    System.out.println("Deposit successful. Your new balance is: " + AB);
                    break;
            }
        }
    }
}