package pl.sda.adapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by RENT on 2017-02-27.
 */
public class Main2 {
    public static void main(String[] args) {
        Person person = new PersonImpl();
        Car car = new CarImpl();

        PersonToCarAdapter personToCarAdapter = new PersonToCarAdapter(person);

        List<Car> carList = new ArrayList<>();

        carList.add(car);
        carList.add(personToCarAdapter);

        for (Car carFromList : carList) {
            carFromList.drive();
            carFromList.horn();
        }
    }
}
