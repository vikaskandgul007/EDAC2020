public class Queue_Demo {
	int max,rear,front;
	int que[];
	
	Queue_Demo()
	{
		max=5;
		rear=-1;
		front=-1;
		que=new int[max];
	}
	void insert(int item)
	{
		if(rear+1==max)
		{
			System.out.println("overflow");
		}
		else
		{
			if(front==-1 && rear==-1)
			{
				front=0;rear=0;
			}
			else
			{
				rear=rear+1;
			}
		que[rear]=item;
		}
	}
	void delete()
	{
		int y;
		if(front==-1 || front>rear)
		{
			System.out.println("UnderFlow");
		}
		else
		{
			y=que[front];
			if(front==rear)
				{front=rear=-1;}
			else
				{front=front+1;}
		System.out.println("Deleted : "+y);
		}
	}
	void show()
	{
		if(rear==-1)
		{
			System.out.println("empty");
		}
		for(int i=front;i<=rear;i++)
		{
			System.out.print(que[i]+" ");
		}
	}
	
	public static void main(String[] args) {
		Queue_Demo q=new Queue_Demo();
		q.insert(10);
		q.insert(20); q.insert(30); q.insert(40); q.insert(40); 
		q.show();
		q.delete();
//		q.delete(); q.delete(); q.delete();
		q.show();
	}

}