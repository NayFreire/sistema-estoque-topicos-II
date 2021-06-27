package ifsuldeminas.bcc.teii.trabalho.estoque.model.entity.comercial;

import ifsuldeminas.bcc.teii.trabalho.estoque.model.entity.colaboradores.Cliente;
import ifsuldeminas.bcc.teii.trabalho.estoque.model.entity.colaboradores.Colaboradores;

import javax.persistence.Entity;
import java.util.ArrayList;

@Entity
public class Venda extends Transacao{
    private Cliente Cliente;

    public Venda(String data, double total, ArrayList<Produto> Produtos, Cliente cliente) {
        super(data, total, Produtos);
        Cliente = cliente;
    }

    public Cliente getCliente() {return Cliente;}
    public void setCliente(Cliente Cliente){this.Cliente=Cliente;}
}
