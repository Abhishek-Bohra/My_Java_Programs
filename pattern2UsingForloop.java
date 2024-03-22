package Pattern;
import java.util.Scanner;

public class pattern2UsingForloop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int nst=1;
        for (int rows=1; rows<=n; rows++) {
            for(int cst=1;cst<=nst;cst++) {
                System.out.print("*");
            }
            System.out.println();
            nst+=1;
        }
    }
}
