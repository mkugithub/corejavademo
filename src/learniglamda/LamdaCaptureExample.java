package learniglamda;

import java.util.Arrays;
import java.util.List;

public class LamdaCaptureExample {

	public static void main(String[] args) {

		List<Integer> intgers = Arrays.asList(1, 2, 3, 4, 5, 6);

		int var = 10;
		intgers.forEach(x -> {

			//var++;
			System.out.println(x);
		}

		);

	}

}
