package pl.sda.builder;

/**
 * Created by RENT on 2017-02-25.
 */
public class Person {
    private String firstName;
    private String lastName;
    private PersonAddress adress;
    private String pesel;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public PersonAddress getAdress() {
        return adress;
    }

    public void setAdress(PersonAddress adress) {
        this.adress = adress;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", adress=" + adress +
                ", pesel='" + pesel + '\'' +
                '}';
    }
}
