public class SortTestDrive
{
	public static void main(String[] args) 
	{
		int[] a={1,3,2,4,99,45,12,3};
		Sort(a);
		for(int i =0;i<a.length;i++){
			System.out.print(a[i] +" ");
		}
		
	}
	public static void Sort(int[] a){
		int len = a.length;
		for(int i = len -1;i>1;i--){
			for(int j = 0;j<i;j++){
				if(a[j]<a[j+1]){
					int temp = a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}

	}
}
