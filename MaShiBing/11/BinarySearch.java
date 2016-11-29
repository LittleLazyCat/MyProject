class BinarySearch 
{
	public static void main(String[] args) 
	{
		int[] a = {1,2,3,4,5,6,7,8,9,10,33,55,77,99};
		int i = 99;
		BinarySearch bs =new BinarySearch();
		System.out.println(bs.BS(a,i));
		//System.out.println(bs.Search(a,i));
	}
	public int Search(int[] a,int j)
	{
		for(int i=0;i<a.length;i++)
		{
			if(j == a[i])
			{
				return i;
			}
		}
		return -1;
	}
	public int BS(int[] a,int i)
	{
		if(a.length == 0)
		{
		 return -1;
		}
		int start = 0;
		int end = a.length - 1;
		int m = (start + end)/2;
		while(start <= end)
		{
			if(i == a[m])
			{
				return m;
			}
			if(i < a[m])
			{
				end = m-1;
			}
			if(i> a[m])
			{
				start = m+1;
			}
			m=(start+end)/2;
		}
		return -1;
	}
}
