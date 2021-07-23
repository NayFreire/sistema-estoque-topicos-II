package ifsuldeminas.bcc.teii.trabalho.estoque.controller.comercial;

import ifsuldeminas.bcc.teii.trabalho.estoque.model.entity.comercial.Produto;
import ifsuldeminas.bcc.teii.trabalho.estoque.model.entity.comercial.Venda;
import ifsuldeminas.bcc.teii.trabalho.estoque.model.repositories.ProdutoRepository;
import ifsuldeminas.bcc.teii.trabalho.estoque.model.repositories.VendaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@RequestMapping("/vendas")
@RestController
public class VendaController {
    @Autowired
    private VendaRepository vendaRepository;
    private ProdutoRepository produtoRepository;

    public VendaController(VendaRepository vendaRepository, ProdutoRepository produtoRepository) {
        this.vendaRepository = vendaRepository;
        this.produtoRepository = produtoRepository;
    }

    @GetMapping
    public List<Venda> ListarVendas(){
        return vendaRepository.findAll();
    }

    @GetMapping("/{id}")
    public Venda MostrarVenda(@PathVariable int id){
        return vendaRepository.getById(id);
    }

    @PostMapping("/{idProduto}")
    public Venda AdicionarVenda(@RequestBody Venda venda, @PathVariable int idProduto){
        Optional<Produto> getProduto = produtoRepository.findById(idProduto);
        Produto produto = getProduto.get();
        Set<Produto> produtos = new LinkedHashSet<>();
        produtos.add(produto);
        venda.setProdutos(produtos);

        return vendaRepository.save(venda);
    }

    @PutMapping("/{id}")
    public Venda AtualizarVenda(@PathVariable int id, @RequestBody Venda venda){
        Venda aux = vendaRepository.getById(id);
        aux.setData(venda.getData());
        aux.setProdutos(venda.getProdutos());
        aux.setTotal(venda.getTotal());
        return vendaRepository.save(aux);
    }

    @DeleteMapping("/{id}")
    public void DeletarVenda(@PathVariable int id){
        vendaRepository.deleteById(id);
    }
}
