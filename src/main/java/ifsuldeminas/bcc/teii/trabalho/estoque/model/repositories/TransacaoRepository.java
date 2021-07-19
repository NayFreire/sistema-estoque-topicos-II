package ifsuldeminas.bcc.teii.trabalho.estoque.model.repositories;


import ifsuldeminas.bcc.teii.trabalho.estoque.model.entity.comercial.Transacao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransacaoRepository extends JpaRepository<Transacao, Integer> {
}
