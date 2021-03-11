package jbnzdev.java_new_features;

public class Test {
	public static void main(String[] args) {
		
		//Creating a Object with private Construcutor
		ClassWithPrivateCon testClass = new ClassWithPrivateCon();
		testClass.testStaticMethod();
		testClass.testMethod();
		
		ClassWithPrivateCon.testStaticMethod();
	}

}
