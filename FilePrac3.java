/*write a program for one file to copy the content of another file.so its means one file write and another file are read the data*/
import java.io.*;  
class FilePrac3
{
	public static void main(String args[]) throws Exception
	{
		FileReader fr=new FileReader("abc.txt");
		BufferedReader br=new BufferedReader(fr);
		FileWriter fw=new FileWriter("123.txt");
			String s="";
			if((s=br.readLine())!=null)
			{
				fw.write(s);
			}
			
			fw.close();
			
	}
}
