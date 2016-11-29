public class SplitSearchTestDrive
{
	public static void main(String[] args) 
	{
		String s = "1,2,3;4,5;6,7,8,9";
		String[] s_First = s.split(";");
		double[][] d = new double[s_First.length][];
		for(int i=0;i<s_First.length;i++)
		{
			String[] s_Second = s_First[i].split(",");
			d[i] = new double[s_Second.length];
			for(int j=0;j<d[i].length;j++)
			{
				d[i][j] = Double.parseDouble(s_Second[j]);
			}
		}
		for(int i=0;i<d.length;i++)
		{ 
			for(int j=0;j<d[i].length;j++)
			{
				System.out.print(d[i][j] + "  ");
			}
			System.out.println();
		}
		
	}

}
