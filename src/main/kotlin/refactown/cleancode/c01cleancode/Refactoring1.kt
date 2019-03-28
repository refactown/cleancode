package refactown.cleancode.c01cleancode

import java.lang.reflect.Field
import java.lang.reflect.Modifier
import java.math.BigInteger
import java.util.*

fun countIntConstants(clazz: Class<*>?): Int {
    if (clazz != null && !clazz.isEnum && !Modifier.isAbstract(clazz.modifiers)) {
        val fields = ArrayList<Field>()
        for (field in clazz.declaredFields) {
            fields.add(field)
        }
        var superclass: Class<*>? = clazz.superclass
        while (superclass != null && superclass != Any::class.java) {
            for (field in superclass.declaredFields) {
                fields.add(field)
            }
            superclass = superclass.superclass
        }
        var count = 0
        var type: Class<*>
        for (field in fields) {
            type = field.getType()
            if (type == Int::class.java || type == Int::class.javaPrimitiveType
                    || type == Long::class.java || type == Long::class.javaPrimitiveType
                    || type == Short::class.java || type == Short::class.javaPrimitiveType
                    || type == Byte::class.java || type == Byte::class.javaPrimitiveType
                    || type == BigInteger::class.java) {
                if (Modifier.isStatic(field.getModifiers())
                        && Modifier.isFinal(field.getModifiers())) {
                    println("Int Constant:$field"); count++
                }
            }
        }
        return count
    } else return -1
}
