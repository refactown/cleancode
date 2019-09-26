package refactown.cleancode.c01cleancode;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import static java.lang.reflect.Modifier.isFinal;
import static java.lang.reflect.Modifier.isStatic;

public class Refactoring1 {

    public static int countIntConstants(Class<?> clazz) {
        if (clazz == null || clazz.isEnum() || Modifier.isAbstract(clazz.getModifiers())) {
            return -1;
        }
        List<Field> fields = new ArrayList<>();
        for (Field field : clazz.getDeclaredFields()) {
            fields.add(field);
        }
        Class<?> superClass = clazz.getSuperclass();
        while (superClass != null && !superClass.equals(Object.class)) {
            for (Field field : superClass.getDeclaredFields()) {
                fields.add(field);
            }
            superClass = superClass.getSuperclass();
        }
        int count = 0;
        Class<?> fieldType;
        for (Field field : fields) {
            fieldType = field.getType();
            if (fieldType.equals(Integer.class) || fieldType.equals(int.class)
                    || fieldType.equals(Long.class)	|| fieldType.equals(long.class)
                    || fieldType.equals(Short.class) || fieldType.equals(short.class)
                    || fieldType.equals(Byte.class) || fieldType.equals(byte.class)
                    || fieldType.equals(BigInteger.class)) {
                if (isStatic(field.getModifiers()) && isFinal(field.getModifiers())) {
                    System.out.println("Int Constant:" + field);
                    count++;
                }
            }
        }
        return count;
    }
}
