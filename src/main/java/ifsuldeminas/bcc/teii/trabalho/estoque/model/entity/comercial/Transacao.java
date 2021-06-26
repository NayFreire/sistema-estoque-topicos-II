package ifsuldeminas.bcc.teii.trabalho.estoque.model.entity.comercial;

import ifsuldeminas.bcc.teii.trabalho.estoque.model.entity.colaboradores.Colaboradores;
import ifsuldeminas.bcc.teii.trabalho.estoque.model.entity.comercial.Produto;

import java.util.ArrayList;

public class Transacao {
    private int id;
    private String data;
    private double total;
    private ArrayList<Produto> Produtos;
    private Colaboradores Colaboradores;

    public Transacao (String data, double total, ArrayList<Produto> Produtos, Colaboradores Colaboradores){
        this.data = data;
        this.total = total;
        this.Produtos = Produtos;
        this.Colaboradores = Colaboradores;
    }

    /*
    public void AddTransacao(){ }
    public void ListarTransacao(){ }
    public void DeletarTransacao (){ }
    */

    //Get e Set
    public int getId(){return id;}
    public void setId(int id){this.id=id;}

    public String getData(){return data;}
    public void setData(String data){this.data=data;}

    public double getTotal(){return total;}
    public void setTotal(){this.total=total;}

    public ArrayList<Produto> getProdutos(){return Produtos;}
    public void setProdutos(ArrayList<Produto> produtos){this.Produtos = produtos;}

    public Colaboradores getColaboradores(){return Colaboradores;}
    public void setColaboradores(Colaboradores colaboradores){this.Colaboradores = colaboradores;}
}

