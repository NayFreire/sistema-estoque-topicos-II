/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifsuldeminas.bcc.teii.trabalho.estoque.model.entity.comercial;

/**
 *
 * @author matheus
 */

public class Produto {
    
    private int id;
    private String nome;
    private int quantidade;
    private String especificacao;

    public Produto(String nome, int quantidade, String especificacao) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.especificacao = especificacao;
    }

    public void EditarProduto(int id) {
        //getId(id)
    }
    
    public void DeletarProduto(int id) {
        //getId(id)     
    }
    
    public void ListarProdutos(){
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

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getEspecificacao() {
        return especificacao;
    }

    public void setEspecificacao(String especificacao) {
        this.especificacao = especificacao;
    }
    
    
    
}
