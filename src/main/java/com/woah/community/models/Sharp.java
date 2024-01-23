package com.woah.community.models;


import jakarta.persistence.*;


public class Sharp extends Member{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Sharp() {
        super();
    }


}
