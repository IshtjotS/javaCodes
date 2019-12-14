package practice;
import java.util.*;
class tree
{
	class node
	{
		node left;
		node right;
		int data;
		public node(int d)
		{   
			left=null;
			right=null;
			data=d;
		}
	}
	public node root=null;
	public void insert2(int d)
	{   
		root=insert(root,d);
	}
	public node insert(node root,int d)
	{ node newnode=new node(d);
		if(root==null)
		{
			root=newnode;
			return root;
		}
		else
		{
			if(root.data>d)
				root.left=insert(root.left,d);
			if(root.data<d)
				root.right=insert(root.right,d);
		}
		return root;
	}
	public void h()
	{
		int p=height(root);
		System.out.println(p);
	}
	public int height(node root)
	{
		int max=0;
		if(root==null)
			return max;
		if(root.left==null && root.right==null)
			return max+1;
			int h1=height(root.left);
			int h2=height(root.right);
			if(h1>h2)
			{
				max=h1;
			}
			else
			{ 
				max=h2;
			}
			
		
		return max+1;
	}
}
public class treeheight {

   public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	tree t=new tree();
	t.insert2(3);
	t.insert2(2);
	t.insert2(1);
	t.insert2(4);
	t.insert2(5);
	t.h();
}
}
