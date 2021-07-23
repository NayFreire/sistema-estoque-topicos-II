package ifsuldeminas.bcc.teii.trabalho.estoque.model.entity.comercial;

import ifsuldeminas.bcc.teii.trabalho.estoque.model.entity.Funcionario;
import ifsuldeminas.bcc.teii.trabalho.estoque.model.entity.colaboradores.Cliente;
import ifsuldeminas.bcc.teii.trabalho.estoque.model.entity.colaboradores.Colaboradores;

import javax.persistence.*;
import java.util.Date;

@Entity
public class NotaFiscal {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Temporal(TemporalType.DATE)
    private Date data;
    @OneToOne
    private Colaboradores cliente;
    @OneToOne
    private Funcionario funcionario;
    @OneToOne
    private Transacao transacao;
    private double total;

    public NotaFiscal(Date data, Colaboradores cliente, Funcionario funcionario, Transacao transacao, double total) {
        this.data = data;
        this.cliente = cliente;
        this.funcionario = funcionario;
        this.transacao = transacao;
        this.total = total;
    }

    public NotaFiscal() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Colaboradores getCliente() {
        return cliente;
    }

    public void setCliente(Colaboradores cliente) {
        this.cliente = cliente;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Transacao getTransacao() {
        return transacao;
    }

    public void setTransacao(Transacao transacao) {
        this.transacao = transacao;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
