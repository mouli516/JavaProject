package arrays;

public class SumOfIntArray {

	public static void main(String[] args) {
		
		
		int[] ary = new int[] {98,89,9,07,8,9,};
		int SumOfArray = 0;
		
		for(int i =0;i<ary.length;i++)
		{
			SumOfArray=SumOfArray+ary[i];
			
		}
		System.out.println(SumOfArray);
	}

}
