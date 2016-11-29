public class SellTicketsTest
{
	public static void main(String[] args) 
	{
		SellTicket s = new SellTicket();
		new Thread(s,"Window1").start();
		new Thread(s,"Window2").start();
		new Thread(s,"Window3").start();
	}
}
class SellTicket implements Runnable
{
	int pId= 0;
	public void sell()
	{
		pId++;
		System.out.println(Thread.currentThread().getName() + "¬Ù¡À" + pId +"∫≈∆±£°");
	}
	public void run()
	{
		try
		{
			while(pId<200)
			{
				sell();
				Thread.sleep(1);
			}
			
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
	}

}