public class User {

    private String firstName;
    private String lastName;

    //Static permite que o metodo seja usado para toda a classe
    private static int count = 0;

    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        //Adiciona uma contagem geral da classe User de Usuários
        count = count + 1;
    }
    public int getCount(){
        return count;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    //Sobrecarga de metodo
    public String output() {
        return firstName.toUpperCase() + " " + lastName.toUpperCase();
    }

    public String output(boolean showLastName) {
        if (showLastName) {
            return output();
        }
        //Tem a mesma função de else mas economiza um bloco de código
        return firstName;
    }

}
