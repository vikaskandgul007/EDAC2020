class NodeDLL
 {
	public int data;
	public NodeDLL fLink;
	public NodeDLL bLink;

	NodeDLL(int data)
	{
		this.data=data;
		this.fLink=this.bLink=null;
	}
}
class DoubleLinkList
{
	private NodeDLL start;
	private int length;		
	DoubleLinkList()
	{
		this.start=null;
		this.length=0;
	}
	
	public void insertBeg(int data)
	{
		NodeDLL newNode=new NodeDLL(data);
		
		if(start == null)
		{
			start=newNode;				
		}
		else 
		{
			start.bLink=newNode; 	 
			newNode.fLink=start;
			start=newNode;
		}
	}
	public void insertEnd(int data)
	{
		NodeDLL newNode=new NodeDLL(data);
		if(start == null)
		{
			start = newNode;	
		}
		else
		{
			NodeDLL n = start;
			while(n.fLink != null)
			{
				n=n.fLink;
			}
			n.fLink=newNode;
			newNode.bLink=n;
		}
	}
	public void insertPos(int data,int pos)
	{
		if(pos == 1)
		{
			insertBeg(data);
		}
		else
		{
			if(pos > length)
			{
				insertEnd(data);
				
			}
			else
			{
				int i=1;
				NodeDLL n = start;
				while(n.fLink !=null)
				{
					i++;
					if(i==pos) 
						break;
					n=n.fLink;
				}
				NodeDLL newNode = new NodeDLL(data);
				newNode.bLink=n;
				newNode.fLink=n.fLink;
				n.fLink.bLink=newNode;		
				n.fLink=newNode;
				
			}
			length++;
		}
	}
	
	public void deleteBeg()
	{
		NodeDLL n = start;
		if(start == null)
		{
			System.out.println("list empty");
		}
		else
		{
			start = n.fLink;
			start.bLink=null;
		}
		length--;
	}
	public void deletePos(int pos)
	{
		//position ko identify karna hai fir delete karna hai
		if(pos <0)
		{
			System.out.println("pos does not exist");
			return;
		}
		if(pos==1)
		{
			deleteBeg();
		}
		else if(pos >length)
		{
			deleteEnd();
		}
		else
		{
			int i=1;
			NodeDLL p = start;
			while(p.fLink != null)
			{
				i++;
				if(i== pos) break;
				p=p.fLink;
 			}
			p.fLink.fLink.bLink=p;
			p.fLink=p.fLink.fLink;
			length--;
		}
		
	}
	public void deleteEnd()
	{
		if(start == null)
		{
			System.out.println("list empty");
		}
		else
		{
			NodeDLL n=start;
			while(n.fLink.fLink != null)
			{
				n=n.fLink;
			}
			n.fLink.bLink=null;
			length--;
		}
		
	}
	
	public void displayForword()
	{
		NodeDLL n=start;
		while(n.fLink !=null)
		{
			System.out.print(n.data+" -> " );
			n=n.fLink;
		}
		System.out.println(n.data+" ");
	}
	
	public void displayBackword()
	{
		NodeDLL n= start;
		while(n.fLink != null)
		{
			n=n.fLink;
		}
		while(n.bLink!=null)
		{
			System.out.print(n.data+" <--- ");
			n=n.bLink;
		}
		System.out.println(n.data+" ");
	}
}
public class DoubleLL {

	public static void main(String[] args) {
		DoubleLinkList dll=new DoubleLinkList();
		dll.insertBeg(1);
		dll.insertBeg(2);
		dll.insertBeg(3);
		dll.insertBeg(4);
		dll.displayForword();
		System.out.println("----------------------");
		dll.displayBackword();
		System.out.println("----------------------");
		dll.insertEnd(5);
		dll.insertBeg(6);
		dll.displayForword();
		dll.insertPos(90, 3);
		dll.displayForword();

	}

}