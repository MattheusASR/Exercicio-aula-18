package br.com.db1.calculadora.calculadoraapi.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name= "calculadora")
public class Calculadora {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name= "numero1", length=25, nullable = false)
	private double numero1;
	
	@Column(name= "numero2", length=25, nullable = false)
	private double numero2;
	
	@Column(name= "resultado", length=25, nullable = false)
	private double resultado;
	
	@Enumerated(EnumType.STRING)
	@Column(name= "operacao", length=25, nullable = false)
	private Operacao operacao;
	
	@Column(name= "Data", length=25, nullable = false)
	private LocalDateTime DataDaOperacao;
	
	public Calculadora (double numero1, double numero2,Operacao operacao) {
		this.numero1= numero1;
		this.numero2= numero2;
		this.operacao= operacao;
		this.resultado=this.calcular();
		this.DataDaOperacao = LocalDateTime.now();
	}

	public double calcular() {
		return this.operacao.executor(numero1, numero2);
		
	}
	
	protected Calculadora() {
		
	}
	public Long getId() {
		return id;
	}
	public double getNumero1() {
		return this.numero1;
	}
	
	public double getNumero2() {
		return this.numero2;
	}

	public double getResultado() {
		return resultado;
	}
	public Operacao getOperacao() {
		return operacao;
	}
	
	public LocalDateTime getData() {
		return DataDaOperacao;
	}
	
}
