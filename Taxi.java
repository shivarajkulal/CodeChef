/*
Taxi Cost
*******************
https://www.codechef.com/practice/DSAPREP_01/problems/RAIN8TEST
*/
/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t-- > 0 ){
		    int n = sc.nextInt();
		    long x = sc.nextLong();
		    
		    int a[] = new int[n];
		    
		    for (int i = 0 ; i < n ; i++ ) a[i] = sc.nextInt();
		    
		    if( n == 1 ){
		        
		        if( a[0] == 0 ){
		            System.out.println( 0);
		        }
		        else{
		            System.out.println( x );
		        }
		        
		    }
		    else{
		        
		        long count = a[0] == 0 ? 1 : 0 ;
		    
    		    for( int i = 1 ; i < n ; i++ ){
    		        if( a[i] == 0 && a[i-1] == 0 ){
    		            
    		            count++;
    		            
    		        }
    		    }
    		    
    		    count = n - count ;
    		    
    		    count *= x;
    		    
    		    System.out.println( count );
		        
		    }
		    
		}
	}
}