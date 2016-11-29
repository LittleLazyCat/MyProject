import java.util.*;
public class MapTestDrive 
{
	public static void main(String[] args) 
	{
		Map m1 = new HashMap();
		Map m2 = new TreeMap();
		//m1.put("one",new Integer(1));
		m1.put("one",1);
		//m1.put("two",new Integer(2));
		m1.put("two",2);
		m1.put("three",new Integer(3));
		m1.put("four",new Integer(4));
		m1.put("five",new Integer(5));
		m2.put("A",new Integer(1));
		m2.put("B",new Integer(2));
		System.out.println(m1.containsKey("one"));//是否包含某个Key
		System.out.println(m2.containsValue(new Integer(2)));//是否包含某个值
		//int  i = ((Integer)m1.get("five")).intValue();//根据某个键获得值
		int i =(Integer)m1.get("five");
		System.out.println(i);
		System.out.println(m1);
		System.out.println(m2.size());//键值对个数
		Map m3 =new HashMap(m1);
		m3.putAll(m2);
		m3.put("C",new String("where"));
		System.out.println(m3);

		
		
	}
}
