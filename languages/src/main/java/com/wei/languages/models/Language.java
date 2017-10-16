package com.wei.languages.models;


import javax.validation.constraints.Size;
import java.util.Date;
import javax.persistence.*;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.Id;
//import javax.persistence.PrePersist;
//import javax.persistence.PreUpdate;
//import javax.persistence.Table;

@Entity
@Table(name="languages")
public class Language {

    @Id
    @GeneratedValue
    private Long id;
    @Size(min = 2,max = 30, message="Name must be between 2 and 20 character")
    private String name;
    @Size(min = 2,max = 30, message="Name must be between 2 and 20 character")
    private String creator;
    @Size(min = 2,max = 30, message="Name must be between 2 and 20 character")
    private String version;

    @Column(updatable = false)
    private Date createdAt;


    private Date updatedAt;

    public Language(){

    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    @PrePersist
    protected void onCreate(){
        this.createdAt = new Date();
    }
    @PreUpdate
    protected void onUpdate(){
        this.updatedAt = new Date();
    }
}


