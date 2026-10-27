//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        User userA = new User("Vitor", "Assalin");
        User userB = new User("Tiago", "Aguiar");
        
        System.out.println(userA.toString());
        System.out.println(userB.toString());
    }
}