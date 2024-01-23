package com.woah.community.models;


import jakarta.persistence.*;

import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "community_polls")
public class CommunityPoll {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;



    private String communityId;

    private String creatorId;

    private String pollDescription;

    private String pollTitle;

    private Date pollExpirationDate;

    private Date pollCreationDate;

    @Transient
    private int totalVotes;

    @Transient
    private Set<Vote> votes;

    @Transient
    private Set<CommunityPollOption> pollOptions;


}
