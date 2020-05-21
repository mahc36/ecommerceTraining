package com.training.ecommerce.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table
public class UserModel {

    @Id
    @GeneratedValue
    @Column
    private int id;

    @Column
    private String email;

    @Column
    private String name;

    @Column
    private String lastName;

    @Column
    private Gender gender;

    @Column
    @Temporal(TemporalType.DATE)
    private Date bornDate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getBornDate() {
        return bornDate;
    }

    public void setBornDate(Date bornDate) {
        this.bornDate = bornDate;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
}
