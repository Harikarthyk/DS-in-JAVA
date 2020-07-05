class Queue{
	int max = 10 ;
	int Q[] = new int[ max ] ;
	int front = 0 , rear = -1  ;
	public void enQueue( int data ){
		
		rear++ ;
		Q[ rear ] = data ;
		
	}
	public void deQueue() {
		if( rear==-1  || rear==front )
			System.out.println( "Queue isEmpty " ) ;
		else
			front++;
	}
	public void displayQ() {
		for( int i=front;i<rear;i++ ){
			System.out.print( Q[i]+" " ) ;
		}
		System.out.println();
	}
}

public class QueueArray {
	public static void main(String[] args) {
		Queue obj = new Queue() ;
		obj.deQueue() ;
		obj.enQueue(1) ;
		obj.enQueue(2) ;
		obj.enQueue(3) ;
		obj.enQueue(4) ;
		obj.displayQ() ;
		obj.deQueue() ;
		obj.deQueue() ;
		obj.deQueue() ;
		obj.deQueue() ;
		obj.enQueue(1) ;
		obj.displayQ() ;
	}
}