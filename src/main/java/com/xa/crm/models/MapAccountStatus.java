package com.xa.crm.models;

import jakarta.persistence.*;

import java.time.Instant;

@Entity
@Table(name = "map_account_status")
public class MapAccountStatus {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "account_id", nullable = false)
    private DimAccount account;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "status_id", nullable = false)
    private DimStatus status;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "sub_status_id")
    private DimStatus subStatus;

    @Column(name = "date", nullable = false)
    private Instant date;

    @Column(name = "description", length = 500)
    private String description;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public DimAccount getAccount() {
        return account;
    }

    public void setAccount(DimAccount account) {
        this.account = account;
    }

    public DimStatus getStatus() {
        return status;
    }

    public void setStatus(DimStatus status) {
        this.status = status;
    }

    public DimStatus getSubStatus() {
        return subStatus;
    }

    public void setSubStatus(DimStatus subStatus) {
        this.subStatus = subStatus;
    }

    public Instant getDate() {
        return date;
    }

    public void setDate(Instant date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}