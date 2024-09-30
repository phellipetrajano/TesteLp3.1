package br.com.wavebox.repository;

import br.com.wavebox.model.Vendas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VendasRepository extends JpaRepository<Vendas, Integer> {
    // Métodos personalizados podem ser adicionados aqui
}
