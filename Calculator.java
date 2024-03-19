import java.util.Scanner;
public class Calculator {
    public static void main(String[] a)
    {Scanner sc=new Scanner(System.in);
        double x,y;
        char opr;
        System.out.println("Enter the numbers : ");
        x=sc.nextInt();
        y=sc.nextInt();
        System.out.println("Enter the operator.");
        System.out.println("+ for the addition.");
        System.out.println("- for the subtraction.");
        System.out.println("/ for the division.");
        System.out.println("* for the multiplication.");
        System.out.println("% for the Remainder.");

        opr=sc.next().charAt(0);

        switch(opr)
        {
            case '+': System.out.println(x+y);
                        break;
            case '-': System.out.println(x-y);
                break;
            case '/': System.out.println(x/y);
                break;
            case '*': System.out.println(x*y);
                break;
            case '%': System.out.println(x%y);
                break;

        }



    }
}
