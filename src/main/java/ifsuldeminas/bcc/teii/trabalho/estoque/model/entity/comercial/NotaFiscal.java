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
    private Cliente cliente;
    @OneToOne
    private Funcionario funcionario;
    @OneToOne
    private Transacao transacao;

    public NotaFiscal(Date data, Cliente cliente, Funcionario funcionario, Transacao transacao) {
        this.data = data;
        this.cliente = cliente;
        this.funcionario = funcionario;
        this.transacao = transacao;
    }

    public NotaFiscal() {

    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public void EmitirNotaFiscal(Colaboradores colaborador, Funcionario funcionario /*, Transacao transacao*/){
        /*TODO: Criar a funõa de emissão da nota fiscal*/
    }
}
