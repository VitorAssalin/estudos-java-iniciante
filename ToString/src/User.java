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

    public String toString() {
        return "User {" +
                "firstName=" + firstName + "," +
                "lastName=" + lastName + "}";
    }
}
