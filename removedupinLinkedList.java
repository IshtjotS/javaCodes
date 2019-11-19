package abc;
import java.util.*;
class linkedl
{
	class node
	{
		node next;
		int data;
		node(int d)
		{ 
			data=da;
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
	public void removedup()
	{
		node current=head;
		node current2=head;
		while(current.next!=null)
		{   current2=current.next;
			while(current2!=null)
			{
				if(current.data>current2.data)
				{
					int temp=current2.data;
					current2.data=current.data;
					current.data=temp;
				}
				current2=current2.next;
			}
			current=current.next;
		}
		current=head;
		current2=head;
		while(current.next!=null)
		{
			current2=current.next;
			while(current2!=null)
			{
				if(current.data==current2.data)
				{
					current.next=current2;
				}
				else
				{
					break;
				}
				current2=current2.next;
			}
			current.next=current2;
			current=current.next;
			if(current==null)
			{
				break;
			}
		}
		while(head!=null)
		{
			System.out.println(head.data);
			head=head.next;
		}
	}
}
public class removedupinLinkedList {
	public static void main(String[] args)
	{  Scanner sc=new Scanner(System.in);
	  linkedl l=new linkedl();
	  int arr[]=new int[6];
	  for(int i=0;i<6;i++)
	  {
		  arr[i]=sc.nextInt();
	  }
	  for(int i=0;i<6;i++)
	  {
		  l.insert(arr[i]);
	  }
	  l.removedup();
	}
}
