package com.woah.community.models;


import jakarta.persistence.*;

import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "communities")
public class Comumunity {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String communityName;

        private String communityDescription;

        private Date creationDate;

        private String ownerId;

        private String communitySettingsId;

        @Transient
        private Set<CommunityMember> communityMembers;

        @Transient
        private Set<CommunitySharp> communitySharps;

        @Transient
        private CommunitySettings settings;






}
