package ifsuldeminas.bcc.teii.trabalho.estoque.controller.comercial;

import ifsuldeminas.bcc.teii.trabalho.estoque.model.entity.comercial.Produto;
import ifsuldeminas.bcc.teii.trabalho.estoque.model.repositories.ProdutoRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/produtos")
@RestController
public class ProdutoController {
    private ProdutoRepository produtoRepository;

    public ProdutoController(ProdutoRepository produtoRepository){
        this.produtoRepository = produtoRepository;
    }


    public ProdutoController(){

    }

    @GetMapping
    public List<Produto> ListarProdutos(){
        return produtoRepository.findAll();
    }

    @GetMapping("/{id}")
    public Produto MostrarProduto(@PathVariable int id){
        return produtoRepository.getById(id);
    }

    @PostMapping
    public Produto AdicionarProduto(@RequestBody Produto produto){
        return produtoRepository.save(produto);
    }

    @PutMapping("/{id}")
    public Produto AtualizarProduto(@PathVariable int id, @RequestBody Produto produto){
        Produto aux = produtoRepository.getById(id);
        aux.setNome(produto.getNome());
        aux.setEspecificacao(produto.getEspecificacao());
        aux.setQuantidade(produto.getQuantidade());
        return produtoRepository.save(aux);
    }

    @DeleteMapping("/{id}")
    public void DeletarProduto(@PathVariable int id){
        produtoRepository.deleteById(id);
    }
}
