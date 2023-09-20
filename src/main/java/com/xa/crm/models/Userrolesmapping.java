package com.xa.crm.models;

import jakarta.persistence.*;

@Entity
@Table(name = "userrolesmapping")
public class Userrolesmapping {
    @EmbeddedId
    private UserrolesmappingId id;

    @MapsId("userID")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "UserID", nullable = false)
    private User userID;

    @MapsId("roleID")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "RoleID", nullable = false)
    private Userrole roleID;

    public UserrolesmappingId getId() {
        return id;
    }

    public void setId(UserrolesmappingId id) {
        this.id = id;
    }

    public User getUserID() {
        return userID;
    }

    public void setUserID(User userID) {
        this.userID = userID;
    }

    public Userrole getRoleID() {
        return roleID;
    }

    public void setRoleID(Userrole roleID) {
        this.roleID = roleID;
    }

}