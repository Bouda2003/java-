import java.util.Scanner;
public class test2
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        System.out.println("Add your statement");
        String S = console.nextLine();
        System.out.println("Enter how many times you want to repeat it");
        int num = console.nextInt();
        if (num <= 0 )
        {
            System.out.println("invalid number use positive numbers only and bigger than 0 ");
        }
            else
            {
                for ( int i = 1; i <= num ; i++)
                {
                    System.out.println(String.valueOf(S) + i);        
            }
        }
    }
} 