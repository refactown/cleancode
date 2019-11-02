package refactown.cleancode.megasena.v6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GloboGiratorioTest {

    @Test
    void sorteioRandomicoDeveGerarSeisNumerosDiferentesEntre1e60() {
        GloboGiratorio globoGiratorio = new GloboGiratorio(Aposta.ULTIMO_NUMERO);
        Resultado resultado = globoGiratorio.sorteiaNumeros(6);
        assertEquals(6, resultado.getNumeros().size());
        assertEquals(6, resultado.getNumeros().stream().distinct().count());
        assertEquals(6, resultado.getNumeros().stream().filter(n-> n >=1 && n <= 60).count());
    }

}