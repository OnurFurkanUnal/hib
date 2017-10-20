/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.hibernate.service;

import com.mycompany.hibernate.DbOlustur;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Master
 */
public class DbOlusturService {

    public DbOlusturService(int a,Class cls) {
    }

    public DbOlusturService() {
    }
    
    

    public DbOlustur save(DbOlustur db) {
        Session session= NewHibernateUtil.getSessionFactory().openSession();
         Transaction trans = session.beginTransaction();
        session.save(db);
        trans.commit();
        session.close();
         return db;
    }

    public DbOlustur update(DbOlustur db) {
          Session session= NewHibernateUtil.getSessionFactory().openSession();
         Transaction trans = session.beginTransaction();
        session.update(db);
        trans.commit();
        session.close();
         return db;
        
    }

    public DbOlustur delete(DbOlustur db) {
          Session session= NewHibernateUtil.getSessionFactory().openSession();
        Transaction trans = session.beginTransaction();
        session.delete(db);
        trans.commit();
        session.close();
         return db;
    }

    public List<DbOlustur> getAll(Class cls) {
         Session session= NewHibernateUtil.getSessionFactory().openSession();
        Criteria criteria= session.createCriteria(cls);
         return criteria.list();
    }

    public List<DbOlustur> getById(int id,Class cls) {
        Session session= NewHibernateUtil.getSessionFactory().openSession();
        Criteria criteria= session.createCriteria(cls);
        criteria.add(Restrictions.eq( "id", id));
        return criteria.list();
    }
}
