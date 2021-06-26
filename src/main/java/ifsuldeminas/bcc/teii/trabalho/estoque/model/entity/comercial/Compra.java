package ifsuldeminas.bcc.teii.trabalho.estoque.model.entity.comercial;

import ifsuldeminas.bcc.teii.trabalho.estoque.model.entity.colaboradores.Colaboradores;
import ifsuldeminas.bcc.teii.trabalho.estoque.model.entity.colaboradores.Fornecedor;

import java.util.ArrayList;

public class Compra extends Transacao{
    private Fornecedor Fornecedor;

    public Compra(String data, double total, ArrayList<Produto> Produtos, Colaboradores Colaboradores, Fornecedor fornecedor) {
        super(data, total, Produtos, Colaboradores);
        Fornecedor = fornecedor;
    }

    public Fornecedor getFornecedor(){return Fornecedor;}
    public void setFornecedor(Fornecedor Fornecedor){this.Fornecedor=Fornecedor;}
}
