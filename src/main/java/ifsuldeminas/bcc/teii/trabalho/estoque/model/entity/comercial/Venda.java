package ifsuldeminas.bcc.teii.trabalho.estoque.model.entity.comercial;

import ifsuldeminas.bcc.teii.trabalho.estoque.model.entity.colaboradores.Cliente;
import ifsuldeminas.bcc.teii.trabalho.estoque.model.entity.colaboradores.Colaboradores;

import java.util.ArrayList;

public class Venda extends Transacao{
    private Cliente Cliente;

    public Venda(String data, double total, ArrayList<Produto> Produtos, Colaboradores Colaboradores, Cliente cliente) {
        super(data, total, Produtos, Colaboradores);
        Cliente = cliente;
    }

    public Cliente getCliente() {return Cliente;}
    public void setCliente(Cliente Cliente){this.Cliente=Cliente;}
}
