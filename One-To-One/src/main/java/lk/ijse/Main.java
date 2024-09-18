package lk.ijse;

import lk.ijse.config.FactoryConfiguration;
import lk.ijse.entity.Address;
import lk.ijse.entity.Customer;
import org.hibernate.Session;
import org.hibernate.Transaction;



public class Main {
    public static void main(String[] args) {

              //make customer object

        Customer customer = new Customer();
        customer.setId(1);
        customer.setName("stive");

              //customer.setAddress(address);


              //make address object


        Address address = new Address();
        address.setAid(1);
        address.setNo("567");
        address.setRoad("kandy road");
        address.setCity("kandy city");
        address.setCustomer(customer);




        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();



        session.save(customer);
        session.save(address);
        transaction.commit();
        session.close();

        }
    }
