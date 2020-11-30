import java.util.*;
class Node{
Node next;
int data;
Node(int data)
{
this.data=data;
next=null;

}

}
class CircularLinkedList{
Node head;
int length;
public CircularLinkedList()
{
this.head=null;
this.length=0;

}
boolean isEmpty()
{
return head==null;
}
public void biggInsert(int data)
{
Node newNode=new Node(data);

if(head==null)
{
head=newNode;
head.next=head;
}
else
{
    newNode.next=head;
    head.next=newNode;
 
head=newNode;
}
length++;
}
public void midInsert(int pos,int data)
{
    Node temp=head;
Node newNode=new Node(data);
for(int i=0;i<pos-2;i++)
{
temp=temp.next;
}
newNode.next=temp.next;
temp.next=newNode;
length++;
}
public void lastInsert(int data)
{ Node temp=head;
    Node newNode=new Node(data);
if(head==null)
{
head=newNode;
}
else
{
while(temp.next!=head)
{
temp=temp.next;

}
newNode.next=temp.next;
temp.next=newNode;
}
length++;
}
public void bigDelete()
{
    Node temp=head;
if(isEmpty())
{
System.out.println("List is empty");
}
else if(length==1)
{
head.next=null;
head=null;
}
else{
    while(temp.next!=head)
    {
    temp=temp.next;
    }
    temp.next=head.next;
        head=head.next;
    

}
length--;
}
public void endDelete()
{
    Node temp=head;
    if(isEmpty())
{
System.out.println("List is empty");
}
    else if(length==1)
{
head.next=null;
head=null;
System.out.println("Deleted Successfully");
}
    else{
    while(temp.next.next!=head){
    
    temp=temp.next;

    }
    temp.next= head;
temp.next.next=null;

System.out.println("Deleted Successfully");
length--;
}
}

public void posDelete(int pos)
{
    
Node temp=head;
if(head==null)
{
System.out.println("List is empty");

}
else if(pos==1)
{
bigDelete();
}
else if(pos>length){

endDelete();

}
else {

int i=1;
while(temp.next!=head)
{
i++;
if(i==pos)
{
break;
}
temp=temp.next;
}
temp.next=temp.next.next;

length--;
}
}

public void display()
{
 Node temp=head;
 if(isEmpty())
{
System.out.println("List is empty");
}
 else{
while(temp.next!=head)
{
System.out.println(temp.data);
temp=temp.next;
}
System.out.println(temp.data);

}
}
}
class Cdemo{
public static void main(String args[])
{
CircularLinkedList Cl=new CircularLinkedList();
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
                 Cl.biggInsert(data);
                  System.out.println("add Successfully");
                  break;
              case 2:
                   System.out.println("Enter node data");
                  int data1=sc.nextInt();
                  System.out.println("Enter location");
                  int x=sc.nextInt();
                  Cl.midInsert(x, data1);
                    System.out.println("add Successfully");
                  break;
              case 3:
                   System.out.println("Enter node data");
                  int data2=sc.nextInt();
                  Cl.lastInsert(data2);
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
                   Cl.bigDelete();;
                    System.out.println("Deleted Successfully");
                  
                  break;
              case 2:
                   System.out.println("Enter node index");
                  int data2=sc.nextInt();
                  Cl.posDelete(data2);
                  System.out.println("Deleted Successfully");
                  break;
              case 3:
                 Cl.endDelete();
                 
                  break;
               default:
          
         System.out.println("Enter valid choice");
                  
          }
              break;
        
     }           
        
 
 case 3:
     Cl.display();
      break;
           
     
    
           
     
      default:
          
         System.out.println("Enter valid choice");
       
 }

}while(ch!=4);

}


}
