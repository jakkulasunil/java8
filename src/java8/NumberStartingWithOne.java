package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumberStartingWithOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> startWithOne = Arrays.asList(10, 20, 30, 19, 18, 9, 7).stream().map(s -> s + " ")
				.filter(s -> s.startsWith("1")).collect(Collectors.toList());
		System.out.println(startWithOne);

	}

}
