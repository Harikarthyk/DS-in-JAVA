import java.util.* ;
class createGraph {
	private int noVertex ;
	private int[][] Graph ;
	private int[] dist ;
	private boolean[] isVisited ;
	private int parent[] ;
	PriorityQueue PQ = new PriorityQueue<>() ;
	public createGraph( int n ) {
		this.noVertex = n ;
		dist = new int[n] ;
		isVisited = new boolean[n] ;
		parent = new int[n] ;
		Graph = new int[n][n] ;
	} 
	public int getMinArray( int[] arr ) {
		int min = Integer.MAX_VALUE ;
		int index = 0 ;
		for( int i=0;i<arr.length;i++ ) 
			if( min>arr[i] && !isVisited[i] ){
				min = arr[i] ;
				index = i ;
			}
		return index+1 ;
	}
	int countVis = 0 ;
	int SS = 0 ;
	public void Dijkstra( int src ) { 
		SS = src ;
	    countVis++ ;
	    Arrays.fill( dist,Integer.MAX_VALUE ) ;
	    dist[src-1] =  0 ;
	    parent[src-1] = -1 ;
	    //System.out.println( Arrays.toString( dist ) ) ;
	    while( countVis<noVertex ) {
	    	if( !isVisited[src-1] )
	    		countVis++;
	    	isVisited[src-1] = true ;
	    	for( int i=0;i<Graph.length;i++ )
	    		if( Graph[src-1][i]>0 ){
	    			parent[i] = src ;
	    			dist[i] = Math.min( dist[i],dist[src-1]+Graph[src-1][i] ) ;
	    		}
	    	src = getMinArray( dist ) ;
	    }
	    //System.out.println( Arrays.toString( dist ) ) ;
	    //System.out.println( Arrays.toString( parent ) ) ;
	}
	public void findPath( int des ) {
		if( dist[des-1]==-1 )
			System.out.println( "Distance to be Traveled is: 0 \nPath is -1" ) ;
		int i = des-1 ;
		String path = "" ;
		while( parent[i]!=-1 ) {
			path = path +" "+Integer.toString( i+1 )+"V" ;
			i = parent[i] ;
			i--;
		}
		StringBuilder sb = new StringBuilder() ;
		sb.append( path ) ;
		sb.reverse() ;
		path = sb.toString();
		path = "V"+Integer.toString( SS ) +" "+path ;
		System.out.println( "Path : "+path ) ;
		System.out.println( "Total Distance : "+dist[des-1] ) ;
	}
	public void addEdges( int src , int des , int wt ) {
		Graph[src-1][des-1] = wt ;
	}
	public void disAdjMatrix() {
		for( int i=0;i<noVertex;i++ ) {
			for( int j=0;j<noVertex;j++ ) 
				System.out.print( Graph[i][j]+" " ) ;
			System.out.println() ;
		}
	}
}
public class Dijkstra{
    
    public static void main(String []args){
        int numVertex = 6 ;
        createGraph obj = new createGraph( numVertex ) ;
        obj.addEdges( 6,1,6 ) ;
        obj.addEdges( 6,3,18 ) ;
        obj.addEdges( 6,2,8 ) ;
        obj.addEdges( 2,3,9 ) ;
        obj.addEdges( 1,4,11 ) ;
        obj.addEdges( 4,5,3 ) ;
        obj.addEdges( 5,3,5 ) ;
        obj.addEdges( 5,2,7 ) ;
        //obj.disAdjMatrix() ;
        int src = 6 ;
        obj.Dijkstra( src ) ;
        int des = 4 ;
        obj.findPath( des ) ;

    }
}