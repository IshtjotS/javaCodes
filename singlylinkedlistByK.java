package abc;
import java.util.*;
class linkedl7
{
	class node
	{
		node next;
		int data;
		node(int d)
		{ 
			data=d;
			next=null;
		}
	}
	public node head=null;
	node tail=null;
	public void insert(int d)
	{
		node newnode=new node(d);
		if(head==null)
		{
			head=newnode;
			tail=newnode;
		}
		else
		{
			tail.next=newnode;
			tail=tail.next;
		}
	}
	public void shiftbNodesK(int k,int n)
	{ int i=1;
	  k=n-k;
	  node current=head;
		while(i<k)
		{
			current=current.next;
			i++;
		}
		node temp=current.next;
		node current1=temp;
		current.next=null;
		while(current1.next!=null)
		{
			current1=current1.next;
		}
		current1.next=head;
		head=temp;
		while(head!=null)
		{
			System.out.println(head.data);
			head=head.next;
		}
	}
}
public class singlylinkedlistByK {
 public static void main(String [] args) 
 {
	 Scanner sc=new Scanner(System.in);
    linkedl7 l=new linkedl7();
	 for(int i=0;i<8;i++)
	 {
		 l.insert(i);
	 }
	 int k=sc.nextInt();
	 l.shiftbNodesK(k,8);
 }
}
