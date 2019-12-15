package check;
import java.util.*;
 class BST
 {
	 class node{
		 int data;
		 node left;
		 node right;
		 public node(int d)
		 {
			 data=d;
			 left=null;
			 right=null;
		 }
	 }
	 public node root=null;
	 public void insert(int d)
	 {
		  root=insert2(d,root);
	 }
	 public node insert2(int d,node root)
	 {
		 node newnode=new node(d);
		 if(root==null)
		 {
			 root=newnode;
			 return root;
		 }
		 else
		 {
			 if(root.data<d)
			 {
				 root.right=insert2(d,root.right);
			 }
			 if(root.data>d)
			 {
				 root.left=insert2(d,root.left);
			 }
		 }
		 return root;
	 }
	 void delete(int d)
	 {
		 Queue<node> q=new LinkedList<node>();
		 q.add(root);
		 while(!q.isEmpty())
		 {
			 node frontnode=q.remove();
			 if(frontnode.left!=null)
			 {
				 if(frontnode.left.data==d)
				 {
					 frontnode.left=null;
				 }
				 else
				 {
					 q.add(frontnode.left);
				 }
			 }
			 if(frontnode.right!=null)
			 {
				 if(frontnode.right.data==d)
				 {
					 frontnode.right=null;
				 }
				 else
					 q.add(frontnode.right);
			 }
		 }
	 }
	 void dispInorder()
	 {
		 displayInorder(root);
	 }
	 void displayInorder(node root)
	 {
		 if(root==null)
			 return;
		 displayInorder(root.left);
		 System.out.println(root.data);
		 displayInorder(root.right);
		 return;
	 }
	 }
public class deleteElements {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		BST b=new BST();
        int arr[]=new int[7];
        for(int i=0;i<7;i++)
        {
        	b.insert(sc.nextInt());
        }
       b.delete(2);
       b.dispInorder();
	}

}
