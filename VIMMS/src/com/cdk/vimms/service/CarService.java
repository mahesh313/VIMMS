package com.cdk.vimms.service;

import com.cdk.vimms.dao.CarDAO;
import com.cdk.vimms.model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;

@Service
public class CarService {

    @Autowired
    CarDAO carDAO;

    @Transactional
    public Collection<Car> readAllCars() {
        return carDAO.getAllCars();
    }

    @Transactional
    public int save(Car car){
        return carDAO.save(car);
    }

    public Collection<Car> readCars(String field, String fieldValue) {
        return carDAO.getCars(field,fieldValue);
    }
}
