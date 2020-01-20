package abc;
import java.util.*;
 public class ANAGRAM
 {
	 public static void main(String args[])
	 {  Scanner sc=new Scanner(System.in);
		ArrayList<Character> al=new ArrayList();
        String a=sc.nextLine();
        String b=sc.nextLine();
        for(int i=0;i<a.length();i++)
        {
        	al.add(a.charAt(i));
        }
        for(int i=0;i<b.length();i++)
        {
        	al.remove(new Character (b.charAt(i)));
        }
        if(al.isEmpty())
        {
        	System.out.println("analgram");
        	
        }
        else
        	System.out.println("not");
	 }
 }