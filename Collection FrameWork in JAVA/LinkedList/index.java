//Main Driver 
public class index {
	public static void main(String[] args) {
		//Applicable for All type of Objects :

		//Linked list for Integer Object :

		LinkedList<Integer> list_int = new LinkedList<>() ;
		
		for( int i=1;i<=10;i++ )
			list_int.add(i) ;
		
		list_int.display() ;
		System.out.println() ;
		
		list_int.remove( 2 ) ;
		
		list_int.display() ;
		System.out.println() ;

		System.out.println( list_int.size() ) ;

		System.out.println( list_int.isEmpty() ) ;

		System.out.println( list_int.get(2) ) ;

		System.out.println( list_int.indexOf(2) ) ; 
		
		//Linked List for String :

		LinkedList<String> list_String = new LinkedList<>() ;
		
		for( int i=1;i<=10;i++ )
			list_String.add( (i+"A") ) ;
		
		list_String.display() ;
		System.out.println() ;
		
		System.out.println( list_String.indexOf( "2A" ) ) ;
		
	}
}