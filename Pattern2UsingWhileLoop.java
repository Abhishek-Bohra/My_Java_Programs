package Pattern;
import java.util.Scanner;
public class Pattern2UsingWhileLoop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n : ");
        int n=sc.nextInt();
        int nst=1;// number of stars
        int rows=1;
        while(rows <= n)
        {
            int cst=1;// count of stars
            while(cst <=nst)
            {
                System.out.print("*");
                cst++;
            }
            System.out.println(" ");
            //nst+=1;
            rows+=1;
        }

    }
}
