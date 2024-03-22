package Pattern;
import java.util.Scanner;
public class Pattern_0UsingForLoop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of rows : ");
        int rows=sc.nextInt();
        for(int i = 1; i <= rows ; i++)
        {   // work that you want to do.....
            System.out.print("*");
            // prepration step.....
            System.out.print("\n");// or System.our.println("");

        }
        System.out.println("Your first Pattern Problem executed successfully ...");
    }
}
