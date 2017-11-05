package learniglamda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sample {
	
	public static boolean isGreaterThan3(int number){
		
		return number>3;
	}
	
	public static boolean isEven(int number){
		return number%2==0;
	}
	
	public static int doubleIt(int number){
		return number*2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			List<Integer> values=Arrays.asList(1,2,3,5,4,6,8,9,10);
		
			System.out.println(
					
					values.stream()
						  .filter(Sample::isGreaterThan3)	
						  .filter(Sample::isEven)
						  .map(Sample::doubleIt)		
						  .findFirst()
					
					);
			
			
		
		
	}

}
