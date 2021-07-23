package ifsuldeminas.bcc.teii.trabalho.estoque.controller.colaboradores;

import ifsuldeminas.bcc.teii.trabalho.estoque.model.entity.colaboradores.Cliente;
import ifsuldeminas.bcc.teii.trabalho.estoque.model.entity.colaboradores.Colaboradores;
import ifsuldeminas.bcc.teii.trabalho.estoque.model.repositories.ClienteRepository;
import ifsuldeminas.bcc.teii.trabalho.estoque.model.repositories.ColaboradorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RequestMapping("/clientes")
@RestController
public class ClienteController {
    @Autowired
    private ClienteRepository clienteRepository;

    public ClienteController(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    @GetMapping
    public List<Cliente> ListarColaboradores() {
        return clienteRepository.findAll();
    }

    @GetMapping("/{id}")
    public Colaboradores ListarColaborador(@PathVariable int id) {
        return clienteRepository.getById(id);
    }

    @PostMapping
    public Colaboradores AdicionarCliente(@RequestBody Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    @PutMapping("/{id}")
    public Colaboradores AtualizarCliente(@PathVariable int id, @RequestBody Cliente cliente) {
        Cliente aux = clienteRepository.getById(id);
        aux.setNome(cliente.getNome());
        aux.setEndereco(cliente.getEndereco());
        aux.setTelefone(cliente.getTelefone());
        //tipo não atualizavel
        return clienteRepository.save(aux);
    }

    @DeleteMapping("/{id}")
    public void DeletarCliente(@PathVariable int id) {
        clienteRepository.deleteById(id);

    }
}