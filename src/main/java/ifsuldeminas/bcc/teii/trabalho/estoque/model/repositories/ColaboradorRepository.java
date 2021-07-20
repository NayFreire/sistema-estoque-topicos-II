package ifsuldeminas.bcc.teii.trabalho.estoque.model.repositories;

import ifsuldeminas.bcc.teii.trabalho.estoque.model.entity.colaboradores.Colaboradores;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ColaboradorRepository extends JpaRepository<Colaboradores, Integer> {
}
