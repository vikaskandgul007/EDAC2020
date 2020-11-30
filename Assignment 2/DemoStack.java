import java.util.*;
class StackOperation{
    int top;
    int stack[];
    int size;
    StackOperation()
    {
    
    }
    public  StackOperation(int size)
    {
    top=-1;
    this.size=size;
   stack=new int[this.size];
    
    }
    boolean isEmpty()
    {
    return top==-1;
    
    }
 boolean isFull()
    {
    return (top>=size-1);
    
    }
 public void push(int x)
 {
 if(isFull())
 {
 System.out.println("Stack is overflow");

 }
 else
 {
stack[++top]=x;
 System.out.println("Element push successfully");
  
 }

 }
public void pop()
{
if(isEmpty())
 {
 System.out.println("Stack is underflow");
 
 }
 else
 {
top--;
 System.out.println("Element pop successfully");
 }
}
public void peek()
{
if(isEmpty())
 {
 System.out.println("Stack is underflow");
 
 }
 else
 {
System.out.println(stack[top]);
 
 }

}
public void display()
{
    if(isEmpty())
 {
 System.out.println("Stack is underflow");
 
 }
    else{
       
for(int i=top;i>=0;i--)
{
System.out.println(stack[i]+" ");
}
}

}
 }
class DemoStack{
public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter size of stack");
    int size=sc.nextInt();
StackOperation st=new StackOperation(size);
int ch;
do{
    System.out.println("Enter Your choice \n1.Push\n2.Pop\n3.display\n4.show top element");
    ch=sc.nextInt();
    switch(ch)
    {
        case 1:       System.out.println("Enter elements of stack");
                 for(int i=0;i<size;i++)
                    {
                       int x=sc.nextInt();
                      st.push(x);
                      
                      
                    }
                    break;
     
       case 2:
         
            st.pop();
            break;
         
 
   case 3:
           
       System.out.println("Display Stack  element");
         st.display();
          break;
    
   case 4:
       st.peek();
       break;
  }
}while(ch!=5);
}
}