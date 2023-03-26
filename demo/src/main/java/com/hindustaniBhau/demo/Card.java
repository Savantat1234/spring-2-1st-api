package com.hindustaniBhau.demo;

import javax.persistence.*;

@Entity//TO MAKE TABLE OF THIS CLASS
public class Card {

    @Id// ITS A PRIMARY KEY
    @GeneratedValue(strategy = GenerationType.IDENTITY) // TO GENERATE NEW NE ID ACCORDING TO NEW OBJECT
    private int cardNo;
    private String dob;
    @Enumerated(EnumType.STRING)
    Status status;
    @OneToOne // this type of relation...(currentclasstype, otherclasstype)
    @JoinColumn //join the table of current class & below user class... with primary key only .. as not having inside braket anything
    User user; // 2nd class table

   public Card(){


   }
   public Card(int cardNo, String dob, Status status) {
        this.cardNo = cardNo;
        this.dob = dob;
        this.status = status;
    }

    public int getCardNo() {
        return cardNo;
    }

    public void setCardNo(int cardNo) {
        this.cardNo = cardNo;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
