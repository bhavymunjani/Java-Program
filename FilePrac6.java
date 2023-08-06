/*
Write a program to sort the one file numbers to another.for example one file contain the 
unsorted number separated by line and write the another filr with sorted number.
*/

import java.io.*;
import java.util.*;

class FilePrac6
{
	public static void main(String args[]) throws Exception
	{
		FileReader fr=new FileReader("abc.txt");
		BufferedReader br=new BufferedReader(fr);
		
		FileWriter fw=new FileWriter("123.txt");
		
		int i=0;
		String s=" ";
		int a[]=new int[5];
		
		while((s=br.readLine())!=null)
		{
			a[i]=Integer.parseInt(s);
			i++;
		}
		Arrays.sort(a);
		for(i=0;i<a.length;i++)
		{
			fw.write(a[i]+" ");
		}
		fw.close();
	}
}