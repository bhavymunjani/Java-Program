/*Syncronized in mathod 
two Thread in one class*/

class Test
{
	   

	//synchronized void me()
	void me()
	{
		for(int i=0;i<3;i++)
		{
			System.out.println("user thread");
		}
		synchronized(this){            // or ahiya obj. sathe=> synchronized(obj)
		try
		{
			System.out.println("Good");
			Thread.sleep(500);
			System.out.println("Morning");
			Thread.sleep(500);
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
		}
		
	}
}
class Sync extends Thread
{
	Test t;
	Sync(Test t)
	{
		this.t=t;
	}
	public void run()
	{
		t.me();
	}
}
class SyncDemo 
{
	public static void main(String args[]) throws Exception
	{
		Test t1=new Test();
		Sync s1=new Sync(t1);
		Sync s2=new Sync(t1);
		s1.start();
		s1.join();
		s2.start();
		s2.join();
		
	}
}