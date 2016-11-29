public class EnumTestDrive 
{
	public enum MyColor  {red,green,blue};

	public static void main(String[] args) 
	{
		MyColor mc = MyColor.green;
		switch(mc){
			case red:
			System.out.println("red");
			break;
			case green:
			System.out.println("green");
			break;
			case blue:
			System.out.println("blue");
			break;
			default:
			System.out.println("***");
		}

	}
}
