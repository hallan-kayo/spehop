/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.project.model.dao;

import br.com.project.connection.ConnectionFactory;
import br.com.project.model.bean.Endereco;
import javax.persistence.EntityManager;

/**
 *
 * @author Hallan
 */
public class EnderecoDAO {
    
    public void save(Endereco endereco){
        EntityManager entityManager = new ConnectionFactory().getConnection();
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(endereco);
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            entityManager.getTransaction().rollback();
        }finally{
            entityManager.close();
        }
    }
}
