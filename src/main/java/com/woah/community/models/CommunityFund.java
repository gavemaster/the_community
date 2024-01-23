package com.woah.community.models;


import jakarta.persistence.*;

@Entity
@Table(name = "community_funds")
public class CommunityFund {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String communityId;

    private double balance;
}
