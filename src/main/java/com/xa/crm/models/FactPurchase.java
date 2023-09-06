package com.xa.crm.models;

import jakarta.persistence.*;

import java.time.Instant;

@Entity
@Table(name = "fact_purchases")
public class FactPurchase {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "product_id", nullable = false)
    private DimProductsService product;

    @Column(name = "purchase_date")
    private Instant purchaseDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "purchase_status")
    private DimPurchaseStatus purchaseStatus;

    @Column(name = "price_per_unit")
    private Double pricePerUnit;

    @Column(name = "quantity")
    private Double quantity;

    @Column(name = "description", nullable = false, length = 500)
    private String description;

    @Column(name = "active", nullable = false)
    private Boolean active = false;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "user_id", nullable = false)
    private DimUser user;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public DimProductsService getProduct() {
        return product;
    }

    public void setProduct(DimProductsService product) {
        this.product = product;
    }

    public Instant getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(Instant purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public DimPurchaseStatus getPurchaseStatus() {
        return purchaseStatus;
    }

    public void setPurchaseStatus(DimPurchaseStatus purchaseStatus) {
        this.purchaseStatus = purchaseStatus;
    }

    public Double getPricePerUnit() {
        return pricePerUnit;
    }

    public void setPricePerUnit(Double pricePerUnit) {
        this.pricePerUnit = pricePerUnit;
    }

    public Double getQuantity() {
        return quantity;
    }

    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public DimUser getUser() {
        return user;
    }

    public void setUser(DimUser user) {
        this.user = user;
    }

}