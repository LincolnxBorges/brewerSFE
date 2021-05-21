package com.algaworks.brewer.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.algaworks.brewer.model.Cidade;

@Controller
public class CidadeController {

	@RequestMapping("/cidades/novo")
	public String novo(Cidade cidade) {
		return "cidade/CadastroCidade"; //Aqui retorna o HTML
	}
	
	@RequestMapping(value = "/cidade/CadastroCidade", method = RequestMethod.POST)
	public String cadastrar(@Valid Cidade cidade, BindingResult result, Model model, RedirectAttributes attributes) {
		if(result.hasErrors()) {
			return novo(cidade);
		}
		
		attributes.addFlashAttribute("mensagem", "Cidade cadastrada com sucesso");
		//System.out.println("Nome " + usuario.getNome());
		return "redirect:/cidades/novo"; //Aqui faz o redirect para uma URL
	}
	
	
}
