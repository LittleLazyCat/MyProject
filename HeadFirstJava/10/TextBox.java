public class TextBox
{
	Integer i=0;
	int j;
	public void go()
	{
		j=i;
		System.out.println(j);
		System.out.println(i);
	}

	public static void main(String[] args) 
	{
		TextBox t = new TextBox();
		t.go();
	}
}
