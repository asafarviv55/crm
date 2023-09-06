package com.xa.crm.models;

import jakarta.persistence.*;

@Entity
@Table(name = "map_meeting_participants")
public class MapMeetingParticipant {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "meeting_id", nullable = false)
    private DimMeeting meeting;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "contact_id", nullable = false)
    private DimContact contact;

    @Column(name = "active", nullable = false)
    private Boolean active = false;

    @Column(name = "type", nullable = false)
    private Integer type;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public DimMeeting getMeeting() {
        return meeting;
    }

    public void setMeeting(DimMeeting meeting) {
        this.meeting = meeting;
    }

    public DimContact getContact() {
        return contact;
    }

    public void setContact(DimContact contact) {
        this.contact = contact;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

}