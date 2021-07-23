package ifsuldeminas.bcc.teii.trabalho.estoque.controller.comercial;

import ifsuldeminas.bcc.teii.trabalho.estoque.model.entity.comercial.Compra;
import ifsuldeminas.bcc.teii.trabalho.estoque.model.entity.comercial.Produto;
import ifsuldeminas.bcc.teii.trabalho.estoque.model.repositories.CompraRepository;
import ifsuldeminas.bcc.teii.trabalho.estoque.model.repositories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@RequestMapping("/compras")
@RestController
public class CompraController {
    @Autowired
    private CompraRepository compraRepository;
    private ProdutoRepository produtoRepository;

    public CompraController(CompraRepository compraRepository, ProdutoRepository produtoRepository) {
        this.compraRepository = compraRepository;
        this.produtoRepository = produtoRepository;
    }

    @GetMapping
    public List<Compra> ListarCompras(){
        return compraRepository.findAll();
    }

    @GetMapping("/{id}")
    public Compra MostrarCompra(@PathVariable int id){
        return compraRepository.getById(id);
    }

    @PostMapping("/{idProduto}")
    public Compra AdicionarCompra(@RequestBody Compra compra, @PathVariable int idProduto){
        Optional<Produto> getProduto = produtoRepository.findById(idProduto);
        Produto produto = getProduto.get();
        Set<Produto> produtos = new LinkedHashSet<>();
        produtos.add(produto);
        compra.setProdutos(produtos);

        return compraRepository.save(compra);
    }

    @PutMapping("/{id}")
    public Compra AtualizarCompra(@PathVariable int id, @RequestBody Compra compra){
        Compra aux = compraRepository.getById(id);
        aux.setData(compra.getData());
        aux.setProdutos(compra.getProdutos());
        aux.setTotal(compra.getTotal());
        return compraRepository.save(aux);
    }

    @DeleteMapping("/{id}")
    public void DeletarCompra(@PathVariable int id){
        compraRepository.deleteById(id);
    }
}
