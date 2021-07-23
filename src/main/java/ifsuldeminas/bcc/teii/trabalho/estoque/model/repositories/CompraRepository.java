package ifsuldeminas.bcc.teii.trabalho.estoque.model.repositories;
import ifsuldeminas.bcc.teii.trabalho.estoque.model.entity.comercial.Compra;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompraRepository extends JpaRepository<Compra,Integer> {
}
