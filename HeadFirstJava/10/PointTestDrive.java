public class  PointTestDrive
{
	
	public static void main(String[] args) 
	{
		Point p =new Point(1,2,3);
		p.setX(5);
		//p.setY(2);
		//p.setZ(3);
		p.caculate(p);
	}
}
class Point
{
	private double x,y,z;
	public Point(double a,double b,double c)
	{
		this.x = a;
		this.y = b;
		this.z = c;
	}
	public void setX(double a)
	{
		this.x=a;
	}
	public void setY(double a)
	{
		this.y=a;
	}
	public void setZ(double a)
	{
		this.z=a;
	}
	public double getX()
	{
		return x;
	}
	public double getY()
	{
		return y;
	}
	public double getZ()
	{
		return z;
	}
	public void caculate(Point p)
	{
		double z = p.x*p.x+p.y*p.y+p.z*p.z;
		System.out.println("该点到原点距离的平方为"+z);
	}
}