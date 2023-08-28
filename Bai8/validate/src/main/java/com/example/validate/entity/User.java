package com.example.validate.entity;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
@Table(name = "user")
public class User {
    @Id
    @Column(columnDefinition = "varchar(10)")
    private String idUser;
    @Size(min = 5, max = 45, message = " Phải có độ dài tối thiểu 5 , tối đa 45 !")
    private String firstName;
    @Size(min = 5, max = 45, message = " Phải có độ dài tối thiểu 5 , tối đa 45 !")
    private String lastName;
    @Pattern(regexp = "(0?)(3[2-9]|5[6|8|9]|7[0|6-9]|8[0-6|8|9]|9[0-4|6-9])[0-9]{7}", message = " Phai du 10 so ! ")
    private String phoneNumber;
    @Min(value = 18, message = " Tuổi phải lớn hơn hoặc bằng 18")
    private String age;

    @Pattern(regexp = "^[a-zA-Z0-9]+(?:\\.[a-zA-Z0-9]+)*@[a-zA-Z0-9]+(?:\\.[a-zA-Z0-9]+)*$", message = " Phải đúng định dạng email !")
    private String email;

    public User() {
    }

    public User(String idUser, String firstName, String lastName, String phoneNumber, String age, String email) {
        this.idUser = idUser;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.age = age;
        this.email = email;
    }

    public String getIdUser() {
        return idUser;
    }

    public void setIdUser(String idUser) {
        this.idUser = idUser;
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
