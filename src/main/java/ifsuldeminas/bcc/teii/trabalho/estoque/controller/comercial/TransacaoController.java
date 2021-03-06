package ifsuldeminas.bcc.teii.trabalho.estoque.controller.comercial;

import ifsuldeminas.bcc.teii.trabalho.estoque.model.entity.comercial.Produto;
import ifsuldeminas.bcc.teii.trabalho.estoque.model.entity.comercial.Transacao;
import ifsuldeminas.bcc.teii.trabalho.estoque.model.repositories.ProdutoRepository;
import ifsuldeminas.bcc.teii.trabalho.estoque.model.repositories.TransacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.LinkedHashSet;
import java.util.List; 
import java.util.Optional;
import java.util.Set;

@RequestMapping("/transacoes")
@RestController
public class TransacaoController {
    @Autowired
    private TransacaoRepository transacaoRepository;
    private ProdutoRepository produtoRepository;

    public TransacaoController(TransacaoRepository transacaoRepository, ProdutoRepository produtoRepository){
        this.transacaoRepository = transacaoRepository;
        this.produtoRepository = produtoRepository;
    }

    @GetMapping
    public List<Transacao> ListarTransacoes(){
        return transacaoRepository.findAll();
    }

    @GetMapping("/{id}")
    public Transacao MostrarTransacao(@PathVariable int id){
        return transacaoRepository.getById(id);
    }

    @PostMapping("/{idProduto}")
    public Transacao AdicionarTransacao(@RequestBody Transacao transacao, @PathVariable int idProduto){
        Optional<Produto> getProduto = produtoRepository.findById(idProduto);
        Produto produto = getProduto.get();
        Set<Produto> produtos = new LinkedHashSet<>();
        produtos.add(produto);
        transacao.setProdutos(produtos);

        return transacaoRepository.save(transacao);
    }

    @PutMapping("/{id}")
    public Transacao AtualizarTransacao(@PathVariable int id, @RequestBody Transacao transacao){
        Transacao aux = transacaoRepository.getById(id);
        aux.setData(transacao.getData());
        aux.setProdutos(transacao.getProdutos());
        aux.setTotal(transacao.getTotal());
        return transacaoRepository.save(aux);
    }

    @DeleteMapping("/{id}")
    public void DeletarTransacao(@PathVariable int id){
        transacaoRepository.deleteById(id);
    }
}
