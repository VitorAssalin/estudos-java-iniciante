//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    /*
    Equals e Hashcodes. Por padrão, equals compara se duas referências apontam
    para o mesmo objeto na memória, enquanto hashCode gera um código numérico
    para buscas rápidas; sobrescrevemos ambos juntos para comparar objetos pelo seu conteúdo real.
    */
    public static void main(String[] args) {
        //Com o metodo de sobrescrever o equals e hashcodo retorna o hashcode das propriedades dentro das variáveis
        //"return true"
        User userA = new User("Vitor", "Assalin");
        User userB = new User("Vitor", "Assalin");

        System.out.println(userA);
        System.out.println(userA.hashCode());
        System.out.println(userB);
        System.out.println(userB.hashCode());
        System.out.println(userA.equals(userB));
        


        //Entrega hashcodes diferentes pois compara os as propriedades dentro das variais
        //"return false"
        User userC = new User("Vitor", "Assalin");
        User userD = new User("Teste", "HashCode");

        System.out.println(userC);
        System.out.println(userC.hashCode());
        System.out.println(userD);
        System.out.println(userD.hashCode());
        System.out.println(userC.equals(userD));

    }
}