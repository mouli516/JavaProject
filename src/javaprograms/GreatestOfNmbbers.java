package javaprograms;

public class GreatestOfNmbbers {
	
	public static void main(String ar[])
	{
		int a = 67,b = 98,c = 807;
		if(a>b && a>c)
		{
			System.out.println(a+" is greatest of given numbers");
		}
		else if(b>a && b>c)
		{
			System.out.println(b+" is greatest of given numbers");
		}
		else
		{
			System.out.println(c+" is greatest of the given numbers");
		}
	}

}
