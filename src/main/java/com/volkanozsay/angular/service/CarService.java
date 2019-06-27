package com.volkanozsay.angular.service;

import com.volkanozsay.angular.model.Car;

import java.util.List;

public interface CarService {

    List<Car> getAllCar();
    Car getCar(Long id);
}
