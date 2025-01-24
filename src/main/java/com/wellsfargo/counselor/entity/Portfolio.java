package com.wellsfargo.counselor.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue()
    private long PortfolioId;

    @Column(nullable = false)
    private Date creationDate;

    protected Portfolio() {

    }

    public Portfolio(Date creationDate) {
        this.creationDate = creationDate;
    }

    public long getAdvisorId() {
        return PortfolioId;
    }

    public Date getCreationDate() {return creationDate;}

    public void setCreationDate(Date creationDate) {this.creationDate = creationDate;}
}
