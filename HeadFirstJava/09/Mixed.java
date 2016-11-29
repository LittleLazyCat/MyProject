class Boo
{
	public Boo(int a){};
	//public Boo(String s){};
	public Boo(String s,int a){};
} 
class SonOfBoo extends Boo
{
	public SonOfBoo()
	{
		//super("boo");
	}
	public SonOfBoo(int a ,String s){
		super(a);
	}
	//public SonOfBoo(String a,String b,String c){
	//	super(a,b);

	//}
	public SonOfBoo(int a,int b,int c)
	{
		super("star",a);
	}
}

public class Mixed 
{
	
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
