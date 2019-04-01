package refactown.cleancode.c09tests

import java.lang.reflect.Field
import java.lang.reflect.Modifier
import java.math.BigInteger


fun countIntConstV3(clazz: Class<*>): Int{
    if (!isConstantClass(clazz)) return -1
    val fields = getFieldsFromClass(clazz)
    var count = 0
    for (field in fields) {
        if (isIntegerField(field)) {
            println("Int Constant:$field"); count++
        }
    }
    return count
}

fun getFieldsFromClass(clazz: Class<*>): List<Field> {
    return if (clazz.superclass != null && clazz.superclass != Any::class.java) {
        clazz.declaredFields.asList() + getFieldsFromClass(clazz.superclass)
    } else clazz.declaredFields.asList()
}

private fun isConstantClass(c: Class<*>?) = c != null && !c.isEnum && !Modifier.isAbstract(c.modifiers)

private val integerTypes = listOf(Int::class.java, Int::class.javaPrimitiveType,
        Long::class.java, Long::class.javaPrimitiveType, Short::class.java,
        Short::class.javaPrimitiveType, Byte::class.java, Byte::class.javaPrimitiveType,
        BigInteger::class.java)

private fun isIntegerField(field: Field): Boolean = integerTypes.contains(field.type)
        || Modifier.isStatic(field.modifiers) || Modifier.isFinal(field.modifiers)





