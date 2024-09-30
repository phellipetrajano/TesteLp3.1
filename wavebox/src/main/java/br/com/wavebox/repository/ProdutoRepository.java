package br.com.wavebox.repository;

import br.com.wavebox.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer> {
    // Métodos personalizados podem ser adicionados aqui
}
