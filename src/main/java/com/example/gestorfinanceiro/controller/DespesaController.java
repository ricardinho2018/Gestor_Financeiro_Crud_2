package com.example.gestorfinanceiro.controller;

import com.example.gestorfinanceiro.model.Despesa;
import com.example.gestorfinanceiro.model.Categoria;
import com.example.gestorfinanceiro.repository.DespesaRepository;
import com.example.gestorfinanceiro.repository.CategoriaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/despesas")
public class DespesaController {

    @Autowired
    private DespesaRepository despesaRepo;

    @Autowired
    private CategoriaRepository categoriaRepo;

    @GetMapping
    public String listar(Model model) {
        model.addAttribute("despesas", despesaRepo.findAll());
        return "despesas/lista";
    }

    @GetMapping("/nova")
    public String nova(Model model) {
        model.addAttribute("despesa", new Despesa());
        model.addAttribute("categorias", categoriaRepo.findAll());
        return "despesas/form";
    }

    @PostMapping
    public String salvar(@ModelAttribute Despesa despesa,
                         @RequestParam(required = false) Long categoriaId) {

        if (categoriaId != null) {
            Categoria cat = categoriaRepo.findById(categoriaId).orElse(null);
            despesa.setCategoria(cat);
        }

        despesaRepo.save(despesa);
        return "redirect:/despesas";
    }

    @GetMapping("/editar/{id}")
    public String editar(@PathVariable Long id, Model model) {
        model.addAttribute("despesa", despesaRepo.findById(id).orElseThrow());
        model.addAttribute("categorias", categoriaRepo.findAll());
        return "despesas/form";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminar(@PathVariable Long id) {
        despesaRepo.deleteById(id);
        return "redirect:/despesas";
    }
}