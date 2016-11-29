public class FbncTestDrive 
{
	public static void main(String[] args) 
	{

		System.out.println(calcFbnc(40));
	}
	public static int calcFbnc(int n)
	{
		int x=1,y=1,temp=0;
		if(n==1||n==2)
		{
			temp = 1;
		}
		else
		{
			for(int i=2;i<n;i++)
			{
				temp = x+y;
				x=y;
				y=temp;
			}
		}
		return temp;
	}
}
