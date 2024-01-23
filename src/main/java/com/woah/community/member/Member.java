package com.woah.community.member;
import com.woah.community.user.User;
import jakarta.persistence.*;
import lombok.*;

@Data
@Builder
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "members")
public class Member {

    @Id
    @GeneratedValue
    private long id;

    @OneToOne
    @JoinColumn(name="user_id", nullable = false)
    private User user;




}
