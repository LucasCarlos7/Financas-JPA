package br.com.senac.financasjpa.persistencia;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import java.util.List;

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

    public List<Receita> listar() {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            Query consulta = em.createQuery("SELECT r FROM Receita r");
            List<Receita> receitas = consulta.getResultList();
            return receitas;
        } finally {
            JPAUtil.closeEntityManager();
        }
    }
}
