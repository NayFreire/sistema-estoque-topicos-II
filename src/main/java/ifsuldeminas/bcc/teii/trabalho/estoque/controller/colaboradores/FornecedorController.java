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

import java.util.List;
import java.util.Optional;

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
        //tipo não atualizavel
        return fornecedorRepository.save(aux);
    }

    @DeleteMapping("/{id}")
    public void DeletarFornecedor(@PathVariable int id) {
        fornecedorRepository.deleteById(id);
    }
}
