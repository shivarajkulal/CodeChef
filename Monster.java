/*
Defeat The Monster 1
********************
https://www.codechef.com/practice/DSAPREP_01/problems/MONSTER1

*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int T = scanner.nextInt();
        
        while (T > 0) {
            long H = scanner.nextLong();
            long X = scanner.nextLong();
            long Y = scanner.nextLong();
            
            if ( X>Y) {
                System.out.println("1");
            } else {
                System.out.println("0");
            }
            
            T--;
        }
        
        scanner.close();
    }
}
