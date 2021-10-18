package javaprograms;

public class DivisibleByTwoNumbers {
	
	public static void main(String args[])
	{
		int number = 15;
		if(number%3==0 && number%5==0)
		{
			System.out.println(number+" is divisible by given Two numbers");
		}
		else
		{
			System.out.println(number+" is not divisible by given two numbers");
		}
	}

}
