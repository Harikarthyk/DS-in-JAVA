//Stack
public class Stack<T>{
	Node top = null ;
	int size = 0 ;
	private class Node {
		T data ;
		Node next ;
		public Node( T data ) {
			this.data = data ;
			this.next = null ;
		}
	}

	public void push( T data ) {
		if( top==null ){
			top = new Node( data ) ;
		}
		else {
			Node curr = new Node( data ) ;
			curr.next = top ;
			top = curr ;
		}
		this.size++ ;
	}

	public T pop(){
		T data = top.data ;
		top = top.next ;
		this.size-- ;
		return data ;
	}

	public T peek(){
		return top.data ;
	}

	public int search( T data ){
		int index = 0 ;
		for( Node curr=top;curr!=null;curr=curr.next,index++ )
			if( curr.data.equals( data ) ) return index ;
		return -1 ; 
	}

	public boolean isEmpty() {
		return top==null ;
	}

	public int size() {
		return this.size() ;
	}

	public void display() {
		for( Node curr=top;curr!=null;curr=curr.next ) 
			System.out.print( curr.data+" " ) ;
	}

}