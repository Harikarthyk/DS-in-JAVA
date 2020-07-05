import java.util.* ;
class createGraph {
	private int noVertex ;
	private int[][] Graph ;
	boolean[] visited ;
	Stack<Integer> stack = new Stack<Integer>();
	public createGraph( int n ) {
		this.noVertex = n ;
		visited = new boolean[n] ;
		Graph = new int[n][n] ;
	} 
	public void DFS ( int  vertex ) {
		stack.push( vertex ) ;
		if( stack.isEmpty() )
			return ;
		int v = stack.pop() ;
		if( !visited[v-1] )
		System.out.print( v+" " ) ;
		visited[v-1] = true ;
		for( int j=0;j<Graph.length;j++ ) {
			if( Graph[v-1][j]==1 && !visited[j])
				DFS( j+1 ) ;
		} 		
	}
	public void addEdges( int src , int des ) {
		Graph[src-1][des-1] = Graph[des-1][src-1] = 1 ;
	}
	public void disAdjMatrix() {
		for( int i=0;i<noVertex;i++ ) {
			for( int j=0;j<noVertex;j++ ) 
				System.out.print( Graph[i][j]+" " ) ;
			System.out.println() ;
		}
	}
}
public class DFS {
	public static void main(String[] args) {
		createGraph obj = new createGraph( 6 ) ;
		obj.addEdges( 1,2 ) ;
		obj.addEdges( 1,3 ) ;
		obj.addEdges( 2,4 ) ;
		obj.addEdges( 3,5 ) ;
		obj.addEdges( 2,5 ) ;
		obj.addEdges( 4,5 ) ;
		obj.addEdges( 4,6 ) ;
		obj.addEdges( 5,6 ) ;
		obj.disAdjMatrix() ;
		System.out.println( "Graph Traversal " ) ;
		obj.DFS( 1 ) ;
	}
}