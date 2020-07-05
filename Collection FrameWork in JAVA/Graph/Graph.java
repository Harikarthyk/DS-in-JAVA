//Directed - Graph 
import java.util.* ;
public class Graph{

	int N_Edge ;
	int[][] Adj ;

	public Graph( int N_Edge ){
		this.N_Edge = N_Edge ;
		Adj = new int[ N_Edge ][ N_Edge ] ;
	}

	public void add( int node1 , int node2 ) {
		Adj[ node1-1 ][ node2-1 ] = 1 ;
	}

	public void DFS( int src ) {
		boolean[] isVisited = new boolean[ N_Edge ] ;
		Stack<Integer> stack = new Stack<Integer>() ; 
		stack.add( src ) ;
		while( !stack.isEmpty() ) {
			int last = stack.pop() ;
			if( !isVisited[last-1] )
				System.out.print( last+" " ) ;
			isVisited[last-1] = true ;
			for( int i=0;i<N_Edge;i++ ) 
				if( !isVisited[i] && Adj[last-1][i]!=0 ) 
					stack.push( i+1	) ; 
		}
	}

	public void BFS( int src ) {
		
		boolean[] isVisited = new boolean[ N_Edge ] ;
		Queue<Integer> queue = new LinkedList<>() ;
		if( src>=N_Edge ) return ;
		
		queue.add( src ) ;
		
		while( !queue.isEmpty() ){
			
			int last = queue.poll() ;
			if( !isVisited[last-1] )
				System.out.print( last+" " ) ;
			isVisited[last-1] = true ;

			for( int i=0;i<N_Edge;i++ ) 
				if( Adj[last-1][i]!=0 && !isVisited[i] ) 
					queue.add( i+1 ) ;
		}
	
	}

	public void displayAdj() {
		for( int i=0;i<N_Edge;i++ ){ 
			for( int j=0;j<N_Edge;j++ ) 
				System.out.print( Adj[i][j]+" " ) ;
		System.out.println();
		}	
	}

}