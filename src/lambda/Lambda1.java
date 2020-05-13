package lambda;

import java.time.Instant;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Lambda1 {

	public static void main(String[] args) {
      Instant in = Instant.now();
      System.out.println(in);
      LocalDateTime ldt = LocalDateTime.now();
      System.out.println(ldt);

	}

	public static void test3() {
		List<Integer> list = Arrays.asList(1, 2, 3, 4);
		Integer sum = list.stream().reduce(0, (x, y) -> x + y);
		System.out.println(sum);
		Lambda1 lambda1 = new Lambda1();
		Function<String, Person> f1 = (x) -> lambda1.new Person(x);
		Person p = f1.apply("1234");
		Person p1 = f1.apply("1235");
		List<Person> ll = new ArrayList<>();
		ll.add(p);
		ll.add(p1);
		ll.stream().map(Person::getName);
	}

	public static void test2() {
		Lambda1 lambda1 = new Lambda1();
		Function<String, Person> f1 = (x) -> lambda1.new Person(x);
		Person p = f1.apply("name");
		System.out.println(p.getName());
		Function<Integer, String[]> fun = (x) -> new String[x];
		Function<Integer, String[]> fun2 = String[]::new;
	}

	class Person {
		private String name;

		public String getName() {
			return name;
		}

		public Person() {
			super();
		}

		public Person(String name) {
			super();
			this.name = name;
		}

		public void setName(String name) {
			this.name = name;
		}

	}
}
