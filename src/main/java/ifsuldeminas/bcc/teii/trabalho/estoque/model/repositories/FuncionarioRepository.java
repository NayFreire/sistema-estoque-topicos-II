package ifsuldeminas.bcc.teii.trabalho.estoque.model.repositories;

import ifsuldeminas.bcc.teii.trabalho.estoque.model.entity.Funcionario;
import ifsuldeminas.bcc.teii.trabalho.estoque.model.entity.comercial.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Integer> {
}
