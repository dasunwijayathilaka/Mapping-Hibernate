package lk.ijse;

import lk.ijse.config.FactoryConfiguration;
import lk.ijse.entity.Address;
import lk.ijse.entity.Customer;
import org.hibernate.Session;
import org.hibernate.Transaction;


public class Main {
    public static void main(String[] args) {
//        Customer customer = new Customer();
//        customer.setCid(1);
//        customer.setName("brendon");
//
//        List<Address> addressList = new ArrayList<Address>();
//        Address a1 = new Address(4,"100","gall road","kaluthara",customer);
//        Address a2 = new Address(5,"100","gall road","kalaniya",customer);
//        addressList.add(a1);
//        addressList.add(a2);
//        customer.setAddresses(addressList);


        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();
        Customer customer = session.get(Customer.class,4);
        System.out.println(customer.getCid());



        Address address = session.get(Address.class,4);
        System.out.println(address);

        transaction.commit();
        session.close();
    }
}
