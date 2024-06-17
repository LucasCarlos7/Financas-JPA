package br.com.senac.financasjpa.persistencia;

import jakarta.persistence.EntityManager;

public class ReceitaDAO {

    public void cadastrar(Receita r) {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(r);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw e;
        } finally {
            JPAUtil.closeEntityManager();
        }
    }
}
