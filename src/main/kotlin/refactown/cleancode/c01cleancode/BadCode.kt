package refactown.cleancode.c01cleancode

import java.lang.reflect.Field
import java.lang.reflect.Modifier
import java.math.BigInteger
import java.util.*

fun constants(c: Class<*>?): Int { // count integer constants
if (c != null && !c.isEnum && !Modifier.isAbstract(c.modifiers)) {
val list = ArrayList<Field>() // field list
for (field in c.declaredFields) {
list.add(field)
}
var s: Class<*>? = c.superclass
while (s != null && s != Any::class.java) {
for (field in s.declaredFields) {
list.add(field)
}
s = s.superclass // Superclass of c
}
var count = 0
var t: Class<*>
for (f in list) {
t = f.getType()
if (t == Int::class.java || t == Int::class.javaPrimitiveType
|| t == Long::class.java || t == Long::class.javaPrimitiveType
|| t == Short::class.java || t == Short::class.javaPrimitiveType
|| t == Byte::class.java || t == Byte::class.javaPrimitiveType
|| t == BigInteger::class.java) {
if (Modifier.isStatic(f.getModifiers())
&& Modifier.isFinal(f.getModifiers())) {
println("Int Constant:$f"); count++
}
}
}
return count
} else return -1
}

