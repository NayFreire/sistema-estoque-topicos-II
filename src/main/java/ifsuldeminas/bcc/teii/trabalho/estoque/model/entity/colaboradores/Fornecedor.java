/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifsuldeminas.bcc.teii.trabalho.estoque.model.entity.colaboradores;

import ifsuldeminas.bcc.teii.trabalho.estoque.model.entity.comercial.Produto;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 *
 * @author matheus
 */
@Entity
@DiscriminatorValue(value = "fornecedor")
public class Fornecedor extends Colaboradores{
    private String cpf;
    @OneToMany
    @JoinColumn(name = "fornecedorId")
    private Set<Produto> produtos;

    public Fornecedor(String cpf, Set<Produto> produtos, String nome, String telefone, String endereco) {
        super(nome, telefone, endereco);
        this.cpf = cpf;
        this.produtos = new LinkedHashSet<Produto>();
    }

    public Fornecedor() {

    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Set<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(Set<Produto> produtos) {
        this.produtos = produtos;
    }

    
    
}
