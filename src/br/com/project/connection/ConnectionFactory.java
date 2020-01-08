/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.project.connection;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Hallan
 */
public class ConnectionFactory {
    
    private EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("spehop");
    
    public EntityManager getConnection(){
        return entityManagerFactory.createEntityManager();
    }
    
    public void close(){
        entityManagerFactory.close();
    }
}
