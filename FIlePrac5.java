/*Write a program that takes input for filename and search word from command line 
arguments and checks whether that file exists or not. If exists, the program will display 
those lines from a file that contains given search word. 
*/

import java.io.*; 
class FilePrac5
{
	public static void main(String args[])throws IOException 
	{ 
		File f=new File(args[0]); 
		
		FileReader fr=new FileReader(f); 
		BufferedReader br=new BufferedReader(fr); 
		
		String s,s1[];  
			
		if(f.exists()) 
		{ 
			while((s=br.readLine())!=null) 
			{ 
				s1=s.split(" "); 
				for(int i=0;i<s1.length;i++) 
				{ 
					if(s1[i].equals(args[1])) 
					{ 
						System.out.println(s); 
						break; 
					} 
				} 
			} 
		}
		else 
		{ 
			System.out.println("File not exists"); 
		} 
	} 
				
} 
 
