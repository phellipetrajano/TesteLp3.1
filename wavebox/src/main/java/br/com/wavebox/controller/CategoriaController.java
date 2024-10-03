package br.com.wavebox.controller;

import br.com.wavebox.model.Categoria;
import br.com.wavebox.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/categorias")
public class CategoriaController {

    @Autowired
    private CategoriaRepository categoriaRepository;

    @GetMapping("/nova")
    public String novaCategoria(Model model) {
        model.addAttribute("categoria", new Categoria());
        return "categoria-form"; // Nome do template HTML para o formulário
    }

    @PostMapping("/salvar")
    public String salvarCategoria(@ModelAttribute Categoria categoria) {
        categoriaRepository.save(categoria);
        return "redirect:/categorias/listar"; // Redireciona para a lista de categorias
    }

    @GetMapping("/listar")
    public String listarCategorias(Model model) {
        List<Categoria> categorias = categoriaRepository.findAll();
        model.addAttribute("categorias", categorias);
        return "categoria-lista"; // Nome do template HTML para a lista
    }
    



@GetMapping("/deletar/{id}")
public String deletarCategoria(@PathVariable("id") int id) {
    categoriaRepository.deleteById(id);
    return "redirect:/categoria-lista"; // Redireciona para a lista de clientes
}
}


