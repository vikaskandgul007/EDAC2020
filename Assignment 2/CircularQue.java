import java.util.*;
class CircularQue{
int front,rear;
int que[];
int size;
int length=0;
public CircularQue(int size)
{
front=rear=-1;
this.size=size;
que=new int [size];
}
public boolean isEmpty()
{
if(front==rear||front>=0||length==0) 
{
return true;
}
else
{
return false;
}
}
public boolean isFull()
{
if((front==0&&rear==size-1)||(rear==front-1))
{
return true;
}
else return false;
}
public void status()
{
System.out.println("Front "+front);
System.out.println("Rear "+rear);
System.out.println("length "+length);
}
public void addQue(int x)
{
/*if(isFull())
{
    System.out.println("Queue is full");
}*/
    if(length==size)
    {
        System.out.println("Queue is full");
    }
    else if(rear==front&&length==0)
{
rear=-1;
front=-1;
que[++rear]=x;
length++;

}
else if(front>=0&&rear==size-1)
{
    rear=-1;
que[++rear]=x;
length++;
}


else{
que[++rear]=x;
length++;
}
}
public void delQue()
{
/*if(isEmpty())
{
    System.out.println("Queue is empty");
}*/
    if(length==0)
    {
         System.out.println("Queue is empty");
    }
    else if(front==size-1)
       {
front=-1;
front++;
length--;
       }
else{
      front++;
      length--;
        
        }
}

public void display()
{
    if(length==0)
{
    System.out.println("Queue is empty");
}
    else if(front>0&&rear==0)
    {
        for(int i=front+1;i<=rear;i++)
        {
    System.out.print(que[i]+" ");
        }
    
    }
    else if(front==rear&&length!=0)
    {
        for(int i=front;i>=rear;i++)
        {
    System.out.print(que[i]+" ");
        }
    
    }
    else {
    for(int i=front+1;i<=rear;i++)
{
System.out.print(que[i]+" ");
}
 }
    
    

}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter size");
int size=sc.nextInt();
CircularQue que=new CircularQue(size);
int ch;
do{
    System.out.println("Enter Your choice \n1.add\n2.delete\n3.display");
     ch=sc.nextInt();
    switch(ch)
    {
        case 1:       System.out.println("Enter elements of queue");
                        for(int i=0;i<size;i++)
                        {
                     int x=sc.nextInt();
                     que.addQue(x);
                        }
                        que.status();
                      break;
                      
                    
                    
     
       case 2:
         
            que.delQue();
             que.status();
            break;
          case 3:
           
       System.out.println("Display Stack QUEUE");
         que.display();
         System.out.println();
          break;
    
   
  }
   
}while(ch!=4);
}
}