//LinkedList
//<T> where any type of datatype can be maintained in the data 
public class LinkedList<T>{
	//head of the list
	Node head = null ; 
	
	int size = 0 ;
	
	private class Node {
		T data ;
		Node next ; 
		public Node( T data ){
			this.next = null ;
			this.data = data ;
		}
		public Node(){
			this.next = null ;
		}
	}
	
	public void add( T data ){
		if( head==null ){
			head = new Node( data ) ;
		}
		else {
			Node curr = head ;
			while( curr.next!=null )
				curr = curr.next ;
			curr.next = new Node( data ) ;
		}
		this.size++;
	}
	
	public int size(){
		return this.size ;
	} 

	public T get( int index ) {
		if( index+1>=this.size() ) return null ;
		Node curr = head ;
		for( int i=0;i<index;i++,curr=curr.next ) ;
		return curr.data ;	
	}
	
	public boolean isEmpty(){
		return head==null ;
	}

	public void remove( int index ){
		if( index+1>=this.size ) return ;
		Node curr = head , pre = head ;
		if( index==0 ) head = head.next ;
 		for( int i=0;i<index-1;i++,pre=curr,curr = curr.next ); 
		curr.next = curr.next.next ;
		this.size--;
	}
	
	public int indexOf( T data ) {
		int index = 0 ;
		for( Node curr=head;curr!=null;curr=curr.next,index++ )
			if( curr.data.equals( data ) ) return index ;
		return -1 ;
	}
	public void display(){
		for( Node curr = head ; curr!=null ; curr=curr.next )
			System.out.print( curr.data+" " ) ;
	}

} 