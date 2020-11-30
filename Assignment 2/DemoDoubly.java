import java.util.*;
class DoublyOperation{
static class Node{

Node next;
Node prev;
int data;
Node(int data)
{
this.data=data;
this.next=null;
this.prev=null;
}
}
Node head;
int length;
DoublyOperation()
{
this.head=null;
this.length=0;
}
public void biggInsert(int data)
{ 
    Node newNode=new Node(data);
if(head==null)
{
head=newNode;

}
else
{

head.prev=newNode;
newNode.next=head;
head=newNode;
}
length++;
}
public void endInsert(int data)
{
    Node newNode=new Node(data);
    Node temp=head;
if(head==null)
{
head=newNode;

}
else
{
while(temp.next!=null)
{
temp=temp.next;
}
newNode.prev=temp;
temp.next=newNode;
newNode.next=null;


}
length++;

}
public void posInsert(int x,int data)
{
     Node newNode=new Node(data);
if(x==1)
{
biggInsert( data);

}
else

if(x>length)
    {
    
    endInsert(data);
    }
 

else
{
    Node temp=head;
int i=1;
while(temp.next!=null)
{

i++;
if(i==x)
{
break;
}

temp=temp.next;

}
newNode.prev=temp;
newNode.next=temp.next;
temp.next.prev=newNode;
temp.next=newNode;

}
length++;
}
public void bigDelete()
{

if(head==null)
{
System.out.println("List is empty");

}
if(head.next==null&&head.prev==null)
{

head=null;

}
else
{
head=head.next;
head.prev.next=null;
head.prev=null;
}
length--;
}
public void endDelete()
{
Node temp=head;
if(head==null)
{
System.out.println("List is empty");

}
else {

while(temp.next.next!=null)
{
temp=temp.next;

}
temp.next.prev=null;
temp.next=null;

length--;
}
}
public void posDelete(int x)
{
    Node temp=head;
if(head==null)
{
System.out.println("List is empty");

}
if(x==1)
{
bigDelete();
}
else if(x>length){

endDelete();

}
else {
    int i=1;
   while(temp.next!=null)
   {
       i++;
   if(i==x)
   {
   break;
   
   }
   else{
   temp=temp.next;
   }
   }
   temp.next.next.prev=temp.next.prev;
   
   temp.next=temp.next.next;
   

   
   
   length--;
}
    }
public void fDisplay()
{
Node temp=head;

 if(head==null)
{
System.out.println("list is empty");

}

else{
    
while(temp.next!=null)
{
System.out.print(temp.data+" ");
temp=temp.next;
}
System.out.println(temp.data);
}
/*if(temp.next==null)
{
System.out.println(temp.data);
}*/

}
public void bDisplay()
{
Node temp=head;
if(head==null)
{
System.out.println("list is empty");

}

else {
   
while(temp.next!=null)
{
temp=temp.next;
}
while(temp.prev!=null)
{
System.out.print(temp.data+" ");
temp=temp.prev;

}
System.out.print(temp.data+" ");
}


}
}
class DemoDoubly{

public static void main(String args[])
{
DoublyOperation dL= new DoublyOperation();

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
                  dL.biggInsert(data);
                  System.out.println("add Successfully");
                  break;
              case 2:
                   System.out.println("Enter node data");
                  int data1=sc.nextInt();
                  System.out.println("Enter location");
                  int x=sc.nextInt();
                  dL.posInsert(x, data1);
                    System.out.println("add Successfully");
                  break;
              case 3:
                   System.out.println("Enter node data");
                  int data2=sc.nextInt();
                  dL.endInsert(data2);
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
                   dL.bigDelete();
                    System.out.println("Deleted Successfully");
                  
                  break;
              case 2:
                   System.out.println("Enter node index");
                  int data2=sc.nextInt();
                  dL.posDelete(data2);
                  System.out.println("Deleted Successfully");
                  break;
              case 3:
                 dL.endDelete();
                 System.out.println("Deleted Successfully");
                  break;
               default:
          
         System.out.println("Enter valid choice");
                  
          }
              break;
        
     }           
        
 
 case 3:
     System.out.println("Display in forward direction");
      dL.fDisplay();
      System.out.println();
         System.out.println("Display in backward direction");
      dL.bDisplay();
      break;
           
     
    
           
     
      default:
          
         System.out.println("Enter valid choice");
       
   }

}while(ch!=4);
     }

}