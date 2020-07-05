class createNode {
	private Node front = null , rear = null  ;
	public void enQueue( int data ) {
		Node currNode = new Node( data ) ;
		if( front==null && rear==null ) {
			front = rear = currNode ;
		}
		else {
			rear.setnext( currNode ) ;
			rear = currNode ;
		}
	}
	public int deQueue() {
		if( front==null )
			return -1 ;
		else {
			Node temp = front ;
			front = front.getNext() ;
			return temp.getData() ;
		}
	}
	public void displayData() {
		for( Node currNode = front;currNode!=null;currNode = currNode.getNext() ) System.out.print( currNode.getData()+" " ) ;
		System.out.println() ;
	}
	private class Node {
		private Node next ;
		private int data ;
		public Node( int data ) {
			this.data = data ;
			this.next = null ;
		}
		private void setData( int data ) {
			this.data = data ;
		}
		private void setnext( Node next ) {
			this.next = next ;
		}
		private int getData() {
			return data ;
		}
		private Node getNext() {
			return next ;
		}
	}
}
public class QueueList {
	public static void main(String[] args) {
		createNode obj = new createNode() ;
		obj.enQueue(1) ;
		obj.enQueue(2) ;
		obj.enQueue(3) ;
		obj.enQueue(4) ;
		obj.enQueue(5) ;
		obj.displayData() ;
		System.out.println( "Dequeued: "+obj.deQueue() ) ;
		obj.enQueue(1) ;
		obj.displayData() ;
	}
}