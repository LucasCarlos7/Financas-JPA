package br.com.senac.financasjpa.persistencia;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import java.util.ArrayList;
import java.util.List;

public class ContaDAO {

    public void cadastrar(Conta c) {
        EntityManager em = JPAUtil.getEntityManager();
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

    public List<Conta> listar() {
        EntityManager em = JPAUtil.getEntityManager();
        //resultado será devolvido nesta lista
        List<Conta> contas = new ArrayList<Conta>();
        try {
            //atenção: import jakarta.persistence.Query;
            Query consulta = em.createQuery("SELECT c FROM Conta c");
            contas = consulta.getResultList();
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw e;
        } finally {
            JPAUtil.closeEntityManager();
        }
        return contas;
    }
}
