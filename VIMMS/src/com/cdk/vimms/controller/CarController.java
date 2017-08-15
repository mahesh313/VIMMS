package com.cdk.vimms.controller;

import com.cdk.vimms.model.Car;
import com.cdk.vimms.model.Inventory;
import com.cdk.vimms.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

import static org.springframework.http.MediaType.TEXT_PLAIN_VALUE;

@RestController
public class CarController {

    @Autowired
    CarService carService;

    @RequestMapping(value = "/car/{field}/{fieldValue}",produces = "application/json" ,method = RequestMethod.GET)
    public Collection<Car> readCarsAsJson(@PathVariable String field,@PathVariable String fieldValue){
        return carService.readCars(field,fieldValue);
    }

    @RequestMapping(value = "/cars",produces = "application/json" ,method = RequestMethod.GET)
    public Collection<Car> readAllCarsAsJson(){
        return carService.readAllCars();
    }

    @RequestMapping(value = "/add",consumes ="application/json" ,produces = TEXT_PLAIN_VALUE ,method = RequestMethod.POST)
    public String addCar(@RequestBody Car car){
        System.out.println(car);
        int value = carService.save(car);
        return "Car with vin '"+value+" ' added successfully!";
    }


}
