class LinkedList
{
        Node head;

static class Node{
int data;
Node next;
public Node(int data)
{
this.data=data;

next=null;
}
}
boolean isEmpty()
{
return head==null;
}
void display()  
     {  
         Node ptr = head;  
 while (ptr != null)  
         {  
 System.out.println(ptr.data);  
             ptr = ptr.next;  
         }  
     }
void midInsert(int pos,int data)
{
Node temp=head;   
Node four2  = new Node(data);  
for(int i=0;i<pos-2;i++)
{
temp=temp.next;
}
four2.next=temp.next;
temp.next=four2;
}
void bigInsert(int data)
{
Node temp=head; 
Node first2 = new Node(data);  
first2.next=head;
head=first2;

}
void lastInsert(int data)
{
   Node temp=head; 
   Node last  = new Node(data);
while(temp.next!=null)
{
temp=temp.next;
}
temp.next=last;
last.next=null;
}
void bigDelete()
{
    if(isEmpty())
    {
   System.out.println("List is empty");
    }
    else{
head=head.next;
    }
}
void lastDelete()
{
    if(isEmpty())
    {
   System.out.println("List is empty");
    }
    else{
Node temp=head; 
while(temp.next.next!=null)
{
temp=temp.next;
}
temp.next=null;
}
}
void midDelete(int pos)
{
if(isEmpty())
    {
   System.out.println("List is empty");
    }
else{
Node temp=head;
for(int i=1;i<pos-1;i++)
{
temp=temp.next;
}
Node temp2=temp.next;
temp.next=temp2.next;
temp2.next=null;

}
}
public static void main(String[] args)  
     {  
        
 LinkedList list = new LinkedList();  
  
 list.head   = new Node(10);  
         Node second = new Node(20);  
         Node third  = new Node(30); 
         Node four  = new Node(40);  
         Node five  = new Node(50);  
         Node six  = new Node(60);  
  
list.head.next = second;   
second.next = third; 
third.next=four; 
four.next=five;
five.next=six;

int ch=0;
do{
 System.out.println("Enter Your choice \n1.add\n2.delete\n3.display");
Scanner sc=new Scanner(System.in);
 ch=sc.nextInt();
 switch(ch)
 {
     case 1:
     {
         System.out.println("Enter Your choice \n1.add at begnning\n2.Middle\n3.last");
          ch=sc.nextInt();
          switch(ch)
          {
              case 1:
                  System.out.println("Enter node data");
                  int data=sc.nextInt();
                  list.bigInsert(data);
                  System.out.println("add Successfully");
                  break;
              case 2:
                   System.out.println("Enter node data");
                  int data1=sc.nextInt();
                  System.out.println("Enter location");
                  int x=sc.nextInt();
                  list.midInsert(x, data1);
                    System.out.println("add Successfully");
                  break;
              case 3:
                   System.out.println("Enter node data");
                  int data2=sc.nextInt();
                  list.lastInsert(data2);
                    System.out.println("add Successfully");
                  break;
               default:
          
         System.out.println("Enter valid choice");
                  
          }
              break;
        
     }           
                 
                
     
       case 2:
     {
         System.out.println("Enter Your choice \n1.delete at begnning\n2.Middle\n3.last");
          ch=sc.nextInt();
          switch(ch)
          {
              case 1:
                   list.bigDelete();
                    System.out.println("Deleted Successfully");
                  
                  break;
              case 2:
                   System.out.println("Enter node index");
                  int data2=sc.nextInt();
                  list.midDelete(data2);
                  System.out.println("Deleted Successfully");
                  break;
              case 3:
                 list.lastDelete();
                 System.out.println("Deleted Successfully");
                  break;
               default:
          
         System.out.println("Enter valid choice");
                  
          }
              break;
        
     }           
        
 
 case 3:
      list.display();
      break;
           default:
          
         System.out.println("Enter valid choice");
       
      }

}while(ch!=4);
     }
}