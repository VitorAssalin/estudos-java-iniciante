import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // comparando arrays

        /*
        int [] numbersA = new int[]{1, 2, 3};
        int [] numbersB = new int[]{1, 2, 3};
        Retorna false pois compara os espaços reservados na memoria e não os valores dentro dos arrays

        System.out.println(numbersA == numbersB);
        System.out.println(numbersA.equals(numbersB));
        System.out.println(numbersA + " " + numbersB);
        */

        /*
        int [] numbersA = new int[]{1, 2, 3};
        int [] numbersB = numbersA;
        Retorna true pois apontam para os mesmos espaços da memória

        System.out.println(numbersA == numbersB);
        System.out.println(numbersA.equals(numbersB));
        System.out.println(numbersA + " " + numbersB);
        */

        int [] numbersA = new int[]{1, 2, 3};
        int [] numbersB = new int[]{1, 2, 3};

        System.out.println(numbersA + " " + numbersB);
        //Pega o conteudos dos dois arrays e compara eles
        System.out.println(Arrays.equals(numbersA, numbersB));

    }
}