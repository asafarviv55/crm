package com.xa.crm.models;

import jakarta.persistence.*;

@Entity
@Table(name = "map_document_accounts")
public class MapDocumentAccount {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "document_id", nullable = false)
    private DimDocument document;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "account_id", nullable = false)
    private DimAccount account;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public DimDocument getDocument() {
        return document;
    }

    public void setDocument(DimDocument document) {
        this.document = document;
    }

    public DimAccount getAccount() {
        return account;
    }

    public void setAccount(DimAccount account) {
        this.account = account;
    }

}