package refactown.cleancode.megasena.modelo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SorteioTest {

    @Test
    void sorteioRandomicoDeveGerarSeisNumerosDiferentesEntre1e60() {
        Sorteio sorteio = new Sorteio();
        assertEquals(6, sorteio.getNumeros().size());
        assertEquals(6, sorteio.getNumeros().stream().distinct().count());
        assertEquals(6, sorteio.getNumeros().stream().filter(n-> n >=1 && n <= 60).count());
    }
}