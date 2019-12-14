package check;
import java.util.*;
class Stack
{   int size=0;
	Queue<Integer> q1=new LinkedList<Integer>();
	Queue<Integer> q2=new LinkedList<Integer>();
	public void push(int d)
	{
		q1.add(d);
		size++;
	}
	public void pop()
	{ int i=0;
		while(i<size-1)
		{
		  q2.add((int)q1.remove());
		  i++;
		}
		System.out.println(q1.remove());
		size--;
		while(!q2.isEmpty())
		{
		  q1.add((int)q2.remove());
		}
	}
	public void peek()
	{   int i=0;
		while(i<size-1)
		{
			q2.add((int)q1.remove());
			i++;
		}
		int a=(int)q2.remove();
		System.out.println(a);
		q2.add(a);
		q1.addAll(q2);
		q2.removeAll(q2);
		
	}
	public void isEmpty()
	{
		if(size==0)
		{
			System.out.println("true");
		}
		else
			System.out.println("false");
	}
	public void size()
	{
		System.out.println(size);
	}
}
public class stackfrom2Q {

	public static void main(String[] args) {
		                                       //*****the stack so formed is of non returning nature ***** 
    Stack s=new Stack();
    s.push(1);
    s.push(1);
    s.push(1);
    s.push(1);
    s.push(1);
    s.push(1);
    s.size();
    s.pop();
    s.isEmpty();
    s.pop();
    s.pop();
    s.pop();
    s.peek();
    s.pop();
    s.pop();
    s.isEmpty();
	}

}
