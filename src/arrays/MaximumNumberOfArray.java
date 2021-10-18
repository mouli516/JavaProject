package arrays;

public class MaximumNumberOfArray {
	
	
	
public static void main(String[] args) {
		
		
		int[] ary = new int[] {88,96,2,70,68};
		int min = ary[0];
		for(int i = 1;i<ary.length;i++)
		{
			if(ary[i]>min)
			{
				min=ary[i];
			}
		}
		
		System.out.println("MinimumElement of an array = "+min);

	}

}
