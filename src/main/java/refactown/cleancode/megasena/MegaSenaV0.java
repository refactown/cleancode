package refactown.cleancode.megasena;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MegaSenaV0 {


    public double megasena(List<Integer> num, double valor) {
        List<Integer> list = new ArrayList<>(); // válidos
        for (Integer n: num){
        if (n <1 || n > 60){
        return 0.0; // inválido
        }
        if (list.contains(n)){
        return 0.0; // repetido
        }
        list.add(n);
        }
        if (list.size() >= 6 && list.size() <= 15) {
        List<Integer> sort = new ArrayList<>();
        int s;
        while (sort.size() < 6) {
        s = new Random().nextInt(59) + 1;
        if (!sort.contains(s)) {
        sort.add(s);
        }
        }
        int tot =0;
        for (Integer apostado: num){
        if (sort.contains(apostado)){
        tot++;
        }
        }
        if (tot ==6){
        return valor; // 100%
        } else if (tot == 5){
        return valor * 0.2; // 20%
        } else if (tot == 4){
        return valor * 0.05; // 5%
        }
        }
        return 0.0;
    }
}
