package br.com.senac.financasjpa.persistencia;

import jakarta.persistence.EntityManager;

public class DespesaDAO {

    public void cadastrar(Despesa d) {
        EntityManager em = JPAUltil.getEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(d);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw e;
        } finally {
            JPAUltil.closeEntityManager();
        }
    }
}