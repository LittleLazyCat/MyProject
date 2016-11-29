public class SearchTestDrive2
{
	public static void main(String[] args) 
	{
		int countNum = 0;
		KidCircle kc = new KidCircle(500);
		Kid k = kc.first;
		while(kc.count > 1)
		{
			countNum++;
			if(countNum ==3)
			{
				kc.delete(k);
				countNum = 0;
			}
			k=k.right;
		}
		System.out.println(kc.first.id);
	}
}
class Kid
{
	int id;
	Kid left;
	Kid right;
}
class KidCircle
{
	int count = 0;
	Kid first;
	Kid last;
	KidCircle(int n)
	{
		for(int i =0;i<n;i++)
		{
			add();
		}
	}
	void add()
	{
		Kid k = new Kid();
		k.id = count;
		if(count <=0)
		{
			k.left = k;
			k.right = k;
			first = k;
			last = k;
		}
		else
		{
			last.right = k;
			k.left = last;
			first.left = k;
			k.right = first;
			last = k;
		}
		count++;
	}
	void delete(Kid k)
	{
		if(count <=0)
		{
			return;
		}else if(count == 1)
		{
			first = last = null;
		}
		else
		{
			k.left.right = k.right;
			k.right.left = k.left;
			if(k ==first)
			{
				first = k.right;
			}else if(k == last)
			{
				last = k.left;
			}
		}
			count --;
	}
}
