/*
Emotional Proximity
********************
https://www.codechef.com/practice/DSAPREP_01/problems/EMPR
*/
import java.util.Scanner;

class Codechef {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        while (t-- > 0) {
            double p = in.nextDouble();
            double x = in.nextDouble();
            double y = in.nextDouble();
            double z = in.nextDouble();

            if (z == 0) {
                p-= (x * p) / 100.0; // Deduct a percentage of x
                System.out.printf("%.10f\n", p);
            } else if (z == 1) {
                p += (y * p) / 100.0; // Add a percentage of y
                System.out.printf("%.10f\n", p);
            }
        }
    }
}
