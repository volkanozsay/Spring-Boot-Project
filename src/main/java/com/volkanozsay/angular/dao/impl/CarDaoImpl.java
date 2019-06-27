package com.volkanozsay.angular.dao.impl;

import com.volkanozsay.angular.dao.CarDao;
import com.volkanozsay.angular.model.Car;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Repository
public class CarDaoImpl  implements CarDao {
    @PersistenceContext
    private EntityManager entityManager;
    @Override
    public List<Car> getAllCar() {
        StringBuilder queryString = new StringBuilder();
        queryString.append(" SELECT C FROM Car C");
        Query query =  entityManager.createQuery(queryString.toString());
        return  query.getResultList();
    }

    @Override
    public Car getCar(Long id) {
        StringBuilder queryString=new StringBuilder();
        queryString.append(" Select c From Car c where id= :id ");
        Query query=  entityManager.createQuery(queryString.toString());
        query.setParameter("id",id);
        return (Car) query.getSingleResult();
    }
}
