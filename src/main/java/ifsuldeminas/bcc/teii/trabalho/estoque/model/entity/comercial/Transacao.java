package ifsuldeminas.bcc.teii.trabalho.estoque.model.entity.comercial;

import ifsuldeminas.bcc.teii.trabalho.estoque.model.entity.colaboradores.Colaboradores;
import ifsuldeminas.bcc.teii.trabalho.estoque.model.entity.comercial.Produto;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "tipo")
public class Transacao {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private Date data;
    private double total;
    //@ManyToOne
    //private ArrayList<Produto> Produtos;

    public Transacao (Date data, double total, ArrayList<Produto> Produtos){
        this.data = data;
        this.total = total;
        //this.Produtos = Produtos;
    }

    public Transacao (){

    }

    /*
    public void AddTransacao(){ }
    public void ListarTransacao(){ }
    public void DeletarTransacao (){ }
    */

    //Get e Set
    public int getId(){return id;}
    public void setId(int id){this.id=id;}

    public Date getData(){return data;}
    public void setData(Date data){this.data=data;}

    public double getTotal(){return total;}
    public void setTotal(){this.total=total;}

    /*public ArrayList<Produto> getProdutos(){return Produtos;}
    public void setProdutos(ArrayList<Produto> produtos){this.Produtos = produtos;}*/

}

