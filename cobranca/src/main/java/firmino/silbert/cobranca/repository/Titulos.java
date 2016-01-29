package firmino.silbert.cobranca.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import firmino.silbert.cobranca.model.Titulo;

public interface Titulos extends JpaRepository<Titulo, Long> {

	public List<Titulo> findByDescricaoContaining(String descricao);
	
}
