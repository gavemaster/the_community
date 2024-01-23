package com.woah.community.models;


import jakarta.persistence.*;

@Entity
@Table(name = "community_settings")
public class CommunitySettings {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String communityId;

    private String isPublicFlag;

    private double minInevestmentAmount;

    private double maxInevestmentAmount;



    //implementing the community settings model
}
