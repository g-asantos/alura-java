package jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestaRelacionamentoClienteConta {
    
    public static void main(String[] args) {
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("contas");

        EntityManager em = emf.createEntityManager();
        
        

        Conta conta = new Conta();
        conta.setId(1L);

        Cliente cliente = new Cliente();
        cliente.setNome("Leonardo");
        cliente.setEndereco("Rua do ouvidor 50");
        cliente.setProfissao("Professor");
        cliente.setConta(conta);

        
        em.getTransaction().begin();


        em.persist(cliente);

        em.getTransaction().commit();

        em.close();

    }
}
