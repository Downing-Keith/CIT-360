
package com.keith;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import org.hibernate.Session;

/**
 *
 * @author Keith Downing
 */

@ManagedBean
@SessionScoped
public class Data {
    
    private Members m;
    private HibernateUtil helper;
    private Session session;
    
    public void addMember() {
        m = new Members("John");
        session = helper.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(m);
        session.getTransaction().commit();
        session.close();
    }
}
