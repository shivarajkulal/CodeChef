/*Color the Cube
*********************
https://www.codechef.com/practice/DSAPREP_01/problems/COLOR8TEST
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{   
	   Scanner sc = new Scanner(System.in);
	   long[] a = new long[6];
	   for(int i=sc.nextInt();i>0;i--){
	    long sum = 0;
        long n = sc.nextLong();
        for(int j=0;j<6;j++){
           a[j] = sc.nextLong();
           sum+=a[j];
        }
        System.out.println((long)(Math.ceil((float)n/2))*sum);
	   }
     }
}

