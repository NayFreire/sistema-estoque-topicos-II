package ifsuldeminas.bcc.teii.trabalho.estoque.model.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Funcionario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @NotNull
    private String nome;
    @NotNull
    private String nomeUsuario;
    @NotNull
    private String senha;
    @NotNull
    private boolean tipo;

    public Funcionario(String nome, String nomeUsuario, String senha, boolean tipo) {
        this.nome = nome;
        this.nomeUsuario = nomeUsuario;
        this.senha = senha;
        this.tipo = tipo;
    }

    public Funcionario() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean getTipo() {
        return tipo;
    }

    public void setTipo(boolean tipo) {
        this.tipo = tipo;
    }
}
