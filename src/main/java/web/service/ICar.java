package web.service;

import web.models.Car;

import java.util.List;

public interface ICar {
    List<Car> index(int count);
}
