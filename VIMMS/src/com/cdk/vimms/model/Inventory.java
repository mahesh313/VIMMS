package com.cdk.vimms.model;

import javax.persistence.*;
import java.util.Date;

public class Inventory {

    @Id
    @Column(length = 20)
    @OneToOne(cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinColumn(name = "vin")
    private String vin;

    @Column(name = "quantity_in_hand", nullable = false)
    private int quantityInHand;

    @Column(nullable = false)
    private double price;

    @Column(name = "date_of_modification", nullable = false)
    private Date dateOfModification;

    @Column(nullable = false)
    private int threshold;

    public Inventory() {
    }

    public Inventory(int quantityInHand, double price, Date dateOfModification, int threshold) {
        this.quantityInHand = quantityInHand;
        this.price = price;
        this.dateOfModification = dateOfModification;
        this.threshold = threshold;
    }

    public Inventory(String vin, int quantityInHand, double price, Date dateOfModification, int threshold) {
        this.vin = vin;
        this.quantityInHand = quantityInHand;
        this.price = price;
        this.dateOfModification = dateOfModification;
        this.threshold = threshold;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public int getQuantityInHand() {
        return quantityInHand;
    }

    public void setQuantityInHand(int quantityInHand) {
        this.quantityInHand = quantityInHand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getDateOfModification() {
        return dateOfModification;
    }

    public void setDateOfModification(Date dateOfModification) {
        this.dateOfModification = dateOfModification;
    }

    public int getThreshold() {
        return threshold;
    }

    public void setThreshold(int threshold) {
        this.threshold = threshold;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Inventory inventory = (Inventory) o;

        if (quantityInHand != inventory.quantityInHand) return false;
        if (Double.compare(inventory.price, price) != 0) return false;
        if (threshold != inventory.threshold) return false;
        if (vin != null ? !vin.equals(inventory.vin) : inventory.vin != null) return false;
        return dateOfModification != null ? dateOfModification.equals(inventory.dateOfModification) : inventory.dateOfModification == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = vin != null ? vin.hashCode() : 0;
        result = 31 * result + quantityInHand;
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (dateOfModification != null ? dateOfModification.hashCode() : 0);
        result = 31 * result + threshold;
        return result;
    }

    @Override
    public String toString() {
        return "Inventory{" +
                "vin='" + vin + '\'' +
                ", quantityInHand=" + quantityInHand +
                ", price=" + price +
                ", dateOfModification=" + dateOfModification +
                ", threshold=" + threshold +
                '}';
    }
}
