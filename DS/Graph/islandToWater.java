import java.util.* ;
public class islandToWater {
	int[][] input ={ {1, 0, 0, 1, 0},
  					 {1, 0, 1, 0, 0},
                     {0, 0, 1, 0, 1},
                     {1, 0, 1, 0, 1},
                     {1, 0, 1, 1, 0}
                   } ;
	int count = 0 ;
	void changeState( int i , int j ) {
		if(  j<0 || i<0 || j>=input[0].length || i>=input.length || input[i][j]==0 )
			return ;
		input[i][j] = 0 ;
		count++ ;
		changeState( i+1 , j ) ;	
		changeState( i-1 , j ) ;
		changeState( i , j+1 ) ;
		changeState( i , j-1 ) ;
	}
	void findTheIsland() {
		List<Integer> list = new ArrayList<>() ;
		for( int i=0;i<input.length;i++ ) {
			for( int j=0;j<input[0].length;j++ ) {
				if( input[i][j]==1 ){
					\changeState( i , j ) ;
					list.add( count ) ;
				}
				count = 0 ;
			}
		}
		System.out.println( list ) ;
	}
	public static void main(String[] args) {
		islandToWater obj = new islandToWater() ;
		obj.findTheIsland() ;
	}
}