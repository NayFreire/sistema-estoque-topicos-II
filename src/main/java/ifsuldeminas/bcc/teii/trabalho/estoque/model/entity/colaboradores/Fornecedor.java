/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifsuldeminas.bcc.teii.trabalho.estoque.model.entity.colaboradores;

import ifsuldeminas.bcc.teii.trabalho.estoque.model.entity.comercial.Produto;
import java.util.ArrayList;

/**
 *
 * @author matheus
 */
public class Fornecedor extends Colaboradores{
    private String cpf;
    private ArrayList<Produto> produtos;

    public Fornecedor(String cpf, ArrayList<Produto> produtos, String nome, String telefone, String endereco) {
        super(nome, telefone, endereco);
        this.cpf = cpf;
        this.produtos = produtos;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(ArrayList<Produto> produtos) {
        this.produtos = produtos;
    }
    
    
    
}
