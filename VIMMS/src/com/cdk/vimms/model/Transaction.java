package com.cdk.vimms.model;

import javax.persistence.Column;
import javax.persistence.Id;
import java.util.Date;

public class Transaction {

    @Id
    @Column(length = 20)
    private String transactionId;


    private String vin;
    private Date date;
    private Date time;
    private int quantitySold;

    public Transaction() {
            }

    public Transaction(String vin, Date date, Date time, int quantitySold) {
        this.vin = vin;
        this.date = date;
        this.time = time;
        this.quantitySold = quantitySold;
    }

    public Transaction(String transactionId, String vin, Date date, Date time, int quantitySold) {
        this.transactionId = transactionId;
        this.vin = vin;
        this.date = date;
        this.time = time;
        this.quantitySold = quantitySold;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
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

        if (quantitySold != that.quantitySold) return false;
        if (transactionId != null ? !transactionId.equals(that.transactionId) : that.transactionId != null)
            return false;
        if (vin != null ? !vin.equals(that.vin) : that.vin != null) return false;
        if (date != null ? !date.equals(that.date) : that.date != null) return false;
        return time != null ? time.equals(that.time) : that.time == null;
    }

    @Override
    public int hashCode() {
        int result = transactionId != null ? transactionId.hashCode() : 0;
        result = 31 * result + (vin != null ? vin.hashCode() : 0);
        result = 31 * result + (date != null ? date.hashCode() : 0);
        result = 31 * result + (time != null ? time.hashCode() : 0);
        result = 31 * result + quantitySold;
        return result;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "transactionId='" + transactionId + '\'' +
                ", vin='" + vin + '\'' +
                ", date=" + date +
                ", time=" + time +
                ", quantitySold=" + quantitySold +
                '}';
    }
}
