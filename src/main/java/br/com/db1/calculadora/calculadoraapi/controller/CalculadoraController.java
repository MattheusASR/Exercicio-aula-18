package br.com.db1.calculadora.calculadoraapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.db1.calculadora.calculadoraapi.dto.salvaOperacaoDTO;
import br.com.db1.calculadora.calculadoraapi.model.Calculadora;
import br.com.db1.calculadora.calculadoraapi.service.CalculadoraService;
@CrossOrigin("*")
@RestController
@RequestMapping("/api/calculadora")
public class CalculadoraController {

	@Autowired
	private CalculadoraService calculadoraService;
	
	@PostMapping
	public Calculadora post(@RequestBody salvaOperacaoDTO salvaOperacao) {
		return calculadoraService.salvaOperacao(
				salvaOperacao.getNumero2(), 
				salvaOperacao.getNumero1(),
				salvaOperacao.getOperacao());
	}
	
	@GetMapping
	public List<Calculadora> todosCalculos(){
		return calculadoraService.buscarTodosCalculos();
	}
}
