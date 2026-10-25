package ArrayList;
import java.util.ArrayList;
import java.util.List;

public class MetodosArrayList {

    public static void main(String[] args){
        List<String> nomes = new ArrayList<>();

        //como adicionar elementos no array?

        nomes.add("Nome 1");
        nomes.add("Nome 2");
        nomes.add("Nome 3");
        nomes.add("Nome 4");
        nomes.add("Nome 5");

        //impressão com loop
        // .size como buscar um elemento especifico pelo indice get()
        for(int i = 0; i <nomes.size(); i++){
            System.out.println(nomes.get(i));
        }
        // como buscar o indice a partit de um elemento
            System.out.println(nomes.indexOf("Nome 2"));

        // verifica se a lista esta vazia
            System.out.println(nomes.isEmpty());

        // verifica se a lista contém algum elemento
            System.out.println(nomes.contains("Nome 2"));

        // verifica o tamanho da lista
            System.out.println(nomes.size());

        // limpar dde vez a lista (remover totos os elementos)
            nomes.clear();
            System.out.println(nomes.isEmpty());
    }
}
