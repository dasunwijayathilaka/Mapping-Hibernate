package lk.ijse.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;



@Entity
public class Address {
    @Id                              //( Owner's End )
    private int aid;
    private String no;
    private String road;
    private String city;


    public Customer getCustomer() {
        return customer;
    }


    public void setCustomer(Customer customer) {
        this.customer = customer;
    }


    @OneToOne
    private Customer customer;


    public Address() {
    }

    public Address(int aid, String no, String road, String city) {
        this.aid = aid;
        this.no = no;
        this.road = road;
        this.city = city;
    }

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getRoad() {
        return road;
    }

    public void setRoad(String road) {
        this.road = road;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
