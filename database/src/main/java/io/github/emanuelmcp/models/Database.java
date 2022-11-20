package io.github.emanuelmcp.models;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

@Singleton
public class Database {
    @Inject Account data;
    public void write() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistencia");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();

        data.setUuid(1);
        data.setEmail("Lara");

        em.persist(data);

        tx.commit();
        em.close();
        emf.close();

    }

    public void read() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistencia");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        Account data = em.find(Account.class, 1);

        System.out.println("entity ="+ data);

        tx.commit();
        em.close();
        emf.close();
    }
}
