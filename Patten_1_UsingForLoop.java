package Pattern;
import java.util.Scanner;
public class Patten_1_UsingForLoop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Enter the value of  n : ");
        for(int rows =1;rows<=n;rows++)
        {
            for(int col=1;col<=n;col++)
            {
                System.out.print("* ");
            }
            System.out.println(" ");
        }


    }
}
