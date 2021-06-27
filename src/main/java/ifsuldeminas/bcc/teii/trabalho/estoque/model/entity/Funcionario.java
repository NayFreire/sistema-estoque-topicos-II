package ifsuldeminas.bcc.teii.trabalho.estoque.model.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Funcionario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String nome;
    private String nomeUsuario;
    private String senha;
    private boolean tipo;

    public Funcionario(String nome, String nomeUsuario, String senha, boolean tipo) {
        this.nome = nome;
        this.nomeUsuario = nomeUsuario;
        this.senha = senha;
        this.tipo = tipo;
    }

    public Funcionario() {

    }

    public void AddFuncionario(){

    }

    public void Login(String nomeUsuario, String senha){
        /*TODO: Criar função de login*/
    }

    public void Logout(){
        /*TODO: Criar função de logout*/
    }
}
