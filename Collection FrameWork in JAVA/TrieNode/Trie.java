//Trie 
import java.util.* ;
//C:\Program Files (x86)\Java\jdk1.8.0_201\bin
public class Trie{
	static int Alphabets = 26 ;
	
	static class Node {
		boolean isEnd ;
		Node[] child = new Node[ Alphabets ] ;

		public Node() {
			for( int i=0;i<Alphabets;i++ )
				this.child[i] = null ;
			this.isEnd = false ;
		}
	
	}

	static Node head  = null ;

	public static void insert( String str ) {
		if( head==null )
		    head = new Node() ;
		Node curr = head ;
		for( int i=0;i<str.length();i++ ) {
			int index = str.charAt(i) - 'a' ;
			if( curr.child[index]==null ) 
				curr.child[index] = new Node() ;
			curr = curr.child[index] ;
		}
		curr.isEnd = true ;
	}

	public static boolean prefix( String str ) {
		if( head==null ) return false ;
		Node curr = head ;
		for( int i=0;i<str.length();i++ ) {
			int index = str.charAt(i) - 'a' ;
			if( curr.child[index]==null ) return false ;
			curr = curr.child[index] ;
		}
		return true ;
	}

	public static boolean search( String str ) {
		if( head==null ) return false ;
		Node curr = head ;
		for( int i=0;i<str.length();i++ ) {
			int index = str.charAt(i) - 'a' ;
			if( curr.child[index]==null ) return false ;
			curr = curr.child[index] ;
		}
		return curr.isEnd ;
	}
	
	List<String> result = new ArrayList<>() ;

	private void helper( Node curr , String postfix , String prefix ) {
		if( curr.isEnd ) {
			result.add( prefix+postfix ) ;
			return ;
		}
		for( int i=0;i<26;i++ ) 
			if( curr.child[i]!=null ){
				char t = (char)(i + 97) ;
				postfix += Character.toString( t ) ;
				helper( curr.child[i] , postfix , prefix ) ;
				postfix = postfix.substring( 0,postfix.length()-1 ) ;
			}

		return ;
	}

	public List<String> searchPrefix( String str ) {
		if( head==null ) return result ;
		Node curr = head ;
		for( int i=0;i<str.length();i++ ) {
			int index = str.charAt(i) - 'a' ;
			if( curr.child[index]==null ) return result ;
			curr = curr.child[index] ;
		}
		helper( curr , "" , str ) ;
		return result ;
	}

}