package ifsuldeminas.bcc.teii.trabalho.estoque.model.repositories;

import ifsuldeminas.bcc.teii.trabalho.estoque.model.entity.comercial.Venda;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VendaRepository extends JpaRepository <Venda, Integer> {
}
