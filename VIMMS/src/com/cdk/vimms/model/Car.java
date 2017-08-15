package com.cdk.vimms.model;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "car_detail")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int vin;

    @Column(length = 20, nullable = false)
    private String make;

    @Column(length = 20, nullable = false)
    private String model;

    @Column(nullable = false)
    private int year;

    @Column(length = 20, nullable = true)
    private String trim;

    @Column(length = 30, nullable = true)
    private String logo;


    public Car() {
    }


    public Car(String make, String model, int year, String trim, String logo) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.trim = trim;
        this.logo = logo;
    }

    public Car(int vin,String make, String model, int year, String trim, String logo) {
        this.vin = vin;
        this.make = make;
        this.model = model;
        this.year = year;
        this.trim = trim;
        this.logo = logo;
    }




    public int getVin() {
        return vin;
    }

    public void setVin(int vin) {
        this.vin = vin;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getTrim() {
        return trim;
    }

    public void setTrim(String trim) {
        this.trim = trim;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    @Override
    public String toString() {
        return "Car{" +
                "vin=" + vin +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", trim='" + trim + '\'' +
                ", logo='" + logo + '\'' +
                '}';
    }
}
