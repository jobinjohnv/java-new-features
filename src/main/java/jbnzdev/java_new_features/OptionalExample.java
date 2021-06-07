package jbnzdev.java_new_features;

import java.util.Optional;

public class OptionalExample {

	public static void main(String[] args) {
		

		Optional<String> empty = Optional.of("Hello");
		System.out.println(empty.orElse("Place Holder"));
		System.out.println(empty.isPresent());
		System.out.println(empty.filter(x -> x.startsWith("H")).get());

	}

	
}
