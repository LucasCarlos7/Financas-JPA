package br.com.senac.financasjpa;

import br.com.senac.financasjpa.persistencia.Despesa;
import br.com.senac.financasjpa.persistencia.DespesaDAO;
import java.time.LocalDate;

public class FinancasJPA {

    public static void main(String[] args) {

        DespesaDAO despesaDao = new DespesaDAO();

        Despesa d = new Despesa();
        d.setDescricao("Compras de mercado");
        d.setValor(165.70);
        d.setData(LocalDate.of(2022, 11, 15));

        despesaDao.cadastrar(d);
    }
}
