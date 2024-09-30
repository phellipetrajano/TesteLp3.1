package br.com.wavebox.repository;

import br.com.wavebox.model.Envio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnvioRepository extends JpaRepository<Envio, Integer> {
    // Métodos personalizados podem ser adicionados aqui
}
