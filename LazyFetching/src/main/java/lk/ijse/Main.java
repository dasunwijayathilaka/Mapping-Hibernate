package lk.ijse;

import lk.ijse.config.FactoryConfiguration;
import lk.ijse.entity.Customer;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.Arrays;


public class Main {
    public static void main(String[] args) {

        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        Customer customer = session.get(Customer.class,4);

        System.out.println(customer.getCid());
        System.out.println(Arrays.toString(customer.getAddresses().toArray()));

         /*List<Address> addresses = customer.getAddresses();
        for (Address address : addresses) {
            System.out.println(address+", ");
        }*/


        transaction.commit();
        session.close();
    }
}
