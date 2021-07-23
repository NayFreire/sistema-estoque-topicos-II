package ifsuldeminas.bcc.teii.trabalho.estoque.controller.colaboradores;

import ifsuldeminas.bcc.teii.trabalho.estoque.model.entity.colaboradores.Cliente;
import ifsuldeminas.bcc.teii.trabalho.estoque.model.entity.colaboradores.Colaboradores;
import ifsuldeminas.bcc.teii.trabalho.estoque.model.entity.colaboradores.Fornecedor;
import ifsuldeminas.bcc.teii.trabalho.estoque.model.entity.comercial.Produto;
import ifsuldeminas.bcc.teii.trabalho.estoque.model.repositories.ClienteRepository;
import ifsuldeminas.bcc.teii.trabalho.estoque.model.repositories.FornecedorRepository;
import ifsuldeminas.bcc.teii.trabalho.estoque.model.repositories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@RequestMapping("/fornecedores")
@RestController
public class FornecedorController {
    @Autowired
    private FornecedorRepository fornecedorRepository;
    private ProdutoRepository produtoRepository;

    public FornecedorController(FornecedorRepository fornecedorRepository, ProdutoRepository produtoRepository) {
        this.fornecedorRepository = fornecedorRepository;
        this.produtoRepository = produtoRepository;
    }

    @GetMapping
    public List<Fornecedor> ListarFornecedores() {
        return fornecedorRepository.findAll();
    }

    @GetMapping("/{id}")
    public Colaboradores ListarFornecedor(@PathVariable int id) {
        return fornecedorRepository.getById(id);
    }

    @PostMapping
    public Colaboradores AdicionarFornecedor(@RequestBody Fornecedor fornecedor) {
        return fornecedorRepository.save(fornecedor);
    }

    @PutMapping("/{id}")
    public Colaboradores AtualizarFornecedor(@PathVariable int id, @RequestBody Fornecedor fornecedor) {
        Fornecedor aux = fornecedorRepository.getById(id);
        aux.setNome(fornecedor.getNome());
        aux.setEndereco(fornecedor.getEndereco());
        aux.setTelefone(fornecedor.getTelefone());
        aux.setCpf(fornecedor.getCpf());
        //tipo não atualizavel
        return fornecedorRepository.save(aux);
    }

    @PostMapping("/{id}/produto/{idProduto}")
    public Colaboradores AtualizarListaProdutos(@PathVariable int id, @PathVariable int idProduto, @RequestBody Fornecedor fornecedor) {
        Optional<Fornecedor> aux = fornecedorRepository.findById(id);
        Fornecedor fornededor = aux.get();

        Optional<Produto> prod = produtoRepository.findById(idProduto);
        Produto novoProduto = prod.get();

        Set<Produto> produtos = new LinkedHashSet<>();
        produtos.add(novoProduto);

        fornededor.setNome(fornecedor.getNome());
        fornededor.setEndereco(fornecedor.getEndereco());
        fornededor.setTelefone(fornecedor.getTelefone());
        fornededor.setCpf(fornecedor.getCpf());

        //aux.addProduto(prod);
        fornededor.setProdutos(produtos);

        return fornecedorRepository.save(fornededor);
    }

    @DeleteMapping("/{id}")
    public void DeletarFornecedor(@PathVariable int id) {
        fornecedorRepository.deleteById(id);
    }
}
