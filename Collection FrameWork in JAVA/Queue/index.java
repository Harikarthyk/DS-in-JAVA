//Driver funtion 
public class index {
	public static void main(String[] args) {
		Queue<Integer> queue = new Queue<>() ;

		for( int i=1;i<=10;i++ )
			queue.add( i ) ;

		queue.display() ;
		System.out.println() ; 

		System.out.println( queue.peek() ) ;

		queue.display() ;
		System.out.println() ; 

		System.out.println( queue.remove() ) ;
		
		queue.display() ;
		System.out.println() ; 
	
	}
}