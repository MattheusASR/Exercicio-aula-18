package br.com.db1.calculadora.calculadoraapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.db1.calculadora.calculadoraapi.model.Calculadora;
import br.com.db1.calculadora.calculadoraapi.model.Operacao;
import br.com.db1.calculadora.calculadoraapi.repository.CalculadoraRepository;


@Service
public class CalculadoraService {

	@Autowired
	private CalculadoraRepository calculadoraRepository;
	
	public Calculadora salvaOperacao(double numero1, double numero2, Operacao executor ) {
		Calculadora calculadora = new Calculadora(numero1, numero2, executor);
		calculadoraRepository.save(calculadora);
		return calculadora;
	}
}
