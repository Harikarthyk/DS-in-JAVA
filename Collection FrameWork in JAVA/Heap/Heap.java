//C:\Program Files (x86)\Java\jdk1.8.0_201\bin
//maxHeap
public class Heap {

	int capacity  = 0 ;
	int size ;
	int[] heap ;

	public Heap( int capacity ) {
		this.capacity = capacity ;
		this.heap = new int[ capacity ] ;
		this.size = 0 ;
	}

	private int getParent( int index ) {
		return ( ( index-1 )/2 ) ;
	}

	private void helper( int index ) {
		if( index==0 ) return ;

		int newValue = heap[index] ;
	
		while(  index>0 && heap[ getParent( index ) ]<newValue  ) {
			heap[index] = heap[ getParent( index ) ] ;
			index = getParent( index ) 	;
		}
	
		heap[index] = newValue ;

	}

	public void insert( int data ) {
		if( size==capacity )
			throw new IndexOutOfBoundsException( "\nSize of the Heap is full " ) ;
		heap[size] = data ;
		helper( size ) ;
		size++ ;
	}

	public int getMax(){
		return heap[0] ;
	}

	public void extractMax() {
		for( int i=1;i<size;i++ ) {
			heap[i-1] = heap[i] ;
		}
		size-- ;
		if( size>=1 && heap[0]<heap[1] ){
			heap[0] += heap[1] ;
			heap[1] = heap[0] - heap[1] ;
			heap[0] = heap[0] - heap[1] ;	
		}
	}

	public void display() {
		for( int i=0;i<size;i++ ) 
			System.out.print( heap[i]+" " ) ;
	}

}