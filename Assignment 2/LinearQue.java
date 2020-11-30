import java.util.*;
class LinearQue{
int front,rear;
int que[];
int size;
public LinearQue(int size)
{
front=rear=-1;
this.size=size;
que=new int [size];
}
public boolean isEmpty()
{
return front==rear;
}
public boolean isFull()
{
return rear>=size-1;
}
public void insertq(int x)
{
if(isFull())
{
    System.out.println("Queue is full");
}
else
{
que[++rear]=x;
}

}
public void deleteq()
{
    if(isEmpty())
{
    System.out.println("Queue is empty");
}
else
{
front=front+1;
}
}
public void status()
{
System.out.println("Front "+front);
System.out.println("Rear "+rear);


}
public void display()
{
    if(isEmpty())
{
    System.out.println("Queue is empty");
}
else
{
for(int i=front+1;i<=rear;i++)
{
System.out.print(que[i]+" ");
}
}

}
public void peek()
{
if(isEmpty())
{
    System.out.println("Queue is empty");
}
else
{
 System.out.println("Rear element "+que[rear]);
}

}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter size");
int size=sc.nextInt();
LinearQue que=new LinearQue(size);
char ch;
do{
    System.out.println("Enter Your choice \n1.add\n2.delete\n3.display\n4.show top element");
    int ch1=sc.nextInt();
    switch(ch1)
    {
        case 1:       System.out.println("Enter elements of queue");
                        for(int i=0;i<size;i++)
                        {
                     int x=sc.nextInt();
                     que.insertq(x);
                        }
                        que.status();
                      break;
                      
                    
                    
     
       case 2:
         
            que.deleteq();
             que.status();
            break;
          case 3:
           
       System.out.println("Display Stack QUEUE");
         que.display();
         System.out.println();
          break;
    
   case 4:
     que.peek();
     
       break;
  }
    System.out.println("Do you want to continue\n1Y\n2N");
    ch=sc.next().charAt(0);
}while(ch=='y'||ch=='Y');
}
}