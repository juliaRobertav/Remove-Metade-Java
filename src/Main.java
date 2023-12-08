import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> alunos = new ArrayList<String>(Arrays.asList("Lucas", "Laura","Henrique", "Felipe", "Gabriel",
                "Diego Castan","Esther","Caio", "Diego Jacober", "Nicole", "Giovanna Vieira", "Giovanna Fiuza", "Angelo",
                "Kadu", "Giovana Radaeli", "Allana", "Eduarda", "Julia"));

        Random random = new Random();
        for (int i = 0; i <9; i++) {
            int sala = random.nextInt(alunos.size());
            alunos.remove(sala);
        }
        System.out.println(alunos);
    }
}