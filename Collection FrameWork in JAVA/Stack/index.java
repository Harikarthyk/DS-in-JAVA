//Driver function 
public  class index {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>() ;
		
		for( int i=1;i<=10;i++ )
			stack.push( i ) ;

		stack.display() ;
		System.out.println() ;

		stack.pop() ;

		System.out.println( stack.peek() ) ;

		System.out.println( stack.isEmpty() ) ;

		System.out.println( stack.search(1) ) ;
		
	}
}