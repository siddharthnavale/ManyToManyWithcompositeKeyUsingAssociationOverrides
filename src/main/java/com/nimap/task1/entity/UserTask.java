package com.nimap.task1.entity;


import java.util.Date;

import javax.persistence.AssociationOverride;
import javax.persistence.AssociationOverrides;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="USERS_TASKS")
@AssociationOverrides({
    @AssociationOverride(name = "primaryKey.user",
            joinColumns = @JoinColumn(name = "USER_ID")),
        @AssociationOverride(name = "primaryKey.task",
            joinColumns = @JoinColumn(name = "TASK_ID")) })
public class UserTask {

	 // composite-id key
	@EmbeddedId
    private UserTaskId pk = new UserTaskId();
     
    // additional fields
    private boolean activated;
    private Date registeredDate;
	
    public UserTask() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserTask(UserTaskId pk, boolean activated, Date registeredDate) {
		super();
		this.pk = pk;
		this.activated = activated;
		this.registeredDate = registeredDate;
	}

	public UserTaskId getPk() {
		return pk;
	}

	public void setPk(UserTaskId pk) {
		this.pk = pk;
	}

	public boolean isActivated() {
		return activated;
	}

	public void setActivated(boolean activated) {
		this.activated = activated;
	}

	public Date getRegisteredDate() {
		return registeredDate;
	}

	public void setRegisteredDate(Date registeredDate) {
		this.registeredDate = registeredDate;
	}
    
    

   
}
//The @EmbeddedId annotation is used for embedding a composite-id class as the primary key of this mapping.
	//Because of an @EmbeddedId is used, we must use the @AssociationOverrides annotation in order to override the mappings for the user and group attributes of the composite key.
	//We mark getters of the user and group properties with the @Transient annotation so that Hibernate doesn’t try to map these getters. These getters are provided for convenience in case we want to obtain a specific side of the relationship.
