package br.com.senac.financasjpa;

import br.com.senac.financasjpa.persistencia.Conta;
import br.com.senac.financasjpa.persistencia.ContaDAO;
import br.com.senac.financasjpa.persistencia.Despesa;
import br.com.senac.financasjpa.persistencia.DespesaDAO;
import java.time.LocalDate;
import java.util.List;

public class FinancasJPA {

    public static void main(String[] args) {
        ContaDAO cDao = new ContaDAO();
        List<Conta> lista = cDao.listar();
        for (Conta c : lista) {
            System.out.println(c.getNome());
        }
    }
}
