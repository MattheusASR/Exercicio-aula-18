package br.com.db1.calculadora.calculadoraapi.dto;

import br.com.db1.calculadora.calculadoraapi.model.Operacao;

public class salvaOperacaoDTO {

	private Operacao operacao;
	
	public Operacao getOperacao() {
		return operacao;
	}

	public void setOperacao(Operacao operacao) {
		this.operacao = operacao;
	}

	public double getNumero1() {
		return numero1;
	}

	public void setNumero1(double numero1) {
		this.numero1 = numero1;
	}

	public double getNumero2() {
		return numero2;
	}

	public void setNumero2(double numero2) {
		this.numero2 = numero2;
	}

	private double numero1;
	
	private double numero2;
}
