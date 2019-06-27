package com.volkanozsay.angular.service.Impl;


import com.volkanozsay.angular.dao.CarDao;
import com.volkanozsay.angular.dao.impl.CarDaoImpl;
import com.volkanozsay.angular.model.Car;
import com.volkanozsay.angular.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class CarServiceImpl implements CarService {

    @Autowired
    private CarDao carDao;

    @Override
    public List<Car> getAllCar() {
        return carDao.getAllCar();
    }

    @Override
    public Car getCar(Long id) {
        return carDao.getCar(id);
    }


}
