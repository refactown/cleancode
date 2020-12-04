package tdc2020poa;

import org.junit.jupiter.api.Test;

import javax.swing.event.TreeSelectionEvent;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static tdc2020poa.PTP.*;

class PTPTest {


    @Test
    public void testRegressaoAllInOne() {
        PTP ptp = new PTP();
        // Letras inválidas
        assertThrows(IllegalArgumentException.class, () -> ptp.jogar('X', PAPEL));
        assertThrows(IllegalArgumentException.class, () -> ptp.jogar(PAPEL, 'Y'));
        // Empates
        assertEquals(EMPATE, ptp.jogar(PAPEL, PAPEL));
        assertEquals(EMPATE, ptp.jogar(TESOURA, TESOURA));
        assertEquals(EMPATE, ptp.jogar(PEDRA, PEDRA));
        // Primeiro vence
        assertEquals(PRIMEIRO_VENCE, ptp.jogar(PAPEL, PEDRA));
        assertEquals(PRIMEIRO_VENCE, ptp.jogar(PEDRA, TESOURA));
        assertEquals(PRIMEIRO_VENCE, ptp.jogar(TESOURA, PAPEL));
        // Segundo vence
        assertEquals(SEGUNDO_VENCE, ptp.jogar(PEDRA, PAPEL));
        assertEquals(SEGUNDO_VENCE, ptp.jogar(TESOURA, PEDRA));
        assertEquals(SEGUNDO_VENCE, ptp.jogar(PAPEL, TESOURA));
    }

    @Test
    public void primeiraLetraInvalidaDeveErroIllegalArgumentException(){
        assertThrows(IllegalArgumentException.class, () -> new PTP().jogar('X', PAPEL));
    }

    @Test
    public void segundaLetraInvalidaDeveErroIllegalArgumentException(){
        assertThrows(IllegalArgumentException.class, () -> new PTP().jogar(PAPEL, 'Y'));
    }

    @Test
    public void papelEmpataComPapel(){
        assertEquals(EMPATE, new PTP().jogar(PAPEL, PAPEL));
    }
    @Test
    public void pedraEmpataComPedra(){
        assertEquals(EMPATE, new PTP().jogar(PEDRA, PEDRA));
    }

    @Test
    public void tesouraEmpataComTesoura(){
        assertEquals(EMPATE, new PTP().jogar(TESOURA, TESOURA));
    }

    @Test
    public void papelDeveVencerPedra(){
        assertEquals(PRIMEIRO_VENCE, new PTP().jogar(PAPEL, PEDRA));
    }

    @Test
    public void pedraDeveVencerTesoura(){
        assertEquals(PRIMEIRO_VENCE, new PTP().jogar(PEDRA, TESOURA));
    }

    @Test
    public void tesouraDeveVencerPapel(){
        assertEquals(PRIMEIRO_VENCE, new PTP().jogar(TESOURA, PAPEL));
    }

    @Test
    public void pedraDevePerderParaPapel(){
        assertEquals(SEGUNDO_VENCE, new PTP().jogar(PEDRA, PAPEL));
    }

    @Test
    public void tesouraDevePerderParaPedra(){
        assertEquals(SEGUNDO_VENCE, new PTP().jogar(TESOURA, PEDRA));
    }

    @Test
    public void papelDevePerderParaTesoura(){
        assertEquals(SEGUNDO_VENCE, new PTP().jogar(PAPEL, TESOURA));
    }

    @Test
    public void testRegressaoAllInOneComParametroUnico() {
        PTP ptp = new PTP();
        // Letras inválidas - Cenários do teste da classe Rodada!
        assertThrows(IllegalArgumentException.class, () -> ptp.jogar(Rodada.of('X', PAPEL)));
        assertThrows(IllegalArgumentException.class, () -> Rodada.of(PAPEL, 'Y'));
        // Empates
        assertEquals(EMPATE, ptp.jogar(Rodada.of(PAPEL, PAPEL)));
        assertEquals(EMPATE, ptp.jogar(Rodada.of(TESOURA, TESOURA)));
        assertEquals(EMPATE, ptp.jogar(Rodada.of(PEDRA, PEDRA)));
        // Primeiro vence
        assertEquals(PRIMEIRO_VENCE, ptp.jogar(Rodada.of(PAPEL, PEDRA)));
        assertEquals(PRIMEIRO_VENCE, ptp.jogar(Rodada.of(PEDRA, TESOURA)));
        assertEquals(PRIMEIRO_VENCE, ptp.jogar(Rodada.of(TESOURA, PAPEL)));
        // Segundo vence
        assertEquals(SEGUNDO_VENCE, ptp.jogar(Rodada.of(PEDRA, PAPEL)));
        assertEquals(SEGUNDO_VENCE, ptp.jogar(Rodada.of(TESOURA, PEDRA)));
        assertEquals(SEGUNDO_VENCE, ptp.jogar(Rodada.of(PAPEL, TESOURA)));
    }


}