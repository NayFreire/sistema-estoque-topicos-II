package ifsuldeminas.bcc.teii.trabalho.estoque.controller.comercial;

import ifsuldeminas.bcc.teii.trabalho.estoque.controller.colaboradores.ColaboradorController;
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

    @PostMapping
    public NotaFiscal AdicionarNotaFiscal(@RequestBody NotaFiscal notaFiscal){

        ProdutoController produtoController = new ProdutoController();
        produtoController.MostrarProduto(notaFiscal.getFuncionario().getId());

        ColaboradorController colaboradorController = new ColaboradorController();
        colaboradorController.ListarColaborador(notaFiscal.getCliente().getId());

        TransacaoController transacaoController = new TransacaoController();
        transacaoController.MostrarTransacao(notaFiscal.getTransacao().getId());


        return notaFiscalRepository.save(notaFiscal);
    }



}
