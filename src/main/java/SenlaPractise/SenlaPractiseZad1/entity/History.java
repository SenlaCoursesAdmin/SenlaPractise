package SenlaPractise.SenlaPractiseZad1.entity;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.util.Date;

@Document(collection = "Journal")
public class History {
    @Id
    private String id;
    private Date date;
    private Double beganPrice;
    private BigDecimal priceAfterDiscount;
    private Integer discount;
    private UserRole role;

    public History() {
    }

    public History(String id, Date date, Double beganPrice, BigDecimal priceAfterDiscount, Integer discount, UserRole role) {
        this.id = id;
        this.date = date;
        this.beganPrice = beganPrice;
        this.priceAfterDiscount = priceAfterDiscount;
        this.discount = discount;
        this.role = role;
    }

    public History(Date date, Double beganPrice, BigDecimal priceAfterDiscount, Integer discount, UserRole role) {
        this.date = date;
        this.beganPrice = beganPrice;
        this.priceAfterDiscount = priceAfterDiscount;
        this.discount = discount;
        this.role = role;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Double getBeganPrice() {
        return beganPrice;
    }

    public void setBeganPrice(Double beganPrice) {
        this.beganPrice = beganPrice;
    }

    public BigDecimal getPriceAfterDiscount() {
        return priceAfterDiscount;
    }

    public void setPriceAfterDiscount(BigDecimal priceAfterDiscount) {
        this.priceAfterDiscount = priceAfterDiscount;
    }

    public Integer getDiscount() {
        return discount;
    }

    public void setDiscount(Integer discount) {
        this.discount = discount;
    }

    public UserRole getRole() {
        return role;
    }

    public void setRole(UserRole role) {
        this.role = role;
    }
}
