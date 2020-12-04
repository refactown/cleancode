package tdc2020poa;
import java.util.ArrayList;
import java.util.List;

public class SimulacaoProcedural {

    public static void main(String[] args) {
        int rodadas = 5;
        int scoreBill = 0;
        int scoreBob = 0;
        List<Resultado> resultados = new ArrayList<Resultado>();
        Resultado resultado ;
        char charBill;
        char charBob;
        PTP ptp = new PTP();
        for (int i=0; i < rodadas; i++) {
            charBill = Mao.aleatoria().getId();
            charBob = Mao.aleatoria().getId();
            resultado = Resultado.of(ptp.jogar(charBill, charBob));
            if (Resultado.PRIMEIRO_VENCE.equals(resultado)) {
                scoreBill++;
            } else if (Resultado.SEGUNDO_VENCE.equals(resultado)) {
                scoreBob++;
            } // empate não faz nada
            resultados.add(resultado);
        }
        if (scoreBill > scoreBob) {
            System.out.println("Vencedor: Bill (Primeiro)");
        } else if (scoreBob > scoreBill) {
            System.out.println("Vencedor: Bob (Segundo)");
        } else {
            System.out.println("Empate");
        }
        System.out.println("Resultados:" + resultados);
    }
}
