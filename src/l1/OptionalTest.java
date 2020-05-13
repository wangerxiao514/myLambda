package l1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class OptionalTest {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
//		System.out.println(list.stream().reduce(0, (x, y) -> x + y));
//		System.out.println(list.stream().reduce(Integer::sum).get());
 		list.stream().map(e -> e + 3).forEach(System.out::println);
		Arrays.asList(1,2,3);
		 
	}

	public static void test1() {
		Optional<Employee> op1 = Optional.of(new Employee(1, "张三", 22));
		System.out.println(op1.orElse(new Employee()));
        System.out.println(op1.orElse(null));
		Optional<Object> empty = Optional.empty();
		System.out.println(empty.orElse(new Employee()));
	}
}
