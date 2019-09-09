package edu.ifal.academico.controle;

import edu.ifal.academico.modelo.Endereco;
import edu.ifal.academico.modelo.Estudante;

public class CriadorDeEstudante {
 
	
	private Estudante estudante;

	public CriadorDeEstudante() {
		super();
	}
	
	public CriadorDeEstudante nome ( String nome) {
		this.estudante = new Estudante();
		return this;
	}
	public CriadorDeEstudante mora (Endereco endereco) {
		this.estudante = new Estudante();
		return this;
	}
	public Estudante constroi() {
		return this.estudante;
	}
	
}
