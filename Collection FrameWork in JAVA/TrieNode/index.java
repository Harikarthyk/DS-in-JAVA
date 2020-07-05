//Driver function 
import  java.util.* ;
public  class index {
	public static void main(String[] args) {
		Trie dic = new Trie() ;
		dic.insert( "hey" ) ;
		dic.insert( "hello" ) ;
		System.out.println( dic.search( "he" ) ) ;
		System.out.println( dic.search( "hey" )  ) ;
		System.out.println( dic.prefix( "he" ) ) ;

		List<String> list = new ArrayList<>() ;
		
		list = dic.searchPrefix( "hey" ) ;
		
		System.out.println( list ) ;

	}
}