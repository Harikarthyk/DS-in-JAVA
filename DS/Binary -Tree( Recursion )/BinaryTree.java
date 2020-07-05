class createNode {
	public Node Rt = null ;
	public int searchMax( Node node ) {
		if( node.getRight()==null )
			return node.getData()  ;
		return searchMax( node.getRight() ) ;
	}
	public int searchMin( Node node ) {
		if( node.getLeft()==null )
			return node.getData() ;
		return searchMin( node.getLeft() ) ;
	}
	public boolean searchData( Node node,int data ) {	
		if( node==null )
			return false ;
		if( node.getData()==data ) 
			return true ;
		boolean t1 = searchData( node.getRight(),data ) ;
		if( t1 ) return true ;
		boolean t2 = searchData( node.getLeft(),data ) ;
		return t2 ;
	}
	public Node addData( Node node,int data ) {
		if( node==null ){ 
			Node newNode = new Node( data ) ;
			return newNode ;
		}
		if( node.getData()<data ) 
			node.setRight( addData( node.getRight(),data ) );
		else
			node.setLeft( addData( node.getLeft(),data ) );

		return node ;
	}
	public void inOrder( Node node ) {
    	if (node == null)
    	  	return;
    	inOrder(node.left);
    	System.out.print( node.getData()+" " );
    	inOrder(node.right);
    }
    private class Node {
		private int data ;
		private Node left , right ;
		public Node ( int data ) {
			this.data = data ;
			this.left = this.right = null ;
		}
		private void setData( int data ) {
			this.data = data ;
		}
		private void setLeft( Node left ) {
			this.left = left ;
		}
		private void setRight( Node right ) {
			this.right = right ;
		}
		private int getData() {
			return data ;
		}
		private Node getLeft() {
			return left ;
		}
		private Node getRight() {
			return right ;
		}
	}
}
public class BinaryTree {
	public static void main(String[] args) {
		createNode obj = new createNode() ;
		obj.Rt = obj.addData( obj.Rt,25 ) ;
		obj.Rt = obj.addData( obj.Rt,2 ) ;
		obj.Rt = obj.addData( obj.Rt,3 ) ;
		obj.Rt = obj.addData( obj.Rt,4 ) ;
		obj.Rt = obj.addData( obj.Rt,1 ) ;
		obj.Rt = obj.addData( obj.Rt,41 ) ;
		obj.Rt = obj.addData( obj.Rt,9 ) ;
		obj.inOrder( obj.Rt ) ;
		System.out.println() ;
		System.out.println( "Max :"+obj.searchMax( obj.Rt ) ) ;
		System.out.println( "Min :"+obj.searchMin( obj.Rt ) ) ;
		System.out.print( "Whether data 5 is present in BST :"+obj.searchData( obj.Rt,5 ) );
	}

}