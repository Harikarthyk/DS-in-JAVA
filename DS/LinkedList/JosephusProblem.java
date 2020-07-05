class CircularList {
	private Node Head ;
	private int size = 0 ; 
	public void addData( int data ) {
		size ++ ;
		Node newNode = new Node( data ) ;
		if( Head==null )
			Head = newNode ;
		else {

			Node current = Head ;
			while( current.getNext()!=null ) current = current.getNext() ;
			current.setNext( newNode ) ;
		
		}
	}
	public int listSize(){
		return size ;
	}
	public void displayData() {
		for( Node current=Head;current!=null;current=current.getNext() ) System.out.print( current.getData()+" " ) ;
		System.out.println() ;
	}
	public void removeData( int pos ){
		int c = 2 ;
		Node current = Head ;
		if( pos==1 ){
			Head = Head.getNext() ; 
			return ;
		} 
		while( pos!=c ) {
			c++;
			current = current.getNext() ;
		}
		Node pre = current.getNext() ;
		current.setNext( current.getNext().getNext() ) ;
		pre.setNext( null ) ;
		size--;
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

public class JosephusProblem{
	
	public static void main(String[] args) {
		CircularList obj = new CircularList() ;
		obj.addData(1) ;
		obj.addData(2) ;
		obj.addData(3) ;
		obj.addData(4) ;
		obj.addData(5) ;
		obj.addData(6) ;
		obj.addData(7) ;
		obj.addData(8) ;
		obj.addData(9) ;
		obj.addData(10) ;
		int s = obj.listSize() ;
		obj.displayData() ;
		//System.out.print( "Enter the Hops : " ) ;
		int hops = 3 ;
		int i = 1 ;
		while ( s!=1 ) {
			i += hops ;
			i = i % s ;
			if( i==0 ) i = s ;	
			if( i<=s ){
				obj.removeData( i ) ;
				obj.displayData() ;
				s--;
			}
		}
		obj.displayData() ;
	}
}