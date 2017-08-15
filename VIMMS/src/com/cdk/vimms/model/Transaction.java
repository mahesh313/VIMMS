package com.cdk.vimms.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@javax.persistence.Table(name = "transaction_detail")
public class Transaction {

    @Id
    @Column(length = 20)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int transactionId;


    @OneToOne(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, fetch = FetchType.EAGER)
    @JoinColumn(name = "vin")
    private Car car;

    @Temporal(TemporalType.DATE)
    @Column(nullable = false)
    private Date date;

    @Temporal(TemporalType.TIME)
    @Column(nullable = false)
    private Date time;

    @Column(name = "quantity_sold", nullable = false)
    private int quantitySold;

    public Transaction() {
            }

    public Transaction(Car car, Date date, Date time, int quantitySold) {
        this.car = car;
        this.date = date;
        this.time = time;
        this.quantitySold = quantitySold;
    }

    public Transaction(int transactionId, Car car, Date date, Date time, int quantitySold) {
        this.transactionId = transactionId;
        this.car = car;
        this.date = date;
        this.time = time;
        this.quantitySold = quantitySold;
    }

    public int getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(int transactionId) {
        this.transactionId = transactionId;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public int getQuantitySold() {
        return quantitySold;
    }

    public void setQuantitySold(int quantitySold) {
        this.quantitySold = quantitySold;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Transaction that = (Transaction) o;

        if (transactionId != that.transactionId) return false;
        if (quantitySold != that.quantitySold) return false;
        if (car != null ? !car.equals(that.car) : that.car != null) return false;
        if (date != null ? !date.equals(that.date) : that.date != null) return false;
        return time != null ? time.equals(that.time) : that.time == null;
    }

    @Override
    public int hashCode() {
        int result = transactionId;
        result = 31 * result + (car != null ? car.hashCode() : 0);
        result = 31 * result + (date != null ? date.hashCode() : 0);
        result = 31 * result + (time != null ? time.hashCode() : 0);
        result = 31 * result + quantitySold;
        return result;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "transactionId=" + transactionId +
                ", car=" + car +
                ", date=" + date +
                ", time=" + time +
                ", quantitySold=" + quantitySold +
                '}';
    }
}
