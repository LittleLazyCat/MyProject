import java.util.*;
public class IteratorTestDrive 
{
	public static void main(String[] args) 
	{
		Collection c = new HashSet();
		c.add(new Name("z","xj"));
		c.add(new Name("z","xx"));
		c.add(new Name("w","rf"));
		c.add(new Name("w","j"));
		Iterator i = c.iterator();
		while(i.hasNext())
		{
			Name n = (Name)i.next();
			if(n.getLastName().length()<2)
			{
				i.remove();
			}
			System.out.print(n.getLastName()+" ");
		}
		System.out.println();
		System.out.println(c);
		
	}
}
