import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class OrdenacaoArrayList {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();

        //como adicionar elementos no array?

        nomes.add("Nome 3");
        nomes.add("Nome 1");
        nomes.add("Nome 4");
        nomes.add("Nome 5");
        nomes.add("Nome 2");

        Collections.sort(nomes);

        for (String nome : nomes){
            System.out.println(nome);
        }
    }
}