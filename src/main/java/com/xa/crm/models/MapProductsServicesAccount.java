package com.xa.crm.models;

import jakarta.persistence.*;

@Entity
@Table(name = "map_products_services_accounts")
public class MapProductsServicesAccount {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "product_id", nullable = false)
    private DimProductsService product;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "account_id", nullable = false)
    private DimAccount account;

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

    public DimAccount getAccount() {
        return account;
    }

    public void setAccount(DimAccount account) {
        this.account = account;
    }

}