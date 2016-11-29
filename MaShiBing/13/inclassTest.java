import java.util.*;
public class inclassTest 
{
	public static void main(String[] args) 
	{
		Student s1 = new Student("李红","女");
		s1.inputSubject("Java","考查",90,85,75,80);
		s1.inputSubject("SQL ","考试",80,90,82,75);
		s1.inputSubject("J2EE","考查",78,70,65,70);
		s1.printInfo();
		System.out.println();
		System.out.println("************************************************");
		System.out.println();
		Student s2 = new Student("黄晓明","男");
		s2.inputSubject("Java","考查",86,67,71,70);
		s2.inputSubject("SQL ","考试",77,70,85,66);
		s2.inputSubject("J2EE","考查",88,74,68,80);
		s2.printInfo();
	}
}

class Student //学生类
{
	private String name;//姓名
	private String sex;//性别
	//private ArrayList<Subject> subject = new ArrayList<Subject>();
	private Collection<Subject> subject = new ArrayList<Subject>();
	public Student()
	{
		  
	}
	public Student(String n,String s)
	{
		this.name = n;
		this.sex = s;

	}
	
	//导入学生成绩方法
	public void inputSubject(String name,String type,int ats,int ass,int ls,int fs)
	{
		Student s = new Student();
		Student.Subject sub = s.new Subject(); //新建成员内部类
		sub.subName = name;
		sub.type = type;
		sub.setType();
		sub.attentScore = ats;
		sub.assignScore =ass;
		sub.labScore = ls;
		sub.finalScore = fs;
		subject.add(sub);

	}
	private class Subject //课程类
	{
		

		String subName;//课程名
		String type;//课程类型
		SubjectType subType = new SubjectType();//新建静态内部类
		void setType()
		{
			subType.typeName = type;
			subType.setRatio();
		}
		int attentScore;//出勤分数
		int assignScore;//作业分数
		int labScore;//实验分数
		int finalScore;//期末分数

		

	}
	private static class SubjectType //课程性质类
	{
		String typeName; //课程性质名称（考查课/考试课）
		double attenRatio; //出勤比例
		static final double assignRatio = 0.1; //作业比例
		static final double labRatio = 0.1; //实验比例
		double finalRatio; //期末比例
		void setRatio() //根据课程性质设置比例的方法
		{
			if("考查".equals(typeName))
			{
				attenRatio = 0.2;
				finalRatio = 0.6;

			}else if("考试".equals(typeName))
				{
					attenRatio = 0.1;
					finalRatio = 0.7;
				}
		}
	}

	public void printInfo()
	{
		class CalcScore //计算成绩类
		{
			 public int calcScore(Subject sub)
			{
				return (int)(sub.attentScore * sub.subType.attenRatio + sub.assignScore*sub.subType.assignRatio+sub.labScore*sub.subType.labRatio+sub.finalScore*sub.subType.finalRatio);
			 }
		}
		
		CalcScore cs =new CalcScore();
		System.out.println("姓名："+name+"  性别："+ sex);
		System.out.println("课程   "+"性质   "+"出勤   "+"作业   "+"实验   "+"期末   "+"总分");
		System.out.println("===============================================");
		/*
		int size = subject.size();
		for(int i=0;i<size;i++)
		{
			Subject sub =subject.get(i);
			
			System.out.println(sub.subName+"   "+sub.type+"    "+sub.attentScore+"     "+sub.assignScore+"     "+sub.labScore+"     "+sub.finalScore+"     "+cs.calcScore(sub));
		}
		*/
		Iterator<Subject> i = subject.iterator();
		while(i.hasNext())
		{
			Subject sub =i.next();
			
			System.out.println(sub.subName+"   "+sub.type+"    "+sub.attentScore+"     "+sub.assignScore+"     "+sub.labScore+"     "+sub.finalScore+"     "+cs.calcScore(sub));
		}
	}
}