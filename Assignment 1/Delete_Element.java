public class Delete_Element 
{
	
	void insert(int arr[],int element,int position)
	{
		int last=arr.length;
		for(int i=arr.length-1;i>position-1;i--)
		{
			arr[i]=arr[i-1];
		}
		arr[position-1]=element;
		System.out.println("Insert "+element+" at "+position+" Position : ");
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
		System.out.print(last);
		System.out.println();
	}
	
	void delete(int []arr,int element)
	{
		System.out.println("Delete "+element +" From array : ");
		for( int i=0; i< arr.length; i++ )
		{
			if ( element == arr[i] )
			{
				for(int j=i;j<arr.length-1;j++)
				{
					arr[j]=arr[j+1];
				}
				break;
			}
		}
		for(int i=0;i<arr.length-1;i++)
			System.out.print(arr[i]+" ");
		System.out.println();
		
	}
	
		
	

	public static void main(String[] args)
	 {
	int []arr= {1,2,3,4,5,6,7,8};
	Delete_Element op=new Delete_Element();
		
	op.insert(arr,12,3);
	op.delete(arr, 5);
	

	}
}