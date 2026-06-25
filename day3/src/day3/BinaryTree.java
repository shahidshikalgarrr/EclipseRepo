package day3;

public class BinaryTree{
	private class Node{
		private int data;
		public Node left, right;
		
		public Node(int data) {
			this.data = data;
		}
		public int getData() {
			return data;
		}
	}
	
	private Node root;
	
	public void add(int data) {
		Node n = new Node(data);
		if(root == null) {
			root = n;
		}
		Node t = root;
		while(true) {
			if(data == t.data) break;
			if(data>t.data) {
				if(t.right == null) {
					t.right = n; break;
				}
				else
					t=t.right;
			}
			if(data < t.data) {
				if(t.left == null) {
					t.left = n; break;
				}
				else
					t = t.left;
			}
		}
	}
	public void traverse() {
		inorder(root);
		
	}
	
	public void inorder(Node t) {
		
		
		if(t==null) {
			return;}
		
		inorder(t.left);
		System.out.println(t.data);
		inorder(t.right);		
			
		}
	
	}

