/*
Attack on Kingdom
******************
https://www.codechef.com/practice/DSAPREP_01/problems/KNGATK
*/


import java.util.Scanner;
import java.util.Arrays;
class Codechef
{
	public static void main (String[] args)
	{   
	     
	 Scanner in = new Scanner(System.in);
	 
	 int test,totalDays;
	 test=in.nextInt();
	
	 while(test!=0){
	     
	      totalDays=in.nextInt();
	      int[] temp=new int[totalDays];
	      
	      for(int i=0;i<totalDays;i++){
	          temp[i]=in.nextInt();
	      }
	      
	      Arrays.sort(temp);
	     
	         System.out.println(temp[1]);
	     test--;
	 }
	
        
     }
    
}
	
