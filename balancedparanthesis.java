package abc;
import java.util.*;
public class balancedparanthesis {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String st=sc.nextLine();
		Stack s=new Stack();
        for(int i=0;i<st.length();i++)
        {
        	if(st.charAt(i)=='{' || st.charAt(i)=='(' || st.charAt(i)=='[')
        	{
        		s.push(st.charAt(i));
        	}
        	if(st.charAt(i)=='}')
        		{
        		   if((char)s.pop()!='{')
        		   {
        			   break;
        		   }
        		}
        	if(st.charAt(i)==')')
    		{
    		   if((char)s.pop()!='(')
    		   {
    			   break;
    		   }
    		}
        	if(st.charAt(i)==']')
    		{
    		   if((char)s.pop()!='[')
    		   {
    			   break;
    		   }
    		}
        }
        if(!s.isEmpty())
        {
        	System.out.println("not balanced");
        }
        else
        	System.out.println("balanced");
	}

}
