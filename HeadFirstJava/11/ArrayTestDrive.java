 public class ArrayTestDrive  
{

	public static void main(String[] args) 
	{
		int[] a={9,8,7,6,5,4,3,2,1};
		Sort_A(a);
		
	}

	private static void Sort_A(int[] a ){
		for(int l=0;l<a.length;l++){
			System.out.print(a[l]+" ");
		}
		System.out.println();
		int temp ;
		int num ; 
		for(int i=0;i<a.length-1;i++)
		{	
			temp = a[i];
			num = i;
			for(int j=i+1;j<a.length;j++)
			{ 
				if(temp>a[j])
				{
					num = j;
					temp=a[j];
				}
			}
			if(num != i){

				temp= a[i];
				a[i] = a[num];
				a[num] = temp;
			}
			
			/*for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					a[i]=a[j];
					a[j]=temp;
					temp=a[i];
				}
					
			}*/
		}
		for(int l=0;l<a.length;l++){
			System.out.print(a[l]+" ");
		}
	}
}
