package check;
import java.util.*;
class linkedlist{
	class node
	{
		node next;
		char data;
		node(char d)
		{ 
			data=d;
			next=null;
		}
	}
	public node head=null;
	int size=0;
	node tail=null;
	public void insert(char d)
	{
		node newnode=new node(d);
		if(head==null)
		{
			head=newnode;
			tail=newnode;
			size++;
		}
		else
		{
			tail.next=newnode;
			tail=tail.next;
			size++;
		}
	}
	static int c=0;
	void checkp()
	{ 
	checkpalin(head);
	}
	void checkpalin(node current)
	{   if(current==null)
	   {
		return ;
	   }
		
	   checkpalin(current.next);
	if(head.data==current.data)
	{
		c++;
	}
	head=head.next;
	if(head==null)
		{if(c==size)
		{
			System.out.println("pallindrome");
		}
		else
			System.out.println("not pallindrome");
		}
	return ;
    }

}
public class singlylinkedlistpalin {
public static void main(String[] args) {
	linkedlist l=new linkedlist();
	l.insert('n');
	l.insert('a');
	l.insert('m');
	l.insert('a');
	l.insert('p');
	l.checkp();
	
}
}
