import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int f1= 0;
        int f2 = 1;

        System.out.print("Informe o limite: ");
        int limit = input.nextInt();
        while(f2 < limit){
            int fn  = f1 + f2;
            if(fn > limit)
                break;
            System.out.println(fn);
            f1 = f2;
            f2 = fn;
        }
    }
}