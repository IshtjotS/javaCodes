package check;
import java.util.*;
public class LargestByK {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
       int arr[]=new int[n];
       for(int i=0;i<n;i++)
       {
    	   arr[i]=sc.nextInt();
       }
       int k=sc.nextInt();
       int largest=0;
       for(int i=0;i<n;i++)
        {  if(k>=n)
           {
        	break;
           }
        largest=arr[i];
    	  for(int j=i+1;j<=k;j++)
    	  { 
    	   if(largest<arr[j])
    	    { 
    			largest=arr[j];
    		}
    	   }
    	   System.out.print(" "+largest);
    	   largest=0;
    	   k++;
        }
	}
}