package refactown.cleancode.c08boundary

interface JsonParser{

    fun fromJson(json: String, clazz: Class<*>): Any

    fun toJson(obj: Any): String
}