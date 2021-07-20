package ifsuldeminas.bcc.teii.trabalho.estoque.controller.colaboradores;

import ifsuldeminas.bcc.teii.trabalho.estoque.model.entity.colaboradores.Colaboradores;
import ifsuldeminas.bcc.teii.trabalho.estoque.model.repositories.ColaboradorRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/colaboradores")
@RestController
public class ColaboradorController {
    private ColaboradorRepository colaboradorRepository;

    public ColaboradorController(ColaboradorRepository colaboradorRepository){
        this.colaboradorRepository = colaboradorRepository;
    }

    @GetMapping
    public List<Colaboradores> ListarColaboradores(){
        return colaboradorRepository.findAll();
    }

    @GetMapping("/{id}")
    public Colaboradores MostrarColaborador(@PathVariable int id){
        return colaboradorRepository.getById(id);
    }

}
