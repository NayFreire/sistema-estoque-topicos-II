package ifsuldeminas.bcc.teii.trabalho.estoque.model.entity.comercial;

import ifsuldeminas.bcc.teii.trabalho.estoque.model.entity.colaboradores.Colaboradores;
import ifsuldeminas.bcc.teii.trabalho.estoque.model.entity.colaboradores.Fornecedor;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import java.util.ArrayList;
import java.util.Date;
import java.util.Set;

@Entity
@DiscriminatorValue(value = "compra")
public class Compra extends Transacao{
    @OneToOne
    private Fornecedor Fornecedor;

    public Compra(Date data, double total, Set<Produto> Produtos, ifsuldeminas.bcc.teii.trabalho.estoque.model.entity.colaboradores.Fornecedor fornecedor) {
        super(data, total, Produtos);
        Fornecedor = fornecedor;
    }

    public Compra(ifsuldeminas.bcc.teii.trabalho.estoque.model.entity.colaboradores.Fornecedor fornecedor) {
        Fornecedor = fornecedor;
    }

    public Compra() {

    }

    public Fornecedor getFornecedor(){return Fornecedor;}
    public void setFornecedor(Fornecedor Fornecedor){this.Fornecedor=Fornecedor;}
}
