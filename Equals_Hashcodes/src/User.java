import java.util.Objects;

public class User {
    private String firstName;
    private String lastName;


    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

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


    //Equals para fazer a comparação das propriedades dentro dos Objetos de hashcode
    @Override
    public boolean equals(Object o) {
        //if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(firstName, user.firstName) && Objects.equals(lastName, user.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }
}
