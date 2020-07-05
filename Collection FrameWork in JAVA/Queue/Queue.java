//Queue
package Queue ;
public class Queue<T>{
	public Node front = null ;
	//if needed
	Node rear = null ;
	int size = 0 ;
	private class Node{
		T data ;
		Node next ;
		public Node( T data ) {
			this.data = data ;
			this.next = null ;
		}
	}

	public boolean isEmpty() {
		return front==null ;
	}

	public void add( T data ) {
		if( front==null ){
			front  = new Node( data ) ;
			rear = front ;
		}
		else{
			rear.next = new Node( data ) ;
			rear = rear.next ;
		}
		size++ ;
	}

	public T peek() {
		if( front==null ) return null ;
		return front.data ;
	}

	public T remove() {
		T data = front.data ;
		front = front.next ;
		return data ;
	}

	public T poll() {
		if( front==null ) return null ;
		T data = front.data ;
		front = front.next ;
		return data ;				
	}

	public void display() {
		for( Node curr=front;curr!=null;curr=curr.next ) 
			System.out.print( curr.data+" " ) ;
	}

}