package ifsuldeminas.bcc.teii.trabalho.estoque.controller.comercial;

import ifsuldeminas.bcc.teii.trabalho.estoque.controller.colaboradores.ColaboradorController;
import ifsuldeminas.bcc.teii.trabalho.estoque.controller.colaboradores.FuncionarioController;
import ifsuldeminas.bcc.teii.trabalho.estoque.model.entity.Funcionario;
import ifsuldeminas.bcc.teii.trabalho.estoque.model.entity.colaboradores.Colaboradores;
import ifsuldeminas.bcc.teii.trabalho.estoque.model.entity.comercial.NotaFiscal;
import ifsuldeminas.bcc.teii.trabalho.estoque.model.entity.comercial.Produto;
import ifsuldeminas.bcc.teii.trabalho.estoque.model.entity.comercial.Transacao;
import ifsuldeminas.bcc.teii.trabalho.estoque.model.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequestMapping("/notasfiscais")
@RestController
public class NotaFiscalController {
    @Autowired

    private NotaFiscalRepository notaFiscalRepository;
    private ColaboradorRepository colaboradorRepository;
    private FuncionarioRepository funcionarioRepository;
    private TransacaoRepository transacaoRepository;

    public NotaFiscalController(NotaFiscalRepository NotaFiscalRepository, ColaboradorRepository colaboradorRepository, FuncionarioRepository funcionarioRepository, TransacaoRepository transacaoRepository){
        this.notaFiscalRepository = NotaFiscalRepository;
        this.colaboradorRepository = colaboradorRepository;
        this.funcionarioRepository = funcionarioRepository;
        this.transacaoRepository = transacaoRepository;
    }

    @GetMapping
    public List<NotaFiscal> ListarNotasfiscais (){
        return notaFiscalRepository.findAll();
    }

    @PostMapping("/{idCliente}/{idFunc}/{idTrans}")
    public NotaFiscal AdicionarNotaFiscal(@PathVariable int idCliente, @PathVariable int idFunc, @PathVariable int idTrans, @RequestBody NotaFiscal notaFiscal){
        Optional<Colaboradores> opt = colaboradorRepository.findById(idCliente);
        Colaboradores colaborador = opt.get();
        //fazer o tratamento antes para ver se opt tem o objeto cliente
        notaFiscal.setCliente(colaborador);

        Optional<Funcionario> getFunc = funcionarioRepository.findById(idFunc);
        Funcionario funcionario = getFunc.get();
        notaFiscal.setFuncionario(funcionario);

        Optional<Transacao> getTrans = transacaoRepository.findById(idTrans);
        Transacao transacao = getTrans.get();
        notaFiscal.setTransacao(transacao);

        return notaFiscalRepository.save(notaFiscal);
    }



}
