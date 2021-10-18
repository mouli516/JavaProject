package javaprograms;


class programs 
{
	public void Reversenumber()
	{
		
		int number = 4699;
		int reminder;
		int reverse =0;
		while(number>0)
		{
		reminder = number%10;
		number = number/10;
		reverse = (reverse*10)+reminder;
		}
		
		System.out.println("the reversed numebris "+reverse);
		
	}
	
	
	public void reverseofstring()
	{
		String name = "mouli";
		String Reverse = "";
		for(int i = name.length()-1;i>=0;i--)
		{
			Reverse=Reverse+name.charAt(i);
		}
		
		System.out.println("reversed string is "+Reverse);
	}
	
}








public class ReverseOfStringAndNumber {
	
	public static void main(String args[])
	{
		programs p= new programs();
		p.Reversenumber();
		p.reverseofstring();
	}

	
	
	
	

}
