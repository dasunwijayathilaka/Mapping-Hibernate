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


        Customer customer = new Customer();
        customer.setCid(4);
        customer.setName("brendon");



        List<Address> addressList = new ArrayList<Address>();
        Address a1 = new Address(4,"101","gall road","kalaniya",customer);
        Address a2 = new Address(5,"101","kandy road","alawwa",customer);
        addressList.add(a1);
        addressList.add(a2);
        customer.setAddresses(addressList);



        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();
        session.save(customer);
        session.save(a1);
        session.save(a2);



        transaction.commit();
        session.close();
        }
    }
