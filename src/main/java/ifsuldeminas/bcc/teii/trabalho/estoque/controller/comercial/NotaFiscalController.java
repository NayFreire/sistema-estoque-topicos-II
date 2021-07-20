package ifsuldeminas.bcc.teii.trabalho.estoque.controller.comercial;

import ifsuldeminas.bcc.teii.trabalho.estoque.controller.colaboradores.ColaboradorController;
import ifsuldeminas.bcc.teii.trabalho.estoque.controller.colaboradores.FuncionarioController;
import ifsuldeminas.bcc.teii.trabalho.estoque.model.entity.Funcionario;
import ifsuldeminas.bcc.teii.trabalho.estoque.model.entity.colaboradores.Colaboradores;
import ifsuldeminas.bcc.teii.trabalho.estoque.model.entity.comercial.NotaFiscal;
import ifsuldeminas.bcc.teii.trabalho.estoque.model.entity.comercial.Produto;
import ifsuldeminas.bcc.teii.trabalho.estoque.model.repositories.NotaFiscalRepository;
import ifsuldeminas.bcc.teii.trabalho.estoque.model.repositories.ProdutoRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class NotaFiscalController {
    private NotaFiscalRepository notaFiscalRepository;

    public NotaFiscalController(NotaFiscalRepository NotaFiscalRepository){
        this.notaFiscalRepository = NotaFiscalRepository;
    }

    /*@PostMapping
    public NotaFiscal AdicionarNotaFiscal(@RequestBody NotaFiscal notaFiscal){

        /*ColaboradorController colaboradorController = new ColaboradorController();

        TransacaoController transacaoController = new TransacaoController();

        FuncionarioController funcionarioController = new FuncionarioController();

        notaFiscal.setFuncionario(funcionarioController.ListarFuncionario(notaFiscal.getFuncionario().getId()));
        notaFiscal.setTransacao(transacaoController.MostrarTransacao(notaFiscal.getTransacao().getId()));*/

        /*return notaFiscalRepository.save(notaFiscal);
    }*/



}
