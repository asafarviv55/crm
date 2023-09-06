package com.xa.crm.models;

import jakarta.persistence.*;

@Entity
@Table(name = "map_user_accounts")
public class MapUserAccount {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "user_id", nullable = false)
    private DimUser user;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "account_id", nullable = false)
    private DimAccount account;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "role_id", nullable = false)
    private DimRole role;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public DimUser getUser() {
        return user;
    }

    public void setUser(DimUser user) {
        this.user = user;
    }

    public DimAccount getAccount() {
        return account;
    }

    public void setAccount(DimAccount account) {
        this.account = account;
    }

    public DimRole getRole() {
        return role;
    }

    public void setRole(DimRole role) {
        this.role = role;
    }

}