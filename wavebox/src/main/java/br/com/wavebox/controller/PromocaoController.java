package br.com.wavebox.controller;

import br.com.wavebox.model.Promocao;
import br.com.wavebox.repository.PromocaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/promocoes")
public class PromocaoController {

    @Autowired
    private PromocaoRepository promocaoRepository;

    @GetMapping("/nova")
    public String novaPromocao(Model model) {
        model.addAttribute("promocao", new Promocao());
        return "promocao-form"; // Nome do template HTML para o formulário
    }

    @PostMapping("/salvar")
    public String salvarPromocao(@ModelAttribute Promocao promocao) {
        promocaoRepository.save(promocao);
        return "redirect:/promocoes/listar"; // Redireciona para a lista de promoções
    }

    @GetMapping("/listar")
    public String listarPromocoes(Model model) {
        List<Promocao> promocoes = promocaoRepository.findAll();
        model.addAttribute("promocoes", promocoes);
        return "promocao-lista"; // Nome do template HTML para a lista
    }
}
