package ifsuldeminas.bcc.teii.trabalho.estoque.model.entity;

public class Funcionario {
    private int id;
    private String nome;
    private String nomeUsuario;
    private String senha;
    private boolean tipo;

    public Funcionario(int id, String nome, String nomeUsuario, String senha, boolean tipo) {
        this.id = id;
        this.nome = nome;
        this.nomeUsuario = nomeUsuario;
        this.senha = senha;
        this.tipo = tipo;
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
