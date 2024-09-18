package lk.ijse.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;



@Entity
public class Customer {                     //  (Inverse End)
    @Id
    private int id;
    private String name;

    //private String address;

             //@OneToOne
             // private Address address;

    public Customer() {
    }

    public Customer(int id, String name) {
        this.id = id;
        this.name = name;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }




                 /*public Address getAddress() {
                          return address;
                  }



               public void setAddress(Address address) {
                    this.address = address;
                  }*/
}
