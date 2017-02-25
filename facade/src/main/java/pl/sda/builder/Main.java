package pl.sda.builder;

/**
 * Created by RENT on 2017-02-25.
 */
public class Main {
    public static void main(String[] args) {
        PersonBuilder personBuilder = new PersonBuilder();

        PersonAddress address = new PersonAddress();
        address.setCity("Poznan");
        address.setStreet("Baraniaka 88");
        address.setPostalCode("60-111");
        Person person = personBuilder.withFirstName("Jan")
                .withLastName("Kowalski")
                .withPesel("92092345980")
                .withPersonAddress(address)
                .build();

        System.out.println(person.toString());
    }
}
