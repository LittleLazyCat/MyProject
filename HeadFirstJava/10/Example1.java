public class Example1{  
    public static void main(String args[]){   
    //i�Ǳ�ʾ�·ݵģ����������36���£�Ҳ�������꣬���ӵ�����  
      int i;  
      long arr[]=new long[36];   //�������ʱ��������ÿ�������ӵĶ���  
      arr[0]=arr[1]=1;  
      System.out.println("��1����������1��"+", "+"������"+2);  
      System.out.println("��2����������1��"+", "+"������"+2);  
      for(i=2;i<=35;i++){  
         arr[i]=arr[i-1]+arr[i-2];  
         System.out.println("��"+(i+1)+"����������"+arr[i]+"��"+", "+"������"+2*arr[i]);  
             //������ ÿ�����ֶ���ǰ����������֮��  
         }  
   }  
          
}

