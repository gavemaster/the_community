package com.woah.community.models;


import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "community_members")
public class CommunityMember {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String communityId;

    private String memberId;

    private String balanceId;

    private String subscriptionId;

    private String communityLogId;

    private Date joinDate;


public CommunityMember() {
    }




    //@Transient
    //private Set<Vote> votes;





}
