import java.util.*;
class CircularDoublyLinked{
Node head;
int length=0;
boolean isEmpty()
{
return head==null;
}
public void bigDelete()
{
    Node temp=head;
if(isEmpty())
{
System.out.println("List is empty");
}
if(length==1)
{
head.next=null;
head=null;

}
else{
    while(temp.next!=head)
    {
    temp=temp.next;
    }
    temp.next=temp.next.next;
    head.next=head;
}


}

public void posDelete(int pos)
{
Node temp=head;
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
temp.next.next=null;
length--;
}
public void endDelete()
{
    Node temp=head;
if(length==1)
{
head.next=null;
head=null;
}
else
    while(temp.next.next!=head){
    
    temp=temp.next;
     }
temp.next.next=null;
temp.next= head;


}

}