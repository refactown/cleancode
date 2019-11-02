package refactown.cleancode.megasena.v6;

import org.junit.jupiter.api.Test;
import refactown.cleancode.megasena.v6.Aposta;
import refactown.cleancode.megasena.v6.Premio;
import refactown.cleancode.megasena.v6.Resultado;

import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.*;

class PremioTest {

    @Test
    void devePagar100PorCento() { // sena
        Aposta aposta = new Aposta(asList(5, 13, 27, 34, 41, 52));
        Resultado resultado = new Resultado(asList(5, 13, 27, 34, 41, 52));
        Premio premio = new Premio(1000.0);
        assertEquals(1000.0, premio.calcula(aposta, resultado));// 100%
    }

    @Test
    void devePagar20PorCento() { // quina
        Aposta aposta = new Aposta(asList(5, 13, 27, 34, 41, 59));// 1 errado
        Resultado resultado = new Resultado(asList(5, 13, 27, 34, 41, 52));
        Premio premio = new Premio(1000.0);
        assertEquals(1000.0 * 0.2, premio.calcula(aposta, resultado));// 20%
    }

    @Test
    void devePagar5PorCento() { // quadra
        Aposta aposta = new Aposta(asList(5, 13, 27, 34, 49, 59));// 2 errados
        Resultado resultado = new Resultado(asList(5, 13, 27, 34, 41, 52));
        Premio premio = new Premio(1000.0);
        assertEquals(1000.0 * 0.05, premio.calcula(aposta, resultado));// 5%
    }

    @Test
    void devePagarNada() {
        Aposta aposta = new Aposta(asList(5, 13, 27, 39, 49, 59));// 3 errados
        Resultado resultado = new Resultado(asList(5, 13, 27, 34, 41, 52));
        Premio premio = new Premio(1000.0);
        assertEquals(0.0, premio.calcula(aposta, resultado));// 0
    }

}