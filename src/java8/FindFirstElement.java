package java8;

import java.util.Arrays;
import java.util.List;

public class FindFirstElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> firstElement = Arrays.asList(1, 3, 2, 4);
		long result = firstElement.stream().map(n -> n + 1).findFirst().get();
		System.out.println(result);
	}

}
