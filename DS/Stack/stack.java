class createNode {
	private Node Top ;
	public void push( int data ) {
		Node currNode = new Node( data ) ;
		if( Top==null )
			Top = currNode ;
		else {
			currNode.setNext( Top ) ;
			Top = currNode ;
		}
	}
	public int pop() {
		Node pre = Top ;
		int data = Top.getData() ;
		Top = Top.getNext() ;
		pre = null ;
		return data ;
	}
	public void displayData() {
		Node currNode ;
		for( currNode=Top;currNode!=null;currNode = currNode.getNext() ) System.out.println( currNode.getData() ) ;
	}
	private class Node {
		private Node next ;
		private int data ;
		public Node ( int data ) {
			this.data = data ;
			this.next = null ;
		}
		private void setData( int data ) {
			this.data = data ;
		}
		private void setNext( Node next ) {
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

public class stack {
	public static void main(String[] args) {
		createNode obj = new createNode() ;
		obj.push(1) ;
		obj.push(2) ;
		obj.push(3) ;
		obj.push(4) ;
		obj.push(5) ;
		obj.push(6) ;
		obj.push(7) ;
		obj.push(8) ;
		obj.push(9) ;
		obj.push(10) ;
		obj.displayData();
		System.out.println( "Call-pop = "+obj.pop() ) ; 
		obj.displayData();
	}
}