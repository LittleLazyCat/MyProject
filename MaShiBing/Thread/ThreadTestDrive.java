public class ThreadTestDrive
{
	public static void main(String[] args) 
	{
		TT tt = new TT();
		Thread t =new Thread(tt);
		t.start();
		tt.m2();
		System.out.println("main i = " + tt.i);
	}
}
class TT implements Runnable
{
	int i =100;
	public synchronized void m1()
	{
		try
		{
			
			i = 1000;
			Thread.sleep(5000);
			System.out.println("m1 i = " + i);
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
	}
	public synchronized void m2()
	{
		try
		{
			Thread.sleep(1);
			i= 2000;
			System.out.println("m2 i = " + i);
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
	}
	public void run()
	{
		try
		{
			m1();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}