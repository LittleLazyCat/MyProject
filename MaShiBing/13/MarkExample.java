import java.io.BufferedInputStream;   
import java.io.ByteArrayInputStream;   
import java.io.IOException;   
   
/**  
* @author WuDian  
*   
*/ 
public class MarkExample {   
    public static void main(String[] args) {   
   
        try {   
            // ��ʼ��һ���ֽ����飬����5���ֽڵ�����   
            byte[] bytes={1,2,3,4,5};   
            // ��һ��ByteArrayInputStream����ȡ����ֽ�����   
            ByteArrayInputStream in=new ByteArrayInputStream(bytes);   
            // ��ByteArrayInputStream������һ��BufferedInputStream������ʼ����������СΪ2��   
            BufferedInputStream bis=new BufferedInputStream(in,2);  
				 bis.mark(3);  
            // ��ȡ�ֽ�1   
            System.out.print(bis.read()+",");   
            // ���ֽ�2������ǣ�ͬʱ����readlimit����Ϊ1   
            // ����JAVA�ĵ�mark�Ժ����ֻ�ܶ�ȡ1���ֽڣ�����mark���ʧЧ����ʵ�����н����������   
            System.out.println("mark");   
            
                
            /*  
             * ������ȡ�����ֽڣ�������readlimit�Ĵ�С��mark�������Ч  
             */ 
            // ������ȡ�����ֽ�   
            System.out.print(bis.read()+",");    
            System.out.print(bis.read()+",");    
            // ����reset������δ�����쳣��˵��mark�������Ч��   
            // ��Ϊ����Ȼreadlimit����Ϊ1���������BufferedInputStream��Ļ�������СΪ2��   
            // ���������ȡ2�ֽ�   
            System.out.println("reset");   
            bis.reset();   
                
            /*  
             * ������ȡ3���ֽڣ������˻�������С��mark���ʧЧ��  
             * �����������BufferedInputStream��Ļ�������С����readlimit,  
             * mark����ɻ�������С����  
             */ 
            // reset���ú�������ȡ3���ֽڣ�������BufferedInputStream��Ļ�������С   
            System.out.print(bis.read()+",");   
            System.out.print(bis.read()+",");   
            System.out.print(bis.read()+",");   
            // �ٴε���reset���ã��׳��쳣��˵��mark���ȡ3���ֽڣ�mark���ʧЧ   
            System.out.println("reset again");   
            bis.reset();   
        } catch (IOException e) {   
            // TODO Auto-generated catch block   
            e.printStackTrace();   
        }   
    }   
}