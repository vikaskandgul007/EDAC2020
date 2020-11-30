class Node
{
 int data;
 Node next;
 Node(int d)
 {
     data=d;
     next=null;
 }
}




class Linked_List
{
	Node head;
	void addatStart(int data)
	{
		Node tail=null;
		Node New_Node=new Node(data);
		if(head==null)
		{
			head=New_Node;
			tail=New_Node;
		}
		else
		{
			Node temp=head;
			head=New_Node;
			head.next=temp;
			
		}
		
	}
	
	void insertAtEnd(int data)
	{
		Node tail=null;
		Node last_Node=new Node(data);
		if(head==null)
		{
			head=last_Node;
			tail=last_Node;
		}
		last_Node.next=null;
		tail=head;
		while(tail.next!=null)
		{
			tail=tail.next;
		
		}
		tail.next=last_Node;
	}
	
	 void insertAfter(Node prev_node,int val)
   {
       if(prev_node==null)
       {
           System.out.println("invalid");
       }
       Node new_node=new Node(val);				
       new_node.next=prev_node.next;				
       prev_node.next=new_node;					
   }
	
	void inserBefore(Node nextNode, int val)
	{
		if(nextNode==null)
			System.out.println("invalid");
		
		if(head==nextNode)
		{
			Node NewNode=new Node(val);
			NewNode.next=head;
			head=NewNode;
		}
		else
		{
			Node p=null;
			
			for(Node NewNode=head;NewNode!=nextNode;p=NewNode,NewNode=NewNode.next);
			Node m=new Node(val);
			m.next=p.next;
			p.next=m;
		}
		

		
		
	}
	
	void deleteFirst()
	{
		if(head==null)
			System.out.println("UNDERFLOW");
		Node temp=head;
		head=head.next;
		temp=null;
	}
	
	void deleteLastNode()
	{
		if(head==null)
			System.out.println("UNDERFLOW");
		Node ptr=head;
		Node preptr=head;
	      while(ptr.next!=null)
	      {
	    	  preptr=ptr;
	    	  ptr=ptr.next;
	      }
	      preptr.next=null;
	      
	} 
	
	void deleteNode(Node del)
	{
		Node ptr=head;
		Node preptr=head;
		while(preptr.next!=del)
		{
			preptr=ptr;
			ptr=ptr.next;
		}
		preptr.next=ptr.next;
		ptr=null;
	}
	
	
	
	 void printList()
   {
       Node n=head;
       while(n!=null)
       {
           System.out.print(n.data+" ");
           n=n.next;
       }
   }
	
	
	public static void main(String[] args) {
		Linked_List ll=new Linked_List();
      
      Node first=new Node(1);
      Node second=new Node(2);
      Node third=new Node(3);
      Node forth=new Node(4);
      Node fifth=new Node(5);
      
      ll.head=first;				
      first.next=second;			
      second.next=third;
      third.next=forth;
      forth.next=fifth;
      
      
      ll.addatStart(20);
      ll.printList();
      System.out.println();
      ll.insertAtEnd(40);
      ll.printList();
      System.out.println();
      ll.insertAfter(second, 77);
      ll.printList();
      System.out.println();
      ll.inserBefore(third, 88);
      ll.printList();
      System.out.println();
      ll.deleteFirst();
      ll.printList();
      ll.deleteLastNode();
      System.out.println();
      ll.printList();
      ll.deleteNode(third);
      System.out.println();
      ll.printList();
      
	}
}