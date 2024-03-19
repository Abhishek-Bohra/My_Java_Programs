import java.sql.SQLOutput;

// revere of a number
 class Main
 {
     public static void main(String[] args) {
         int n=12345;
         while( n > 0)
         {
             int lastDigit = n%10;// to find the last digit
             System.out.print(lastDigit);
             n/=10;//to remove the last digit

         }

     }
 }