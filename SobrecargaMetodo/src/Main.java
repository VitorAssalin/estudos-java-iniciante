//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        User userA = new User("Vitor", "Assalin");

        System.out.println(userA.output());
        System.out.println(userA.output(false));
    }
}