package lambda;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneOffset;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LambdaTest {
	
	private int age;
	
	private String name;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static void main(String[] args) throws IOException {
		Optional p = Optional.of(null);
		System.out.println(p);
}

	public static void test1() throws IOException {
		List<String> list = Arrays.asList("a", "b");
		List<String> ll = list.stream().filter(s -> s.startsWith("a")).map(String::toUpperCase).sorted()
				.collect(Collectors.toList());
		ll.forEach(System.out::println);
		ll.forEach(e -> System.out.println(e));

		@SuppressWarnings("resource")
		Stream<String> fileStream = Files.lines(Paths.get("d:/11.txt"));
		List<String> fileStrList = fileStream.filter(e -> e.endsWith("aaa")).collect(Collectors.toList());
		fileStrList.forEach(System.out::println);
		List<Integer> ages = Arrays.asList(2,5,3,4,7) ; 
		int sumAge = ages.stream().reduce((sum,age) -> sum + age).get();
		System.out.println(sumAge);
		int sumAge1 = ages.stream().reduce(0, (sum,age) -> sum + age);
		System.out.println(sumAge1);
		List<String> l4 = Stream.of("a","b","c").skip(2).collect(Collectors.toList());
		l4.forEach(System.out::println);
		Stream.of("a","b").mapToInt(String::length);
		Map<String, String> codes = new HashMap<String, String>();
		codes.put("a", "1");
		codes.put("b", "3");
		codes.put("a", "3");
		Map<String, String> linkedMap = codes.entrySet().stream().sorted(Map.Entry.comparingByKey()).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(o,e) -> o + e,LinkedHashMap::new));
		System.out.println(linkedMap);
		Stream.of("a","b","c","a").collect(Collectors.toSet());
	}

}
