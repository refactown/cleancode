package tdc2020poa;

import org.junit.jupiter.api.Test;
import refactown.cleancode.c10classes.Result;

import static org.junit.jupiter.api.Assertions.*;

class JogoTest {

    @Test
    public void testJogo(){
        // parte 1: cenário
        Jogador bill = new JogadorMock("Bill", Mao.PAPEL);
        Jogador bob = new JogadorMock("Bob", Mao.PEDRA);
        Disputa disputa = new DisputaLegada(bill, bob);
        Jogo jogo = new Jogo(disputa, 7);
        // parte 2: ação
        jogo.jogar();
        // parte 3: validação
        assertFalse(!jogo.temVencedor());
        assertEquals(bill, jogo.getVencedor());
        assertTrue(bill == jogo.getVencedor());
        assertEquals(4, jogo.getResultados().size());
    }

    @Test
    public void testJogoMocandoDisputa(){
        // parte 1: cenário
        Jogador bill = new Jogador("Bill");
        Jogador bob = new Jogador("Bob");
        Disputa disputa = new Disputa(bill, bob){
            @Override public Resultado jogar() {
                return Resultado.SEGUNDO_VENCE;
            }
        };
        Jogo jogo = new Jogo(disputa, 7);
        // parte 2: ação
        jogo.jogar();
        // parte 3: validação
        assertFalse(!jogo.temVencedor());
        assertEquals(bob, jogo.getVencedor());
        assertTrue(bob == jogo.getVencedor());
        assertEquals(4, jogo.getResultados().size());
    }


}