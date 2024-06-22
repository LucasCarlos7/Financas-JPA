package br.com.senac.financasjpa;

import br.com.senac.financasjpa.persistencia.Conta;
import br.com.senac.financasjpa.persistencia.ContaDAO;
import br.com.senac.financasjpa.persistencia.Despesa;
import br.com.senac.financasjpa.persistencia.DespesaDAO;
import java.time.LocalDate;
import java.util.List;

public class FinancasJPA {
    
    public static void main(String[] args) {
        DespesaDAO despesaDao = new DespesaDAO();
////        List<Despesa> lista = despesaDao.listar(filtroDescricao, dataIni, dataFim);
////        for (Despesa d : lista) {
////            System.out.println(d.getId() + " - " + d.getDescricao());
////        }
//
        despesaDao.listar("", "", "");
        despesaDao.listar("mercado", "", "");
        despesaDao.listar("", "15/10/2022", "20/10/2022");
    }
}
