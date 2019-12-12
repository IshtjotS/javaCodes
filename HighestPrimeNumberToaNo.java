package abc;
import java.util.*;
public class HighestPrimeNumberToaNo {

	public static void main(String[] args) 
	{  Scanner sc=new Scanner(System.in);   //program to display highest prime factor to a number
      int n=sc.nextInt();
      int l=0;
      for(int i=1;i<n;i++)
      { int c=0;
    	  if(n%i==0)
    	  {
    		  for(int j=1;j<i;j++)
    		  {
    			  if(i%j==0)
    			  {
    				  c++;
    			  }
    			  
    		  }
    		  if(c<2)
    		  {
    			  if(i>l)
    			  {
    				  l=i;
    			  }
    		  }
    	  }
      }
      System.out.println(l);
	}
}

