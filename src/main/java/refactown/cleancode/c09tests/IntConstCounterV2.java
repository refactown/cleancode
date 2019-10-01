package refactown.cleancode.c09tests;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class IntConstCounterV2 {

    private static final Set<Class<?>> INTEGER_TYPES = new HashSet<>();

    static {
        INTEGER_TYPES.add(Integer.class);	INTEGER_TYPES.add(int.class);
        INTEGER_TYPES.add(Long.class);		INTEGER_TYPES.add(long.class);
        INTEGER_TYPES.add(Short.class);		INTEGER_TYPES.add(short.class);
        INTEGER_TYPES.add(Byte.class);		INTEGER_TYPES.add(byte.class);
        INTEGER_TYPES.add(BigInteger.class);
    }

	// First implementation
	public static int countIntConstV2(Class<?> clazz) {
		if (!isConstantClass(clazz)) return -1;
		List<Field> fields = Arrays.asList(clazz.getDeclaredFields());
		int count = 0;

		for (Field field : fields) {
			if (isIntegerField(field)) {
				System.out.println("Int Const:" + field);
				count++;
			}
		}
		return count;
	}
	
    public static boolean isConstantClass(Class<?> clazz) { // +1
        return clazz != null && !clazz.isEnum() // +1
                && !Modifier.isAbstract(clazz.getModifiers()); // +1 cc = 3
    }

	
	private static boolean isIntegerField(Field field) {
		return INTEGER_TYPES.contains(field.getType()) && Modifier.isStatic(field.getModifiers())
				&& Modifier.isFinal(field.getModifiers());
		
	}
}
