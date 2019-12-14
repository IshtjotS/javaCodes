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
	 public void displaylevelorder()
	 {   
		 Queue<node> q=new LinkedList<node>();
		 q.add(root);
		 while(!q.isEmpty())
		 { node frontnode=q.remove();
		    int c=0;
		    System.out.println(frontnode.data);   
			    if(frontnode.left!=null)
			    	{
			    		q.add(frontnode.left);
				     }
			    if(frontnode.right!=null)
			    {
			    	q.add(frontnode.right);
			    }
		}
	 }
	 void displaypreorder1()
	 {
		displaypreorder(root);
	 }
	 void displaypreorder(node root)
	 {    
			 if(root==null)
			 {
				 return ;
			 }
			 System.out.println(root.data);
		 displaypreorder(root.left);
		 displaypreorder(root.right);
	      return ;
	}
	 void countnodes()
	 {
		 Queue<node> q=new LinkedList<node>();
		 q.add(root);
		 int count=0;
		 while(!q.isEmpty())
		 {
			 node frontnode=q.remove();
			 count++;
			 if(frontnode.left!=null)
			 {
				 q.add(frontnode.left);
			 }
			 if(frontnode.right!=null)
			 {
				 q.add(frontnode.right);
			 }
		 }
		 System.out.println(count);
	 }
	
 }
public class Btreeinpreorder {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		BST b=new BST();
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
        	arr[i]=sc.nextInt();
        }
        int r=(n-1)/2;
        b.insert(arr[r]);
       int arr2[]=new int[n-1];
       int j=0;
        for(int i=0;i<n;i++)
        {
        	if(i!=r)
        	{
        		arr2[j]=arr[i];
        		j++;
        	}
        }
       Arrays.sort(arr2);
       for(int i=0;i<n-1;i++)
       {
    	   b.insert(arr2[i]);
       }
      
       b.countnodes();
	}

}
