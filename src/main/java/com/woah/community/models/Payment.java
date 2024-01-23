package com.woah.community.models;


import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "payments")
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String userId;
    private String paymentMethodId;

    private String paymentType;

    private String paymentStatus;

    private String paymentAmount;

    private Date paymentDate;

    private Date paymentCompletedDate;


    public Payment() {
    }



}
