//Driver Function 
public class index {
	public static void main(String[] args) {
		Graph bfs = new Graph( 6 ) ;
		bfs.add( 1,2 ) ;
		bfs.add( 1,3 ) ;
		bfs.add( 2,4 ) ;
		bfs.add( 2,5 ) ;
		bfs.add( 3,5 ) ;
		bfs.add( 4,5 ) ;
		bfs.add( 4,6 ) ;
		bfs.add( 4,6 ) ;
		bfs.BFS( 1 ) ;
		System.out.println() ;
		Graph dfs = new Graph( 4 ) ;
		dfs.add( 1,2 ) ;
		dfs.add( 1,3 ) ;
		dfs.add( 3,1 ) ;
		dfs.add( 2,3 ) ;
		dfs.add( 3,4 ) ;
		dfs.add( 4,4 ) ;
		dfs.DFS( 2 ) ;
		// bfs.displayAdj() ;	
	}
}