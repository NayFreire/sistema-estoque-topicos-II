package ifsuldeminas.bcc.teii.trabalho.estoque.controller.comercial;

import ifsuldeminas.bcc.teii.trabalho.estoque.model.entity.comercial.Transacao;
import ifsuldeminas.bcc.teii.trabalho.estoque.model.repositories.TransacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/transacoes")
@RestController
public class TransacaoController {
    @Autowired
    private TransacaoRepository transacaoRepository;

    public TransacaoController(TransacaoRepository transacaoRepository){
        this.transacaoRepository = transacaoRepository;
    }

    @GetMapping
    public List<Transacao> ListarTransacoes(){
        return transacaoRepository.findAll();
    }

    @GetMapping("/{id}")
    public Transacao MostrarTransacao(@PathVariable int id){
        return transacaoRepository.getById(id);
    }

    @PostMapping
    public Transacao AdicionarTransacao(@RequestBody Transacao transacao){
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

    @DeleteMapping("/id}")
    public void DeletarTransacao(@PathVariable int id){
        transacaoRepository.deleteById(id);
    }
}
