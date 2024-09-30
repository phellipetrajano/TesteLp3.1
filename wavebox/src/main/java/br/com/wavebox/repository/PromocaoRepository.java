package br.com.wavebox.repository;

import br.com.wavebox.model.Promocao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PromocaoRepository extends JpaRepository<Promocao, Integer> {
    // Métodos personalizados podem ser adicionados aqui
}
