package com.example.mongo.entity;

import org.springframework.data.mongodb.core.mapping.Document;

//import javax.persistence.*;
import java.util.Date;

@Document(collection = "EMPLOYEE2")
public class Employee {
    public static final String TABLE_NAME="EMPLOYEE2";
    public static final String ID_COLUMN_NAME="ID";
    public static final String FIRST_NAME_COLUMN="FIRST_NAME";
    public static final String SEQ_GEN_ALIAS="seq_gen_alias";
    public static final String seq_gen_strategy="uuid2";
    private String employeeId;
    private String firstName;
    private String lastName;
    private Date dateOfBirth;
    private Date dateOfJoining;

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Date getDateOfJoining() {
        return dateOfJoining;
    }

    public void setDateOfJoining(Date dateOfJoining) {
        this.dateOfJoining = dateOfJoining;
    }
}
