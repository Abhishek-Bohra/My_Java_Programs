package Pattern;
import java.util.Scanner;
public class Pattern1UsingWhileLoop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n : ");
        int n= sc.nextInt();
        int rows =1;
        while(rows <= n)
        {    // work
             int col =1;
             while(col <= n)
             {
                 System.out.print("*");
                 col+=1;
             }
             // prepration
            System.out.println(" ");
            rows+= 1;
;
        }

    }
}
