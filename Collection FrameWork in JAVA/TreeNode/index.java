//Driver function 
// add( int ) - to add elements 
// displayInOrder() - inorder Traversal
// displayPreOrder() - preorder Traversal 
// displayPostOrder() - postorder Traversal  
// search( int ) - return true / false 
// height() - return int 
// depth() - return int 
// 
public class index {
	public static void main(String[] args) {
		TreeNode root = new TreeNode() ;
		root.add( 100 ) ;
		root.add( 20 ) ;
		root.add( 200 ) ;
		root.add( 10 ) ;
		root.add( 30 ) ;
		root.add( 150 ) ;
		root.add( 300 ) ;
		root.add( 3000 ) ;
		root.add( 30000 ) ;

		root.displayInOrder( ) ;
		System.out.println() ;

		root.displayLevelOrder( ) ;
		System.out.println() ;

		System.out.print( root.maxHeight() );

		root.remove( 100 ) ; 

		root.remove( 200 ) ;

		root.displayInOrder( ) ;
		System.out.println() ;

	}
}