package jbnzdev.java_new_features;

public class ClassWithPrivateCon {
	
	ClassWithPrivateCon(String arg) {
		
	}
	
	protected ClassWithPrivateCon() {
		
	}
	
	public void testMethod() {
		System.out.println("Test Method in a class with private construcutor");
	}
	
	public static void testStaticMethod() {
		System.out.println("Static method called");
	}

}
