package javaprograms;


abstract class testa {
	
	testa()
	{
		System.out.println("bike is created");	
	}
	abstract void run();
	
	void changegear()
	{
		System.out.println("gear changed");
		
	}
}
	
class honda extends testa
	{
		void run()
		{
			System.out.println("running safely");
		}
	}

 public class test
	{
		
			public static void main(String args[])
			{
				testa hon = new honda();
				
				
				hon.run();
				hon.changegear();
			}
		
		
	}
















