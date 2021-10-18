package javaprograms;

class sample
{
	public void factorial()
	{
		int number = 43;
		long fact =1 ;
		//for(int i=number;i>=1;i--)
		for(int i=1;i<=43;i++)
		{
			fact = fact*i;
		}
		System.out.println("Factorial of given number is: "+fact);
	}
}
class factorialandfab
{
	public static void main(String a[])
	{
		sample s = new sample();
		s.factorial();
	}
}