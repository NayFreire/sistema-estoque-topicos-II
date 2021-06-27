package ifsuldeminas.bcc.teii.trabalho.estoque.model.entity.comercial;

import ifsuldeminas.bcc.teii.trabalho.estoque.model.entity.colaboradores.Colaboradores;
import ifsuldeminas.bcc.teii.trabalho.estoque.model.entity.colaboradores.Fornecedor;

import javax.persistence.Entity;
import java.util.ArrayList;

@Entity
public class Compra extends Transacao{
    private Fornecedor Fornecedor;

    public Compra(String data, double total, ArrayList<Produto> Produtos, Fornecedor fornecedor) {
        super(data, total, Produtos);
        Fornecedor = fornecedor;
    }

    public Compra() {
        super();
    }

    public Fornecedor getFornecedor(){return Fornecedor;}
    public void setFornecedor(Fornecedor Fornecedor){this.Fornecedor=Fornecedor;}
}
