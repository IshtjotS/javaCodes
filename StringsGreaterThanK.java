package check;
import java.util.*;
public class StringsGreaterThanK 
{ public static void main(String[] args)
	{
 Scanner sc=new Scanner(System.in);
 int n=sc.nextInt();
 int arr[]=new int[n];
 char ch1[]=new char[n];
 for(int i=0;i<n;i++)
 {
   ch1[i]=sc.next().charAt(0);	
 }
 int k=sc.nextInt();
 String s=String.valueOf(ch1);
 System.out.println(s);
 String s1="";
 StringBuilder sb=new StringBuilder(s1);
 for(int i=0;i<n;i++)
 {
	 for(int j=i+1;j<=n;j++)
	 {
	     s1=s.substring(i,j);	
	     sb.append(s1);
	 }
 } s1=String.valueOf(sb);
  
	 int count=0;
	 char ch[]=s1.toCharArray();
	 for(int i=0;i<ch.length;i++)
	 {
	   int num=Character.getNumericValue(ch[i]);
	  
	   if(num>k)
	   {
		   count++;
	 }
 }
	 System.out.println(count);
}

}
