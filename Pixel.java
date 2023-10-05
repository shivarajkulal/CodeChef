/*
Pixel Damage
************
https://www.codechef.com/practice/DSAPREP_01/problems/PIXDAM

*/
import java.util.Scanner;
import java.lang.Math;
class Codechef
{
	public static void main (String[] args)
	{   
	     Scanner in = new Scanner(System.in);
	     int t = in.nextInt();
	     while(t-->0){
	         
	         double h = in.nextDouble();
	         double w = in.nextDouble();
	         double x = in.nextDouble();
	         double y = in.nextDouble();
	         double k = in.nextDouble();
             double d = Math.sqrt(Math.pow(w - x, 2) + Math.pow(h - y, 2));
             if(d>=k){
                 System.out.println("0");
             }
             else{
                 System.out.println("1");
             }
	     }
    }
    
}
	
