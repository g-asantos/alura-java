package jpa;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Arrays;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class TestaRelacionamentoMovimentacaoCategoria {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("contas");

        EntityManager em = emf.createEntityManager();
        
    
        Categoria categoria = new Categoria("Viagem");

        Categoria categoria2 = new Categoria("Negocios");

        Conta conta = new Conta();
        conta.setId(1L);
        
        Movimentacao movimentacao = new Movimentacao();
        movimentacao.setDescricao("Viagem a SP");
        movimentacao.setTipoMovimentacao(TipoMovimentacao.SAIDA);
        movimentacao.setData(LocalDateTime.now());
        movimentacao.setValor(new BigDecimal(300.0));
        movimentacao.setCategoria(Arrays.asList(categoria, categoria2));
        movimentacao.setConta(conta);


        Movimentacao movimentacao2 = new Movimentacao();
        movimentacao2.setDescricao("Viagem a RJ");
        movimentacao2.setTipoMovimentacao(TipoMovimentacao.SAIDA);
        movimentacao2.setData(LocalDateTime.now());
        movimentacao2.setValor(new BigDecimal(400.0));
        movimentacao2.setCategoria(Arrays.asList(categoria, categoria2));
        movimentacao2.setConta(conta);

        em.getTransaction().begin();


        em.persist(categoria);
        em.persist(categoria2);

        em.persist(movimentacao);
        em.persist(movimentacao2);

        em.getTransaction().commit();
    }
}
