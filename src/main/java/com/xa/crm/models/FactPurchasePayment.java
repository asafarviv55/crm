package com.xa.crm.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.Instant;

@Entity
@Table(name = "fact_purchase_payment")
public class FactPurchasePayment {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "date_time", nullable = false)
    private Instant dateTime;

    @Column(name = "amount", nullable = false)
    private Double amount;

    @Column(name = "payment_type", nullable = false)
    private Integer paymentType;

    @Column(name = "num_of_payments", nullable = false)
    private Integer numOfPayments;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Instant getDateTime() {
        return dateTime;
    }

    public void setDateTime(Instant dateTime) {
        this.dateTime = dateTime;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Integer getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(Integer paymentType) {
        this.paymentType = paymentType;
    }

    public Integer getNumOfPayments() {
        return numOfPayments;
    }

    public void setNumOfPayments(Integer numOfPayments) {
        this.numOfPayments = numOfPayments;
    }

}