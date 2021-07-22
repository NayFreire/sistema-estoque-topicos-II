package ifsuldeminas.bcc.teii.trabalho.estoque.controller.colaboradores;

import ifsuldeminas.bcc.teii.trabalho.estoque.model.entity.colaboradores.Colaboradores;
import ifsuldeminas.bcc.teii.trabalho.estoque.model.repositories.ColaboradorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/colaboradores")
@RestController
public class ColaboradorController {
    @Autowired
    private ColaboradorRepository colaboradorRepository;
    public ColaboradorController (ColaboradorRepository colaboradorRepository){
        this.colaboradorRepository = colaboradorRepository;
    }

    @GetMapping
    public List<Colaboradores> ListarColaboradores(){
        return colaboradorRepository.findAll();
    }

    public Colaboradores ListarColaborador(@PathVariable int id){
        return colaboradorRepository.getById(id);
    }

    @PostMapping
    public Colaboradores AdicionarColaborador(@RequestBody Colaboradores colaboradores){
        return colaboradorRepository.save(colaboradores);
    }

    @PutMapping("/{id}")
    public Colaboradores AtualizarColaborador(@PathVariable int id, @RequestBody Colaboradores colaboradores){
        Colaboradores aux = colaboradorRepository.getById(id);
        aux.setNome(colaboradores.getNome());
        aux.setEndereco(colaboradores.getEndereco());
        aux.setTelefone(colaboradores.getTelefone());
      //tipo não atualizavel
        return colaboradorRepository.save(aux);
    }

    @DeleteMapping("/{id}")
    public void DeletarColaborador(@PathVariable int id){
        colaboradorRepository.deleteById(id);
    }
}
