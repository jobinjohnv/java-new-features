package jbnzdev.java_new_features_test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;


public class OptionalTests {

	public class User{
		String name;
		int age;
		public User(String name, int age){
			this.name = name;
			this.age = age;
		}

	}
	
//	@Test
//	public void basicOptionalFeatures() {
//		Optional<String> empty = Optional.empty();
//		Assertions.assertFalse(empty.isPresent());
//		Assertions.assertTrue(empty.empty());
//	}
//
//	@Test
//	public void optionalWithObjects(){
//		User user = new User("Hello",2);
//		Optional<User> userObj = Optional.ofNullable(user);
//		List<User> namesWithOptional = userObj.stream().filter(x-> x.name.equals("Hello")).collect(Collectors.toList());
//		// Stream is not possible if Object is not defined as a Optional Object
//		namesWithOptional.forEach(x-> System.out.println(x.name));
//	}

	@Test
	@DisplayName("Verify that a String is empty or not")
	public void stringIsNullOrNot(){
		String name = null;
		Optional<String> nonEmptyString = Optional.of(Optional.ofNullable(name).orElse("Test"));
		nonEmptyString.ifPresent(x -> System.out.println(nonEmptyString.get()));
	}

	@Test
	public void defaultStringValue(){
		String name = null;
		String nonEmptyString = Optional.ofNullable(name).orElse("Test");
		Assertions.assertEquals("Test",nonEmptyString);
	}

	@Test
	public void generalList(){
		List<String> names = Arrays.asList("jobin","sherin","tester");
		List<String> modifiedNames = names.stream().filter(x -> x.endsWith("in")).collect(Collectors.toList());
		modifiedNames.forEach(x-> System.out.println(x));
	}

}
