package ifsuldeminas.bcc.teii.trabalho.estoque.model.entity.comercial;

import ifsuldeminas.bcc.teii.trabalho.estoque.model.entity.colaboradores.Colaboradores;
import ifsuldeminas.bcc.teii.trabalho.estoque.model.entity.comercial.Produto;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "tipo")
public class Transacao {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Temporal(TemporalType.DATE)
    private Date data;
    private double total;
    @OneToMany
    private Set<Produto> Produtos;

    public Transacao (Date data, double total, Set<Produto> Produtos){
        this.data = data;
        this.total = total;
        this.Produtos = new LinkedHashSet<Produto>();
    }

    public Transacao (){

    }

    //Get e Set
    public int getId(){return id;}
    public void setId(int id){this.id=id;}

    public Date getData(){return data;}
    public void setData(Date data){this.data=data;}

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Set<Produto> getProdutos() {
        return Produtos;
    }

    public void addProdutoSet(Produto produto){
        Produtos.add(produto);
    }

    public void setProdutos(Set<Produto> produtos) {
        Produtos = produtos;
    }
}

