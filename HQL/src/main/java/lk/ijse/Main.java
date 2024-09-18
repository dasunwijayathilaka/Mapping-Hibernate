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

       /* Query query = session.createQuery("from Customer");
        //insert, update, delete


        List<Customer> customers = query.list();
        for (Customer customer: customers){
            System.out.println(customer);
        }*/


                             //unique one data from customer


       /* Query query1 = session.createQuery("from Customer where cid = :id");
        query1.setParameter("id", 4);*/

        /*Query query1 = session.createQuery("from Customer where cid= ?1");
        query1.setParameter(1, 4);
        Customer customer = (Customer) query1.uniqueResult();
        System.out.println(customer);
*/

                          //load only one column


        /*Query query2 = session.createQuery("select name,cid from Customer");
        List<Object[]> collection = query2.getResultList();
        for (Object[] c : collection){
            System.out.println(c[0]);
            System.out.println(c[1]);
        }*/

                             //Insert

     /*
        Query query1 = session.createQuery("insert into Customer(cid,name) values(?1,?2)");
        query1.setParameter(1,6);
        query1.setParameter(2,"ben");
        query1.executeUpdate();

      */


                             //Update


        /*Query query2 = session.createQuery("update Customer set name=?1 where cid=?2");
        query2.setParameter(1,"wiliamson");
        query2.setParameter(2,4);
        query2.executeUpdate();*/



                           //delete


        /*
        Query query = session.createQuery("delete from Customer where cid=?1");
        query.setParameter(1,5);
        query.executeUpdate();*/



        //
        /*Query query3 =session.createQuery("select cid,name from Customer where cid=?1");
        query3.setParameter(1, 1);
        Object[] customer = (Object[]) query3.uniqueResult();
        for(Object o : customer){
            System.out.println(o);
        }
*/



        //
       /* Query query4 = session.createQuery("select cid, name from Customer");
        List<Object[]>customers = query4.list();
        for (Object[] objects : customers) {
            System.out.println(Arrays.toString(objects));
        }*/


                                 //join column


       Query query=session.createQuery("select a.aid,a.road,c.name from Address a inner join Customer c on a.customer c");
        List<Object[]>customers = query.list();
        for (Object[] objects : customers) {
            System.out.println(Arrays.toString(objects));
        }


        transaction.commit();
        session.close();
    }
}
