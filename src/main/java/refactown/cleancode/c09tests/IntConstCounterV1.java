package refactown.cleancode.c09tests;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class IntConstCounterV1 {

	// First implementation
	public static int countIntConstV1(Class<?> clazz) {
		List<Field> fields = Arrays.asList(clazz.getDeclaredFields());
		int count = 0;
		Set<Class<?>> integerTypes = new HashSet<>();
		integerTypes.add(Integer.class);
		integerTypes.add(int.class);
		integerTypes.add(Long.class);
		integerTypes.add(long.class);
		integerTypes.add(Short.class);
		integerTypes.add(short.class);
		integerTypes.add(Byte.class);
		integerTypes.add(byte.class);
		integerTypes.add(BigInteger.class);

		for (Field field : fields) {
			if (integerTypes.contains(field.getType()) && Modifier.isStatic(field.getModifiers())
					&& Modifier.isFinal(field.getModifiers())) {
				System.out.println("Int Const:" + field);
				count++;
			}
		}
		return count;
	}
}
