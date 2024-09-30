package br.com.wavebox.repository;

import br.com.wavebox.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
    // Você pode adicionar métodos personalizados aqui, se necessário
}
