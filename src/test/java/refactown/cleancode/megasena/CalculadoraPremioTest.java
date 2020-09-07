package refactown.cleancode.megasena;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class CalculadoraPremioTest {

    @Test
    public void devePagarSenaOuCemPorCento(){
        CalculadoraPremio calculadora = new CalculadoraPremio();
        Aposta aposta = Aposta.of(03, 14, 21, 32, 47, 55);
        List<Integer> sorteados = Arrays.asList(03, 14, 21, 32, 47, 55);
        double premio = calculadora.calcula(aposta, sorteados,1000.00);
        Assertions.assertEquals(1000.00, premio);
    }

    @Test
    public void devePagarQuinaOuVintePorCento(){
        CalculadoraPremio calculadora = new CalculadoraPremio();
        Aposta aposta = Aposta.of(04, 14, 21, 32, 47, 55);
        List<Integer> sorteados = Arrays.asList(03, 14, 21, 32, 47, 55);
        double premio = calculadora.calcula(aposta, sorteados,1000.00);
        Assertions.assertEquals(200.00, premio);
    }

    @Test
    public void devePagarQuadraOuCincoPorCento(){
        CalculadoraPremio calculadora = new CalculadoraPremio();
        Aposta aposta = Aposta.of(04, 15, 21, 32, 47, 55);
        List<Integer> sorteados = Arrays.asList(03, 14, 21, 32, 47, 55);
        double premio = calculadora.calcula(aposta, sorteados,1000.00);
        Assertions.assertEquals(50.00, premio);
    }

    @Test
    public void devePagarNada(){
        CalculadoraPremio calculadora = new CalculadoraPremio();
        Aposta aposta = Aposta.of(04, 15, 22, 32, 47, 55);
        List<Integer> sorteados = Arrays.asList(03, 14, 21, 32, 47, 55);
        double premio = calculadora.calcula(aposta, sorteados,1000.00);
        Assertions.assertEquals(0.00, premio);
    }


}
