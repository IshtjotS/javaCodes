package check;
import java.util.*;
public class ArrSumEqualtoX {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
        int m=sc.nextInt();
        int arr[]=new int[n];
        int arr1[]=new int[m];
        for(int i=0;i<n;i++)
        	arr[i]=sc.nextInt();
        for(int i=0;i<n;i++)
        	arr1[i]=sc.nextInt();
        int x=sc.nextInt();
        for(int i=0;i<n;i++)
        {
        	for(int j=0;j<m;j++)
        	{
        		if(arr[i]+arr1[j]==x)
        		{
        			System.out.println(i+","+j);
        		}
        	}
        }
	}

}
