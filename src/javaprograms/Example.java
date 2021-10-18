package javaprograms;

  class Exa {
	
	public static void add()
	{
		int a=10;
		int b= 20;
		int c=a+b;
		System.out.println(c);
		
		}
	public int add2(int x,int y,int z)
	{
		
		int c=x+y+z;
		System.out.println(c);
		
		return c;
		
	}
 }
      class Example
	{
		public static void main(String args[])
		{
			
			Exa.add();
			Exa.add();
			Exa e = new Exa();
			e.add2(10, 20, 30);
			e.add2(38, 47, 476);
			int number = e.add2(30, 4, 0);
			
			System.out.println("from main method"+number);
		}
		
	}
	
	
	
	
	
	
	
	
	


