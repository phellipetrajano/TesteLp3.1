package br.com.wavebox.repository;

import br.com.wavebox.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {
    // Métodos personalizados podem ser adicionados aqui
}
