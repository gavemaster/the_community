package com.woah.community.board;


import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.Set;

@Data
@Builder
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "boards")
public class Board {

    @Id
    @GeneratedValue
    private long id;

    private String name;
    private String description;
    private Date createdDate;
    private Date lockedDate;

    @OneToOne(mappedBy = "board", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    private BoardDetails boardDetails;

    @OneToMany(mappedBy = "board", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    private Set<BoardItem> boardItemSet;
}
