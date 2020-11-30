class A {

	  
		   static int countopen=0;
		   static int countclose=0;
		    void push(char i)
		    {
		        if(i=='(' || i=='{' || i=='[')
		        {
		       countopen++;
		       
		        }
		        
		     
		    }
		    void pop(char i)
		    {
		        if(i==')' || i=='}' || i==']')
		        {
		           countclose++;
		        }
		    }
		}
	public 	class ParanthesisCheck 
		{
		    public static void main(String[] args)
		    {
		    	A obj=new A();
		        String s=("{[()]}");
		        
		       for (int i=0; i<s.length();i++)
		       {
		           obj.push(s.charAt(i));
		       }
		     
		       for (int i=0; i<s.length();i++)
		       {
		           obj.pop(s.charAt(i));
		       }
		       if(A.countopen==A.countclose)
		       {
		           System.out.println("blanced");
		       }
		       else
		       {
		           System.out.println("unbalnced");
		       }
		    }
		}
