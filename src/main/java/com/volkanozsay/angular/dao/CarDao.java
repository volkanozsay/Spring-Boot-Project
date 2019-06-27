package com.volkanozsay.angular.dao;

import com.volkanozsay.angular.model.Car;

import java.util.List;

public interface CarDao {

    List<Car> getAllCar();
    Car getCar(Long id);

}
