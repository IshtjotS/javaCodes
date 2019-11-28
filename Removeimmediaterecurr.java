package check;
import java.util.*;
public class Removeimmediaterecurr {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
	char ch[]=s.toCharArray();
	 int i=0;
    removedup(s,i);
	}
	public static void removedup(String s,int i)
	{  int j=i+1;
	  if(j==s.length()-1 && s.charAt(i)==s.charAt(j))
     	{   System.out.println(s.charAt(j));
	    	return ;
	    }
		if(s.charAt(i)!=s.charAt(j))
		{
			System.out.print(s.charAt(i)+" ");
			if(j==s.length()-1)
			{
				System.out.println(s.charAt(j));
				return ;
			}
		}
		removedup(s,i+1);
	}

}
