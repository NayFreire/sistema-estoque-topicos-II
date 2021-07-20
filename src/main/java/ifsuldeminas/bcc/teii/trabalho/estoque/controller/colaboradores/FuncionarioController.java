package ifsuldeminas.bcc.teii.trabalho.estoque.controller.colaboradores;

import ifsuldeminas.bcc.teii.trabalho.estoque.model.entity.Funcionario;
import ifsuldeminas.bcc.teii.trabalho.estoque.model.repositories.FuncionarioRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/funcionarios")
@RestController
public class FuncionarioController {
    private FuncionarioRepository funcionarioRepository;

    public FuncionarioController(FuncionarioRepository funcionarioRepository){
        this.funcionarioRepository = funcionarioRepository;
    }

    public FuncionarioController(){}

    @GetMapping
    public List<Funcionario> ListarFuncionarios(){
        return funcionarioRepository.findAll();
    }

    @GetMapping("/{id}")
    public Funcionario ListarFuncionario(@PathVariable int id){
        return funcionarioRepository.getById(id);
    }

    @PostMapping
    public Funcionario AdicionarFuncionario(@RequestBody Funcionario funcionario){
        return funcionarioRepository.save(funcionario);
    }

    @PutMapping("/{id}")
    public Funcionario AtualizarFuncionario(@PathVariable int id, @RequestBody Funcionario funcionario){
        Funcionario aux = funcionarioRepository.getById(id);
        aux.setNome(funcionario.getNome());
        aux.setNomeUsuario(funcionario.getNomeUsuario());
        aux.setTipo(funcionario.getTipo());
        aux.setSenha(funcionario.getSenha());
        return funcionarioRepository.save(aux);
    }

    @DeleteMapping("/id}")
    public void DeletarProduto(@PathVariable int id){
        funcionarioRepository.deleteById(id);
    }
}
