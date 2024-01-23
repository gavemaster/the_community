package com.woah.community.user;

import com.woah.community.payment.Payment;
import com.woah.community.member.Member;
import com.woah.community.sharp.Sharp;
import com.woah.community.subscription.Subscription;
import com.woah.community.admin.Admin;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.Set;

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


    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    private Member member;


    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    private Sharp sharp;


    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    private Admin admin;

    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    private Subscription subscription;


    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    private Set<Payment> payments;


    private String isLocked;

    private String roles;


    public User(String username, String password, String email, String firstName, String lastName, String phoneNumber) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.createdAt = new Date();
        this.inactiveFlag = "N";
        this.lastLogin = new Date();
        this.roles = "ROLE_USER";
        this.member = null;
        this.sharp = null;
        this.admin = null;
        this.isLocked = "N";
    }


    public void updateRoles(){
        if(this.member != null){
            this.roles += ",ROLE_MEMBER";
        } else if (this.sharp != null) {
            this.roles +=",ROLE_MEMBER,ROLE_SHARP";
        }

        if(this.admin != null){
            this.roles +=",ROLE_ADMIN";
        }
    }



}

