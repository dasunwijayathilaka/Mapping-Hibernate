package lk.ijse.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class Customer {
    @Id
    private int cid;


    private String name;

    @OneToMany(mappedBy = "customer", fetch = FetchType.EAGER)
    private List<Address> addresses;



    public Customer() {
    }

    public Customer(int cid, String name, List<Address> addresses) {
        this.cid = cid;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "cid=" + cid +
                ", name='" + name + '\'' +
                ", addresses=" + addresses +
                '}';
    }

}
