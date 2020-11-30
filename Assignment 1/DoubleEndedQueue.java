public class DoubleEndedQueue 
{
	Scanner sc=new Scanner(System.in);
	int max;
	int deque[],left,right;
	
	DoubleEndedQueue()
	{
		max=10;
		deque=new int[max];
		left=right=-1;
	}

	void input_deque()
	{
		int option;
		do {
		System.out.printf("\nINPUT RESTRICTED DEQUE");
		System.out.printf("\n 1. Insert at right");
		System.out.printf("\n 2. Delete at left");
		System.out.printf("\n 3. Delete at right");
		System.out.printf("\n 4. Display");
		System.out.printf("\n 5. Quit");
		System.out.printf("\n Enter your Option : ");
		 option=sc.nextInt();
		switch(option)
			{
				case 1:
					insert_right();
					break;
				case 2:
					delete_left();
				case 3:
					delete_right();
					break;
				case 4:
					display();
					break;
			}
		
		}while(option!=5);
		
	}
	 void insert_right() 
	 {
		 System.out.print("Enter the value :");
		 int val=sc.nextInt();
		 if(left == 0 && right == max-1 || (left == right+1))
		 {
			 System.out.printf("\n OVERFLOW");
		 }
		 if (left == -1) 
		 {
		 left = 0;
		 right = 0;
		 }
		 else
		 {
		 if(right == max-1) 
		 right = 0;
		 else
		 right = right+1;
		 }
		 deque[right] = val ;
	}
		 
	 
	 void delete_left()
	 {
		 if (left == -1)
		 {
		System.out.printf("\n UNDERFLOW");
		 return ;
		 }
		 System.out.printf("\n The deleted element is : %d", deque[left]);
		 if(left == right) 
		 {
		 left = -1;
		 right = -1;
		 }
		 else
		 {
		 if(left == max-1)
		 left = 0;
		 else
		 left = left+1;
		 }
	 }
		 
	 
		
	 void delete_right()
	 {
		 if (left == -1)
		 {
			 System.out.printf("\n UNDERFLOW");
		 return ;
		 }
		 System.out.printf("\n The element deleted is : %d", deque[right]);
		 if(left == right) 
		 {
		 left = -1;
		 right = -1;
		 }
		 else
		 {
		 if(right == 0)
		 right=max-1;
		 else
		 right=right-1;
		 }
	 }
	
	 void display()
	 {
		 int front = left, rear = right;
		 if(front == -1)
		 {
			 System.out.printf("\n QUEUE IS EMPTY");
		 return;
		 }
		 System.out.printf("\n The elements of the queue are : ");
	
		 if(front <= rear )
		 {
		 while(front <= rear)
		 {
			 System.out.printf("%d   ",deque[front]);
		 front++;
		 }
		 }
		 else
		 {
		 while(front <= max-1)
		 {
			 System.out.printf("%d   ", deque[front]);
		 front++;
		 }
		 front = 0;
		 while(front <= rear)
		 {
			 System.out.printf("%d  ",deque[front]);
		 front++;
		 }
		 }
	 }
	 
	 
	 
	 void output_deque()
	 {
		 int option;
	 do
	 {
		 
		 
		 System.out.printf("\n 1.Insert at right");
		 System.out.printf("\n 2.Insert at left");
		 System.out.printf("\n 3.Delete from left");
		 System.out.printf("\n 4.Display");
		 System.out.printf("\n 5.Quit");
		 System.out.printf("\n Enter your option : ");
		 option=sc.nextInt();
	 switch(option)
	 {
		 case 1:
			 insert_right();
			 break;
		 case 2:
			 insert_left();
			 break;
		 case 3:
			 delete_left();
			 break;
		 case 4:
			 display();
		 break;
	 }
	 }while(option!=5);
	 }
	 
	 void insert_left()
	 {
	
	 System.out.printf("\n Enter the value to be added:");
	 int val=sc.nextInt();
	 if((left == 0 && right == max-1) || (left == right+1))
	 {
		 System.out.printf("\n Overflow");
	 return;
	 }
	
	 if (left == -1)
	 {
	 left = 0;
	 right = 0;
	 }
	 else
	 {
	 if(left == 0)
	 left=max-1;
	 else
	 left=left-1;
	 }
	 deque[left] = val;
	 }
	 
	 public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);;
		DoubleEndedQueue deq=new DoubleEndedQueue();
		System.out.print("***** Main Manu *****\n\n");
		System.out.println("1. Input Restricted Deque");
		System.out.println("2. Output Restricted Deque");
		System.out.print("Enter your option : ");
		int option=sc.nextInt();
		switch(option)
		{
			case 1:
				deq.input_deque();
				break;
			case 2:
				deq.output_deque();
				break;
		}
		
	}

}