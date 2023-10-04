/*
Lucky Number
************
https://www.codechef.com/practice/DSAPREP_01/problems/LUCNUM
*/
import java.util.Scanner;

class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T > 0) {
            long num = sc.nextLong();
            int count = 0;

           if(num>0){
                // Count the number of times num is divisible by 2
                while (num % 2 == 0) {
                    count++;
                    num = num / 2;
                }

                // Check if count is even or odd and print accordingly
                if (count % 2 == 0) {
                    System.out.println("1");
                } else {
                    System.out.println("0");
                }
            }

            T--;
        }
    }
}
