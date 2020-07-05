
//BSTree
import Queue.* ;
public class TreeNode{
	Node root = null ;
	private class Node {
		int data ;
		Node right , left ;
		public Node( int data ) {
			this.data = data ;
			this.left = null ;
			this.right = null ; 
		}
	}

	public void add( int data ) {
		this.root = addHelper( this.root , data ) ;
	}

	public Node addHelper( Node node , int data ) {
		if( node==null ){
			node  = new Node( data ) ;
			return node ;
		}
		else {
			if( data > node.data ){
				node.right = addHelper( node.right , data ) ;
			} 
			else {
				node.left = addHelper( node.left , data ) ;
			}
		}
		return node ;
	}

	public void removeHelper( int data ) {
		int flag = 0 ;
		Node node = this.root , pre = null ;
		while( flag==0 && node!=null ){
			if( node.data==data ) {	
				if( node.left!=null && node.right!=null ){	
					Node tempRight = node.right ;
					node = node.left ;
					Node curr = node ;
					for( ;curr.right!=null;curr=curr.right ) ;
					curr.right = tempRight ;
					if( pre==null )
						this.root = node ;
					else {
						pre.right = node ;
					}			
				}
				else if( node.left!=null ) 
					if( pre==null ) 
						this.root = root.left ;
					else
						pre.left = node.left ;
				else if( node.right!=null ) 
					if( pre==null )
						this.root = root.right ;
					else 
						pre.right = node.right ;
				else if( node.right==null && node.left==null ) {
					if( pre==null )
						root = null ;
					else if( pre.data>node.data ) 
						pre.left = null ;
					else 
						pre.right = null ;
				
					this.root = root ;
				}
				flag = 1;
			}
			else if( node.data>data ){
				pre = node ;
				node = node.left ;
			}
			else if( node.data<data ){
				pre = node ;
				node = node.right ;
			}
		}
	}
	
	public void remove( int data ){
		 removeHelper( data ) ;
	}

	private int maxHeightHelper( Node root , int max ) {
		if( root==null ) return max ;
		int left = maxHeightHelper( root.left , max+1 ) ;
		int right = maxHeightHelper( root.right , max+1 ) ;
		return Math.max( left , right ) ;
	} 

	public int maxHeight(){
		return maxHeightHelper( root , 0 ) ;	
	}

	public void displayInOrder() {
		inOrder(root) ;
	}
	
	public void displayPreOrder() {
		inOrder(root) ;
	}
	
	public void displayPostOrder() {
		inOrder(root) ;
	}

	public void displayLevelOrder(){
		displayLevelOrder( root ) ;
	}
	
	public void displayLevelOrder( Node node ) {
		Queue<Node> queue = new Queue<>() ;
		queue.add( node ) ;
		while( !queue.isEmpty() ){
			Node curr =	queue.poll() ;
			if( curr.left!=null )
			queue.add( curr.left ) ;
			if( curr.right!=null )
			queue.add( curr.right ) ;

			System.out.print( curr.data+" " ) ;

		}
	}

	public void inOrder( Node node ){
		if( node==null ) return ;
		inOrder( node.left ) ;
		System.out.print( node.data+" " ) ;
		inOrder( node.right ) ;
	}
	
	public void postOrder( Node node ){
		if( node==null ) return ;
		System.out.print( node.data+" " ) ;
		inOrder( node.left ) ;
		inOrder( node.right ) ;
	}
	
	public void preOrder( Node node ){
		if( node==null ) return ;
		inOrder( node.left ) ;
		inOrder( node.right ) ;
		System.out.print( node.data+" " ) ;
	}

}