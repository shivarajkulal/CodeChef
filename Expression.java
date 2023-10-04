/*
Three Number Expression
***********************
https://www.codechef.com/practice/DSAPREP_01/problems/EXPRESSION_3
*/


import java.util.Scanner;

class Codechef
{
	public static void main (String[] args)
	{   
	     Scanner in = new Scanner(System.in);
	     int t = in.nextInt();

	     while(t>0){
	         long[] a = new long[3];
	         for(int i=0;i<3;i++){
	              a[i]=in.nextLong();
	         }
           
        if( a[0]==a[1]+a[2]||a[0]==a[1]-a[2]||a[0]==-a[1]+a[2]||a[0]==-a[1]-a[2]){
            System.out.println("YES");
          }
        else{
          System.out.println("NO");
          }     
	         
	         t--;
	     }
    }
    
}
	
