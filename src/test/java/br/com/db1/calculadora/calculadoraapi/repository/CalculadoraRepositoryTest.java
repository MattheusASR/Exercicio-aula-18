package br.com.db1.calculadora.calculadoraapi.repository;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import br.com.db1.calculadora.calculadoraapi.model.Calculadora;
import br.com.db1.calculadora.calculadoraapi.model.Operacao;
import br.com.db1.calculadora.calculadoraapi.repository.CalculadoraRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculadoraRepositoryTest {

	@Autowired
	private CalculadoraRepository calculadoraRepository;
	
	@After 
	public void after() {
		calculadoraRepository.deleteAll();
	}
	
	@Test
	public void deveRetornarSoma() {
		Calculadora calculadora = new Calculadora(10, 10, Operacao.SOMA);
		double resultado = calculadora.getResultado();
		
		Assert.assertEquals(20,resultado, 0.001 );
	}
	
	@Test
	public void deveRetornarSubtracao() {
		Calculadora calculadora = new Calculadora(10, 10, Operacao.SUBTRACAO);
		double resultado = calculadora.getResultado();
		
		Assert.assertEquals(0,resultado, 0.001 );
	}
	
	@Test
	public void deveRetornarDivisao() {
		Calculadora calculadora = new Calculadora(10, 10,Operacao.DIVISAO);
		double resultado = calculadora.getResultado();
		
		Assert.assertEquals(1,resultado, 0.001 );
	}
	
	@Test
	public void deveRetornarMultiplicacao() {
		Calculadora calculadora = new Calculadora(2, 5, Operacao.MULTIPLICACAO);
		double resultado = calculadora.getResultado();
	
		Assert.assertEquals(10,resultado, 0.001 );
	}
}
