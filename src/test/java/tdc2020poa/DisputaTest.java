package tdc2020poa;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DisputaTest {

    @Test
    public void testDisputaLegada(){
        Jogador bill = new JogadorMock("Bill (Primeiro)", Mao.PAPEL);
        Jogador bob = new JogadorMock("Bob (Segundo)", Mao.PEDRA);
        Disputa disputa = new DisputaLegada(bill, bob);
        Resultado resultado = disputa.jogar();
        assertEquals(Resultado.PRIMEIRO_VENCE, resultado);
    }

    @Test
    public void testDisputaNova(){
        Jogador bill = new JogadorMock("Bill (Primeiro)", Mao.PAPEL);
        Jogador bob = new JogadorMock("Bob (Segundo)", Mao.PEDRA);
        Disputa disputa = new DisputaNova(bill, bob);
        Resultado resultado = disputa.jogar();
        assertEquals(Resultado.PRIMEIRO_VENCE, resultado);
    }

}

