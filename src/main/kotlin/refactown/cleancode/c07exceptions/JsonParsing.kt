package refactown.cleancode.c07exceptions

import com.google.gson.Gson

typealias JsonParserFunction = (String, Class<*>) -> Any

fun fromJsonV0(json: String, clazz: Class<*>): Any?{
    val gson = Gson()
    try {
        return gson.fromJson(json, clazz)
    } catch (e: Exception){
        println("Parsing error. Json text:$json")
        return null
    }
}

fun fromJsonV1(json: String, clazz: Class<*>): Any{
    val gson = Gson()
    try {
        return gson.fromJson(json, clazz)
    } catch (e: Exception){
        throw JsonException("Parsing error. Json text:$json")
    }
}

fun fromJsonV2(json: String, clazz: Class<*>): Any{
    val gson = Gson()
    try {
        return gson.fromJson(json, clazz)
    } catch (e: Exception){
        throw JsonException("Parsing error. Json text:$json", e)
    }
}
