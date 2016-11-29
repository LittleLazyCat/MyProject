class  ArrayCopyTest
{
	public static void main(String[] args) 
	{
		int[][] intArray = {{1,2},{1,2,3},{3,4}};
		int[][] copyArray = new int[3][3];
		System.arraycopy(intArray,0,copyArray,0,intArray.length);
		copyArray[2][1] = 8;
		for(int i=0;i<copyArray.length;i++)
		{
			for(int j=0;j<copyArray[i].length;j++)
			{
				System.out.print(copyArray[i][j]+"   ");
			}
			System.out.println();
		}
		String[] s  = {"a","b","c","d","e"};
		String[] c = new String[6];
		System.arraycopy(s,0,c,0,5);
		for(int i=0;i<c.length;i++)
		{
			System.out.println(c[i] +"   ");
		}

		int[] a={1,2,3};
		int[] b=new int[4];
		System.arraycopy(a,0,b,0,a.length);
		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i] +"   ");
		}

		int[][] z =new int[2][2];
		for(int i=0;i<z.length;i++)
		{
			for(int j=0;j<z[i].length;j++)
			{
				System.out.print(z[i][j]+"   ");
			}
		}
		
	}
}
