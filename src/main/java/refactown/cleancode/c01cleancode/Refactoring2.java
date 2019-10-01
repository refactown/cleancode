package refactown.cleancode.c01cleancode;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.math.BigInteger;
import java.util.*;

import static java.lang.reflect.Modifier.isFinal;
import static java.lang.reflect.Modifier.isStatic;

public class Refactoring2 {

    private static final Set<Class<?>> INTEGER_TYPES = new HashSet<>();

    static {
        INTEGER_TYPES.add(Integer.class);	INTEGER_TYPES.add(int.class);
        INTEGER_TYPES.add(Long.class);		INTEGER_TYPES.add(long.class);
        INTEGER_TYPES.add(Short.class);		INTEGER_TYPES.add(short.class);
        INTEGER_TYPES.add(Byte.class);		INTEGER_TYPES.add(byte.class);
        INTEGER_TYPES.add(BigInteger.class);
    }

    public static int countIntegerConstants(Class<?> clazz) { // +1
        if (!isClasseComConst(clazz)) { // +1
            return -1; // +1
        }

        List<Field> fields = getFieldsFromClass(clazz);

        int count = 0;
        for (Field field : fields) { // +1
            if (isIntConst(field)) { // +1
                System.out.println("Int Constant:" + field);
                count++;
            }
        }
        return count; // CC = 5 (Total = 22)
    }

    public static boolean isClasseComConst(Class<?> clazz) { // +1
        return clazz != null && !clazz.isEnum() // +1
                && !Modifier.isAbstract(clazz.getModifiers()); // +1 cc = 3
    }

    public static List<Field> getFieldsFromClass(Class<?> clazz) { // +1
        List<Field> fields = new ArrayList<>();
        fields.addAll(Arrays.asList(clazz.getDeclaredFields()));
        Class<?> superClass = clazz.getSuperclass();
        if (superClass != null && !superClass.equals(Object.class)) { // +2
            fields.addAll(getFieldsFromClass(superClass));
        }
        return fields; // CC = 3

    }

    public static boolean isIntConst(Field field) { // +1
        return INTEGER_TYPES.contains(field.getType())
                && isStatic(field.getModifiers())
                && isFinal(field.getModifiers()); // +1 CC = 3
    }


}
