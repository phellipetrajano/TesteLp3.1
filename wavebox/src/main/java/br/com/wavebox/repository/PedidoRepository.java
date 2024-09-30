package br.com.wavebox.repository;

import br.com.wavebox.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Integer> {
    // Métodos personalizados podem ser adicionados aqui
}
