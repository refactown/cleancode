package refactown.cleancode.c02names

import java.lang.reflect.Field
import java.time.LocalDate
import java.time.Month
import java.util.*

// Nomes genéricos
val d: Int = 5 // tempo decorrido em dias
val list = ArrayList<Field>() // field list
fun func(n: Int){
    for (i in 1..10)
        if (n == 3)(println("count:$i = 3"))
}

// Nomes não pronunciáveis
val genymdhms=  LocalDate.now();
val modymdhms=  LocalDate.now();
val pszqint = 102;

// Número Mágico - difícil de encontrar depois
fun podeSerEireli(socios: Int) = socios <= 3

// Notação Húngara
val strNome = "Fulano"
val intIdade = 30
val dtNascimento = LocalDate.of(1990,Month.APRIL, 12)

// Etc
private val pessoa : IPessoa = Pessoa()
val enderecoDeCobrancaDoCliente= EnderecoDoCliente()
val enderecoDeEntregaDoCliente= EnderecoDoCliente()







class EnderecoDoCliente
internal interface IPessoa
open class Pessoa: IPessoa


