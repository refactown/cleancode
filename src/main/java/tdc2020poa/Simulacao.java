package tdc2020poa;

public class Simulacao {
    public static void main(String[] args) {
        Jogador bill = new Jogador("Bill");
        Jogador bob = new Jogador("Bob");
        //Disputa disputa = new DisputaLegada(bill, bob);
        Disputa disputa = new DisputaNova(bill, bob);
        Jogo jogo = new Jogo(disputa, 7);
        jogo.jogar();
        if (jogo.temVencedor()) {
            System.out.println("Vencedor: " + jogo.getVencedor().getNome());
        } else {
            System.out.println("Empate");
        }
        System.out.println("Resultados:" + jogo.getResultados());
    }
}
