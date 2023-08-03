/*
brijesh hareshbhai
*/
import java.util.*;
class CopyArray
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int a[]=new int[n];
	int b[]=new int[a.length];
	for(int i=0;i<a.length;i++)
	{
		a[i]=sc.nextInt();
	}
	for(int i=0;i<b.length;i++)
	{
		b[i]=a[i];
	}
	for(int i=0;i<b.length;i++)
	{
		System.out.println("array b="+b[i]);
	}
	
	}
}