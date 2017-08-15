package com.cdk.vimms.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;


@Entity
@javax.persistence.Table(name = "car_detail")
public class Car {

    @Id
    @Column(length =  20)
    private String vin;

    @Column(length = 20, nullable = false)
    private String make;

    @Column(length = 20, nullable = false)
    private String model;

    @Column(nullable = false)
    private Date year;

    @Column(length = 20, nullable = true)
    private String trim;

    @Column(length = 30, nullable = true)
    private String logo;

    public Car() {

    }

    public Car(String make, String model, Date year, String trim, String logo) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.trim = trim;
        this.logo = logo;
    }

    public Car(String vin, String make, String model, Date year, String trim, String logo) {
        this.vin = vin;
        this.make = make;
        this.model = model;
        this.year = year;
        this.trim = trim;
        this.logo = logo;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
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

    public Date getYear() {
        return year;
    }

    public void setYear(Date year) {
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (vin != null ? !vin.equals(car.vin) : car.vin != null) return false;
        if (make != null ? !make.equals(car.make) : car.make != null) return false;
        if (model != null ? !model.equals(car.model) : car.model != null) return false;
        if (year != null ? !year.equals(car.year) : car.year != null) return false;
        if (trim != null ? !trim.equals(car.trim) : car.trim != null) return false;
        return logo != null ? logo.equals(car.logo) : car.logo == null;
    }

    @Override
    public int hashCode() {
        int result = vin != null ? vin.hashCode() : 0;
        result = 31 * result + (make != null ? make.hashCode() : 0);
        result = 31 * result + (model != null ? model.hashCode() : 0);
        result = 31 * result + (year != null ? year.hashCode() : 0);
        result = 31 * result + (trim != null ? trim.hashCode() : 0);
        result = 31 * result + (logo != null ? logo.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Car{" +
                "vin='" + vin + '\'' +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", trim='" + trim + '\'' +
                ", logo='" + logo + '\'' +
                '}';
    }
}
