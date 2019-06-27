package com.volkanozsay.angular.controller;

import com.volkanozsay.angular.model.Car;
import com.volkanozsay.angular.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/angular")
public class CarController {
    @Autowired
    private CarService carService;

    @RequestMapping(value = "/getAllCar",method = RequestMethod.GET)
    public List<Car> getAllCar(){
        return carService.getAllCar();
    }
    @RequestMapping(value = "/getCar/{id}",method = RequestMethod.GET)
    public Car getCar(@PathVariable("id") Long id){
        return carService.getCar(id);
    }
}
