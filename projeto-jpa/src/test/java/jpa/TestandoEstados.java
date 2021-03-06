package jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class TestandoEstados {
    public static void main(String[] args) {

        //Transient
        Conta conta = new Conta();

        conta.setTitular("Almiro");
        conta.setAgencia(1234);
        conta.setNumero(12387128);


        EntityManagerFactory emf = Persistence.createEntityManagerFactory("contas");

        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        // Transient -> Managed
        em.persist(conta);


        // Managed -> Removed
        em.remove(conta);

        em.getTransaction().commit();
    }
}
