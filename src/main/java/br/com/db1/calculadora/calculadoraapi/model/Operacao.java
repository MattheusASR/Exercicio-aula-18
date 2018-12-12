package br.com.db1.calculadora.calculadoraapi.model;

public enum Operacao {

	SOMA {
		@Override
		public double executor(double numero1, double numero2) {
			return numero1 + numero2;
		}
	},
	SUBTRACAO {
		@Override
		public double executor(double numero1, double numero2) {
			return numero1 - numero2;
		}
	},
	DIVISAO {
		@Override
		public double executor(double numero1, double numero2) {
			return numero1 / numero2;
		}
	},
	MULTIPLICACAO {
		@Override
		public double executor(double numero1, double numero2) {
			return numero1 * numero2;
		}
	};
	
	public abstract double executor (double numero1, double numero2);
}
