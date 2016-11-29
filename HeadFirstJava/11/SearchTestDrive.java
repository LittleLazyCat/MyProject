public class SearchTestDrive 
{
	public static void main(String[] args) 
	{
		int[] a =new int[500];
		for(int i = 0;i<a.length;i++)
		{
			a[i] = 1;
		}
		Search(a);
		
	}
	public static int Count(int[] a)
	{
		int temp = 0;
		for(int i=0;i<a.length;i++)
		{  if(a[i]==1)
			{
				temp +=a[i];
			}
			
		}
		return temp;
	}
	private static void Search(int[] a)
	{
		
		int len = a.length;
		int index = 0;
		int num = 0;
		while(Count(a) > 1)
		{
			if(a[index] == 1)
			{
				num++;
				
				if(num==3)
				{
					num=0;
					a[index]=0;
				}
			}
			index++;
			if(index == len)
			{
				index = 0;
			}
		}
		for(int i=0;i<len;i++)
		{
			if(a[i]==1)
			{
				System.out.println(i);
			}
		}

	}
}
