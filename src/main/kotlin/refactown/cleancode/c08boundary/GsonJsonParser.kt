package refactown.cleancode.c08boundary

import com.google.gson.Gson
import refactown.cleancode.c07exceptions.JsonException

class GsonJsonParser: JsonParser{

    private val gson = Gson()

    override fun toJson(obj: Any): String {
        try {
            return gson.toJson(obj)
        } catch (e: Exception){
            throw JsonException("Serialize error. Object:$obj", e)
        }
    }

    override fun fromJson(json: String, clazz: Class<*>): Any {
        try {
            return gson.fromJson(json, clazz)
        } catch (e: Exception){
            throw JsonException("Parsing error. Json text:$json", e)
        }
    }

}