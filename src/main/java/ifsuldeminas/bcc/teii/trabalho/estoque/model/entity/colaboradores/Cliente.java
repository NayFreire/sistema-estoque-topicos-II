/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifsuldeminas.bcc.teii.trabalho.estoque.model.entity.colaboradores;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 *
 * @author matheus
 */

@Entity
@DiscriminatorValue(value = "cliente")
public class Cliente extends Colaboradores{
    private String cnpj;

    public Cliente(String cnpj, String nome, String telefone, String endereco) {
        super(nome, telefone, endereco);
        this.cnpj = cnpj;
    }

    public Cliente() {

    }

    public void EditarColaboradores(String nome, String telefone, String endereco) {
        
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    
}
