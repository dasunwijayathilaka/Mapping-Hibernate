package lk.ijse;

import lk.ijse.config.FactoryConfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.Arrays;
import java.util.List;


public class Main {
    public static void main(String[] args) {


        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();


                      //select


        /*Query query = session.createQuery("select c from Customer c");
        List<Customer> customers = query.list();
        for (Customer customer : customers) {
            System.out.println(customer);
        }*/



                //insert (insert query in jpql have to use save method)




                     //update,


        /*Query query = session.createQuery("update Customer c set c.name = :name where c.id = :id");
        query.setParameter("name", "rohith sharma");
        query.setParameter("id", 1);
        query.executeUpdate();*/



                    // delete


        /*Query query = session.createQuery("delete from Customer c where c.cid = :id");
        query.setParameter("id", 6);
        query.executeUpdate();
*/



                  //searchByName


         /*Query query1 = session.createQuery("select  c.name from Customer c");
        List<String> customers = query1.list();
        for (String customer : customers) {
            System.out.println(customer);
        }*/


                    //join


        Query query1 = session.createQuery("select c.id,c.name,a.city,a.road from Address a join a.customer c");
        List<Object[]> customers = query1.list();
        for (Object[] customer : customers) {
            System.out.println(Arrays.toString(customer));
        }



        transaction.commit();
        session.close();
    }
}
