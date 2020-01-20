package abc;
import java.util.*;
public class pythagorasTriplets {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int testcases=sc.nextInt();
		int c=0;
		while(c<testcases)
		{
			int n=sc.nextInt();
		
			int arr[]=new int[n];
		
			for(int i=0;i<n;i++)
		     {
			  arr[i]=sc.nextInt();
			 }
		  Arrays.sort(arr);
		  for(int i=0;i<n;i++)
		  {
			  for(int j=i+1;j<n;j++)
			  {
				  for(int z=j+1;z<n;z++)
				  {
					  if((Math.pow(arr[i],2)+Math.pow(arr[j], 2))==Math.pow(arr[z], 2))
					  {
						  System.out.println("Yes"+" "+arr[i]+","+arr[j]+","+arr[z]);
					  }
				  }
			  }
		  }
	    }

}
}
