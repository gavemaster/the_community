package com.woah.community.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="users", uniqueConstraints = {
        @UniqueConstraint(columnNames = "username"),
        @UniqueConstraint(columnNames = "email")
})
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String username;


    private String password;
    @NotBlank
    @Email
    private String email;

    private String firstName;
    private String lastName;
    private String phoneNumber;
    private Date createdAt;

    private String inactiveFlag;

    private Date lastLogin;

    private String memberId;

    private String sharpId;

    private String adminId;

    private String subscriptionId;

    private String roles;

    private String isLocked;




//    public User(String username, String password, String email, String firstName, String lastName, String phoneNumber) {
//        this.username = username;
//        this.password = password;
//        this.email = email;
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.phoneNumber = phoneNumber;
//        this.createdAt = new Date();
//        this.inactiveFlag = "N";
//        this.lastLogin = new Date();
//        this.roles = "ROLE_USER";
//        this.memberId = null;
//        this.sharpId = null;
//        this.adminId = null;
//        this.isLocked = "N";
//    }
//


}

