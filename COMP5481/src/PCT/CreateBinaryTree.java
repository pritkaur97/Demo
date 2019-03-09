package PCT;

import java.util.Scanner;

class Node
	{
		int key;
		Node left,right;
		
		public Node(int item) {
			key= item;
			left= right= null;
		}
	}
	class CreateBinaryTree
	{
		Node root;
		CreateBinaryTree(int key)
		{
			root= new Node(key);
			
		}
		CreateBinaryTree()
		{
			root= null;
		}
	
	void printPostOrder()
	{
		printPostOrder(root);
		}
	void printPreOrder() {
		printPreOrder(root);
	}
	void printInOrder()
	{
		printInOrder(root);
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		//int i=0;
		//for(i=0; i>0; i++) {
		int key=sc.nextInt();
		int left=sc.nextInt();
		int right=sc.nextInt();
		
		CreateBinaryTree tree=new CreateBinaryTree();
		tree.root= new Node(key);
		tree.root.left= new Node(left);
		tree.root.right= new Node(right);
		tree.root.left.left= new Node(6);
		
		System.out.println(tree);
		
		System.out.println("Post order traversal");
		tree.printPostOrder();
		
		System.out.println("\nPre order traversal");
		tree.printPreOrder();
		
		System.out.println("\nIn order traversal");
		tree.printInOrder();
		sc.close();
		
		}
	
	void printPostOrder(Node root) {
		if(root==null)
		{
			return;
		}
		
		printPostOrder(root.left);
		printPostOrder(root.right);
		System.out.print(root.key+ " ");
		
	}
	
	void printPreOrder(Node root)
	{
		if(root==null) {
			return;
		}
		
		System.out.print(root.key + " ");
		printPreOrder(root.left);
		printPreOrder(root.right);
	}
	
	void printInOrder(Node root)
	{
		if(root==null)
		{
			return;
		}
		printInOrder(root.left);
		System.out.print(root.key + " ");
		printInOrder(root.right);
	}
	}

