package br.com.wavebox.controller;

import br.com.wavebox.model.Cliente;
import br.com.wavebox.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteRepository clienteRepository;

    @GetMapping("/novo")
    public String novoCliente(Model model) {
        model.addAttribute("cliente", new Cliente());
        return "cliente-form"; // Nome do template para o formulário
    }
    
    @GetMapping("/cliente-lista")
    public String salvarcliente(Model model) {
        model.addAttribute("cliente", new Cliente());
        return "principal"; // Nome do template para o formulário
    }

    @GetMapping("/cadastrar-cliente")
    public String cadastrarcliente(Model model) {
        model.addAttribute("cliente", new Cliente());
        return "cadastrar-cliente"; // Nome do template para o formulário
    }
    @PostMapping("/salvar")
    public String salvarCliente(@ModelAttribute Cliente cliente) {
        clienteRepository.save(cliente);
        return "redirect:/clientes/listar"; // Redireciona para a lista de clientes
    }

    @GetMapping("/listar")
    public String listarClientes(Model model) {
        List<Cliente> clientes = clienteRepository.findAll();
        model.addAttribute("clientes", clientes);
        return "cliente-lista"; // Nome do template para a lista
    }

    @GetMapping("/editar/{id}")
    public String editarCliente(@PathVariable("id") int id, Model model) {
        Cliente cliente = clienteRepository.findById(id).orElse(null);
        model.addAttribute("cliente", cliente);
        return "cliente-form"; // Reutiliza o mesmo template para edição
    }

    @PostMapping("/atualizar")
    public String atualizarCliente(@ModelAttribute Cliente cliente) {
        clienteRepository.save(cliente);
        return "redirect:/clientes/listar"; // Redireciona para a lista de clientes
    }

    
    
    @GetMapping("/deletar/{id}")
    public String deletarCliente(@PathVariable("id") int id) {
        clienteRepository.deleteById(id);
        return "redirect:/clientes/listar"; // Redireciona para a lista de clientes
    }
}
