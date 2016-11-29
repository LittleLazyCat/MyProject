import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedWriter;

public class AB2CTestDrive 
{
	public static void main(String[] args) throws Exception
	{
		FileManager a = new FileManager("a.txt",new char[]{'\n'});
		FileManager b = new FileManager("b.txt",new char[]{'\n',' '});
		FileWriter c = new FileWriter("c.txt");
		BufferedWriter bw = new BufferedWriter(c);
		String aWord=null;
		String bWord=null;
		while ((aWord = a.nextWord())!=null)
		{
			bw.write(aWord);
			bw.newLine();
			bWord = b.nextWord();
			if(bWord != null)
			{
				bw.write(bWord);
				bw.newLine();
			}
		}
		while ((bWord = b.nextWord())!=null)
		{
			bw.write(bWord);
			bw.newLine();
			
		}
		bw.close();
		
	}
}

class FileManager
{
	String[] words=null;
	int pos=0;
	public FileManager(String filename,char[] seperators) throws Exception
	{
		File f = new File(filename);
		FileReader reader = new FileReader(f);
		char[] buf = new char[(int)f.length()];
		int len =reader.read(buf);
		String result = new String(buf,0,len);
		String regex =null;
		if(seperators.length > 1)
		{
			regex = ""+seperators[0]+"|"+seperators[1];

		}else{
			regex = ""+seperators[0];
		}
		words =result.split(regex);
	}
	public String nextWord()
	{
		if(pos == words.length)
		{
			return null;
		}
		return words[pos++];
	}

}