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
 void ReverseElements()
 {
	 reverse(head);
 }
 void reverse(node current)
 {
	 node prev=null;
	 while(current.next!=null)
	 {
		 node da=current.next;
		 current.next=prev;
		 prev=current;
		 current=da;
	 }
	 current.next=prev;
	 while(current!=null)
	 {
		 System.out.println(current.data);
		 current=current.next;
	 }
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
	l.ReverseElements();
	
}
}
