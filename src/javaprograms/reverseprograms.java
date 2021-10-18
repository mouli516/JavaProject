package javaprograms;

class reverseprograms
{
	public void reversenumber()
	{
		int number = 489,reminder,reverse = 0;
		while(number>0)
		{
			reminder = number%10;
			number = number/10;
			reverse= (reverse*10)+reminder;
		}
		System.out.println("Reverse of number: "+reverse);
	}
	public void reverseofstring()
	{
		String input = "saimalla";
//		String reveresdString = "";
//		int length = input.length();
		for(int i=input.length()-1;i>=0;i--)
		{
			char ch =input.charAt(i);
			System.out.print(ch);
		}
//		{
//			reveresdString = reveresdString+input.charAt(i);
//		}
			
//		System.out.println("Reverse of string: "+reveresdString);
//		if(input.equals(reveresdString))
//		{
//			System.out.println("The given string is a palindrome");
//		}
//		else
//		{
//			System.out.println("The given string is  not a palindrome");
//		}
//		System.out.println("Lenght of givien string is "+length);
	}

	public static void main(String a[])
	{
		reverseprograms r=new reverseprograms();
		r.reversenumber();
		r.reverseofstring();
		
		
	}
}