import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int [] numbers = new int []{10, 0, 30, 2, 1, 60};
        Arrays.sort(numbers);// <== Ordenou em ordem crescente
        System.out.println(numbers); // <-- imprimi o hashcode do array (identificador)

        System.out.println(Arrays.toString(numbers)); // <-- imprimi oque esta dentro do array de forma ordenada
    }
}