package refactown.cleancode.c09tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.Month;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ContadorConstantesInteirasTest {

    @Test
    public void testContagem(){
        // parte1: preparação / cenário (s)
        ContadorConstantesInteiras contador = new ContadorConstantesInteiras();
        // parte 3: validação
        assertEquals(2, contador.contar(Classe1.class));
        assertEquals(-1, contador.contar(List.class));
        assertEquals(-1, contador.contar(Month.class));
        assertEquals(-1, contador.contar(null));
        assertEquals(4, contador.contar(Classe2.class));
    }
}

class Classe0{
    public static final int CONST1 = 1;
}

class Classe1 extends Classe0{
    public static final int CONST1 = 1;
}

class Classe2 extends Classe1 {
    public static final int CONST2 = 1;
    public static final int CONST3 = 1;
}
