package web.service;

import org.springframework.stereotype.Component;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;

@Component

public class CarDao implements ICar {
    List<Car> cars = new ArrayList<>();

    {
        cars.add(new Car("BMW", "X5", 2015));
        cars.add(new Car("AUDI", "RS6 Universal", 2020));
        cars.add(new Car("Volkswagen", "Faeton", 2009));
        cars.add(new Car("Toyota", "Camry 50", 2015));
        cars.add(new Car("Tesla", "Plaid", 2023));
    }

    @Override
    public List<Car> index(int count) {
        List<Car> carsList = cars;
        if (count < 5) {
            while (carsList.size() > count) {
                carsList.remove(carsList.size() - 1);
            }
        }
        return carsList;
    }
}
