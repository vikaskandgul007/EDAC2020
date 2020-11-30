class Circular_Queue
{
	int front,rear;
	int arr[],max;
	
	Circular_Queue()
	{
		max=5;
		front=rear=-1;
		arr=new int[max];
	}
	void enque(int item)
	{
		
		if( front==0 && rear==max-1 )
		{
//			throw new ArrayIndexOutOfBoundsException("Overflow"); 
			System.out.println("Overflow");
		}
		
//		catch(ArrayIndexOutOfBoundsException ae)
//		{
//			System.out.println("Overflow");
//		}
		if(front==-1 && rear==-1)
		{
			front=rear=0;
		}else if(rear==max-1 && front!=0)
		{
			rear=0;
		}
		else
		{
			rear=rear+1;
		}
		arr[rear]=item;
		
	}
	
	void deque()
	{
		if(front==-1)
			System.out.println("underflow");
		int y=arr[front];
		if(front==rear)
		{
			front=rear=-1;
			
		}else if(front==max-1)
		{
			front=0;
		}
		else
		{
			front=front+1;
		}
		
		
	}
	void print()
	{
		for(int i=front;i<=rear;i++)
			System.out.print(arr[i]+" ");
	}
	 void display() {

		    int i;
		    if(front==-1)
		    {
		    	System.out.println("Queue is empty");
		    }
		    else { 
		      System.out.println("Front -> " + front);
		      System.out.println("Items -> ");
		      for (i = front; i != rear; i = (i + 1) % max)
		        System.out.print(arr[i] + " ");
		      System.out.println(arr[i]);
		      System.out.println("Rear -> " + rear);
		    }
	 }
		  
	public static void main(String[] args) {
		Circular_Queue cq=new Circular_Queue();
		cq.enque(10);
		cq.enque(20);
		cq.enque(30);
		cq.enque(40);
		cq.enque(50);
//		cq.enque(60);
		
		cq.print();
		System.out.printf("\n=================\n");
		cq.deque();
		cq.deque();
		
		cq.print();
		cq.enque(60);
		cq.enque(70);
		System.out.printf("\n=================\n");
		cq.display();
	}
}