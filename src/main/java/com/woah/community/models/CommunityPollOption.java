package com.woah.community.models;


import jakarta.persistence.*;

@Entity
@Table(name = "community_poll_options")
public class CommunityPollOption {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String communityPollId;

    private int votes;

    private String optionDescription;

    private String creatorId;
}
