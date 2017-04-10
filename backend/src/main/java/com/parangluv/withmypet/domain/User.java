package com.parangluv.withmypet.domain;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

/**
 * Created by DGIT on 2017-04-10.
 */
@Entity(name = "user")
@Data
@ToString
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String userId;
    private String userPw;
    private String userEmail;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<UserUpet> userUpets;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<HospitalReview> hospitalReviews;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<HospitalReviewReply> hospitalReviewReplys;


}
