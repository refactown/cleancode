package refactown.cleancode.c02names;

import java.lang.reflect.Field;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class Refactoring {

    private static final int MAX_SOCIOS_EIRELI = 5;

    // nomes Significativos
    int tempoDecorrido = 5;
    List fields = new ArrayList<Field>();
    void imprimeSoNoTres(int n){
        for (int i=0; i < 10; i++){
            if (n == 3) System.out.println("count:" + i + " = 3");
        }
    }

    // Nomes não pronunciáveis
    LocalDate generationTimestamp=  LocalDate.now();
    LocalDate modificationTimestamp=  LocalDate.now();
    int recordId = 102;

    // Constantes para números mágicos e afins
    public static boolean podeSerEireli(int socios){
        return socios <= MAX_SOCIOS_EIRELI;
    }

    // Notação húngara
    String nome = "Fulano";
    int idade = 30;
    LocalDate nascimento = LocalDate.of(1990, Month.APRIL, 12);

    // Etc
    private Pessoa pessoa  =new PessoaImpl();
    Endereco enderecoDeCobranca=new Endereco();
    Endereco enderecoDeEntrega= new Endereco();
}
