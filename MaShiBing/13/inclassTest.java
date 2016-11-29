import java.util.*;
public class inclassTest 
{
	public static void main(String[] args) 
	{
		Student s1 = new Student("���","Ů");
		s1.inputSubject("Java","����",90,85,75,80);
		s1.inputSubject("SQL ","����",80,90,82,75);
		s1.inputSubject("J2EE","����",78,70,65,70);
		s1.printInfo();
		System.out.println();
		System.out.println("************************************************");
		System.out.println();
		Student s2 = new Student("������","��");
		s2.inputSubject("Java","����",86,67,71,70);
		s2.inputSubject("SQL ","����",77,70,85,66);
		s2.inputSubject("J2EE","����",88,74,68,80);
		s2.printInfo();
	}
}

class Student //ѧ����
{
	private String name;//����
	private String sex;//�Ա�
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
	
	//����ѧ���ɼ�����
	public void inputSubject(String name,String type,int ats,int ass,int ls,int fs)
	{
		Student s = new Student();
		Student.Subject sub = s.new Subject(); //�½���Ա�ڲ���
		sub.subName = name;
		sub.type = type;
		sub.setType();
		sub.attentScore = ats;
		sub.assignScore =ass;
		sub.labScore = ls;
		sub.finalScore = fs;
		subject.add(sub);

	}
	private class Subject //�γ���
	{
		

		String subName;//�γ���
		String type;//�γ�����
		SubjectType subType = new SubjectType();//�½���̬�ڲ���
		void setType()
		{
			subType.typeName = type;
			subType.setRatio();
		}
		int attentScore;//���ڷ���
		int assignScore;//��ҵ����
		int labScore;//ʵ�����
		int finalScore;//��ĩ����

		

	}
	private static class SubjectType //�γ�������
	{
		String typeName; //�γ��������ƣ������/���ԿΣ�
		double attenRatio; //���ڱ���
		static final double assignRatio = 0.1; //��ҵ����
		static final double labRatio = 0.1; //ʵ�����
		double finalRatio; //��ĩ����
		void setRatio() //���ݿγ��������ñ����ķ���
		{
			if("����".equals(typeName))
			{
				attenRatio = 0.2;
				finalRatio = 0.6;

			}else if("����".equals(typeName))
				{
					attenRatio = 0.1;
					finalRatio = 0.7;
				}
		}
	}

	public void printInfo()
	{
		class CalcScore //����ɼ���
		{
			 public int calcScore(Subject sub)
			{
				return (int)(sub.attentScore * sub.subType.attenRatio + sub.assignScore*sub.subType.assignRatio+sub.labScore*sub.subType.labRatio+sub.finalScore*sub.subType.finalRatio);
			 }
		}
		
		CalcScore cs =new CalcScore();
		System.out.println("������"+name+"  �Ա�"+ sex);
		System.out.println("�γ�   "+"����   "+"����   "+"��ҵ   "+"ʵ��   "+"��ĩ   "+"�ܷ�");
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