package refactown.cleancode.megasena;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ApostaTest {

    @Test
    public void testAposta() {
        //Aposta aposta = new Aposta(12, 15, 21, 36, 45, 54);
        Aposta aposta = Aposta.of(12, 15, 21, 36, 45, 54);
        assertEquals(Arrays.asList(12, 15, 21, 36, 45, 54), aposta.getNumeros());
    }

    @Test
    public void deveDarErroApostaInvalidaPorMenosNumerosQueOMinimo(){
        Assertions.assertThrows(IllegalArgumentException.class, ()->{
            Aposta.of(04, 15, 22, 32, 47); // 5 números
        });
    }

    @Test
    public void deveDarErroApostaInvalidaPorMaximo15Numeros(){
        Assertions.assertThrows(IllegalArgumentException.class, ()->{
            Aposta.of(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16);
        });
    }

    @Test
    public void deveDarErroApostaInvalidaPorNumerosForaDaFaixa(){
        Assertions.assertThrows(IllegalArgumentException.class, ()->{
            Aposta.of(04, 15, 22, 61, 47, 55); // 61 = invalido
        });
    }

    @Test
    public void deveDarErroApostaInvalidaPorNumeroDuplicado(){
        Assertions.assertThrows(IllegalArgumentException.class, ()->{
            Aposta.of(04, 15, 22, 32, 47, 47); // 47 duplicado
        });
    }


}