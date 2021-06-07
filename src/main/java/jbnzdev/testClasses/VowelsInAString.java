package jbnzdev.testClasses;


import java.util.Arrays;
import java.util.List;

public class VowelsInAString {

    public static void main(String[] args) {
        System.out.println("Test is okay");
        String testString = "aeiouAEIOUx";
        List<Character> vowels = Arrays.asList('a','e','i','o','u','A','E','I','O','U');
        long count = testString.chars().filter(x -> (vowels.contains((char)x))).count();
        System.out.println("count is : "+count);
                //forEach(x -> System.out.println((char)x));
    }
}
