package lk.ijse;

import lk.ijse.config.FactoryConfiguration;
import lk.ijse.entity.Address;
import lk.ijse.entity.Customer;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {


       Customer customer1 = new Customer();
       customer1.setCid(1);
       customer1.setName("martin guptil");



        Customer customer2 = new Customer();
        customer2.setCid(2);
        customer2.setName("joe root");



        List<Customer> customers = new ArrayList<>();
        customers.add(customer1);
        customers.add(customer2);



        Address address1 = new Address();
        address1.setAid(1);
        address1.setNo("50");
        address1.setRoad("gall road");
        address1.setCity("beruwala");



        Address address2 = new Address();
        address2.setAid(2);
        address2.setNo("60");
        address2.setRoad("kandy road");
        address2.setCity("peradeniya");



        List<Address> addresses = new ArrayList<>();
        addresses.add(address1);
        addresses.add(address2);



        customer1.setAddresses(addresses);
        customer2.setAddresses(addresses);



        address1.setCustomer(customers);
        address2.setCustomer(customers);




        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();
        session.save(address1);
        session.save(address2);
        session.save(customer1);
        session.save(customer2);



        transaction.commit();
        session.close();
        }
    }
