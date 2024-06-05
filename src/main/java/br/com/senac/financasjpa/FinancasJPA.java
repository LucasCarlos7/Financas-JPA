package br.com.senac.financasjpa;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import java.time.LocalDate;

public class FinancasJPA {

    public static void main(String[] args) {
        
        EntityManagerFactory fabricaEntidade = Persistence.createEntityManagerFactory("Financas-PU");
        EntityManager manager = fabricaEntidade.createEntityManager();
        
        Despesa gasto = new Despesa();
        gasto.setDescricao("Primeira despesa");
        gasto.setValor(10.50);
        gasto.setData(LocalDate.of(2024, 6, 4));
        
        manager.getTransaction().begin();
        manager.persist(gasto);
        manager.getTransaction().commit();
        
        manager.close();
        fabricaEntidade.close();
    }
}
