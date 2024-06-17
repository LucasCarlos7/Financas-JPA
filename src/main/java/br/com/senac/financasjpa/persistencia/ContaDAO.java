package br.com.senac.financasjpa.persistencia;

import jakarta.persistence.EntityManager;

public class ContaDAO {

    public void cadastrar(Conta c) {
        EntityManager em = JPAUltil.getEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(c);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw e;
        } finally {
            JPAUtil.closeEntityManager();
        }
    }
}
