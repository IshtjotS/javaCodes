package fhm123;
import java.util.*;
public class stringreversewithoutspecial {
     public static void main(String[] args) 
      { Scanner sc=new Scanner(System.in);
		  String s=sc.nextLine();
		  
		  ArrayList al=new ArrayList();
		  ArrayList al2=new ArrayList();
		  ArrayList al1=new ArrayList();
		  int c=0;
		  for(int i=0;i<s.length();i++)
		  {
		  if(((int)s.charAt(i)>=32 && (int)s.charAt(i)<=47) || ((int)s.charAt(i)>57 && (int)s.charAt(i)<65) || ((int)s.charAt(i)>91 && (int)s.charAt(i)<96) ||((int)s.charAt(i)>123 && (int)s.charAt(i)<126))
		   {
			  al.add(s.charAt(i)); //character al
			  al2.add(i);  //integer al
			  c++;
		  }
		  else
		  {
			  al1.add(s.charAt(i)); //character al 
		     }
		 
		  }
		/*
		 * int check=0;
		 * 
		 * while(!al.isEmpty()) {
		 * 
		 * System.out.println(al.get(check)); check++; }
		 */ 
		  int n=al1.size();
		  char ch[]=new char[n];
		  for(int i=0;i<n;i++) {
		   ch[i]=(char)al1.remove(0);
		  }
		  s=String.valueOf(ch);
		  StringBuilder sb=new StringBuilder(s);
		  sb.reverse();
		  s=String.valueOf(sb);
		  char ch1[]=s.toCharArray();
		  for(int i=0;i<ch1.length;i++)
		  {
			  al1.add(ch1[i]);
		  }
		/*
		 * int check=0;
		 * 
		 * while(!al1.isEmpty()) {
		 * 
		 * System.out.println(al1.get(check)); check++; }
		 */
		  int p=al.size();
		  for(int i=0;i<p;i++)
		  al1.add((int)al2.remove(0),(char)al.remove(0));
		 char ch2[]=new char[al1.size()];
		  for(int i=0;al1.size() > 0;i++)
		  {
			  System.out.println(al1.size());
			  ch2[i]=(char)al1.remove(0);
		  }
		  s=String.valueOf(ch2);
		  System.out.println(s);
		 }

}

