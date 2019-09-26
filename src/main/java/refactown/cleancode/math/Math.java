package refactown.cleancode.math;


import java.lang.reflect.Method;

public class Math {
	
	public static int add(int a, int b) {
		return a + b;
	}

	public static int countIntResults(Class<?> clazz){
		int count = 0;
		Method[] methods = clazz.getMethods();

		return count;
	}

}
