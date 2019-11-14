package abc;
import java.util.*;
public class subarraySumIndexes {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(); //size of array;
		int arr[]=new int[n]; 
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		int k=sc.nextInt(); //the number with whom the sum is to be compared
      for(int i=0;i<n;i++)
      { int sum=0;
    	 for(int j=i;j<n;j++)
    	 {
    		 sum+=arr[j];
    		 if(sum==k)
    		 {
    			 System.out.println("Starting index: " + i);
    			 System.out.print("       Ending index: " + j);
    			 break;
    		 }
    	 }
      }
	}
  }
