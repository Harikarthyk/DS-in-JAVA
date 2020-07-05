
class createNode{

	
	private Node Head ;
	private int size = 0 ;
	
	public void addData( String data ){

		Node newNode = new Node( data ) ;
		size++;
		
		if( Head==null )
			Head = newNode ;
		else {

			Node current = Head ;
			while( current.getNext()!=null ){
				current = current.getNext() ;
			}
		
		current.setNext (newNode) ;

		}
	
	}
	
	public String removeData( String ele ) {

			size--;
			Node current = Head , swap ;
			if( Head.getData().equals( ele ) ) {
				Head = Head.getNext() ;
				return "true" ;
			}
			
			while( current.getNext()!=null ){

				if( current.getNext().getData().equals( ele ) ){

					current.setNext( current.getNext().getNext() ) ;
					return "true" ;
				}
				current = current.getNext() ;

			}

		return "false" ;
	}

	public int listSize() {

		return size ;

	}

	public void displayList() {

		Node current = Head ;
		while( current!=null ){ 
			
			System.out.println( current.getData() ) ;
			current =  current.getNext();

		} 

	}

	private class Node {

		private String data ;
		private Node next ;

		public Node( String data ) {
			this.next = null ;
			this.data = data ;
		}

	    private void setData( String data ) {
			this.data = data ;
		}

		private void setNext( Node next ){
			this.next = next ;
		}
		private String getData() {
			return data ;
		}
		private Node getNext() {
			return next ;
		}
	}

}

public class Mylinkedlist extends createNode {

	public static void main(String[] args) {
		
		createNode obj = new createNode() ;
		obj.addData( "first" ) ;
		obj.addData( "Second" ) ;
		obj.addData( "Third" ) ;
		obj.addData( "Fourth" ) ;
		obj.displayList();
		System.out.println( obj.removeData( "Fifth" )  );
		
		System.out.println( obj.removeData( "first" )  );

		obj.displayList();
			
	}
}