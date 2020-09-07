package refactown.cleancode.c10classes.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import refactown.cleancode.c10classes.enums.Mao;

import static org.junit.jupiter.api.Assertions.*;

class MelhorDeTresTest {

    @Test
    public void testJogo(){
        // parte 1: cenário
        Jogador bill = new JogadorMock("Bill", Mao.PAPEL);
        Jogador bob = new JogadorMock("Bill", Mao.PEDRA);
        Jogada jogada = new JogadaSimples(bill, bob);
        MelhorDeTres melhorDeTres = new MelhorDeTres(jogada, 7);
        // parte 2: ação
        melhorDeTres.jogar();
        // parte 3: validação
        assertFalse(!melhorDeTres.temVencedor());
        assertEquals(bill, melhorDeTres.getVencedor());
        assertTrue(bill == melhorDeTres.getVencedor());
        assertEquals(4, melhorDeTres.getResultados().size());
    }

}