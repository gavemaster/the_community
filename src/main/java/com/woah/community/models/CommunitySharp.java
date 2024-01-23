package com.woah.community.models;


import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "community_sharps")
public class CommunitySharp {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String communityId;

    private String subscriptionId;

    private String sharpId;

    private String communityLogId;

    private Date joinDate;

    private String isAdminFlag;

    private String isOwnerFlag;


    public CommunitySharp() {
    }



}
