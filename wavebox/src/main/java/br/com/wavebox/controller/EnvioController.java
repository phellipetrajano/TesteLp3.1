package br.com.wavebox.controller;

import br.com.wavebox.model.Envio;
import br.com.wavebox.repository.EnvioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/envios")
public class EnvioController {

    @Autowired
    private EnvioRepository envioRepository;

    @GetMapping("/novo")
    public String novoEnvio(Model model) {
        model.addAttribute("envio", new Envio());
        return "envio-form"; // Nome do template HTML para o formulário
    }

    @PostMapping("/salvar")
    public String salvarEnvio(@ModelAttribute Envio envio) {
        envioRepository.save(envio);
        return "redirect:/envios/listar"; // Redireciona para a lista de envios
    }

    @GetMapping("/listar")
    public String listarEnvios(Model model) {
        List<Envio> envios = envioRepository.findAll();
        model.addAttribute("envios", envios);
        return "envio-lista"; // Nome do template HTML para a lista
    }
}
