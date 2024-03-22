package Pattern;
import java.util.Scanner;
public class Pattern0While {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the values of rows : ");
        int n=sc.nextInt();
        int rows=1;
        while(rows <=n){
            // work
            System.out.print("*");
            // prepration
            System.out.print("\n");
            rows+= 1;
        }
        System.out.println("Your first Pattern Problem executed successfully using while loop ...");
    }

}
