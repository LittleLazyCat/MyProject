import java.util.*;
public class ListTestDrive 
{
	public static void main(String[] args) 
	{
		List l1 = new LinkedList();
		for(int i=0;i<10;i++)
		{
			l1.add(i,"list_"+i);
		}
		System.out.println(l1);
		System.out.println(l1.get(3));
		System.out.println(l1.indexOf("list_8"));
		System.out.println(Collections.binarySearch(l1,"list_4"));
		Collections.shuffle(l1);
		System.out.println(l1);
		Collections.sort(l1);
		System.out.println(l1);
		Collections.swap(l1,5,9);
		System.out.println(l1);
		Collections.reverse(l1);
		System.out.println(l1);

		
	}
}
