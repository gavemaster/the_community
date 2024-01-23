package com.woah.community.models;

import jakarta.persistence.*;

import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "subscriptions")
public class Subscription {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String paymentMethodId;

    private String subscriptionType;

    private String subscriptionStatus;

    private Date subscriptionStartDate;

    private Date subscriptionEndDate;

    private Date nextPaymentDate;

    private String subscriptionPaymentFrequency;

    private Date mostRecentPaymentDate;

    private double subscriptionAmount;

    private int paymentsMade;

    private int daysSubscriptionInactive;

    @Transient
    private Set<Payment> invoices;


    public Subscription() {
    }

}
