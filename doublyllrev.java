package check;
import java.util.*;
class doublyll
{
	class node
	{
		node next;
		node prev;
		int data;
	public node(int d)
	{
		data=d;
		next=null;
		prev=null;
	}
	}
	node head=null;
	node tail=null;
	public void insert(int d)
	{   
		node newnode=new node(d);
		if(head==null)
		{
			
			tail=newnode;
			tail.prev=head;
			head=newnode;
			
		}
		else
			{  
			tail=newnode;
			tail.prev=head;
			head=tail;
			tail=tail.next;
			}
	}
	public void rev()
	{
		while(head!=null)
		{   System.out.println(head.data);
			head=head.prev;
		}
	}
}
public class doublyllrev {

	public static void main(String[] args) {
		doublyll l=new doublyll();
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt(); //enter the elements;
         for(int i=0;i<n;i++)
         {
        	 l.insert(sc.nextInt());
         }
         l.rev();
	}

}
