package refactown.cleancode.megasena.modelo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CpfTest {

    @Test
    void deveCriarCpfComNumeroPassado(){
        String numeroSimples = "07311631769";
        Cpf cpfPuro = new Cpf(numeroSimples);
        assertEquals(numeroSimples, cpfPuro.getNumero());
    }

    @Test
    void deveCriarCpfComNumeroPassadoIgnorandoPontosTracos(){
        String numeroSimples = "07311631769";
        String numeroFormatado = "073.116.317-69";
        Cpf cpfFormatado = new Cpf(numeroFormatado);
        assertEquals(numeroSimples, cpfFormatado.getNumero());
    }

    @Test
    void deveSubirExcecaoSeNumeroForNull(){
        assertThrows(NullPointerException.class, () -> { new Cpf(null); });
    }

    @Test
    void deveSubirExcecaoParaNumerosComCaracteresInvalidos(){ // 0-9, ponto ou traço
        assertThrows(IllegalArgumentException.class, () -> { new Cpf("073.116.317/69"); });// barra
        assertThrows(IllegalArgumentException.class, () -> { new Cpf("073,116,317-69"); });// virgula
        assertThrows(IllegalArgumentException.class, () -> { new Cpf("073.116.317-6A"); });// A

    }

    @Test
    void deveSubirExcecaoParaNumerosComTamanhoInvalidoDiferenteDe11(){
        assertThrows(IllegalArgumentException.class, () -> { new Cpf("123"); });//3
        assertThrows(IllegalArgumentException.class, () -> { new Cpf("12345678901234567890"); });//20
    }

    @Test
    void deveConsiderarIgual() {
        assertEquals(new Cpf("07311631769"), new Cpf("07311631769"));
    }

    @Test
    void deveConsiderarDiferente() {
        assertNotEquals(new Cpf("12345678900"), new Cpf("07311631769"));
    }

    @Test
    void deveConsiderarHashCodeIgual() {
        assertTrue(new Cpf("07311631769").hashCode()== new Cpf("07311631769").hashCode());
    }

    @Test
    void deveConsiderarHashCodeDiferente() {
        assertFalse(new Cpf("07311631769").hashCode() != new Cpf("07311631769").hashCode());
    }

    @Test
    void deveUsarNumeroComoSaidaParaToString() {
        Cpf cpf = new Cpf("07311631769");
        assertEquals("07311631769", cpf.getNumero());
    }
}