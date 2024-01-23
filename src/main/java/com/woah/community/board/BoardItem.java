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
@Table(name = "board_items")
public class BoardItem {
    @Id
    @GeneratedValue
    private long id;

    @ManyToOne
    @JoinColumn(name="board_id", nullable = false)
    private Board board;

}
