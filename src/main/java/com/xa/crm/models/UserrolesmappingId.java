package com.xa.crm.models;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class UserrolesmappingId implements Serializable {
    private static final long serialVersionUID = 6151467781769594720L;
    @Column(name = "UserID", nullable = false)
    private Long userID;

    @Column(name = "RoleID", nullable = false)
    private Long roleID;

    public Long getUserID() {
        return userID;
    }

    public void setUserID(Long userID) {
        this.userID = userID;
    }

    public Long getRoleID() {
        return roleID;
    }

    public void setRoleID(Long roleID) {
        this.roleID = roleID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        UserrolesmappingId entity = (UserrolesmappingId) o;
        return Objects.equals(this.roleID, entity.roleID) &&
                Objects.equals(this.userID, entity.userID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(roleID, userID);
    }

}