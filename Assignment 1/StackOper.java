public class StackOper
{
	
	 int[] stack=new int[5];
	 int top=0;
	
	 public void push(int item){
		if (top == 5-1 )
		{
			System.out.println("Stack Overflow");
		}
		else {
			stack[top++] = item;
			}
	}

	public int pop() {
		if (top <= 0) {
			System.out.println("Stack is Empty");
			return -1;
		}
		else 
			return stack[--top];
	}
	
	public boolean empty() {
		return top == 0;
	}
	
	public int top(){
		if (empty())
		{
			System.out.println("Top On Empty Stack");
			return -1;
		}
		return stack[top-1];
	}

	public static void main(String[] args)
	{
	
	StackOper ms = new StackOper();
	ms.push(10);
	ms.push(7);
	ms.push(12);
	ms.push(4);
	ms.push(12);
//	ms.push(11);
//	System.out.println(ms.pop());
//	System.out.println(ms.pop());
	}
}