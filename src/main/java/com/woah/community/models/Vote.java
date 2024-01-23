package com.woah.community.models;


import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "votes")
public class Vote {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String communityId;

    private String pollId;

    private String communityMemberId;

    private String pollOptionId;

    private Date voteSubmittedDate;
}
