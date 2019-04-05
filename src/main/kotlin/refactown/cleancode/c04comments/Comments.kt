package refactown.cleancode.c04comments

import refactown.cleancode.c06objects.Order
import java.io.FileInputStream
import java.lang.Exception
import java.lang.StringBuilder
import java.time.LocalDate
import java.time.Month



fun example(){
    val order = Order(LocalDate.of(2019, Month.APRIL, 4), false)

    // verifica se o pedido não está cancelado nem tem mais de 1 ano
    if (!order.cancelled && order.date <= order.date.plusDays(365))

    if (order.isValid()) println("")


}

fun callLogon(){

    logon("user", "pass")
}

fun load(stream: FileInputStream){

}

fun loadProperties(){
    try {
        val stream = FileInputStream("file.properties")
        load(stream)
    } catch (e: Exception){
        // Não havia nenhum arquivo para ser lido
        // Todos já foram carregados
    }
}

// Efetua logon passando "usuário" e "senha" e recebe
// o usuário logado
fun logon(username: String, password: String): LoggedUser{
    // TODO ("implementar quando o SSO ficar pronto")
    return LoggedUser("Mock", "Mock")
}

fun append(text: String){

    //val buffer = StringBuffer() // Precisa ser "Thread Safe"
    val buffer = StringBuilder() // Precisa ser rápido

}

fun save (cpfCnpj: String){

    /*
    // trim é importante, pois pode vir CPF(11) ou CNPJ(14)
    if (cpfCnpj.trim().length==11) {
        validarCpf(cpfCnpj)
    } else {
        validarCnpj(cpfCnpj)
    }
    */
    // alterado por Fulano em 27/11/1986
    validarCnpj(cpfCnpj) // não tem mais CPF


}

fun validarCpf(cpfCnpj: String) {
    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
}

fun validarCnpj(cpfCnpj: String) {
    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
}


data class LoggedUser (val login: String, val role: String)
