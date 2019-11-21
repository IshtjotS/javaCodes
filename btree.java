package abc;
import java.util.*;
public class btree {
class node
{ int data;
  node left; 
  node right;
  public node(int d)
  { data=d;
    left=null;
	right=null;
  }
}
public node root=null;
public void insert(int d) {
	root=insert2(root,d);
	}
public node insert2(node root,int d) 
{  node newnode= new node(d);
	if(root==null)
	{
		root=newnode;
		return root;
	}
	else
	  { if(root.data>d)
	    {
		  root.left=insert2(root.left,d);
	    }
		if(root.data<d)
		{
			root.right=insert2(root.right,d);
		}
	  }
	return root;
   
}
public void inorder(node root)
{ try {inorder(root.left);
  System.out.println(root.data);
  inorder(root.right);
    }
catch(Exception e)
{
	System.out.println(root.data);
}
}
public static void main(String[]args)
{ Scanner sc=new Scanner(System.in);
	btree b=new btree();
	int arr[]=new int[8];
	for(int i=0;i<8;i++)
	{
		arr[i]=sc.nextInt();
	}
	for(int i=0;i<7;i++)
	{
		b.insert(arr[i]);
	}
	b.inorder(b.root);
	ArrayList al=new ArrayList<Integer>();
}
}
