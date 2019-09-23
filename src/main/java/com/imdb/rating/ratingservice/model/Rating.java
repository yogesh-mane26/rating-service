package com.imdb.rating.ratingservice.model;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "rating")
public class Rating {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator( name = "native", strategy = "native")
    private Long rID;
    private Long mID;
    private Long uID;
    private Double stars;
    private Date  ratingDate;

    public Rating(){

    }
    public Rating(Long rID, Long mID, Long uID, Double stars, Date ratingDate) {
        this.rID = rID;
        this.mID = mID;
        this.uID = uID;
        this.stars = stars;
        this.ratingDate = ratingDate;
    }

    public Long getrID() {
        return rID;
    }

    public void setrID(Long rID) {
        this.rID = rID;
    }

    public Long getmID() {
        return mID;
    }

    public void setmID(Long mID) {
        this.mID = mID;
    }

    public Long getuID() {
        return uID;
    }

    public void setuID(Long uID) {
        this.uID = uID;
    }

    public Double getStars() {
        return stars;
    }

    public void setStars(Double stars) {
        this.stars = stars;
    }

    public Date getRatingDate() {
        return ratingDate;
    }

    public void setRatingDate(Date ratingDate) {
        this.ratingDate = ratingDate;
    }
}
