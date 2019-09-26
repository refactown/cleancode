package refactown.cleancode.c01cleancode;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import static java.lang.reflect.Modifier.isFinal;
import static java.lang.reflect.Modifier.isStatic;

public class BadCode {

    public static int constants(Class<?> c) { // count integer constants
        if (c == null || c.isEnum() || Modifier.isAbstract(c.getModifiers())) {
        return -1;
        }
        List<Field> list = new ArrayList<>(); // field list
        for (Field field : c.getDeclaredFields()) {
        list.add(field);
        }
        Class<?> s = c.getSuperclass();
        while (s != null && !s.equals(Object.class)) {
        for (Field field : s.getDeclaredFields()) {
        list.add(field);
        }
        s = s.getSuperclass(); // Superclass of c
        }
        int count = 0;
        Class<?> t;
        for (Field field : list) {
        t = field.getType();
        if (t.equals(Integer.class) || t.equals(int.class)
        || t.equals(Long.class)	|| t.equals(long.class)
        || t.equals(Short.class) || t.equals(short.class)
        || t.equals(Byte.class) || t.equals(byte.class)
        || t.equals(BigInteger.class)) {
        if (isStatic(field.getModifiers()) && isFinal(field.getModifiers())) {
        System.out.println("Int Constant:" + field);
        count++;
        }
        }
        }
        return count;

    }
}
