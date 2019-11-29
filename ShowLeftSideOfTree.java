package check;
import java.util.*;
class tree
{
	class node{
		int data;
		ArrayList<node> child;
		public node(int d)
		{
			data=d;
			child=new ArrayList<>();
		}
	}
	public node root=null;
	public void insert(int d)
	{ Scanner sc=new Scanner(System.in);
		node newnode=new node(d);
		 root=newnode;
	   Queue<node> q=new LinkedList<node>();
	   q.add(newnode);
	   while(!q.isEmpty())
	   {
		   node frontnode=q.remove();
		   System.out.println("enter children for "+frontnode.data);
		   int children=sc.nextInt();
		   for(int i=0;i<children;i++)
		   { System.out.println("Enter data for "+i+"th child"+" of parent"+frontnode.data);
		     node temp=new node(sc.nextInt()); 
		     frontnode.child.add(temp);
			   q.add(temp);
		   }
	   }
	}
	public void show_leftsideoftree()
	{ Queue<node> q =new LinkedList<>();
		q.add(root);
		System.out.println(root.data);
		while(!q.isEmpty())
		{
			node frontnode=q.remove();
			for(int i=0;i<frontnode.child.size();i++)
			{   if(i==0)
				System.out.println(frontnode.child.get(i).data);
			    q.add(frontnode.child.get(i));
			}
		}
	}
}
public class ShowLeftSideOfTree {

	public static void main(String[] args) {
		tree t=new tree();
		Scanner sc=new Scanner(System.in);
		 t.insert(sc.nextInt());
         t.show_leftsideoftree();
	}

}
