package com.xa.crm.models;

import jakarta.persistence.*;

import java.time.Instant;

@Entity
@Table(name = "map_purchase_payments")
public class MapPurchasePayment {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "purchase_id", nullable = false)
    private FactPurchase purchase;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "payment_id", nullable = false)
    private FactPurchasePayment payment;

    @Column(name = "date_time", nullable = false)
    private Instant dateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public FactPurchase getPurchase() {
        return purchase;
    }

    public void setPurchase(FactPurchase purchase) {
        this.purchase = purchase;
    }

    public FactPurchasePayment getPayment() {
        return payment;
    }

    public void setPayment(FactPurchasePayment payment) {
        this.payment = payment;
    }

    public Instant getDateTime() {
        return dateTime;
    }

    public void setDateTime(Instant dateTime) {
        this.dateTime = dateTime;
    }

}