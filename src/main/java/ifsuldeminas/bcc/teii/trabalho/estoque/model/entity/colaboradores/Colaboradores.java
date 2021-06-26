/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifsuldeminas.bcc.teii.trabalho.estoque.model.entity.colaboradores;

/**
 *
 * @author matheus
 */
public class Colaboradores {
    private int id;
    private String nome;
    private String telefone;
    private String endereco;

    public Colaboradores( String nome, String telefone, String endereco) {
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    public void EditarColaboradores(int id) {
       //getId(id) 
    }
    
     public void DeletarColaboradores(int id) {
        //getId(id)     
    }
    
    public void ListarColaboradores(){
        //codigo select * produtos
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

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    
}
