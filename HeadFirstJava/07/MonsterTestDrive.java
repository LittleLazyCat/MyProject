public class MonsterTestDrive 
{
	public static void main(String[] args) 
	{

		Monster[] ma = new Monster[3];
		ma[0] = new Vampire();
		ma[1] = new Dragon();
		ma[2] = new Monster();
		for(int x=0;x<ma.length;x++)
		{
		 ma[x].frighter(x);
		}
	}
}
class Monster
{
	boolean frighter(int x)
	{
		System.out.println("arrrgh");
		return true;
	}
}
class Vampire extends Monster
{
	void frighter(int z)
	{
		System.out.println("a bite?");
		//return true;
	}
}

class Dragon extends Monster
{
	boolean frighter(int degree)
	{
		System.out.println("breath fire");
		return true;
	}
}