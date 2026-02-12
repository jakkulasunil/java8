package java8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class DuplicateValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> duplicates=Arrays.asList(1,2,3,4,1,4,9,2);
		HashSet<Integer> set=new HashSet<>();
		duplicates.stream().filter(s->!set.add(s)).forEach(System.out::println);
		

	}

}
