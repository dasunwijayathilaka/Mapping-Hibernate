package lk.ijse;

import lk.ijse.config.FactoryConfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;

import java.util.List;



public class Main {
    public static void main(String[] args) {


        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

                          //select


        NativeQuery query = session.createNativeQuery("select * from customer");
        List<Object[]> customers = query.list();
        for (Object[] customer: customers){
            System.out.println(customer[0]+":"+customer[1]);
        }



                          //select


        NativeQuery query6 = session.createNativeQuery("select * from customer");
        /*query.addEntity(Customer.class);
        List<Customer> customers = query.list();
        for (Customer customer: customers){
            System.out.println(customer);
        }*/



                            //insert


        /*NativeQuery query1 = session.createNativeQuery("insert into customer values(?1,?2)");
        query1.setParameter(1,2);
        query1.setParameter(2,"gotabayya");
        query1.executeUpdate();*/



                             //update,


       /* NativeQuery query2 = session.createNativeQuery("update customer set name =?1 where cid =?2");
        query2.setParameter(1,"Mahinda");
        query2.setParameter(2,2);
        query2.executeUpdate();*/

                            // delete


        /*NativeQuery query3 = session.createNativeQuery("delete from customer where cid=?1");
        query3.setParameter(1,2);
        query3.executeUpdate();
*/
                             //searchByName


        /*NativeQuery query4 = session.createNativeQuery("select * from customer where name=?1");
        query4.addEntity(Customer.class);
        query4.setParameter(1,"Anura");
        Customer customer = (Customer) query4.uniqueResult();
        System.out.println(customer);*/




        transaction.commit();
        session.close();
    }
}
