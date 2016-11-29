import java.util.*;
public class CollectionTestDrive 
{
	public static void main(String[] args) 
	{
		List c = new ArrayList();
		/*c.add(new String("haha"));
		c.add(new Integer(35));
		c.add(new Name("zhang","xj"));
		System.out.println(c.size());
		c.remove(new String("haha"));
		c.remove(new Name("zhang","xj"));
		System.out.println(c);
		*/
		c.add(new Name("z","a"));
		c.add(new Name("a","b"));
		c.add(new Name("a","c"));
		c.add(new Name("e","a"));
		c.add(new Name("f","b"));
		Collections.sort(c);
		System.out.println(c);

	}
}

class Name implements Comparable
{
	private String firstName,lastName;
	public Name()
	{
	}
	public Name(String First,String Last)
	{
		this.firstName = First;
		this.lastName = Last;
	}
	public String getFirstName(){return firstName;}
	public String getLastName(){return lastName;}
	public String toString(){return firstName + "  " +lastName;}
	public boolean equals(Object obj)
	{
		if(obj instanceof Name)
		{
		  Name n = (Name)obj;
		  return firstName.equals(n.firstName)&&lastName.equals(n.lastName);
		}
		return super.equals(obj);
	}
	public int hashCode()
	{
		return firstName.hashCode();
	}

	public int compareTo(Object o)
	{
		int temp = -1; 
		try
		{
			if(o instanceof Name)
			{
				Name n = (Name)o;
				temp = firstName.compareTo(n.firstName);
				if(temp != 0)
				{
					return temp;
				}
				else
				{
					temp=lastName.compareTo(n.lastName);
					
				}
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		return temp;
		
	}
}