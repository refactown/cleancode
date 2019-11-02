package refactown.cleancode.megasena.v6;

import org.junit.jupiter.api.Test;
import refactown.cleancode.megasena.v6.Aposta;
import refactown.cleancode.megasena.v6.Resultado;

import java.util.List;

import static java.util.Arrays.*;

import static org.junit.jupiter.api.Assertions.*;


class ApostaTest {

    @Test
    void deveDarErroApostaInvalida() {
        assertThrows(IllegalArgumentException.class, () -> { new Aposta(asList(23, 14, 44)); });
        assertThrows(IllegalArgumentException.class, () -> { new Aposta(asList()); });
        List<Integer> maisQue15 = asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16);
        assertThrows(IllegalArgumentException.class, () -> { new Aposta(maisQue15); });

    }
    @Test
    void testCalculaAcertos() {
        Aposta aposta = new Aposta(asList(5, 13, 27, 34, 41, 52));
        Resultado resultado = new Resultado(asList(5, 13, 27, 34, 41, 52));
        assertEquals(6, new Aposta(asList(5, 13, 27, 34, 41, 52)).calculaAcertos(resultado));
        assertEquals(6, new Aposta(asList(1, 05, 13, 27, 34, 41, 52, 56)).calculaAcertos(resultado));
        assertEquals(4, new Aposta(asList(9, 13, 27, 34, 41, 59)).calculaAcertos(resultado));
        assertEquals(0, new Aposta(asList(9, 19, 29, 39, 49, 59)).calculaAcertos(resultado));
    }

    @Test
    void deveRetornarOsSeisNumerosPassadosAoCriar() {
        Aposta aposta = new Aposta(asList(05, 13, 27, 34, 41, 52));
        assertEquals(asList(05, 13, 27, 34, 41, 52), aposta.getNumeros());

    }
}