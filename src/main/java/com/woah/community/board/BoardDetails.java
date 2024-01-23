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
@Table(name = "board_details")
public class BoardDetails {
    @Id
    @GeneratedValue
    private long id;

    @OneToOne
    @JoinColumn(name="board_id", nullable = false)
    private Board board;

    private int impressions;

    private int likes;

    private int dislikes;

    private int uniqueViewers;



}
