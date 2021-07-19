package ifsuldeminas.bcc.teii.trabalho.estoque.model.repositories;

import ifsuldeminas.bcc.teii.trabalho.estoque.model.entity.comercial.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Integer> {

}
