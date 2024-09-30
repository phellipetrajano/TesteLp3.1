package br.com.wavebox.model;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Promocao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPromocao;

    private String tipoPromocao;
    private float desconto;

    // Getters e Setters
    public int getIdPromocao() {
        return idPromocao;
    }

    public void setIdPromocao(int idPromocao) {
        this.idPromocao = idPromocao;
    }

    public String getTipoPromocao() {
        return tipoPromocao;
    }

    public void setTipoPromocao(String tipoPromocao) {
        this.tipoPromocao = tipoPromocao;
    }

    public float getDesconto() {
        return desconto;
    }

    public void setDesconto(float desconto) {
        this.desconto = desconto;
    }

    public void aplicarDesconto() {
        // Implementação da lógica para aplicar desconto
    }

    public void removerDesconto() {
        // Implementação da lógica para remover desconto
    }
}
