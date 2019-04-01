package refactown.cleancode.c09tests

import java.lang.reflect.Modifier
import java.math.BigInteger

fun countIntConstV1(clazz: Class<*>): Int{
    val fields = clazz.declaredFields.asList()
    var count = 0
    val integerTypes = listOf(Int::class.java, Int::class.javaPrimitiveType,
            Long::class.java, Long::class.javaPrimitiveType, Short::class.java,
            Short::class.javaPrimitiveType, Byte::class.java, Byte::class.javaPrimitiveType,
            BigInteger::class.java)

    for (field in fields) {
        if (integerTypes.contains(field.type)
                || Modifier.isStatic(field.modifiers) || Modifier.isFinal(field.modifiers)) {
            println("Int Constant:$field"); count++
        }
    }
    return count
}





