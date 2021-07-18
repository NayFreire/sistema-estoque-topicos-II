package ifsuldeminas.bcc.teii.trabalho.estoque.model.entity.comercial;

import ifsuldeminas.bcc.teii.trabalho.estoque.model.entity.colaboradores.Cliente;
import ifsuldeminas.bcc.teii.trabalho.estoque.model.entity.colaboradores.Colaboradores;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import java.util.ArrayList;
import java.util.Date;
import java.util.Set;

@Entity
@DiscriminatorValue(value = "venda")
public class Venda extends Transacao{
    @OneToOne
    private Cliente Cliente;

    public Venda(Date data, double total, Set<Produto> Produtos, ifsuldeminas.bcc.teii.trabalho.estoque.model.entity.colaboradores.Cliente cliente) {
        super(data, total, Produtos);
        Cliente = cliente;
    }

    public Venda(ifsuldeminas.bcc.teii.trabalho.estoque.model.entity.colaboradores.Cliente cliente) {
        Cliente = cliente;
    }

    public Venda() {

    }

    public Cliente getCliente() {return Cliente;}
    public void setCliente(Cliente Cliente){this.Cliente=Cliente;}
}
