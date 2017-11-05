package learniglamda;

import java.util.stream.IntStream;

public class OddNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(isPrime(1));
		System.out.println(isPrime(2));
		System.out.println(isPrime(13));
		System.out.println(isPrime(14));
		

	}

	private static boolean isPrime(final  int i) {
		// TODO Auto-generated method stub
		return 	i>1 &&	
				IntStream.range(2, i)
				.noneMatch(index->i%2==0);
	}	
	
			

}
