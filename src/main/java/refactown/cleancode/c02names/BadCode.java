package refactown.cleancode.c02names;

import java.lang.reflect.Field;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class BadCode {
    // nomes genéricos
    int d = 5;
    List list = new ArrayList<Field>();
    void func(int n){
        for (int i=0; i < 10; i++){
            if (n == 3) System.out.println("count:" + i + " = 3");
        }
    }

    // Nomes não pronunciáveis
    LocalDate genymdhms=  LocalDate.now();
    LocalDate modymdhms=  LocalDate.now();
    int pszqint = 102;

    // Número mágico - difpicil de encontrar depois
    public static boolean podeSerEireli(int socios){
        return socios <= 3;
    }

    // Notação húngara
    String strNome = "Fulano";
    int intIdade = 30;
    LocalDate dtNascimento = LocalDate.of(1990, Month.APRIL, 12);

    // Etc
    private IPessoa pessoa  =new Pessoa();
    EnderecoDoCliente enderecoDeCobrancaDoCliente=new EnderecoDoCliente();
    EnderecoDoCliente enderecoDeEntregaDoCliente= new EnderecoDoCliente();

}
