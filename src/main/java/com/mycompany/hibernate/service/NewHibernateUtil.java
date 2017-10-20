/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.hibernate.service;


import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hibernate Utility class with a convenient method to get Session Factory
 * object.
 *
 * @author Master
 */
public class NewHibernateUtil {
private static final SessionFactory sessionFactory = buildSessionFactory();
    private static SessionFactory  buildSessionFactory() {
    return new Configuration().configure().buildSessionFactory();
 }
 static SessionFactory getSessionFactory() {
        return sessionFactory;
    }

}
