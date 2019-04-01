package refactown.cleancode.c02names

import java.lang.reflect.Field
import java.time.LocalDate
import java.time.Month
import java.util.*

// Nomes Significativos
val tempoDecorrido: Int = 5
val fields = ArrayList<Field>()
fun imprimirSoNoTres(numero: Int){
    for (i in 1..10)
        if (numero == PRINT) println("count:$i = $PRINT")
}

// Nomes pronunciáveis
val generationTimestamp=  LocalDate.now()
val modificationTimestamp=  LocalDate.now()
val recordId = 102;

// Constantes para números mágicos e afins
fun isEireli(socios: Int) = socios <= MAX_SOCIOS_EIRELI

// Sem Notação Húngara
val nome = "Fulano"
val idade = 30
val nascimento = LocalDate.of(1990,Month.APRIL, 12)

// Etc
val pessoa2 : Pessoa = PessoaImpl()
val enderecoCobranca= Endereco()
val enderecoEntrega= Endereco()






val PRINT = 3
val MAX_SOCIOS_EIRELI = 3

class Endereco
class PessoaImpl: Pessoa()


