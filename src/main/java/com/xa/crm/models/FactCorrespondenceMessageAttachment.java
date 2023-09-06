package com.xa.crm.models;

import jakarta.persistence.*;

@Entity
@Table(name = "fact_correspondence_message_attachments")
public class FactCorrespondenceMessageAttachment {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "url", nullable = false)
    private String url;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "correspondence_message_id", nullable = false)
    private DimCorrespondenceMessage correspondenceMessage;

    @Column(name = "name", nullable = false, length = 50)
    private String name;

    @Column(name = "active", nullable = false)
    private Boolean active = false;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public DimCorrespondenceMessage getCorrespondenceMessage() {
        return correspondenceMessage;
    }

    public void setCorrespondenceMessage(DimCorrespondenceMessage correspondenceMessage) {
        this.correspondenceMessage = correspondenceMessage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

}