package com.xa.crm.models;

import jakarta.persistence.*;

@Entity
@Table(name = "map_account_social_media")
public class MapAccountSocialMedia {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "account_id", nullable = false)
    private DimAccount account;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "social_media_id", nullable = false)
    private DimSocialMedia socialMedia;

    @Column(name = "url", nullable = false)
    private String url;

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

    public DimSocialMedia getSocialMedia() {
        return socialMedia;
    }

    public void setSocialMedia(DimSocialMedia socialMedia) {
        this.socialMedia = socialMedia;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}