package abc;
import java.util.*;
public class countfreq {

	public static void main(String[] args) 
	{ Scanner sc=new Scanner(System.in);
	  int n=sc.nextInt();
      int arr[]=new int[n];
      for(int i=0;i<n;i++)
      {
    	  arr[i]=sc.nextInt();
      }
      Duplicates(arr);
	}
static void Duplicates(int[] arr)
{
	int n=arr.length;
	Arrays.sort(arr);
	for(int i=0;i<n;i++)
	{ int count=1;
	   
		for(int j=i+1;j<n;j++)
		{ 
		  if(arr[i]==arr[j])
		  {
			  count++;i++;
		  }
		  
		}
		System.out.println(arr[i]+" : "+count);
	}
}
}
