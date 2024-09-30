package br.com.wavebox.controller;

import br.com.wavebox.model.Vendas;
import br.com.wavebox.repository.VendasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/vendas")
public class VendasController {

    @Autowired
    private VendasRepository vendasRepository;

    @GetMapping("/nova")
    public String novaVenda(Model model) {
        model.addAttribute("venda", new Vendas());
        return "venda-form"; // Nome do template HTML para o formulário
    }

    @PostMapping("/salvar")
    public String salvarVenda(@ModelAttribute Vendas venda) {
        vendasRepository.save(venda);
        return "redirect:/vendas/listar"; // Redireciona para a lista de vendas
    }

    @GetMapping("/listar")
    public String listarVendas(Model model) {
        List<Vendas> vendas = vendasRepository.findAll();
        model.addAttribute("vendas", vendas);
        return "venda-lista"; // Nome do template HTML para a lista
    }
}
