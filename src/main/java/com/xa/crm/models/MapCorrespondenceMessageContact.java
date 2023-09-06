package com.xa.crm.models;

import jakarta.persistence.*;

@Entity
@Table(name = "map_correspondence_message_contacts")
public class MapCorrespondenceMessageContact {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "contact_id", nullable = false)
    private DimContact contact;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "correspondence_message_id", nullable = false)
    private DimCorrespondenceMessage correspondenceMessage;

    @Column(name = "type", nullable = false)
    private Integer type;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public DimContact getContact() {
        return contact;
    }

    public void setContact(DimContact contact) {
        this.contact = contact;
    }

    public DimCorrespondenceMessage getCorrespondenceMessage() {
        return correspondenceMessage;
    }

    public void setCorrespondenceMessage(DimCorrespondenceMessage correspondenceMessage) {
        this.correspondenceMessage = correspondenceMessage;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

}