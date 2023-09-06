package com.xa.crm.models;

import jakarta.persistence.*;

import java.time.Instant;

@Entity
@Table(name = "fact_correspondence_messages")
public class FactCorrespondenceMessage {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "correspondence_id", nullable = false)
    private DimCorrespondence correspondence;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "correspondence_message_id")
    private DimCorrespondenceMessage correspondenceMessage;

    @Column(name = "new_field", nullable = false)
    private Integer newField;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "response_to")
    private DimCorrespondenceMessage responseTo;

    @Column(name = "date_time", nullable = false)
    private Instant dateTime;

    @Column(name = "active", nullable = false)
    private Boolean active = false;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public DimCorrespondence getCorrespondence() {
        return correspondence;
    }

    public void setCorrespondence(DimCorrespondence correspondence) {
        this.correspondence = correspondence;
    }

    public DimCorrespondenceMessage getCorrespondenceMessage() {
        return correspondenceMessage;
    }

    public void setCorrespondenceMessage(DimCorrespondenceMessage correspondenceMessage) {
        this.correspondenceMessage = correspondenceMessage;
    }

    public Integer getNewField() {
        return newField;
    }

    public void setNewField(Integer newField) {
        this.newField = newField;
    }

    public DimCorrespondenceMessage getResponseTo() {
        return responseTo;
    }

    public void setResponseTo(DimCorrespondenceMessage responseTo) {
        this.responseTo = responseTo;
    }

    public Instant getDateTime() {
        return dateTime;
    }

    public void setDateTime(Instant dateTime) {
        this.dateTime = dateTime;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

}