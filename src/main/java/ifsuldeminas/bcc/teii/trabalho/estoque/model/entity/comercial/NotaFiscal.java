package ifsuldeminas.bcc.teii.trabalho.estoque.model.entity.comercial;

import ifsuldeminas.bcc.teii.trabalho.estoque.model.entity.Funcionario;
import ifsuldeminas.bcc.teii.trabalho.estoque.model.entity.colaboradores.Colaboradores;

import java.util.Date;

public class NotaFiscal {
    private int id;
    private Colaboradores Colaborador;
    private Date data;
    private Funcionario funcionario;
    private Transacao transacao;

    public NotaFiscal(Colaboradores colaborador, Date data, Funcionario funcionario, Transacao transacao) {
        Colaborador = colaborador;
        this.data = data;
        this.funcionario = funcionario;
        this.transacao = transacao;
    }

    public Colaboradores getColaborador() {
        return Colaborador;
    }

    public void setColaborador(Colaboradores colaborador) {
        Colaborador = colaborador;
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
