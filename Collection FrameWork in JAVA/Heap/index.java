//driver function 
public  class index {
	public static void main(String[] args) {
		Heap heap = new Heap( 10 ) ;
		
		heap.insert( 35 ) ;
		heap.insert( 33 ) ;
		heap.insert( 43 ) ;
		heap.insert( 10 ) ;
		heap.insert( 14 ) ;
		heap.insert( 19 ) ;
		heap.insert( 27 ) ;
		heap.insert( 44 ) ;
		heap.insert( 26 ) ;
		heap.insert( 31 ) ;

		heap.display() ;
		System.out.println() ;
		
		System.out.println( heap.getMax() );

		heap.extractMax() ;

		heap.display() ;
		System.out.println() ;
	
	}
}