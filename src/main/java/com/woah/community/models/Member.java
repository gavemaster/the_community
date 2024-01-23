package com.woah.community.models;

import jakarta.persistence.*;


public class Member extends User{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;





    public Member() {
        super();
    }
}
